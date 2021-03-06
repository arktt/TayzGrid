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

package com.alachisoft.tayzgrid.caching;

public enum TagComparisonType {
	BY_TAG(1),
	ALL_MATCHING_TAGS(2),
	ANY_MATCHING_TAG(3),
	DEFAULT(4);

	private int intValue;
	private static java.util.HashMap<Integer, TagComparisonType> mappings;
	private static java.util.HashMap<Integer, TagComparisonType> getMappings() {
		if (mappings == null) {
			synchronized (TagComparisonType.class) {
				if (mappings == null) {
					mappings = new java.util.HashMap<Integer, TagComparisonType>();
				}
			}
		}
		return mappings;
	}

	private TagComparisonType(int value) {
		intValue = value;
		TagComparisonType.getMappings().put(value, this);
	}

	public int getValue() {
		return intValue;
	}

	public static TagComparisonType forValue(int value) {
		return getMappings().get(value);
	}
}
