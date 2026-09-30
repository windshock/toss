package com.alibaba.griver.uimode.base;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.alibaba.ariver.app.api.ui.darkmode.ThemeUtils;
import com.alibaba.ariver.kernel.common.utils.IOUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.uimode.api.ResourceManager;
import com.alibaba.griver.uimode.api.UiMode;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class BaseResourceManger implements ResourceManager {
    public static final String c = "BaseResourceManger";
    public final Map<String, Integer> a = new HashMap();
    public JSONObject b;

    public final int a(UiMode uiMode, String str) {
        if (this.b == null) {
            String asset = IOUtils.readAsset(GriverEnv.getResources(), "GriverTheme/theme.json");
            this.b = JSON.parseObject(asset);
            GriverLogger.d(c, "theme.json=" + asset);
        }
        JSONObject jSONObject = this.b;
        if (jSONObject == null) {
            GriverLogger.d(c, "theme.json read fail");
            return -1;
        }
        String str2 = uiMode == UiMode.MODE_NIGHT_NO ? ThemeUtils.COLOR_SCHEME_LIGHT : ThemeUtils.COLOR_SCHEME_DARK;
        JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
        if (jSONObject2 == null) {
            return -1;
        }
        try {
            return Color.parseColor(jSONObject2.getString(str));
        } catch (Exception e) {
            GriverLogger.e(c, "Color json format was wrong ,please check the value of the " + str + " in " + str2 + " node", e);
            return -1;
        }
    }

    public int getColor(UiMode uiMode, String str) {
        Integer num;
        StringBuilder sb = new StringBuilder();
        sb.append(UiMode.isNight(uiMode) ? ThemeUtils.COLOR_SCHEME_DARK : ThemeUtils.COLOR_SCHEME_LIGHT);
        sb.append("_");
        sb.append(str);
        String string = sb.toString();
        if (this.a.containsKey(string) && (num = this.a.get(string)) != null) {
            return num.intValue();
        }
        int iA = a(uiMode, str);
        this.a.put(string, Integer.valueOf(iA));
        return iA;
    }

    public Drawable getDrawable(UiMode uiMode, String str) {
        return null;
    }

    public Drawable getDrawable(UiMode uiMode, int i2) {
        return GriverEnv.getApplicationContext().getResources().getDrawable(i2);
    }

    public int getColor(UiMode uiMode, int i2) {
        return GriverEnv.getApplicationContext().getResources().getColor(i2);
    }
}
