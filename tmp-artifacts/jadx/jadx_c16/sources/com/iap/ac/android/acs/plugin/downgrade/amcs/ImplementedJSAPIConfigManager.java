package com.iap.ac.android.acs.plugin.downgrade.amcs;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class ImplementedJSAPIConfigManager extends BaseDowngradeConfigManager {
    private static final String SECTION_KEY_ACS_JSAPI_ACTION_MAP = "jsapi_intercept_map";
    private static final String SECTION_NAME_ACS_IMPLEMENTED_JSAPI = "acs_implemented_jsapi_intercept_config";
    private static ImplementedJSAPIConfigManager sInstance;

    private ImplementedJSAPIConfigManager() {
    }

    public static ImplementedJSAPIConfigManager getInstance() {
        if (sInstance == null) {
            synchronized (ImplementedJSAPIConfigManager.class) {
                if (sInstance == null) {
                    sInstance = new ImplementedJSAPIConfigManager();
                }
            }
        }
        return sInstance;
    }

    public JSONObject getImplementedJSAPIConfig() {
        return (JSONObject) getKeyOrDefault(SECTION_KEY_ACS_JSAPI_ACTION_MAP, (Object) null);
    }

    public JSONObject getImplementedJSAPIPreviewConfig(@Nullable String str) {
        return (JSONObject) getKeyOrDefault("jsapi_intercept_map-" + str, (Object) null);
    }

    public String getSectionName() {
        return SECTION_NAME_ACS_IMPLEMENTED_JSAPI;
    }
}
