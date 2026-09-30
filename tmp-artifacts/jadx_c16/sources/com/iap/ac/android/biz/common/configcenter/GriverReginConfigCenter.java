package com.iap.ac.android.biz.common.configcenter;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.biz.accommon.a.a;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.config.lite.ConfigCenter;
import com.iap.ac.config.lite.listener.sectionconfig.ChangedDetails;
import com.iap.ac.config.lite.listener.sectionconfig.ISectionConfigListener;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class GriverReginConfigCenter {
    private static final String GRIVER_BIZ_CODE = "GriverAppContainer";
    private static final String KEY_REGION_CONFIG = "region_config";
    private static final String SECTION_TAG = "RegionConfig";
    public static final String TAG = "GriverReginConfigCenter";
    private static Map data;

    private static <T> T getKeyOrDefault(String str, T t) {
        T t2;
        synchronized (GriverReginConfigCenter.class) {
            Map map = data;
            if (map == null) {
                return t;
            }
            try {
                t2 = (T) map.get(str);
            } catch (Throwable th) {
                a.a("getKeyOrDefault exception: ", th, "IAPConnect");
            }
            if (t2 == null || t2.getClass() != t.getClass()) {
                ACLog.e("IAPConnect", "ConfigCenter, get value from config center fail, key: " + str + ", use default value.");
                return t;
            }
            ACLog.i("IAPConnect", "ConfigCenter, get value from config center success, key: " + str + ", value: " + t2);
            return t2;
        }
    }

    public static <T> T getKeyOrDefaultNewWay(String str, T t) {
        synchronized (GriverReginConfigCenter.class) {
            if (getRegionConfig() != null) {
                return (T) getKeyOrDefault(str, t);
            }
            return (T) ConfigCenter.INSTANCE.getKeyOrDefault(KEY_REGION_CONFIG, t);
        }
    }

    public static Map getMapNewWay() {
        synchronized (GriverReginConfigCenter.class) {
            if (getRegionConfig() != null) {
                return getRegionConfig();
            }
            return ConfigCenter.INSTANCE.getMap(KEY_REGION_CONFIG, new HashMap());
        }
    }

    private static Map getRegionConfig() {
        return data;
    }

    public static void init() {
        try {
            ConfigCenter configCenter = ConfigCenter.getInstance(GRIVER_BIZ_CODE);
            if (configCenter != null) {
                JSONObject sectionConfig = configCenter.getSectionConfig(SECTION_TAG);
                if (sectionConfig != null) {
                    parseData((JSONObject) JsonUtils.fromJson(sectionConfig.toString(), JSONObject.class));
                }
                configCenter.addSectionConfigListener(SECTION_TAG, new ISectionConfigListener() { // from class: com.iap.ac.android.biz.common.configcenter.GriverReginConfigCenter.1
                    public void onConfigChanged(@NonNull String str, @Nullable JSONObject jSONObject, @NonNull ChangedDetails changedDetails) {
                        if (!TextUtils.isEmpty(str)) {
                            ACLog.d(GriverReginConfigCenter.TAG, "onConfigChangedKey: " + str);
                        }
                        if (jSONObject != null) {
                            ACLog.d(GriverReginConfigCenter.TAG, "onConfigChangedValue: " + JsonUtils.toJson(jSONObject));
                            try {
                                GriverReginConfigCenter.parseData((JSONObject) JsonUtils.fromJson(jSONObject.toString(), JSONObject.class));
                            } catch (Exception e) {
                                ACLog.e(GriverReginConfigCenter.TAG, "onConfigChanged", e);
                            }
                        }
                    }
                });
            }
        } catch (Exception e) {
            ACLog.e(TAG, "init", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void parseData(JSONObject jSONObject) throws Exception {
        if (jSONObject == null) {
            data = null;
        } else if (jSONObject.has(KEY_REGION_CONFIG)) {
            data = (Map) JsonUtils.fromJson(JsonUtils.toJson(jSONObject.getJSONObject(KEY_REGION_CONFIG)), Map.class);
        } else {
            data = null;
        }
    }
}
