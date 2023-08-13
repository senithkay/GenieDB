package org.geniedb;

import org.json.JSONObject;

public class Store {

    private JSONObject storeFile;

    public Store() {
       this.storeFile = new JSONObject();
    }

    public JSONObject getStoreFile() {
        return this.storeFile;
    }
}
