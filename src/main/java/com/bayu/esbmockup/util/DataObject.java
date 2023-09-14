package com.bayu.esbmockup.util;

import java.util.HashMap;

public class DataObject extends HashMap<String, Object> {

    public boolean isExists(String key) {
        return this.containsKey(key);
    }

    public boolean isDataList(String key) {
        return get(key) instanceof DataList;
    }

    public Object put(String key, Object value) {
        return super.put(key, value);
    }
}
