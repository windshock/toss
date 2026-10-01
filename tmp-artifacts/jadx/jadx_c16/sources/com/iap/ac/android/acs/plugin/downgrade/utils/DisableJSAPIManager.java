package com.iap.ac.android.acs.plugin.downgrade.utils;

import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.downgrade.router.amcs.APDisableJSAPIConfigManager;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class DisableJSAPIManager {
    private static DisableJSAPIManager instance;
    private Map<String, Set<String>> disabledJSAPIMap = new ConcurrentHashMap();
    private final Object lock = new Object();

    public static DisableJSAPIManager getInstance() {
        if (instance == null) {
            synchronized (DisableJSAPIManager.class) {
                if (instance == null) {
                    instance = new DisableJSAPIManager();
                }
            }
        }
        return instance;
    }

    public Set<String> getDisableJSAPI(@NonNull String str) {
        HashSet hashSet;
        synchronized (this.lock) {
            hashSet = new HashSet(this.disabledJSAPIMap.get(str));
        }
        return hashSet;
    }

    public boolean isDisabled(@NonNull String str, @NonNull String str2) {
        synchronized (this.lock) {
            if ("apDisableJSAPI".equals(str2)) {
                return !APDisableJSAPIConfigManager.getInstance().toggleAPIDisableJSAPI();
            }
            Set<String> set = this.disabledJSAPIMap.get(str);
            return set != null && set.contains(str2);
        }
    }

    public void putDisableJSAPI(@NonNull String str, @NonNull Set<String> set) {
        synchronized (this.lock) {
            this.disabledJSAPIMap.put(str, new HashSet(set));
        }
    }
}
