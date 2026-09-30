package com.iap.ac.android.acs.plugin.downgrade.amcs;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class ACConfigManager extends BaseDowngradeConfigManager {
    public static final String AP_DISABLED_JSAPI_STATUS = "geo_reverse_enable";
    public static final String SECTION_AC_CONFIG = "ACConfig";
    private static ACConfigManager sInstance;

    private ACConfigManager() {
    }

    public static ACConfigManager getInstance() {
        if (sInstance == null) {
            synchronized (ACConfigManager.class) {
                if (sInstance == null) {
                    sInstance = new ACConfigManager();
                }
            }
        }
        return sInstance;
    }

    public boolean geoReverseEnable() {
        return ((Boolean) getKeyOrDefault(AP_DISABLED_JSAPI_STATUS, Boolean.TRUE)).booleanValue();
    }

    public String getSectionName() {
        return SECTION_AC_CONFIG;
    }
}
