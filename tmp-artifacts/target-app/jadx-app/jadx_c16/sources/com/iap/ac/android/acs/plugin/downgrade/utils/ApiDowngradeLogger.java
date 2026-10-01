package com.iap.ac.android.acs.plugin.downgrade.utils;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.event.LogEventType;
import java.lang.reflect.Method;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class ApiDowngradeLogger {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String BIZCODE_CENTER = "iapconnect_center";
    public static final String BL_ACS_NAVIGATE_SCENE_CODE_ALLOWED_LIST_CHECK = "acs_navigate_scene_code_allowed_list_check";
    public static final String BL_ACS_NAVIGATE_SCENE_DOWNGRADE_AFTER = "acs_navigate_scene_downgrade_after";
    public static final String BL_ACS_NAVIGATE_SCENE_DOWNGRADE_BEFORE = "acs_navigate_scene_downgrade_before";
    public static final String BL_ACS_NAVIGATE_SCENE_MAP_FAILURE = "acs_navigate_scene_map_failure";
    public static final String BL_ACS_NAVIGATE_SCENE_MAP_START = "acs_navigate_scene_map_start";
    public static final String BL_ACS_NAVIGATE_SCENE_MAP_SUCCESS = "acs_navigate_scene_map_success";
    public static final String EVENT_JSAPI_DOWNGRADE_AND_INTERCEPT_HANDLED = "acs_jsapi_downgrade_and_intercept_handled";
    public static final String EVENT_JSAPI_DOWNGRADE_AND_INTERCEPT_HANDLED_FAIL = "acs_jsapi_downgrade_and_intercept_handled_fail";
    public static final String EVENT_JSAPI_DOWNGRADE_AND_INTERCEPT_INVALID = "acs_jsapi_downgrade_and_intercept_invalid";
    public static final String EVENT_JSAPI_DOWNGRADE_APPID_IS_NULL = "ac_jsapi_downgrade_appId_is_null";
    public static final String EVENT_JSAPI_DOWNGRADE_PARAMS_INVALID = "ac_jsapi_downgrade_params_invalid";
    public static final String EVENT_JSAPI_DOWNGRADE_TEXT_NOT_FOUND = "ac_jsapi_downgrade_text_not_found";
    public static final String EXT_KEY_ACTION_TYPE = "actionType";
    public static final String EXT_KEY_ALLOWED_TYPE = "allowedType";
    private static final String EXT_KEY_APP_ID = "appId";
    public static final String EXT_KEY_DOWNGRADE_TYPE = "downgradeType";
    public static final String EXT_KEY_ERROR_CODE = "error";
    public static final String EXT_KEY_ERROR_MESSAGE = "errorMessage";
    public static final String EXT_KEY_EXT_PARAMS = "extParams";
    public static final String EXT_KEY_JSAPI_NAME = "apiName";
    public static final String EXT_KEY_NAVIGATE_TYPE = "navigateType";
    private static final String EXT_KEY_SCENE_CODE = "sceneCode";
    private static long onExtraCallback = 6520670250532302632L;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public static ACLogEvent newBehaviorLogger(String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ACLogEvent eventType = ACLogEvent.newLogger(BIZCODE_CENTER, str).setEventType(LogEventType.BEHAVIOR_LOG);
        Object[] objArr = new Object[1];
        a(new char[]{60030, 46994, 20885, 62369, 40335}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 24060, objArr);
        ACLogEvent aCLogEventAddParams = eventType.addParams(((String) objArr[0]).intern(), str2);
        int i4 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return aCLogEventAddParams;
    }

    public static ACLogEvent newExceptionLogger(String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ACLogEvent eventType = ACLogEvent.newLogger(BIZCODE_CENTER, str).setEventType(LogEventType.CRUCIAL_LOG);
        Object[] objArr = new Object[1];
        a(new char[]{60030, 46994, 20885, 62369, 40335}, 24060 - TextUtils.lastIndexOf("", '0', 0), objArr);
        ACLogEvent aCLogEventAddParams = eventType.addParams(((String) objArr[0]).intern(), str2);
        int i4 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return aCLogEventAddParams;
    }

    public static void logException(String str, String str2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ACLogEvent.newLogger(BIZCODE_CENTER, str).setEventType(LogEventType.CRUCIAL_LOG).addParams(EXT_KEY_ERROR_MESSAGE, str2).event();
        int i4 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static ACLogEvent newLoggerInScene(String str, String str2, String str3) throws Throwable {
        ACLogEvent eventType;
        Object obj;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            eventType = ACLogEvent.newLogger(BIZCODE_CENTER, str).setEventType(LogEventType.BEHAVIOR_LOG);
            Object[] objArr = new Object[1];
            a(new char[]{60030, 46994, 20885, 62369, 40335}, 4774 % (ViewConfiguration.getKeyRepeatDelay() % 14), objArr);
            obj = objArr[0];
        } else {
            eventType = ACLogEvent.newLogger(BIZCODE_CENTER, str).setEventType(LogEventType.BEHAVIOR_LOG);
            Object[] objArr2 = new Object[1];
            a(new char[]{60030, 46994, 20885, 62369, 40335}, 24061 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr2);
            obj = objArr2[0];
        }
        return eventType.addParams(((String) obj).intern(), str2).addParams(EXT_KEY_SCENE_CODE, str3);
    }

    public static void logException(String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ACLogEvent.newLogger(BIZCODE_CENTER, str).setEventType(LogEventType.CRUCIAL_LOG).addParams(EXT_KEY_ACTION_TYPE, str2).addParams(EXT_KEY_ERROR_MESSAGE, str3).event();
        int i4 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 29;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), Color.red(0) + 24, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() / (onExtraCallback | 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), 59 - (ViewConfiguration.getWindowTouchSlop() >> 8), View.resolveSize(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 25 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 19626 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 59 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 6383 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i6 = $11 + 111;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 59 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }
}
