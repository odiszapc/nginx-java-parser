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

import java.util.ArrayList;

public class NgxIfBlock extends NgxBlock {

    public String toString() {
        ArrayList<NgxToken> tokens = new ArrayList<>(getTokens());
        String ifToken = tokens.remove(0).getToken(); // The "if"
        StringBuilder tokenBuilder = new StringBuilder(ifToken)
                .append(" ")
                .append("(");

        for (NgxToken value : tokens) {
            tokenBuilder.append(value).append(" ");
        }

        String result = tokenBuilder.toString();

        return result.substring(0, result.length() -1) + ") ";
    }
}
