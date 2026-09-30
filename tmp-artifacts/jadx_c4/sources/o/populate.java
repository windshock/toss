package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bytedance.sdk.openadsdk.wwx.lt;
import im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class populate {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static long onExtraCallbackWithResult = 3997085712798411093L;

    public static final /* synthetic */ Map onNavigationEvent(Map map, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> mapOnExtraCallback = onExtraCallback(map, str);
        int i4 = onExtraCallback + 71;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return mapOnExtraCallback;
    }

    public static final /* synthetic */ JsonObject onWarmupCompleted(JsonObject jsonObject, String str, GetNativeAdsRequestBody getNativeAdsRequestBody, GetNativeAdsRequestBody.DeviceInfo deviceInfo) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        JsonObject jsonObjectOnNavigationEvent = onNavigationEvent(jsonObject, str, getNativeAdsRequestBody, deviceInfo);
        int i4 = onExtraCallback + 31;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return jsonObjectOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        Throwable cause;
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $10 + 89;
        while (true) {
            $11 = i3 % 128;
            int i4 = i3 % 2;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 24 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 19627 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 59, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                i3 = $10 + 111;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $10 + 27;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 59, 6383 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                throw null;
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 59 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            int i7 = $11 + 7;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 % 5;
            }
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Map<String, String> onExtraCallback(Map<String, String> map, String str) {
        int i = 2 % 2;
        Object obj = null;
        if (str != null && !StringsKt.isBlank(str)) {
            Set<String> setKeySet = map.keySet();
            if (setKeySet instanceof Collection) {
                int i2 = onExtraCallback + 111;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    setKeySet.isEmpty();
                    obj.hashCode();
                    throw null;
                }
                if (!setKeySet.isEmpty()) {
                    Iterator<T> it = setKeySet.iterator();
                    while (it.hasNext()) {
                        if (StringsKt.equals((String) it.next(), "x-toss-ads-ext-overrides", true)) {
                            return map;
                        }
                    }
                }
                map = access8100.IAuthTabCallback(map, getWrite.IAuthTabCallback("x-toss-ads-ext-overrides", str));
            }
        }
        int i3 = IAuthTabCallback + 31;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return map;
        }
        obj.hashCode();
        throw null;
    }

    private static final JsonObject onNavigationEvent(JsonObject jsonObject, String str, GetNativeAdsRequestBody getNativeAdsRequestBody, GetNativeAdsRequestBody.DeviceInfo deviceInfo) throws Throwable {
        int i = 2 % 2;
        Map mapOnWarmupCompleted = access8100.onWarmupCompleted(jsonObject);
        Object[] objArr = new Object[1];
        a(new char[]{60433, 63984, 51199, 44532, 48087, 33246, 28614, 30186, 17342}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 5622, objArr);
        onExtraCallbackWithResult(mapOnWarmupCompleted, ((String) objArr[0]).intern(), str);
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        onExtraCallbackWithResult(mapOnWarmupCompleted, "sdkVersion", (String) GetNativeAdsRequestBody.IAuthTabCallback(lt.40.onExtraCallbackWithResult(), new Object[]{getNativeAdsRequestBody}, -1596629759, 1596629760, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2));
        onExtraCallbackWithResult(mapOnWarmupCompleted, "specVersion", "2.0.0");
        onExtraCallbackWithResult(mapOnWarmupCompleted, "platform", getNativeAdsRequestBody.onWarmupCompleted());
        onWarmupCompleted(mapOnWarmupCompleted, onNavigationEvent(deviceInfo));
        JsonObject jsonObject2 = new JsonObject(mapOnWarmupCompleted);
        int i2 = IAuthTabCallback + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return jsonObject2;
    }

    private static final void onExtraCallbackWithResult(Map<String, JsonElement> map, String str, String str2) {
        int i = 2 % 2;
        JsonPrimitive jsonPrimitive = map.get(str);
        JsonPrimitive jsonPrimitive2 = jsonPrimitive instanceof JsonPrimitive ? jsonPrimitive : null;
        if (jsonPrimitive2 != null) {
            int i2 = IAuthTabCallback + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String strOnNavigationEvent = initRenderFinish.onNavigationEvent(jsonPrimitive2);
            if (strOnNavigationEvent != null) {
                int i4 = onExtraCallback + 43;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    if (!StringsKt.isBlank(strOnNavigationEvent)) {
                        return;
                    }
                } else if (!StringsKt.isBlank(strOnNavigationEvent)) {
                    return;
                }
            }
        }
        map.put(str, initRenderFinish.onNavigationEvent(str2));
    }

    private static final void onWarmupCompleted(Map<String, JsonElement> map, JsonObject jsonObject) {
        JsonPrimitive jsonPrimitive;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        JsonPrimitive jsonPrimitive2 = map.get("device");
        String strOnNavigationEvent = null;
        if (!(jsonPrimitive2 instanceof JsonPrimitive)) {
            jsonPrimitive = null;
        } else {
            int i4 = IAuthTabCallback + 39;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            jsonPrimitive = jsonPrimitive2;
        }
        if (jsonPrimitive != null) {
            int i6 = onExtraCallback + 105;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                initRenderFinish.onNavigationEvent(jsonPrimitive);
                throw null;
            }
            strOnNavigationEvent = initRenderFinish.onNavigationEvent(jsonPrimitive);
        }
        if (Intrinsics.areEqual(strOnNavigationEvent, "{{device}}")) {
            map.put("device", jsonObject);
        }
    }

    public static final JsonObject onNavigationEvent(@NotNull GetNativeAdsRequestBody.DeviceInfo deviceInfo) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceInfo, "");
        PangleEncryptManager pangleEncryptManager = new PangleEncryptManager();
        dynamicTrack.onExtraCallback(pangleEncryptManager, "os", deviceInfo.access000().name());
        dynamicTrack.onExtraCallback(pangleEncryptManager, "osVersion", deviceInfo.access100());
        dynamicTrack.onExtraCallback(pangleEncryptManager, "ua", deviceInfo.readTypedObject());
        dynamicTrack.onExtraCallback(pangleEncryptManager, "ifa", deviceInfo.IAuthTabCallbackDefault());
        dynamicTrack.onExtraCallback(pangleEncryptManager, "ifv", deviceInfo.IAuthTabCallbackStubProxy());
        dynamicTrack.onExtraCallback(pangleEncryptManager, "attStatus", deviceInfo.onNavigationEvent());
        dynamicTrack.onExtraCallback(pangleEncryptManager, "model", deviceInfo.IAuthTabCallback_Parcel());
        dynamicTrack.onExtraCallback(pangleEncryptManager, "carrier", deviceInfo.onTransact());
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        dynamicTrack.onExtraCallbackWithResult(pangleEncryptManager, "screenReaderEnabled", Boolean.valueOf(((Boolean) GetNativeAdsRequestBody.DeviceInfo.onExtraCallback(iOnExtraCallbackWithResult, -1089535696, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, 1089535698, new Object[]{deviceInfo}, iOnExtraCallbackWithResult2)).booleanValue()));
        Integer numAsBinder = deviceInfo.asBinder();
        if (numAsBinder != null) {
            dynamicTrack.onNavigationEvent(pangleEncryptManager, "batteryLevel", Integer.valueOf(numAsBinder.intValue()));
        }
        String interfaceDescriptor = deviceInfo.getInterfaceDescriptor();
        if (interfaceDescriptor != null) {
            dynamicTrack.onExtraCallback(pangleEncryptManager, "networkType", interfaceDescriptor);
        }
        int iOnExtraCallbackWithResult4 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        Long l = (Long) GetNativeAdsRequestBody.DeviceInfo.onExtraCallback(iOnExtraCallbackWithResult4, -206025311, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult6, 206025311, new Object[]{deviceInfo}, iOnExtraCallbackWithResult5);
        if (l != null) {
            dynamicTrack.onNavigationEvent(pangleEncryptManager, "sessionDuration", Long.valueOf(l.longValue()));
        }
        String strIAuthTabCallback = deviceInfo.IAuthTabCallback();
        if (strIAuthTabCallback != null) {
            dynamicTrack.onExtraCallback(pangleEncryptManager, "audioState", strIAuthTabCallback);
        }
        int iOnExtraCallbackWithResult7 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult8 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult9 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        String str = (String) GetNativeAdsRequestBody.DeviceInfo.onExtraCallback(iOnExtraCallbackWithResult7, 1091021591, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult9, -1091021587, new Object[]{deviceInfo}, iOnExtraCallbackWithResult8);
        Object obj = null;
        if (str != null) {
            int i2 = IAuthTabCallback + 33;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                dynamicTrack.onExtraCallback(pangleEncryptManager, "theme", str);
                throw null;
            }
            dynamicTrack.onExtraCallback(pangleEncryptManager, "theme", str);
        }
        Integer numIAuthTabCallbackStub = deviceInfo.IAuthTabCallbackStub();
        if (numIAuthTabCallbackStub != null) {
            int i3 = onExtraCallback + 27;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                dynamicTrack.onNavigationEvent(pangleEncryptManager, "fontScale", Integer.valueOf(numIAuthTabCallbackStub.intValue()));
                obj.hashCode();
                throw null;
            }
            dynamicTrack.onNavigationEvent(pangleEncryptManager, "fontScale", Integer.valueOf(numIAuthTabCallbackStub.intValue()));
        }
        Boolean boolOnActivityResized = deviceInfo.onActivityResized();
        if (boolOnActivityResized != null) {
            dynamicTrack.onExtraCallbackWithResult(pangleEncryptManager, "isVoiceOver", boolOnActivityResized);
        }
        Integer numOnActivityLayout = deviceInfo.onActivityLayout();
        if (numOnActivityLayout != null) {
            dynamicTrack.onNavigationEvent(pangleEncryptManager, "width", Integer.valueOf(numOnActivityLayout.intValue()));
        }
        Integer numAsInterface = deviceInfo.asInterface();
        if (numAsInterface != null) {
            dynamicTrack.onNavigationEvent(pangleEncryptManager, "height", Integer.valueOf(numAsInterface.intValue()));
        }
        Boolean boolOnMessageChannelReady = deviceInfo.onMessageChannelReady();
        if (boolOnMessageChannelReady != null) {
            dynamicTrack.onExtraCallbackWithResult(pangleEncryptManager, "isLowPowerMode", boolOnMessageChannelReady);
        }
        Float fOnExtraCallback = deviceInfo.onExtraCallback();
        if (fOnExtraCallback != null) {
            int i4 = IAuthTabCallback + 51;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                dynamicTrack.onNavigationEvent(pangleEncryptManager, "animationScale", Float.valueOf(fOnExtraCallback.floatValue()));
                int i5 = 39 / 0;
            } else {
                dynamicTrack.onNavigationEvent(pangleEncryptManager, "animationScale", Float.valueOf(fOnExtraCallback.floatValue()));
            }
        }
        int iOnExtraCallbackWithResult10 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult11 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult12 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        String str2 = (String) GetNativeAdsRequestBody.DeviceInfo.onExtraCallback(iOnExtraCallbackWithResult10, -1246671315, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult12, 1246671316, new Object[]{deviceInfo}, iOnExtraCallbackWithResult11);
        if (str2 != null) {
            int i6 = onExtraCallback + 67;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                dynamicTrack.onExtraCallback(pangleEncryptManager, "webViewVersion", str2);
                obj.hashCode();
                throw null;
            }
            dynamicTrack.onExtraCallback(pangleEncryptManager, "webViewVersion", str2);
        }
        Float fICustomTabsCallback = deviceInfo.ICustomTabsCallback();
        if (fICustomTabsCallback != null) {
            dynamicTrack.onNavigationEvent(pangleEncryptManager, "pixelRatio", Float.valueOf(fICustomTabsCallback.floatValue()));
        }
        Boolean boolOnMinimized = deviceInfo.onMinimized();
        if (boolOnMinimized != null) {
            int i7 = onExtraCallback + 29;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                dynamicTrack.onExtraCallbackWithResult(pangleEncryptManager, "isCharging", boolOnMinimized);
                int i8 = 73 / 0;
            } else {
                dynamicTrack.onExtraCallbackWithResult(pangleEncryptManager, "isCharging", boolOnMinimized);
            }
        }
        return pangleEncryptManager.onExtraCallbackWithResult();
    }
}
