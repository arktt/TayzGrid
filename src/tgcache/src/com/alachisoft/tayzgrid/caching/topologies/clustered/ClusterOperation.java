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

package com.alachisoft.tayzgrid.caching.topologies.clustered;

public class ClusterOperation {

    private Object _operation;
    private Object _lockInfo;
    private Object _result;

    public ClusterOperation(Object operation, Object lockInfo) {
        _operation = operation;
        _lockInfo = lockInfo;
    }

    public final Object getOperation() {
        return _operation;
    }

    public final Object getLockInfo() {
        return _lockInfo;
    }

    public final Object getResult() {
        return _result;
    }

    public final void setResult(Object value) {
        _result = value;
    }
}