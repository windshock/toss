package com.alibaba.griver.base.performance.jsapi;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.common.log.ApiLog;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.utils.MapBuilder;
import com.alibaba.griver.base.performance.PerformanceAmcsManager;
import com.alibaba.griver.base.performance.PerformanceBaseMonitor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class PerformanceJSAPIMonitor extends PerformanceBaseMonitor {
    public final ConcurrentHashMap<String, LruCache<String, Long>> a = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, PerformanceJsApiModel> b = new ConcurrentHashMap<>();
    public final PerformanceAuthCodeModel c = new PerformanceAuthCodeModel();
    public int d;
    public int e;
    public int f;
    private static final byte[] $$a = {114, 69, -115, -114};
    private static final int $$b = 215;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onExtraCallbackWithResult = 1;
    private static long onExtraCallback = 7798559133331975163L;
    private static int IAuthTabCallback = -1776194565;
    private static char onWarmupCompleted = 6980;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, short s) {
        int i2;
        byte[] bArr = $$a;
        int i3 = 1 - (b * 3);
        int i4 = s + 4;
        int i5 = b2 + 109;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            i5 += -i6;
            i4++;
            bArr2[i2] = (byte) i5;
            i2++;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i4];
            i5 += -i6;
            i4++;
            bArr2[i2] = (byte) i5;
            i2++;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            i4++;
            bArr2[i2] = (byte) i5;
            i2++;
            if (i2 == i3) {
            }
        }
    }

    public String getAuthCodeEncodeString() {
        int i2 = 2 % 2;
        Map<String, Object> uploadMap = this.c.getUploadMap();
        if (uploadMap != null) {
            int i3 = onNavigationEvent + 9;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return encodeMap(uploadMap);
        }
        int i5 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final LruCache<String, Long> a(String str) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this.a.get(str) == null) {
            this.a.put(str, new LruCache<>(100));
        }
        LruCache<String, Long> lruCache = this.a.get(str);
        int i5 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return lruCache;
    }

    public final PerformanceJsApiModel b(String str) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            this.b.get(str);
            throw null;
        }
        if (this.b.get(str) == null) {
            this.b.put(str, new PerformanceJsApiModel());
            int i4 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        return this.b.get(str);
    }

    @Override // com.alibaba.griver.base.performance.PerformanceMonitor
    public void clear() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        this.b.clear();
        this.a.clear();
        this.c.clear();
        this.d = 0;
        int i5 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r1
      0x0027: PHI (r1v6 java.util.List) = (r1v5 java.util.List), (r1v17 java.util.List) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void begin(String str, String str2) {
        List apiBlackList;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            apiBlackList = PerformanceAmcsManager.getInstance().getApiBlackList();
            int i4 = 22 / 0;
            if (apiBlackList != null) {
                if (apiBlackList.contains(str)) {
                    return;
                }
            }
        } else {
            apiBlackList = PerformanceAmcsManager.getInstance().getApiBlackList();
            if (apiBlackList != null) {
            }
        }
        if ("getAuthCode".equals(str)) {
            this.c.begin(str2, SystemClock.elapsedRealtime());
            int i5 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }
        this.d++;
        a(str).put(str2, Long.valueOf(System.currentTimeMillis()));
        b(str).beginAdd();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, PerformanceJsApiModel performanceJsApiModel, long j) {
        long jLongValue;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            PerformanceAmcsManager.getInstance().getPerformanceJsApiTimeOutConfig();
            obj.hashCode();
            throw null;
        }
        PerformanceJsApiTimeOutConfig performanceJsApiTimeOutConfig = PerformanceAmcsManager.getInstance().getPerformanceJsApiTimeOutConfig();
        if (performanceJsApiTimeOutConfig != null) {
            int i4 = onExtraCallbackWithResult + 51;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            List list = performanceJsApiTimeOutConfig.blackJsApiList;
            if (list != null) {
                int i6 = onExtraCallbackWithResult + 9;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    list.contains(str);
                    throw null;
                }
                if (list.contains(str)) {
                    return;
                }
            }
            Map apiThresholdMap = performanceJsApiTimeOutConfig.getApiThresholdMap();
            if (apiThresholdMap != null) {
                Long l = (Long) apiThresholdMap.get(str);
                if (l != null) {
                    int i7 = onExtraCallbackWithResult + 57;
                    onNavigationEvent = i7 % 128;
                    jLongValue = (i7 % 2 == 0 ? l.longValue() <= 0 : l.longValue() <= 1) ? performanceJsApiTimeOutConfig.timeThreshold : l.longValue();
                }
                if (j > jLongValue) {
                    int i8 = onExtraCallbackWithResult + 99;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    performanceJsApiModel.timeOutAdd();
                }
            }
        }
    }

    @Override // com.alibaba.griver.base.performance.PerformanceMonitor
    public JSONObject getData() {
        int i2 = 2 % 2;
        Map<String, Object> map = new HashMap<>();
        Map<String, Object> map2 = new HashMap<>();
        for (Map.Entry<String, PerformanceJsApiModel> entry : this.b.entrySet()) {
            Map uploadMap = entry.getValue().getUploadMap();
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(uploadMap);
            map.put(entry.getKey(), jSONObject);
            if (entry.getValue().getTimeOutCount() > 0) {
                int i3 = onExtraCallbackWithResult + 125;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    map2.put(entry.getKey(), String.valueOf(entry.getValue().getTimeOutCount()));
                    int i4 = 62 / 0;
                } else {
                    map2.put(entry.getKey(), String.valueOf(entry.getValue().getTimeOutCount()));
                }
                int i5 = onNavigationEvent + 27;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("summary", encodeMap(map));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("summary", encodeMap(map2));
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("griver_mini_program_performance_jsapi", jSONObject2);
        jSONObject4.put("griver_mini_program_performance_jsapi_error_timeout", jSONObject3);
        return jSONObject4;
    }

    @Override // com.alibaba.griver.base.performance.PerformanceMonitor
    public void upload(App app) throws Throwable {
        int i2 = 2 % 2;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        int i3 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 4 % 3;
        }
        for (Map.Entry<String, PerformanceJsApiModel> entry : this.b.entrySet()) {
            int i5 = onExtraCallbackWithResult + 71;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            map.put(entry.getKey(), entry.getValue().getUploadMap());
            if (entry.getValue().getTimeOutCount() > 0) {
                map2.put(entry.getKey(), String.valueOf(entry.getValue().getTimeOutCount()));
            }
        }
        if (map.size() > 0) {
            int i7 = onNavigationEvent + 7;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                GriverMonitor.event("griver_mini_program_performance_jsapi", "GriverAppContainer", getExtendInfo(app, map));
                int i8 = 56 / 0;
            } else {
                GriverMonitor.event("griver_mini_program_performance_jsapi", "GriverAppContainer", getExtendInfo(app, map));
            }
        }
        if (map2.size() > 0) {
            GriverMonitor.event("griver_mini_program_performance_jsapi_error_timeout", "GriverAppContainer", getExtendInfo(app, map2));
        }
        MapBuilder.Builder map3 = new MapBuilder.Builder().map("total", String.valueOf(this.d)).map("total_success", String.valueOf(this.e)).map("total_fail", String.valueOf(this.f)).map("griverAsyncType", Boolean.TRUE.toString());
        Object[] objArr = new Object[1];
        h((-857924864) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (9747 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), new char[]{64484, 7552, 59500, 62054, 6109}, new char[]{65428, 56602, 5068, 23590}, new char[]{0, 0, 0, 0}, objArr);
        GriverMonitor.event("mpp_jsapi_total", "GriverAppContainer", map3.map(((String) objArr[0]).intern(), app.getAppId()).build());
    }

    public void end(String str, String str2, JSONObject jSONObject) {
        Integer integer;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            PerformanceAmcsManager.getInstance().getApiBlackList();
            throw null;
        }
        List apiBlackList = PerformanceAmcsManager.getInstance().getApiBlackList();
        if (apiBlackList == null || !apiBlackList.contains(str)) {
            if ("getAuthCode".equals(str)) {
                int i4 = onNavigationEvent + 15;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    this.c.end(str2, SystemClock.elapsedRealtime());
                    throw null;
                }
                this.c.end(str2, SystemClock.elapsedRealtime());
            }
            if (jSONObject == null || (integer = jSONObject.getInteger(ApiLog.API_LOG_STATE_ERROR)) == null || integer.intValue() == 0) {
                this.e++;
            } else {
                int i5 = onExtraCallbackWithResult + 59;
                onNavigationEvent = i5 % 128;
                this.f = i5 % 2 != 0 ? this.f >>> 1 : this.f + 1;
            }
            Long l = a(str).get(str2);
            if (l == null || l.longValue() == 0) {
                return;
            }
            PerformanceJsApiModel performanceJsApiModelB = b(str);
            performanceJsApiModelB.endAdd();
            long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
            performanceJsApiModelB.processAdd(jCurrentTimeMillis);
            a(str, performanceJsApiModelB, jCurrentTimeMillis);
            a(str).remove(str2);
            int i6 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private static void h(int i2, char c, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i2));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i5 = $11 + 115;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i7 = $11 + 29;
            $10 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), Color.blue(0) + 43, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1451, 228868077, false, $$c(b, b2, (byte) (-b2)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 44 - View.resolveSize(0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1494, 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - Gravity.getAbsoluteGravity(0, 0)), (ViewConfiguration.getTouchSlop() >> 8) + 50, 22938 - TextUtils.lastIndexOf("", '0', 0, 0), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), KeyEvent.normalizeMetaState(0) + 29, 12577 - TextUtils.indexOf("", "", 0, 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (IAuthTabCallback ^ 7798559133331975163L)) ^ ((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i3 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }
}
