package com.alibaba.ariver.kernel.api.track;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class LogTrackFlag {
    public static final String KEY_LOG_TAG = "containerTechFlag";
    private static final int MAX_COUNT = 10;
    private static final String TAG = "ARiver:LogTrackFlag";
    private final Map<String, String> mMap = new ConcurrentHashMap();

    public boolean isFull() {
        return this.mMap.keySet().size() > 10;
    }

    public boolean addLogFlag(String str, String str2) {
        if (!isFull() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.mMap.put(str, str2);
            return true;
        }
        RVLogger.d(TAG, "flag is full max: 10");
        return false;
    }

    public void mergeFlags(Map<String, String> map) {
        this.mMap.putAll(map);
    }

    public void removeLogFlag(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mMap.remove(str);
    }

    public Map<String, String> getFlags() {
        return this.mMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.mMap.keySet()) {
            sb.append("_");
            sb.append(str);
            sb.append("@");
            sb.append(this.mMap.get(str));
        }
        return sb.toString();
    }

    public int size() {
        return this.mMap.size();
    }
}
