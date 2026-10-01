package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import im.toss.features.tosscert.ui.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt___RangesKt;
import o.AFf1zSDK;
import o.AFg1eSDK;
import o.AFg1gSDK;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.ExtensionsInfoExternalSyntheticLambda0;
import o.HandlerScheduledExecutorService2;
import o.QuirksExternalSyntheticBackport0;
import o.SessionProcessorCaptureCallback;
import o.UtilsKtExternalSyntheticLambda17;
import o.VirtualCameraCaptureResult;
import o.accessgetSTART_TIMEcp;
import o.component4;
import o.component7;
import o.component8;
import o.flipHorizontally;
import o.getBacktraceNote;
import o.getPackageType;
import o.getStreamSharingChildren;
import o.r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4;
import o.setOrientationDegrees;
import o.setUseCaseAttached;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFf1zSDK {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(useandconfigureprogramwithtexture);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(useandconfigureprogramwithtexture);
        int i3 = onNavigationEvent + 107;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 25;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 109;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(long j, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(j, cameraPresenceProviderExternalSyntheticLambda6, setorientationdegrees);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(j, cameraPresenceProviderExternalSyntheticLambda6, setorientationdegrees);
        int i3 = onNavigationEvent + 19;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 72 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(AFg1gSDK aFg1gSDK, long j, long j2, Function2 function2, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 67;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return onWarmupCompleted(aFg1gSDK, j, j2, function2, getbacktracenote, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onWarmupCompleted(aFg1gSDK, j, j2, function2, getbacktracenote, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        throw null;
    }

    private static final Unit IAuthTabCallback(AFg1gSDK aFg1gSDK, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, Function2 function2, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 111;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {aFg1gSDK, quirksExternalSyntheticBackport0, Long.valueOf(j), function2, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)};
        onExtraCallback(1916341488, -1916341488, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr);
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 19;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 50 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(AFg1gSDK aFg1gSDK, findResAndMsg findresandmsg, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 77;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult(aFg1gSDK, findresandmsg, function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 89;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getStreamSharingChildren getstreamsharingchildren, AFg1gSDK aFg1gSDK, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {getstreamsharingchildren, aFg1gSDK, onextracallbackwithresult};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback4 = R.drawable.IAuthTabCallback();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallback(781804512, -781804510, iIAuthTabCallback, iIAuthTabCallback4, iIAuthTabCallback2, iIAuthTabCallback3, objArr);
        int i4 = onExtraCallback + 37;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(useandconfigureprogramwithtexture);
        int i4 = onNavigationEvent + 89;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ component8 IAuthTabCallback(AFg1gSDK aFg1gSDK, component4 component4Var, component7 component7Var, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        component8 component8VarOnNavigationEvent = onNavigationEvent(aFg1gSDK, component4Var, component7Var, virtualCameraCaptureResult);
        if (i3 == 0) {
            int i4 = 72 / 0;
        }
        int i5 = onNavigationEvent + 13;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return component8VarOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        findResAndMsg findresandmsg = (findResAndMsg) objArr[0];
        AFg1gSDK aFg1gSDK = (AFg1gSDK) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(findresandmsg, aFg1gSDK);
            throw null;
        }
        boolean zOnNavigationEvent = onNavigationEvent(findresandmsg, aFg1gSDK);
        int i3 = onNavigationEvent + 107;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return Boolean.valueOf(zOnNavigationEvent);
        }
        int i4 = 60 / 0;
        return Boolean.valueOf(zOnNavigationEvent);
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i;
        int i8 = ~i2;
        int i9 = (~i3) | i8;
        int i10 = ~(i3 | i8);
        int i11 = i2 + i + i5 + ((-714989572) * i6) + (1142003473 * i4);
        int i12 = i11 * i11;
        int i13 = (((-190873766) * i2) - 1983905792) + (1136689320 * i) + (i7 * (-1483702105)) + (1483702105 * i9) + ((-1483702105) * i10) + ((-1674575872) * i5) + ((-1891631104) * i6) + ((-1355808768) * i4) + ((-1882259456) * i12);
        int i14 = (i2 * (-1158907614)) + 1427560840 + (i * (-1158905656)) + (i7 * 979) + (i9 * (-979)) + (i10 * 979) + (i5 * (-1158906635)) + (i6 * 1387703340) + (i4 * 1202573125) + (i12 * (-451215360));
        switch (i13 + (i14 * i14 * (-310837248))) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                AFg1gSDK aFg1gSDK = (AFg1gSDK) objArr[0];
                r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) objArr[1];
                int i15 = 2 % 2;
                int i16 = onNavigationEvent + 95;
                onExtraCallback = i16 % 128;
                int i17 = i16 % 2;
                Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
                ExtensionsInfoExternalSyntheticLambda0 extensionsInfoExternalSyntheticLambda0IAuthTabCallback = ExtensionsInfoExternalSyntheticLambda0.IAuthTabCallback(ExtensionsInfoExternalSyntheticLambda0.onNavigationEvent((Math.round(Float.intBitsToFloat((int) (aFg1gSDK.IAuthTabCallback() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) aFg1gSDK.IAuthTabCallback())) & 4294967295L)));
                int i18 = onExtraCallback + 49;
                onNavigationEvent = i18 % 128;
                int i19 = i18 % 2;
                return extensionsInfoExternalSyntheticLambda0IAuthTabCallback;
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                int i20 = 2 % 2;
                getPackageType getpackagetypeOnExtraCallback = onLoadStarted.onExtraCallback((findResAndMsg) objArr[0], null, null, new IAuthTabCallbackStub((AFg1gSDK) objArr[1], null), 3, null);
                int i21 = onExtraCallback + 99;
                onNavigationEvent = i21 % 128;
                int i22 = i21 % 2;
                return getpackagetypeOnExtraCallback;
            case 6:
                return onExtraCallbackWithResult(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            case 9:
                return asInterface(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(long j, AFg1gSDK aFg1gSDK, long j2, Function2 function2, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 85;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(j, aFg1gSDK, j2, function2, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 81 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onExtraCallback(long j, AFg1gSDK aFg1gSDK, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 51;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(j, aFg1gSDK, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallback(AFg1gSDK aFg1gSDK, String str, findResAndMsg findresandmsg, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(aFg1gSDK, str, findresandmsg, useandconfigureprogramwithtexture);
        int i4 = onNavigationEvent + 95;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ float onExtraCallbackWithResult(float f, AFg1gSDK aFg1gSDK) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        float fOnWarmupCompleted = onWarmupCompleted(f, aFg1gSDK);
        int i4 = onExtraCallback + 39;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return fOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AFg1gSDK aFg1gSDK, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(aFg1gSDK, fliphorizontally);
        int i4 = onExtraCallback + 51;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ removeObserverLocked onExtraCallbackWithResult(AFg1gSDK aFg1gSDK, long j, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {aFg1gSDK, Long.valueOf(j), sessionProcessorCaptureCallback};
        removeObserverLocked removeobserverlocked = (removeObserverLocked) onExtraCallback(-360658876, 360658884, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr);
        int i4 = onExtraCallback + 5;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return removeobserverlocked;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 1;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))};
        onExtraCallback(-1824839388, 1824839394, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr);
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 3;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(long j, AFg1gSDK aFg1gSDK, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(j, aFg1gSDK, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 37;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(isQueryRefinementEnabled isqueryrefinementenabled, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onWarmupCompleted(isqueryrefinementenabled, fliphorizontally);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(isqueryrefinementenabled, fliphorizontally);
        int i3 = onExtraCallback + 13;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ ExtensionsInfoExternalSyntheticLambda0 onNavigationEvent(AFg1gSDK aFg1gSDK, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        ExtensionsInfoExternalSyntheticLambda0 extensionsInfoExternalSyntheticLambda0 = (ExtensionsInfoExternalSyntheticLambda0) onExtraCallback(1339659614, -1339659611, iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback3, new Object[]{aFg1gSDK, r8lambdanm9dm2eewl4vrptnjmesfjqky4});
        int i4 = onExtraCallback + 101;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return extensionsInfoExternalSyntheticLambda0;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        findResAndMsg findresandmsg = (findResAndMsg) objArr[0];
        AFg1gSDK aFg1gSDK = (AFg1gSDK) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        getPackageType getpackagetype = (getPackageType) onExtraCallback(33310657, -33310652, iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback3, new Object[]{findresandmsg, aFg1gSDK});
        int i4 = onExtraCallback + 113;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return getpackagetype;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(AFg1gSDK aFg1gSDK, long j, long j2, Function2 function2, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 45;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            Object[] objArr = {aFg1gSDK, Long.valueOf(j), Long.valueOf(j2), function2, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i)), Integer.valueOf(i2)};
            onExtraCallback(-1032121787, 1032121788, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr);
        } else {
            Object[] objArr2 = {aFg1gSDK, Long.valueOf(j), Long.valueOf(j2), function2, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)};
            onExtraCallback(-1032121787, 1032121788, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr2);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 43;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AFg1gSDK aFg1gSDK, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, Function2 function2, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 39;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(aFg1gSDK, quirksExternalSyntheticBackport0, j, function2, getbacktracenote, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 37;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AFg1gSDK aFg1gSDK, findResAndMsg findresandmsg, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 57;
        onNavigationEvent = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            IAuthTabCallback(aFg1gSDK, findresandmsg, function2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(aFg1gSDK, findresandmsg, function2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onNavigationEvent + 17;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AFg1gSDK aFg1gSDK, findResAndMsg findresandmsg, isQueryRefinementEnabled isqueryrefinementenabled) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(aFg1gSDK, findresandmsg, isqueryrefinementenabled);
        int i4 = onExtraCallback + 101;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AFg1gSDK aFg1gSDK, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onNavigationEvent(aFg1gSDK, fliphorizontally);
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(aFg1gSDK, fliphorizontally);
        int i3 = onNavigationEvent + 61;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(rotate rotateVar, long j, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(rotateVar, j, setorientationdegrees);
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        int i5 = onNavigationEvent + 109;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $predictiveBackProgress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$predictiveBackProgress = isqueryrefinementenabled;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$predictiveBackProgress, access13800Var);
            int i2 = IAuthTabCallback + 81;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 24 / 0;
            }
            return onwarmupcompleted;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 == 0) {
                return onNavigationEvent(findresandmsg2, access13800Var2);
            }
            onNavigationEvent(findresandmsg2, access13800Var2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onWarmupCompleted) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 85;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = IAuthTabCallback + 89;
                int i6 = i5 % 128;
                onNavigationEvent = i6;
                int i7 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = i6 + 89;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$predictiveBackProgress;
                Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(0.0f);
                this.label = 1;
                if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, (onItemClicked) null, (Object) null, (Function1) null, this, 14, (Object) null) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ AFg1gSDK $sheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(AFg1gSDK aFg1gSDK, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$sheetState = aFg1gSDK;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((IAuthTabCallback) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 15;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$sheetState, access13800Var);
            int i2 = onNavigationEvent + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i4 = onExtraCallback + 17;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 19 / 0;
            }
            return objIAuthTabCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                AFg1gSDK aFg1gSDK = this.$sheetState;
                accessgetSTART_TIMEcp.onExtraCallbackWithResult onextracallbackwithresult = accessgetSTART_TIMEcp.onExtraCallbackWithResult.onWarmupCompleted;
                this.label = 1;
                if (aFg1gSDK.onNavigationEvent(onextracallbackwithresult, this) == objOnExtraCallback) {
                    int i5 = onNavigationEvent + 37;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 60 / 0;
                    }
                    return objOnExtraCallback;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i7 = onExtraCallback + 99;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ AFg1gSDK $sheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(AFg1gSDK aFg1gSDK, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$sheetState = aFg1gSDK;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$sheetState, access13800Var);
            int i2 = onNavigationEvent + 85;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(findresandmsg2, access13800Var2);
            }
            onWarmupCompleted(findresandmsg2, access13800Var2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onExtraCallback) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 81;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                AFg1gSDK aFg1gSDK = this.$sheetState;
                accessgetSTART_TIMEcp.onExtraCallbackWithResult onextracallbackwithresult = accessgetSTART_TIMEcp.onExtraCallbackWithResult.onWarmupCompleted;
                this.label = 1;
                if (aFg1gSDK.onNavigationEvent(onextracallbackwithresult, this) == objOnExtraCallback) {
                    int i3 = onNavigationEvent + 93;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnExtraCallback;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = IAuthTabCallback + 19;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 3 % 2;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i7 = IAuthTabCallback + 87;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(AFg1gSDK aFg1gSDK, findResAndMsg findresandmsg, isQueryRefinementEnabled isqueryrefinementenabled) {
        int i;
        int i2 = 2 % 2;
        if (aFg1gSDK.onExtraCallback().compareTo(AFg1eSDK.Expanded) >= 0) {
            onLoadStarted.onExtraCallback(findresandmsg, null, null, new onWarmupCompleted(isqueryrefinementenabled, null), 3, null);
            onLoadStarted.onExtraCallback(findresandmsg, null, null, new IAuthTabCallback(aFg1gSDK, null), 3, null);
            i = onNavigationEvent + 83;
            onExtraCallback = i % 128;
        } else {
            onLoadStarted.onExtraCallback(findresandmsg, null, null, new onExtraCallback(aFg1gSDK, null), 3, null);
            int i3 = onNavigationEvent + 11;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                i = 4;
            }
            return Unit.INSTANCE;
        }
        int i4 = i % 2;
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        boolean z;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            z = false;
        } else {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            z = true;
        }
        unregisterOutputSurface.onTransact(useandconfigureprogramwithtexture, z);
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(long j, AFg1gSDK aFg1gSDK, long j2, Function2 function2, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 49;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 != 0 ? (i & 3) == 2 : (i & 3) == 4) {
            int i5 = i4 + 81;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        } else {
            z = true;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            int i7 = onNavigationEvent + 123;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1090532454, i, -1, "im.toss.tosssecurities.uikit.compound.topsheet.BasicTossSecTopSheet.<anonymous> (BasicTossSecTopSheet.kt:102)");
                int i9 = onExtraCallback + 17;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
            }
            Object obj = null;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.BasicTossSecTopSheetKt$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i11 = 2 % 2;
                        int i12 = IAuthTabCallback + 51;
                        onExtraCallbackWithResult = i12 % 128;
                        int i13 = i12 % 2;
                        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
                        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
                        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
                        Unit unit = (Unit) AFf1zSDK.onExtraCallback(-1636612140, 1636612144, iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback3, new Object[]{(useAndConfigureProgramWithTexture) obj2});
                        int i14 = IAuthTabCallback + 57;
                        onExtraCallbackWithResult = i14 % 128;
                        int i15 = i14 % 2;
                        return unit;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = getExtensionsBeforeInitialized.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent, false, (Function1) objOnMinimized);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i11 = onNavigationEvent + 7;
                onExtraCallback = i11 % 128;
                if (i11 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            IAuthTabCallback(j, aFg1gSDK, (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 4);
            onExtraCallback(1916341488, -1916341488, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{aFg1gSDK, null, Long.valueOf(j2), function2, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, 0, 2});
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
                onExtraCallback = i12 % 128;
                if (i12 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i;
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        Object obj;
        final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2;
        final long j;
        final long j2;
        SessionProcessorBaseExternalSyntheticLambda1 sessionProcessorBaseExternalSyntheticLambda1;
        boolean z;
        final AFg1gSDK aFg1gSDK = (AFg1gSDK) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        long jLongValue2 = ((Number) objArr[2]).longValue();
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2IAuthTabCallback = (Function2) objArr[3];
        final getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        final int iIntValue = ((Number) objArr[6]).intValue();
        final int iIntValue2 = ((Number) objArr[7]).intValue();
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(aFg1gSDK, "");
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(923702405);
        if ((iIntValue & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(aFg1gSDK) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= ((iIntValue2 & 2) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jLongValue)) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= ((iIntValue2 & 4) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jLongValue2)) ? 256 : 128;
        }
        int i4 = i;
        int i5 = iIntValue2 & 8;
        if (i5 != 0) {
            int i6 = onNavigationEvent + 83;
            onExtraCallback = i6 % 128;
            i4 = i6 % 2 == 0 ? i4 | 9461 : i4 | 3072;
        } else if ((iIntValue & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2IAuthTabCallback)) {
                int i7 = onExtraCallback + 11;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                i2 = 2048;
            } else {
                i2 = 1024;
            }
            i4 |= i2;
        }
        if ((iIntValue & 24576) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? Http2.INITIAL_MAX_FRAME_SIZE : TTHistoryActivity2.SIZE;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 9363) != 9362, i4 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((iIntValue & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                if ((iIntValue2 & 2) != 0) {
                    jLongValue = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ITrustedWebActivityCallbackDefault();
                    i4 &= -113;
                }
                if ((iIntValue2 & 4) != 0) {
                    jLongValue2 = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent();
                    i4 &= -897;
                }
                if (i5 != 0) {
                    function2IAuthTabCallback = AFg1bSDK.onNavigationEvent.IAuthTabCallback();
                }
            } else {
                int i9 = onNavigationEvent + 29;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                if ((iIntValue2 & 2) != 0) {
                    int i11 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                    i4 &= -113;
                }
                if ((iIntValue2 & 4) != 0) {
                    int i13 = onExtraCallback + 3;
                    onNavigationEvent = i13 % 128;
                    int i14 = i13 % 2;
                    i4 &= -897;
                }
            }
            final long j3 = jLongValue;
            final long j4 = jLongValue2;
            final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function22 = function2IAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i15 = onExtraCallback + 19;
                onNavigationEvent = i15 % 128;
                int i16 = i15 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(923702405, i4, -1, "im.toss.tosssecurities.uikit.compound.topsheet.BasicTossSecTopSheet (BasicTossSecTopSheet.kt:82)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                int i17 = onNavigationEvent + 49;
                onExtraCallback = i17 % 128;
                if (i17 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback));
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                objOnMinimized = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            final findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                int i18 = onNavigationEvent + 29;
                onExtraCallback = i18 % 128;
                if (i18 % 2 == 0) {
                    sessionProcessorBaseExternalSyntheticLambda1 = null;
                    objOnMinimized2 = isIconified.onWarmupCompleted(1.0f, 2.0f, 4, (Object) null);
                } else {
                    sessionProcessorBaseExternalSyntheticLambda1 = null;
                    objOnMinimized2 = isIconified.onWarmupCompleted(0.0f, 0.0f, 2, (Object) null);
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            } else {
                sessionProcessorBaseExternalSyntheticLambda1 = null;
            }
            final isQueryRefinementEnabled isqueryrefinementenabled = (isQueryRefinementEnabled) objOnMinimized2;
            AFg1iSDK aFg1iSDK = new AFg1iSDK(sessionProcessorBaseExternalSyntheticLambda1, false, 3, sessionProcessorBaseExternalSyntheticLambda1);
            if ((i4 & 14) == 4) {
                int i19 = onExtraCallback + 101;
                onNavigationEvent = i19 % 128;
                int i20 = i19 % 2;
                z = true;
            } else {
                z = false;
            }
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(findresandmsg);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((z | zOnExtraCallback | zOnExtraCallback2) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = new Function0() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.BasicTossSecTopSheetKt$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i21 = 2 % 2;
                        int i22 = onExtraCallbackWithResult + 45;
                        IAuthTabCallback = i22 % 128;
                        int i23 = i22 % 2;
                        Unit unitOnWarmupCompleted = AFf1zSDK.onWarmupCompleted(aFg1gSDK, findresandmsg, isqueryrefinementenabled);
                        int i24 = onExtraCallbackWithResult + 67;
                        IAuthTabCallback = i24 % 128;
                        if (i24 % 2 != 0) {
                            return unitOnWarmupCompleted;
                        }
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
            }
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            vdefault.onExtraCallbackWithResult((Function0) objOnMinimized3, aFg1iSDK, isqueryrefinementenabled, ForwardingCameraControl.onExtraCallback(1090532454, true, new Function2() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.BasicTossSecTopSheetKt$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    int i21 = 2 % 2;
                    int i22 = onNavigationEvent + 111;
                    IAuthTabCallback = i22 % 128;
                    int i23 = i22 % 2;
                    long j5 = j3;
                    AFg1gSDK aFg1gSDK2 = aFg1gSDK;
                    long j6 = j4;
                    Function2 function23 = function22;
                    getBacktraceNote getbacktracenote2 = getbacktracenote;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) obj3;
                    int iIntValue3 = ((Integer) obj4).intValue();
                    if (i23 != 0) {
                        AFf1zSDK.onExtraCallback(j5, aFg1gSDK2, j6, function23, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult3, iIntValue3);
                        throw null;
                    }
                    Unit unitOnExtraCallback = AFf1zSDK.onExtraCallback(j5, aFg1gSDK2, j6, function23, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult3, iIntValue3);
                    int i24 = onNavigationEvent + 23;
                    IAuthTabCallback = i24 % 128;
                    if (i24 % 2 == 0) {
                        return unitOnExtraCallback;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, (isQueryRefinementEnabled.IAuthTabCallback << 6) | 3120);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i21 = onNavigationEvent + 13;
                onExtraCallback = i21 % 128;
                if (i21 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            obj = null;
            function2 = function22;
            j2 = j3;
            j = j4;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            obj = null;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            function2 = function2IAuthTabCallback;
            j = jLongValue2;
            j2 = jLongValue;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.BasicTossSecTopSheetKt$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    int i22 = 2 % 2;
                    int i23 = IAuthTabCallback + 125;
                    onExtraCallback = i23 % 128;
                    if (i23 % 2 == 0) {
                        return AFf1zSDK.IAuthTabCallback(aFg1gSDK, j2, j, function2, getbacktracenote, iIntValue, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    }
                    AFf1zSDK.IAuthTabCallback(aFg1gSDK, j2, j, function2, getbacktracenote, iIntValue, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    throw null;
                }
            });
        }
        return obj;
    }

    public static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $alpha;
        final /* synthetic */ getThumbPosition<Float> $animationSpec;
        final /* synthetic */ AFg1gSDK $sheetState;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(AFg1gSDK aFg1gSDK, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, getThumbPosition<Float> getthumbposition, access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
            this.$sheetState = aFg1gSDK;
            this.$alpha = isqueryrefinementenabled;
            this.$animationSpec = getthumbposition;
        }

        public static /* synthetic */ AFg1eSDK onExtraCallbackWithResult(AFg1gSDK aFg1gSDK) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return IAuthTabCallback(aFg1gSDK);
            }
            IAuthTabCallback(aFg1gSDK);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = new asInterface(this.$sheetState, this.$alpha, this.$animationSpec, access13800Var);
            int i2 = onWarmupCompleted + 125;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return asinterface;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            if (i3 == 0) {
                int i4 = 66 / 0;
            }
            int i5 = onWarmupCompleted + 101;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((asInterface) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 63;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 77 / 0;
            }
            return objInvokeSuspend;
        }

        private static final AFg1eSDK IAuthTabCallback(AFg1gSDK aFg1gSDK) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                aFg1gSDK.onExtraCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            AFg1eSDK aFg1eSDKOnExtraCallback = aFg1gSDK.onExtraCallback();
            int i3 = onExtraCallback + 79;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return aFg1eSDKOnExtraCallback;
        }

        /* renamed from: o.AFf1zSDK$asInterface$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements Function2<AFg1eSDK, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $alpha;
            final /* synthetic */ getThumbPosition<Float> $animationSpec;
            final /* synthetic */ Ref.ObjectRef<AFg1eSDK> $state;
            /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(Ref.ObjectRef<AFg1eSDK> objectRef, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, getThumbPosition<Float> getthumbposition, access13800<? super AnonymousClass4> access13800Var) {
                super(2, access13800Var);
                this.$state = objectRef;
                this.$alpha = isqueryrefinementenabled;
                this.$animationSpec = getthumbposition;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$state, this.$alpha, this.$animationSpec, access13800Var);
                anonymousClass4.L$0 = obj;
                int i2 = onExtraCallback + 7;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(AFg1eSDK aFg1eSDK, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 79;
                onWarmupCompleted = i2 % 128;
                AFg1eSDK aFg1eSDK2 = aFg1eSDK;
                access13800<? super Unit> access13800Var2 = access13800Var;
                if (i2 % 2 == 0) {
                    return onWarmupCompleted(aFg1eSDK2, access13800Var2);
                }
                onWarmupCompleted(aFg1eSDK2, access13800Var2);
                throw null;
            }

            public final Object onWarmupCompleted(AFg1eSDK aFg1eSDK, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 63;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass4) create(aFg1eSDK, access13800Var)).invokeSuspend(Unit.INSTANCE);
                int i4 = onWarmupCompleted + 7;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 36 / 0;
                }
                return objInvokeSuspend;
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
            
                if (o.isQueryRefinementEnabled.onWarmupCompleted(r3, r0, r5, (java.lang.Object) null, (kotlin.jvm.functions.Function1) null, r13, 12, (java.lang.Object) null) == r2) goto L26;
             */
            /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object, o.AFg1eSDK] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                ?? r1 = (AFg1eSDK) this.L$0;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = onWarmupCompleted + 83;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    if (i2 != 1 && i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    AFg1eSDK aFg1eSDK = this.$state.element;
                    if (aFg1eSDK != null) {
                        int i5 = onExtraCallback + 73;
                        onWarmupCompleted = i5 % 128;
                        if (i5 % 2 != 0) {
                            AFg1eSDK aFg1eSDK2 = AFg1eSDK.Hidden;
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        AFg1eSDK aFg1eSDK3 = AFg1eSDK.Hidden;
                        if (aFg1eSDK != aFg1eSDK3) {
                            if (r1 == aFg1eSDK3) {
                                isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$alpha;
                                Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(0.0f);
                                getThumbPosition<Float> getthumbposition = this.$animationSpec;
                                this.L$0 = r1;
                                this.L$1 = access15400.onNavigationEvent(aFg1eSDK);
                                this.label = 2;
                                if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, getthumbposition, (Object) null, (Function1) null, this, 12, (Object) null) == objOnExtraCallback) {
                                    int i6 = onWarmupCompleted + 77;
                                    onExtraCallback = i6 % 128;
                                    int i7 = i6 % 2;
                                    return objOnExtraCallback;
                                }
                            }
                        }
                    }
                    isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled2 = this.$alpha;
                    Float fOnExtraCallbackWithResult2 = access14000.onExtraCallbackWithResult(1.0f);
                    getThumbPosition<Float> getthumbposition2 = this.$animationSpec;
                    this.L$0 = r1;
                    this.L$1 = access15400.onNavigationEvent(aFg1eSDK);
                    this.label = 1;
                }
                this.$state.element = r1;
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onWarmupCompleted + 29;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0 ? i4 != 1 : i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i6 = onExtraCallback + 27;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                final AFg1gSDK aFg1gSDK = this.$sheetState;
                IAnimation iAnimationOnNavigationEvent = ycxycx.onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new Function0() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.BasicTossSecTopSheetKt$TopSheetContent$1$1$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        AFg1eSDK aFg1eSDKOnExtraCallbackWithResult;
                        int i8 = 2 % 2;
                        int i9 = IAuthTabCallback + 1;
                        onExtraCallback = i9 % 128;
                        if (i9 % 2 != 0) {
                            aFg1eSDKOnExtraCallbackWithResult = AFf1zSDK.asInterface.onExtraCallbackWithResult(aFg1gSDK);
                            int i10 = 12 / 0;
                        } else {
                            aFg1eSDKOnExtraCallbackWithResult = AFf1zSDK.asInterface.onExtraCallbackWithResult(aFg1gSDK);
                        }
                        int i11 = IAuthTabCallback + 39;
                        onExtraCallback = i11 % 128;
                        if (i11 % 2 == 0) {
                            return aFg1eSDKOnExtraCallbackWithResult;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(objectRef, this.$alpha, this.$animationSpec, null);
                this.L$0 = access15400.onNavigationEvent(objectRef);
                this.label = 1;
                if (ycxycx.onWarmupCompleted(iAnimationOnNavigationEvent, anonymousClass4, this) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i8 = onWarmupCompleted + 87;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                return unit;
            }
            throw null;
        }
    }

    private static final Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        } else {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        }
        unregisterOutputSurface.onWarmupCompleted(useandconfigureprogramwithtexture, 0.0f);
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(isQueryRefinementEnabled isqueryrefinementenabled, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.IAuthTabCallbackStub(((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue());
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 3;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        AFg1gSDK aFg1gSDK = (AFg1gSDK) objArr[0];
        final long jLongValue = ((Number) objArr[1]).longValue();
        SessionProcessorCaptureCallback sessionProcessorCaptureCallback = (SessionProcessorCaptureCallback) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        final rotate rotateVarIAuthTabCallback = aFg1gSDK.asBinder().IAuthTabCallback(sessionProcessorCaptureCallback.onWarmupCompleted(), sessionProcessorCaptureCallback.onExtraCallback(), sessionProcessorCaptureCallback);
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = sessionProcessorCaptureCallback.onExtraCallbackWithResult(new Function1() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.BasicTossSecTopSheetKt$$ExternalSyntheticLambda19
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 53;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    AFf1zSDK.onWarmupCompleted(rotateVarIAuthTabCallback, jLongValue, (setOrientationDegrees) obj);
                    throw null;
                }
                Unit unitOnWarmupCompleted = AFf1zSDK.onWarmupCompleted(rotateVarIAuthTabCallback, jLongValue, (setOrientationDegrees) obj);
                int i4 = onWarmupCompleted + 99;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitOnWarmupCompleted;
            }
        });
        int i2 = onNavigationEvent + 61;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return removeobserverlockedOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(rotate rotateVar, long j, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        setDescription.IAuthTabCallback(setorientationdegrees, rotateVar, j, 0.0f, (hasMoreElements) null, (seek) null, 0, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 61;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(AFg1gSDK aFg1gSDK, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.onNavigationEvent(aFg1gSDK.asBinder());
        fliphorizontally.onWarmupCompleted(true);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 111;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback;
        final Function2 function2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Object obj;
        long j;
        final AFg1gSDK aFg1gSDK = (AFg1gSDK) objArr[0];
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = (QuirksExternalSyntheticBackport0) objArr[1];
        final long jLongValue = ((Number) objArr[2]).longValue();
        Function2 function22 = (Function2) objArr[3];
        final getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int iIntValue2 = ((Number) objArr[7]).intValue();
        int i7 = 2 % 2;
        Intrinsics.checkNotNullParameter(aFg1gSDK, "");
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-96233206);
        if ((iIntValue & 6) != 0) {
            i = iIntValue;
        } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(aFg1gSDK)) {
            int i8 = onNavigationEvent + 67;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2 == 0 ? 2 : 4;
            i = i9 | iIntValue;
        }
        int i10 = iIntValue2 & 2;
        if (i10 == 0) {
            if ((iIntValue & 48) == 0) {
                i2 = (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback2) ? 16 : 32) | i;
            }
            if ((iIntValue & 384) == 0) {
                if ((iIntValue2 & 4) == 0) {
                    int i11 = onExtraCallback + 9;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                    int i13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jLongValue) ? 256 : 128;
                    i2 |= i13;
                }
            }
            i3 = iIntValue2 & 8;
            if (i3 == 0) {
                i2 |= 3072;
            } else if ((iIntValue & 3072) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22)) {
                    int i14 = onNavigationEvent + 53;
                    onExtraCallback = i14 % 128;
                    i4 = i14 % 2 == 0 ? 5576 : 2048;
                } else {
                    i4 = 1024;
                }
                i2 |= i4;
            }
            if ((iIntValue & 24576) == 0) {
                i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? Http2.INITIAL_MAX_FRAME_SIZE : TTHistoryActivity2.SIZE;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 9363) == 9362, i2 & 1)) {
                i5 = iIntValue;
                i6 = iIntValue2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                onextracallback = onextracallback2;
                function2 = function22;
            } else {
                int i15 = onExtraCallback + 23;
                onNavigationEvent = i15 % 128;
                if (i15 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    if ((iIntValue & 1) != 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                            if (i10 != 0) {
                                onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                            }
                            if ((iIntValue2 & 4) != 0) {
                                jLongValue = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent();
                                i2 &= -897;
                            }
                            if (i3 != 0) {
                                int i16 = onExtraCallback + 51;
                                onNavigationEvent = i16 % 128;
                                int i17 = i16 % 2;
                                function22 = (Function2) AFg1bSDK.onWarmupCompleted(new Object[]{AFg1bSDK.onNavigationEvent}, setVisitUrl.onExtraCallbackWithResult(), 740896217, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), -740896215);
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            if ((iIntValue2 & 4) != 0) {
                                int i18 = onNavigationEvent + 107;
                                onExtraCallback = i18 % 128;
                                int i19 = i18 % 2;
                                i2 &= -897;
                            }
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-96233206, i2, -1, "im.toss.tosssecurities.uikit.compound.topsheet.TopSheetContent (BasicTossSecTopSheet.kt:128)");
                        }
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized;
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                            obj = null;
                            objOnMinimized2 = isIconified.onWarmupCompleted(0.0f, 0.0f, 2, (Object) null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        } else {
                            obj = null;
                        }
                        final isQueryRefinementEnabled isqueryrefinementenabled = (isQueryRefinementEnabled) objOnMinimized2;
                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                            i6 = iIntValue2;
                            getThumbPosition getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.onTransact(), 0, 2, obj);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getthumbpositionOnExtraCallback);
                            objOnMinimized3 = getthumbpositionOnExtraCallback;
                        } else {
                            i6 = iIntValue2;
                        }
                        getThumbPosition getthumbposition = (getThumbPosition) objOnMinimized3;
                        Object[] objArr2 = {aFg1gSDK};
                        int i20 = i2 & 14;
                        boolean z = i20 == 4;
                        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled);
                        i5 = iIntValue;
                        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if ((z | zOnExtraCallback) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized4 = new asInterface(aFg1gSDK, isqueryrefinementenabled, getthumbposition, null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                        }
                        indexOfFirstNonAsciiWhitespace.onExtraCallbackWithResult(objArr2, (Function2) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = IAuthTabCallback(onExtraCallbackWithResult(YuvImageOnePixelShiftQuirk.onExtraCallback(YuvImageOnePixelShiftQuirk.IAuthTabCallback(onextracallback2)), aFg1gSDK), aFg1gSDK);
                        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized5 = new Function1() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.BasicTossSecTopSheetKt$$ExternalSyntheticLambda6
                                private static int IAuthTabCallback = 1;
                                private static int onWarmupCompleted;

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    int i21 = 2 % 2;
                                    int i22 = onWarmupCompleted + 95;
                                    IAuthTabCallback = i22 % 128;
                                    int i23 = i22 % 2;
                                    Unit unitIAuthTabCallback = AFf1zSDK.IAuthTabCallback((useAndConfigureProgramWithTexture) obj2);
                                    if (i23 == 0) {
                                        int i24 = 56 / 0;
                                    }
                                    int i25 = IAuthTabCallback + 63;
                                    onWarmupCompleted = i25 % 128;
                                    int i26 = i25 % 2;
                                    return unitIAuthTabCallback;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                        }
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = onextracallback2;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0IAuthTabCallback, false, (Function1) objOnMinimized5, 1, (Object) null);
                        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled);
                        Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!zOnExtraCallback2) {
                            int i21 = onExtraCallback + 37;
                            onNavigationEvent = i21 % 128;
                            int i22 = i21 % 2;
                            if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized6 = new Function1() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.BasicTossSecTopSheetKt$$ExternalSyntheticLambda7
                                    private static int IAuthTabCallback = 1;
                                    private static int onWarmupCompleted;

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        int i23 = 2 % 2;
                                        int i24 = IAuthTabCallback + 125;
                                        onWarmupCompleted = i24 % 128;
                                        if (i24 % 2 != 0) {
                                            AFf1zSDK.onNavigationEvent(isqueryrefinementenabled, (flipHorizontally) obj2);
                                            throw null;
                                        }
                                        Unit unitOnNavigationEvent = AFf1zSDK.onNavigationEvent(isqueryrefinementenabled, (flipHorizontally) obj2);
                                        int i25 = onWarmupCompleted + 11;
                                        IAuthTabCallback = i25 % 128;
                                        int i26 = i25 % 2;
                                        return unitOnNavigationEvent;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, (Function1) objOnMinimized6);
                            boolean z2 = i20 == 4;
                            if (((i2 & 896) ^ 384) > 256) {
                                int i23 = onNavigationEvent + 111;
                                onExtraCallback = i23 % 128;
                                int i24 = i23 % 2;
                                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jLongValue)) {
                                    boolean z3 = (i2 & 384) == 256;
                                    Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if ((z2 | z3) || objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                                        objOnMinimized7 = new Function1() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.BasicTossSecTopSheetKt$$ExternalSyntheticLambda8
                                            private static int onExtraCallbackWithResult = 1;
                                            private static int onWarmupCompleted;

                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                int i25 = 2 % 2;
                                                int i26 = onExtraCallbackWithResult + 89;
                                                onWarmupCompleted = i26 % 128;
                                                int i27 = i26 % 2;
                                                AFg1gSDK aFg1gSDK2 = aFg1gSDK;
                                                if (i27 == 0) {
                                                    return AFf1zSDK.onExtraCallbackWithResult(aFg1gSDK2, jLongValue, (SessionProcessorCaptureCallback) obj2);
                                                }
                                                AFf1zSDK.onExtraCallbackWithResult(aFg1gSDK2, jLongValue, (SessionProcessorCaptureCallback) obj2);
                                                throw null;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                                    }
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback3 = SessionProcessorSurface.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback2, (Function1) objOnMinimized7);
                                    boolean z4 = i20 == 4;
                                    Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (z4 || objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                                        objOnMinimized8 = new Function1() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.BasicTossSecTopSheetKt$$ExternalSyntheticLambda9
                                            private static int onExtraCallback = 0;
                                            private static int onWarmupCompleted = 1;

                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                int i25 = 2 % 2;
                                                int i26 = onExtraCallback + 91;
                                                onWarmupCompleted = i26 % 128;
                                                if (i26 % 2 == 0) {
                                                    AFf1zSDK.onExtraCallbackWithResult(aFg1gSDK, (flipHorizontally) obj2);
                                                    throw null;
                                                }
                                                Unit unitOnExtraCallbackWithResult = AFf1zSDK.onExtraCallbackWithResult(aFg1gSDK, (flipHorizontally) obj2);
                                                int i27 = onExtraCallback + 15;
                                                onWarmupCompleted = i27 % 128;
                                                if (i27 % 2 == 0) {
                                                    int i28 = 3 / 0;
                                                }
                                                return unitOnExtraCallbackWithResult;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized8);
                                    }
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback4 = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback3, (Function1) objOnMinimized8);
                                    component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallback4);
                                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                                    Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                        int i25 = onNavigationEvent + 37;
                                        j = jLongValue;
                                        onExtraCallback = i25 % 128;
                                        if (i25 % 2 == 0) {
                                            getAwbState.onExtraCallback();
                                            throw null;
                                        }
                                        getAwbState.onExtraCallback();
                                    } else {
                                        j = jLongValue;
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                        int i26 = onExtraCallback + 39;
                                        onNavigationEvent = i26 % 128;
                                        if (i26 % 2 != 0) {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                                            int i27 = 46 / 0;
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                                        }
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                                    }
                                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                                    getbacktracenote.invoke(LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((i2 >> 9) & 112) | 6));
                                    if (function22 != null) {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-345990577);
                                        onExtraCallbackWithResult(aFg1gSDK, findresandmsg, function22, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i2 >> 3) & 896) | i20);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-345837778);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                    }
                                    function2 = function22;
                                    onextracallback = onextracallback3;
                                    jLongValue = j;
                                }
                            }
                        }
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    if ((iIntValue & 1) != 0) {
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                return null;
            }
            final int i28 = i5;
            final int i29 = i6;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.BasicTossSecTopSheetKt$$ExternalSyntheticLambda10
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i30 = 2 % 2;
                    int i31 = IAuthTabCallback + 65;
                    onExtraCallback = i31 % 128;
                    int i32 = i31 % 2;
                    Unit unitOnWarmupCompleted = AFf1zSDK.onWarmupCompleted(aFg1gSDK, onextracallback, jLongValue, function2, getbacktracenote, i28, i29, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i33 = IAuthTabCallback + 125;
                    onExtraCallback = i33 % 128;
                    int i34 = i33 % 2;
                    return unitOnWarmupCompleted;
                }
            });
            return null;
        }
        i |= 48;
        i2 = i;
        if ((iIntValue & 384) == 0) {
        }
        i3 = iIntValue2 & 8;
        if (i3 == 0) {
        }
        if ((iIntValue & 24576) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 9363) == 9362, i2 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final QuirksExternalSyntheticBackport0 IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final AFg1gSDK aFg1gSDK) {
        int i = 2 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(SequentialExecutorWorkerRunningState.IAuthTabCallback(attachTimestamp.IAuthTabCallback(CaptureNoResponseQuirk.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, new Function1() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.BasicTossSecTopSheetKt$$ExternalSyntheticLambda11
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 49;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    AFf1zSDK.onNavigationEvent(aFg1gSDK, (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) obj);
                    throw null;
                }
                ExtensionsInfoExternalSyntheticLambda0 extensionsInfoExternalSyntheticLambda0OnNavigationEvent = AFf1zSDK.onNavigationEvent(aFg1gSDK, (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) obj);
                int i4 = onExtraCallbackWithResult + 25;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return extensionsInfoExternalSyntheticLambda0OnNavigationEvent;
            }
        }), new Function1() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.BasicTossSecTopSheetKt$$ExternalSyntheticLambda12
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 15;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    AFf1zSDK.onWarmupCompleted(aFg1gSDK, (flipHorizontally) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitOnWarmupCompleted = AFf1zSDK.onWarmupCompleted(aFg1gSDK, (flipHorizontally) obj);
                int i4 = IAuthTabCallback + 87;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return unitOnWarmupCompleted;
            }
        }), aFg1gSDK, new asBinder(aFg1gSDK)));
        int i2 = onExtraCallback + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    private static final Unit onNavigationEvent(AFg1gSDK aFg1gSDK, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            fliphorizontally.IAuthTabCallbackStubProxy(aFg1gSDK.onExtraCallbackWithResult());
            fliphorizontally.getInterfaceDescriptor(aFg1gSDK.onExtraCallbackWithResult());
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.IAuthTabCallbackStubProxy(aFg1gSDK.onExtraCallbackWithResult());
        fliphorizontally.getInterfaceDescriptor(aFg1gSDK.onExtraCallbackWithResult());
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 5;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class asBinder implements PointerInputEventHandler {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ AFg1gSDK onNavigationEvent;

        asBinder(AFg1gSDK aFg1gSDK) {
            this.onNavigationEvent = aFg1gSDK;
        }

        public final Object invoke(HighPriorityExecutor highPriorityExecutor, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            Object obj = null;
            Object objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(new AnonymousClass3(highPriorityExecutor, highPriorityExecutor.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f) + VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f))), this.onNavigationEvent, null), access13800Var);
            if (objOnExtraCallbackWithResult == access14100.onExtraCallback()) {
                int i2 = onExtraCallbackWithResult + 61;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 90 / 0;
                }
                return objOnExtraCallbackWithResult;
            }
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 1;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o.AFf1zSDK$asBinder$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ float $handleSize;
            final /* synthetic */ AFg1gSDK $sheetState;
            final /* synthetic */ HighPriorityExecutor $this_pointerInput;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(HighPriorityExecutor highPriorityExecutor, float f, AFg1gSDK aFg1gSDK, access13800<? super AnonymousClass3> access13800Var) {
                super(2, access13800Var);
                this.$this_pointerInput = highPriorityExecutor;
                this.$handleSize = f;
                this.$sheetState = aFg1gSDK;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$this_pointerInput, this.$handleSize, this.$sheetState, access13800Var);
                int i2 = onExtraCallback + 23;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                Object objOnExtraCallbackWithResult;
                int i = 2 % 2;
                int i2 = onExtraCallback + 3;
                onWarmupCompleted = i2 % 128;
                findResAndMsg findresandmsg2 = findresandmsg;
                access13800<? super Unit> access13800Var2 = access13800Var;
                if (i2 % 2 == 0) {
                    objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg2, access13800Var2);
                    int i3 = 89 / 0;
                } else {
                    objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg2, access13800Var2);
                }
                int i4 = onWarmupCompleted + 65;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return objOnExtraCallbackWithResult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 33;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass3) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
                int i4 = onWarmupCompleted + 71;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            /* renamed from: o.AFf1zSDK$asBinder$3$3, reason: invalid class name and collision with other inner class name */
            public static final class C00163 extends RestrictedSuspendLambda implements Function2<AudioExecutor1, access13800<? super Unit>, Object> {
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;
                final /* synthetic */ float $handleSize;
                final /* synthetic */ AFg1gSDK $sheetState;
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00163(float f, AFg1gSDK aFg1gSDK, access13800<? super C00163> access13800Var) {
                    super(2, access13800Var);
                    this.$handleSize = f;
                    this.$sheetState = aFg1gSDK;
                }

                public static /* synthetic */ Unit IAuthTabCallback(Ref.ObjectRef objectRef, HandlerScheduledExecutorService2 handlerScheduledExecutorService2, setUseCaseAttached setusecaseattached) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 91;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        return onNavigationEvent(objectRef, handlerScheduledExecutorService2, setusecaseattached);
                    }
                    onNavigationEvent(objectRef, handlerScheduledExecutorService2, setusecaseattached);
                    throw null;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    C00163 c00163 = new C00163(this.$handleSize, this.$sheetState, access13800Var);
                    c00163.L$0 = obj;
                    int i2 = IAuthTabCallback + 75;
                    onExtraCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        return c00163;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* synthetic */ Object invoke(AudioExecutor1 audioExecutor1, access13800<? super Unit> access13800Var) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 23;
                    onExtraCallback = i2 % 128;
                    AudioExecutor1 audioExecutor12 = audioExecutor1;
                    access13800<? super Unit> access13800Var2 = access13800Var;
                    if (i2 % 2 == 0) {
                        onNavigationEvent(audioExecutor12, access13800Var2);
                        throw null;
                    }
                    Object objOnNavigationEvent = onNavigationEvent(audioExecutor12, access13800Var2);
                    int i3 = IAuthTabCallback + 37;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnNavigationEvent;
                }

                public final Object onNavigationEvent(AudioExecutor1 audioExecutor1, access13800<? super Unit> access13800Var) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 79;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    C00163 c00163 = (C00163) create(audioExecutor1, access13800Var);
                    Unit unit = Unit.INSTANCE;
                    if (i3 == 0) {
                        return c00163.invokeSuspend(unit);
                    }
                    c00163.invokeSuspend(unit);
                    throw null;
                }

                /* JADX WARN: Type inference failed for: r3v1, types: [T, o.createPostFailedException] */
                private static final Unit onNavigationEvent(Ref.ObjectRef objectRef, HandlerScheduledExecutorService2 handlerScheduledExecutorService2, setUseCaseAttached setusecaseattached) {
                    int i = 2 % 2;
                    int i2 = onExtraCallback + 79;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    handlerScheduledExecutorService2.onExtraCallback();
                    objectRef.element = createPostFailedException.Final;
                    Unit unit = Unit.INSTANCE;
                    int i4 = IAuthTabCallback + 97;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 80 / 0;
                    }
                    return unit;
                }

                /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
                
                    if (r0 != r9) goto L18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x00b4, code lost:
                
                    if (r2 == r9) goto L63;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x00eb, code lost:
                
                    if (r3 != r9) goto L35;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:63:0x01a8, code lost:
                
                    return r9;
                 */
                /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
                /* JADX WARN: Type inference failed for: r2v14, types: [T, o.createPostFailedException] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00bf -> B:22:0x0099). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0199 -> B:32:0x00d5). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object objOnWarmupCompleted;
                    HandlerScheduledExecutorService2 handlerScheduledExecutorService2;
                    final Ref.ObjectRef objectRef;
                    HandlerScheduledExecutorService2 handlerScheduledExecutorService22;
                    Ref.ObjectRef objectRef2;
                    HandlerScheduledExecutorService2 handlerScheduledExecutorService23;
                    Object objIAuthTabCallback;
                    HandlerScheduledExecutorService2 handlerScheduledExecutorService24;
                    HandlerScheduledExecutorService2 handlerScheduledExecutorService25;
                    Ref.ObjectRef objectRef3;
                    int i;
                    AudioExecutor1 audioExecutor1;
                    boolean z;
                    int i2 = 2;
                    int i3 = 2 % 2;
                    int i4 = IAuthTabCallback + 85;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    AudioExecutor1 audioExecutor12 = (AudioExecutor1) this.L$0;
                    Object objOnExtraCallback = access14100.onExtraCallback();
                    int i6 = this.label;
                    int i7 = 3;
                    if (i6 != 0) {
                        int i8 = onExtraCallback + 33;
                        IAuthTabCallback = i8 % 128;
                        if (i8 % 2 == 0 ? i6 == 1 : i6 == 1) {
                            ResultKt.onNavigationEvent(obj);
                            objOnWarmupCompleted = obj;
                        } else {
                            if (i6 != 2) {
                                if (i6 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                objectRef3 = (Ref.ObjectRef) this.L$3;
                                handlerScheduledExecutorService25 = (HandlerScheduledExecutorService2) this.L$2;
                                handlerScheduledExecutorService24 = (HandlerScheduledExecutorService2) this.L$1;
                                ResultKt.onNavigationEvent(obj);
                                objIAuthTabCallback = obj;
                                newHandlerExecutor newhandlerexecutor = (newHandlerExecutor) objIAuthTabCallback;
                                if (HandlerScheduledExecutorService.onNavigationEvent(newhandlerexecutor.asBinder(), HandlerScheduledExecutorService.Companion.onExtraCallbackWithResult())) {
                                    List listOnExtraCallbackWithResult = newhandlerexecutor.onExtraCallbackWithResult();
                                    ArrayList arrayList = new ArrayList(listOnExtraCallbackWithResult.size());
                                    int size = listOnExtraCallbackWithResult.size();
                                    int i9 = IAuthTabCallback + 67;
                                    onExtraCallback = i9 % 128;
                                    int i10 = i9 % i2;
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj2 = listOnExtraCallbackWithResult.get(i11);
                                        AudioExecutor1 audioExecutor13 = audioExecutor12;
                                        if (HandlerScheduledExecutorServiceHandlerScheduledFuture.onExtraCallbackWithResult(((HandlerScheduledExecutorService2) obj2).onNavigationEvent(), handlerScheduledExecutorService24.onNavigationEvent())) {
                                            arrayList.add(obj2);
                                        }
                                        i11++;
                                        audioExecutor12 = audioExecutor13;
                                    }
                                    audioExecutor1 = audioExecutor12;
                                    AFg1gSDK aFg1gSDK = this.$sheetState;
                                    int size2 = arrayList.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        int i13 = onExtraCallback + 37;
                                        IAuthTabCallback = i13 % 128;
                                        int i14 = i13 % 2;
                                        HandlerScheduledExecutorService2 handlerScheduledExecutorService26 = (HandlerScheduledExecutorService2) arrayList.get(i12);
                                        aFg1gSDK.IAuthTabCallback(handlerScheduledExecutorService26);
                                        handlerScheduledExecutorService26.onExtraCallback();
                                    }
                                    i = 2;
                                } else {
                                    i = i2;
                                    audioExecutor1 = audioExecutor12;
                                }
                                List listOnExtraCallbackWithResult2 = newhandlerexecutor.onExtraCallbackWithResult();
                                if (listOnExtraCallbackWithResult2 instanceof Collection) {
                                    z = true;
                                    if (!listOnExtraCallbackWithResult2.isEmpty()) {
                                    }
                                    this.$sheetState.access000();
                                    return Unit.INSTANCE;
                                }
                                z = true;
                                Iterator it = listOnExtraCallbackWithResult2.iterator();
                                while (it.hasNext()) {
                                    if (((HandlerScheduledExecutorService2) it.next()).IAuthTabCallbackStub()) {
                                        i2 = i;
                                        audioExecutor12 = audioExecutor1;
                                        i7 = 3;
                                        createPostFailedException createpostfailedexception = (createPostFailedException) objectRef3.element;
                                        this.L$0 = audioExecutor12;
                                        this.L$1 = handlerScheduledExecutorService24;
                                        this.L$2 = access15400.onNavigationEvent(handlerScheduledExecutorService25);
                                        this.L$3 = objectRef3;
                                        this.label = i7;
                                        objIAuthTabCallback = audioExecutor12.IAuthTabCallback(createpostfailedexception, this);
                                    }
                                }
                                this.$sheetState.access000();
                                return Unit.INSTANCE;
                            }
                            objectRef = (Ref.ObjectRef) this.L$3;
                            handlerScheduledExecutorService2 = (HandlerScheduledExecutorService2) this.L$1;
                            ResultKt.onNavigationEvent(obj);
                            Object objOnExtraCallback2 = obj;
                            handlerScheduledExecutorService22 = (HandlerScheduledExecutorService2) objOnExtraCallback2;
                            if (handlerScheduledExecutorService22 == null || handlerScheduledExecutorService22.IAuthTabCallback_Parcel()) {
                                HandlerScheduledExecutorService2 handlerScheduledExecutorService27 = handlerScheduledExecutorService2;
                                objectRef2 = objectRef;
                                handlerScheduledExecutorService23 = handlerScheduledExecutorService27;
                                if (objectRef2.element != 0) {
                                    this.$sheetState.onNavigationEvent(handlerScheduledExecutorService23);
                                    handlerScheduledExecutorService23.onExtraCallback();
                                    handlerScheduledExecutorService24 = handlerScheduledExecutorService23;
                                    objectRef3 = objectRef2;
                                    handlerScheduledExecutorService25 = handlerScheduledExecutorService22;
                                    createPostFailedException createpostfailedexception2 = (createPostFailedException) objectRef3.element;
                                    this.L$0 = audioExecutor12;
                                    this.L$1 = handlerScheduledExecutorService24;
                                    this.L$2 = access15400.onNavigationEvent(handlerScheduledExecutorService25);
                                    this.L$3 = objectRef3;
                                    this.label = i7;
                                    objIAuthTabCallback = audioExecutor12.IAuthTabCallback(createpostfailedexception2, this);
                                }
                                return Unit.INSTANCE;
                            }
                            long jOnNavigationEvent = handlerScheduledExecutorService2.onNavigationEvent();
                            Function2 function2 = new Function2() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.BasicTossSecTopSheetKt$tossSecTopSheetDraggable$3$1$1$$ExternalSyntheticLambda0
                                private static int IAuthTabCallback = 0;
                                private static int onExtraCallback = 1;

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    int i15 = 2 % 2;
                                    int i16 = IAuthTabCallback + 87;
                                    onExtraCallback = i16 % 128;
                                    int i17 = i16 % 2;
                                    Unit unitIAuthTabCallback = AFf1zSDK.asBinder.AnonymousClass3.C00163.IAuthTabCallback(objectRef, (HandlerScheduledExecutorService2) obj3, (setUseCaseAttached) obj4);
                                    int i18 = onExtraCallback + 99;
                                    IAuthTabCallback = i18 % 128;
                                    if (i18 % 2 == 0) {
                                        return unitIAuthTabCallback;
                                    }
                                    Object obj5 = null;
                                    obj5.hashCode();
                                    throw null;
                                }
                            };
                            this.L$0 = audioExecutor12;
                            this.L$1 = handlerScheduledExecutorService2;
                            this.L$2 = access15400.onNavigationEvent(handlerScheduledExecutorService22);
                            this.L$3 = objectRef;
                            this.label = 2;
                            objOnExtraCallback2 = FeatureCombinationQueryImplExternalSyntheticLambda10.onExtraCallback(audioExecutor12, jOnNavigationEvent, function2, this);
                        }
                    } else {
                        ResultKt.onNavigationEvent(obj);
                        this.L$0 = audioExecutor12;
                        this.label = 1;
                        objOnWarmupCompleted = Camera2CameraInfoImplExternalSyntheticLambda0.onWarmupCompleted(audioExecutor12, false, (createPostFailedException) null, this, 3, (Object) null);
                    }
                    handlerScheduledExecutorService23 = (HandlerScheduledExecutorService2) objOnWarmupCompleted;
                    objectRef2 = new Ref.ObjectRef();
                    handlerScheduledExecutorService22 = null;
                    if (Float.intBitsToFloat((int) handlerScheduledExecutorService23.IAuthTabCallback()) < this.$handleSize) {
                        objectRef2.element = createPostFailedException.Main;
                        if (objectRef2.element != 0) {
                        }
                        return Unit.INSTANCE;
                    }
                    handlerScheduledExecutorService2 = handlerScheduledExecutorService23;
                    objectRef = objectRef2;
                    long jOnNavigationEvent2 = handlerScheduledExecutorService2.onNavigationEvent();
                    Function2 function22 = new Function2() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.BasicTossSecTopSheetKt$tossSecTopSheetDraggable$3$1$1$$ExternalSyntheticLambda0
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            int i15 = 2 % 2;
                            int i16 = IAuthTabCallback + 87;
                            onExtraCallback = i16 % 128;
                            int i17 = i16 % 2;
                            Unit unitIAuthTabCallback = AFf1zSDK.asBinder.AnonymousClass3.C00163.IAuthTabCallback(objectRef, (HandlerScheduledExecutorService2) obj3, (setUseCaseAttached) obj4);
                            int i18 = onExtraCallback + 99;
                            IAuthTabCallback = i18 % 128;
                            if (i18 % 2 == 0) {
                                return unitIAuthTabCallback;
                            }
                            Object obj5 = null;
                            obj5.hashCode();
                            throw null;
                        }
                    };
                    this.L$0 = audioExecutor12;
                    this.L$1 = handlerScheduledExecutorService2;
                    this.L$2 = access15400.onNavigationEvent(handlerScheduledExecutorService22);
                    this.L$3 = objectRef;
                    this.label = 2;
                    objOnExtraCallback2 = FeatureCombinationQueryImplExternalSyntheticLambda10.onExtraCallback(audioExecutor12, jOnNavigationEvent2, function22, this);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = onWarmupCompleted + 81;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    HighPriorityExecutor highPriorityExecutor = this.$this_pointerInput;
                    C00163 c00163 = new C00163(this.$handleSize, this.$sheetState, null);
                    this.label = 1;
                    if (Camera2CameraControlImplExternalSyntheticLambda5.onWarmupCompleted(highPriorityExecutor, c00163, this) == objOnExtraCallback) {
                        int i5 = onExtraCallback + 95;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        return objOnExtraCallback;
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ AFg1gSDK $sheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStub(AFg1gSDK aFg1gSDK, access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
            this.$sheetState = aFg1gSDK;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = new IAuthTabCallbackStub(this.$sheetState, access13800Var);
            int i2 = onNavigationEvent + 89;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallbackStub;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i4 = onExtraCallback + 19;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((IAuthTabCallbackStub) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 17;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                AFg1gSDK aFg1gSDK = this.$sheetState;
                accessgetSTART_TIMEcp.onExtraCallback onextracallback = accessgetSTART_TIMEcp.onExtraCallback.onNavigationEvent;
                this.label = 1;
                if (aFg1gSDK.onNavigationEvent(onextracallback, this) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = onExtraCallback + 115;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                ResultKt.onNavigationEvent(obj);
                int i5 = onExtraCallback + 51;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
            Unit unit = Unit.INSTANCE;
            int i7 = onExtraCallback + 89;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    static final class onExtraCallbackWithResult implements PointerInputEventHandler {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function0<getPackageType> IAuthTabCallback;

        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallbackWithResult(Function0<? extends getPackageType> function0) {
            this.IAuthTabCallback = function0;
        }

        public final Object invoke(HighPriorityExecutor highPriorityExecutor, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            final Function0<getPackageType> function0 = this.IAuthTabCallback;
            Object objOnNavigationEvent = Camera2CameraInfoImplExternalSyntheticLambda0.onNavigationEvent(highPriorityExecutor, (Function1) null, (Function1) null, (getBacktraceNote) null, new Function1<setUseCaseAttached, Unit>() { // from class: o.AFf1zSDK.onExtraCallbackWithResult.2
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                @Override // kotlin.jvm.functions.Function1
                public /* synthetic */ Unit invoke(setUseCaseAttached setusecaseattached) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 91;
                    onNavigationEvent = i3 % 128;
                    setUseCaseAttached setusecaseattached2 = setusecaseattached;
                    if (i3 % 2 == 0) {
                        onNavigationEvent(setusecaseattached2.onExtraCallback());
                        return Unit.INSTANCE;
                    }
                    onNavigationEvent(setusecaseattached2.onExtraCallback());
                    int i4 = 53 / 0;
                    return Unit.INSTANCE;
                }

                public final void onNavigationEvent(long j) {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 113;
                    onExtraCallback = i3 % 128;
                    Object obj = null;
                    if (i3 % 2 == 0) {
                        function0.invoke();
                        throw null;
                    }
                    function0.invoke();
                    int i4 = onExtraCallback + 9;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }
            }, access13800Var, 7, (Object) null);
            if (objOnNavigationEvent != access14100.onExtraCallback()) {
                return Unit.INSTANCE;
            }
            int i2 = onNavigationEvent;
            int i3 = i2 + 9;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 16 / 0;
            }
            int i5 = i2 + 45;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }
    }

    static final class IAuthTabCallbackDefault implements Function1<useAndConfigureProgramWithTexture, Unit> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Function0<getPackageType> onExtraCallbackWithResult;

        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallbackDefault(Function0<? extends getPackageType> function0) {
            this.onExtraCallbackWithResult = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(useandconfigureprogramwithtexture);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 77 / 0;
            }
            return unit;
        }

        public final void IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.onWarmupCompleted(useandconfigureprogramwithtexture, Float.MAX_VALUE);
            unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, "닫기");
            final Function0<getPackageType> function0 = this.onExtraCallbackWithResult;
            unregisterOutputSurface.asInterface(useandconfigureprogramwithtexture, (String) null, new Function0<Boolean>() { // from class: o.AFf1zSDK.IAuthTabCallbackDefault.5
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Boolean IAuthTabCallback() {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 19;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    function0.invoke();
                    Boolean bool = Boolean.TRUE;
                    int i5 = onExtraCallbackWithResult + 13;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        return bool;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* synthetic */ Boolean invoke() {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 93;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 == 0) {
                        return IAuthTabCallback();
                    }
                    IAuthTabCallback();
                    throw null;
                }
            }, 1, (Object) null);
            int i2 = onNavigationEvent + 33;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 15 / 0;
            }
        }
    }

    private static final Unit onWarmupCompleted(long j, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        setOrientationDegrees.onWarmupCompleted(setorientationdegrees, j, 0L, 0L, onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda6), (hasMoreElements) null, (seek) null, 0, Imgproc.COLOR_YUV2BGR_YVYU, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 31;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0197 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(final long j, @NotNull final AFg1gSDK aFg1gSDK, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = onNavigationEvent + 9;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        Intrinsics.checkNotNullParameter(aFg1gSDK, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1572710254);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j)) {
                int i10 = onExtraCallback + 39;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(aFg1gSDK) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 == 0) {
            if ((i & 384) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    int i13 = onNavigationEvent + 43;
                    onExtraCallback = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i14 = 3 % 3;
                    }
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) == 146, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            } else {
                quirksExternalSyntheticBackport03 = i12 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i15 = onExtraCallback + 115;
                    onNavigationEvent = i15 % 128;
                    if (i15 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1572710254, i3, -1, "im.toss.tosssecurities.uikit.compound.topsheet.Scrim (BasicTossSecTopSheet.kt:240)");
                        int i16 = 21 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1572710254, i3, -1, "im.toss.tosssecurities.uikit.compound.topsheet.Scrim (BasicTossSecTopSheet.kt:240)");
                    }
                }
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    int i17 = onExtraCallback + 93;
                    onNavigationEvent = i17 % 128;
                    int i18 = i17 % 2;
                    objOnMinimized = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                final findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized;
                final CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent = onNavigationEvent(aFg1gSDK, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 >> 3) & 14);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(findresandmsg);
                boolean z = (i3 & 112) == 32;
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((z | zOnExtraCallback) || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = new Function0() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.BasicTossSecTopSheetKt$$ExternalSyntheticLambda13
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            getPackageType getpackagetype;
                            int i19 = 2 % 2;
                            int i20 = onExtraCallbackWithResult + 107;
                            onExtraCallback = i20 % 128;
                            if (i20 % 2 != 0) {
                                Object[] objArr = {findresandmsg, aFg1gSDK};
                                getpackagetype = (getPackageType) AFf1zSDK.onExtraCallback(1286248984, -1286248977, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr);
                                int i21 = 3 / 0;
                            } else {
                                Object[] objArr2 = {findresandmsg, aFg1gSDK};
                                getpackagetype = (getPackageType) AFf1zSDK.onExtraCallback(1286248984, -1286248977, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr2);
                            }
                            int i22 = onExtraCallbackWithResult + 103;
                            onExtraCallback = i22 % 128;
                            int i23 = i22 % 2;
                            return getpackagetype;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                Function0 function0 = (Function0) objOnMinimized2;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport03, 0.0f, 1, (Object) null);
                if (((Boolean) AFg1gSDK.IAuthTabCallback(2025873715, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -2025873708, new Object[]{aFg1gSDK}, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult())).booleanValue()) {
                    quirksExternalSyntheticBackport0OnNavigationEvent = quirksExternalSyntheticBackport0OnNavigationEvent.onExtraCallback(getExtensionsBeforeInitialized.IAuthTabCallback(SequentialExecutorWorkerRunningState.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, aFg1gSDK, new onExtraCallbackWithResult(function0)), true, new IAuthTabCallbackDefault(function0)));
                }
                boolean z2 = (i3 & 14) == 4;
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(zOnNavigationEvent | z2)) {
                    int i19 = onNavigationEvent + 73;
                    onExtraCallback = i19 % 128;
                    int i20 = i19 % 2;
                    if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized3 = new Function1() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.BasicTossSecTopSheetKt$$ExternalSyntheticLambda14
                            private static int onExtraCallbackWithResult = 0;
                            private static int onNavigationEvent = 1;

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                int i21 = 2 % 2;
                                int i22 = onNavigationEvent + 105;
                                onExtraCallbackWithResult = i22 % 128;
                                int i23 = i22 % 2;
                                Unit unitIAuthTabCallback = AFf1zSDK.IAuthTabCallback(j, cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent, (setOrientationDegrees) obj);
                                int i24 = onExtraCallbackWithResult + 89;
                                onNavigationEvent = i24 % 128;
                                if (i24 % 2 != 0) {
                                    return unitIAuthTabCallback;
                                }
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                    }
                    isChildOrHidden.onWarmupCompleted(quirksExternalSyntheticBackport0OnNavigationEvent, (Function1) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.BasicTossSecTopSheetKt$$ExternalSyntheticLambda15
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i21 = 2 % 2;
                        int i22 = onExtraCallbackWithResult + 7;
                        onWarmupCompleted = i22 % 128;
                        if (i22 % 2 == 0) {
                            return AFf1zSDK.onNavigationEvent(j, aFg1gSDK, quirksExternalSyntheticBackport04, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        }
                        AFf1zSDK.onNavigationEvent(j, aFg1gSDK, quirksExternalSyntheticBackport04, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                });
            }
            i5 = onNavigationEvent + 59;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            return;
        }
        i3 |= 384;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) == 146, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        i5 = onNavigationEvent + 59;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final CameraPresenceProviderExternalSyntheticLambda6<Float> onNavigationEvent(final AFg1gSDK aFg1gSDK, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        final float f;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 125;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = false;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = onExtraCallback + 103;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1537312098, i, -1, "im.toss.tosssecurities.uikit.compound.topsheet.computeScrimAlpha (BasicTossSecTopSheet.kt:272)");
                int i5 = 29 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1537312098, i, -1, "im.toss.tosssecurities.uikit.compound.topsheet.computeScrimAlpha (BasicTossSecTopSheet.kt:272)");
            }
        }
        if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0)) {
            int i6 = onExtraCallback + 91;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            f = 0.56f;
        } else {
            f = 0.2f;
        }
        if (((i & 14) ^ 6) > 4) {
            int i8 = onExtraCallback + 55;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 38 / 0;
                if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(aFg1gSDK)) {
                    if ((i & 6) == 4) {
                        int i10 = onExtraCallback + 29;
                        onNavigationEvent = i10 % 128;
                        int i11 = i10 % 2;
                        z = true;
                    }
                }
            } else if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(aFg1gSDK)) {
            }
        }
        boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zIAuthTabCallback | z) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.BasicTossSecTopSheetKt$$ExternalSyntheticLambda20
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i12 = 2 % 2;
                    int i13 = onExtraCallbackWithResult + 37;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    Float fValueOf = Float.valueOf(AFf1zSDK.onExtraCallbackWithResult(f, aFg1gSDK));
                    int i15 = IAuthTabCallback + 113;
                    onExtraCallbackWithResult = i15 % 128;
                    if (i15 % 2 != 0) {
                        return fValueOf;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            });
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i12 = onExtraCallback + 69;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return cameraPresenceProviderExternalSyntheticLambda6;
    }

    private static final float onWarmupCompleted(float f, AFg1gSDK aFg1gSDK) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        float fCoerceIn = f * RangesKt___RangesKt.coerceIn(aFg1gSDK.asInterface(), 0.0f, 1.0f);
        int i4 = onNavigationEvent + 107;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
        return fCoerceIn;
    }

    public static final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final AFg1gSDK aFg1gSDK) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(aFg1gSDK, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = ListFuture2.onWarmupCompleted(quirksExternalSyntheticBackport0, new getBacktraceNote() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.BasicTossSecTopSheetKt$$ExternalSyntheticLambda16
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // o.getBacktraceNote
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                component8 component8VarIAuthTabCallback;
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 81;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    component8VarIAuthTabCallback = AFf1zSDK.IAuthTabCallback(aFg1gSDK, (component4) obj, (component7) obj2, (VirtualCameraCaptureResult) obj3);
                    int i4 = 60 / 0;
                } else {
                    component8VarIAuthTabCallback = AFf1zSDK.IAuthTabCallback(aFg1gSDK, (component4) obj, (component7) obj2, (VirtualCameraCaptureResult) obj3);
                }
                int i5 = IAuthTabCallback + 35;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return component8VarIAuthTabCallback;
            }
        });
        int i2 = onNavigationEvent + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return quirksExternalSyntheticBackport0OnWarmupCompleted;
    }

    private static final component8 onNavigationEvent(final AFg1gSDK aFg1gSDK, component4 component4Var, component7 component7Var, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(component4Var, "");
        Intrinsics.checkNotNullParameter(component7Var, "");
        aFg1gSDK.onNavigationEvent(virtualCameraCaptureResult.onExtraCallback());
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        final getStreamSharingChildren getstreamsharingchildrenOnExtraCallback = component7Var.onExtraCallback(((Long) AFg1gSDK.IAuthTabCallback(1186280271, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1186280271, new Object[]{aFg1gSDK}, iOnExtraCallbackWithResult)).longValue());
        aFg1gSDK.onWarmupCompleted(getstreamsharingchildrenOnExtraCallback.T_());
        component8 component8VarIAuthTabCallback = component4.IAuthTabCallback(component4Var, getstreamsharingchildrenOnExtraCallback.getInterfaceDescriptor(), getstreamsharingchildrenOnExtraCallback.T_(), (Map) null, new Function1() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.BasicTossSecTopSheetKt$$ExternalSyntheticLambda5
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 5;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    AFf1zSDK.IAuthTabCallback(getstreamsharingchildrenOnExtraCallback, aFg1gSDK, (getStreamSharingChildren.onExtraCallbackWithResult) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitIAuthTabCallback = AFf1zSDK.IAuthTabCallback(getstreamsharingchildrenOnExtraCallback, aFg1gSDK, (getStreamSharingChildren.onExtraCallbackWithResult) obj);
                int i4 = onNavigationEvent + 71;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallback;
            }
        }, 4, (Object) null);
        int i2 = onExtraCallback + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return component8VarIAuthTabCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getStreamSharingChildren getstreamsharingchildren = (getStreamSharingChildren) objArr[0];
        AFg1gSDK aFg1gSDK = (AFg1gSDK) objArr[1];
        getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult = (getStreamSharingChildren.onExtraCallbackWithResult) objArr[2];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        onextracallbackwithresult.IAuthTabCallback();
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = onextracallbackwithresult.onExtraCallbackWithResult(((Float) AFg1gSDK.IAuthTabCallback(1909395745, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1909395736, new Object[]{aFg1gSDK}, iOnExtraCallbackWithResult)).floatValue());
        getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult3, 0.0f, 4, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 67;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
        return unit;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ AFg1gSDK $this_with;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(AFg1gSDK aFg1gSDK, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$this_with = aFg1gSDK;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$this_with, access13800Var);
            int i2 = onExtraCallbackWithResult + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 47;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 != 0) {
                onWarmupCompleted(findresandmsg2, access13800Var2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg2, access13800Var2);
            int i3 = onExtraCallbackWithResult + 99;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onNavigationEvent) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 123;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallbackWithResult + 63;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = onExtraCallbackWithResult + 119;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                AFg1gSDK aFg1gSDK = this.$this_with;
                accessgetSTART_TIMEcp.onWarmupCompleted onwarmupcompleted = accessgetSTART_TIMEcp.onWarmupCompleted.IAuthTabCallback;
                this.label = 1;
                if (aFg1gSDK.onNavigationEvent(onwarmupcompleted, this) == objOnExtraCallback) {
                    int i7 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 != 0) {
                        return objOnExtraCallback;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static final boolean onNavigationEvent(findResAndMsg findresandmsg, AFg1gSDK aFg1gSDK) {
        int i = 2 % 2;
        onLoadStarted.onExtraCallback(findresandmsg, null, null, new onNavigationEvent(aFg1gSDK, null), 3, null);
        int i2 = onExtraCallback + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return true;
    }

    private static final Unit IAuthTabCallback(final AFg1gSDK aFg1gSDK, String str, final findResAndMsg findresandmsg, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onExtraCallbackWithResult(useandconfigureprogramwithtexture, str, new Function0() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.BasicTossSecTopSheetKt$$ExternalSyntheticLambda21
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 33;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {findresandmsg, aFg1gSDK};
                Boolean boolValueOf = Boolean.valueOf(((Boolean) AFf1zSDK.onExtraCallback(-2105564746, 2105564755, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr)).booleanValue());
                int i5 = onWarmupCompleted + 65;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return boolValueOf;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallback + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final void onExtraCallbackWithResult(final AFg1gSDK aFg1gSDK, final findResAndMsg findresandmsg, final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(44749235);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(aFg1gSDK) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i5 = onExtraCallback + 107;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(findresandmsg)) {
                int i7 = onNavigationEvent + 109;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ^ true ? 128 : 256;
        }
        if ((i2 & 147) != 146) {
            int i9 = onNavigationEvent + 99;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(44749235, i2, -1, "im.toss.tosssecurities.uikit.compound.topsheet.DragHandle (BasicTossSecTopSheet.kt:303)");
            }
            final String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.tds.compose.R.string.accessibility_bottomsheet_close, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = QuirkSettingsLoader.Companion.onExtraCallback();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = getCurrentContentInsetEnd.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), true, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, 2, (Object) null);
            boolean z2 = (i2 & 14) == 4;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strOnExtraCallback);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(findresandmsg);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((z2 | zOnNavigationEvent | zOnExtraCallback) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.BasicTossSecTopSheetKt$$ExternalSyntheticLambda17
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i11 = 2 % 2;
                        int i12 = IAuthTabCallback + 37;
                        onNavigationEvent = i12 % 128;
                        int i13 = i12 % 2;
                        AFg1gSDK aFg1gSDK2 = aFg1gSDK;
                        if (i13 != 0) {
                            return AFf1zSDK.onExtraCallback(aFg1gSDK2, strOnExtraCallback, findresandmsg, (useAndConfigureProgramWithTexture) obj);
                        }
                        Unit unitOnExtraCallback = AFf1zSDK.onExtraCallback(aFg1gSDK2, strOnExtraCallback, findresandmsg, (useAndConfigureProgramWithTexture) obj);
                        int i14 = 32 / 0;
                        return unitOnExtraCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = getExtensionsBeforeInitialized.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, true, (Function1) objOnMinimized);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback, false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i11 = onNavigationEvent + 57;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                getAwbState.onExtraCallback();
                int i13 = onExtraCallback + 101;
                onNavigationEvent = i13 % 128;
                int i14 = i13 % 2;
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                int i15 = onExtraCallback + 93;
                onNavigationEvent = i15 % 128;
                int i16 = i15 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            function2.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i2 >> 6) & 14));
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.BasicTossSecTopSheetKt$$ExternalSyntheticLambda18
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i17 = 2 % 2;
                    int i18 = IAuthTabCallback + 91;
                    onExtraCallback = i18 % 128;
                    if (i18 % 2 != 0) {
                        return AFf1zSDK.onWarmupCompleted(aFg1gSDK, findresandmsg, function2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    AFf1zSDK.onWarmupCompleted(aFg1gSDK, findresandmsg, function2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        final int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2002164669);
            throw null;
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2002164669);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(iIntValue != 0, iIntValue & 1)) {
            int i3 = onNavigationEvent + 57;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 21 / 0;
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2002164669, iIntValue, -1, "im.toss.tosssecurities.uikit.compound.topsheet.Preview (BasicTossSecTopSheet.kt:328)");
                    int i5 = onExtraCallback + 75;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                }
                y1hExternalSyntheticLambda0.IAuthTabCallback(AFg1bSDK.onNavigationEvent.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i7 = onExtraCallback + 107;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i8 = onExtraCallback + 73;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                y1hExternalSyntheticLambda0.IAuthTabCallback(AFg1bSDK.onNavigationEvent.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            int i10 = onNavigationEvent + 57;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.BasicTossSecTopSheetKt$$ExternalSyntheticLambda3
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i12 = 2 % 2;
                    int i13 = IAuthTabCallback + 41;
                    onExtraCallback = i13 % 128;
                    int i14 = i13 % 2;
                    int i15 = iIntValue;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                    int iIntValue2 = ((Integer) obj2).intValue();
                    if (i14 == 0) {
                        return AFf1zSDK.IAuthTabCallback(i15, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue2);
                    }
                    AFf1zSDK.IAuthTabCallback(i15, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue2);
                    throw null;
                }
            });
        }
        return null;
    }

    private static final float onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            return number.floatValue();
        }
        number.floatValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getPackageType onWarmupCompleted(findResAndMsg findresandmsg, AFg1gSDK aFg1gSDK) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (getPackageType) onExtraCallback(1286248984, -1286248977, iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback3, new Object[]{findresandmsg, aFg1gSDK});
    }

    public static /* synthetic */ Unit onWarmupCompleted(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (Unit) onExtraCallback(-1636612140, 1636612144, iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback3, new Object[]{useandconfigureprogramwithtexture});
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(findResAndMsg findresandmsg, AFg1gSDK aFg1gSDK) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return ((Boolean) onExtraCallback(-2105564746, 2105564755, iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback3, new Object[]{findresandmsg, aFg1gSDK})).booleanValue();
    }

    public static final void onWarmupCompleted(@NotNull AFg1gSDK aFg1gSDK, long j, long j2, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @NotNull getBacktraceNote<? super MeteringRepeatingSessionExternalSyntheticLambda0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {aFg1gSDK, Long.valueOf(j), Long.valueOf(j2), function2, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        onExtraCallback(-1032121787, 1032121788, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr);
    }

    private static final void onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        onExtraCallback(-1824839388, 1824839394, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr);
    }

    private static final getPackageType onExtraCallback(findResAndMsg findresandmsg, AFg1gSDK aFg1gSDK) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (getPackageType) onExtraCallback(33310657, -33310652, iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback3, new Object[]{findresandmsg, aFg1gSDK});
    }

    public static final void onExtraCallback(@NotNull AFg1gSDK aFg1gSDK, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @NotNull getBacktraceNote<? super MeteringRepeatingSessionExternalSyntheticLambda0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {aFg1gSDK, quirksExternalSyntheticBackport0, Long.valueOf(j), function2, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        onExtraCallback(1916341488, -1916341488, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr);
    }

    private static final removeObserverLocked onExtraCallback(AFg1gSDK aFg1gSDK, long j, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        Object[] objArr = {aFg1gSDK, Long.valueOf(j), sessionProcessorCaptureCallback};
        return (removeObserverLocked) onExtraCallback(-360658876, 360658884, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr);
    }

    private static final ExtensionsInfoExternalSyntheticLambda0 onExtraCallbackWithResult(AFg1gSDK aFg1gSDK, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (ExtensionsInfoExternalSyntheticLambda0) onExtraCallback(1339659614, -1339659611, iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback3, new Object[]{aFg1gSDK, r8lambdanm9dm2eewl4vrptnjmesfjqky4});
    }

    private static final Unit onNavigationEvent(getStreamSharingChildren getstreamsharingchildren, AFg1gSDK aFg1gSDK, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        return (Unit) onExtraCallback(781804512, -781804510, iIAuthTabCallback, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback3, new Object[]{getstreamsharingchildren, aFg1gSDK, onextracallbackwithresult});
    }
}
