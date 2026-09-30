package o;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.gms.internal.ads.zzgc;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import im.toss.core.workerservice.WorkerService$Companion$;
import im.toss.rn.toss.core.common.process.RnProcessRuntime;
import im.toss.rn.toss.core.common.process.RnRemoteProcessGuardRecorder;
import im.toss.rn.toss.core.common.wrapper.TossReactContentOwner;
import im.toss.splittarget.spec.fsm.AppState;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import o.ALCFaceValidation;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static long onTransact;
    private final HashMap<Integer, Object> IAuthTabCallback;
    private final HashMap<Integer, Function2<String, Map<?, ?>, Unit>> onExtraCallback;
    private final AppSetIdAndScope1 onExtraCallbackWithResult;
    private final calculateMaxTextSize onNavigationEvent;
    private final HashMap<Integer, Callback> onWarmupCompleted;

    public interface onNavigationEvent {
        r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE invoke();
    }

    static {
        IAuthTabCallback();
        Companion = new IAuthTabCallback(null);
        int i = IAuthTabCallbackStub + 45;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE(@NotNull ebExternalSyntheticLambda0 ebexternalsyntheticlambda0, @NotNull calculateMaxTextSize calculatemaxtextsize) {
        Intrinsics.checkNotNullParameter(ebexternalsyntheticlambda0, "");
        Intrinsics.checkNotNullParameter(calculatemaxtextsize, "");
        this.onNavigationEvent = calculatemaxtextsize;
        this.onWarmupCompleted = new HashMap<>();
        this.IAuthTabCallback = new HashMap<>();
        this.onExtraCallback = new HashMap<>();
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        this.onExtraCallbackWithResult = (AppSetIdAndScope1) ebExternalSyntheticLambda0.IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -489761568, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{ebexternalsyntheticlambda0}, 489761569, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    private final ALCFaceValidation onExtraCallback(String str, JsonObject jsonObject) {
        Object obj;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted;
        int i = 2 % 2;
        Object obj2 = null;
        try {
            Result.Companion companion = Result.Companion;
            ALCFaceValidation.onExtraCallbackWithResult onextracallbackwithresult = ALCFaceValidation.Companion;
            setText settext = new setText(jsonObject);
            Object[] objArr = {this.onNavigationEvent, str, false, 2, null};
            int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            drawTextBox drawtextbox = (drawTextBox) calculateMaxTextSize.onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 2137502650, objArr, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -2137502650, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback);
            if (drawtextbox != null) {
                int i2 = IAuthTabCallbackDefault + 79;
                asBinder = i2 % 128;
                if (i2 % 2 == 0) {
                    drawtextbox.onWarmupCompleted(str);
                    throw null;
                }
                aLCFaceValidationOnWarmupCompleted = drawtextbox.onWarmupCompleted(str);
                if (aLCFaceValidationOnWarmupCompleted == null) {
                    aLCFaceValidationOnWarmupCompleted = ALCFaceValidation.WITHOUT_CONTENTS;
                }
                obj = Result.constructor-impl(onextracallbackwithresult.onExtraCallbackWithResult(settext, aLCFaceValidationOnWarmupCompleted));
            } else {
                aLCFaceValidationOnWarmupCompleted = ALCFaceValidation.WITHOUT_CONTENTS;
                obj = Result.constructor-impl(onextracallbackwithresult.onExtraCallbackWithResult(settext, aLCFaceValidationOnWarmupCompleted));
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            int i3 = IAuthTabCallbackDefault + 71;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        } else {
            obj2 = obj;
        }
        return (ALCFaceValidation) obj2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 24 - TextUtils.indexOf("", ""), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onTransact ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), Color.rgb(0, 0, 0) + 16777275, 6382 - TextUtils.lastIndexOf("", '0'), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i4 = $10 + 83;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            try {
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 59, 6384 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i6 = $10 + 89;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        String str = new String(cArr2);
        int i8 = $10 + 93;
        $11 = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x039d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x039f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onExtraCallbackWithResult(@Nullable TossReactContentOwner tossReactContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull Callback callback, @NotNull Callback callback2, @Nullable Map<String, ? extends Object> map, @Nullable r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos) throws Throwable {
        String strName;
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
        Object obj;
        Object obj2;
        int i;
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(callback, "");
        Intrinsics.checkNotNullParameter(callback2, "");
        r8lambda_TGyvW_ZWE2FNGas5LTboepDiQ r8lambda_tgyvw_zwe2fngas5ltboepdiq = (drawTextBox) calculateMaxTextSize.onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 2137502650, new Object[]{this.onNavigationEvent, str, false, 2, null}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -2137502650, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback());
        if (r8lambda_tgyvw_zwe2fngas5ltboepdiq == null) {
            int i3 = asBinder + 37;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a(new char[]{6666, 33666, 10500, 54932}, 39302 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "rn");
            Object[] objArr2 = new Object[1];
            a(new char[]{6672, 29318, 52001, 9168}, 26777 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
            Map mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), str), getWrite.IAuthTabCallback("moduleName", r8lambdadtqrzfihm2ghoddvkfg5vm2yos != null ? r8lambdadtqrzfihm2ghoddvkfg5vm2yos.onExtraCallbackWithResult() : null)});
            if (ALCFaceValidation.ALL == onExtraCallback(str, jsonObject)) {
                JsonObject jsonObject2 = jsonObject.get("params");
                JsonObject jsonObject3 = jsonObject2 instanceof JsonObject ? jsonObject2 : null;
                if (jsonObject3 != null) {
                    mapIAuthTabCallback.put("params", jsonObject3.toString());
                }
            }
            Unit unit = Unit.INSTANCE;
            Object[] objArr3 = new Object[1];
            a(new char[]{6687, 20049, 45744, 59137, 19312, 49100, 57376, 21632, 47331, 60790, 20902, 47620, 61054, 21234, 34602, 60288, 24571, 32863, 62644}, AndroidCharacter.getMirror('0') + 21551, objArr3);
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, ((String) objArr3[0]).intern(), (String) null, mapIAuthTabCallback, (String) null, false, (String) null, 58, (Object) null);
            Objects.toString(jsonObject);
            return false;
        }
        if (tossReactContentOwner == null) {
            Objects.toString(jsonObject);
            return false;
        }
        if (r8lambdadtqrzfihm2ghoddvkfg5vm2yos == null) {
            Objects.toString(jsonObject);
            return false;
        }
        FragmentActivity activity = tossReactContentOwner.getActivity();
        if ((activity == null || !activity.isFinishing()) && r8lambda_tgyvw_zwe2fngas5ltboepdiq.onNavigationEvent()) {
            Object[] objArr4 = new Object[1];
            a(new char[]{6672, 29318, 52001, 9168}, TextUtils.lastIndexOf("", '0') + 26778, objArr4);
            Bundle bundleOnNavigationEvent = RotationProvider1.onNavigationEvent(new Pair[]{getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), str), getWrite.IAuthTabCallback("successCallbackKey", Integer.valueOf(callback.hashCode())), getWrite.IAuthTabCallback("errorCallbackKey", Integer.valueOf(callback2.hashCode()))});
            this.onWarmupCompleted.put(Integer.valueOf(callback.hashCode()), callback);
            this.onWarmupCompleted.put(Integer.valueOf(callback2.hashCode()), callback2);
            if (map != null) {
                int i5 = asBinder + 115;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    int i7 = asBinder + 87;
                    IAuthTabCallbackDefault = i7 % 128;
                    int i8 = i7 % 2;
                    bundleOnNavigationEvent.putString(entry.getKey(), entry.getValue().toString());
                }
            }
            Object[] objArr5 = new Object[1];
            a(new char[]{6682, 25266, 60240, 28696}, (ViewConfiguration.getPressedStateDuration() >> 16) + 30893, objArr5);
            bundleOnNavigationEvent.putString(((String) objArr5[0]).intern(), getEmbedViewManager.onNavigationEvent(jsonObject));
            tossReactContentOwner.putInstanceStateData(-1, bundleOnNavigationEvent);
        }
        if (!onExtraCallback(str, r8lambda_tgyvw_zwe2fngas5ltboepdiq, r8lambdadtqrzfihm2ghoddvkfg5vm2yos)) {
            return false;
        }
        String strOnWarmupCompleted = r8lambdadtqrzfihm2ghoddvkfg5vm2yos.onWarmupCompleted();
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1906579071);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), 34 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 7094 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1088743663, false, "Companion", (Class[]) null);
        }
        Object obj3 = ((Field) objOnExtraCallback).get(null);
        try {
            Object[] objArr6 = {strOnWarmupCompleted};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1421773909);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 63468), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 51, (ViewConfiguration.getEdgeSlop() >> 16) + 7128, -1711174341, false, "IAuthTabCallback", new Class[]{String.class});
            }
            Object objInvoke = ((Method) objOnExtraCallback2).invoke(obj3, objArr6);
            if (objInvoke == null) {
                strName = null;
            } else {
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(174793451);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 34 - (Process.myPid() >> 22), 7094 - TextUtils.indexOf("", ""), 992730235, false, "getAffiliate", new Class[0]);
                }
                Enum r2 = (Enum) ((Method) objOnExtraCallback3).invoke(objInvoke, null);
                if (r2 != null) {
                    strName = r2.name();
                }
            }
            jsonObject.addProperty("__TossAffiliate__", strName);
            ReactContext reactContextIEngagementSignalsCallback = tossReactContentOwner.IEngagementSignalsCallback();
            if (reactContextIEngagementSignalsCallback != null) {
                int i9 = IAuthTabCallbackDefault + 17;
                asBinder = i9 % 128;
                if (i9 % 2 == 0) {
                    rCTDeviceEventEmitter2 = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactContextIEngagementSignalsCallback.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
                    int i10 = 82 / 0;
                } else {
                    rCTDeviceEventEmitter2 = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactContextIEngagementSignalsCallback.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
                }
                rCTDeviceEventEmitter = rCTDeviceEventEmitter2;
            } else {
                rCTDeviceEventEmitter = null;
            }
            if (onExtraCallback(str, (drawTextBox) r8lambda_tgyvw_zwe2fngas5ltboepdiq)) {
                setOnOutOfMemeryErrorCallback.onNavigationEvent(new AdControlButtonb(str, jsonObject, callback, callback2, map, rCTDeviceEventEmitter, r8lambda_tgyvw_zwe2fngas5ltboepdiq), "RN bundle cache is owned by the main process.", "RN_REMOTE_UNSUPPORTED_BRIDGE", (Map) null, 4, (Object) null);
                return true;
            }
            if (r8lambda_tgyvw_zwe2fngas5ltboepdiq instanceof ALCFaceQuality) {
                try {
                    obj = "messageName";
                    obj2 = "messageData";
                    try {
                        ((ALCFaceQuality) r8lambda_tgyvw_zwe2fngas5ltboepdiq).onExtraCallbackWithResult(tossReactContentOwner, str, jsonObject, new AdControlButtonb(str, jsonObject, callback, callback2, map, rCTDeviceEventEmitter, r8lambda_tgyvw_zwe2fngas5ltboepdiq));
                    } catch (Throwable th) {
                        th = th;
                        ALCDetectionMode.IAuthTabCallback(th, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(obj, str), getWrite.IAuthTabCallback(obj2, jsonObject)}));
                        i = IAuthTabCallbackDefault + 119;
                        asBinder = i % 128;
                        if (i % 2 == 0) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obj = "messageName";
                    obj2 = "messageData";
                }
            } else {
                if (!(r8lambda_tgyvw_zwe2fngas5ltboepdiq instanceof r8lambda_TGyvW_ZWE2FNGas5LTboepDiQ)) {
                    ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "ReactNativeMessageHandlerManager", "skipped AbsMessageHandler", access8100.onNavigationEvent(getWrite.IAuthTabCallback("handlerName", str)), (String) null, false, (String) null, 56, (Object) null);
                    return false;
                }
                try {
                    r8lambda_tgyvw_zwe2fngas5ltboepdiq.IAuthTabCallback(tossReactContentOwner, str, jsonObject, new AdControlButtonb(str, jsonObject, callback, callback2, map, rCTDeviceEventEmitter, r8lambda_tgyvw_zwe2fngas5ltboepdiq));
                } catch (Throwable th3) {
                    ALCDetectionMode.IAuthTabCallback(th3, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("messageName", str), getWrite.IAuthTabCallback("messageData", jsonObject)}));
                }
            }
            i = IAuthTabCallbackDefault + 119;
            asBinder = i % 128;
            if (i % 2 == 0) {
                return true;
            }
            throw null;
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x03e2, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x03e3, code lost:
    
        o.ConvertFloatArrayToByteArray.onExtraCallback(o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "ReactNativeMessageHandlerManager", "skipped AbsMessageHandler", o.access8100.onNavigationEvent(o.getWrite.IAuthTabCallback("handlerName", r30)), (java.lang.String) null, false, (java.lang.String) null, 56, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03fd, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x03fe, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x03ff, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0403, code lost:
    
        if (r2 != null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0405, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0406, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x00d6, code lost:
    
        if (r35 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d8, code lost:
    
        r2 = r35.onExtraCallbackWithResult();
        r4 = o.r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE.asBinder + 121;
        o.r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE.IAuthTabCallbackDefault = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e6, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e7, code lost:
    
        r0 = o.access8100.IAuthTabCallback(new kotlin.Pair[]{r0, r3, o.getWrite.IAuthTabCallback("moduleName", r2)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0100, code lost:
    
        if (o.ALCFaceValidation.ALL != onExtraCallback(r30, r31)) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0102, code lost:
    
        r2 = o.r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE.IAuthTabCallbackDefault + 59;
        o.r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE.asBinder = r2 % 128;
        r2 = r2 % 2;
        r3 = r31.get("params");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0113, code lost:
    
        if ((r3 instanceof com.google.gson.JsonObject) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0115, code lost:
    
        r8 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0118, code lost:
    
        if (r8 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x011a, code lost:
    
        r0.put("params", r8.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0121, code lost:
    
        r2 = kotlin.Unit.INSTANCE;
        r4 = new java.lang.Object[1];
        a(new char[]{6687, 20049, 45744, 59137, 19312, 49100, 57376, 21632, 47331, 60790, 20902, 47620, 61054, 21234, 34602, 60288, 24571, 32863, 62644}, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 21599, r4);
        o.ConvertFloatArrayToByteArray.onExtraCallback(r17, ((java.lang.String) r4[0]).intern(), (java.lang.String) null, r0, (java.lang.String) null, false, (java.lang.String) null, 58, (java.lang.Object) null);
        java.util.Objects.toString(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0155, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0156, code lost:
    
        r15 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0157, code lost:
    
        if (r29 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0159, code lost:
    
        java.util.Objects.toString(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x015c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x015d, code lost:
    
        if (r35 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x015f, code lost:
    
        java.util.Objects.toString(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0162, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0163, code lost:
    
        r3 = r29.getActivity();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0167, code lost:
    
        if (r3 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x016d, code lost:
    
        if (r3.isFinishing() != true) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0175, code lost:
    
        if (r15.onNavigationEvent() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0177, code lost:
    
        r4 = new java.lang.Object[1];
        a(new char[]{6672, 29318, 52001, 9168}, 26776 - android.text.TextUtils.lastIndexOf("", '0'), r4);
        r3 = o.RotationProvider1.onNavigationEvent(new kotlin.Pair[]{o.getWrite.IAuthTabCallback(((java.lang.String) r4[0]).intern(), r30), o.getWrite.IAuthTabCallback("successCallbackKey", java.lang.Integer.valueOf(r32.hashCode())), o.getWrite.IAuthTabCallback("errorCallbackKey", java.lang.Integer.valueOf(r33.hashCode()))});
        r28.IAuthTabCallback.put(java.lang.Integer.valueOf(r32.hashCode()), r32);
        r28.IAuthTabCallback.put(java.lang.Integer.valueOf(r33.hashCode()), r33);
        r28.onExtraCallback.put(java.lang.Integer.valueOf(r32.hashCode()), r36);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01e7, code lost:
    
        if (r34 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01e9, code lost:
    
        r4 = r34.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01f5, code lost:
    
        if (r4.hasNext() == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01f7, code lost:
    
        r7 = r4.next();
        r3.putString(r7.getKey(), r7.getValue().toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0212, code lost:
    
        r12 = new java.lang.Object[1];
        a(new char[]{6682, 25266, 60240, 28696}, 30893 - android.text.TextUtils.indexOf("", ""), r12);
        r3.putString(((java.lang.String) r12[0]).intern(), o.getEmbedViewManager.onNavigationEvent(r31));
        r29.putInstanceStateData(-1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x023d, code lost:
    
        if (onExtraCallback(r30, r15, r35) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x023f, code lost:
    
        r0 = o.r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE.asBinder + 83;
        o.r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE.IAuthTabCallbackDefault = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0249, code lost:
    
        if ((r0 % 2) == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x024b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x024c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x024d, code lost:
    
        r2 = r35.onWarmupCompleted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0251, code lost:
    
        if (r2 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0253, code lost:
    
        r2 = o.r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE.IAuthTabCallbackDefault + 91;
        o.r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE.asBinder = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x025d, code lost:
    
        if ((r2 % 2) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x025f, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0262, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0263, code lost:
    
        r3 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1906579071);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x026a, code lost:
    
        if (r3 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x026c, code lost:
    
        r3 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) android.text.TextUtils.getCapsMode("", 0, 0), 34 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 7094 - android.graphics.Color.argb(0, 0, 0, 0), -1088743663, false, "Companion", (java.lang.Class[]) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0058, code lost:
    
        if (r3 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0290, code lost:
    
        r3 = ((java.lang.reflect.Field) r3).get(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0297, code lost:
    
        r2 = new java.lang.Object[]{r2};
        r4 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1421773909);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02a2, code lost:
    
        if (r4 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02a4, code lost:
    
        r4 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (android.view.View.MeasureSpec.getSize(0) + 63468), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 52, 7128 - android.view.View.resolveSizeAndState(0, 0, 0), -1711174341, false, "IAuthTabCallback", new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02d2, code lost:
    
        r2 = ((java.lang.reflect.Method) r4).invoke(r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02d8, code lost:
    
        if (r2 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02da, code lost:
    
        r3 = o.r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE.asBinder + 107;
        o.r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE.IAuthTabCallbackDefault = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02e7, code lost:
    
        r3 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(174793451);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02eb, code lost:
    
        if (r3 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02ed, code lost:
    
        r3 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 34, android.view.Gravity.getAbsoluteGravity(0, 0) + 7094, 992730235, false, "getAffiliate", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0313, code lost:
    
        r2 = (java.lang.Enum) ((java.lang.reflect.Method) r3).invoke(r2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x031c, code lost:
    
        if (r2 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x031e, code lost:
    
        r3 = o.r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE.IAuthTabCallbackDefault + 15;
        o.r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE.asBinder = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0328, code lost:
    
        if ((r3 % 2) == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x032a, code lost:
    
        r2 = r2.name();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x032f, code lost:
    
        r2.name();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0333, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0334, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0335, code lost:
    
        r31.addProperty("__TossAffiliate__", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x033e, code lost:
    
        if (onExtraCallback(r30, r15) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0340, code lost:
    
        o.setOnOutOfMemeryErrorCallback.onNavigationEvent(new o.r8lambdaRPidNL5dEclNOmpkvRee5e2ezbc(r30, r31, r32, r33, r34, r36, r15), "RN bundle cache is owned by the main process.", "RN_REMOTE_UNSUPPORTED_BRIDGE", (java.util.Map) null, 4, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0369, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0370, code lost:
    
        if ((r15 instanceof o.ALCFaceQuality) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0374, code lost:
    
        r14 = "messageName";
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0384, code lost:
    
        ((o.ALCFaceQuality) r15).onExtraCallbackWithResult(r29, r30, r31, new o.r8lambdaRPidNL5dEclNOmpkvRee5e2ezbc(r30, r31, r32, r33, r34, r36, r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x038d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0091, code lost:
    
        if (r3 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x038f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0390, code lost:
    
        r14 = "messageName";
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0391, code lost:
    
        o.ALCDetectionMode.IAuthTabCallback(r0, o.access8100.onWarmupCompleted(new kotlin.Pair[]{o.getWrite.IAuthTabCallback(r14, r30), o.getWrite.IAuthTabCallback("messageData", r31)}));
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x03a9, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03ae, code lost:
    
        if ((r15 instanceof o.r8lambda_TGyvW_ZWE2FNGas5LTboepDiQ) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x03b0, code lost:
    
        ((o.r8lambda_TGyvW_ZWE2FNGas5LTboepDiQ) r15).IAuthTabCallback(r29, r30, r31, new o.r8lambdaRPidNL5dEclNOmpkvRee5e2ezbc(r30, r31, r32, r33, r34, r36, r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03c9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03ca, code lost:
    
        o.ALCDetectionMode.IAuthTabCallback(r0, o.access8100.onWarmupCompleted(new kotlin.Pair[]{o.getWrite.IAuthTabCallback("messageName", r30), o.getWrite.IAuthTabCallback("messageData", r31)}));
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0093, code lost:
    
        r17 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        r3 = new java.lang.Object[1];
        a(new char[]{6666, 33666, 10500, 54932}, 39301 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), r3);
        r0 = o.getWrite.IAuthTabCallback(((java.lang.String) r3[0]).intern(), "rn");
        r5 = new java.lang.Object[1];
        a(new char[]{6672, 29318, 52001, 9168}, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26777, r5);
        r3 = o.getWrite.IAuthTabCallback(((java.lang.String) r5[0]).intern(), r30);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onWarmupCompleted(@Nullable TossReactContentOwner tossReactContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull Function1<? super Object[], Unit> function1, @NotNull Function1<? super Pair<String, String>, Unit> function12, @Nullable Map<String, ? extends Object> map, @Nullable r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos, @Nullable Function2<? super String, ? super Map<?, ?>, Unit> function2) throws Throwable {
        drawTextBox drawtextbox;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        asBinder = i2 % 128;
        JsonObject jsonObject2 = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonObject, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            drawtextbox = (drawTextBox) calculateMaxTextSize.onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 2137502650, new Object[]{this.onNavigationEvent, str, true, 4, null}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -2137502650, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback());
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonObject, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            drawtextbox = (drawTextBox) calculateMaxTextSize.onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 2137502650, new Object[]{this.onNavigationEvent, str, false, 2, null}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -2137502650, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback());
        }
    }

    private final boolean onExtraCallback(String str, drawTextBox drawtextbox) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean z = RnProcessRuntime.onWarmupCompleted.IAuthTabCallback() && (drawtextbox instanceof hExternalSyntheticLambda0);
        if (z) {
            RnRemoteProcessGuardRecorder.IAuthTabCallback.onExtraCallback("TossReactMessageHandlerManager." + str, access8100.onNavigationEvent(getWrite.IAuthTabCallback("handler", drawtextbox.getClass().getName())));
            int i4 = asBinder + 107;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r2 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (r3.onExtraCallbackWithResult(r23.onWarmupCompleted()) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        r2 = o.getWrite.IAuthTabCallback("remotePolicy", java.lang.Boolean.TRUE);
        r8 = new java.lang.Object[1];
        a(new char[]{6684, 14723, 23817, 28855, 37925, 43984, 53098, 58102, 1643, 23068}, 9103 - android.text.TextUtils.indexOf("", "", 0, 0), r8);
        r14 = o.access8100.onWarmupCompleted(new kotlin.Pair[]{r2, o.getWrite.IAuthTabCallback(((java.lang.String) r8[0]).intern(), r21)});
        r11 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        r1 = r23.onExtraCallbackWithResult();
        r1 = new java.lang.Object[1];
        a(new char[]{6687, 54919, 33564, 32647, 10280, 58554, 53548, 36262, 32339, 10992, 59222, 54264, 35967, 30948, 13684, 58908, 53937, 36631, 31667, 13369, 57507, 56608, 35265, 31342, 14023, 58236, 57335, 34920, 17649, 12680, 57903, 56991, 35639, 18360, 12320, 60580, 55630, 38362, 17991, 13007}, 52361 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), r1);
        o.ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult(), -154777398, new java.lang.Object[]{r11, ((java.lang.String) r1[0]).intern(), r21 + " from " + r1, r14, null, false, null, 56, null}, com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult(), com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult(), com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e1, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean onExtraCallback(String str, drawTextBox drawtextbox, r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallbackOnExtraCallback = drawtextbox.onExtraCallback();
        if (iAuthTabCallbackOnExtraCallback instanceof onOutOfMemory.onNavigationEvent) {
            int i4 = IAuthTabCallbackDefault + 47;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        ALCLiveness aLCLivenessOnWarmupCompleted = onWarmupCompleted(str);
        if (aLCLivenessOnWarmupCompleted != null) {
            int i6 = asBinder + 21;
            IAuthTabCallbackDefault = i6 % 128;
            if (i6 % 2 != 0) {
                boolean zOnExtraCallbackWithResult = aLCLivenessOnWarmupCompleted.onExtraCallbackWithResult(r8lambdadtqrzfihm2ghoddvkfg5vm2yos.onWarmupCompleted());
                int i7 = 81 / 0;
            }
        } else {
            Intrinsics.checkNotNull(iAuthTabCallbackOnExtraCallback, "");
            if (!((Boolean) iAuthTabCallbackOnExtraCallback.onExtraCallback().invoke(r8lambdadtqrzfihm2ghoddvkfg5vm2yos.onWarmupCompleted(), str)).booleanValue()) {
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("remotePolicy", Boolean.TRUE);
                Object[] objArr = new Object[1];
                a(new char[]{6684, 14723, 23817, 28855, 37925, 43984, 53098, 58102, 1643, 23068}, (Process.myPid() >> 22) + 9103, objArr);
                Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str)});
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                String strOnExtraCallbackWithResult = r8lambdadtqrzfihm2ghoddvkfg5vm2yos.onExtraCallbackWithResult();
                Object[] objArr2 = new Object[1];
                a(new char[]{6687, 40217, 5152, 36697, 1616, 47460, 12432, 43960, 8867, 42478, 23801, 55264, 20233, 50736, 31055, 61524, 27473, 57999, 25993, 7332, 38878, 3836, 33264, 14598, 45113, 11055}, 34631 - AndroidCharacter.getMirror('0'), objArr2);
                ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray, ((String) objArr2[0]).intern(), str + " from " + strOnExtraCallbackWithResult, mapOnWarmupCompleted, null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                return false;
            }
        }
        return true;
    }

    public final boolean IAuthTabCallback(@NotNull TossReactContentOwner tossReactContentOwner, int i, int i2, @Nullable Intent intent) throws Throwable {
        Bundle bundle;
        Bundle bundle2;
        Object obj;
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
        String str;
        Object obj2;
        String str2;
        Object obj3;
        String str3;
        String string;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(tossReactContentOwner, "");
        Bundle extras = intent != null ? intent.getExtras() : null;
        Parcelable instanceStateData = tossReactContentOwner.getInstanceStateData(-1);
        if (instanceStateData instanceof Bundle) {
            bundle = (Bundle) instanceStateData;
            int i4 = IAuthTabCallbackDefault + 31;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        } else {
            bundle = null;
        }
        if (bundle != null) {
            int i6 = asBinder + 79;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{6672, 29318, 52001, 9168}, KeyEvent.getDeadChar(0, 0) + 26777, objArr);
            String string2 = bundle.getString(((String) objArr[0]).intern());
            if (string2 != null) {
                int i8 = bundle.getInt("successCallbackKey");
                int i9 = bundle.getInt("errorCallbackKey");
                Parcelable instanceStateData2 = tossReactContentOwner.getInstanceStateData(-2);
                if (instanceStateData2 instanceof Bundle) {
                    bundle2 = (Bundle) instanceStateData2;
                } else {
                    int i10 = asBinder + 89;
                    IAuthTabCallbackDefault = i10 % 128;
                    int i11 = i10 % 2;
                    bundle2 = null;
                }
                boolean z = bundle2 != null ? bundle2.getBoolean("shouldReceiveExtraResults", false) : false;
                Callback callback = this.onWarmupCompleted.get(Integer.valueOf(i8));
                Callback callback2 = this.onWarmupCompleted.get(Integer.valueOf(i9));
                Object obj4 = this.IAuthTabCallback.get(Integer.valueOf(i8));
                Object obj5 = this.IAuthTabCallback.get(Integer.valueOf(i9));
                Function2<String, Map<?, ?>, Unit> function2 = this.onExtraCallback.get(Integer.valueOf(i8));
                if (callback == null && obj4 == null) {
                    return false;
                }
                if (!z) {
                    this.onWarmupCompleted.remove(Integer.valueOf(i8));
                    this.onWarmupCompleted.remove(Integer.valueOf(i9));
                    this.IAuthTabCallback.remove(Integer.valueOf(i8));
                    this.IAuthTabCallback.remove(Integer.valueOf(i9));
                    this.onExtraCallback.remove(Integer.valueOf(i8));
                    int i12 = asBinder + 41;
                    IAuthTabCallbackDefault = i12 % 128;
                    int i13 = i12 % 2;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Set<String> setKeySet = bundle.keySet();
                if (setKeySet != null) {
                    int i14 = IAuthTabCallbackDefault + 19;
                    asBinder = i14 % 128;
                    int i15 = i14 % 2;
                    Iterator it = setKeySet.iterator();
                    while (it.hasNext()) {
                        int i16 = asBinder + 39;
                        IAuthTabCallbackDefault = i16 % 128;
                        int i17 = i16 % 2;
                        String str4 = (String) it.next();
                        Iterator it2 = it;
                        Object obj6 = obj5;
                        Object[] objArr2 = new Object[1];
                        a(new char[]{6672, 29318, 52001, 9168}, 26777 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
                        String strIntern = ((String) objArr2[0]).intern();
                        Object obj7 = obj4;
                        a(new char[]{6682, 25266, 60240, 28696}, 30892 - ((byte) KeyEvent.getModifierMetaStateMask()), new Object[1]);
                        if ((!CollectionsKt.listOf(new String[]{strIntern, "successCallbackKey", "errorCallbackKey", ((String) r10[0]).intern()}).contains(str4)) && (string = bundle.getString(str4)) != null) {
                            linkedHashMap.put(str4, string);
                        }
                        obj4 = obj7;
                        it = it2;
                        obj5 = obj6;
                    }
                }
                Object obj8 = obj4;
                Object obj9 = obj5;
                try {
                    Result.Companion companion = Result.Companion;
                    Object[] objArr3 = new Object[1];
                    a(new char[]{6682, 25266, 60240, 28696}, ((Process.getThreadPriority(0) + 20) >> 6) + 30893, objArr3);
                    obj = Result.constructor-impl(JsonParser.parseString(bundle.getString(((String) objArr3[0]).intern())).getAsJsonObject());
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (!(!Result.onExtraCallback(obj))) {
                    obj = null;
                }
                JsonObject jsonObject = (JsonObject) obj;
                if (jsonObject == null) {
                    return false;
                }
                r8lambda_TGyvW_ZWE2FNGas5LTboepDiQ r8lambda_tgyvw_zwe2fngas5ltboepdiq = (drawTextBox) calculateMaxTextSize.onWarmupCompleted(WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 2137502650, new Object[]{this.onNavigationEvent, string2, false, 2, null}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -2137502650, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback());
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr4 = new Object[1];
                a(new char[]{6672, 29318, 52001, 9168}, TextUtils.lastIndexOf("", '0', 0, 0) + 26778, objArr4);
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), string2);
                Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("reqCode", Integer.valueOf(i));
                Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("resultCode", Integer.valueOf(i2));
                Object[] objArr5 = new Object[1];
                a(new char[]{6682, 25266, 60240, 28696}, KeyEvent.keyCodeFromString("") + 30893, objArr5);
                ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray, "TossReactMessageHandlerManager", "onActivityResultReceive", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), jsonObject), getWrite.IAuthTabCallback("resultData", extras)}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                if (r8lambda_tgyvw_zwe2fngas5ltboepdiq == null) {
                    return false;
                }
                ReactContext reactContextIEngagementSignalsCallback = tossReactContentOwner.IEngagementSignalsCallback();
                if (reactContextIEngagementSignalsCallback != null) {
                    int i18 = asBinder + 23;
                    IAuthTabCallbackDefault = i18 % 128;
                    int i19 = i18 % 2;
                    rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactContextIEngagementSignalsCallback.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
                } else {
                    rCTDeviceEventEmitter = null;
                }
                Objects.toString(extras);
                FragmentActivity activity = tossReactContentOwner.getActivity();
                if (activity != null && activity.isFinishing()) {
                    return true;
                }
                if (callback == null) {
                    String str5 = string2;
                    Function1 function1 = TypeIntrinsics.isFunctionOfArity(obj8, 1) ? (Function1) obj8 : null;
                    if (function1 == null) {
                        return false;
                    }
                    Function1 function12 = TypeIntrinsics.isFunctionOfArity(obj9, 1) ? (Function1) obj9 : null;
                    if (function12 == null) {
                        return false;
                    }
                    if (r8lambda_tgyvw_zwe2fngas5ltboepdiq instanceof ALCFaceQuality) {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            r8lambdaRPidNL5dEclNOmpkvRee5e2ezbc r8lambdarpidnl5declnompkvree5e2ezbc = new r8lambdaRPidNL5dEclNOmpkvRee5e2ezbc(str5, jsonObject, function1, function12, linkedHashMap, function2, r8lambda_tgyvw_zwe2fngas5ltboepdiq);
                            str5 = str5;
                            ((ALCFaceQuality) r8lambda_tgyvw_zwe2fngas5ltboepdiq).onWarmupCompleted(tossReactContentOwner, str5, jsonObject, r8lambdarpidnl5declnompkvree5e2ezbc, i, i2, intent);
                        } catch (Throwable th3) {
                            th = th3;
                            str5 = str5;
                            ALCDetectionMode.IAuthTabCallback(th, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("messageName", str5), getWrite.IAuthTabCallback("messageData", jsonObject)}));
                            return true;
                        }
                    } else if (r8lambda_tgyvw_zwe2fngas5ltboepdiq instanceof r8lambda_TGyvW_ZWE2FNGas5LTboepDiQ) {
                        try {
                            try {
                                str = str5;
                                try {
                                    r8lambda_tgyvw_zwe2fngas5ltboepdiq.onNavigationEvent(tossReactContentOwner, str5, jsonObject, new r8lambdaRPidNL5dEclNOmpkvRee5e2ezbc(str5, jsonObject, function1, function12, linkedHashMap, function2, r8lambda_tgyvw_zwe2fngas5ltboepdiq), i, i2, intent);
                                } catch (Throwable th4) {
                                    th = th4;
                                    ALCDetectionMode.IAuthTabCallback(th, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("messageName", str), getWrite.IAuthTabCallback("messageData", jsonObject)}));
                                    return true;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                str = str5;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            str = str5;
                        }
                    }
                } else {
                    if (callback2 == null) {
                        int i20 = IAuthTabCallbackDefault + 35;
                        asBinder = i20 % 128;
                        int i21 = i20 % 2;
                        return false;
                    }
                    if (r8lambda_tgyvw_zwe2fngas5ltboepdiq instanceof ALCFaceQuality) {
                        try {
                            obj2 = "messageName";
                            str2 = string2;
                            try {
                                ((ALCFaceQuality) r8lambda_tgyvw_zwe2fngas5ltboepdiq).onWarmupCompleted(tossReactContentOwner, string2, jsonObject, new AdControlButtonb(string2, jsonObject, callback, callback2, linkedHashMap, rCTDeviceEventEmitter, null, 64, null), i, i2, intent);
                            } catch (Throwable th7) {
                                th = th7;
                                ALCDetectionMode.IAuthTabCallback(th, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(obj2, str2), getWrite.IAuthTabCallback("messageData", jsonObject)}));
                                return true;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            obj2 = "messageName";
                            str2 = string2;
                        }
                    } else if (r8lambda_tgyvw_zwe2fngas5ltboepdiq instanceof r8lambda_TGyvW_ZWE2FNGas5LTboepDiQ) {
                        try {
                            try {
                                AdControlButtonb adControlButtonb = new AdControlButtonb(string2, jsonObject, callback, callback2, linkedHashMap, rCTDeviceEventEmitter, null, 64, null);
                                obj3 = "messageName";
                                str3 = string2;
                                try {
                                    r8lambda_tgyvw_zwe2fngas5ltboepdiq.onNavigationEvent(tossReactContentOwner, string2, jsonObject, adControlButtonb, i, i2, intent);
                                } catch (Throwable th9) {
                                    th = th9;
                                    ALCDetectionMode.IAuthTabCallback(th, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(obj3, str3), getWrite.IAuthTabCallback("messageData", jsonObject)}));
                                    return true;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                obj3 = "messageName";
                                str3 = string2;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            obj3 = "messageName";
                            str3 = string2;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final ALCLiveness onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ALCLiveness aLCLivenessOnExtraCallback = AppState.Companion.onExtraCallbackWithResult().onExtraCallbackWithResult().onExtraCallback(str);
        int i4 = asBinder + 53;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return aLCLivenessOnExtraCallback;
        }
        throw null;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    static void IAuthTabCallback() {
        onTransact = -6956129307488444599L;
    }
}
