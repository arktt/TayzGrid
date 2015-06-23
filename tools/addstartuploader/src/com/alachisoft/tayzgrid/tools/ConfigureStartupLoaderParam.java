/*
* Copyright (c) 2015, Alachisoft. All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.alachisoft.tayzgrid.tools;

import com.alachisoft.tayzgrid.tools.common.ArgumentAttributeAnnontation;

/**
 * Summary description for ConfigureStartupLoader.
 *
 */
public class ConfigureStartupLoaderParam extends com.alachisoft.tayzgrid.tools.common.CommandLineParamsBase {

    private static String _asmPath = "";
    private static String _class = "";
    private static String _parameters = "";
    private static String _cacheId = "";
    private static String _server = "";
    private static int _port = -1;
    private static int _retries = 0;
    private static int _retryInterval = 0;
    private static boolean _addTags = false;
    private static boolean _nodeploy = false;
    private static String _depAsmPath = "";

    public ConfigureStartupLoaderParam() {
    }

    @ArgumentAttributeAnnontation(shortNotation = "-a", fullNotation = "--assembly-path", appendText = "", defaultValue = "")
    public final String getAsmPath() {
        return _asmPath;
    }

    @ArgumentAttributeAnnontation(shortNotation = "-a", fullNotation = "--assembly-path", appendText = "", defaultValue = "")
    public final void setAsmPath(String value) {
        _asmPath = value;
    }

    @ArgumentAttributeAnnontation(shortNotation = "", fullNotation = "", appendText = "", defaultValue = "")
    public final String getCacheId() {
        return _cacheId;
    }

    @ArgumentAttributeAnnontation(shortNotation = "", fullNotation = "", appendText = "", defaultValue = "")
    public final void setCacheId(String value) {
        _cacheId = value;
    }

    @ArgumentAttributeAnnontation(shortNotation = "-c", fullNotation = "--class", appendText = "", defaultValue = "")
    public final String GetClass() {
        return _class;
    }

    @ArgumentAttributeAnnontation(shortNotation = "-c", fullNotation = "--class", appendText = "", defaultValue = "")
    public final void setClass(String value) {
        _class = value;
    }

    @ArgumentAttributeAnnontation(shortNotation = "-l", fullNotation = "--parameter-list", appendText = "", defaultValue = "")
    public final String getParameters() {
        return _parameters;
    }

    @ArgumentAttributeAnnontation(shortNotation = "-l", fullNotation = "--parameter-list", appendText = "", defaultValue = "")
    public final void setParameters(String value) {
        _parameters = value;
    }

    @ArgumentAttributeAnnontation(shortNotation = "-g", fullNotation = "--add-tag", appendText = "", defaultValue = "false")
    public final boolean getAddTag() {
        return _addTags;
    }

    @ArgumentAttributeAnnontation(shortNotation = "-g", fullNotation = "--add-tag", appendText = "", defaultValue = "false")
    public final void setAddTag(boolean value) {
        _addTags = value;
    }

    @ArgumentAttributeAnnontation(shortNotation = "-s", fullNotation = "--server", appendText = "", defaultValue = "")
    public final String getServer() {
        return _server;
    }

    @ArgumentAttributeAnnontation(shortNotation = "-s", fullNotation = "--server", appendText = "", defaultValue = "")
    public final void setServer(String value) {
        _server = value;
    }

    @ArgumentAttributeAnnontation(shortNotation = "-p", fullNotation = "--port", appendText = "", defaultValue = "")
    public final int getPort() {
        return _port;
    }

    @ArgumentAttributeAnnontation(shortNotation = "-p", fullNotation = "--port", appendText = "", defaultValue = "")
    public final void setPort(int value) {
        _port = value;
    }

    @ArgumentAttributeAnnontation(shortNotation = "-R", fullNotation = "--retries", appendText = "", defaultValue = "")
    public final int getRetries() {
        return _retries;
    }

    @ArgumentAttributeAnnontation(shortNotation = "-R", fullNotation = "--retries", appendText = "", defaultValue = "")
    public final void setRetries(int value) {
        _retries = value;
    }

    @ArgumentAttributeAnnontation(shortNotation = "-i", fullNotation = "--retry-interval", appendText = "", defaultValue = "")
    public final int getRetryInterval() {
        return _retryInterval;
    }

    @ArgumentAttributeAnnontation(shortNotation = "-i", fullNotation = "--retry-interval", appendText = "", defaultValue = "")
    public final void setRetryInterval(int value) {
        _retryInterval = value;
    }

    @ArgumentAttributeAnnontation(shortNotation = "-d", fullNotation = "--no-deploy", appendText = "", defaultValue = "false")
    public final boolean getNoDeploy() {
        return _nodeploy;
    }

    @ArgumentAttributeAnnontation(shortNotation = "-d", fullNotation = "--no-deploy", appendText = "", defaultValue = "false")
    public final void setNoDeploy(boolean value) {
        _nodeploy = value;
    }

    @ArgumentAttributeAnnontation(shortNotation = "-D", fullNotation = "--dep-asm-path", appendText = "", defaultValue = "")
    public final String getDepAsmPath() {
        return _depAsmPath;
    }

    @ArgumentAttributeAnnontation(shortNotation = "-D", fullNotation = "--dep-asm-path", appendText = "", defaultValue = "")
    public final void setDepAsmPath(String value) {
        _depAsmPath = value;
    }
}