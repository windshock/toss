package com.iap.ac.android.acs.plugin.core;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.utils.AuthCodeUtil;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.common.container.WebContainer;
import com.iap.ac.android.common.container.model.ContainerParams;
import com.iap.ac.android.common.log.ACLog;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class ConfigInterceptor {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String CONFIG_INTERCEPT = "INTERCEPT";
    private static final String CONFIG_INTERCEPT_APP_ID = "appId";
    private static final String CONFIG_INTERCEPT_RESULT = "result";
    private static final String CONFIG_INTERCEPT_STRATEGY = "strategy";
    private static final String CONFIG_INTERCEPT_URL = "url";
    private static final String CONFIG_KEY = "acs_jsapi_intercept_strategy";
    private static final String CONFIG_NOT_INTERCEPT = "NOT_INTERCEPT";
    private static final String CONFIG_SCOPE_CONFIGURATION = "ac_scope_configuration";
    private static int[] IAuthTabCallback = {-1335457517, -1242131006, 1307710207, -1892931682, 1199363628, 210862271, -559474502, 847338486, 1983620027, 731757486, 1168598617, -886757488, -1125598929, 2011966004, -257735648, 1167676175, -1746698727, -1998500118};
    private static final String TAG = "IAPConnectPlugin";
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public static JSONObject getPhoneNumberConfig() {
        int i = 2 % 2;
        JSONObject jSONObject = (JSONObject) ConfigCenter.INSTANCE.getKeyOrDefault(CONFIG_SCOPE_CONFIGURATION, new JSONObject());
        if (jSONObject == null) {
            return null;
        }
        int i2 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (jSONObject.optJSONObject(AuthCodeUtil.SCOPE_PHONE_NUMBER) == null) {
            return null;
        }
        int i4 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return jSONObject.optJSONObject(AuthCodeUtil.SCOPE_PHONE_NUMBER);
    }

    public static Boolean handle(@NonNull String str, @NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull IAPConnectPluginCallback iAPConnectPluginCallback) throws Throwable {
        String strOptString;
        int i = 2 % 2;
        JSONObject jSONObject = (JSONObject) ConfigCenter.INSTANCE.getKeyOrDefault(CONFIG_KEY, new JSONObject());
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        Object obj = null;
        if (jSONObjectOptJSONObject == null) {
            ACLog.d(TAG, "ConfigInterceptor#handle, config interceptor strategy json is null for: " + str);
            MonitorUtil.monitorInterceptConfig(str, "CONFIG_NONE");
            return null;
        }
        try {
            strOptString = jSONObjectOptJSONObject.optString(CONFIG_INTERCEPT_STRATEGY);
        } catch (JSONException unused) {
            ACLog.e(TAG, "ConfigInterceptor#handle error, config interceptor json: " + jSONObject);
        }
        if (CONFIG_NOT_INTERCEPT.equals(strOptString)) {
            ACLog.d(TAG, "ConfigInterceptor#handle, NOT_INTERCEPT " + str);
            MonitorUtil.monitorInterceptConfig(str, "CONFIG_NOT_INTERCEPT");
            return Boolean.FALSE;
        }
        if (CONFIG_INTERCEPT.equals(strOptString)) {
            int i2 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                handleIntercept(jSONObjectOptJSONObject, str, iAPConnectPluginContext, iAPConnectPluginCallback);
                return Boolean.TRUE;
            }
            handleIntercept(jSONObjectOptJSONObject, str, iAPConnectPluginContext, iAPConnectPluginCallback);
            Boolean bool = Boolean.TRUE;
            throw null;
        }
        MonitorUtil.monitorInterceptConfig(str, "CONFIG_NONE");
        int i3 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static void handleIntercept(JSONObject jSONObject, String str, IAPConnectPluginContext iAPConnectPluginContext, IAPConnectPluginCallback iAPConnectPluginCallback) throws Throwable {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a(new int[]{-2101223376, -135139911, 152119856, -1419500223}, TextUtils.getCapsMode("", 0, 0) + 5, objArr);
        String strOptString = jSONObject.optString(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a(new int[]{739872598, -1413304282}, 3 - View.MeasureSpec.getSize(0), objArr2);
        String strOptString2 = jSONObject.optString(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(new int[]{-810029393, 2108301337, -190933263, -1116263212}, 5 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr3);
        String strOptString3 = jSONObject.optString(((String) objArr3[0]).intern());
        ACLog.d(TAG, "ConfigInterceptor#handleIntercept, INTERCEPT " + str + ", appId: " + strOptString + ", url: " + strOptString2 + ", result: " + strOptString3);
        if (!TextUtils.isEmpty(strOptString)) {
            iAPConnectPluginCallback.onResult(new JSONObject());
            ContainerParams containerParamsCreateForMniProgram = ContainerParams.createForMniProgram(strOptString);
            Bundle bundle = new Bundle();
            containerParamsCreateForMniProgram.containerBundle = bundle;
            Object[] objArr4 = new Object[1];
            a(new int[]{-810029393, 2108301337, -190933263, -1116263212}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 5, objArr4);
            bundle.putString(((String) objArr4[0]).intern(), strOptString3);
            WebContainer.getInstance("ac_biz").startContainer(iAPConnectPluginContext.getContext(), containerParamsCreateForMniProgram);
            MonitorUtil.monitorInterceptConfig(str, "CONFIG_INTERCEPT_BY_APP_ID");
            int i2 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        if (!TextUtils.isEmpty(strOptString2)) {
            iAPConnectPluginCallback.onResult(new JSONObject());
            WebContainer.getInstance("ac_biz").startContainer(iAPConnectPluginContext.getContext(), strOptString2);
            MonitorUtil.monitorInterceptConfig(str, "CONFIG_INTERCEPT_BY_URL");
        } else {
            if (!TextUtils.isEmpty(strOptString3)) {
                iAPConnectPluginCallback.onResult(new JSONObject(strOptString3));
                MonitorUtil.monitorInterceptConfig(str, "CONFIG_INTERCEPT_BY_RESULT");
                return;
            }
            iAPConnectPluginCallback.onResult(new JSONObject());
            int i4 = onExtraCallbackWithResult + 99;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = IAuthTabCallback;
        int i5 = -1469660336;
        int i6 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i7 = $10 + 13;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (i9 < length2) {
                int i10 = $10 + 113;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i9])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), (Process.myTid() >> 22) + 72, 8849 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr4[i9] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i9++;
                    i5 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = IAuthTabCallback;
        if (iArr6 != null) {
            int i12 = $11 + 31;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i13 = $10 + 93;
                $11 = i13 % 128;
                int i14 = i13 % i3;
                try {
                    Object[] objArr3 = new Object[1];
                    objArr3[i6] = Integer.valueOf(iArr6[i2]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', i6)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 71, 8847 - Process.getGidForName(""), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i2] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i2++;
                    i3 = 2;
                    i6 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr6 = iArr2;
        }
        int i15 = i6;
        System.arraycopy(iArr6, i15, iArr5, i15, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i15;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i16 = $10 + 101;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i18 = 0;
            while (i18 < 16) {
                int i19 = $10 + 31;
                $11 = i19 % 128;
                int i20 = i19 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i18];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (ViewConfiguration.getScrollBarSize() >> 8)), 'W' - AndroidCharacter.getMirror('0'), (KeyEvent.getMaxKeyCode() >> 16) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i18++;
                int i21 = $11 + 99;
                $10 = i21 % 128;
                int i22 = i21 % 2;
            }
            int i23 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i23;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i24 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i25 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 4033), 79 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
