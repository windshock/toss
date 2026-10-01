package com.iap.ac.android.acs.plugin.downgrade;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.acs.plugin.downgrade.amcs.JSAPICompatibilityConfigManager;
import com.iap.ac.android.acs.plugin.downgrade.handler.IActionHandler;
import com.iap.ac.android.acs.plugin.downgrade.handler.IActionHandlerCallback;
import com.iap.ac.android.acs.plugin.downgrade.handler.impl.AlertActionHandler;
import com.iap.ac.android.acs.plugin.downgrade.handler.impl.BaseActionHandler;
import com.iap.ac.android.acs.plugin.downgrade.handler.impl.CallbackResultActionHandler;
import com.iap.ac.android.acs.plugin.downgrade.handler.impl.ConfirmActionHandler;
import com.iap.ac.android.acs.plugin.downgrade.handler.impl.ErrorPageActionHandler;
import com.iap.ac.android.acs.plugin.downgrade.handler.impl.MiniProgramActionHandler;
import com.iap.ac.android.acs.plugin.downgrade.handler.impl.NavigateSceneActionHandler;
import com.iap.ac.android.acs.plugin.downgrade.handler.impl.NoneActionHandler;
import com.iap.ac.android.acs.plugin.downgrade.handler.impl.RedirectActionHandler;
import com.iap.ac.android.acs.plugin.downgrade.handler.impl.SchemeActionHandler;
import com.iap.ac.android.acs.plugin.downgrade.handler.impl.ToastActionHandler;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeLogger;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeUtils;
import com.iap.ac.android.acs.plugin.ui.utils.UIUtils;
import com.iap.ac.android.common.log.ACLog;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class ActionExecutor {
    private static int $10 = 0;
    private static int $11 = 1;
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackStub = 1;
    private static final String TAG;
    private static int asInterface = 0;
    private static int onExtraCallback = 0;
    private static boolean onExtraCallbackWithResult = false;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char[] onWarmupCompleted;
    private static ActionExecutor sInstance;
    private final Map<String, BaseActionHandler> mActionHandlers = new ConcurrentHashMap();

    static {
        onNavigationEvent();
        TAG = ApiDowngradeUtils.logTag("ActionExecutor");
        int i = IAuthTabCallbackStub + 103;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private ActionExecutor() {
        registerActionHandlers();
    }

    public static ActionExecutor getInstance() {
        if (sInstance == null) {
            synchronized (ActionExecutor.class) {
                if (sInstance == null) {
                    sInstance = new ActionExecutor();
                }
            }
        }
        return sInstance;
    }

    public boolean handleAction(@NonNull IAPConnectPluginContext iAPConnectPluginContext, @NonNull JSONObject jSONObject, @NonNull IActionHandlerCallback iActionHandlerCallback) throws Throwable {
        synchronized (this) {
            String str = TAG;
            ACLog.d(str, "handleAction() start. appId: " + iAPConnectPluginContext.miniProgramAppID + " config: " + jSONObject + ", params: " + iAPConnectPluginContext.jsParameters);
            if (!JSAPICompatibilityConfigManager.getInstance().isJSAPICompatibilityEnabled()) {
                ACLog.w(str, "handleAction(), cancel apidowngrade, for it is not enabled");
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(ApiDowngradeLogger.EXT_KEY_ERROR_CODE, 40002);
                    jSONObject2.put(ApiDowngradeLogger.EXT_KEY_ERROR_MESSAGE, "cancel apidowngrade, for it is not enabled");
                    iActionHandlerCallback.onHandleFailure(jSONObject2);
                } catch (JSONException e) {
                    ACLog.w(TAG, "handleAction(), json error: " + e);
                }
                return false;
            }
            if (UIUtils.isActivityDisabled(iAPConnectPluginContext.getActivity())) {
                ACLog.w(str, "handleAction(), cancel apidowngrade, for the activity is null or disabled");
                return false;
            }
            String strOptString = jSONObject.optString(ApiDowngradeLogger.EXT_KEY_ACTION_TYPE);
            if (TextUtils.isEmpty(strOptString)) {
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-125, -127, -126, -127}, 127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
                strOptString = ((String) objArr[0]).intern();
            }
            IActionHandler iActionHandler = this.mActionHandlers.get(strOptString);
            if (iActionHandler != null) {
                ACLog.d(str, String.format("handleAction(), find actionHandler: %s, config: %s, jsParameters: %s", iActionHandler.getClass().getSimpleName(), jSONObject, iAPConnectPluginContext.jsParameters));
                return iActionHandler.handleAction(iAPConnectPluginContext, jSONObject, iActionHandlerCallback);
            }
            String str2 = "apidowngrade failed, can't find the actionHandler in actionType: " + strOptString;
            ACLog.w(str, "handleAction(), " + str2);
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put(ApiDowngradeLogger.EXT_KEY_ERROR_CODE, 40002);
                jSONObject3.put(ApiDowngradeLogger.EXT_KEY_ERROR_MESSAGE, str2);
            } catch (JSONException e2) {
                ACLog.w(TAG, "handleAction(), json error: " + e2);
            }
            iActionHandlerCallback.onHandleFailure(jSONObject3);
            return false;
        }
    }

    public void registerActionHandler(BaseActionHandler baseActionHandler) {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Map<String, BaseActionHandler> map = this.mActionHandlers;
        if (i3 != 0) {
            map.put(baseActionHandler.getActionType(), baseActionHandler);
            return;
        }
        map.put(baseActionHandler.getActionType(), baseActionHandler);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void registerActionHandlers() {
        int i = 2 % 2;
        int i2 = 0;
        BaseActionHandler[] baseActionHandlerArr = {new AlertActionHandler(), new CallbackResultActionHandler(), new ConfirmActionHandler(), new ErrorPageActionHandler(), new MiniProgramActionHandler(), new NavigateSceneActionHandler(), new NoneActionHandler(), new RedirectActionHandler(), new SchemeActionHandler(), new ToastActionHandler()};
        while (i2 < 10) {
            int i3 = onTransact + 57;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            registerActionHandler(baseActionHandlerArr[i2]);
            i2++;
            int i5 = onTransact + 93;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onWarmupCompleted;
        long j = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 76, 20952 - TextUtils.indexOf("", "", 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 74, ((byte) KeyEvent.getModifierMetaStateMask()) + 16038, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (IAuthTabCallback) {
            int i5 = $10 + 69;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 62 - ImageFormat.getBitsPerPixel(0), 12214 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2);
            return;
        }
        if (onExtraCallbackWithResult) {
            int i6 = $10 + 49;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), MotionEvent.axisFromString("") + 64, TextUtils.getOffsetBefore("", 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        int i8 = $11 + 81;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i10 = $10 + 79;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback / 0) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >> i] >>> iIntValue);
                i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted << 1;
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
            }
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
        }
        objArr[0] = new String(cArr6);
    }

    static void onNavigationEvent() {
        onWarmupCompleted = new char[]{32273, 32272, 32282};
        onNavigationEvent = -1184334201;
        onExtraCallbackWithResult = true;
        IAuthTabCallback = true;
    }
}
