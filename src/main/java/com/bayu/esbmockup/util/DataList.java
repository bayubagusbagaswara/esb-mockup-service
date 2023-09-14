package com.bayu.esbmockup.util;

import java.util.ArrayList;

public class DataList extends ArrayList {

    public DataObject getDataObjectAt(int index) {
        Object data = this.get(index);
        if (data instanceof DataObject) {
            return (DataObject) data;
        }
        return DataObject
    }

}
