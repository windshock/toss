package im.toss.tosssecurities.uikit.dnd;

import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AFg1qSDK;
import o.AFg1sSDK;
import o.Camera2CameraControllerExternalSyntheticLambda0;
import o.Camera2CameraMetadataExternalSyntheticLambda1;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.TTHistoryActivity2;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.alertWithArgs;
import o.getBacktraceNote;
import o.isZslDisabledByByUserCaseConfig;
import o.needCorrectJpegMetadata;
import o.r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RememberLazyListDragAndDropStateKt {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Integer IAuthTabCallback(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(obj);
            throw null;
        }
        Integer numOnExtraCallback = onExtraCallback(obj);
        int i3 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return numOnExtraCallback;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        boolean z = i3 == 0;
        int i4 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(z);
        }
        int i5 = 45 / 0;
        return Boolean.valueOf(z);
    }

    private static final Integer onExtraCallback(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        int i4 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallbackWithResult(new Object[]{obj, obj2}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1341741583, iOnExtraCallbackWithResult2, -1341741582);
        int i3 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + Imgproc.COLOR_YUV2RGBA_YVYU;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6, i, i2, obj);
        int i6 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6, obj);
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
        int i5 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Object obj, RegionDropPosition regionDropPosition, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6, obj, regionDropPosition, obj2);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6, obj, regionDropPosition, obj2);
        int i3 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~i4;
        int i11 = i9 | (~(i10 | i5));
        int i12 = (~(i5 | i7)) | (~(i8 | i10));
        int i13 = ~(i6 | i4);
        int i14 = i12 | i13;
        int i15 = i13 | i11;
        int i16 = i6 + i4 + i2 + ((-1585779005) * i3) + (640148872 * i);
        int i17 = i16 * i16;
        int i18 = (i6 * 308833806) + 153878528 + (308833806 * i4) + ((-448846874) * i11) + ((-224423437) * i14) + (224423437 * i15) + (84410368 * i2) + (1159200768 * i3) + ((-734003200) * i) + (2089549824 * i17);
        int i19 = (i6 * (-1291220770)) + 263398195 + (i4 * (-1291220770)) + (i11 * (-1802)) + (i14 * (-901)) + (i15 * 901) + (i2 * (-1291221671)) + (i3 * (-1079815989)) + (i * 669414472) + (i17 * 145489920);
        int i20 = i18 + (i19 * i19 * (-1699479552));
        return i20 != 1 ? i20 != 2 ? i20 != 3 ? i20 != 4 ? i20 != 5 ? onNavigationEvent(objArr) : IAuthTabCallbackStub(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Object obj, RegionDropPosition regionDropPosition, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(obj, regionDropPosition, obj2);
        if (i3 != 0) {
            int i4 = 64 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        boolean zBooleanValue = ((Boolean) onExtraCallbackWithResult(new Object[]{obj, obj2}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1321686569, iOnExtraCallbackWithResult, -1321686565)).booleanValue();
        int i4 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        boolean zBooleanValue = ((Boolean) onExtraCallbackWithResult(new Object[]{cameraPresenceProviderExternalSyntheticLambda6, obj, obj2}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -1551885209, iOnExtraCallbackWithResult, 1551885212)).booleanValue();
        int i4 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return Boolean.valueOf(onWarmupCompleted(obj, obj2));
        }
        onWarmupCompleted(obj, obj2);
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i, i2, obj);
        int i6 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i2 % 128;
        Object obj3 = null;
        if (i2 % 2 == 0) {
            IAuthTabCallbackDefault(obj, obj2);
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(obj, obj2);
        int i3 = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        obj3.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(cameraPresenceProviderExternalSyntheticLambda6, obj, obj2);
        if (i3 != 0) {
            int i4 = 30 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Integer onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Integer numOnExtraCallbackWithResult = onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6, obj);
        int i4 = onWarmupCompleted + 79;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return numOnExtraCallbackWithResult;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        Object obj = objArr[1];
        Object obj2 = objArr[2];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
            ((Boolean) onExtraCallbackWithResult(new Object[]{cameraPresenceProviderExternalSyntheticLambda6, obj, obj2}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1688063479, iOnExtraCallbackWithResult, -1688063474)).booleanValue();
            throw null;
        }
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        boolean zBooleanValue = ((Boolean) onExtraCallbackWithResult(new Object[]{cameraPresenceProviderExternalSyntheticLambda6, obj, obj2}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1688063479, iOnExtraCallbackWithResult2, -1688063474)).booleanValue();
        int i3 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    public static /* synthetic */ Unit onWarmupCompleted(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(obj);
        int i4 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            asBinder(cameraPresenceProviderExternalSyntheticLambda6, obj, obj2);
            throw null;
        }
        Unit unitAsBinder = asBinder(cameraPresenceProviderExternalSyntheticLambda6, obj, obj2);
        int i3 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unitAsBinder;
        }
        throw null;
    }

    private static final boolean onWarmupCompleted(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        int i4 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(Object obj, RegionDropPosition regionDropPosition, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(regionDropPosition, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Unit unit;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj2, "");
            unit = Unit.INSTANCE;
            int i3 = 1 / 0;
        } else {
            Intrinsics.checkNotNullParameter(obj2, "");
            unit = Unit.INSTANCE;
        }
        int i4 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Integer onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Integer num = (Integer) ((Function1) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).invoke(obj);
        int i4 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return num;
    }

    private static final Unit onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            ((getBacktraceNote) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).invoke(Integer.valueOf(i), Integer.valueOf(i2), obj);
            Unit unit = Unit.INSTANCE;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        ((getBacktraceNote) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).invoke(Integer.valueOf(i), Integer.valueOf(i2), obj);
        Unit unit2 = Unit.INSTANCE;
        int i5 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unit2;
    }

    private static final Unit asBinder(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        ((Function2) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).invoke(obj, obj2);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 25;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        ((Function1) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).invoke(obj);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        Object obj = objArr[1];
        Object obj2 = objArr[2];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        boolean zBooleanValue = ((Boolean) ((Function2) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).invoke(obj, obj2)).booleanValue();
        int i4 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        int i5 = 2 / 0;
        return Boolean.valueOf(zBooleanValue);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        Object obj = objArr[1];
        Object obj2 = objArr[2];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(obj2, "");
            ((Boolean) ((Function2) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).invoke(obj, obj2)).booleanValue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        boolean zBooleanValue = ((Boolean) ((Function2) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).invoke(obj, obj2)).booleanValue();
        int i3 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    private static final Unit onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Object obj, RegionDropPosition regionDropPosition, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(regionDropPosition, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        ((getBacktraceNote) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).invoke(obj, regionDropPosition, obj2);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj2, "");
        ((Function2) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).invoke(obj, obj2);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03c5 A[PHI: r11
      0x03c5: PHI (r11v13 float) = (r11v11 float), (r11v14 float) binds: [B:157:0x03c3, B:153:0x03bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03f2 A[PHI: r3
      0x03f2: PHI (r3v9 float) = (r3v7 float), (r3v14 float) binds: [B:171:0x03f0, B:165:0x03e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x040d A[PHI: r7
      0x040d: PHI (r7v21 float) = (r7v23 float), (r7v24 float) binds: [B:181:0x040b, B:177:0x0405] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AFg1qSDK onExtraCallbackWithResult(@NotNull Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, @NotNull Function1<Object, Integer> function1, @NotNull getBacktraceNote<? super Integer, ? super Integer, Object, Unit> getbacktracenote, @NotNull Function2<Object, Object, Unit> function2, @Nullable Function1<Object, Unit> function12, @Nullable Function2<Object, Object, Boolean> function22, @Nullable Function2<Object, Object, Boolean> function23, @Nullable getBacktraceNote<Object, ? super RegionDropPosition, Object, Unit> getbacktracenote2, @Nullable Function2<Object, Object, Unit> function24, float f, float f2, float f3, float f4, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        Function1<Object, Unit> function13;
        Function2<Object, Object, Boolean> function25;
        Function2<Object, Object, Boolean> function26;
        getBacktraceNote<Object, ? super RegionDropPosition, Object, Unit> getbacktracenote3;
        Function2<Object, Object, Unit> function27;
        float f5;
        float f6;
        boolean z;
        float f7;
        boolean z2;
        float f8;
        boolean z3;
        float f9;
        boolean z4;
        boolean z5;
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(camera2CameraMetadataExternalSyntheticLambda1, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(getbacktracenote, "");
            Intrinsics.checkNotNullParameter(function2, "");
            if ((i3 & 40) != 0) {
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.tosssecurities.uikit.dnd.RememberLazyListDragAndDropStateKt$$ExternalSyntheticLambda0
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i6 = 2 % 2;
                            int i7 = onExtraCallback + 93;
                            IAuthTabCallback = i7 % 128;
                            int i8 = i7 % 2;
                            Unit unitOnWarmupCompleted = RememberLazyListDragAndDropStateKt.onWarmupCompleted(obj);
                            int i9 = onExtraCallback + 59;
                            IAuthTabCallback = i9 % 128;
                            if (i9 % 2 == 0) {
                                return unitOnWarmupCompleted;
                            }
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    int i6 = onExtraCallbackWithResult + 115;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                }
                function13 = (Function1) objOnMinimized;
            } else {
                function13 = function12;
            }
        } else {
            Intrinsics.checkNotNullParameter(camera2CameraMetadataExternalSyntheticLambda1, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(getbacktracenote, "");
            Intrinsics.checkNotNullParameter(function2, "");
            if ((i3 & 16) != 0) {
            }
        }
        Object obj = null;
        if ((i3 & 32) != 0) {
            int i8 = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                obj.hashCode();
                throw null;
            }
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = new Function2() { // from class: im.toss.tosssecurities.uikit.dnd.RememberLazyListDragAndDropStateKt$$ExternalSyntheticLambda4
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i9 = 2 % 2;
                        int i10 = onExtraCallbackWithResult + 103;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
                        Boolean boolValueOf = Boolean.valueOf(((Boolean) RememberLazyListDragAndDropStateKt.onExtraCallbackWithResult(new Object[]{obj2, obj3}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -828893560, iOnExtraCallbackWithResult, 828893560)).booleanValue());
                        int i12 = onExtraCallback + 91;
                        onExtraCallbackWithResult = i12 % 128;
                        int i13 = i12 % 2;
                        return boolValueOf;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            function25 = (Function2) objOnMinimized2;
        } else {
            function25 = function22;
        }
        if ((i3 & 64) != 0) {
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized3 = new Function2() { // from class: im.toss.tosssecurities.uikit.dnd.RememberLazyListDragAndDropStateKt$$ExternalSyntheticLambda5
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i9 = 2 % 2;
                        int i10 = onNavigationEvent + 81;
                        IAuthTabCallback = i10 % 128;
                        int i11 = i10 % 2;
                        boolean zOnExtraCallbackWithResult = RememberLazyListDragAndDropStateKt.onExtraCallbackWithResult(obj2, obj3);
                        if (i11 != 0) {
                            Boolean.valueOf(zOnExtraCallbackWithResult);
                            throw null;
                        }
                        Boolean boolValueOf = Boolean.valueOf(zOnExtraCallbackWithResult);
                        int i12 = onNavigationEvent + 15;
                        IAuthTabCallback = i12 % 128;
                        int i13 = i12 % 2;
                        return boolValueOf;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
            }
            function26 = (Function2) objOnMinimized3;
        } else {
            function26 = function23;
        }
        if ((i3 & 128) != 0) {
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized4 = new getBacktraceNote() { // from class: im.toss.tosssecurities.uikit.dnd.RememberLazyListDragAndDropStateKt$$ExternalSyntheticLambda6
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    @Override // o.getBacktraceNote
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i9 = 2 % 2;
                        int i10 = onExtraCallbackWithResult + 69;
                        IAuthTabCallback = i10 % 128;
                        RegionDropPosition regionDropPosition = (RegionDropPosition) obj3;
                        if (i10 % 2 == 0) {
                            return RememberLazyListDragAndDropStateKt.onExtraCallbackWithResult(obj2, regionDropPosition, obj4);
                        }
                        RememberLazyListDragAndDropStateKt.onExtraCallbackWithResult(obj2, regionDropPosition, obj4);
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
            }
            getbacktracenote3 = (getBacktraceNote) objOnMinimized4;
        } else {
            getbacktracenote3 = getbacktracenote2;
        }
        if ((i3 & 256) != 0) {
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized5 = new Function2() { // from class: im.toss.tosssecurities.uikit.dnd.RememberLazyListDragAndDropStateKt$$ExternalSyntheticLambda7
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i9 = 2 % 2;
                        int i10 = onNavigationEvent + 91;
                        onWarmupCompleted = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unitOnExtraCallback = RememberLazyListDragAndDropStateKt.onExtraCallback(obj2, obj3);
                        int i12 = onWarmupCompleted + 81;
                        onNavigationEvent = i12 % 128;
                        if (i12 % 2 == 0) {
                            int i13 = 42 / 0;
                        }
                        return unitOnExtraCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
            }
            function27 = (Function2) objOnMinimized5;
        } else {
            function27 = function24;
        }
        float f10 = (i3 & Imgcodecs.IMWRITE_AVIF_QUALITY) != 0 ? 1800.0f : f;
        if ((i3 & 1024) != 0) {
            int i9 = onExtraCallbackWithResult + 25;
            f5 = f10;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            f6 = 0.25f;
        } else {
            f5 = f10;
            f6 = f2;
        }
        float f11 = (i3 & 2048) != 0 ? 0.75f : f3;
        float f12 = (i3 & 4096) != 0 ? 0.65f : f4;
        long j2 = (i3 & TTHistoryActivity2.SIZE) != 0 ? 400L : j;
        float f13 = f11;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(546916362, i, i2, "im.toss.tosssecurities.uikit.dnd.rememberLazyListDragAndDropState (RememberLazyListDragAndDropState.kt:69)");
        }
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(function1, cameraCaptureResultEmptyCameraCaptureResult, (i >> 3) & 14);
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, (i >> 6) & 14);
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback3 = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(function2, cameraCaptureResultEmptyCameraCaptureResult, (i >> 9) & 14);
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback4 = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(function13, cameraCaptureResultEmptyCameraCaptureResult, (i >> 12) & 14);
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback5 = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(function25, cameraCaptureResultEmptyCameraCaptureResult, (i >> 15) & 14);
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback6 = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(function26, cameraCaptureResultEmptyCameraCaptureResult, (i >> 18) & 14);
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback7 = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult, (i >> 21) & 14);
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback8 = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(function27, cameraCaptureResultEmptyCameraCaptureResult, (i >> 24) & 14);
        int i11 = (i & 14) ^ 6;
        float f14 = f6;
        if (i11 <= 4 || (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1))) {
            z = (i & 6) == 4;
        }
        boolean z6 = (((i2 & 896) ^ 384) > 256 && cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f12)) || (i2 & 384) == 256;
        Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((z6 | z) || objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized6 = new AFg1qSDK(f12);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
        }
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objOnMinimized6;
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
        Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent || objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized7 = new Function1() { // from class: im.toss.tosssecurities.uikit.dnd.RememberLazyListDragAndDropStateKt$$ExternalSyntheticLambda8
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i12 = 2 % 2;
                    int i13 = onNavigationEvent + 63;
                    onExtraCallbackWithResult = i13 % 128;
                    int i14 = i13 % 2;
                    Integer numOnWarmupCompleted = RememberLazyListDragAndDropStateKt.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, obj2);
                    int i15 = onExtraCallbackWithResult + 81;
                    onNavigationEvent = i15 % 128;
                    if (i15 % 2 != 0) {
                        return numOnWarmupCompleted;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized7);
        }
        aFg1qSDK.IAuthTabCallback((Function1<Object, Integer>) objOnMinimized7);
        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2);
        Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent2 || objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized8 = new getBacktraceNote() { // from class: im.toss.tosssecurities.uikit.dnd.RememberLazyListDragAndDropStateKt$$ExternalSyntheticLambda9
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // o.getBacktraceNote
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i12 = 2 % 2;
                    int i13 = IAuthTabCallback + 3;
                    onWarmupCompleted = i13 % 128;
                    int i14 = i13 % 2;
                    Unit unitOnExtraCallback = RememberLazyListDragAndDropStateKt.onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2, ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), obj4);
                    int i15 = IAuthTabCallback + 111;
                    onWarmupCompleted = i15 % 128;
                    int i16 = i15 % 2;
                    return unitOnExtraCallback;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized8);
        }
        aFg1qSDK.onExtraCallback((getBacktraceNote<? super Integer, ? super Integer, Object, Unit>) objOnMinimized8);
        boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback3);
        Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnNavigationEvent3) {
            int i12 = onExtraCallbackWithResult + 109;
            onWarmupCompleted = i12 % 128;
            if (i12 % 2 == 0) {
                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                throw null;
            }
            if (objOnMinimized9 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized9 = new Function2() { // from class: im.toss.tosssecurities.uikit.dnd.RememberLazyListDragAndDropStateKt$$ExternalSyntheticLambda10
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i13 = 2 % 2;
                        int i14 = onNavigationEvent + 11;
                        onExtraCallbackWithResult = i14 % 128;
                        int i15 = i14 % 2;
                        Unit unitOnWarmupCompleted = RememberLazyListDragAndDropStateKt.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback3, obj2, obj3);
                        int i16 = onNavigationEvent + 19;
                        onExtraCallbackWithResult = i16 % 128;
                        if (i16 % 2 == 0) {
                            int i17 = 10 / 0;
                        }
                        return unitOnWarmupCompleted;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized9);
            }
        }
        aFg1qSDK.onNavigationEvent((Function2<Object, Object, Unit>) objOnMinimized9);
        boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback4);
        Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent4 || objOnMinimized10 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized10 = new Function1() { // from class: im.toss.tosssecurities.uikit.dnd.RememberLazyListDragAndDropStateKt$$ExternalSyntheticLambda11
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = onNavigationEvent + 23;
                    onExtraCallbackWithResult = i14 % 128;
                    int i15 = i14 % 2;
                    Unit unitOnExtraCallback = RememberLazyListDragAndDropStateKt.onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback4, obj2);
                    int i16 = onExtraCallbackWithResult + 13;
                    onNavigationEvent = i16 % 128;
                    if (i16 % 2 == 0) {
                        return unitOnExtraCallback;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized10);
        }
        aFg1qSDK.onExtraCallbackWithResult((Function1<Object, Unit>) objOnMinimized10);
        boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback5);
        Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent5 || objOnMinimized11 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized11 = new Function2() { // from class: im.toss.tosssecurities.uikit.dnd.RememberLazyListDragAndDropStateKt$$ExternalSyntheticLambda12
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i13 = 2 % 2;
                    int i14 = onWarmupCompleted + 97;
                    IAuthTabCallback = i14 % 128;
                    int i15 = i14 % 2;
                    Object[] objArr = {cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback5, obj2, obj3};
                    int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
                    Boolean boolValueOf = Boolean.valueOf(((Boolean) RememberLazyListDragAndDropStateKt.onExtraCallbackWithResult(objArr, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -478745404, iOnExtraCallbackWithResult, 478745406)).booleanValue());
                    int i16 = onWarmupCompleted + 73;
                    IAuthTabCallback = i16 % 128;
                    if (i16 % 2 == 0) {
                        return boolValueOf;
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized11);
        }
        aFg1qSDK.onWarmupCompleted((Function2<Object, Object, Boolean>) objOnMinimized11);
        boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback6);
        Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnNavigationEvent6) {
            int i13 = onWarmupCompleted + 125;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            if (objOnMinimized12 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized12 = new Function2() { // from class: im.toss.tosssecurities.uikit.dnd.RememberLazyListDragAndDropStateKt$$ExternalSyntheticLambda1
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i15 = 2 % 2;
                        int i16 = onNavigationEvent + 79;
                        onExtraCallback = i16 % 128;
                        int i17 = i16 % 2;
                        Boolean boolValueOf = Boolean.valueOf(RememberLazyListDragAndDropStateKt.onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback6, obj2, obj3));
                        int i18 = onNavigationEvent + 35;
                        onExtraCallback = i18 % 128;
                        if (i18 % 2 == 0) {
                            return boolValueOf;
                        }
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized12);
            }
        }
        aFg1qSDK.onExtraCallback((Function2<Object, Object, Boolean>) objOnMinimized12);
        boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback7);
        Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnNavigationEvent7) {
            int i15 = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i15 % 128;
            int i16 = i15 % 2;
            if (objOnMinimized13 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized13 = new getBacktraceNote() { // from class: im.toss.tosssecurities.uikit.dnd.RememberLazyListDragAndDropStateKt$$ExternalSyntheticLambda2
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // o.getBacktraceNote
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i17 = 2 % 2;
                        int i18 = onWarmupCompleted + 79;
                        onExtraCallback = i18 % 128;
                        if (i18 % 2 != 0) {
                            RememberLazyListDragAndDropStateKt.onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback7, obj2, (RegionDropPosition) obj3, obj4);
                            throw null;
                        }
                        Unit unitOnExtraCallback = RememberLazyListDragAndDropStateKt.onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback7, obj2, (RegionDropPosition) obj3, obj4);
                        int i19 = onExtraCallback + 15;
                        onWarmupCompleted = i19 % 128;
                        if (i19 % 2 == 0) {
                            int i20 = 61 / 0;
                        }
                        return unitOnExtraCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized13);
            }
        }
        aFg1qSDK.onNavigationEvent((getBacktraceNote<Object, ? super RegionDropPosition, Object, Unit>) objOnMinimized13);
        boolean zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback8);
        Object objOnMinimized14 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent8 || objOnMinimized14 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized14 = new Function2() { // from class: im.toss.tosssecurities.uikit.dnd.RememberLazyListDragAndDropStateKt$$ExternalSyntheticLambda3
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i17 = 2 % 2;
                    int i18 = IAuthTabCallback + 73;
                    onExtraCallback = i18 % 128;
                    int i19 = i18 % 2;
                    Unit unitOnNavigationEvent = RememberLazyListDragAndDropStateKt.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback8, obj2, obj3);
                    int i20 = onExtraCallback + 15;
                    IAuthTabCallback = i20 % 128;
                    if (i20 % 2 != 0) {
                        return unitOnNavigationEvent;
                    }
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized14);
        }
        aFg1qSDK.IAuthTabCallback((Function2<Object, Object, Unit>) objOnMinimized14);
        AFg1qSDK.onExtraCallback(new Object[]{aFg1qSDK, Float.valueOf(((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(AFg1sSDK.onWarmupCompleted()))}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 1871066867, -1871066856);
        AFg1qSDK.onExtraCallback(new Object[]{aFg1qSDK, Float.valueOf(((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f)))}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -788700804, 788700816);
        boolean zOnNavigationEvent9 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(aFg1qSDK);
        long j3 = j2;
        boolean z7 = (((i2 & 7168) ^ 3072) > 2048 && cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(j3)) || (i2 & 3072) == 2048;
        Object objOnMinimized15 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnNavigationEvent9 | z7) || objOnMinimized15 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized15 = new RememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$16$1(aFg1qSDK, j3, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized15);
        }
        isZslDisabledByByUserCaseConfig.onExtraCallback(aFg1qSDK, Long.valueOf(j3), (Function2) objOnMinimized15, cameraCaptureResultEmptyCameraCaptureResult, (i2 >> 6) & 112);
        Object[] objArr = {aFg1qSDK, Float.valueOf(f5), Float.valueOf(f14), Float.valueOf(f13)};
        boolean zOnNavigationEvent10 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(aFg1qSDK);
        if (((i2 & 14) ^ 6) > 4) {
            int i17 = onWarmupCompleted + 57;
            onExtraCallbackWithResult = i17 % 128;
            int i18 = i17 % 2;
            f7 = f14;
            if (cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f7)) {
                z2 = true;
            }
            if (((i2 & 112) ^ 48) <= 32) {
                int i19 = onWarmupCompleted + 87;
                onExtraCallbackWithResult = i19 % 128;
                if (i19 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f13);
                    throw null;
                }
                f8 = f13;
                if (cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f8)) {
                    z3 = true;
                }
                if (((1879048192 & i) ^ 805306368) > 536870912) {
                    f9 = f5;
                    z4 = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f9);
                    z5 = (i11 <= 4 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1)) || (i & 6) == 4;
                    Object objOnMinimized16 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnNavigationEvent10 | z2 | z3 | z4 | z5) {
                        int i20 = onWarmupCompleted + 47;
                        onExtraCallbackWithResult = i20 % 128;
                        if (i20 % 2 != 0) {
                            int i21 = 8 / 0;
                            if (objOnMinimized16 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized16 = new RememberLazyListDragAndDropStateKt$rememberLazyListDragAndDropState$17$1(aFg1qSDK, f7, f8, f9, camera2CameraMetadataExternalSyntheticLambda1, null);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized16);
                            }
                        } else if (objOnMinimized16 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        }
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr, (Function2) objOnMinimized16, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    return aFg1qSDK;
                }
                f9 = f5;
                if ((805306368 & i) == 536870912) {
                }
                if (i11 <= 4) {
                }
                Object objOnMinimized162 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent10 | z2 | z3 | z4 | z5) {
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr, (Function2) objOnMinimized162, cameraCaptureResultEmptyCameraCaptureResult, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                return aFg1qSDK;
            }
            f8 = f13;
            if ((i2 & 48) == 32) {
                z3 = false;
            }
            if (((1879048192 & i) ^ 805306368) > 536870912) {
            }
            if ((805306368 & i) == 536870912) {
            }
            if (i11 <= 4) {
            }
            Object objOnMinimized1622 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent10 | z2 | z3 | z4 | z5) {
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr, (Function2) objOnMinimized1622, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
            return aFg1qSDK;
        }
        f7 = f14;
        if ((i2 & 6) != 4) {
            z2 = false;
        }
        if (((i2 & 112) ^ 48) <= 32) {
        }
        if ((i2 & 48) == 32) {
        }
        if (((1879048192 & i) ^ 805306368) > 536870912) {
        }
        if ((805306368 & i) == 536870912) {
        }
        if (i11 <= 4) {
        }
        Object objOnMinimized16222 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent10 | z2 | z3 | z4 | z5) {
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr, (Function2) objOnMinimized16222, cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
        }
        return aFg1qSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AFg1qSDK IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 81;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 92 / 0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallbackWithResult + 75;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(90924803, i, -1, "im.toss.tosssecurities.uikit.dnd.rememberPreviewDragAndDropState (RememberLazyListDragAndDropState.kt:155)");
            }
        } else if (CameraConfigExternalSyntheticLambda0.asBinder()) {
        }
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult = Camera2CameraControllerExternalSyntheticLambda0.onExtraCallbackWithResult(0, 0, cameraCaptureResultEmptyCameraCaptureResult, 0, 3);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized = new Function1() { // from class: im.toss.tosssecurities.uikit.dnd.RememberLazyListDragAndDropStateKt$$ExternalSyntheticLambda13
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i7 = 2 % 2;
                    int i8 = onExtraCallback + 63;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    Integer numIAuthTabCallback = RememberLazyListDragAndDropStateKt.IAuthTabCallback(obj);
                    if (i9 != 0) {
                        int i10 = 36 / 0;
                    }
                    return numIAuthTabCallback;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        Function1 function1 = (Function1) objOnMinimized;
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized2 = new getBacktraceNote() { // from class: im.toss.tosssecurities.uikit.dnd.RememberLazyListDragAndDropStateKt$$ExternalSyntheticLambda14
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // o.getBacktraceNote
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i7 = 2 % 2;
                    int i8 = onExtraCallback + 45;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    Unit unitOnNavigationEvent = RememberLazyListDragAndDropStateKt.onNavigationEvent(((Integer) obj).intValue(), ((Integer) obj2).intValue(), obj3);
                    int i10 = onExtraCallback + 17;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    return unitOnNavigationEvent;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        getBacktraceNote getbacktracenote = (getBacktraceNote) objOnMinimized2;
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized3 = new Function2() { // from class: im.toss.tosssecurities.uikit.dnd.RememberLazyListDragAndDropStateKt$$ExternalSyntheticLambda15
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = onExtraCallbackWithResult + 85;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    Unit unitOnNavigationEvent = RememberLazyListDragAndDropStateKt.onNavigationEvent(obj, obj2);
                    int i10 = onExtraCallbackWithResult + 7;
                    IAuthTabCallback = i10 % 128;
                    if (i10 % 2 == 0) {
                        return unitOnNavigationEvent;
                    }
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
        }
        AFg1qSDK aFg1qSDKOnExtraCallbackWithResult = onExtraCallbackWithResult(camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult, function1, getbacktracenote, (Function2) objOnMinimized3, null, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0L, cameraCaptureResultEmptyCameraCaptureResult, 3504, 0, 16368);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i7 = onExtraCallbackWithResult + 15;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
        return aFg1qSDKOnExtraCallbackWithResult;
    }

    private static final Unit onExtraCallbackWithResult(int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 16 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return unit;
    }

    public static /* synthetic */ boolean IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Object obj, Object obj2) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallbackWithResult(new Object[]{cameraPresenceProviderExternalSyntheticLambda6, obj, obj2}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -478745404, iOnExtraCallbackWithResult, 478745406)).booleanValue();
    }

    public static /* synthetic */ boolean IAuthTabCallback(Object obj, Object obj2) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallbackWithResult(new Object[]{obj, obj2}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -828893560, iOnExtraCallbackWithResult, 828893560)).booleanValue();
    }

    private static final boolean onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Object obj, Object obj2) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallbackWithResult(new Object[]{cameraPresenceProviderExternalSyntheticLambda6, obj, obj2}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1688063479, iOnExtraCallbackWithResult, -1688063474)).booleanValue();
    }

    private static final boolean onTransact(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Object obj, Object obj2) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallbackWithResult(new Object[]{cameraPresenceProviderExternalSyntheticLambda6, obj, obj2}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -1551885209, iOnExtraCallbackWithResult, 1551885212)).booleanValue();
    }

    private static final boolean onTransact(Object obj, Object obj2) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallbackWithResult(new Object[]{obj, obj2}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1321686569, iOnExtraCallbackWithResult, -1321686565)).booleanValue();
    }

    private static final Unit asBinder(Object obj, Object obj2) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(new Object[]{obj, obj2}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1341741583, iOnExtraCallbackWithResult, -1341741582);
    }
}
