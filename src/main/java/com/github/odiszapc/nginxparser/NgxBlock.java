/*
 * Copyright 2014 Alexey Plotnik
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.odiszapc.nginxparser;

import java.util.*;

/**
 * Describes block section. Example:
 * http {
 * ...
 * }
 */
public class NgxBlock extends NgxAbstractEntry implements Iterable<NgxEntry> {
    private Collection<NgxEntry> entries = new ArrayList<NgxEntry>();

    public Collection<NgxEntry> getEntries() {
        return entries;
    }

    public void addEntry(NgxEntry entry) {
        entries.add(entry);
    }

    @Override
    public String toString() {
        return super.toString() + " {";
    }

    @Override
    public Iterator<NgxEntry> iterator() {
        return getEntries().iterator();
    }

    public void remove(NgxEntry itemToRemove) {
        if (null == itemToRemove)
            throw new NullPointerException("Item can not be null");

        Iterator<NgxEntry> it = entries.iterator();
        while (it.hasNext()) {
            NgxEntry entry = it.next();
            switch (NgxEntryType.fromClass(entry.getClass())) {
            case PARAM:
                if (entry.equals(itemToRemove))
                    it.remove();
                break;
            case BLOCK:
                if (entry.equals(itemToRemove))
                    it.remove();
                else {
                    NgxBlock block = (NgxBlock) entry;
                    block.remove(itemToRemove);
                }
                break;
            }
        }
    }

    public void removeAll(Iterable<NgxEntry> itemsToRemove) {
        if (null == itemsToRemove)
            throw new NullPointerException("Items can not be null");
        for (NgxEntry itemToRemove : itemsToRemove) {
            remove(itemToRemove);
        }
    }

    public <T extends NgxEntry> T find(Class<T> clazz, String... params) {
        List<NgxEntry> all = findAll(clazz, new ArrayList<NgxEntry>(), params);
        if (all.isEmpty())
            return null;

        return (T) all.get(0);
    }

    public NgxBlock findBlock(String... params) {
        NgxEntry entry = find(NgxConfig.BLOCK, params);
        if (null == entry)
            return null;
        return (NgxBlock) entry;
    }

    public NgxParam findParam(String... params) {
        NgxEntry entry = find(NgxConfig.PARAM, params);
        if (null == entry)
            return null;
        return (NgxParam) entry;
    }

    public <T extends NgxEntry> List<NgxEntry> findAll(Class<T> clazz, String... params) {
        return findAll(clazz, new ArrayList<NgxEntry>(), params);
    }

    public <T extends NgxEntry> List<NgxEntry> findAll(Class<T> clazz, List<NgxEntry> result, String... params) {
        List<NgxEntry> res = new ArrayList<NgxEntry>();

        if (0 == params.length) {
            return res;
        }

        String head = params[0];
        String[] tail = params.length > 1 ? Arrays.copyOfRange(params, 1, params.length) : new String[0];

        for (NgxEntry entry : getEntries()) {
            switch (NgxEntryType.fromClass(entry.getClass())) {
            case PARAM:
                NgxParam param = (NgxParam) entry;
                if (param.getName().equals(head) && param.getClass() == clazz) {
                    res.add(param);
                }
                break;

            case BLOCK:
                NgxBlock block = (NgxBlock) entry;
                if (tail.length > 0) {
                    if (block.getName().equals(head)) {
                        res.addAll(block.findAll(clazz, result, tail));
                    }
                } else {
                    if (block.getName().equals(head) && (clazz.equals(NgxBlock.class))) {
                        res.add(block);
                    }
                }
                break;
            }
        }

        return res;
    }
}
