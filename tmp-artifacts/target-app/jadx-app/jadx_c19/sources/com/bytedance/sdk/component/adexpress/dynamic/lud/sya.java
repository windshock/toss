package com.bytedance.sdk.component.adexpress.dynamic.lud;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bytedance.sdk.component.adexpress.dynamic.dj.dj;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class sya {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 1;
    private static long onExtraCallbackWithResult = 3223329104617102882L;
    private static int onWarmupCompleted;

    public JSONObject ycx(List<dj.ycx> list, int i2, JSONObject jSONObject) {
        dj.ycx next;
        int i3 = 2 % 2;
        Object obj = null;
        if (list != null) {
            int i4 = onWarmupCompleted + 103;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                list.size();
                throw null;
            }
            if (list.size() > 0) {
                Iterator<dj.ycx> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    int i5 = onExtraCallback + 105;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    next = it.next();
                    if (next != null && next.ycx == i2) {
                        break;
                    }
                }
                if (next != null) {
                    JSONObject jSONObject2 = next.zb;
                    if (jSONObject2 == null) {
                        return null;
                    }
                    return ycx(jSONObject2, jSONObject);
                }
                int i7 = onWarmupCompleted;
                int i8 = i7 + 109;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                int i10 = i7 + 13;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                return null;
            }
        }
        int i12 = onWarmupCompleted + 7;
        onExtraCallback = i12 % 128;
        if (i12 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        Object obj;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i2);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (true) {
            obj = null;
            if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                break;
            }
            int i4 = $11 + 21;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i6 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (Process.myPid() >> 22)), Color.red(0) + 84, Drawable.resolveOpacity(0, 0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 14185), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19, ExpandableListView.getPackedPositionType(0L) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i7 = $11 + 71;
        $10 = i7 % 128;
        if (i7 % 2 == 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    private static JSONObject ycx(JSONObject jSONObject, JSONObject jSONObject2) throws Throwable {
        Iterator<String> itKeys;
        int i2;
        int i3 = 2 % 2;
        JSONObject jSONObject3 = new JSONObject();
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("customComponentDefaultValues");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("values");
            Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
            while (itKeys2.hasNext()) {
                int i4 = onWarmupCompleted + 79;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                String next = itKeys2.next();
                jSONObjectOptJSONObject.put(next, jSONObjectOptJSONObject2.opt(next));
            }
            Iterator<String> itKeys3 = jSONObject.keys();
            while (!(!itKeys3.hasNext())) {
                int i6 = onWarmupCompleted + 7;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                String next2 = itKeys3.next();
                if (!TextUtils.equals(next2, "customComponentDefaultValues")) {
                    if (TextUtils.equals(next2, "values")) {
                        jSONObject3.put(next2, jSONObjectOptJSONObject);
                        i2 = onWarmupCompleted + 53;
                        onExtraCallback = i2 % 128;
                    } else {
                        jSONObject3.put(next2, jSONObject.opt(next2));
                        i2 = onExtraCallback + 51;
                        onWarmupCompleted = i2 % 128;
                    }
                    int i8 = i2 % 2;
                }
            }
            Object[] objArr = new Object[1];
            a(new char[]{5245, 5129, 54196, 39972, 63203, 48631, 54792, 53784}, ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr);
            jSONObject3.put(((String) objArr[0]).intern(), "vessel");
            JSONObject jSONObjectOptJSONObject3 = jSONObject2.optJSONObject("values");
            JSONObject jSONObjectOptJSONObject4 = jSONObject3.optJSONObject("values");
            if (jSONObjectOptJSONObject3 != null && jSONObjectOptJSONObject4 != null) {
                int i9 = onWarmupCompleted + 37;
                onExtraCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    itKeys = jSONObjectOptJSONObject3.keys();
                    int i10 = 51 / 0;
                } else {
                    itKeys = jSONObjectOptJSONObject3.keys();
                }
                while (!(!itKeys.hasNext())) {
                    String next3 = itKeys.next();
                    if (!"clickArea".equals(next3)) {
                        jSONObjectOptJSONObject4.put(next3, jSONObjectOptJSONObject3.opt(next3));
                    }
                }
            }
            return jSONObject3;
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "ePs+gQyxSsiNWthTiR+0BVrgLJIGrg==", "Vus/kgaffNSURdp+gxywJ1XrI4EvvXDIlV4=", 84);
            return jSONObject3;
        }
    }
}
