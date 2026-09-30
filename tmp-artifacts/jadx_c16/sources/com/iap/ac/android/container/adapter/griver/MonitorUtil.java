package com.iap.ac.android.container.adapter.griver;

import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.fastjson.JSON;
import com.alibaba.griver.api.bridge.BridgeInterceptor;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.base.common.utils.MonitorUtils;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeLogger;
import com.iap.android.mppclient.mpm.utils.TradePayResultUtils;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class MonitorUtil {
    private static final byte[] $$a = {1, -53, 31, 101};
    private static final int $$b = 18;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted = 478308942;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, short s) {
        int i;
        int i2 = (b * 2) + 105;
        int i3 = s * 4;
        byte[] bArr = $$a;
        int i4 = 3 - (b2 * 2);
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i5 = i4;
            int i6 = i3;
            int i7 = 0;
            i2 = (-i2) + i6;
            i4 = i5;
            i = i7;
            int i8 = i4 + 1;
            bArr2[i] = (byte) i2;
            i7 = i + 1;
            if (i == i3) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i8];
            i6 = i2;
            i2 = b3;
            i5 = i8;
            i2 = (-i2) + i6;
            i4 = i5;
            i = i7;
            int i82 = i4 + 1;
            bArr2[i] = (byte) i2;
            i7 = i + 1;
            if (i == i3) {
            }
        } else {
            i = 0;
            int i822 = i4 + 1;
            bArr2[i] = (byte) i2;
            i7 = i + 1;
            if (i == i3) {
            }
        }
    }

    public static void monitorTradePayStart(BridgeInterceptor.InterceptContext interceptContext) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        MonitorMap.Builder builderA = a(interceptContext);
        if (builderA != null) {
            GriverMonitor.event("mini_trade_pay_start", "GriverAppContainer", builderA.build());
            return;
        }
        int i4 = onExtraCallback + 101;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void monitorTradePay(BridgeInterceptor.InterceptContext interceptContext, JSONObject jSONObject) throws Throwable {
        int i = 2 % 2;
        MonitorMap.Builder builderA = a(interceptContext);
        if (builderA == null) {
            return;
        }
        if (!jSONObject.isNull(ApiDowngradeLogger.EXT_KEY_ERROR_CODE)) {
            builderA.append("status", ApiDowngradeLogger.EXT_KEY_ERROR_CODE);
            int i2 = onExtraCallbackWithResult + 107;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 % 5;
            }
        } else {
            int i4 = onExtraCallback + 23;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                builderA.append("status", "success");
                throw null;
            }
            builderA.append("status", "success");
        }
        try {
            Object[] objArr = new Object[1];
            b(6 - (ViewConfiguration.getLongPressTimeout() >> 16), 4 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{4, 6, 65533, 5, 3, 65526}, false, TextUtils.getOffsetBefore("", 0) + 214, objArr);
            builderA.append(((String) objArr[0]).intern(), URLEncoder.encode(JSON.toJSONString(jSONObject), "utf-8"));
            if (jSONObject.getString(TradePayResultUtils.RESULT_CODE_KEY) != null) {
                builderA.append(TradePayResultUtils.RESULT_CODE_KEY, jSONObject.getString(TradePayResultUtils.RESULT_CODE_KEY));
            }
        } catch (Exception e) {
            GriverLogger.e("MonitorUtil", "encode result failed", e);
        }
        GriverMonitor.event("mini_trade_pay", "GriverAppContainer", builderA.build());
    }

    public static MonitorMap.Builder a(BridgeInterceptor.InterceptContext interceptContext) {
        int i = 2 % 2;
        MonitorMap.Builder builder = new MonitorMap.Builder();
        Page page = interceptContext.page;
        App app = page.getApp();
        builder.appId(app.getAppId()).version(app).url(page.getOriginalURI());
        builder.append("sourceInfo", MonitorUtils.getSourceInfoFromStartupParams(app.getStartParams()));
        com.alibaba.fastjson.JSONObject jSONObject = interceptContext.acParams;
        Object obj = null;
        if (jSONObject != null) {
            int i2 = onExtraCallback + 115;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                jSONObject.containsKey("acParams");
                obj.hashCode();
                throw null;
            }
            if (jSONObject.containsKey("acParams")) {
                int i3 = onExtraCallback + 11;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    jSONObject.getJSONObject("acParams");
                    obj.hashCode();
                    throw null;
                }
                com.alibaba.fastjson.JSONObject jSONObject2 = jSONObject.getJSONObject("acParams");
                if (jSONObject2 != null && !(!jSONObject2.containsKey("source"))) {
                    int i4 = onExtraCallback + 9;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    builder.append("source", jSONObject2.getString("source"));
                    int i6 = onExtraCallback + 13;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
        }
        com.alibaba.fastjson.JSONObject jSONObject3 = interceptContext.jsParameters;
        if (jSONObject3 == null) {
            int i8 = onExtraCallback + 9;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            return null;
        }
        String string = jSONObject3.getString("tradeNO");
        String string2 = jSONObject3.getString("paymentUrl");
        String string3 = jSONObject3.getString("orderStr");
        if (!TextUtils.isEmpty(string2)) {
            builder.append("tradeType", "paymentUrl").append("tradeInfo", string2);
            return builder;
        }
        if (!TextUtils.isEmpty(string3)) {
            builder.append("tradeType", "orderStr").append("tradeInfo", string3);
            return builder;
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        builder.append("tradeType", "tradeNO").append("tradeInfo", string);
        return builder;
    }

    private static void b(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
            int i5 = $11 + 117;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35126 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.indexOf("", "", 0, 0) + 23, 10278 - View.MeasureSpec.getMode(0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        char cMyTid = (char) (12843 - (Process.myTid() >> 22));
                        int i8 = 56 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int iMyTid = (Process.myTid() >> 22) + 2167;
                        byte b = (byte) ($$a[0] - 1);
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMyTid, i8, iMyTid, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (i2 > 0) {
            int i9 = $11 + 95;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback3 == null) {
                    char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 12843);
                    int i11 = 56 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int i12 = 2167 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte b3 = (byte) ($$a[0] - 1);
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(threadPriority, i11, i12, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i13 = $10 + 83;
                $11 = i13 % 128;
                int i14 = i13 % 2;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
