package com.iap.ac.android.acs.plugin.downgrade.amcs;

import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class NotFoundJSAPIConfigManager extends BaseDowngradeConfigManager {
    private static final String SECTION_KEY_ACS_JSAPI_ACTION_MAP = "jsapi_downgrade_map";
    private static final String SECTION_NAME_ACS_NOT_FOUND_JSAPI = "acs_not_found_jsapi_downgrade_config";
    private static NotFoundJSAPIConfigManager sInstance;

    private NotFoundJSAPIConfigManager() {
    }

    public static NotFoundJSAPIConfigManager getInstance() {
        if (sInstance == null) {
            synchronized (NotFoundJSAPIConfigManager.class) {
                if (sInstance == null) {
                    sInstance = new NotFoundJSAPIConfigManager();
                }
            }
        }
        return sInstance;
    }

    public JSONObject getNotFoundJSAPIConfig() {
        return (JSONObject) getKeyOrDefault(SECTION_KEY_ACS_JSAPI_ACTION_MAP, (Object) null);
    }

    public String getSectionName() {
        return SECTION_NAME_ACS_NOT_FOUND_JSAPI;
    }
}
