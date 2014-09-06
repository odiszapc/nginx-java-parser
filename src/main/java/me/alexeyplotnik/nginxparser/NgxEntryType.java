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

package me.alexeyplotnik.nginxparser;

import java.util.HashMap;
import java.util.Map;

public enum NgxEntryType {
    PARAM(NgxParam.class),
    COMMENT(NgxComment.class),
    IF(NgxIfBlock.class),
    BLOCK(NgxBlock.class);

    private final Class<? extends NgxEntry> clazz;

    Class<? extends NgxEntry> getType() {
        return clazz;
    }

    NgxEntryType(Class<? extends NgxEntry> clazz) {

        this.clazz = clazz;
    }

    private static Map<Class<? extends NgxEntry>, NgxEntryType> types;

    static {
        types = new HashMap<Class<? extends NgxEntry>, NgxEntryType>();
        for (NgxEntryType type : NgxEntryType.values()) {
            types.put(type.clazz, type);
        }
    }

    public static NgxEntryType fromClass(Class<? extends NgxEntry> clazz) {
        return types.get(clazz);
    }
}
