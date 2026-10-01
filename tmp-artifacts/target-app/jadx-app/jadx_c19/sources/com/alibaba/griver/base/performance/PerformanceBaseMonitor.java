package com.alibaba.griver.base.performance;

import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.app.api.App;
import com.alibaba.griver.base.common.utils.MapBuilder;
import com.alibaba.griver.base.utils.StringUtils;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class PerformanceBaseMonitor implements PerformanceMonitor {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 38549;
    protected static final String KEY_SUMMARY = "summary";
    private static int asBinder = 1;
    private static int onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 52747;
    private static char onNavigationEvent = 19480;
    private static char onWarmupCompleted = 32301;

    public String encodeArray(List<String> list) {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        int i3 = asBinder + 71;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            int i5 = asBinder + 51;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                arrayList.add(URLEncoder.encode(it.next()));
                int i6 = 97 / 0;
            } else {
                arrayList.add(URLEncoder.encode(it.next()));
            }
        }
        String strEncode = URLEncoder.encode(StringUtils.join(arrayList.toArray(), "&"));
        int i7 = asBinder + 125;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return strEncode;
    }

    public Map<String, String> getExtendInfo(App app, Map map) throws Throwable {
        int i2 = 2 % 2;
        MapBuilder.Builder map2 = new MapBuilder.Builder().map(KEY_SUMMARY, encodeMap(map)).map("griverAsyncType", Boolean.TRUE.toString());
        Object[] objArr = new Object[1];
        g(new char[]{56140, 11382, 62692, 59212, 16310, 24227}, TextUtils.lastIndexOf("", '0') + 6, objArr);
        Map<String, String> mapBuild = map2.map(((String) objArr[0]).intern(), app.getAppId()).build();
        int i3 = onExtraCallback + 5;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return mapBuild;
        }
        throw null;
    }

    public Map<String, String> getExtendInfo(App app, List<String> list) throws Throwable {
        int i2 = 2 % 2;
        MapBuilder.Builder map = new MapBuilder.Builder().map(KEY_SUMMARY, encodeArray(list)).map("griverAsyncType", Boolean.TRUE.toString());
        Object[] objArr = new Object[1];
        g(new char[]{56140, 11382, 62692, 59212, 16310, 24227}, 5 - TextUtils.getOffsetBefore("", 0), objArr);
        Map<String, String> mapBuild = map.map(((String) objArr[0]).intern(), app.getAppId()).build();
        int i3 = asBinder + 31;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return mapBuild;
        }
        throw null;
    }

    public String encodeMap(Map<String, Object> map) {
        Map<String, Object> map2;
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj != null) {
                if ((obj instanceof String) || !(!(obj instanceof Integer))) {
                    arrayList.add(URLEncoder.encode(str) + "=" + URLEncoder.encode(String.valueOf(obj)));
                } else if (obj instanceof Map) {
                    int i3 = asBinder + 17;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        map2 = (Map) obj;
                        int i4 = 74 / 0;
                        if (map2.size() > 0) {
                            arrayList.add(URLEncoder.encode(str) + "=" + encodeMap(map2));
                            int i5 = asBinder + 95;
                            onExtraCallback = i5 % 128;
                            int i6 = i5 % 2;
                        }
                    } else {
                        map2 = (Map) obj;
                        if (map2.size() > 0) {
                            arrayList.add(URLEncoder.encode(str) + "=" + encodeMap(map2));
                            int i52 = asBinder + 95;
                            onExtraCallback = i52 % 128;
                            int i62 = i52 % 2;
                        }
                    }
                }
            }
        }
        return URLEncoder.encode(StringUtils.join(arrayList.toArray(), "&"));
    }

    private static void g(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $11 + 69;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i7 = 58224;
            int i8 = i4;
            while (i8 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i9 = (c2 + i7) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(i4, i4);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i4, i4) + 11;
                        int iAxisFromString = MotionEvent.axisFromString("") + 12435;
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMakeMeasureSpec, iIndexOf, iAxisFromString, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9, 12434 - View.resolveSizeAndState(0, 0, 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
                    cArr3 = cArr4;
                    i4 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16062 - AndroidCharacter.getMirror('0')), 15 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 19901 - (ViewConfiguration.getLongPressTimeout() >> 16), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        String str = new String(cArr2, 0, i2);
        int i11 = $11 + 69;
        $10 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }
}
