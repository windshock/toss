package com.bytedance.sdk.openadsdk.core.widget.ycx;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.CookieManager;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ycx {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 16696;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 19690;
    private static char onNavigationEvent = 38024;
    private static char onWarmupCompleted = 21542;

    public static Map<String, String> ycx(Map<String, List<String>> map, String str) throws Throwable {
        int i2 = 2 % 2;
        HashMap map2 = new HashMap();
        if (map != null && !map.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (key != null && value != null && !value.isEmpty()) {
                    int i3 = IAuthTabCallbackDefault + 1;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    if (key.equalsIgnoreCase("set-cookie")) {
                        arrayList.addAll(value);
                    } else {
                        map2.put(key, ycx(value));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                ycx(arrayList, str);
            }
        }
        int i5 = IAuthTabCallbackDefault + 79;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return map2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static String ycx(List<String> list) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 83;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (list == null || list.isEmpty()) {
            return "";
        }
        if (list.size() == 1) {
            int i5 = onExtraCallback + 39;
            IAuthTabCallbackDefault = i5 % 128;
            return i5 % 2 == 0 ? list.get(0) : list.get(0);
        }
        StringBuilder sb = new StringBuilder();
        for (int i6 = 0; i6 < list.size(); i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            sb.append(list.get(i6));
        }
        return sb.toString();
    }

    private static void ycx(List<String> list, String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 61;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        CookieManager cookieManager = CookieManager.getInstance();
        int i5 = IAuthTabCallbackDefault + 103;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        for (String str2 : list) {
            try {
                Object[] objArr = new Object[1];
                a(new char[]{55518, 20380, 21630, 41963, 26158, 45267, 54909, 61781}, 8 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
                cookieManager.setCookie(((String) objArr[0]).intern().concat(String.valueOf(str)), str2);
                cookieManager.flush();
                Process.getGidForName("");
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+SSRBLl9iZdP1UuFFLc=", "c+sskQauSsiOXNJPmBSy", "U+8jkQ+5WsKUadhShxilOw==", 83);
                TypedValue.complexToFraction(0, 0.0f, 0.0f);
            }
        }
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i5 = $11 + 101;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 58224;
            int i8 = i4;
            while (i8 < 16) {
                char c2 = cArr3[c];
                char c3 = cArr3[i4];
                char[] cArr4 = cArr3;
                int i9 = (c3 + i7) ^ ((c3 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[c] = Integer.valueOf(i9);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c4 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int i11 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9;
                        int gidForName = Process.getGidForName("") + 12435;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c4, i11, gidForName, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    int i12 = i8;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 10 - Color.argb(0, 0, 0, 0), 12434 - Color.alpha(0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8 = i12 + 1;
                    cArr3 = cArr4;
                    i4 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 16014), 14 - View.getDefaultSize(0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 19902, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i13 = $10 + 117;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }
}
