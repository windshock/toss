package o;

import android.content.res.Resources;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.google.common.collect.Synchronized;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda11;
import im.toss.tds.compose.component.compound.agreement.v4.row.RightPreset;
import im.toss.tds.compose.foundation.anim.rally.Rally;
import im.toss.tds.compose.foundation.anim.rally.RallyKt;
import im.toss.tds.compose.foundation.anim.rally.RallyModifierKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AppLovinSdkSettings;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.ExtensionsManager1;
import o.Futures3;
import o.JsonUtils;
import o.LifecycleCameraProviderImplExternalSyntheticLambda2;
import o.QualityRatioToResolutionsTableExternalSyntheticLambda0;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RecorderExternalSyntheticLambda14;
import o.SessionProcessorCaptureCallback;
import o.getBacktraceNote;
import o.putIntArray;
import o.r8lambda6FdWI3gCwdfToUXuRhHFsclpRbc;
import o.readFully;
import o.removeObserverLocked;
import o.setAndDownscaleBitmap;
import o.setAndDownscaleImageUri;
import o.setByteOrder;
import o.setOrientationDegrees;
import o.synchronizedList;
import o.toJSONArray;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setAndDownscaleBitmap {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    private static final Unit IAuthTabCallback(float f, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 75;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {Float.valueOf(f), quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)};
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        if (i6 != 0) {
            onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, objArr, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1154776644, 1154776646, iOnWarmupCompleted2);
        } else {
            onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, objArr, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1154776644, 1154776646, iOnWarmupCompleted2);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getTimebase gettimebase, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        Unit unit = (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{gettimebase, extensionsManager1}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -171095096, 171095099, iOnWarmupCompleted2);
        int i4 = onNavigationEvent + 53;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(r8lambdaNBxVhWOH9H5GRBwkiOB26o8EVuM r8lambdanbxvhwoh9h5grbwkiob26o8evum, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(r8lambdanbxvhwoh9h5grbwkiob26o8evum, obj);
        int i4 = onNavigationEvent + 123;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(setAndDownscaleImageUri setanddownscaleimageuri, int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, JsonUtils jsonUtils, Function2 function2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 65;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(setanddownscaleimageuri, i, quirksExternalSyntheticBackport0, z, jsonUtils, function2, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = IAuthTabCallback + 39;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        setAndDownscaleImageUri setanddownscaleimageuri = (setAndDownscaleImageUri) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        Function2 function2 = (Function2) objArr[2];
        toJSONArray tojsonarray = (toJSONArray) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(setanddownscaleimageuri, function1, function2, tojsonarray, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        onWarmupCompleted(setanddownscaleimageuri, function1, function2, tojsonarray, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        setAndDownscaleImageUri setanddownscaleimageuri = (setAndDownscaleImageUri) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(setanddownscaleimageuri, obj);
        int i4 = onNavigationEvent + 125;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(Object obj, Function2 function2, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(obj, function2, futures3);
        int i4 = IAuthTabCallback + 55;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, JsonUtils jsonUtils, ImageViewUtilsExternalSyntheticLambda1 imageViewUtilsExternalSyntheticLambda1, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 57;
        onNavigationEvent = i5 % 128;
        onExtraCallbackWithResult(quirksExternalSyntheticBackport0, z, jsonUtils, imageViewUtilsExternalSyntheticLambda1, function2, cameraCaptureResultEmptyCameraCaptureResult, i5 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 23;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 50 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(putFloatArray putfloatarray, r8lambdaNBxVhWOH9H5GRBwkiOB26o8EVuM r8lambdanbxvhwoh9h5grbwkiob26o8evum, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException, Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 95;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(putfloatarray, r8lambdanbxvhwoh9h5grbwkiob26o8evum, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 72 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(readFully readfully, float f, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(readfully, f, setorientationdegrees);
        int i4 = onNavigationEvent + 61;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(float f, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 81;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return IAuthTabCallback(f, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        IAuthTabCallback(f, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, JsonUtils jsonUtils, ImageViewUtilsExternalSyntheticLambda1 imageViewUtilsExternalSyntheticLambda1, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 3;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, z, jsonUtils, imageViewUtilsExternalSyntheticLambda1, function2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = IAuthTabCallback + 73;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit onExtraCallbackWithResult(setAndDownscaleImageUri setanddownscaleimageuri, int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, JsonUtils jsonUtils, Function2 function2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 3;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        onWarmupCompleted(setanddownscaleimageuri, i, quirksExternalSyntheticBackport0, z, jsonUtils, function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = IAuthTabCallback + 99;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setAndDownscaleImageUri setanddownscaleimageuri, Function2 function2, toJSONArray tojsonarray, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 47;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(setanddownscaleimageuri, function2, tojsonarray, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 72 / 0;
        }
        int i6 = onNavigationEvent + 115;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setAndDownscaleImageUri setanddownscaleimageuri, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function2 function2, Function2 function22, r8lambda6FdWI3gCwdfToUXuRhHFsclpRbc r8lambda6fdwi3gcwdftouxurhhfsclprbc, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 125;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(setanddownscaleimageuri, quirksExternalSyntheticBackport0, function2, function22, r8lambda6fdwi3gcwdftouxurhhfsclprbc, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 69 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ getBacktraceNote onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function2 function2, Function2 function22, setAndDownscaleImageUri setanddownscaleimageuri) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(quirksExternalSyntheticBackport0, function2, function22, setanddownscaleimageuri);
            throw null;
        }
        getBacktraceNote getbacktracenoteOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, function2, function22, setanddownscaleimageuri);
        int i3 = onNavigationEvent + 71;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return getbacktracenoteOnExtraCallback;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(float f, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 67;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{Float.valueOf(f), quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1154776644, 1154776646, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
            throw null;
        }
        onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{Float.valueOf(f), quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1154776644, 1154776646, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
        int i5 = onNavigationEvent + 61;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(Object obj, Function2 function2, setAndDownscaleImageUri setanddownscaleimageuri, putFloatArray putfloatarray, r8lambdaNBxVhWOH9H5GRBwkiOB26o8EVuM r8lambdanbxvhwoh9h5grbwkiob26o8evum, synchronizedList synchronizedlist, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Unit unit;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 55;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {obj, function2, setanddownscaleimageuri, putfloatarray, r8lambdanbxvhwoh9h5grbwkiob26o8evum, synchronizedlist, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
            unit = (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -2080603006, 2080603006, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
            int i4 = 9 / 0;
        } else {
            Object[] objArr2 = {obj, function2, setanddownscaleimageuri, putfloatarray, r8lambdanbxvhwoh9h5grbwkiob26o8evum, synchronizedlist, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
            unit = (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr2, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -2080603006, 2080603006, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
        }
        int i5 = IAuthTabCallback + 105;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ removeObserverLocked onNavigationEvent(Pair[] pairArr, float f, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        removeObserverLocked removeobserverlockedOnWarmupCompleted = onWarmupCompleted(pairArr, f, sessionProcessorCaptureCallback);
        int i4 = onNavigationEvent + 93;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return removeobserverlockedOnWarmupCompleted;
        }
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(setAndDownscaleImageUri setanddownscaleimageuri, int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, JsonUtils jsonUtils, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 103;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        onWarmupCompleted(setanddownscaleimageuri, i, quirksExternalSyntheticBackport0, z, jsonUtils, function2, cameraCaptureResultEmptyCameraCaptureResult, i2, i3);
        if (i6 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i5;
        int i9 = ~i2;
        int i10 = (~(i7 | i8 | i9)) | (~(i4 | i5));
        int i11 = ~(i2 | i5);
        int i12 = i10 | i11;
        int i13 = ~(i7 | i5);
        int i14 = i11 | i7 | (~(i8 | i9));
        int i15 = i4 + i5 + i6 + (1349231875 * i) + (1735201104 * i3);
        int i16 = i15 * i15;
        int i17 = ((-413510627) * i4) + 1558183936 + (237349861 * i5) + (i12 * 325430244) + (325430244 * i13) + ((-325430244) * i14) + ((-88080384) * i6) + ((-1337982976) * i) + (469762048 * i3) + (1272971264 * i16);
        int i18 = ((i4 * 236314795) - 374860141) + (i5 * 236313123) + (i12 * (-836)) + (i13 * (-836)) + (i14 * 836) + (i6 * 236313959) + (i * (-66979019)) + (i3 * (-1872492752)) + (i16 * (-417333248));
        switch (i17 + (i18 * i18 * 639631360)) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                getTimebase gettimebase = (getTimebase) objArr[0];
                ExtensionsManager1 extensionsManager1 = (ExtensionsManager1) objArr[1];
                int i19 = 2 % 2;
                int i20 = onNavigationEvent + 67;
                IAuthTabCallback = i20 % 128;
                int i21 = i20 % 2;
                onExtraCallbackWithResult(gettimebase, (int) extensionsManager1.onExtraCallbackWithResult());
                Unit unit = Unit.INSTANCE;
                int i22 = onNavigationEvent + 79;
                IAuthTabCallback = i22 % 128;
                int i23 = i22 % 2;
                return unit;
            case 4:
                return onExtraCallback(objArr);
            case 5:
                Rally rally = (Rally) objArr[0];
                int i24 = 2 % 2;
                int i25 = onNavigationEvent + 97;
                IAuthTabCallback = i25 % 128;
                int i26 = i25 % 2;
                AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = IAuthTabCallback(rally);
                int i27 = IAuthTabCallback + 61;
                onNavigationEvent = i27 % 128;
                int i28 = i27 % 2;
                return appLovinSdkSettingsIAuthTabCallback;
            case 6:
                return onExtraCallbackWithResult(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return asInterface(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        putFloatArray putfloatarray = (putFloatArray) objArr[0];
        setAndDownscaleImageUri setanddownscaleimageuri = (setAndDownscaleImageUri) objArr[1];
        RightPreset rightPreset = (RightPreset) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {putfloatarray, setanddownscaleimageuri, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        if (i3 != 0) {
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, objArr2, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -870078980, 870078986, iOnWarmupCompleted2);
        int i4 = IAuthTabCallback + 77;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Object obj, Function2 function2, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        IAuthTabCallback = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback(obj, function2, futures3);
            obj2.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(obj, function2, futures3);
        int i3 = onNavigationEvent + 57;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setAndDownscaleImageUri setanddownscaleimageuri, Function2 function2, putFloatArray putfloatarray, synchronizedList synchronizedlist, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 31;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(setanddownscaleimageuri, function2, putfloatarray, synchronizedlist, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 85 / 0;
        }
        int i6 = onNavigationEvent + 19;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setAndDownscaleImageUri setanddownscaleimageuri, setAndDownscaleImageUri setanddownscaleimageuri2, int i, getBacktraceNote getbacktracenote, Function2 function2, r8lambda6FdWI3gCwdfToUXuRhHFsclpRbc r8lambda6fdwi3gcwdftouxurhhfsclprbc, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 103;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallback = onExtraCallback(setanddownscaleimageuri, setanddownscaleimageuri2, i, getbacktracenote, function2, r8lambda6fdwi3gcwdftouxurhhfsclprbc, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 99;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ getBacktraceNote onWarmupCompleted(setAndDownscaleImageUri setanddownscaleimageuri, int i, Function2 function2, setAndDownscaleImageUri setanddownscaleimageuri2, getBacktraceNote getbacktracenote) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 45;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote getbacktracenoteOnNavigationEvent = onNavigationEvent(setanddownscaleimageuri, i, function2, setanddownscaleimageuri2, getbacktracenote);
        int i5 = IAuthTabCallback + 121;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenoteOnNavigationEvent;
    }

    public static final class onNavigationEvent extends Lambda implements Function1<useAndConfigureProgramWithTexture, Unit> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Recorder $measurer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(Recorder recorder) {
            super(1);
            this.$measurer = recorder;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((useAndConfigureProgramWithTexture) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 61;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onWarmupCompleted(@NotNull useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            RecorderExternalSyntheticLambda13.IAuthTabCallback(useandconfigureprogramwithtexture, this.$measurer);
            int i4 = onWarmupCompleted + 27;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    public static final class onExtraCallback extends Lambda implements Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ int $$changed;
        final /* synthetic */ boolean $enableMotion$inlined;
        final /* synthetic */ float $gradientWidth$inlined;
        final /* synthetic */ float $leftPadding$inlined;
        final /* synthetic */ Function2 $offset$inlined;
        final /* synthetic */ Function0 $onHelpersChanged;
        final /* synthetic */ LifecycleCameraProviderImplExternalSyntheticLambda2 $scope;
        final /* synthetic */ boolean $showGradientBar$inlined;
        final /* synthetic */ JsonUtils $slideMotion$inlined;
        final /* synthetic */ ImageViewUtilsExternalSyntheticLambda1 $state$inlined;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(LifecycleCameraProviderImplExternalSyntheticLambda2 lifecycleCameraProviderImplExternalSyntheticLambda2, int i, Function0 function0, ImageViewUtilsExternalSyntheticLambda1 imageViewUtilsExternalSyntheticLambda1, boolean z, boolean z2, JsonUtils jsonUtils, Function2 function2, float f, float f2) {
            super(2);
            this.$scope = lifecycleCameraProviderImplExternalSyntheticLambda2;
            this.$onHelpersChanged = function0;
            this.$state$inlined = imageViewUtilsExternalSyntheticLambda1;
            this.$showGradientBar$inlined = z;
            this.$enableMotion$inlined = z2;
            this.$slideMotion$inlined = jsonUtils;
            this.$offset$inlined = function2;
            this.$gradientWidth$inlined = f;
            this.$leftPadding$inlined = f2;
            this.$$changed = i;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Number) obj2).intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return unit;
            }
            throw null;
        }

        public final void onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 125;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0 ? ((i & 11) ^ 2) == 0 : ((i & 61) ^ 3) == 0) {
                int i5 = i3 + 23;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                if (cameraCaptureResultEmptyCameraCaptureResult.onMessageChannelReady()) {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                    return;
                }
            }
            int iOnExtraCallback = this.$scope.onExtraCallback();
            this.$scope.IAuthTabCallback();
            LifecycleCameraProviderImplExternalSyntheticLambda2 lifecycleCameraProviderImplExternalSyntheticLambda2 = this.$scope;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2075030766);
            LifecycleCameraProviderImplExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = lifecycleCameraProviderImplExternalSyntheticLambda2.onExtraCallbackWithResult();
            StillCaptureProcessorOnCaptureResultCallback stillCaptureProcessorOnCaptureResultCallbackOnWarmupCompleted = iAuthTabCallbackOnExtraCallbackWithResult.onWarmupCompleted();
            StillCaptureProcessorOnCaptureResultCallback stillCaptureProcessorOnCaptureResultCallbackIAuthTabCallback = iAuthTabCallbackOnExtraCallbackWithResult.IAuthTabCallback();
            getMemoryMappingsOrBuilder<setAndDownscaleImageUri> getmemorymappingsorbuilderOnExtraCallback = this.$state$inlined.onExtraCallback();
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                int i7 = onWarmupCompleted + 93;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                objOnMinimized = IAuthTabCallbackDefault.onNavigationEvent;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            Function1 function1 = (Function1) objOnMinimized;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(this.$state$inlined);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new asInterface(this.$state$inlined);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            setBaselineAlignedChildIndex.onWarmupCompleted(getmemorymappingsorbuilderOnExtraCallback, (QuirksExternalSyntheticBackport0) null, function1, (QuirkSettingsLoader) null, "agreementGroupContentAnimation", (Function1) objOnMinimized2, ForwardingCameraControl.onExtraCallback(-86675238, true, new asBinder(lifecycleCameraProviderImplExternalSyntheticLambda2, stillCaptureProcessorOnCaptureResultCallbackIAuthTabCallback, this.$enableMotion$inlined, this.$slideMotion$inlined, this.$offset$inlined), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 1597824, 10);
            Object[] objArr = {Boolean.valueOf(this.$showGradientBar$inlined), null, 0, 0, ForwardingCameraControl.onExtraCallback(1284482679, true, new IAuthTabCallbackStub(this.$gradientWidth$inlined, lifecycleCameraProviderImplExternalSyntheticLambda2, stillCaptureProcessorOnCaptureResultCallbackOnWarmupCompleted, this.$leftPadding$inlined), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 24576, 14};
            MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, 1823154464, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1823154460);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (this.$scope.onExtraCallback() != iOnExtraCallback) {
                this.$onHelpersChanged.invoke();
            }
        }
    }

    static final class IAuthTabCallbackDefault implements Function1<setDividerPadding<getMemoryMappingsOrBuilder<? extends setAndDownscaleImageUri>>, ResourceManagerInternalAsldcInflateDelegate> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        public static final IAuthTabCallbackDefault onNavigationEvent = new IAuthTabCallbackDefault();
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallbackWithResult + 109;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        IAuthTabCallbackDefault() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            IAuthTabCallback = i2 % 128;
            setDividerPadding<getMemoryMappingsOrBuilder<setAndDownscaleImageUri>> setdividerpadding = (setDividerPadding) obj;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(setdividerpadding);
            }
            onWarmupCompleted(setdividerpadding);
            throw null;
        }

        public final ResourceManagerInternalAsldcInflateDelegate onWarmupCompleted(setDividerPadding<getMemoryMappingsOrBuilder<setAndDownscaleImageUri>> setdividerpadding) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(setdividerpadding, "");
            ResourceManagerInternalAsldcInflateDelegate resourceManagerInternalAsldcInflateDelegateOnNavigationEvent = setBaselineAlignedChildIndex.onNavigationEvent(ResourceManagerInternalResourceManagerHooks.Companion.onExtraCallbackWithResult(), ResourceManagerInternalVdcInflateDelegate.onWarmupCompleted(getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.onExtraCallbackWithResult(), 0, 2, (Object) null), 0.0f, 2, (Object) null));
            int i4 = IAuthTabCallback + 117;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 80 / 0;
            }
            return resourceManagerInternalAsldcInflateDelegateOnNavigationEvent;
        }
    }

    static final class asInterface implements Function1<getMemoryMappingsOrBuilder<? extends setAndDownscaleImageUri>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ ImageViewUtilsExternalSyntheticLambda1 onNavigationEvent;

        asInterface(ImageViewUtilsExternalSyntheticLambda1 imageViewUtilsExternalSyntheticLambda1) {
            this.onNavigationEvent = imageViewUtilsExternalSyntheticLambda1;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((getMemoryMappingsOrBuilder) obj);
            if (i3 != 0) {
                int i4 = 91 / 0;
            }
            int i5 = onWarmupCompleted + 123;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(getMemoryMappingsOrBuilder<? extends setAndDownscaleImageUri> getmemorymappingsorbuilder) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(getmemorymappingsorbuilder, "");
            Object objIAuthTabCallback = this.onNavigationEvent.IAuthTabCallback();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(getmemorymappingsorbuilder, 10));
            Iterator it = getmemorymappingsorbuilder.iterator();
            while (it.hasNext()) {
                int i2 = IAuthTabCallback + 57;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    arrayList.add(((setAndDownscaleImageUri) it.next()).IAuthTabCallbackDefault());
                    int i3 = 59 / 0;
                } else {
                    arrayList.add(((setAndDownscaleImageUri) it.next()).IAuthTabCallbackDefault());
                }
            }
            return objIAuthTabCallback + "_" + arrayList;
        }
    }

    static final class asBinder implements setTaggedAddrCtrl<setDividerDrawable, getMemoryMappingsOrBuilder<? extends setAndDownscaleImageUri>, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        private static int IAuthTabCallbackStub = 0;
        private static int asInterface = 1;
        final /* synthetic */ Function2<Object, Float, Unit> IAuthTabCallback;
        final /* synthetic */ StillCaptureProcessorOnCaptureResultCallback onExtraCallback;
        final /* synthetic */ boolean onExtraCallbackWithResult;
        final /* synthetic */ LifecycleCameraProviderImplExternalSyntheticLambda2 onNavigationEvent;
        final /* synthetic */ JsonUtils onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        asBinder(LifecycleCameraProviderImplExternalSyntheticLambda2 lifecycleCameraProviderImplExternalSyntheticLambda2, StillCaptureProcessorOnCaptureResultCallback stillCaptureProcessorOnCaptureResultCallback, boolean z, JsonUtils jsonUtils, Function2<Object, ? super Float, Unit> function2) {
            this.onNavigationEvent = lifecycleCameraProviderImplExternalSyntheticLambda2;
            this.onExtraCallback = stillCaptureProcessorOnCaptureResultCallback;
            this.onExtraCallbackWithResult = z;
            this.onWarmupCompleted = jsonUtils;
            this.IAuthTabCallback = function2;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 19;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent((setDividerDrawable) obj, (getMemoryMappingsOrBuilder) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Number) obj4).intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return unit;
            }
            throw null;
        }

        static final class IAuthTabCallback implements Function1<StillCaptureProcessorExternalSyntheticLambda0, Unit> {
            private static int IAuthTabCallback = 1;
            public static final IAuthTabCallback onExtraCallback = new IAuthTabCallback();
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            static {
                int i = onNavigationEvent + 31;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            IAuthTabCallback() {
            }

            public /* synthetic */ Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 81;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                onWarmupCompleted((StillCaptureProcessorExternalSyntheticLambda0) obj);
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    return unit;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public final void onWarmupCompleted(StillCaptureProcessorExternalSyntheticLambda0 stillCaptureProcessorExternalSyntheticLambda0) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 9;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(stillCaptureProcessorExternalSyntheticLambda0, "");
                QualityRatioToResolutionsTableExternalSyntheticLambda0.onExtraCallbackWithResult.onExtraCallbackWithResult(stillCaptureProcessorExternalSyntheticLambda0.asInterface(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().onExtraCallback(), 0.0f, 0.0f, 6, (Object) null);
                RecorderExternalSyntheticLambda14.onExtraCallbackWithResult.IAuthTabCallback(stillCaptureProcessorExternalSyntheticLambda0.IAuthTabCallback(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().IAuthTabCallback(), 0.0f, 0.0f, 6, (Object) null);
                RecorderExternalSyntheticLambda14.onExtraCallbackWithResult.IAuthTabCallback(stillCaptureProcessorExternalSyntheticLambda0.onNavigationEvent(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().onWarmupCompleted(), 0.0f, 0.0f, 6, (Object) null);
                int i4 = onExtraCallbackWithResult + 75;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public final void onNavigationEvent(setDividerDrawable setdividerdrawable, getMemoryMappingsOrBuilder<? extends setAndDownscaleImageUri> getmemorymappingsorbuilder, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(setdividerdrawable, "");
            Intrinsics.checkNotNullParameter(getmemorymappingsorbuilder, "");
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = asInterface + 69;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-86675238, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.group.TdsAgreementV4Group.<anonymous>.<anonymous> (TdsAgreementV4Group.kt:104)");
            }
            LifecycleCameraProviderImplExternalSyntheticLambda2 lifecycleCameraProviderImplExternalSyntheticLambda2 = this.onNavigationEvent;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
            StillCaptureProcessorOnCaptureResultCallback stillCaptureProcessorOnCaptureResultCallback = this.onExtraCallback;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = IAuthTabCallback.onExtraCallback;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = lifecycleCameraProviderImplExternalSyntheticLambda2.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback, stillCaptureProcessorOnCaptureResultCallback, (Function1) objOnMinimized);
            boolean z = this.onExtraCallbackWithResult;
            JsonUtils jsonUtils = this.onWarmupCompleted;
            Function2<Object, Float, Unit> function2 = this.IAuthTabCallback;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback2);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
                int i5 = asInterface + 107;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (true ^ cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            } else {
                int i7 = asInterface + 119;
                IAuthTabCallbackStub = i7 % 128;
                if (i7 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(728318036);
            int i8 = 0;
            for (Object obj : getmemorymappingsorbuilder) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                setAndDownscaleBitmap.onNavigationEvent((setAndDownscaleImageUri) obj, i9 * 80, null, z, jsonUtils, function2, cameraCaptureResultEmptyCameraCaptureResult, 0, 4);
                i8 = i9;
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
    }

    static final class IAuthTabCallbackStub implements setTaggedAddrCtrl<isContainerClickable<Boolean>, getSwitchMinWidth<Boolean>, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        private static int IAuthTabCallbackStub = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ StillCaptureProcessorOnCaptureResultCallback IAuthTabCallback;
        final /* synthetic */ float onExtraCallback;
        final /* synthetic */ float onExtraCallbackWithResult;
        final /* synthetic */ LifecycleCameraProviderImplExternalSyntheticLambda2 onNavigationEvent;

        IAuthTabCallbackStub(float f, LifecycleCameraProviderImplExternalSyntheticLambda2 lifecycleCameraProviderImplExternalSyntheticLambda2, StillCaptureProcessorOnCaptureResultCallback stillCaptureProcessorOnCaptureResultCallback, float f2) {
            this.onExtraCallbackWithResult = f;
            this.onNavigationEvent = lifecycleCameraProviderImplExternalSyntheticLambda2;
            this.IAuthTabCallback = stillCaptureProcessorOnCaptureResultCallback;
            this.onExtraCallback = f2;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((isContainerClickable) obj, (getSwitchMinWidth) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Number) obj4).intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return unit;
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void onWarmupCompleted(isContainerClickable<Boolean> iscontainerclickable, getSwitchMinWidth<Boolean> getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2;
            boolean z;
            int i3;
            int i4 = 2 % 2;
            Intrinsics.checkNotNullParameter(iscontainerclickable, "");
            Intrinsics.checkNotNullParameter(getswitchminwidth, "");
            if ((i & 6) == 0) {
                int i5 = IAuthTabCallbackStub + 77;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iscontainerclickable)) {
                    i3 = 4;
                } else {
                    int i7 = IAuthTabCallbackStub + 103;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    i3 = 2;
                }
                i2 = i3 | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth) ? 32 : 16;
            }
            if ((i2 & 147) != 146) {
                int i9 = onWarmupCompleted + 11;
                IAuthTabCallbackStub = i9 % 128;
                int i10 = i9 % 2;
                z = true;
            } else {
                z = false;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                return;
            }
            int i11 = IAuthTabCallbackStub + 31;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1284482679, i2, -1, "im.toss.tds.compose.component.compound.agreement.v4.group.TdsAgreementV4Group.<anonymous>.<anonymous> (TdsAgreementV4Group.kt:124)");
            }
            if (((Boolean) getswitchminwidth.IAuthTabCallback()).booleanValue() || ((Boolean) getswitchminwidth.access000()).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2135042466);
                float f = this.onExtraCallbackWithResult;
                LifecycleCameraProviderImplExternalSyntheticLambda2 lifecycleCameraProviderImplExternalSyntheticLambda2 = this.onNavigationEvent;
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                StillCaptureProcessorOnCaptureResultCallback stillCaptureProcessorOnCaptureResultCallback = this.IAuthTabCallback;
                boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(this.onExtraCallback);
                float f2 = this.onExtraCallback;
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zIAuthTabCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new IAuthTabCallback(f2);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = lifecycleCameraProviderImplExternalSyntheticLambda2.onExtraCallback(onextracallback, stillCaptureProcessorOnCaptureResultCallback, (Function1) objOnMinimized);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = onExtraCallbackWithResult.onExtraCallbackWithResult;
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                }
                setAndDownscaleBitmap.onExtraCallbackWithResult(f, iscontainerclickable.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback, getswitchminwidth, (Function1) objOnMinimized2), cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2134353429);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i13 = onWarmupCompleted + 67;
                IAuthTabCallbackStub = i13 % 128;
                int i14 = i13 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }

        static final class IAuthTabCallback implements Function1<StillCaptureProcessorExternalSyntheticLambda0, Unit> {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ float IAuthTabCallback;

            IAuthTabCallback(float f) {
                this.IAuthTabCallback = f;
            }

            public /* synthetic */ Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 5;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult((StillCaptureProcessorExternalSyntheticLambda0) obj);
                Unit unit = Unit.INSTANCE;
                if (i3 == 0) {
                    throw null;
                }
                int i4 = onExtraCallbackWithResult + 109;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            public final void onExtraCallbackWithResult(StillCaptureProcessorExternalSyntheticLambda0 stillCaptureProcessorExternalSyntheticLambda0) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 117;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(stillCaptureProcessorExternalSyntheticLambda0, "");
                QualityRatioToResolutionsTableExternalSyntheticLambda0.onExtraCallbackWithResult.onExtraCallbackWithResult(stillCaptureProcessorExternalSyntheticLambda0.asInterface(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().onExtraCallback(), 0.0f, 0.0f, 6, (Object) null);
                RecorderExternalSyntheticLambda14.onExtraCallbackWithResult.IAuthTabCallback(stillCaptureProcessorExternalSyntheticLambda0.IAuthTabCallback(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().IAuthTabCallback(), this.IAuthTabCallback, 0.0f, 4, (Object) null);
                QualityRatioToResolutionsTableExternalSyntheticLambda0.onExtraCallbackWithResult.onExtraCallbackWithResult(stillCaptureProcessorExternalSyntheticLambda0.onWarmupCompleted(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().onExtraCallbackWithResult(), 0.0f, 0.0f, 6, (Object) null);
                stillCaptureProcessorExternalSyntheticLambda0.onNavigationEvent(MlKitAnalyzerExternalSyntheticLambda0.Companion.onNavigationEvent());
                int i4 = onNavigationEvent + 15;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        static final class onExtraCallbackWithResult implements Function1<MaxAppOpenAd<Boolean>, Unit> {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            public static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i = onNavigationEvent + 5;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            onExtraCallbackWithResult() {
            }

            public /* synthetic */ Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 61;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback((MaxAppOpenAd) obj);
                if (i3 == 0) {
                    return Unit.INSTANCE;
                }
                Unit unit = Unit.INSTANCE;
                throw null;
            }

            public final void IAuthTabCallback(MaxAppOpenAd<Boolean> maxAppOpenAd) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 95;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(maxAppOpenAd, "");
                    maxAppOpenAd.onExtraCallbackWithResult(Boolean.TRUE, maxAppOpenAd.IAuthTabCallback(new Function1<removeAdapter, Unit>() { // from class: o.setAndDownscaleBitmap.IAuthTabCallbackStub.onExtraCallbackWithResult.5
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallback = 1;
                        private static int onExtraCallbackWithResult;
                        private static int onWarmupCompleted;

                        static {
                            int i3 = onWarmupCompleted + 25;
                            IAuthTabCallback = i3 % 128;
                            int i4 = i3 % 2;
                        }

                        public /* synthetic */ Object invoke(Object obj) {
                            int i3 = 2 % 2;
                            int i4 = onExtraCallback + 1;
                            onExtraCallbackWithResult = i4 % 128;
                            int i5 = i4 % 2;
                            onNavigationEvent((removeAdapter) obj);
                            Unit unit = Unit.INSTANCE;
                            int i6 = onExtraCallback + 119;
                            onExtraCallbackWithResult = i6 % 128;
                            int i7 = i6 % 2;
                            return unit;
                        }

                        public final void onNavigationEvent(removeAdapter removeadapter) {
                            int i3 = 2 % 2;
                            int i4 = onExtraCallbackWithResult + 93;
                            onExtraCallback = i4 % 128;
                            int i5 = i4 % 2;
                            Intrinsics.checkNotNullParameter(removeadapter, "");
                            removeAdapter.IAuthTabCallback(removeadapter, (Integer) null, (Integer) null, getIconContentView.onWarmupCompleted.IAuthTabCallback(), 1.0f, 3, (Object) null);
                            int i6 = onExtraCallbackWithResult + 51;
                            onExtraCallback = i6 % 128;
                            if (i6 % 2 != 0) {
                                return;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    }));
                    maxAppOpenAd.onExtraCallbackWithResult(Boolean.FALSE, maxAppOpenAd.IAuthTabCallback(new Function1<removeAdapter, Unit>() { // from class: o.setAndDownscaleBitmap.IAuthTabCallbackStub.onExtraCallbackWithResult.4
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallback = 1;
                        private static int onExtraCallbackWithResult;
                        private static int onNavigationEvent;

                        static {
                            int i3 = onExtraCallback + 31;
                            onExtraCallbackWithResult = i3 % 128;
                            if (i3 % 2 != 0) {
                                throw null;
                            }
                        }

                        public /* synthetic */ Object invoke(Object obj) {
                            int i3 = 2 % 2;
                            int i4 = onNavigationEvent + 117;
                            IAuthTabCallback = i4 % 128;
                            int i5 = i4 % 2;
                            onExtraCallbackWithResult((removeAdapter) obj);
                            Unit unit = Unit.INSTANCE;
                            int i6 = IAuthTabCallback + 75;
                            onNavigationEvent = i6 % 128;
                            int i7 = i6 % 2;
                            return unit;
                        }

                        public final void onExtraCallbackWithResult(removeAdapter removeadapter) {
                            Integer num;
                            Integer num2;
                            getStarRatingContentViewGroup getstarratingcontentviewgroupOnExtraCallbackWithResult;
                            float f;
                            int i3;
                            int i4 = 2 % 2;
                            int i5 = onNavigationEvent + 51;
                            IAuthTabCallback = i5 % 128;
                            if (i5 % 2 == 0) {
                                Intrinsics.checkNotNullParameter(removeadapter, "");
                                num = null;
                                num2 = null;
                                getstarratingcontentviewgroupOnExtraCallbackWithResult = getIconContentView.onWarmupCompleted.onExtraCallbackWithResult();
                                f = 1.0f;
                                i3 = 5;
                            } else {
                                Intrinsics.checkNotNullParameter(removeadapter, "");
                                num = null;
                                num2 = null;
                                getstarratingcontentviewgroupOnExtraCallbackWithResult = getIconContentView.onWarmupCompleted.onExtraCallbackWithResult();
                                f = 0.0f;
                                i3 = 3;
                            }
                            removeAdapter.IAuthTabCallback(removeadapter, num, num2, getstarratingcontentviewgroupOnExtraCallbackWithResult, f, i3, (Object) null);
                            int i6 = IAuthTabCallback + 113;
                            onNavigationEvent = i6 % 128;
                            if (i6 % 2 != 0) {
                                int i7 = 63 / 0;
                            }
                        }
                    }));
                    int i3 = 45 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(maxAppOpenAd, "");
                    maxAppOpenAd.onExtraCallbackWithResult(Boolean.TRUE, maxAppOpenAd.IAuthTabCallback(new Function1<removeAdapter, Unit>() { // from class: o.setAndDownscaleBitmap.IAuthTabCallbackStub.onExtraCallbackWithResult.5
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallback = 1;
                        private static int onExtraCallbackWithResult;
                        private static int onWarmupCompleted;

                        static {
                            int i32 = onWarmupCompleted + 25;
                            IAuthTabCallback = i32 % 128;
                            int i4 = i32 % 2;
                        }

                        public /* synthetic */ Object invoke(Object obj) {
                            int i32 = 2 % 2;
                            int i4 = onExtraCallback + 1;
                            onExtraCallbackWithResult = i4 % 128;
                            int i5 = i4 % 2;
                            onNavigationEvent((removeAdapter) obj);
                            Unit unit = Unit.INSTANCE;
                            int i6 = onExtraCallback + 119;
                            onExtraCallbackWithResult = i6 % 128;
                            int i7 = i6 % 2;
                            return unit;
                        }

                        public final void onNavigationEvent(removeAdapter removeadapter) {
                            int i32 = 2 % 2;
                            int i4 = onExtraCallbackWithResult + 93;
                            onExtraCallback = i4 % 128;
                            int i5 = i4 % 2;
                            Intrinsics.checkNotNullParameter(removeadapter, "");
                            removeAdapter.IAuthTabCallback(removeadapter, (Integer) null, (Integer) null, getIconContentView.onWarmupCompleted.IAuthTabCallback(), 1.0f, 3, (Object) null);
                            int i6 = onExtraCallbackWithResult + 51;
                            onExtraCallback = i6 % 128;
                            if (i6 % 2 != 0) {
                                return;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    }));
                    maxAppOpenAd.onExtraCallbackWithResult(Boolean.FALSE, maxAppOpenAd.IAuthTabCallback(new Function1<removeAdapter, Unit>() { // from class: o.setAndDownscaleBitmap.IAuthTabCallbackStub.onExtraCallbackWithResult.4
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallback = 1;
                        private static int onExtraCallbackWithResult;
                        private static int onNavigationEvent;

                        static {
                            int i32 = onExtraCallback + 31;
                            onExtraCallbackWithResult = i32 % 128;
                            if (i32 % 2 != 0) {
                                throw null;
                            }
                        }

                        public /* synthetic */ Object invoke(Object obj) {
                            int i32 = 2 % 2;
                            int i4 = onNavigationEvent + 117;
                            IAuthTabCallback = i4 % 128;
                            int i5 = i4 % 2;
                            onExtraCallbackWithResult((removeAdapter) obj);
                            Unit unit = Unit.INSTANCE;
                            int i6 = IAuthTabCallback + 75;
                            onNavigationEvent = i6 % 128;
                            int i7 = i6 % 2;
                            return unit;
                        }

                        public final void onExtraCallbackWithResult(removeAdapter removeadapter) {
                            Integer num;
                            Integer num2;
                            getStarRatingContentViewGroup getstarratingcontentviewgroupOnExtraCallbackWithResult;
                            float f;
                            int i32;
                            int i4 = 2 % 2;
                            int i5 = onNavigationEvent + 51;
                            IAuthTabCallback = i5 % 128;
                            if (i5 % 2 == 0) {
                                Intrinsics.checkNotNullParameter(removeadapter, "");
                                num = null;
                                num2 = null;
                                getstarratingcontentviewgroupOnExtraCallbackWithResult = getIconContentView.onWarmupCompleted.onExtraCallbackWithResult();
                                f = 1.0f;
                                i32 = 5;
                            } else {
                                Intrinsics.checkNotNullParameter(removeadapter, "");
                                num = null;
                                num2 = null;
                                getstarratingcontentviewgroupOnExtraCallbackWithResult = getIconContentView.onWarmupCompleted.onExtraCallbackWithResult();
                                f = 0.0f;
                                i32 = 3;
                            }
                            removeAdapter.IAuthTabCallback(removeadapter, num, num2, getstarratingcontentviewgroupOnExtraCallbackWithResult, f, i32, (Object) null);
                            int i6 = IAuthTabCallback + 113;
                            onNavigationEvent = i6 % 128;
                            if (i6 % 2 != 0) {
                                int i7 = 63 / 0;
                            }
                        }
                    }));
                }
                int i4 = onExtraCallback + 119;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01cd A[EDGE_INSN: B:131:0x01cd->B:133:0x01d0 BREAK  A[LOOP:0: B:118:0x0199->B:178:0x0199, LOOP_LABEL: LOOP:0: B:118:0x0199->B:178:0x0199]] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, @Nullable JsonUtils jsonUtils, @Nullable ImageViewUtilsExternalSyntheticLambda1 imageViewUtilsExternalSyntheticLambda1, @Nullable Function2<Object, ? super Float, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        JsonUtils jsonUtils2;
        int i4;
        boolean z2;
        final boolean z3;
        ImageViewUtilsExternalSyntheticLambda1 imageViewUtilsExternalSyntheticLambda12;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final JsonUtils jsonUtils3;
        Function2<Object, ? super Float, Unit> function22;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        Function2<Object, ? super Float, Unit> function23;
        boolean zOnExtraCallback;
        boolean zOnNavigationEvent;
        boolean z4;
        int i5;
        boolean z5 = z;
        ImageViewUtilsExternalSyntheticLambda1 imageViewUtilsExternalSyntheticLambda1OnWarmupCompleted = imageViewUtilsExternalSyntheticLambda1;
        int i6 = 2 % 2;
        int i7 = IAuthTabCallback + 121;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(486958602);
        int i9 = i2 & 1;
        if (i9 != 0) {
            int i10 = onNavigationEvent + 107;
            IAuthTabCallback = i10 % 128;
            i3 = i10 % 2 != 0 ? i | 65 : i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2) | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i12 = IAuthTabCallback + 5;
            onNavigationEvent = i12 % 128;
            if (i12 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z5);
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z5) ? 32 : 16;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                jsonUtils2 = jsonUtils;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(jsonUtils2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    int i14 = onNavigationEvent + 53;
                    IAuthTabCallback = i14 % 128;
                    if (i14 % 2 != 0) {
                        int i15 = 76 / 0;
                        i5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(imageViewUtilsExternalSyntheticLambda1OnWarmupCompleted) ? 2048 : 1024;
                    } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(imageViewUtilsExternalSyntheticLambda1OnWarmupCompleted)) {
                    }
                    i3 |= i5;
                }
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362) {
                    int i16 = IAuthTabCallback + 89;
                    onNavigationEvent = i16 % 128;
                    z2 = i16 % 2 != 0;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i3 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                        quirksExternalSyntheticBackport04 = i9 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                        if (i11 != 0) {
                            z5 = false;
                        }
                        JsonUtils jsonUtils4 = i13 != 0 ? null : jsonUtils2;
                        if ((i2 & 8) != 0) {
                            int i17 = IAuthTabCallback + 23;
                            onNavigationEvent = i17 % 128;
                            int i18 = i17 % 2;
                            i3 &= -7169;
                            imageViewUtilsExternalSyntheticLambda1OnWarmupCompleted = ImageViewUtilsExternalSyntheticLambda2.onWarmupCompleted(null, false, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                        }
                        if (i4 != 0) {
                            int i19 = onNavigationEvent + 113;
                            IAuthTabCallback = i19 % 128;
                            if (i19 % 2 != 0) {
                                throw null;
                            }
                            jsonUtils2 = jsonUtils4;
                            function23 = null;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                int i20 = onNavigationEvent + 53;
                                IAuthTabCallback = i20 % 128;
                                int i21 = i20 % 2;
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(486958602, i3, -1, "im.toss.tds.compose.component.compound.agreement.v4.group.TdsAgreementV4Group (TdsAgreementV4Group.kt:72)");
                            }
                            boolean zOnNavigationEvent2 = imageViewUtilsExternalSyntheticLambda1OnWarmupCompleted.onNavigationEvent();
                            getMemoryMappingsOrBuilder<setAndDownscaleImageUri> getmemorymappingsorbuilderOnExtraCallback = imageViewUtilsExternalSyntheticLambda1OnWarmupCompleted.onExtraCallback();
                            zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zOnNavigationEvent2);
                            zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getmemorymappingsorbuilderOnExtraCallback);
                            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(zOnExtraCallback | zOnNavigationEvent) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                if (imageViewUtilsExternalSyntheticLambda1OnWarmupCompleted.onNavigationEvent()) {
                                    getMemoryMappingsOrBuilder<setAndDownscaleImageUri> getmemorymappingsorbuilderOnExtraCallback2 = imageViewUtilsExternalSyntheticLambda1OnWarmupCompleted.onExtraCallback();
                                    if (getmemorymappingsorbuilderOnExtraCallback2 == null || !getmemorymappingsorbuilderOnExtraCallback2.isEmpty()) {
                                        loop0: for (setAndDownscaleImageUri setanddownscaleimageuri : getmemorymappingsorbuilderOnExtraCallback2) {
                                            if (!setanddownscaleimageuri.IAuthTabCallback()) {
                                                getMemoryMappingsOrBuilder<setAndDownscaleImageUri> getmemorymappingsorbuilderOnWarmupCompleted = setanddownscaleimageuri.onWarmupCompleted();
                                                if (getmemorymappingsorbuilderOnWarmupCompleted == null || !getmemorymappingsorbuilderOnWarmupCompleted.isEmpty()) {
                                                    Iterator it = getmemorymappingsorbuilderOnWarmupCompleted.iterator();
                                                    while (it.hasNext()) {
                                                        if (((setAndDownscaleImageUri) it.next()).IAuthTabCallback()) {
                                                        }
                                                    }
                                                }
                                            }
                                            z4 = false;
                                        }
                                    }
                                    z4 = true;
                                    objOnMinimized = Boolean.valueOf(z4);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                } else {
                                    z4 = false;
                                    objOnMinimized = Boolean.valueOf(z4);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                }
                            }
                            boolean zBooleanValue = ((Boolean) objOnMinimized).booleanValue();
                            float fOnWarmupCompleted = getFixedPositions.onWarmupCompleted(accessgetTlsVersionsAsStringp.Typography5, 0.0f, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 2);
                            boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fOnWarmupCompleted);
                            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (zIAuthTabCallback || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized2 = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f * fOnWarmupCompleted));
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                            }
                            float fIAuthTabCallback = ((VirtualCameraControlExternalSyntheticLambda1) objOnMinimized2).IAuthTabCallback();
                            boolean zIAuthTabCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fOnWarmupCompleted);
                            boolean zIAuthTabCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fIAuthTabCallback);
                            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if ((zIAuthTabCallback2 | zIAuthTabCallback3) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                float f = 32.0f;
                                if (fOnWarmupCompleted > 1.0f) {
                                    int i22 = IAuthTabCallback + 105;
                                    onNavigationEvent = i22 % 128;
                                    f = i22 % 2 == 0 ? ((((fOnWarmupCompleted / 32.0f) / 32.0f) - 2.0f) / 32.0f) % (1.0f + fIAuthTabCallback) : ((((fOnWarmupCompleted * 32.0f) - 32.0f) / 2.0f) + 32.0f) - (fIAuthTabCallback / 2.0f);
                                }
                                objOnMinimized3 = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f));
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                            }
                            float fIAuthTabCallback2 = ((VirtualCameraControlExternalSyntheticLambda1) objOnMinimized3).IAuthTabCallback();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport04, 0.0f, 1, (Object) null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-270267499);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-3687241);
                            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                            if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized4 = new Recorder();
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                            Recorder recorder = (Recorder) objOnMinimized4;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-3687241);
                            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized5 = new LifecycleCameraProviderImplExternalSyntheticLambda2();
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                            LifecycleCameraProviderImplExternalSyntheticLambda2 lifecycleCameraProviderImplExternalSyntheticLambda2 = (LifecycleCameraProviderImplExternalSyntheticLambda2) objOnMinimized5;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-3687241);
                            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                                int i23 = IAuthTabCallback + 31;
                                onNavigationEvent = i23 % 128;
                                objOnMinimized6 = i23 % 2 == 0 ? CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 3, (Object) null) : CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                            Pair pairOnNavigationEvent = onProcessCompleted.onNavigationEvent(257, lifecycleCameraProviderImplExternalSyntheticLambda2, (getSupportedHighSpeedResolutionsFor) objOnMinimized6, recorder, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 4544);
                            callAllGets.onExtraCallbackWithResult(getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback, false, new onNavigationEvent(recorder), 1, (Object) null), ForwardingCameraControl.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, -819893854, true, new onExtraCallback(lifecycleCameraProviderImplExternalSyntheticLambda2, 0, (Function0) pairOnNavigationEvent.IAuthTabCallback(), imageViewUtilsExternalSyntheticLambda1OnWarmupCompleted, zBooleanValue, z5, jsonUtils2, function23, fIAuthTabCallback, fIAuthTabCallback2)), (component5) pairOnNavigationEvent.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 0);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            z3 = z5;
                            function22 = function23;
                            imageViewUtilsExternalSyntheticLambda12 = imageViewUtilsExternalSyntheticLambda1OnWarmupCompleted;
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                            jsonUtils3 = jsonUtils2;
                        } else {
                            jsonUtils2 = jsonUtils4;
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                    }
                    function23 = function2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    boolean zOnNavigationEvent22 = imageViewUtilsExternalSyntheticLambda1OnWarmupCompleted.onNavigationEvent();
                    getMemoryMappingsOrBuilder<setAndDownscaleImageUri> getmemorymappingsorbuilderOnExtraCallback3 = imageViewUtilsExternalSyntheticLambda1OnWarmupCompleted.onExtraCallback();
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zOnNavigationEvent22);
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getmemorymappingsorbuilderOnExtraCallback3);
                    Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!(zOnExtraCallback | zOnNavigationEvent)) {
                        if (imageViewUtilsExternalSyntheticLambda1OnWarmupCompleted.onNavigationEvent()) {
                        }
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    z3 = z5;
                    imageViewUtilsExternalSyntheticLambda12 = imageViewUtilsExternalSyntheticLambda1OnWarmupCompleted;
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                    jsonUtils3 = jsonUtils2;
                    function22 = function2;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final ImageViewUtilsExternalSyntheticLambda1 imageViewUtilsExternalSyntheticLambda13 = imageViewUtilsExternalSyntheticLambda12;
                    final Function2<Object, ? super Float, Unit> function24 = function22;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.group.TdsAgreementV4GroupKt$$ExternalSyntheticLambda15
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallbackWithResult;

                        public final Object invoke(Object obj, Object obj2) {
                            int i24 = 2 % 2;
                            int i25 = IAuthTabCallback + 39;
                            onExtraCallbackWithResult = i25 % 128;
                            if (i25 % 2 == 0) {
                                return setAndDownscaleBitmap.onExtraCallbackWithResult(quirksExternalSyntheticBackport03, z3, jsonUtils3, imageViewUtilsExternalSyntheticLambda13, function24, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            }
                            setAndDownscaleBitmap.onExtraCallbackWithResult(quirksExternalSyntheticBackport03, z3, jsonUtils3, imageViewUtilsExternalSyntheticLambda13, function24, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            throw null;
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            if ((i3 & 9363) != 9362) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        jsonUtils2 = jsonUtils;
        if ((i & 3072) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        if ((i3 & 9363) != 9362) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final getBacktraceNote onNavigationEvent(final setAndDownscaleImageUri setanddownscaleimageuri, final int i, final Function2 function2, final setAndDownscaleImageUri setanddownscaleimageuri2, final getBacktraceNote getbacktracenote) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setanddownscaleimageuri2, "");
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(1199512524, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.agreement.v4.group.TdsAgreementV4GroupKt$$ExternalSyntheticLambda20
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i3 = 2 % 2;
                int i4 = onExtraCallbackWithResult + 19;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnWarmupCompleted = setAndDownscaleBitmap.onWarmupCompleted(setanddownscaleimageuri2, setanddownscaleimageuri, i, getbacktracenote, function2, (r8lambda6FdWI3gCwdfToUXuRhHFsclpRbc) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i6 = onExtraCallback + 89;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 88 / 0;
                }
                return unitOnWarmupCompleted;
            }
        });
        int i3 = onNavigationEvent + 65;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(Object obj, Function2 function2, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(futures3, "");
        if (obj != null) {
            int i4 = onNavigationEvent;
            int i5 = i4 + 115;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 25 / 0;
                if (function2 != null) {
                    int i7 = i4 + 111;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    function2.invoke(obj, Float.valueOf(Float.intBitsToFloat((int) FuturesCallbackListener.IAuthTabCallback(futures3).IAuthTabCallbackStub())));
                    int i9 = IAuthTabCallback + 111;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                }
            } else if (function2 != null) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(setAndDownscaleImageUri setanddownscaleimageuri, setAndDownscaleImageUri setanddownscaleimageuri2, int i, getBacktraceNote getbacktracenote, final Function2 function2, r8lambda6FdWI3gCwdfToUXuRhHFsclpRbc r8lambda6fdwi3gcwdftouxurhhfsclprbc, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        float f;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda6fdwi3gcwdftouxurhhfsclprbc, "");
        boolean z = false;
        if ((i2 & 6) == 0) {
            int i6 = onNavigationEvent + 7;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 10 / 0;
                if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambda6fdwi3gcwdftouxurhhfsclprbc)) {
                    i4 = 2;
                } else {
                    int i8 = onNavigationEvent + 77;
                    IAuthTabCallback = i8 % 128;
                    i4 = i8 % 2 != 0 ? 5 : 4;
                }
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambda6fdwi3gcwdftouxurhhfsclprbc)) {
            }
            i3 = i2 | i4;
        } else {
            i3 = i2;
        }
        if ((i3 & 19) != 18) {
            int i9 = IAuthTabCallback + 79;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            int i11 = IAuthTabCallback + 11;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1199512524, i3, -1, "im.toss.tds.compose.component.compound.agreement.v4.group.AgreementSubGroup.<anonymous>.<anonymous>.<anonymous> (TdsAgreementV4Group.kt:175)");
                int i12 = IAuthTabCallback + 35;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
            }
            final Object objIAuthTabCallbackDefault = setanddownscaleimageuri.IAuthTabCallbackDefault();
            tryToStringMap trytostringmapOnExtraCallbackWithResult = toStringObjectMap.onExtraCallbackWithResult(objIAuthTabCallbackDefault, setanddownscaleimageuri.getInterfaceDescriptor(), setanddownscaleimageuri.onTransact(), setanddownscaleimageuri.access000(), i, setanddownscaleimageuri.IAuthTabCallback_Parcel(), setanddownscaleimageuri2.extraCallbackWithResult(), setanddownscaleimageuri.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
            getBacktraceNote<removeObjectsForKeys, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteOnExtraCallback = setanddownscaleimageuri.onExtraCallback();
            getBacktraceNote<removeTrimmedEmptyStrings, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteAsInterface = setanddownscaleimageuri.asInterface();
            getBacktraceNote<r8lambdaAoRAK_EUklU6WmR1TC7MRkXW5HY, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteIAuthTabCallbackStubProxy = setanddownscaleimageuri.IAuthTabCallbackStubProxy();
            getBacktraceNote<toIntegerList, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteAccess100 = setanddownscaleimageuri.access100();
            getBacktraceNote<shallowCopy, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteOnNavigationEvent = setanddownscaleimageuri.onNavigationEvent();
            getBacktraceNote getbacktracenote2 = (setanddownscaleimageuri.writeTypedObject() && setanddownscaleimageuri.asBinder()) ? getbacktracenote : null;
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            if (setanddownscaleimageuri.IAuthTabCallback_Parcel()) {
                int i14 = IAuthTabCallback + 43;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                f = 6.0f;
            } else {
                f = 0.0f;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f), 7, (Object) null);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(objIAuthTabCallbackDefault);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function2);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | zOnNavigationEvent)) {
                int i16 = onNavigationEvent + 21;
                IAuthTabCallback = i16 % 128;
                int i17 = i16 % 2;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.group.TdsAgreementV4GroupKt$$ExternalSyntheticLambda16
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj) {
                            int i18 = 2 % 2;
                            int i19 = onNavigationEvent + 11;
                            onWarmupCompleted = i19 % 128;
                            int i20 = i19 % 2;
                            Object obj2 = objIAuthTabCallbackDefault;
                            if (i20 == 0) {
                                return setAndDownscaleBitmap.onExtraCallback(obj2, function2, (Futures3) obj);
                            }
                            setAndDownscaleBitmap.onExtraCallback(obj2, function2, (Futures3) obj);
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                r8lambda6fdwi3gcwdftouxurhhfsclprbc.IAuthTabCallback(getbacktracenoteOnExtraCallback, r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized), trytostringmapOnExtraCallbackWithResult, getbacktracenoteAsInterface, getbacktracenoteIAuthTabCallbackStubProxy, getbacktracenoteAccess100, getbacktracenote2, getbacktracenoteOnNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult, 234881024 & (i3 << 24), 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i18 = IAuthTabCallback + 89;
            onNavigationEvent = i18 % 128;
            if (i18 % 2 == 0) {
                int i19 = 5 % 4;
            }
        }
        return Unit.INSTANCE;
    }

    private static final getBacktraceNote onExtraCallback(final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final Function2 function2, final Function2 function22, final setAndDownscaleImageUri setanddownscaleimageuri) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setanddownscaleimageuri, "");
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-1611400353, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.agreement.v4.group.TdsAgreementV4GroupKt$$ExternalSyntheticLambda2
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 87;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Object obj4 = null;
                setAndDownscaleImageUri setanddownscaleimageuri2 = setanddownscaleimageuri;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                Function2 function23 = function2;
                Function2 function24 = function22;
                r8lambda6FdWI3gCwdfToUXuRhHFsclpRbc r8lambda6fdwi3gcwdftouxurhhfsclprbc = (r8lambda6FdWI3gCwdfToUXuRhHFsclpRbc) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (i4 == 0) {
                    setAndDownscaleBitmap.onExtraCallbackWithResult(setanddownscaleimageuri2, quirksExternalSyntheticBackport02, function23, function24, r8lambda6fdwi3gcwdftouxurhhfsclprbc, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = setAndDownscaleBitmap.onExtraCallbackWithResult(setanddownscaleimageuri2, quirksExternalSyntheticBackport02, function23, function24, r8lambda6fdwi3gcwdftouxurhhfsclprbc, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i5 = onWarmupCompleted + 41;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnExtraCallbackWithResult;
                }
                obj4.hashCode();
                throw null;
            }
        });
        int i2 = IAuthTabCallback + 107;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(Object obj, Function2 function2, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(futures3, "");
            int i3 = 38 / 0;
            if (obj != null) {
                if (function2 != null) {
                    int i4 = onNavigationEvent + 71;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        function2.invoke(obj, Float.valueOf(Float.intBitsToFloat((int) FuturesCallbackListener.IAuthTabCallback(futures3).IAuthTabCallbackStub())));
                        throw null;
                    }
                    function2.invoke(obj, Float.valueOf(Float.intBitsToFloat((int) FuturesCallbackListener.IAuthTabCallback(futures3).IAuthTabCallbackStub())));
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(futures3, "");
            if (obj != null) {
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(r8lambdaNBxVhWOH9H5GRBwkiOB26o8EVuM r8lambdanbxvhwoh9h5grbwkiob26o8evum, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        r8lambdanbxvhwoh9h5grbwkiob26o8evum.IAuthTabCallback(!r8lambdanbxvhwoh9h5grbwkiob26o8evum.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 61;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(putFloatArray putfloatarray, final r8lambdaNBxVhWOH9H5GRBwkiOB26o8EVuM r8lambdanbxvhwoh9h5grbwkiob26o8evum, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException, Resources.NotFoundException {
        int i2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 27;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            int i6 = IAuthTabCallback + 3;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset);
                throw null;
            }
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset))) {
                int i7 = IAuthTabCallback + 89;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-88116298, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.group.AgreementSubGroup.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsAgreementV4Group.kt:236)");
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambdanbxvhwoh9h5grbwkiob26o8evum);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                int i9 = onNavigationEvent + 77;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Object obj2 = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.group.TdsAgreementV4GroupKt$$ExternalSyntheticLambda19
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallback;

                        public final Object invoke(Object obj3) {
                            int i11 = 2 % 2;
                            int i12 = IAuthTabCallback + 65;
                            onExtraCallback = i12 % 128;
                            if (i12 % 2 != 0) {
                                setAndDownscaleBitmap.IAuthTabCallback(r8lambdanbxvhwoh9h5grbwkiob26o8evum, obj3);
                                Object obj4 = null;
                                obj4.hashCode();
                                throw null;
                            }
                            Unit unitIAuthTabCallback = setAndDownscaleBitmap.IAuthTabCallback(r8lambdanbxvhwoh9h5grbwkiob26o8evum, obj3);
                            int i13 = IAuthTabCallback + 49;
                            onExtraCallback = i13 % 128;
                            int i14 = i13 % 2;
                            return unitIAuthTabCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(obj2);
                    obj = obj2;
                }
                rightPreset.onExtraCallbackWithResult(putfloatarray, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResult, (i << 6) & 896, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Object obj = objArr[0];
        Function2 function2 = (Function2) objArr[1];
        setAndDownscaleImageUri setanddownscaleimageuri = (setAndDownscaleImageUri) objArr[2];
        final putFloatArray putfloatarray = (putFloatArray) objArr[3];
        int i = 4;
        final r8lambdaNBxVhWOH9H5GRBwkiOB26o8EVuM r8lambdanbxvhwoh9h5grbwkiob26o8evum = (r8lambdaNBxVhWOH9H5GRBwkiOB26o8EVuM) objArr[4];
        synchronizedList synchronizedlist = (synchronizedList) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(synchronizedlist, "");
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(synchronizedlist)) {
                int i3 = onNavigationEvent + 107;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onNavigationEvent + 67;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(609641959, iIntValue, -1, "im.toss.tds.compose.component.compound.agreement.v4.group.AgreementSubGroup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsAgreementV4Group.kt:233)");
                    int i6 = 40 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(609641959, iIntValue, -1, "im.toss.tds.compose.component.compound.agreement.v4.group.AgreementSubGroup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsAgreementV4Group.kt:233)");
                }
            }
            synchronizedlist.onNavigationEvent(obj, (getBacktraceNote) function2.invoke(setanddownscaleimageuri, ForwardingCameraControl.onExtraCallback(-88116298, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.agreement.v4.group.TdsAgreementV4GroupKt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException, Resources.NotFoundException {
                    int i7 = 2 % 2;
                    int i8 = onExtraCallback + 5;
                    IAuthTabCallback = i8 % 128;
                    if (i8 % 2 != 0) {
                        setAndDownscaleBitmap.onExtraCallback(putfloatarray, r8lambdanbxvhwoh9h5grbwkiob26o8evum, (RightPreset) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                    Unit unitOnExtraCallback = setAndDownscaleBitmap.onExtraCallback(putfloatarray, r8lambdanbxvhwoh9h5grbwkiob26o8evum, (RightPreset) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i9 = IAuthTabCallback + 95;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    return unitOnExtraCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54)), cameraCaptureResultEmptyCameraCaptureResult, (iIntValue << 6) & 896);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = IAuthTabCallback + 15;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(setAndDownscaleImageUri setanddownscaleimageuri, Function2 function2, toJSONArray tojsonarray, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(tojsonarray, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(tojsonarray)) {
                int i4 = IAuthTabCallback + 79;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            int i6 = IAuthTabCallback + 69;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = IAuthTabCallback + 21;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(558529819, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.group.AgreementSubGroup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsAgreementV4Group.kt:242)");
                    int i9 = 47 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(558529819, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.group.AgreementSubGroup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsAgreementV4Group.kt:242)");
                }
            }
            getMemoryMappingsOrBuilder<setAndDownscaleImageUri> getmemorymappingsorbuilderOnWarmupCompleted = setanddownscaleimageuri.onWarmupCompleted();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(getmemorymappingsorbuilderOnWarmupCompleted, 10));
            Iterator it = getmemorymappingsorbuilderOnWarmupCompleted.iterator();
            while (it.hasNext()) {
                int i10 = onNavigationEvent + 11;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                arrayList.add((getBacktraceNote) function2.invoke((setAndDownscaleImageUri) it.next(), (Object) null));
            }
            tojsonarray.onNavigationEvent(getOpenFdsCount.onExtraCallbackWithResult(arrayList), cameraCaptureResultEmptyCameraCaptureResult, (i << 3) & 112);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(final setAndDownscaleImageUri setanddownscaleimageuri, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final Function2 function2, final Function2 function22, r8lambda6FdWI3gCwdfToUXuRhHFsclpRbc r8lambda6fdwi3gcwdftouxurhhfsclprbc, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        putIntArray putintarray;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda6fdwi3gcwdftouxurhhfsclprbc, "");
        if ((i & 6) == 0) {
            int i4 = onNavigationEvent + 109;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambda6fdwi3gcwdftouxurhhfsclprbc) ? 4 : 2;
            int i7 = IAuthTabCallback + 51;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            i2 = i | i6;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            int i9 = onNavigationEvent + 109;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i11 = onNavigationEvent + 87;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = IAuthTabCallback + 57;
                onNavigationEvent = i13 % 128;
                if (i13 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1611400353, i2, -1, "im.toss.tds.compose.component.compound.agreement.v4.group.AgreementSubGroup.<anonymous>.<anonymous>.<anonymous> (TdsAgreementV4Group.kt:210)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1611400353, i2, -1, "im.toss.tds.compose.component.compound.agreement.v4.group.AgreementSubGroup.<anonymous>.<anonymous>.<anonymous> (TdsAgreementV4Group.kt:210)");
            }
            final Object objIAuthTabCallbackDefault = setanddownscaleimageuri.IAuthTabCallbackDefault();
            final r8lambdaNBxVhWOH9H5GRBwkiOB26o8EVuM r8lambdanbxvhwoh9h5grbwkiob26o8evumOnWarmupCompleted = r8lambdaitkxxTyAPHmEU5WnQXvTDjIGs.onWarmupCompleted(objIAuthTabCallbackDefault, false, setanddownscaleimageuri.IAuthTabCallbackStub(), cameraCaptureResultEmptyCameraCaptureResult, 0, 2);
            if (r8lambdanbxvhwoh9h5grbwkiob26o8evumOnWarmupCompleted.onNavigationEvent()) {
                int i14 = IAuthTabCallback + 63;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                putintarray = putIntArray.onNavigationEvent.onNavigationEvent;
            } else {
                putintarray = putIntArray.onWarmupCompleted.onNavigationEvent;
            }
            final putFloatArray putfloatarrayIAuthTabCallback = putStringArrayList.IAuthTabCallback(objIAuthTabCallbackDefault, putintarray, setanddownscaleimageuri.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(objIAuthTabCallbackDefault);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function2);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnExtraCallback | zOnNavigationEvent) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.group.TdsAgreementV4GroupKt$$ExternalSyntheticLambda8
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i16 = 2 % 2;
                        int i17 = onNavigationEvent + 89;
                        IAuthTabCallback = i17 % 128;
                        int i18 = i17 % 2;
                        Unit unitOnWarmupCompleted = setAndDownscaleBitmap.onWarmupCompleted(objIAuthTabCallbackDefault, function2, (Futures3) obj);
                        int i19 = IAuthTabCallback + 3;
                        onNavigationEvent = i19 % 128;
                        if (i19 % 2 != 0) {
                            return unitOnWarmupCompleted;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            r8lambda6fdwi3gcwdftouxurhhfsclprbc.onWarmupCompleted(r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0, (Function1) objOnMinimized), r8lambdanbxvhwoh9h5grbwkiob26o8evumOnWarmupCompleted, ForwardingCameraControl.onExtraCallback(609641959, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.agreement.v4.group.TdsAgreementV4GroupKt$$ExternalSyntheticLambda9
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i16 = 2 % 2;
                    int i17 = onExtraCallbackWithResult + 31;
                    onNavigationEvent = i17 % 128;
                    if (i17 % 2 != 0) {
                        return setAndDownscaleBitmap.onNavigationEvent(objIAuthTabCallbackDefault, function22, setanddownscaleimageuri, putfloatarrayIAuthTabCallback, r8lambdanbxvhwoh9h5grbwkiob26o8evumOnWarmupCompleted, (synchronizedList) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    Unit unitOnNavigationEvent = setAndDownscaleBitmap.onNavigationEvent(objIAuthTabCallbackDefault, function22, setanddownscaleimageuri, putfloatarrayIAuthTabCallback, r8lambdanbxvhwoh9h5grbwkiob26o8evumOnWarmupCompleted, (synchronizedList) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i18 = 1 / 0;
                    return unitOnNavigationEvent;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(558529819, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.agreement.v4.group.TdsAgreementV4GroupKt$$ExternalSyntheticLambda10
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit unitOnExtraCallbackWithResult;
                    int i16 = 2 % 2;
                    int i17 = IAuthTabCallback + 11;
                    onNavigationEvent = i17 % 128;
                    if (i17 % 2 == 0) {
                        unitOnExtraCallbackWithResult = setAndDownscaleBitmap.onExtraCallbackWithResult(setanddownscaleimageuri, function22, (toJSONArray) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i18 = 78 / 0;
                    } else {
                        unitOnExtraCallbackWithResult = setAndDownscaleBitmap.onExtraCallbackWithResult(setanddownscaleimageuri, function22, (toJSONArray) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    int i19 = onNavigationEvent + 111;
                    IAuthTabCallback = i19 % 128;
                    int i20 = i19 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 12) & 57344) | 3456, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    static final class IAuthTabCallback implements Function1<flipHorizontally, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 onExtraCallbackWithResult;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> onNavigationEvent;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> onWarmupCompleted;

        IAuthTabCallback(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled2) {
            this.onWarmupCompleted = isqueryrefinementenabled;
            this.onExtraCallbackWithResult = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
            this.onNavigationEvent = isqueryrefinementenabled2;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((flipHorizontally) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 49;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onWarmupCompleted(flipHorizontally fliphorizontally) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            fliphorizontally.IAuthTabCallbackStub(((Number) this.onWarmupCompleted.IAuthTabCallback()).floatValue());
            fliphorizontally.access000(this.onExtraCallbackWithResult.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(((Number) this.onNavigationEvent.IAuthTabCallback()).floatValue())));
            int i4 = onExtraCallback + 103;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(setAndDownscaleImageUri setanddownscaleimageuri, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onNavigationEvent = i2 % 128;
        setanddownscaleimageuri.onNavigationEvent(!(i2 % 2 == 0 ? setanddownscaleimageuri.IAuthTabCallbackStub() : setanddownscaleimageuri.IAuthTabCallbackStub()));
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 93;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws NoWhenBranchMatchedException, Resources.NotFoundException {
        boolean z = false;
        putFloatArray putfloatarray = (putFloatArray) objArr[0];
        final setAndDownscaleImageUri setanddownscaleimageuri = (setAndDownscaleImageUri) objArr[1];
        RightPreset rightPreset = (RightPreset) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int i = 4;
        int iIntValue = ((Number) objArr[4]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((iIntValue & 6) == 0) {
            int i3 = IAuthTabCallback + 117;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                int i5 = onNavigationEvent + 117;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) != 18) {
            int i7 = onNavigationEvent + 121;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            int i9 = IAuthTabCallback + 31;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onNavigationEvent + 25;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1252130430, iIntValue, -1, "im.toss.tds.compose.component.compound.agreement.v4.group.AgreementSubGroup.<anonymous>.<anonymous> (TdsAgreementV4Group.kt:261)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1252130430, iIntValue, -1, "im.toss.tds.compose.component.compound.agreement.v4.group.AgreementSubGroup.<anonymous>.<anonymous> (TdsAgreementV4Group.kt:261)");
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(setanddownscaleimageuri);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Object obj3 = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.group.TdsAgreementV4GroupKt$$ExternalSyntheticLambda17
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj4) {
                            int i12 = 2 % 2;
                            int i13 = onNavigationEvent + 65;
                            IAuthTabCallback = i13 % 128;
                            if (i13 % 2 != 0) {
                                Object[] objArr2 = {setanddownscaleimageuri, obj4};
                                Object obj5 = null;
                                obj5.hashCode();
                                throw null;
                            }
                            Object[] objArr3 = {setanddownscaleimageuri, obj4};
                            Unit unit = (Unit) setAndDownscaleBitmap.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr3, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -683588490, 683588494, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
                            int i14 = onNavigationEvent + 3;
                            IAuthTabCallback = i14 % 128;
                            int i15 = i14 % 2;
                            return unit;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(obj3);
                    obj2 = obj3;
                }
                rightPreset.onExtraCallbackWithResult(putfloatarray, (Function1) obj2, cameraCaptureResultEmptyCameraCaptureResult, (iIntValue << 6) & 896, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(final setAndDownscaleImageUri setanddownscaleimageuri, Function2 function2, final putFloatArray putfloatarray, synchronizedList synchronizedlist, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(synchronizedlist, "");
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(synchronizedlist) ? 4 : 2;
        }
        Object obj = null;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            int i3 = IAuthTabCallback + 115;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = IAuthTabCallback + 65;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-749994061, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.group.AgreementSubGroup.<anonymous> (TdsAgreementV4Group.kt:260)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-749994061, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.group.AgreementSubGroup.<anonymous> (TdsAgreementV4Group.kt:260)");
                int i5 = onNavigationEvent + 43;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            synchronizedlist.onNavigationEvent(setanddownscaleimageuri.IAuthTabCallbackDefault(), (getBacktraceNote) function2.invoke(setanddownscaleimageuri, ForwardingCameraControl.onExtraCallback(-1252130430, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.agreement.v4.group.TdsAgreementV4GroupKt$$ExternalSyntheticLambda18
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i7 = 2 % 2;
                    int i8 = onNavigationEvent + 61;
                    onExtraCallback = i8 % 128;
                    if (i8 % 2 != 0) {
                        Object[] objArr = {putfloatarray, setanddownscaleimageuri, (RightPreset) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())};
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                    Object[] objArr2 = {putfloatarray, setanddownscaleimageuri, (RightPreset) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())};
                    Unit unit = (Unit) setAndDownscaleBitmap.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr2, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1414448399, 1414448400, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
                    int i9 = onNavigationEvent + 113;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    return unit;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54)), cameraCaptureResultEmptyCameraCaptureResult, (i << 6) & 896);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 45;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(setAndDownscaleImageUri setanddownscaleimageuri, Function1 function1, Function2 function2, toJSONArray tojsonarray, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        getBacktraceNote getbacktracenote;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(tojsonarray, "");
        if ((i & 6) == 0) {
            int i4 = onNavigationEvent + 17;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(tojsonarray)) {
                int i6 = IAuthTabCallback + 65;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onNavigationEvent + 61;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(245204711, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.group.AgreementSubGroup.<anonymous> (TdsAgreementV4Group.kt:267)");
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-581470993);
            getMemoryMappingsOrBuilder<setAndDownscaleImageUri> getmemorymappingsorbuilderOnWarmupCompleted = setanddownscaleimageuri.onWarmupCompleted();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(getmemorymappingsorbuilderOnWarmupCompleted, 10));
            for (setAndDownscaleImageUri setanddownscaleimageuri2 : getmemorymappingsorbuilderOnWarmupCompleted) {
                Object obj = null;
                if (setanddownscaleimageuri2.asBinder()) {
                    int i10 = IAuthTabCallback + 105;
                    onNavigationEvent = i10 % 128;
                    if (i10 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(709256383);
                        cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                        cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        obj.hashCode();
                        throw null;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(709256383);
                    boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = (getBacktraceNote) function1.invoke(setanddownscaleimageuri2);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    getbacktracenote = (getBacktraceNote) objOnMinimized;
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(709424000);
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(setanddownscaleimageuri2);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnNavigationEvent2) {
                        Object obj2 = objOnMinimized2;
                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            getBacktraceNote getbacktracenote2 = (getBacktraceNote) function2.invoke(setanddownscaleimageuri2, (Object) null);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(getbacktracenote2);
                            obj2 = getbacktracenote2;
                        }
                        getbacktracenote = (getBacktraceNote) obj2;
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                }
                arrayList.add(getbacktracenote);
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            tojsonarray.onNavigationEvent(getOpenFdsCount.onExtraCallbackWithResult(arrayList), cameraCaptureResultEmptyCameraCaptureResult, (i << 3) & 112);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = IAuthTabCallback + 19;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ int $animDelay;
        final /* synthetic */ boolean $enableMotion;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $opacity;
        final /* synthetic */ JsonUtils $slideMotion;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $translationY;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(boolean z, JsonUtils jsonUtils, int i, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled2, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$enableMotion = z;
            this.$slideMotion = jsonUtils;
            this.$animDelay = i;
            this.$opacity = isqueryrefinementenabled;
            this.$translationY = isqueryrefinementenabled2;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 37 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$enableMotion, this.$slideMotion, this.$animDelay, this.$opacity, this.$translationY, access13800Var);
            onextracallbackwithresult.L$0 = obj;
            int i2 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallbackwithresult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 7;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objIAuthTabCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        /* renamed from: o.setAndDownscaleBitmap$onExtraCallbackWithResult$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;
            final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $opacity;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, access13800<? super AnonymousClass5> access13800Var) {
                super(2, access13800Var);
                this.$opacity = isqueryrefinementenabled;
            }

            public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 37;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object obj = null;
                AnonymousClass5 anonymousClass5Create = create(findresandmsg, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i3 == 0) {
                    anonymousClass5Create.invokeSuspend(unit);
                    obj.hashCode();
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass5Create.invokeSuspend(unit);
                int i4 = onExtraCallbackWithResult + 35;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$opacity, access13800Var);
                int i2 = onExtraCallback + 87;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass5;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 43;
                onExtraCallbackWithResult = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 != 0) {
                    IAuthTabCallback(findresandmsg, access13800Var);
                    throw null;
                }
                Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
                int i3 = onExtraCallbackWithResult + 1;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return objIAuthTabCallback;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$opacity;
                    Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(1.0f);
                    getThumbPosition getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallback(), 0, 2, (Object) null);
                    this.label = 1;
                    if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, getthumbpositionOnExtraCallback, (Object) null, (Function1) null, this, 12, (Object) null) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = onExtraCallback + 3;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    ResultKt.onNavigationEvent(obj);
                }
                Unit unit = Unit.INSTANCE;
                int i5 = onExtraCallback + 113;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 7 / 0;
                }
                return unit;
            }
        }

        /* renamed from: o.setAndDownscaleBitmap$onExtraCallbackWithResult$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $translationY;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, access13800<? super AnonymousClass4> access13800Var) {
                super(2, access13800Var);
                this.$translationY = isqueryrefinementenabled;
            }

            public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 7;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass4 anonymousClass4Create = create(findresandmsg, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i3 == 0) {
                    anonymousClass4Create.invokeSuspend(unit);
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass4Create.invokeSuspend(unit);
                int i4 = onExtraCallback + 83;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$translationY, access13800Var);
                int i2 = onExtraCallback + 59;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass4;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 35;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
                int i4 = onNavigationEvent + 71;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return objIAuthTabCallback;
                }
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = onNavigationEvent;
                    int i4 = i3 + 33;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = i3 + 33;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$translationY;
                    Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(0.0f);
                    getThumbPosition getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallback(), 0, 2, (Object) null);
                    this.label = 1;
                    if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, getthumbpositionOnExtraCallback, (Object) null, (Function1) null, this, 12, (Object) null) == objOnWarmupCompleted) {
                        int i8 = onExtraCallback + 31;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                        return objOnWarmupCompleted;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        
            if (o.formatMsgs.onWarmupCompleted(r3, r9) == r2) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
        
            if (o.formatMsgs.onWarmupCompleted(r5, r9) == r2) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
        
            return r2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (this.$enableMotion) {
                    int i3 = onExtraCallbackWithResult + 65;
                    int i4 = i3 % 128;
                    IAuthTabCallback = i4;
                    int i5 = i3 % 2;
                    if (this.$slideMotion != null) {
                        int i6 = i4 + 63;
                        onExtraCallbackWithResult = i6 % 128;
                        if (i6 % 2 == 0) {
                            long j = this.$animDelay;
                            this.L$0 = findresandmsg;
                            this.label = 0;
                        } else {
                            long j2 = this.$animDelay;
                            this.L$0 = findresandmsg;
                            this.label = 1;
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
                int i7 = onExtraCallbackWithResult + 59;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                return unit;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            int i9 = onExtraCallbackWithResult + 57;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 4 / 5;
            }
            maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass5(this.$opacity, null), 3, (Object) null);
            maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass4(this.$translationY, null), 3, (Object) null);
            Unit unit2 = Unit.INSTANCE;
            int i72 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i72 % 128;
            int i82 = i72 % 2;
            return unit2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(final setAndDownscaleImageUri setanddownscaleimageuri, final int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, JsonUtils jsonUtils, Function2<Object, ? super Float, Unit> function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) throws Throwable {
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i5;
        int i6;
        boolean z2;
        int i7;
        JsonUtils jsonUtils2;
        int i8;
        Function2<Object, ? super Float, Unit> function22;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final boolean z3;
        final Function2<Object, ? super Float, Unit> function23;
        final JsonUtils jsonUtils3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        final Function2<Object, ? super Float, Unit> function24;
        boolean z4;
        int i9;
        Object obj;
        boolean z5;
        boolean z6;
        boolean z7;
        isQueryRefinementEnabled isqueryrefinementenabled;
        isQueryRefinementEnabled isqueryrefinementenabled2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback;
        int i10;
        int i11 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-269325059);
        if ((i2 & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setanddownscaleimageuri) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i))) {
                int i12 = IAuthTabCallback + 65;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                i10 = 32;
            } else {
                i10 = 16;
            }
            i4 |= i10;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    int i15 = IAuthTabCallback + 87;
                    onNavigationEvent = i15 % 128;
                    i5 = i15 % 2 == 0 ? 4717 : 256;
                } else {
                    i5 = 128;
                }
                i4 |= i5;
            }
            i6 = i3 & 8;
            if (i6 == 0) {
                i4 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    int i16 = onNavigationEvent + 87;
                    IAuthTabCallback = i16 % 128;
                    int i17 = i16 % 2;
                    z2 = z;
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 2048 : 1024;
                }
                i7 = i3 & 16;
                if (i7 == 0) {
                    if ((i2 & 24576) == 0) {
                        jsonUtils2 = jsonUtils;
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(jsonUtils2) ? 16384 : 8192;
                    }
                    i8 = i3 & 32;
                    if (i8 == 0) {
                        i4 |= 196608;
                        function22 = function2;
                    } else {
                        function22 = function2;
                        if ((i2 & 196608) == 0) {
                            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22) ? 131072 : 65536;
                        }
                    }
                    boolean z8 = false;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 74899) == 74898, i4 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                        z3 = z2;
                        function23 = function22;
                        jsonUtils3 = jsonUtils2;
                    } else {
                        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i14 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                        boolean z9 = i6 != 0 ? false : z2;
                        Throwable th = null;
                        if (i7 != 0) {
                            jsonUtils2 = null;
                        }
                        if (i8 != 0) {
                            int i18 = IAuthTabCallback + 21;
                            onNavigationEvent = i18 % 128;
                            if (i18 % 2 == 0) {
                                int i19 = 30 / 0;
                            }
                            function24 = null;
                        } else {
                            function24 = function22;
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i20 = IAuthTabCallback + 55;
                            onNavigationEvent = i20 % 128;
                            int i21 = i20 % 2;
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-269325059, i4, -1, "im.toss.tds.compose.component.compound.agreement.v4.group.AgreementSubGroup (TdsAgreementV4Group.kt:152)");
                        }
                        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                        int i22 = i4 & 7168;
                        boolean z10 = i22 == 2048;
                        int i23 = i4 & 57344;
                        boolean z11 = i23 == 16384;
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if ((z10 | z11) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            if (z9) {
                                int i24 = IAuthTabCallback + 61;
                                onNavigationEvent = i24 % 128;
                                int i25 = i24 % 2;
                                float f = jsonUtils2 != null ? 0.0f : 1.0f;
                                objOnMinimized = isIconified.onWarmupCompleted(f, 0.0f, 2, (Object) null);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                            }
                        }
                        isQueryRefinementEnabled isqueryrefinementenabled3 = (isQueryRefinementEnabled) objOnMinimized;
                        if (i22 == 2048) {
                            i9 = 16384;
                            z4 = true;
                        } else {
                            z4 = false;
                            i9 = 16384;
                        }
                        boolean z12 = i23 == i9;
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!z12 && !z4) {
                            int i26 = IAuthTabCallback + 111;
                            onNavigationEvent = i26 % 128;
                            if (i26 % 2 == 0) {
                                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                throw null;
                            }
                            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                th = null;
                                isQueryRefinementEnabled isqueryrefinementenabledOnWarmupCompleted = isIconified.onWarmupCompleted((z9 || !Intrinsics.areEqual(jsonUtils2, JsonUtils.onExtraCallbackWithResult.onExtraCallback)) ? 0.0f : 20.0f, 0.0f, 2, th);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(isqueryrefinementenabledOnWarmupCompleted);
                                obj = isqueryrefinementenabledOnWarmupCompleted;
                                isQueryRefinementEnabled isqueryrefinementenabled4 = (isQueryRefinementEnabled) obj;
                                int i27 = i4;
                                Throwable th2 = th;
                                r8lambdaNBxVhWOH9H5GRBwkiOB26o8EVuM r8lambdanbxvhwoh9h5grbwkiob26o8evumOnWarmupCompleted = r8lambdaitkxxTyAPHmEU5WnQXvTDjIGs.onWarmupCompleted(setanddownscaleimageuri.IAuthTabCallbackDefault(), true, setanddownscaleimageuri.IAuthTabCallbackStub(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 0);
                                final putFloatArray putfloatarrayIAuthTabCallback = putStringArrayList.IAuthTabCallback(setanddownscaleimageuri.IAuthTabCallbackDefault(), r8lambdanbxvhwoh9h5grbwkiob26o8evumOnWarmupCompleted.onNavigationEvent() ? putIntArray.onNavigationEvent.onNavigationEvent : putIntArray.onWarmupCompleted.onNavigationEvent, setanddownscaleimageuri.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                                z5 = (i27 & 14) == 4;
                                int i28 = i27 & 112;
                                z6 = i28 == 32;
                                int i29 = 458752 & i27;
                                z7 = i29 == 131072;
                                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!(z5 | z6 | z7)) {
                                    int i30 = onNavigationEvent + 73;
                                    IAuthTabCallback = i30 % 128;
                                    int i31 = i30 % 2;
                                    if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        objOnMinimized3 = new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.group.TdsAgreementV4GroupKt$$ExternalSyntheticLambda3
                                            private static int IAuthTabCallback = 0;
                                            private static int onExtraCallback = 1;

                                            public final Object invoke(Object obj2, Object obj3) {
                                                int i32 = 2 % 2;
                                                int i33 = onExtraCallback + 91;
                                                IAuthTabCallback = i33 % 128;
                                                int i34 = i33 % 2;
                                                setAndDownscaleImageUri setanddownscaleimageuri2 = setanddownscaleimageuri;
                                                if (i34 == 0) {
                                                    return setAndDownscaleBitmap.onWarmupCompleted(setanddownscaleimageuri2, i, function24, (setAndDownscaleImageUri) obj2, (getBacktraceNote) obj3);
                                                }
                                                setAndDownscaleBitmap.onWarmupCompleted(setanddownscaleimageuri2, i, function24, (setAndDownscaleImageUri) obj2, (getBacktraceNote) obj3);
                                                Object obj4 = null;
                                                obj4.hashCode();
                                                throw null;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                                    }
                                    final Function2 function25 = (Function2) objOnMinimized3;
                                    boolean z13 = !((i27 & 896) != 256);
                                    boolean z14 = i29 == 131072;
                                    boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(function25);
                                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (!(z13 | z14 | zOnNavigationEvent)) {
                                        int i32 = onNavigationEvent + 125;
                                        IAuthTabCallback = i32 % 128;
                                        if (i32 % 2 != 0) {
                                            CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                            th2.hashCode();
                                            throw th2;
                                        }
                                        if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            objOnMinimized4 = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.group.TdsAgreementV4GroupKt$$ExternalSyntheticLambda4
                                                private static int onExtraCallbackWithResult = 0;
                                                private static int onWarmupCompleted = 1;

                                                public final Object invoke(Object obj2) {
                                                    int i33 = 2 % 2;
                                                    int i34 = onWarmupCompleted + 47;
                                                    onExtraCallbackWithResult = i34 % 128;
                                                    int i35 = i34 % 2;
                                                    getBacktraceNote getbacktracenoteOnExtraCallbackWithResult = setAndDownscaleBitmap.onExtraCallbackWithResult(quirksExternalSyntheticBackport04, function24, function25, (setAndDownscaleImageUri) obj2);
                                                    int i36 = onExtraCallbackWithResult + 65;
                                                    onWarmupCompleted = i36 % 128;
                                                    if (i36 % 2 != 0) {
                                                        return getbacktracenoteOnExtraCallbackWithResult;
                                                    }
                                                    Object obj3 = null;
                                                    obj3.hashCode();
                                                    throw null;
                                                }
                                            };
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                                        }
                                        final Function1 function1 = (Function1) objOnMinimized4;
                                        if (z9) {
                                            isqueryrefinementenabled = isqueryrefinementenabled4;
                                            isqueryrefinementenabled2 = isqueryrefinementenabled3;
                                            quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport04.onExtraCallback(attachTimestamp.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, new IAuthTabCallback(isqueryrefinementenabled2, r8lambdanm9dm2eewl4vrptnjmesfjqky4, isqueryrefinementenabled)));
                                        } else {
                                            isqueryrefinementenabled = isqueryrefinementenabled4;
                                            isqueryrefinementenabled2 = isqueryrefinementenabled3;
                                            quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport04;
                                        }
                                        Function2<Object, ? super Float, Unit> function26 = function24;
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                                        JsonUtils jsonUtils4 = jsonUtils2;
                                        toJsonString.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback, r8lambdanbxvhwoh9h5grbwkiob26o8evumOnWarmupCompleted, ForwardingCameraControl.onExtraCallback(-749994061, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.agreement.v4.group.TdsAgreementV4GroupKt$$ExternalSyntheticLambda5
                                            private static int IAuthTabCallback = 0;
                                            private static int onExtraCallback = 1;

                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                int i33 = 2 % 2;
                                                int i34 = onExtraCallback + 89;
                                                IAuthTabCallback = i34 % 128;
                                                int i35 = i34 % 2;
                                                Unit unitOnWarmupCompleted = setAndDownscaleBitmap.onWarmupCompleted(setanddownscaleimageuri, function25, putfloatarrayIAuthTabCallback, (synchronizedList) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                                int i36 = IAuthTabCallback + 23;
                                                onExtraCallback = i36 % 128;
                                                if (i36 % 2 == 0) {
                                                    int i37 = 58 / 0;
                                                }
                                                return unitOnWarmupCompleted;
                                            }
                                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), ForwardingCameraControl.onExtraCallback(245204711, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.agreement.v4.group.TdsAgreementV4GroupKt$$ExternalSyntheticLambda6
                                            private static int IAuthTabCallback = 0;
                                            private static int onExtraCallbackWithResult = 1;

                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                int i33 = 2 % 2;
                                                int i34 = IAuthTabCallback + 15;
                                                onExtraCallbackWithResult = i34 % 128;
                                                int i35 = i34 % 2;
                                                Object[] objArr = {setanddownscaleimageuri, function1, function25, (toJSONArray) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())};
                                                int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                                                int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                                                int iOnWarmupCompleted3 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                                                int iOnWarmupCompleted4 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                                                if (i35 != 0) {
                                                    return (Unit) setAndDownscaleBitmap.onWarmupCompleted(iOnWarmupCompleted3, iOnWarmupCompleted, objArr, iOnWarmupCompleted4, 1602608643, -1602608635, iOnWarmupCompleted2);
                                                }
                                                int i36 = 90 / 0;
                                                return (Unit) setAndDownscaleBitmap.onWarmupCompleted(iOnWarmupCompleted3, iOnWarmupCompleted, objArr, iOnWarmupCompleted4, 1602608643, -1602608635, iOnWarmupCompleted2);
                                            }
                                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3456, 0);
                                        boolean z15 = i22 == 2048;
                                        boolean z16 = i23 == 16384;
                                        if (i28 == 32) {
                                            int i33 = onNavigationEvent + 85;
                                            IAuthTabCallback = i33 % 128;
                                            int i34 = i33 % 2;
                                            z8 = true;
                                        }
                                        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled2);
                                        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled);
                                        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (((z16 | z15 | z8 | zOnExtraCallback) || zOnExtraCallback2) || objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(z9, jsonUtils4, i, isqueryrefinementenabled2, isqueryrefinementenabled, null);
                                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(onextracallbackwithresult);
                                            objOnMinimized5 = onextracallbackwithresult;
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                        }
                                        isZslDisabledByByUserCaseConfig.IAuthTabCallback(Boolean.valueOf(z9), jsonUtils4, Integer.valueOf(i), (Function2) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResult2, ((i27 >> 9) & 126) | ((i27 << 3) & 896));
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                        }
                                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                        function23 = function26;
                                        jsonUtils3 = jsonUtils4;
                                        z3 = z9;
                                    }
                                }
                            } else {
                                th = null;
                                obj = objOnMinimized2;
                                isQueryRefinementEnabled isqueryrefinementenabled42 = (isQueryRefinementEnabled) obj;
                                int i272 = i4;
                                Throwable th22 = th;
                                r8lambdaNBxVhWOH9H5GRBwkiOB26o8EVuM r8lambdanbxvhwoh9h5grbwkiob26o8evumOnWarmupCompleted2 = r8lambdaitkxxTyAPHmEU5WnQXvTDjIGs.onWarmupCompleted(setanddownscaleimageuri.IAuthTabCallbackDefault(), true, setanddownscaleimageuri.IAuthTabCallbackStub(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 0);
                                final putFloatArray putfloatarrayIAuthTabCallback2 = putStringArrayList.IAuthTabCallback(setanddownscaleimageuri.IAuthTabCallbackDefault(), r8lambdanbxvhwoh9h5grbwkiob26o8evumOnWarmupCompleted2.onNavigationEvent() ? putIntArray.onNavigationEvent.onNavigationEvent : putIntArray.onWarmupCompleted.onNavigationEvent, setanddownscaleimageuri.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                                if ((i272 & 14) == 4) {
                                }
                                int i282 = i272 & 112;
                                if (i282 == 32) {
                                }
                                int i292 = 458752 & i272;
                                if (i292 == 131072) {
                                }
                                Object objOnMinimized32 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!(z5 | z6 | z7)) {
                                }
                            }
                        } else if (z9) {
                            isQueryRefinementEnabled isqueryrefinementenabledOnWarmupCompleted2 = isIconified.onWarmupCompleted((z9 || !Intrinsics.areEqual(jsonUtils2, JsonUtils.onExtraCallbackWithResult.onExtraCallback)) ? 0.0f : 20.0f, 0.0f, 2, th);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(isqueryrefinementenabledOnWarmupCompleted2);
                            obj = isqueryrefinementenabledOnWarmupCompleted2;
                            isQueryRefinementEnabled isqueryrefinementenabled422 = (isQueryRefinementEnabled) obj;
                            int i2722 = i4;
                            Throwable th222 = th;
                            r8lambdaNBxVhWOH9H5GRBwkiOB26o8EVuM r8lambdanbxvhwoh9h5grbwkiob26o8evumOnWarmupCompleted22 = r8lambdaitkxxTyAPHmEU5WnQXvTDjIGs.onWarmupCompleted(setanddownscaleimageuri.IAuthTabCallbackDefault(), true, setanddownscaleimageuri.IAuthTabCallbackStub(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 0);
                            final putFloatArray putfloatarrayIAuthTabCallback22 = putStringArrayList.IAuthTabCallback(setanddownscaleimageuri.IAuthTabCallbackDefault(), r8lambdanbxvhwoh9h5grbwkiob26o8evumOnWarmupCompleted22.onNavigationEvent() ? putIntArray.onNavigationEvent.onNavigationEvent : putIntArray.onWarmupCompleted.onNavigationEvent, setanddownscaleimageuri.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                            if ((i2722 & 14) == 4) {
                            }
                            int i2822 = i2722 & 112;
                            if (i2822 == 32) {
                            }
                            int i2922 = 458752 & i2722;
                            if (i2922 == 131072) {
                            }
                            Object objOnMinimized322 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(z5 | z6 | z7)) {
                            }
                        }
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.group.TdsAgreementV4GroupKt$$ExternalSyntheticLambda7
                            private static int IAuthTabCallback = 1;
                            private static int onExtraCallback;

                            public final Object invoke(Object obj2, Object obj3) throws Throwable {
                                int i35 = 2 % 2;
                                int i36 = IAuthTabCallback + 35;
                                onExtraCallback = i36 % 128;
                                int i37 = i36 % 2;
                                Unit unitIAuthTabCallback = setAndDownscaleBitmap.IAuthTabCallback(setanddownscaleimageuri, i, quirksExternalSyntheticBackport03, z3, jsonUtils3, function23, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                int i38 = IAuthTabCallback + 103;
                                onExtraCallback = i38 % 128;
                                if (i38 % 2 == 0) {
                                    return unitIAuthTabCallback;
                                }
                                Object obj4 = null;
                                obj4.hashCode();
                                throw null;
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 24576;
                jsonUtils2 = jsonUtils;
                i8 = i3 & 32;
                if (i8 == 0) {
                }
                boolean z82 = false;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 74899) == 74898, i4 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            z2 = z;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            jsonUtils2 = jsonUtils;
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            boolean z822 = false;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 74899) == 74898, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i6 = i3 & 8;
        if (i6 == 0) {
        }
        z2 = z;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        jsonUtils2 = jsonUtils;
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        boolean z8222 = false;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 74899) == 74898, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final AppLovinSdkSettings IAuthTabCallback(Rally rally) {
        Object objOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rally, "");
            objOnWarmupCompleted = isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, new Object[]{(AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{getCallToActionButton.onExtraCallback.IAuthTabCallback(), 30333}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141), Float.valueOf(-1.0f), Float.valueOf(0.0f), null, 5, null}, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
        } else {
            Intrinsics.checkNotNullParameter(rally, "");
            objOnWarmupCompleted = isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -570811141, new Object[]{(AppLovinSdkSettings) onNativeAdExpired.onExtraCallback(C40Encoder.onExtraCallback(), new Object[]{getCallToActionButton.onExtraCallback.IAuthTabCallback(), 1200}, 827070143, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -827070141), Float.valueOf(-1.0f), Float.valueOf(1.0f), null, 4, null}, 570811163, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
        }
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) objOnWarmupCompleted;
        int i3 = IAuthTabCallback + 19;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return appLovinSdkSettings;
    }

    private static final removeObserverLocked onWarmupCompleted(Pair[] pairArr, final float f, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        final readFully readfullyIAuthTabCallback = readFully.onExtraCallback.IAuthTabCallback(readFully.Companion, (Pair[]) Arrays.copyOf(pairArr, pairArr.length), 0.0f, 0.0f, 0, 14, (Object) null);
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = sessionProcessorCaptureCallback.onExtraCallbackWithResult(new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.group.TdsAgreementV4GroupKt$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 27;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = setAndDownscaleBitmap.onExtraCallback(readfullyIAuthTabCallback, f, (setOrientationDegrees) obj);
                int i5 = onExtraCallbackWithResult + 93;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallback;
            }
        });
        int i2 = IAuthTabCallback + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return removeobserverlockedOnExtraCallbackWithResult;
    }

    private static final Unit onNavigationEvent(readFully readfully, float f, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        float f2 = f / 2.0f;
        setOrientationDegrees.onNavigationEvent(setorientationdegrees, readfully, 0L, 0L, getAttachedUseCaseConfigs.onExtraCallback((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)), 0.2f, (hasMoreElements) null, (seek) null, 0, 230, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 109;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Rally $gradientRally;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(Rally rally, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$gradientRally = rally;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$gradientRally, access13800Var);
            int i2 = onNavigationEvent + 115;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onwarmupcompleted;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onNavigationEvent(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 37;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return onwarmupcompletedCreate.invokeSuspend(unit);
            }
            onwarmupcompletedCreate.invokeSuspend(unit);
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onWarmupCompleted + 31;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i3 == 0) {
                int i4 = 46 / 0;
                if (!this.$gradientRally.postMessage()) {
                    this.$gradientRally.receiveFile();
                }
            } else if (!this.$gradientRally.postMessage()) {
            }
            Unit unit = Unit.INSTANCE;
            int i5 = onNavigationEvent + 89;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 72 / 0;
            }
            return unit;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0391  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i;
        access13800 access13800Var;
        long smallIconId;
        int i2;
        final float fFloatValue = ((Number) objArr[0]).floatValue();
        final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        final int iIntValue = ((Number) objArr[3]).intValue();
        final int iIntValue2 = ((Number) objArr[4]).intValue();
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1486860049);
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue)) {
                int i4 = onNavigationEvent + 15;
                IAuthTabCallback = i4 % 128;
                i2 = i4 % 2 != 0 ? 5 : 4;
            } else {
                i2 = 2;
            }
            i = i2 | iIntValue;
        } else {
            i = iIntValue;
        }
        int i5 = iIntValue2 & 2;
        if (i5 != 0) {
            i |= 48;
        } else if ((iIntValue & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback) ? 32 : 16;
        }
        int i6 = i;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i6 & 19) != 18, i6 & 1)) {
            if (i5 != 0) {
                int i7 = onNavigationEvent + 95;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                onextracallback = QuirksExternalSyntheticBackport0.Companion;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1486860049, i6, -1, "im.toss.tds.compose.component.compound.agreement.v4.group.AgreementGroupGradient (TdsAgreementV4Group.kt:305)");
            }
            RoundedCornerShape roundedCornerShapeIAuthTabCallback = RoundedCornerShapeKt.IAuthTabCallback(50);
            getExtraParameters getextraparameters = getExtraParameters.Normal;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.group.TdsAgreementV4GroupKt$$ExternalSyntheticLambda11
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i9 = 2 % 2;
                        int i10 = onWarmupCompleted + 5;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) setAndDownscaleBitmap.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{(Rally) obj}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 730276891, -730276886, iOnWarmupCompleted2);
                        int i12 = onExtraCallbackWithResult + 67;
                        onWarmupCompleted = i12 % 128;
                        if (i12 % 2 != 0) {
                            return appLovinSdkSettings;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            Rally rallyOnExtraCallback = RallyKt.onExtraCallback(300, getextraparameters, 0, null, null, 0, null, null, null, null, null, null, null, null, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54, 24576, 16380);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = notifyPublicListeners.onWarmupCompleted(0);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            final getTimebase gettimebase = (getTimebase) objOnMinimized2;
            setByteOrder.onExtraCallbackWithResult onextracallbackwithresult = setByteOrder.Companion;
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(Float.valueOf(0.0f), setByteOrder.onNavigationEvent(onextracallbackwithresult.IAuthTabCallbackDefault()));
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(Float.valueOf(0.25f), setByteOrder.onNavigationEvent(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue()));
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1351621238);
                smallIconId = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ITrustedWebActivityServiceStubProxy();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1351622198);
                smallIconId = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).getSmallIconId();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            final Pair[] pairArr = {pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(Float.valueOf(0.5f), setByteOrder.onNavigationEvent(smallIconId)), getWrite.IAuthTabCallback(Float.valueOf(1.0f), setByteOrder.onNavigationEvent(onextracallbackwithresult.IAuthTabCallbackDefault()))};
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = setExtensionStrength.onExtraCallback(setExtensionStrength.onExtraCallbackWithResult(verifyDrawable.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), 5, (Object) null), y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onActivityLayout(), roundedCornerShapeIAuthTabCallback), roundedCornerShapeIAuthTabCallback));
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.group.TdsAgreementV4GroupKt$$ExternalSyntheticLambda12
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i9 = 2 % 2;
                        int i10 = onNavigationEvent + 93;
                        IAuthTabCallback = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unitIAuthTabCallback = setAndDownscaleBitmap.IAuthTabCallback(gettimebase, (ExtensionsManager1) obj);
                        int i12 = onNavigationEvent + 97;
                        IAuthTabCallback = i12 % 128;
                        int i13 = i12 % 2;
                        return unitIAuthTabCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = calculatePlaceholderForExtensions.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized3);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult2 = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult3.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                int i9 = IAuthTabCallback + 51;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult3.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult3.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult3.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult3.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult3.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            float fC_ = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).c_(((Integer) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{gettimebase}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1246123904, 1246123911, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted())).intValue());
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallbackWithResult(RallyModifierKt.IAuthTabCallback(onextracallback2, rallyOnExtraCallback, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 2), fFloatValue, fC_), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), 5, (Object) null);
            component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.access100(), false);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback2);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult3.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i11 = IAuthTabCallback + 73;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                int i13 = IAuthTabCallback + 7;
                onNavigationEvent = i13 % 128;
                if (i13 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                access13800Var = null;
            } else {
                access13800Var = null;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult3.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult3.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult3.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult3.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult3.onTransact());
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback2, 0.0f, 1, access13800Var);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(pairArr);
            boolean z = (i6 & 14) == 4;
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((z | zOnExtraCallback) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized4 = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.group.TdsAgreementV4GroupKt$$ExternalSyntheticLambda13
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i14 = 2 % 2;
                        int i15 = onWarmupCompleted + 51;
                        onExtraCallback = i15 % 128;
                        int i16 = i15 % 2;
                        removeObserverLocked removeobserverlockedOnNavigationEvent = setAndDownscaleBitmap.onNavigationEvent(pairArr, fFloatValue, (SessionProcessorCaptureCallback) obj);
                        int i17 = onExtraCallback + 85;
                        onWarmupCompleted = i17 % 128;
                        if (i17 % 2 == 0) {
                            int i18 = 57 / 0;
                        }
                        return removeobserverlockedOnNavigationEvent;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
            }
            FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(SessionProcessorSurface.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent, (Function1) objOnMinimized4), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rallyOnExtraCallback);
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!zOnNavigationEvent) {
                int i14 = onNavigationEvent + 113;
                IAuthTabCallback = i14 % 128;
                int i15 = i14 % 2;
                if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized5 = new onWarmupCompleted(rallyOnExtraCallback, access13800Var);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(rallyOnExtraCallback, (Function2) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            access13800Var = null;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.group.TdsAgreementV4GroupKt$$ExternalSyntheticLambda14
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i16 = 2 % 2;
                    int i17 = onExtraCallbackWithResult + 63;
                    onWarmupCompleted = i17 % 128;
                    int i18 = i17 % 2;
                    Unit unitOnExtraCallbackWithResult = setAndDownscaleBitmap.onExtraCallbackWithResult(fFloatValue, onextracallback, iIntValue, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i19 = onWarmupCompleted + 11;
                    onExtraCallbackWithResult = i19 % 128;
                    if (i19 % 2 != 0) {
                        int i20 = 20 / 0;
                    }
                    return unitOnExtraCallbackWithResult;
                }
            });
        }
        return access13800Var;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        getTimebase gettimebase = (getTimebase) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = gettimebase.onWarmupCompleted();
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
        int i5 = onNavigationEvent + 91;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return Integer.valueOf(iOnWarmupCompleted);
    }

    private static final void onExtraCallbackWithResult(getTimebase gettimebase, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 65;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        gettimebase.onExtraCallback(i);
        if (i4 != 0) {
            throw null;
        }
        int i5 = IAuthTabCallback + 61;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(setAndDownscaleImageUri setanddownscaleimageuri, Function1 function1, Function2 function2, toJSONArray tojsonarray, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {setanddownscaleimageuri, function1, function2, tojsonarray, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1602608643, -1602608635, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static /* synthetic */ AppLovinSdkSettings onNavigationEvent(Rally rally) {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return (AppLovinSdkSettings) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{rally}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 730276891, -730276886, iOnWarmupCompleted2);
    }

    public static /* synthetic */ Unit onExtraCallback(putFloatArray putfloatarray, setAndDownscaleImageUri setanddownscaleimageuri, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {putfloatarray, setanddownscaleimageuri, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1414448399, 1414448400, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    public static /* synthetic */ Unit IAuthTabCallback(setAndDownscaleImageUri setanddownscaleimageuri, Object obj) {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{setanddownscaleimageuri, obj}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -683588490, 683588494, iOnWarmupCompleted2);
    }

    private static final void onNavigationEvent(float f, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {Float.valueOf(f), quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1154776644, 1154776646, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private static final int onWarmupCompleted(getTimebase gettimebase) {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return ((Integer) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{gettimebase}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1246123904, 1246123911, iOnWarmupCompleted2)).intValue();
    }

    private static final Unit onWarmupCompleted(getTimebase gettimebase, ExtensionsManager1 extensionsManager1) {
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        return (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{gettimebase, extensionsManager1}, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -171095096, 171095099, iOnWarmupCompleted2);
    }

    private static final Unit onWarmupCompleted(Object obj, Function2 function2, setAndDownscaleImageUri setanddownscaleimageuri, putFloatArray putfloatarray, r8lambdaNBxVhWOH9H5GRBwkiOB26o8EVuM r8lambdanbxvhwoh9h5grbwkiob26o8evum, synchronizedList synchronizedlist, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {obj, function2, setanddownscaleimageuri, putfloatarray, r8lambdanbxvhwoh9h5grbwkiob26o8evum, synchronizedlist, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -2080603006, 2080603006, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private static final Unit onWarmupCompleted(putFloatArray putfloatarray, setAndDownscaleImageUri setanddownscaleimageuri, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {putfloatarray, setanddownscaleimageuri, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -870078980, 870078986, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted());
    }
}
