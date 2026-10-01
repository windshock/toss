package com.alibaba.ariver.kernel.api.track;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class JSAPICallDict {
    private final Map<String, JSAPICallRecord> mMap = new ConcurrentHashMap();

    public JSAPICallRecord newRecord(String str, String str2, boolean z) {
        JSAPICallRecord jSAPICallRecord = new JSAPICallRecord(EventTrackerUtils.getTrackerIdWithIndex("apicall", str2), str2, str);
        if (z) {
            jSAPICallRecord.setStart(SystemClock.elapsedRealtime());
        }
        this.mMap.put(str, jSAPICallRecord);
        return jSAPICallRecord;
    }

    public void removeRecord(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mMap.remove(str);
    }

    public JSAPICallRecord getRecord(String str) {
        return this.mMap.get(str);
    }

    public Map<String, String> toMap() {
        HashMap map = new HashMap();
        for (JSAPICallRecord jSAPICallRecord : this.mMap.values()) {
            map.put(jSAPICallRecord.getTrackId(), jSAPICallRecord.toString());
        }
        return map;
    }

    public List<JSAPICallRecord> getRecords() {
        return new ArrayList(this.mMap.values());
    }

    public int size() {
        return this.mMap.size();
    }
}
