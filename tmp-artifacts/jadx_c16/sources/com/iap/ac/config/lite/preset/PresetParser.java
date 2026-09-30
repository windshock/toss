package com.iap.ac.config.lite.preset;

import android.content.Context;
import android.text.TextUtils;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.config.lite.d.e;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class PresetParser {
    public static final String FILE_EXT = ".json";
    public static final String FILE_NAME = "amcs_config";
    public static final String UNDERLINE = "_";
    private static final String a = e.b("PresetParser");

    public static PresetConfig$SiteConfig getSiteConfig(Context context, String str, String str2) {
        List<PresetConfig$SiteConfig> list;
        PresetConfig presetConfig = parsePresetConfig(context, str2);
        if (presetConfig != null && (list = presetConfig.firstPartyConfig) != null) {
            for (PresetConfig$SiteConfig presetConfig$SiteConfig : list) {
                if (presetConfig$SiteConfig.env.toUpperCase().equals(str.toUpperCase())) {
                    return presetConfig$SiteConfig;
                }
            }
        }
        ACLog.e(a, String.format("doesn't find any siteConfig, env = %s, bizCode = %s", str, str2));
        return new PresetConfig$SiteConfig();
    }

    public static PresetConfig parsePresetConfig(Context context, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(FILE_NAME);
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = UNDERLINE + str;
        }
        sb.append(str2);
        sb.append(FILE_EXT);
        String strB = e.b(context, sb.toString());
        ACLog.d(a, String.format("amcs_config.json content = %s", strB));
        try {
            return (PresetConfig) JsonUtils.fromJson(strB, PresetConfig.class);
        } catch (Exception e) {
            ACLog.d(a, "parsePresetConfig e : " + e);
            return null;
        }
    }
}
