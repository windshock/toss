package o;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AudioRestrictionControllerImplExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.ImageViewUtilsExternalSyntheticLambda1;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RequestMonitorRequestCompleteListenerExternalSyntheticLambda0;
import o.SessionProcessorCaptureCallback;
import o.containsIgnoreCase;
import o.readFully;
import o.removeObserverLocked;
import o.setOrientationDegrees;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class containsIgnoreCase {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        appendQueryParameters appendqueryparameters = (appendQueryParameters) objArr[0];
        RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0 = (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            asBinder(appendqueryparameters, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            obj.hashCode();
            throw null;
        }
        Unit unitAsBinder = asBinder(appendqueryparameters, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unitAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(appendQueryParameters appendqueryparameters, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(appendqueryparameters, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 101;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit IAuthTabCallback(appendQueryParameters appendqueryparameters, getBacktraceNote getbacktracenote, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(appendqueryparameters, getbacktracenote, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ImageViewUtilsExternalSyntheticLambda1 imageViewUtilsExternalSyntheticLambda1 = (ImageViewUtilsExternalSyntheticLambda1) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        JsonUtils jsonUtils = (JsonUtils) objArr[2];
        Map map = (Map) objArr[3];
        RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0 = (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(imageViewUtilsExternalSyntheticLambda1, zBooleanValue, jsonUtils, map, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        int i3 = 33 / 0;
        return IAuthTabCallback(imageViewUtilsExternalSyntheticLambda1, zBooleanValue, jsonUtils, map, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
    }

    public static /* synthetic */ Unit onExtraCallback(Function2 function2, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function2, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(appendQueryParameters appendqueryparameters, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -15381387, 15381391, new Object[]{appendqueryparameters, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)});
        int i4 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i5;
        int i8 = i7 | i6;
        int i9 = ~i8;
        int i10 = ~i;
        int i11 = i9 | (~(i10 | i6));
        int i12 = i8 | i10;
        int i13 = (~(i | i6)) | (~(i7 | (~i6)));
        int i14 = i6 + i5 + i3 + ((-1311665080) * i4) + (1761575915 * i2);
        int i15 = i14 * i14;
        int i16 = ((i6 * 1226044109) - 1701849991) + (i5 * 1226043089) + (i11 * 510) + (i12 * (-510)) + (i13 * 510) + (1226043599 * i3) + ((-858626504) * i4) + (1069087493 * i2) + (i15 * 1627848704);
        switch (((-2073022045) * i6) + 412680192 + (1917570655 * i5) + (i11 * (-1995296350)) + (1995296350 * i12) + ((-1995296350) * i13) + ((-77725696) * i3) + (175112192 * i4) + ((-649461760) * i2) + (1783169024 * i15) + (i16 * i16 * 739704832)) {
            case 1:
                readFully readfully = (readFully) objArr[0];
                setOrientationDegrees setorientationdegrees = (setOrientationDegrees) objArr[1];
                int i17 = 2 % 2;
                int i18 = onExtraCallbackWithResult + 59;
                onNavigationEvent = i18 % 128;
                int i19 = i18 % 2;
                Intrinsics.checkNotNullParameter(setorientationdegrees, "");
                setOrientationDegrees.onExtraCallback(setorientationdegrees, readfully, 0L, 0L, 0.0f, (hasMoreElements) null, (seek) null, 0, 126, (Object) null);
                Unit unit = Unit.INSTANCE;
                int i20 = onExtraCallbackWithResult + 3;
                onNavigationEvent = i20 % 128;
                int i21 = i20 % 2;
                return unit;
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                appendQueryParameters appendqueryparameters = (appendQueryParameters) objArr[0];
                getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[1];
                Function2 function2 = (Function2) objArr[2];
                ImageViewUtilsExternalSyntheticLambda1 imageViewUtilsExternalSyntheticLambda1 = (ImageViewUtilsExternalSyntheticLambda1) objArr[3];
                boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
                JsonUtils jsonUtils = (JsonUtils) objArr[5];
                Map map = (Map) objArr[6];
                AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0 = (AudioRestrictionControllerImplExternalSyntheticLambda0) objArr[7];
                int i22 = 2 % 2;
                int i23 = onExtraCallbackWithResult + 5;
                onNavigationEvent = i23 % 128;
                int i24 = i23 % 2;
                Unit unitOnNavigationEvent = onNavigationEvent(appendqueryparameters, getbacktracenote, function2, imageViewUtilsExternalSyntheticLambda1, zBooleanValue, jsonUtils, map, audioRestrictionControllerImplExternalSyntheticLambda0);
                int i25 = onNavigationEvent + 119;
                onExtraCallbackWithResult = i25 % 128;
                int i26 = i25 % 2;
                return unitOnNavigationEvent;
            case 6:
                return onExtraCallback(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(appendQueryParameters appendqueryparameters, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(appendqueryparameters, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(readFully readfully, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(readfully, setorientationdegrees);
        int i4 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ removeObserverLocked onExtraCallbackWithResult(appendQueryParameters appendqueryparameters, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        removeObserverLocked removeobserverlockedIAuthTabCallback = IAuthTabCallback(appendqueryparameters, sessionProcessorCaptureCallback);
        int i4 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return removeobserverlockedIAuthTabCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Map map = (Map) objArr[0];
        Object obj = objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onNavigationEvent = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback(map, obj, fFloatValue);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(map, obj, fFloatValue);
        int i3 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        obj2.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, JsonUtils jsonUtils, encodeUriString encodeuristring, appendQueryParameters appendqueryparameters, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(quirksExternalSyntheticBackport0, z, jsonUtils, encodeuristring, appendqueryparameters, camera2CameraMetadataExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallbackWithResult + 61;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 73 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(appendQueryParameters appendqueryparameters, boolean z, JsonUtils jsonUtils, encodeUriString encodeuristring, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(appendqueryparameters, z, jsonUtils, encodeuristring, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ removeObserverLocked onNavigationEvent(appendQueryParameters appendqueryparameters, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        removeObserverLocked removeobserverlockedOnExtraCallback = onExtraCallback(appendqueryparameters, sessionProcessorCaptureCallback);
        int i4 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return removeobserverlockedOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, JsonUtils jsonUtils, encodeUriString encodeuristring, appendQueryParameters appendqueryparameters, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            onNavigationEvent(quirksExternalSyntheticBackport0, z, jsonUtils, encodeuristring, appendqueryparameters, camera2CameraMetadataExternalSyntheticLambda1, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, z, jsonUtils, encodeuristring, appendqueryparameters, camera2CameraMetadataExternalSyntheticLambda1, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(appendQueryParameters appendqueryparameters, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsInterface = asInterface(appendqueryparameters, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return unitAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(appendQueryParameters appendqueryparameters, getBacktraceNote getbacktracenote, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(appendqueryparameters, getbacktracenote, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(appendQueryParameters appendqueryparameters, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            return (Unit) onExtraCallbackWithResult(iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback3, -2133293183, 2133293183, new Object[]{appendqueryparameters, useandconfigureprogramwithtexture});
        }
        int iIAuthTabCallback4 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback5 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback6 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(readFully readfully, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback3, 211546429, -211546428, new Object[]{readfully, setorientationdegrees});
        int i4 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 $lazyLazyListState;
        final /* synthetic */ int $scrollThreshold;
        final /* synthetic */ appendQueryParameters $state;
        final /* synthetic */ Map<Object, Float> $termsOffsetMap;
        float F$0;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(appendQueryParameters appendqueryparameters, Map<Object, Float> map, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, int i, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$state = appendqueryparameters;
            this.$termsOffsetMap = map;
            this.$lazyLazyListState = camera2CameraMetadataExternalSyntheticLambda1;
            this.$scrollThreshold = i;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$state, this.$termsOffsetMap, this.$lazyLazyListState, this.$scrollThreshold, access13800Var);
            int i2 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 43;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallbackWithResult;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[PHI: r1
          0x0044: PHI (r1v13 java.lang.Object) = (r1v4 java.lang.Object), (r1v14 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r4
          0x0024: PHI (r4v1 int) = (r4v0 int), (r4v6 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 35;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 35 / 0;
                if (i != 0) {
                    int i5 = onExtraCallbackWithResult + 109;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0 ? i != 1 : i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    String strIAuthTabCallbackStub = this.$state.IAuthTabCallbackStub();
                    if (strIAuthTabCallbackStub == null) {
                        return Unit.INSTANCE;
                    }
                    Float f = this.$termsOffsetMap.get(strIAuthTabCallbackStub);
                    if (f != null) {
                        int i6 = onNavigationEvent + 63;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = this.$lazyLazyListState;
                        int i8 = this.$scrollThreshold;
                        float fFloatValue = f.floatValue();
                        float fMax = Math.max(fFloatValue - i8, 0.0f);
                        this.L$0 = access15400.onNavigationEvent(strIAuthTabCallbackStub);
                        this.F$0 = fFloatValue;
                        this.I$0 = 0;
                        this.label = 1;
                        if (Camera2CameraImplExternalSyntheticLambda14.onExtraCallback(camera2CameraMetadataExternalSyntheticLambda1, fMax, (onItemClicked) null, this, 2, (Object) null) == objOnWarmupCompleted) {
                            int i9 = onNavigationEvent + 7;
                            onExtraCallbackWithResult = i9 % 128;
                            if (i9 % 2 == 0) {
                                return objOnWarmupCompleted;
                            }
                            throw null;
                        }
                    }
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            Unit unit = Unit.INSTANCE;
            int i10 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            return unit;
        }
    }

    private static final Unit onWarmupCompleted(appendQueryParameters appendqueryparameters, boolean z, JsonUtils jsonUtils, encodeUriString encodeuristring, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1))) {
            int i3 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(157722978, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContent.<anonymous> (TdsAgreementV4ScreenContent.kt:70)");
            }
            getRegexMatches.onExtraCallback(null, z, jsonUtils, appendqueryparameters.IAuthTabCallback_Parcel(), appendqueryparameters.IAuthTabCallbackStubProxy(), appendqueryparameters.access100(), encodeuristring, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i5 = onExtraCallbackWithResult + 97;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallbackWithResult + 43;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = onExtraCallbackWithResult + 53;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 38 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1694653975, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContent.<anonymous>.<anonymous> (TdsAgreementV4ScreenContent.kt:82)");
                }
                putJsonArray.onExtraCallback(null, (putJSONObjectIfValid) function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0), cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                putJsonArray.onExtraCallback(null, (putJSONObjectIfValid) function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0), cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i9 = onNavigationEvent + 7;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        appendQueryParameters appendqueryparameters = (appendQueryParameters) objArr[0];
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.onExtraCallbackWithResult(useandconfigureprogramwithtexture, appendqueryparameters.IAuthTabCallbackDefault());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onExtraCallbackWithResult(useandconfigureprogramwithtexture, appendqueryparameters.IAuthTabCallbackDefault());
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final removeObserverLocked IAuthTabCallback(appendQueryParameters appendqueryparameters, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        final readFully readfullyIAuthTabCallback = readFully.onExtraCallback.IAuthTabCallback(readFully.Companion, new Pair[]{getWrite.IAuthTabCallback(Float.valueOf(0.0f), setByteOrder.onNavigationEvent(appendqueryparameters.onExtraCallbackWithResult())), getWrite.IAuthTabCallback(Float.valueOf(1.0f - (sessionProcessorCaptureCallback.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)) / Float.intBitsToFloat((int) sessionProcessorCaptureCallback.onWarmupCompleted()))), setByteOrder.onNavigationEvent(appendqueryparameters.onExtraCallbackWithResult()))}, 0.0f, 0.0f, 0, 14, (Object) null);
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = sessionProcessorCaptureCallback.onExtraCallbackWithResult(new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContentKt$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                Unit unitOnExtraCallbackWithResult;
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 83;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    unitOnExtraCallbackWithResult = containsIgnoreCase.onExtraCallbackWithResult(readfullyIAuthTabCallback, (setOrientationDegrees) obj);
                    int i4 = 69 / 0;
                } else {
                    unitOnExtraCallbackWithResult = containsIgnoreCase.onExtraCallbackWithResult(readfullyIAuthTabCallback, (setOrientationDegrees) obj);
                }
                int i5 = IAuthTabCallback + 41;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnExtraCallbackWithResult;
                }
                throw null;
            }
        });
        int i2 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 19 / 0;
        }
        return removeobserverlockedOnExtraCallbackWithResult;
    }

    private static final Unit onNavigationEvent(readFully readfully, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        setOrientationDegrees.onExtraCallback(setorientationdegrees, readfully, 0L, 0L, 0.0f, (hasMoreElements) null, (seek) null, 0, 126, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(final appendQueryParameters appendqueryparameters, getBacktraceNote getbacktracenote, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0)) {
                int i4 = onExtraCallbackWithResult + 73;
                int i5 = i4 % 128;
                onNavigationEvent = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 17;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                i2 = 4;
            } else {
                int i9 = onNavigationEvent + 85;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                i2 = 2;
            }
            i |= i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onNavigationEvent + 79;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1426375345, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContent.<anonymous>.<anonymous>.<anonymous> (TdsAgreementV4ScreenContent.kt:100)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appendqueryparameters);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContentKt$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj) {
                        int i13 = 2 % 2;
                        int i14 = onNavigationEvent + 25;
                        IAuthTabCallback = i14 % 128;
                        int i15 = i14 % 2;
                        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = containsIgnoreCase.onExtraCallbackWithResult(appendqueryparameters, (SessionProcessorCaptureCallback) obj);
                        int i16 = onNavigationEvent + 29;
                        IAuthTabCallback = i16 % 128;
                        if (i16 % 2 != 0) {
                            return removeobserverlockedOnExtraCallbackWithResult;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = submit.onExtraCallbackWithResult(SessionProcessorSurface.IAuthTabCallback(onextracallback, (Function1) objOnMinimized), 1.0f);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> interfaceDescriptor = appendqueryparameters.getInterfaceDescriptor();
            if (interfaceDescriptor == null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2008059074);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2004438749);
                interfaceDescriptor.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            getbacktracenote.invoke(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i & 14) | 48));
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final removeObserverLocked onExtraCallback(appendQueryParameters appendqueryparameters, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        final readFully readfullyIAuthTabCallback = readFully.onExtraCallback.IAuthTabCallback(readFully.Companion, new Pair[]{getWrite.IAuthTabCallback(Float.valueOf(0.0f), setByteOrder.onNavigationEvent(appendqueryparameters.onExtraCallbackWithResult())), getWrite.IAuthTabCallback(Float.valueOf(1.0f - (sessionProcessorCaptureCallback.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)) / Float.intBitsToFloat((int) sessionProcessorCaptureCallback.onWarmupCompleted()))), setByteOrder.onNavigationEvent(appendqueryparameters.onExtraCallbackWithResult()))}, 0.0f, 0.0f, 0, 14, (Object) null);
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = sessionProcessorCaptureCallback.onExtraCallbackWithResult(new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContentKt$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 95;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = containsIgnoreCase.onWarmupCompleted(readfullyIAuthTabCallback, (setOrientationDegrees) obj);
                if (i4 != 0) {
                    int i5 = 50 / 0;
                }
                return unitOnWarmupCompleted;
            }
        });
        int i2 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return removeobserverlockedOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(final appendQueryParameters appendqueryparameters, getBacktraceNote getbacktracenote, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        int i3;
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if ((i2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0)) {
                int i7 = onExtraCallbackWithResult + 61;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 |= i3;
        }
        if ((i2 & 131) != 130) {
            int i9 = onExtraCallbackWithResult + 65;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i11 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i11 % 128;
            Object obj = null;
            if (i11 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1465265540, i2, -1, "im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContent.<anonymous>.<anonymous>.<anonymous> (TdsAgreementV4ScreenContent.kt:124)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appendqueryparameters);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContentKt$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke(Object obj2) {
                        int i12 = 2 % 2;
                        int i13 = IAuthTabCallback + 73;
                        onExtraCallback = i13 % 128;
                        if (i13 % 2 != 0) {
                            containsIgnoreCase.onNavigationEvent(appendqueryparameters, (SessionProcessorCaptureCallback) obj2);
                            throw null;
                        }
                        removeObserverLocked removeobserverlockedOnNavigationEvent = containsIgnoreCase.onNavigationEvent(appendqueryparameters, (SessionProcessorCaptureCallback) obj2);
                        int i14 = onExtraCallback + 75;
                        IAuthTabCallback = i14 % 128;
                        if (i14 % 2 == 0) {
                            int i15 = 79 / 0;
                        }
                        return removeobserverlockedOnNavigationEvent;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                int i12 = onNavigationEvent + 115;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = submit.onExtraCallbackWithResult(SessionProcessorSurface.IAuthTabCallback(onextracallback, (Function1) objOnMinimized), 1.0f);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i14 = onExtraCallbackWithResult + 121;
                onNavigationEvent = i14 % 128;
                if (i14 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    obj.hashCode();
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> interfaceDescriptor = appendqueryparameters.getInterfaceDescriptor();
            if (interfaceDescriptor == null) {
                int i15 = onExtraCallbackWithResult + 119;
                onNavigationEvent = i15 % 128;
                int i16 = i15 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1795235993);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(496278490);
                interfaceDescriptor.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            getbacktracenote.invoke(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i2 & 14) | 48));
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(Function2 function2, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onNavigationEvent + 81;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-942384340, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContent.<anonymous>.<anonymous>.<anonymous> (TdsAgreementV4ScreenContent.kt:152)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-942384340, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContent.<anonymous>.<anonymous>.<anonymous> (TdsAgreementV4ScreenContent.kt:152)");
            }
            if (function2 == null) {
                int i4 = onExtraCallbackWithResult + 57;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1629370029);
                    obj.hashCode();
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1629370029);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(606749652);
                function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i5 = onNavigationEvent + 71;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallbackWithResult + 1;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i9 = onExtraCallbackWithResult + 51;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 3 / 5;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(appendQueryParameters appendqueryparameters, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if ((i & 17) != 16) {
            int i5 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1167140437, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContent.<anonymous>.<anonymous>.<anonymous> (TdsAgreementV4ScreenContent.kt:158)");
            }
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, appendqueryparameters.access000() != null ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f) : appendqueryparameters.asBinder() != null ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit asInterface(appendQueryParameters appendqueryparameters, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
            z = (i & 15) != 14;
        } else {
            Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
            if ((i & 17) != 16) {
            }
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2121145612, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContent.<anonymous>.<anonymous>.<anonymous> (TdsAgreementV4ScreenContent.kt:172)");
                int i4 = onNavigationEvent + 89;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
            putObjectToStringIfValid.onExtraCallback(appendqueryparameters.access000(), null, cameraCaptureResultEmptyCameraCaptureResult, 0, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallbackWithResult + 91;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(appendQueryParameters appendqueryparameters, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if ((i & 17) != 16) {
            z = true;
        } else {
            int i3 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i5 = onExtraCallbackWithResult + 71;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1114464365, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContent.<anonymous>.<anonymous>.<anonymous> (TdsAgreementV4ScreenContent.kt:180)");
            }
            Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2OnNavigationEvent = appendqueryparameters.onNavigationEvent();
            if (function2OnNavigationEvent == null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-910671610);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1553397157);
                function2OnNavigationEvent.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i7 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i9 = onNavigationEvent + 109;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(Map map, Object obj, float f) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        if (f != 0.0f) {
            int i4 = onNavigationEvent + 117;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 55 / 0;
                if (map.get(obj) == null) {
                    int i6 = onExtraCallbackWithResult + 79;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    map.put(obj, Float.valueOf(f));
                }
            } else if (map.get(obj) == null) {
            }
        }
        Unit unit = Unit.INSTANCE;
        int i8 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(ImageViewUtilsExternalSyntheticLambda1 imageViewUtilsExternalSyntheticLambda1, boolean z, JsonUtils jsonUtils, final Map map, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 101;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
            if ((i & 48) != 76) {
                int i4 = onNavigationEvent + 63;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                z2 = true;
            } else {
                int i6 = onExtraCallbackWithResult + 75;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                z2 = false;
            }
        } else {
            Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            int i8 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-107783118, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContent.<anonymous>.<anonymous>.<anonymous> (TdsAgreementV4ScreenContent.kt:187)");
            }
            if (imageViewUtilsExternalSyntheticLambda1 == null) {
                int i9 = onExtraCallbackWithResult + 53;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1668717059);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1668717060);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(map);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnExtraCallback) {
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function2 function2 = new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContentKt$$ExternalSyntheticLambda9
                            private static int onExtraCallback = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj2, Object obj3) {
                                Unit unit;
                                int i11 = 2 % 2;
                                int i12 = onExtraCallback + 87;
                                onWarmupCompleted = i12 % 128;
                                if (i12 % 2 != 0) {
                                    Object[] objArr = {map, obj2, Float.valueOf(((Float) obj3).floatValue())};
                                    unit = (Unit) containsIgnoreCase.onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 731609205, -731609203, objArr);
                                    int i13 = 38 / 0;
                                } else {
                                    Object[] objArr2 = {map, obj2, Float.valueOf(((Float) obj3).floatValue())};
                                    unit = (Unit) containsIgnoreCase.onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 731609205, -731609203, objArr2);
                                }
                                int i14 = onWarmupCompleted + 3;
                                onExtraCallback = i14 % 128;
                                int i15 = i14 % 2;
                                return unit;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function2);
                        obj = function2;
                    }
                    setAndDownscaleBitmap.onExtraCallbackWithResult(null, z, jsonUtils, imageViewUtilsExternalSyntheticLambda1, (Function2) obj, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        appendQueryParameters appendqueryparameters = (appendQueryParameters) objArr[0];
        boolean z = true;
        RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0 = (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
            if ((iIntValue & 12) != 21) {
                int i3 = onNavigationEvent + 67;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
            } else {
                z = false;
            }
        } else {
            Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
            if ((iIntValue & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onNavigationEvent + 83;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(898898129, iIntValue, -1, "im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContent.<anonymous>.<anonymous>.<anonymous> (TdsAgreementV4ScreenContent.kt:205)");
                    int i6 = 71 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(898898129, iIntValue, -1, "im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContent.<anonymous>.<anonymous>.<anonymous> (TdsAgreementV4ScreenContent.kt:205)");
                }
            }
            Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2OnTransact = appendqueryparameters.onTransact();
            if (function2OnTransact == null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-46901496);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(552676377);
                function2OnTransact.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i7 = onNavigationEvent + 75;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStub(appendQueryParameters appendqueryparameters, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i3 = onExtraCallbackWithResult + 53;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1905579376, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContent.<anonymous>.<anonymous>.<anonymous> (TdsAgreementV4ScreenContent.kt:212)");
            }
            putObjectToStringIfValid.onExtraCallback(appendqueryparameters.asInterface(), null, cameraCaptureResultEmptyCameraCaptureResult, 0, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i5 = onNavigationEvent + 41;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(final appendQueryParameters appendqueryparameters, final getBacktraceNote getbacktracenote, final Function2 function2, final ImageViewUtilsExternalSyntheticLambda1 imageViewUtilsExternalSyntheticLambda1, final boolean z, final JsonUtils jsonUtils, final Map map, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
            int i3 = 97 / 0;
            if (appendqueryparameters.onWarmupCompleted()) {
                audioRestrictionControllerImplExternalSyntheticLambda0.onExtraCallback("StickyTop", "Header", ForwardingCameraControl.onExtraCallbackWithResult(-1465265540, true, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContentKt$$ExternalSyntheticLambda11
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        int i4 = 2 % 2;
                        int i5 = onExtraCallback + 3;
                        onWarmupCompleted = i5 % 128;
                        if (i5 % 2 == 0) {
                            return containsIgnoreCase.IAuthTabCallback(appendqueryparameters, getbacktracenote, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, ((Integer) obj2).intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        }
                        containsIgnoreCase.IAuthTabCallback(appendqueryparameters, getbacktracenote, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, ((Integer) obj2).intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        throw null;
                    }
                }));
            } else {
                audioRestrictionControllerImplExternalSyntheticLambda0.onNavigationEvent("Top", "Header", ForwardingCameraControl.onExtraCallbackWithResult(1426375345, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContentKt$$ExternalSyntheticLambda10
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i4 = 2 % 2;
                        int i5 = onNavigationEvent + 79;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        Unit unitOnWarmupCompleted = containsIgnoreCase.onWarmupCompleted(appendqueryparameters, getbacktracenote, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i7 = onNavigationEvent + 89;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        return unitOnWarmupCompleted;
                    }
                }));
                int i4 = onNavigationEvent + 97;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
            if (!appendqueryparameters.onWarmupCompleted()) {
            }
        }
        audioRestrictionControllerImplExternalSyntheticLambda0.onNavigationEvent("PaymentContent", "PaymentContent", ForwardingCameraControl.onExtraCallbackWithResult(-942384340, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContentKt$$ExternalSyntheticLambda12
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i6 = 2 % 2;
                int i7 = onWarmupCompleted + 111;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                Unit unitOnExtraCallback = containsIgnoreCase.onExtraCallback(function2, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i9 = onWarmupCompleted + 113;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                return unitOnExtraCallback;
            }
        }));
        audioRestrictionControllerImplExternalSyntheticLambda0.onNavigationEvent("UpperCustomSpacer", "UpperCustomSpacer", ForwardingCameraControl.onExtraCallbackWithResult(1167140437, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContentKt$$ExternalSyntheticLambda13
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i6 = 2 % 2;
                int i7 = onNavigationEvent + 103;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                Unit unitOnExtraCallbackWithResult = containsIgnoreCase.onExtraCallbackWithResult(appendqueryparameters, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                if (i8 == 0) {
                    int i9 = 80 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }
        }));
        audioRestrictionControllerImplExternalSyntheticLambda0.onNavigationEvent("UpperCustom", "UpperCustom", ForwardingCameraControl.onExtraCallbackWithResult(-2121145612, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContentKt$$ExternalSyntheticLambda14
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i6 = 2 % 2;
                int i7 = IAuthTabCallback + 7;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                Unit unitOnWarmupCompleted = containsIgnoreCase.onWarmupCompleted(appendqueryparameters, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i9 = onExtraCallbackWithResult + 5;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    return unitOnWarmupCompleted;
                }
                throw null;
            }
        }));
        audioRestrictionControllerImplExternalSyntheticLambda0.onNavigationEvent("Banner", "Banner", ForwardingCameraControl.onExtraCallbackWithResult(-1114464365, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContentKt$$ExternalSyntheticLambda15
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i6 = 2 % 2;
                int i7 = onExtraCallback + 37;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                Object[] objArr = {appendqueryparameters, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                Unit unit = (Unit) containsIgnoreCase.onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 792590258, -792590255, objArr);
                int i9 = onExtraCallback + 119;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                return unit;
            }
        }));
        audioRestrictionControllerImplExternalSyntheticLambda0.onNavigationEvent("Agreements", "Agreements", ForwardingCameraControl.onExtraCallbackWithResult(-107783118, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContentKt$$ExternalSyntheticLambda16
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i6 = 2 % 2;
                int i7 = onWarmupCompleted + 75;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                ImageViewUtilsExternalSyntheticLambda1 imageViewUtilsExternalSyntheticLambda12 = imageViewUtilsExternalSyntheticLambda1;
                boolean z2 = z;
                int iIntValue = ((Integer) obj3).intValue();
                Object[] objArr = {imageViewUtilsExternalSyntheticLambda12, Boolean.valueOf(z2), jsonUtils, map, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                Unit unit = (Unit) containsIgnoreCase.onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1125543169, -1125543163, objArr);
                int i9 = IAuthTabCallback + 119;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 == 0) {
                    return unit;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        }));
        audioRestrictionControllerImplExternalSyntheticLambda0.onNavigationEvent("Notice", "Notice", ForwardingCameraControl.onExtraCallbackWithResult(898898129, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContentKt$$ExternalSyntheticLambda17
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i6 = 2 % 2;
                int i7 = onNavigationEvent + 121;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    containsIgnoreCase.onExtraCallback(appendqueryparameters, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    throw null;
                }
                Unit unitOnExtraCallback = containsIgnoreCase.onExtraCallback(appendqueryparameters, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i8 = IAuthTabCallback + 47;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 36 / 0;
                }
                return unitOnExtraCallback;
            }
        }));
        audioRestrictionControllerImplExternalSyntheticLambda0.onNavigationEvent("LowerCustom", "LowerCustom", ForwardingCameraControl.onExtraCallbackWithResult(1905579376, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContentKt$$ExternalSyntheticLambda18
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i6 = 2 % 2;
                int i7 = onExtraCallbackWithResult + 45;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    containsIgnoreCase.IAuthTabCallback(appendqueryparameters, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    throw null;
                }
                Unit unitIAuthTabCallback = containsIgnoreCase.IAuthTabCallback(appendqueryparameters, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i8 = onExtraCallbackWithResult + 51;
                onExtraCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    return unitIAuthTabCallback;
                }
                throw null;
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00eb  */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, @Nullable JsonUtils jsonUtils, @Nullable encodeUriString encodeuristring, @Nullable appendQueryParameters appendqueryparameters, @Nullable Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        boolean z2;
        int i4;
        JsonUtils jsonUtils2;
        int i5;
        encodeUriString encodeuristring2;
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult;
        boolean z3;
        final appendQueryParameters appendqueryparameters2;
        final Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda12;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final JsonUtils jsonUtils3;
        final encodeUriString encodeuristring3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        final boolean z4;
        final JsonUtils jsonUtils4;
        int i6;
        final encodeUriString encodeuristringOnNavigationEvent;
        ImageViewUtilsExternalSyntheticLambda1 imageViewUtilsExternalSyntheticLambda1;
        int i7;
        appendQueryParameters appendqueryparametersOnExtraCallbackWithResult;
        int i8;
        int i9;
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda13;
        final appendQueryParameters appendqueryparameters3;
        int i10;
        ImageViewUtilsExternalSyntheticLambda1 imageViewUtilsExternalSyntheticLambda12;
        boolean z5;
        boolean zOnExtraCallback;
        boolean z6;
        boolean zOnExtraCallback2;
        Object objOnMinimized;
        int i11;
        int i12;
        String str;
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda14;
        ImageViewUtilsExternalSyntheticLambda1 imageViewUtilsExternalSyntheticLambda13;
        final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, putJSONObjectIfValid> function2AsBinder;
        final Function2 function2;
        int i13;
        boolean z7;
        Object objOnMinimized2;
        boolean z8;
        boolean zOnNavigationEvent;
        boolean zOnNavigationEvent2;
        boolean z9;
        boolean z10;
        boolean zOnExtraCallback3;
        int i14;
        Object objOnMinimized3;
        int i15;
        int i16 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1128564193);
        int i17 = i2 & 1;
        if (i17 != 0) {
            i3 = i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            int i18 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i18 % 128;
            int i19 = i18 % 2;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2) | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        int i20 = i2 & 2;
        if (i20 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    jsonUtils2 = jsonUtils;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(jsonUtils2)) {
                        int i21 = onNavigationEvent + 57;
                        onExtraCallbackWithResult = i21 % 128;
                        i5 = i21 % 2 == 0 ? 14056 : 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        encodeuristring2 = encodeuristring;
                        int i22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(encodeuristring2) ? 2048 : 1024;
                        i3 |= i22;
                    } else {
                        encodeuristring2 = encodeuristring;
                    }
                    i3 |= i22;
                } else {
                    encodeuristring2 = encodeuristring;
                }
                if ((i & 24576) == 0) {
                    i3 |= ((i2 & 16) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(appendqueryparameters)) ? 16384 : 8192;
                }
                if ((i & 196608) == 0) {
                    camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult = camera2CameraMetadataExternalSyntheticLambda1;
                    i3 |= ((i2 & 32) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult)) ? 131072 : 65536;
                } else {
                    camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult = camera2CameraMetadataExternalSyntheticLambda1;
                }
                if ((i3 & 74899) != 74898) {
                    z3 = true;
                } else {
                    int i23 = onNavigationEvent + 69;
                    onExtraCallbackWithResult = i23 % 128;
                    int i24 = i23 % 2;
                    z3 = false;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                        quirksExternalSyntheticBackport04 = i17 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                        z4 = i20 != 0 ? false : z2;
                        jsonUtils4 = i4 != 0 ? null : jsonUtils2;
                        if ((i2 & 8) != 0) {
                            i6 = i3 & (-7169);
                            encodeuristringOnNavigationEvent = getHostAndPath.onNavigationEvent(null, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 3);
                        } else {
                            i6 = i3;
                            encodeuristringOnNavigationEvent = encodeuristring2;
                        }
                        if ((i2 & 16) != 0) {
                            int i25 = onExtraCallbackWithResult + 105;
                            onNavigationEvent = i25 % 128;
                            int i26 = i25 % 2;
                            imageViewUtilsExternalSyntheticLambda1 = null;
                            i7 = 3;
                            appendqueryparametersOnExtraCallbackWithResult = appendQueryParameter.onExtraCallbackWithResult(null, false, null, false, 0L, false, null, null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0, 262143);
                            i8 = i6 & (-57345);
                        } else {
                            imageViewUtilsExternalSyntheticLambda1 = null;
                            i7 = 3;
                            appendqueryparametersOnExtraCallbackWithResult = appendqueryparameters;
                            i8 = i6;
                        }
                        if ((i2 & 32) != 0) {
                            i9 = 0;
                            camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult = Camera2CameraControllerExternalSyntheticLambda0.onExtraCallbackWithResult(0, 0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, i7);
                            i8 &= -458753;
                        } else {
                            i9 = 0;
                        }
                        int i27 = i8;
                        camera2CameraMetadataExternalSyntheticLambda13 = camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult;
                        appendqueryparameters3 = appendqueryparametersOnExtraCallbackWithResult;
                        i10 = i27;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            int i28 = onExtraCallbackWithResult + 79;
                            int i29 = i28 % 128;
                            onNavigationEvent = i29;
                            int i30 = i28 % 2;
                            i3 &= -57345;
                            int i31 = i29 + 101;
                            onExtraCallbackWithResult = i31 % 128;
                            int i32 = i31 % 2;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        camera2CameraMetadataExternalSyntheticLambda13 = camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult;
                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                        z4 = z2;
                        jsonUtils4 = jsonUtils2;
                        imageViewUtilsExternalSyntheticLambda1 = null;
                        i9 = 0;
                        appendqueryparameters3 = appendqueryparameters;
                        i10 = i3;
                        encodeuristringOnNavigationEvent = encodeuristring2;
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1128564193, i10, -1, "im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContent (TdsAgreementV4ScreenContent.kt:48)");
                    }
                    Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, ImageViewUtilsExternalSyntheticLambda1> function2OnExtraCallback = appendqueryparameters3.onExtraCallback();
                    if (function2OnExtraCallback == null) {
                        int i33 = onExtraCallbackWithResult + 119;
                        onNavigationEvent = i33 % 128;
                        int i34 = i33 % 2;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(52306392);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        imageViewUtilsExternalSyntheticLambda12 = imageViewUtilsExternalSyntheticLambda1;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2076522679);
                        ImageViewUtilsExternalSyntheticLambda1 imageViewUtilsExternalSyntheticLambda14 = (ImageViewUtilsExternalSyntheticLambda1) function2OnExtraCallback.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i9));
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        imageViewUtilsExternalSyntheticLambda12 = imageViewUtilsExternalSyntheticLambda14;
                    }
                    Configuration configuration = (Configuration) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult());
                    Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                    r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                    PreviewOrientationIncorrectQuirk previewOrientationIncorrectQuirkOnExtraCallback = ZslDisablerQuirk.onExtraCallback(PreviewOrientationIncorrectQuirk.Companion, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    int iIAuthTabCallback = (varyMatches.IAuthTabCallback(Integer.valueOf(configuration.screenHeightDp), context) - (previewOrientationIncorrectQuirkOnExtraCallback.IAuthTabCallback(r8lambdanm9dm2eewl4vrptnjmesfjqky4) + previewOrientationIncorrectQuirkOnExtraCallback.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky4))) / 2;
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized4 = new LinkedHashMap();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                    }
                    final Map map = (Map) objOnMinimized4;
                    String strIAuthTabCallbackStub = appendqueryparameters3.IAuthTabCallbackStub();
                    int i35 = (57344 & i10) ^ 24576;
                    if (i35 > 16384) {
                        int i36 = onNavigationEvent + 3;
                        onExtraCallbackWithResult = i36 % 128;
                        if (i36 % 2 == 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(appendqueryparameters3);
                            imageViewUtilsExternalSyntheticLambda1.hashCode();
                            throw imageViewUtilsExternalSyntheticLambda1;
                        }
                        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(appendqueryparameters3)) {
                            if ((i10 & 24576) != 16384) {
                                z5 = false;
                            }
                            zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(map);
                            z6 = (((i10 & 458752) ^ 196608) <= 131072 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda13)) || (i10 & 196608) == 131072;
                            zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iIAuthTabCallback);
                            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (((z6 | z5 | zOnExtraCallback) || zOnExtraCallback2) || objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                                i11 = i10;
                                i12 = i35;
                                str = strIAuthTabCallbackStub;
                                Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda15 = camera2CameraMetadataExternalSyntheticLambda13;
                                camera2CameraMetadataExternalSyntheticLambda14 = camera2CameraMetadataExternalSyntheticLambda13;
                                imageViewUtilsExternalSyntheticLambda13 = imageViewUtilsExternalSyntheticLambda12;
                                onWarmupCompleted onwarmupcompleted2 = new onWarmupCompleted(appendqueryparameters3, map, camera2CameraMetadataExternalSyntheticLambda15, iIAuthTabCallback, null);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(onwarmupcompleted2);
                                objOnMinimized = onwarmupcompleted2;
                            } else {
                                i11 = i10;
                                camera2CameraMetadataExternalSyntheticLambda14 = camera2CameraMetadataExternalSyntheticLambda13;
                                str = strIAuthTabCallbackStub;
                                imageViewUtilsExternalSyntheticLambda13 = imageViewUtilsExternalSyntheticLambda12;
                                i12 = i35;
                            }
                            isZslDisabledByByUserCaseConfig.onNavigationEvent(str, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            final EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(157722978, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContentKt$$ExternalSyntheticLambda4
                                private static int IAuthTabCallback = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i37 = 2 % 2;
                                    int i38 = IAuthTabCallback + 101;
                                    onNavigationEvent = i38 % 128;
                                    if (i38 % 2 != 0) {
                                        return containsIgnoreCase.onNavigationEvent(appendqueryparameters3, z4, jsonUtils4, encodeuristringOnNavigationEvent, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    }
                                    containsIgnoreCase.onNavigationEvent(appendqueryparameters3, z4, jsonUtils4, encodeuristringOnNavigationEvent, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    Object obj4 = null;
                                    obj4.hashCode();
                                    throw null;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                            function2AsBinder = appendqueryparameters3.asBinder();
                            if (function2AsBinder != null) {
                                int i37 = onExtraCallbackWithResult + 91;
                                onNavigationEvent = i37 % 128;
                                int i38 = i37 % 2;
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(53472488);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                function2 = null;
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(53472489);
                                Function2 function2OnExtraCallback2 = ForwardingCameraControl.onExtraCallback(-1694653975, true, new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContentKt$$ExternalSyntheticLambda5
                                    private static int IAuthTabCallback = 1;
                                    private static int onWarmupCompleted;

                                    public final Object invoke(Object obj, Object obj2) {
                                        int i39 = 2 % 2;
                                        int i40 = onWarmupCompleted + 35;
                                        IAuthTabCallback = i40 % 128;
                                        int i41 = i40 % 2;
                                        Unit unitOnWarmupCompleted = containsIgnoreCase.onWarmupCompleted(function2AsBinder, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                        int i42 = onWarmupCompleted + 39;
                                        IAuthTabCallback = i42 % 128;
                                        if (i42 % 2 == 0) {
                                            int i43 = 45 / 0;
                                        }
                                        return unitOnWarmupCompleted;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                function2 = function2OnExtraCallback2;
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = submit.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport04, 0.0f, 1, (Object) null), 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 7, (Object) null), 0.0f);
                            if (i12 > 16384 || !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(appendqueryparameters3)) {
                                i13 = i11;
                                if ((i13 & 24576) != 16384) {
                                    z7 = false;
                                }
                                objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (z7 || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContentKt$$ExternalSyntheticLambda6
                                        private static int IAuthTabCallback = 0;
                                        private static int onWarmupCompleted = 1;

                                        public final Object invoke(Object obj) {
                                            int i39 = 2 % 2;
                                            int i40 = IAuthTabCallback + 25;
                                            onWarmupCompleted = i40 % 128;
                                            int i41 = i40 % 2;
                                            Unit unitOnWarmupCompleted = containsIgnoreCase.onWarmupCompleted(appendqueryparameters3, (useAndConfigureProgramWithTexture) obj);
                                            int i42 = IAuthTabCallback + 51;
                                            onWarmupCompleted = i42 % 128;
                                            int i43 = i42 % 2;
                                            return unitOnWarmupCompleted;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                }
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, false, (Function1) objOnMinimized2, 1, (Object) null);
                                z8 = (i12 <= 16384 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(appendqueryparameters3)) || (i13 & 24576) == 16384;
                                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(function2);
                                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(imageViewUtilsExternalSyntheticLambda13);
                                if ((i13 & 112) == 32) {
                                    int i39 = onNavigationEvent + 73;
                                    onExtraCallbackWithResult = i39 % 128;
                                    int i40 = i39 % 2;
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                encodeUriString encodeuristring4 = encodeuristringOnNavigationEvent;
                                z10 = (i13 & 896) != 256;
                                zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(map);
                                i14 = i13;
                                objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (((z9 | z8 | zOnNavigationEvent | zOnNavigationEvent2 | (!z10)) || zOnExtraCallback3) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                                    final appendQueryParameters appendqueryparameters4 = appendqueryparameters3;
                                    i15 = i14;
                                    final ImageViewUtilsExternalSyntheticLambda1 imageViewUtilsExternalSyntheticLambda15 = imageViewUtilsExternalSyntheticLambda13;
                                    final boolean z11 = z4;
                                    final JsonUtils jsonUtils5 = jsonUtils4;
                                    Function1 function1 = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContentKt$$ExternalSyntheticLambda7
                                        private static int onExtraCallbackWithResult = 0;
                                        private static int onNavigationEvent = 1;

                                        public final Object invoke(Object obj) {
                                            Unit unit;
                                            int i41 = 2 % 2;
                                            int i42 = onExtraCallbackWithResult + 121;
                                            onNavigationEvent = i42 % 128;
                                            if (i42 % 2 == 0) {
                                                Object[] objArr = {appendqueryparameters4, encoderProfilesProxyVideoProfileProxyOnExtraCallback, function2, imageViewUtilsExternalSyntheticLambda15, Boolean.valueOf(z11), jsonUtils5, map, (AudioRestrictionControllerImplExternalSyntheticLambda0) obj};
                                                unit = (Unit) containsIgnoreCase.onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 588840732, -588840727, objArr);
                                                int i43 = 26 / 0;
                                            } else {
                                                Object[] objArr2 = {appendqueryparameters4, encoderProfilesProxyVideoProfileProxyOnExtraCallback, function2, imageViewUtilsExternalSyntheticLambda15, Boolean.valueOf(z11), jsonUtils5, map, (AudioRestrictionControllerImplExternalSyntheticLambda0) obj};
                                                unit = (Unit) containsIgnoreCase.onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 588840732, -588840727, objArr2);
                                            }
                                            int i44 = onExtraCallbackWithResult + 99;
                                            onNavigationEvent = i44 % 128;
                                            int i45 = i44 % 2;
                                            return unit;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function1);
                                    objOnMinimized3 = function1;
                                } else {
                                    i15 = i14;
                                }
                                Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda16 = camera2CameraMetadataExternalSyntheticLambda14;
                                ResolutionCorrector.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallbackWithResult2, camera2CameraMetadataExternalSyntheticLambda16, (DeviceQuirksExternalSyntheticLambda0) null, false, (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) null, (QuirkSettingsLoader.onNavigationEvent) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, (removeChildrenForExpandedActionView) null, (Function1) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i15 >> 12) & 112, 508);
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                appendqueryparameters2 = appendqueryparameters3;
                                z2 = z4;
                                jsonUtils3 = jsonUtils4;
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                encodeuristring3 = encodeuristring4;
                                camera2CameraMetadataExternalSyntheticLambda12 = camera2CameraMetadataExternalSyntheticLambda16;
                            } else {
                                i13 = i11;
                            }
                            z7 = true;
                            objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (z7) {
                                objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContentKt$$ExternalSyntheticLambda6
                                    private static int IAuthTabCallback = 0;
                                    private static int onWarmupCompleted = 1;

                                    public final Object invoke(Object obj) {
                                        int i392 = 2 % 2;
                                        int i402 = IAuthTabCallback + 25;
                                        onWarmupCompleted = i402 % 128;
                                        int i41 = i402 % 2;
                                        Unit unitOnWarmupCompleted = containsIgnoreCase.onWarmupCompleted(appendqueryparameters3, (useAndConfigureProgramWithTexture) obj);
                                        int i42 = IAuthTabCallback + 51;
                                        onWarmupCompleted = i42 % 128;
                                        int i43 = i42 % 2;
                                        return unitOnWarmupCompleted;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport052 = quirksExternalSyntheticBackport04;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult22 = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, false, (Function1) objOnMinimized2, 1, (Object) null);
                                if (i12 <= 16384) {
                                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(function2);
                                    zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(imageViewUtilsExternalSyntheticLambda13);
                                    if ((i13 & 112) == 32) {
                                    }
                                    encodeUriString encodeuristring42 = encodeuristringOnNavigationEvent;
                                    if ((i13 & 896) != 256) {
                                    }
                                    zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(map);
                                    i14 = i13;
                                    objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (z9 | z8 | zOnNavigationEvent | zOnNavigationEvent2 | (!z10) | zOnExtraCallback3) {
                                        final appendQueryParameters appendqueryparameters42 = appendqueryparameters3;
                                        i15 = i14;
                                        final ImageViewUtilsExternalSyntheticLambda1 imageViewUtilsExternalSyntheticLambda152 = imageViewUtilsExternalSyntheticLambda13;
                                        final boolean z112 = z4;
                                        final JsonUtils jsonUtils52 = jsonUtils4;
                                        Function1 function12 = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContentKt$$ExternalSyntheticLambda7
                                            private static int onExtraCallbackWithResult = 0;
                                            private static int onNavigationEvent = 1;

                                            public final Object invoke(Object obj) {
                                                Unit unit;
                                                int i41 = 2 % 2;
                                                int i42 = onExtraCallbackWithResult + 121;
                                                onNavigationEvent = i42 % 128;
                                                if (i42 % 2 == 0) {
                                                    Object[] objArr = {appendqueryparameters42, encoderProfilesProxyVideoProfileProxyOnExtraCallback, function2, imageViewUtilsExternalSyntheticLambda152, Boolean.valueOf(z112), jsonUtils52, map, (AudioRestrictionControllerImplExternalSyntheticLambda0) obj};
                                                    unit = (Unit) containsIgnoreCase.onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 588840732, -588840727, objArr);
                                                    int i43 = 26 / 0;
                                                } else {
                                                    Object[] objArr2 = {appendqueryparameters42, encoderProfilesProxyVideoProfileProxyOnExtraCallback, function2, imageViewUtilsExternalSyntheticLambda152, Boolean.valueOf(z112), jsonUtils52, map, (AudioRestrictionControllerImplExternalSyntheticLambda0) obj};
                                                    unit = (Unit) containsIgnoreCase.onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 588840732, -588840727, objArr2);
                                                }
                                                int i44 = onExtraCallbackWithResult + 99;
                                                onNavigationEvent = i44 % 128;
                                                int i45 = i44 % 2;
                                                return unit;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function12);
                                        objOnMinimized3 = function12;
                                        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda162 = camera2CameraMetadataExternalSyntheticLambda14;
                                        ResolutionCorrector.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallbackWithResult22, camera2CameraMetadataExternalSyntheticLambda162, (DeviceQuirksExternalSyntheticLambda0) null, false, (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) null, (QuirkSettingsLoader.onNavigationEvent) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, (removeChildrenForExpandedActionView) null, (Function1) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i15 >> 12) & 112, 508);
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        }
                                        appendqueryparameters2 = appendqueryparameters3;
                                        z2 = z4;
                                        jsonUtils3 = jsonUtils4;
                                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport052;
                                        encodeuristring3 = encodeuristring42;
                                        camera2CameraMetadataExternalSyntheticLambda12 = camera2CameraMetadataExternalSyntheticLambda162;
                                    }
                                } else {
                                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(function2);
                                    zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(imageViewUtilsExternalSyntheticLambda13);
                                    if ((i13 & 112) == 32) {
                                    }
                                    encodeUriString encodeuristring422 = encodeuristringOnNavigationEvent;
                                    if ((i13 & 896) != 256) {
                                    }
                                    zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(map);
                                    i14 = i13;
                                    objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (z9 | z8 | zOnNavigationEvent | zOnNavigationEvent2 | (!z10) | zOnExtraCallback3) {
                                    }
                                }
                            }
                        }
                        z5 = true;
                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(map);
                        if (((i10 & 458752) ^ 196608) <= 131072) {
                            zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iIAuthTabCallback);
                            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (z6 | z5 | zOnExtraCallback | zOnExtraCallback2) {
                                i11 = i10;
                                i12 = i35;
                                str = strIAuthTabCallbackStub;
                                Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda152 = camera2CameraMetadataExternalSyntheticLambda13;
                                camera2CameraMetadataExternalSyntheticLambda14 = camera2CameraMetadataExternalSyntheticLambda13;
                                imageViewUtilsExternalSyntheticLambda13 = imageViewUtilsExternalSyntheticLambda12;
                                onWarmupCompleted onwarmupcompleted22 = new onWarmupCompleted(appendqueryparameters3, map, camera2CameraMetadataExternalSyntheticLambda152, iIAuthTabCallback, null);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(onwarmupcompleted22);
                                objOnMinimized = onwarmupcompleted22;
                                isZslDisabledByByUserCaseConfig.onNavigationEvent(str, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                final getBacktraceNote encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(157722978, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContentKt$$ExternalSyntheticLambda4
                                    private static int IAuthTabCallback = 0;
                                    private static int onNavigationEvent = 1;

                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        int i372 = 2 % 2;
                                        int i382 = IAuthTabCallback + 101;
                                        onNavigationEvent = i382 % 128;
                                        if (i382 % 2 != 0) {
                                            return containsIgnoreCase.onNavigationEvent(appendqueryparameters3, z4, jsonUtils4, encodeuristringOnNavigationEvent, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                        }
                                        containsIgnoreCase.onNavigationEvent(appendqueryparameters3, z4, jsonUtils4, encodeuristringOnNavigationEvent, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                        Object obj4 = null;
                                        obj4.hashCode();
                                        throw null;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                function2AsBinder = appendqueryparameters3.asBinder();
                                if (function2AsBinder != null) {
                                }
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult3 = submit.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport04, 0.0f, 1, (Object) null), 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 7, (Object) null), 0.0f);
                                if (i12 > 16384) {
                                    i13 = i11;
                                    if ((i13 & 24576) != 16384) {
                                        z7 = true;
                                    }
                                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (z7) {
                                    }
                                }
                            }
                        } else {
                            zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iIAuthTabCallback);
                            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (z6 | z5 | zOnExtraCallback | zOnExtraCallback2) {
                            }
                        }
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    appendqueryparameters2 = appendqueryparameters;
                    camera2CameraMetadataExternalSyntheticLambda12 = camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult;
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                    jsonUtils3 = jsonUtils2;
                    encodeuristring3 = encodeuristring2;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final boolean z12 = z2;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.screen.TdsAgreementV4ScreenContentKt$$ExternalSyntheticLambda8
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj, Object obj2) {
                            int i41 = 2 % 2;
                            int i42 = onExtraCallbackWithResult + 101;
                            onNavigationEvent = i42 % 128;
                            int i43 = i42 % 2;
                            Unit unitOnWarmupCompleted = containsIgnoreCase.onWarmupCompleted(quirksExternalSyntheticBackport03, z12, jsonUtils3, encodeuristring3, appendqueryparameters2, camera2CameraMetadataExternalSyntheticLambda12, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i44 = onExtraCallbackWithResult + 119;
                            onNavigationEvent = i44 % 128;
                            int i45 = i44 % 2;
                            return unitOnWarmupCompleted;
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            jsonUtils2 = jsonUtils;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((i & 196608) == 0) {
            }
            if ((i3 & 74899) != 74898) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        z2 = z;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        jsonUtils2 = jsonUtils;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((i & 196608) == 0) {
        }
        if ((i3 & 74899) != 74898) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    public static /* synthetic */ Unit onExtraCallback(ImageViewUtilsExternalSyntheticLambda1 imageViewUtilsExternalSyntheticLambda1, boolean z, JsonUtils jsonUtils, Map map, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {imageViewUtilsExternalSyntheticLambda1, Boolean.valueOf(z), jsonUtils, map, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1125543169, -1125543163, objArr);
    }

    public static /* synthetic */ Unit onExtraCallback(Map map, Object obj, float f) {
        Object[] objArr = {map, obj, Float.valueOf(f)};
        return (Unit) onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 731609205, -731609203, objArr);
    }

    public static /* synthetic */ Unit IAuthTabCallback(appendQueryParameters appendqueryparameters, getBacktraceNote getbacktracenote, Function2 function2, ImageViewUtilsExternalSyntheticLambda1 imageViewUtilsExternalSyntheticLambda1, boolean z, JsonUtils jsonUtils, Map map, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        Object[] objArr = {appendqueryparameters, getbacktracenote, function2, imageViewUtilsExternalSyntheticLambda1, Boolean.valueOf(z), jsonUtils, map, audioRestrictionControllerImplExternalSyntheticLambda0};
        return (Unit) onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 588840732, -588840727, objArr);
    }

    public static /* synthetic */ Unit onNavigationEvent(appendQueryParameters appendqueryparameters, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {appendqueryparameters, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 792590258, -792590255, objArr);
    }

    private static final Unit onExtraCallbackWithResult(appendQueryParameters appendqueryparameters, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback3, -2133293183, 2133293183, new Object[]{appendqueryparameters, useandconfigureprogramwithtexture});
    }

    private static final Unit onExtraCallback(readFully readfully, setOrientationDegrees setorientationdegrees) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback3, 211546429, -211546428, new Object[]{readfully, setorientationdegrees});
    }

    private static final Unit onTransact(appendQueryParameters appendqueryparameters, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {appendqueryparameters, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -15381387, 15381391, objArr);
    }
}
