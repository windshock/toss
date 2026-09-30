package com.skt.usp.tools.dao;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.skt.usp.utils.UCPLog;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class AbstractDao {
    public void dump(Object obj) {
        UCPLog.warning(">> dump() : [%s]", obj);
        UCPLog.warning(new Gson().toJson(obj));
    }

    public String toString(Object obj) {
        return new Gson().toJson(obj);
    }

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, int i) {
        jsonReader.skipValue();
    }
}
