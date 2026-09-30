package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzahb {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long onExtraCallback = 452111555983228154L;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public static zzaah zza(@NonNull Exception exc, @NonNull String str, @NonNull String str2) {
        int i2 = 2 % 2;
        Log.e(str, "Failed to parse " + str + " for string [" + str2 + "] with exception: " + exc.getMessage());
        StringBuilder sb = new StringBuilder("Failed to parse ");
        sb.append(str);
        sb.append(" for string [");
        sb.append(str2);
        sb.append("]");
        zzaah zzaahVar = new zzaah(sb.toString(), exc);
        int i3 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return zzaahVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static List<String> zza(@Nullable JSONArray jSONArray) throws JSONException {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            if (jSONArray.length() != 0) {
                int i3 = onNavigationEvent + 73;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                    int i6 = onExtraCallbackWithResult + 101;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    arrayList.add(jSONArray.getString(i5));
                }
            } else {
                int i8 = onNavigationEvent + 9;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        return arrayList;
    }

    public static void zza(JSONObject jSONObject) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(new char[]{36788, 36823, 34436, 16670, 38254, 2259, 36866, 42660, 46459, 10391, 45172, 6891, 24404, 18141}, KeyEvent.normalizeMetaState(0), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(new char[]{36788, 36823, 34436, 16670, 38254, 2259, 36866, 42660, 46459, 10391, 45172, 6891, 24404, 18141}, KeyEvent.normalizeMetaState(0), objArr2);
            obj = objArr2[0];
        }
        jSONObject.put(((String) obj).intern(), "CLIENT_TYPE_ANDROID");
        int i4 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void zza(JSONObject jSONObject, String str, String str2) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            jSONObject.put(str, str2);
            jSONObject.put("recaptchaVersion", "RECAPTCHA_ENTERPRISE");
            Object[] objArr = new Object[1];
            a(new char[]{36788, 36823, 34436, 16670, 38254, 2259, 36866, 42660, 46459, 10391, 45172, 6891, 24404, 18141}, TextUtils.lastIndexOf("", 'v', 1) + 1, objArr);
            obj = objArr[0];
        } else {
            jSONObject.put(str, str2);
            jSONObject.put("recaptchaVersion", "RECAPTCHA_ENTERPRISE");
            Object[] objArr2 = new Object[1];
            a(new char[]{36788, 36823, 34436, 16670, 38254, 2259, 36866, 42660, 46459, 10391, 45172, 6891, 24404, 18141}, TextUtils.lastIndexOf("", '0', 0) + 1, objArr2);
            obj = objArr2[0];
        }
        jSONObject.put(((String) obj).intern(), "CLIENT_TYPE_ANDROID");
        int i4 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i2);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i4 = $10 + 9;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i6 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 45812), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 84, TextUtils.lastIndexOf("", '0', 0, 0) + 21234, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 19, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 8809, 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        int i7 = $11 + 87;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }
}
