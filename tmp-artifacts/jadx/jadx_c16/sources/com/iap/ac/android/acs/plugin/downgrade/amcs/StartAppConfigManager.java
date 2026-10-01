package com.iap.ac.android.acs.plugin.downgrade.amcs;

import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class StartAppConfigManager extends BaseDowngradeConfigManager {
    private static final String SECTION_KEY_ACS_APP_MAP = "app_map";
    private static final String SECTION_NAME_ACS_START_APP = "acs_start_app";
    private static StartAppConfigManager sInstance;

    private StartAppConfigManager() {
    }

    public static StartAppConfigManager getInstance() {
        if (sInstance == null) {
            synchronized (StartAppConfigManager.class) {
                if (sInstance == null) {
                    sInstance = new StartAppConfigManager();
                }
            }
        }
        return sInstance;
    }

    public String getSectionName() {
        return SECTION_NAME_ACS_START_APP;
    }

    public JSONObject getStartAppMap() {
        return (JSONObject) getKeyOrDefault(SECTION_KEY_ACS_APP_MAP, (Object) null);
    }
}
