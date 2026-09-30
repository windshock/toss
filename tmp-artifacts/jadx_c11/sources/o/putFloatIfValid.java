package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import im.toss.tds.compose.component.compound.agreement.v4.cta.RequiredPreset;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.ExtensionsManager1;
import o.FocusMeteringControlExternalSyntheticLambda9;
import o.ImageViewUtilsExternalSyntheticLambda5;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SessionProcessorCaptureCallback;
import o.getBacktraceNote;
import o.getSwitchMinWidth;
import o.putFloatIfValid;
import o.r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4;
import o.r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4;
import o.readFully;
import o.removeObserverLocked;
import o.setHorizontalGravity;
import o.setOrientationDegrees;
import o.toPreviewOnlyRange;
import o.updateFocusedState;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class putFloatIfValid {
    private static final float IAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    private static final int IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 119;
        onNavigationEvent = i4 % 128;
        int i5 = -i;
        if (i4 % 2 == 0) {
            int i6 = 99 / 0;
        }
        int i7 = i3 + 1;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ int IAuthTabCallback(getSwitchMinWidth getswitchminwidth, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 89;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {getswitchminwidth, Integer.valueOf(i), Integer.valueOf(i2)};
        if (i5 != 0) {
            return ((Integer) onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr, 1845793446, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1845793439, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted())).intValue();
        }
        ((Integer) onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr, 1845793446, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1845793439, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted())).intValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ int IAuthTabCallback(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, getSwitchMinWidth getswitchminwidth, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 69;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int iOnExtraCallback = onExtraCallback(r8lambdanm9dm2eewl4vrptnjmesfjqky4, getswitchminwidth, i);
        int i5 = onWarmupCompleted + 103;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 43 / 0;
        }
        return iOnExtraCallback;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        getSizeSafely getsizesafely = (getSizeSafely) objArr[1];
        setHorizontalGravity sethorizontalgravity = (setHorizontalGravity) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {getbacktracenote, getsizesafely, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        if (i3 == 0) {
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), iOnWarmupCompleted, objArr2, -14974368, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 14974371, iOnWarmupCompleted2);
        int i4 = onNavigationEvent + 27;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(long j, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, putDoubleIfValid putdoubleifvalid, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 97;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(j, quirksExternalSyntheticBackport0, putdoubleifvalid, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 43;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(ImageViewUtilsExternalSyntheticLambda5 imageViewUtilsExternalSyntheticLambda5, getBacktraceNote getbacktracenote, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 75;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return onExtraCallbackWithResult(imageViewUtilsExternalSyntheticLambda5, getbacktracenote, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onExtraCallbackWithResult(imageViewUtilsExternalSyntheticLambda5, getbacktracenote, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getBacktraceNote getbacktracenote, RequiredPreset requiredPreset, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 75;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getbacktracenote, requiredPreset, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 51;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static final int onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 5;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        int i6 = -i;
        int i7 = i3 + 115;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        readFully readfully = (readFully) objArr[0];
        setOrientationDegrees setorientationdegrees = (setOrientationDegrees) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(readfully, setorientationdegrees);
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(long j, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, putDoubleIfValid putdoubleifvalid, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 75;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(j, quirksExternalSyntheticBackport0, putdoubleifvalid, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 93;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    private static final Unit onExtraCallback(ImageViewUtilsExternalSyntheticLambda5 imageViewUtilsExternalSyntheticLambda5, getBacktraceNote getbacktracenote, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 123;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(imageViewUtilsExternalSyntheticLambda5, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 37;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 3;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {quirksExternalSyntheticBackport0, getbacktracenote, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        Unit unit = (Unit) onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr, -116315261, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 116315267, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
        int i7 = onWarmupCompleted + 109;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(boolean z, ImageViewUtilsExternalSyntheticLambda5 imageViewUtilsExternalSyntheticLambda5, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 85;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(z, imageViewUtilsExternalSyntheticLambda5, quirksExternalSyntheticBackport0, getbacktracenote, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 != 0) {
            int i7 = 65 / 0;
        }
        int i8 = onWarmupCompleted + 11;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ int onExtraCallbackWithResult(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, getSwitchMinWidth getswitchminwidth, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 23;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {r8lambdanm9dm2eewl4vrptnjmesfjqky4, getswitchminwidth, Integer.valueOf(i)};
        int iIntValue = ((Integer) onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr, 1616927659, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1616927654, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted())).intValue();
        int i5 = onNavigationEvent + 99;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 79 / 0;
        }
        return iIntValue;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        ImageViewUtilsExternalSyntheticLambda5 imageViewUtilsExternalSyntheticLambda5 = (ImageViewUtilsExternalSyntheticLambda5) objArr[0];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(imageViewUtilsExternalSyntheticLambda5, getbacktracenote, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        return unitOnExtraCallback;
    }

    private static final Unit onExtraCallbackWithResult(ImageViewUtilsExternalSyntheticLambda5 imageViewUtilsExternalSyntheticLambda5, getBacktraceNote getbacktracenote, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 25;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback(imageViewUtilsExternalSyntheticLambda5, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ int onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 89;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallback(i);
        }
        IAuthTabCallback(i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ int onNavigationEvent(getSwitchMinWidth getswitchminwidth, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 29;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        int iOnExtraCallback = onExtraCallback(getswitchminwidth, i, i2);
        int i6 = onWarmupCompleted + 25;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return iOnExtraCallback;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~((~i2) | i7 | i5);
        int i9 = (~(i7 | (~i5))) | (~(i5 | i2));
        int i10 = (~(i2 | i3)) | i5;
        int i11 = i5 + i3 + i6 + ((-407681510) * i) + ((-298114539) * i4);
        int i12 = i11 * i11;
        int i13 = ((-1498977624) * i5) + 672923648 + (2103481690 * i3) + (i8 * 346253991) + (346253991 * i9) + ((-346253991) * i10) + ((-1845231616) * i6) + ((-328728576) * i) + ((-2108424192) * i4) + ((-1296629760) * i12);
        int i14 = ((i5 * 57881544) - 1472685786) + (i3 * 57881954) + (i8 * (-205)) + (i9 * (-205)) + (i10 * 205) + (i6 * 57881749) + (i * 289608994) + (i4 * 969284153) + (i12 * 813891584);
        switch (i13 + (i14 * i14 * 454098944)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
                getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int iIntValue2 = ((Number) objArr[3]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
                ((Number) objArr[5]).intValue();
                int i15 = 2 % 2;
                int i16 = onNavigationEvent + 13;
                onWarmupCompleted = i16 % 128;
                int i17 = i16 % 2;
                onNavigationEvent(quirksExternalSyntheticBackport0, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue), iIntValue2);
                Unit unit = Unit.INSTANCE;
                int i18 = onNavigationEvent + 47;
                onWarmupCompleted = i18 % 128;
                int i19 = i18 % 2;
                return unit;
            case 7:
                return asBinder(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getSwitchMinWidth.onExtraCallback onextracallback = (getSwitchMinWidth.onExtraCallback) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Integer numValueOf = Integer.valueOf(iIntValue);
        if (i3 != 0) {
            int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            throw null;
        }
        int iOnWarmupCompleted3 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted4 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        updateFocusedState updatefocusedstate = (updateFocusedState) onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{onextracallback, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, -1312089431, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1312089439, iOnWarmupCompleted4);
        int i4 = onNavigationEvent + 27;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return updatefocusedstate;
    }

    private static final Unit onNavigationEvent(boolean z, ImageViewUtilsExternalSyntheticLambda5 imageViewUtilsExternalSyntheticLambda5, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 95;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(z, imageViewUtilsExternalSyntheticLambda5, quirksExternalSyntheticBackport0, (getBacktraceNote<? super getDifferenceSet, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 7;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(boolean z, putDoubleIfValid putdoubleifvalid, ImageViewUtilsExternalSyntheticLambda5 imageViewUtilsExternalSyntheticLambda5, FocusMeteringControlExternalSyntheticLambda9 focusMeteringControlExternalSyntheticLambda9, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 9;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            onExtraCallbackWithResult(z, putdoubleifvalid, imageViewUtilsExternalSyntheticLambda5, focusMeteringControlExternalSyntheticLambda9, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(z, putdoubleifvalid, imageViewUtilsExternalSyntheticLambda5, focusMeteringControlExternalSyntheticLambda9, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onNavigationEvent + 71;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ int onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 3;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int iOnExtraCallback = onExtraCallback(i);
        int i5 = onNavigationEvent + 63;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return iOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getBacktraceNote getbacktracenote, getDifferenceSet getdifferenceset, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 79;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(getbacktracenote, getdifferenceset, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 123;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(r8lambdanm9dm2eewl4vrptnjmesfjqky4, getsupportedhighspeedresolutionsfor, extensionsManager1);
        int i4 = onWarmupCompleted + 59;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ removeObserverLocked onWarmupCompleted(putDoubleIfValid putdoubleifvalid, long j, long j2, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        removeObserverLocked removeobserverlockedIAuthTabCallback = IAuthTabCallback(putdoubleifvalid, j, j2, sessionProcessorCaptureCallback);
        int i4 = onNavigationEvent + 87;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return removeobserverlockedIAuthTabCallback;
        }
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(getsupportedhighspeedresolutionsfor, z);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 95;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final removeObserverLocked IAuthTabCallback(putDoubleIfValid putdoubleifvalid, long j, long j2, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        final readFully readfullyIAuthTabCallback = readFully.onExtraCallback.IAuthTabCallback(readFully.Companion, new Pair[]{getWrite.IAuthTabCallback(Float.valueOf(0.0f), setByteOrder.onNavigationEvent(j)), getWrite.IAuthTabCallback(Float.valueOf(sessionProcessorCaptureCallback.onExtraCallback(y1ExternalSyntheticLambda8.onExtraCallbackWithResult(putdoubleifvalid.onWarmupCompleted())) / Float.intBitsToFloat((int) sessionProcessorCaptureCallback.onWarmupCompleted())), setByteOrder.onNavigationEvent(j2))}, 0.0f, 0.0f, 0, 14, (Object) null);
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = sessionProcessorCaptureCallback.onExtraCallbackWithResult(new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.cta.TdsAgreementV4CtaKt$$ExternalSyntheticLambda14
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 19;
                onWarmupCompleted = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 != 0) {
                    Object[] objArr = {readfullyIAuthTabCallback, (setOrientationDegrees) obj};
                    throw null;
                }
                Object[] objArr2 = {readfullyIAuthTabCallback, (setOrientationDegrees) obj};
                Unit unit = (Unit) putFloatIfValid.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr2, -1382444942, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1382444942, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
                int i4 = onNavigationEvent + 103;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                obj2.hashCode();
                throw null;
            }
        });
        int i2 = onWarmupCompleted + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return removeobserverlockedOnExtraCallbackWithResult;
    }

    private static final Unit onExtraCallbackWithResult(readFully readfully, setOrientationDegrees setorientationdegrees) {
        long jIAuthTabCallback;
        long j;
        float f;
        hasMoreElements hasmoreelements;
        seek seekVar;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 43;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setorientationdegrees, "");
            jIAuthTabCallback = setUseCaseAttached.Companion.IAuthTabCallback();
            j = 1;
            f = 1.0f;
            hasmoreelements = null;
            seekVar = null;
            i = 1;
            i2 = 14;
        } else {
            Intrinsics.checkNotNullParameter(setorientationdegrees, "");
            jIAuthTabCallback = setUseCaseAttached.Companion.IAuthTabCallback();
            j = 0;
            f = 0.0f;
            hasmoreelements = null;
            seekVar = null;
            i = 0;
            i2 = 124;
        }
        setOrientationDegrees.onExtraCallback(setorientationdegrees, readfully, jIAuthTabCallback, j, f, hasmoreelements, seekVar, i, i2, (Object) null);
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onNavigationEvent = i2 % 128;
        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<VirtualCameraControlExternalSyntheticLambda1>) getsupportedhighspeedresolutionsfor, i2 % 2 == 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(r8lambdanm9dm2eewl4vrptnjmesfjqky4.c_((int) extensionsManager1.onExtraCallbackWithResult()) / VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(r8lambdanm9dm2eewl4vrptnjmesfjqky4.c_((int) extensionsManager1.onExtraCallbackWithResult()) + VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)));
        Unit unit = Unit.INSTANCE;
        int i3 = onNavigationEvent + 27;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        getSwitchMinWidth.onExtraCallback onextracallback = (getSwitchMinWidth.onExtraCallback) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1047210170);
            int i3 = 42 / 0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onNavigationEvent + 125;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1047210170, iIntValue, -1, "im.toss.tds.compose.component.compound.agreement.v4.cta.TdsAgreementV4Cta.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsAgreementV4Cta.kt:144)");
            }
        } else {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1047210170);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            }
        }
        Object obj = null;
        getThumbPosition getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.onWarmupCompleted(), 0, 2, (Object) null);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onNavigationEvent + 45;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i7 != 0) {
                obj.hashCode();
                throw null;
            }
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return getthumbpositionOnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0229  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(boolean z, putDoubleIfValid putdoubleifvalid, ImageViewUtilsExternalSyntheticLambda5 imageViewUtilsExternalSyntheticLambda5, FocusMeteringControlExternalSyntheticLambda9 focusMeteringControlExternalSyntheticLambda9, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z2;
        float fIAuthTabCallback;
        getSwitchMinWidth getswitchminwidthOnWarmupCompleted;
        Object objIAuthTabCallback;
        boolean zOnNavigationEvent;
        Object objOnMinimized;
        boolean zOnNavigationEvent2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(focusMeteringControlExternalSyntheticLambda9, "");
        if ((i & 6) == 0) {
            int i5 = onWarmupCompleted + 119;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 45 / 0;
                i3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(focusMeteringControlExternalSyntheticLambda9) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(focusMeteringControlExternalSyntheticLambda9)) {
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            z2 = true;
        } else {
            int i7 = onNavigationEvent + 19;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i2 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i9 = onNavigationEvent + 15;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(893446200, i2, -1, "im.toss.tds.compose.component.compound.agreement.v4.cta.TdsAgreementV4Cta.<anonymous>.<anonymous>.<anonymous> (TdsAgreementV4Cta.kt:118)");
            }
            float fIAuthTabCallback2 = focusMeteringControlExternalSyntheticLambda9.IAuthTabCallback();
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!zOnExtraCallback) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                if (z) {
                    fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fIAuthTabCallback2 - IAuthTabCallback) / 2.0f);
                } else {
                    int i11 = onNavigationEvent + 91;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
                }
                objOnMinimized2 = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            float fIAuthTabCallback3 = ((VirtualCameraControlExternalSyntheticLambda1) objOnMinimized2).IAuthTabCallback();
            ImageViewUtilsExternalSyntheticLambda5 imageViewUtilsExternalSyntheticLambda5AsBinder = putdoubleifvalid.asBinder();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0AsBinder = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(onextracallback, fIAuthTabCallback3);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            onNavigationEvent(z, imageViewUtilsExternalSyntheticLambda5AsBinder, focusMeteringControlExternalSyntheticLambda9.onWarmupCompleted(quirksExternalSyntheticBackport0AsBinder, onextracallbackwithresult.asInterface()), putdoubleifvalid.IAuthTabCallback(), cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(imageViewUtilsExternalSyntheticLambda5);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            Object obj = null;
            if (zOnNavigationEvent3) {
                if (z) {
                    fIAuthTabCallback2 = fIAuthTabCallback3;
                }
                objOnMinimized3 = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback2);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                getswitchminwidthOnWarmupCompleted = getSwitchPadding.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(((VirtualCameraControlExternalSyntheticLambda1) objOnMinimized3).IAuthTabCallback()), "mainCtaWidthTransition", cameraCaptureResultEmptyCameraCaptureResult, 48, 0);
                getBacktraceNote getbacktracenote = new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.agreement.v4.cta.TdsAgreementV4CtaKt$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i13 = 2 % 2;
                        int i14 = onNavigationEvent + 35;
                        IAuthTabCallback = i14 % 128;
                        int i15 = i14 % 2;
                        Object[] objArr = {(getSwitchMinWidth.onExtraCallback) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())};
                        updateFocusedState updatefocusedstate = (updateFocusedState) putFloatIfValid.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr, 794289639, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -794289638, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
                        int i16 = IAuthTabCallback + 29;
                        onNavigationEvent = i16 % 128;
                        int i17 = i16 % 2;
                        return updatefocusedstate;
                    }
                };
                getThumbTintList getthumbtintlistOnExtraCallbackWithResult = getThumbTextPadding.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.Companion);
                if (getswitchminwidthOnWarmupCompleted.IAuthTabCallback_Parcel()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666573488);
                    boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                    objIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnNavigationEvent4) {
                        int i13 = onNavigationEvent + 21;
                        onWarmupCompleted = i13 % 128;
                        int i14 = i13 % 2;
                        if (objIAuthTabCallback == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                            r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
                            Function1 function1IAuthTabCallbackStub = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback.IAuthTabCallbackStub() : null;
                            r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback);
                            try {
                                Object objIAuthTabCallback2 = getswitchminwidthOnWarmupCompleted.IAuthTabCallback();
                                iAuthTabCallback.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult, function1IAuthTabCallbackStub);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objIAuthTabCallback2);
                                objIAuthTabCallback = objIAuthTabCallback2;
                            } catch (Throwable th) {
                                iAuthTabCallback.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult, function1IAuthTabCallbackStub);
                                throw th;
                            }
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666827533);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    objIAuthTabCallback = getswitchminwidthOnWarmupCompleted.IAuthTabCallback();
                }
                float fIAuthTabCallback4 = ((VirtualCameraControlExternalSyntheticLambda1) objIAuthTabCallback).IAuthTabCallback();
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(689081863);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i15 = onWarmupCompleted + 29;
                    onNavigationEvent = i15 % 128;
                    int i16 = i15 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(689081863, 0, -1, "im.toss.tds.compose.component.compound.agreement.v4.cta.TdsAgreementV4Cta.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsAgreementV4Cta.kt:147)");
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i17 = onNavigationEvent + 45;
                    onWarmupCompleted = i17 % 128;
                    if (i17 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback4);
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onNavigationEvent(getswitchminwidthOnWarmupCompleted));
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    int i18 = onNavigationEvent + 33;
                    onWarmupCompleted = i18 % 128;
                    int i19 = i18 % 2;
                }
                float fIAuthTabCallback5 = ((VirtualCameraControlExternalSyntheticLambda1) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized).onExtraCallbackWithResult()).IAuthTabCallback();
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(689081863);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(689081863, 0, -1, "im.toss.tds.compose.component.compound.agreement.v4.cta.TdsAgreementV4Cta.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsAgreementV4Cta.kt:147)");
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnNavigationEvent2 = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback5);
                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent2) {
                    int i20 = onNavigationEvent + 125;
                    onWarmupCompleted = i20 % 128;
                    if (i20 % 2 != 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        obj.hashCode();
                        throw null;
                    }
                    if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized4 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onWarmupCompleted(getswitchminwidthOnWarmupCompleted));
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                    }
                    onNavigationEvent(focusMeteringControlExternalSyntheticLambda9.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(onextracallback, onWarmupCompleted((CameraPresenceProviderExternalSyntheticLambda6<VirtualCameraControlExternalSyntheticLambda1>) getSwitchPadding.onExtraCallback(getswitchminwidthOnWarmupCompleted, virtualCameraControlExternalSyntheticLambda1OnNavigationEvent, virtualCameraControlExternalSyntheticLambda1OnNavigationEvent2, (updateFocusedState) getbacktracenote.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized4).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlistOnExtraCallbackWithResult, "mainCtaWidthAnimation", cameraCaptureResultEmptyCameraCaptureResult, 196608))), onextracallbackwithresult.IAuthTabCallbackStub()), Intrinsics.areEqual(putdoubleifvalid.asBinder(), ImageViewUtilsExternalSyntheticLambda5.IAuthTabCallback.onWarmupCompleted) ? putdoubleifvalid.IAuthTabCallbackStub() : putdoubleifvalid.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                int i21 = onWarmupCompleted + 33;
                onNavigationEvent = i21 % 128;
                if (i21 % 2 == 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                getswitchminwidthOnWarmupCompleted = getSwitchPadding.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(((VirtualCameraControlExternalSyntheticLambda1) objOnMinimized3).IAuthTabCallback()), "mainCtaWidthTransition", cameraCaptureResultEmptyCameraCaptureResult, 48, 0);
                getBacktraceNote getbacktracenote2 = new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.agreement.v4.cta.TdsAgreementV4CtaKt$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i132 = 2 % 2;
                        int i142 = onNavigationEvent + 35;
                        IAuthTabCallback = i142 % 128;
                        int i152 = i142 % 2;
                        Object[] objArr = {(getSwitchMinWidth.onExtraCallback) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())};
                        updateFocusedState updatefocusedstate = (updateFocusedState) putFloatIfValid.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr, 794289639, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -794289638, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
                        int i162 = IAuthTabCallback + 29;
                        onNavigationEvent = i162 % 128;
                        int i172 = i162 % 2;
                        return updatefocusedstate;
                    }
                };
                getThumbTintList getthumbtintlistOnExtraCallbackWithResult2 = getThumbTextPadding.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.Companion);
                if (getswitchminwidthOnWarmupCompleted.IAuthTabCallback_Parcel()) {
                }
                float fIAuthTabCallback42 = ((VirtualCameraControlExternalSyntheticLambda1) objIAuthTabCallback).IAuthTabCallback();
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(689081863);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnNavigationEvent3 = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback42);
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnNavigationEvent) {
                    objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onNavigationEvent(getswitchminwidthOnWarmupCompleted));
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    int i182 = onNavigationEvent + 33;
                    onWarmupCompleted = i182 % 128;
                    int i192 = i182 % 2;
                    float fIAuthTabCallback52 = ((VirtualCameraControlExternalSyntheticLambda1) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized).onExtraCallbackWithResult()).IAuthTabCallback();
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(689081863);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnNavigationEvent22 = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback52);
                    zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                    Object objOnMinimized42 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnNavigationEvent2) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $enableLayoutAnimation$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$enableLayoutAnimation$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 41;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$enableLayoutAnimation$delegate, access13800Var);
            int i2 = IAuthTabCallback + 25;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 / 0;
            }
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                IAuthTabCallback(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = onExtraCallback + 119;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 37 / 0;
            }
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 37;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 111;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            putFloatIfValid.onWarmupCompleted(this.$enableLayoutAnimation$delegate, true);
            Unit unit = Unit.INSTANCE;
            int i7 = onExtraCallback + 61;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 66 / 0;
            }
            return unit;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(final long j, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable putDoubleIfValid putdoubleifvalid, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        putDoubleIfValid putdoubleifvalid2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final putDoubleIfValid putdoubleifvalid3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i4;
        int i5;
        final putDoubleIfValid putdoubleifvalidOnExtraCallbackWithResult;
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2;
        ImageViewUtilsExternalSyntheticLambda5 imageViewUtilsExternalSyntheticLambda5;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        int i6;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3;
        boolean zOnNavigationEvent;
        Object objOnMinimized;
        int i7 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(674949322);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    putdoubleifvalid2 = putdoubleifvalid;
                    int i9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(putdoubleifvalid2) ? 256 : 128;
                    i3 |= i9;
                } else {
                    putdoubleifvalid2 = putdoubleifvalid;
                }
                i3 |= i9;
            } else {
                putdoubleifvalid2 = putdoubleifvalid;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) == 146, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = i8 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                    if ((i2 & 4) != 0) {
                        int i10 = onWarmupCompleted + 31;
                        onNavigationEvent = i10 % 128;
                        int i11 = i10 % 2;
                        i4 = 256;
                        i5 = i3 & (-897);
                        putdoubleifvalidOnExtraCallbackWithResult = putIntegerIfValid.onExtraCallbackWithResult(null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 511);
                    } else {
                        i4 = 256;
                        i5 = i3;
                        putdoubleifvalidOnExtraCallbackWithResult = putdoubleifvalid2;
                    }
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i5 = i3;
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                    i4 = 256;
                    putdoubleifvalidOnExtraCallbackWithResult = putdoubleifvalid2;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i12 = onWarmupCompleted + 23;
                    onNavigationEvent = i12 % 128;
                    if (i12 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(674949322, i5, -1, "im.toss.tds.compose.component.compound.agreement.v4.cta.TdsAgreementV4Cta (TdsAgreementV4Cta.kt:51)");
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(674949322, i5, -1, "im.toss.tds.compose.component.compound.agreement.v4.cta.TdsAgreementV4Cta (TdsAgreementV4Cta.kt:51)");
                }
                final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                ImageViewUtilsExternalSyntheticLambda5 imageViewUtilsExternalSyntheticLambda5AsBinder = putdoubleifvalidOnExtraCallbackWithResult.asBinder();
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    int i13 = onNavigationEvent + 109;
                    onWarmupCompleted = i13 % 128;
                    int i14 = i13 % 2;
                    objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
                int i15 = (i5 & 896) ^ 384;
                if (i15 > i4) {
                    int i16 = onWarmupCompleted + 87;
                    onNavigationEvent = i16 % 128;
                    if (i16 % 2 == 0) {
                        int i17 = 20 / 0;
                        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(putdoubleifvalidOnExtraCallbackWithResult)) {
                            boolean z = (i5 & 384) == i4;
                            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (z || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                            }
                            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5 = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
                            final long jIAuthTabCallbackDefault = setByteOrder.Companion.IAuthTabCallbackDefault();
                            boolean z2 = (i15 > i4 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(putdoubleifvalidOnExtraCallbackWithResult)) || (i5 & 384) == i4;
                            boolean z3 = (i5 & 14) == 4;
                            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if ((z2 || z3) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                final putDoubleIfValid putdoubleifvalid4 = putdoubleifvalidOnExtraCallbackWithResult;
                                getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor4;
                                getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor5;
                                imageViewUtilsExternalSyntheticLambda5 = imageViewUtilsExternalSyntheticLambda5AsBinder;
                                Function1 function1 = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.cta.TdsAgreementV4CtaKt$$ExternalSyntheticLambda10
                                    private static int onExtraCallback = 1;
                                    private static int onWarmupCompleted;

                                    public final Object invoke(Object obj) {
                                        int i18 = 2 % 2;
                                        int i19 = onWarmupCompleted + 47;
                                        onExtraCallback = i19 % 128;
                                        int i20 = i19 % 2;
                                        removeObserverLocked removeobserverlockedOnWarmupCompleted = putFloatIfValid.onWarmupCompleted(putdoubleifvalid4, jIAuthTabCallbackDefault, j, (SessionProcessorCaptureCallback) obj);
                                        int i21 = onWarmupCompleted + 123;
                                        onExtraCallback = i21 % 128;
                                        if (i21 % 2 == 0) {
                                            int i22 = 83 / 0;
                                        }
                                        return removeobserverlockedOnWarmupCompleted;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function1);
                                objOnMinimized4 = function1;
                            } else {
                                getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor4;
                                getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor5;
                                imageViewUtilsExternalSyntheticLambda5 = imageViewUtilsExternalSyntheticLambda5AsBinder;
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(SessionProcessorSurface.IAuthTabCallback(quirksExternalSyntheticBackport03, (Function1) objOnMinimized4), putdoubleifvalidOnExtraCallbackWithResult.onWarmupCompleted());
                            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback2);
                            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                int i18 = onNavigationEvent + 31;
                                onWarmupCompleted = i18 % 128;
                                if (i18 % 2 != 0) {
                                    getAwbState.onExtraCallback();
                                    throw null;
                                }
                                getAwbState.onExtraCallback();
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                            }
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = QuirksExternalSyntheticBackport0.Companion;
                            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4);
                            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!zOnNavigationEvent2) {
                                int i19 = onWarmupCompleted + 87;
                                onNavigationEvent = i19 % 128;
                                int i20 = i19 % 2;
                                if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized5 = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.cta.TdsAgreementV4CtaKt$$ExternalSyntheticLambda11
                                        private static int onExtraCallback = 0;
                                        private static int onNavigationEvent = 1;

                                        public final Object invoke(Object obj) {
                                            int i21 = 2 % 2;
                                            int i22 = onNavigationEvent + 35;
                                            onExtraCallback = i22 % 128;
                                            int i23 = i22 % 2;
                                            Unit unitOnWarmupCompleted = putFloatIfValid.onWarmupCompleted(r8lambdanm9dm2eewl4vrptnjmesfjqky4, getsupportedhighspeedresolutionsfor, (ExtensionsManager1) obj);
                                            int i24 = onNavigationEvent + 57;
                                            onExtraCallback = i24 % 128;
                                            int i25 = i24 % 2;
                                            return unitOnWarmupCompleted;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                                }
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(calculatePlaceholderForExtensions.onExtraCallbackWithResult(quirksExternalSyntheticBackport06, (Function1) objOnMinimized5), 0.0f, 1, (Object) null), onextracallbackwithresult.onWarmupCompleted());
                                component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted2);
                                Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                    getAwbState.onExtraCallback();
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                                }
                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
                                final ImageViewUtilsExternalSyntheticLambda5 imageViewUtilsExternalSyntheticLambda52 = imageViewUtilsExternalSyntheticLambda5;
                                boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(imageViewUtilsExternalSyntheticLambda52);
                                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (zOnNavigationEvent3 || objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized6 = Boolean.valueOf((imageViewUtilsExternalSyntheticLambda52 instanceof ImageViewUtilsExternalSyntheticLambda5.onExtraCallback) && ((ImageViewUtilsExternalSyntheticLambda5.onExtraCallback) imageViewUtilsExternalSyntheticLambda52).onWarmupCompleted());
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                                }
                                onNavigationEvent(((Boolean) objOnMinimized6).booleanValue(), putdoubleifvalidOnExtraCallbackWithResult.asBinder(), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport06, 0.0f, 1, (Object) null), putdoubleifvalidOnExtraCallbackWithResult.IAuthTabCallback(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 384, 0);
                                onExtraCallback(imageViewUtilsExternalSyntheticLambda52, putdoubleifvalidOnExtraCallbackWithResult.onExtraCallback(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                onNavigationEvent(imageViewUtilsExternalSyntheticLambda52, putdoubleifvalidOnExtraCallbackWithResult.asInterface(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                if (onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2)) {
                                    int i21 = onNavigationEvent + 25;
                                    onWarmupCompleted = i21 % 128;
                                    int i22 = i21 % 2;
                                    i6 = 0;
                                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport06;
                                    quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport04.onExtraCallback(setHoverListener.onExtraCallbackWithResult(quirksExternalSyntheticBackport04, getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.onTransact(), 0, 2, (Object) null), (Function2) null, 2, (Object) null));
                                } else {
                                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport06;
                                    i6 = 0;
                                    quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport04;
                                }
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback, 0.0f, 1, (Object) null);
                                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i6);
                                int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i6));
                                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback3);
                                Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                    getAwbState.onExtraCallback();
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback3);
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                                }
                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
                                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult2.onTransact());
                                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                                boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(imageViewUtilsExternalSyntheticLambda52);
                                Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (zOnNavigationEvent4 || objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized7 = Boolean.valueOf((((imageViewUtilsExternalSyntheticLambda52 instanceof ImageViewUtilsExternalSyntheticLambda5.onExtraCallback) ^ true) || ((ImageViewUtilsExternalSyntheticLambda5.onExtraCallback) imageViewUtilsExternalSyntheticLambda52).onWarmupCompleted()) ? false : true);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                                }
                                final boolean zBooleanValue = ((Boolean) objOnMinimized7).booleanValue();
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport07 = quirksExternalSyntheticBackport04;
                                FocusMeteringControlExternalSyntheticLambda8.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport04, 0.0f, 1, (Object) null), (QuirkSettingsLoader) null, false, ForwardingCameraControl.onExtraCallback(893446200, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.agreement.v4.cta.TdsAgreementV4CtaKt$$ExternalSyntheticLambda12
                                    private static int onExtraCallback = 1;
                                    private static int onNavigationEvent;

                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        int i23 = 2 % 2;
                                        int i24 = onExtraCallback + 3;
                                        onNavigationEvent = i24 % 128;
                                        if (i24 % 2 == 0) {
                                            return putFloatIfValid.onNavigationEvent(zBooleanValue, putdoubleifvalidOnExtraCallbackWithResult, imageViewUtilsExternalSyntheticLambda52, (FocusMeteringControlExternalSyntheticLambda9) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                        }
                                        putFloatIfValid.onNavigationEvent(zBooleanValue, putdoubleifvalidOnExtraCallbackWithResult, imageViewUtilsExternalSyntheticLambda52, (FocusMeteringControlExternalSyntheticLambda9) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                        throw null;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3078, 6);
                                if (Intrinsics.areEqual(imageViewUtilsExternalSyntheticLambda52, ImageViewUtilsExternalSyntheticLambda5.onExtraCallbackWithResult.onNavigationEvent) || Intrinsics.areEqual(imageViewUtilsExternalSyntheticLambda52, ImageViewUtilsExternalSyntheticLambda5.IAuthTabCallback.onWarmupCompleted)) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1821002836);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                    getsupportedhighspeedresolutionsfor3 = getsupportedhighspeedresolutionsfor2;
                                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor3);
                                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (!zOnNavigationEvent || objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                                        objOnMinimized = new onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor3, null);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                    }
                                    isZslDisabledByByUserCaseConfig.onNavigationEvent(putdoubleifvalidOnExtraCallbackWithResult, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i5 >> 6) & 14);
                                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                                        int i23 = onNavigationEvent + 17;
                                        onWarmupCompleted = i23 % 128;
                                        if (i23 % 2 != 0) {
                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                            int i24 = 23 / 0;
                                        } else {
                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                        }
                                    }
                                    putdoubleifvalid3 = putdoubleifvalidOnExtraCallbackWithResult;
                                } else {
                                    int i25 = onWarmupCompleted + 5;
                                    int i26 = i25 % 128;
                                    onNavigationEvent = i26;
                                    int i27 = i25 % 2;
                                    if (!zBooleanValue) {
                                        int i28 = i26 + 77;
                                        onWarmupCompleted = i28 % 128;
                                        int i29 = i28 % 2;
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1820917307);
                                        ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport07, onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<VirtualCameraControlExternalSyntheticLambda1>) getsupportedhighspeedresolutionsfor)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                    getsupportedhighspeedresolutionsfor3 = getsupportedhighspeedresolutionsfor2;
                                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor3);
                                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (!zOnNavigationEvent) {
                                        objOnMinimized = new onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor3, null);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                        isZslDisabledByByUserCaseConfig.onNavigationEvent(putdoubleifvalidOnExtraCallbackWithResult, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i5 >> 6) & 14);
                                        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                                        }
                                        putdoubleifvalid3 = putdoubleifvalidOnExtraCallbackWithResult;
                                    }
                                }
                            }
                        }
                    } else if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(putdoubleifvalidOnExtraCallbackWithResult))) {
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                putdoubleifvalid3 = putdoubleifvalid2;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.cta.TdsAgreementV4CtaKt$$ExternalSyntheticLambda13
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2) {
                        int i30 = 2 % 2;
                        int i31 = onWarmupCompleted + 51;
                        onNavigationEvent = i31 % 128;
                        if (i31 % 2 != 0) {
                            return putFloatIfValid.onExtraCallback(j, quirksExternalSyntheticBackport03, putdoubleifvalid3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        }
                        putFloatIfValid.onExtraCallback(j, quirksExternalSyntheticBackport03, putdoubleifvalid3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        throw null;
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if ((i & 384) != 0) {
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) == 146, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final void onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final getBacktraceNote<? super implode, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(401488153);
        int i5 = i2 & 1;
        Object obj = null;
        if (i5 != 0) {
            int i6 = onWarmupCompleted + 65;
            onNavigationEvent = i6 % 128;
            i3 = i6 % 2 == 0 ? i | 40 : i | 6;
        } else if ((i & 6) == 0) {
            int i7 = onWarmupCompleted + 89;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02);
                obj.hashCode();
                throw null;
            }
            i3 = (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i8 = onNavigationEvent + 79;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote);
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 32 : 16;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            if (i5 != 0) {
                quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onNavigationEvent + 63;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(401488153, i3, -1, "im.toss.tds.compose.component.compound.agreement.v4.cta.Main (TdsAgreementV4Cta.kt:178)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(401488153, i3, -1, "im.toss.tds.compose.component.compound.agreement.v4.cta.Main (TdsAgreementV4Cta.kt:178)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new implode();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            implode implodeVar = (implode) objOnMinimized;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport02);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                int i10 = onWarmupCompleted + 15;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
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
            if (getbacktracenote == null) {
                int i12 = onNavigationEvent + 107;
                onWarmupCompleted = i12 % 128;
                if (i12 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(583115041);
                    int i13 = 1 / 0;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(583115041);
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1542830816);
                getbacktracenote.invoke(implodeVar, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i3 & 112) | 6));
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            int i14 = onWarmupCompleted + 79;
            onNavigationEvent = i14 % 128;
            int i15 = i14 % 2;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.cta.TdsAgreementV4CtaKt$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3) {
                    int i16 = 2 % 2;
                    int i17 = onWarmupCompleted + 11;
                    onExtraCallbackWithResult = i17 % 128;
                    if (i17 % 2 == 0) {
                        putFloatIfValid.onExtraCallback(quirksExternalSyntheticBackport02, getbacktracenote, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    Unit unitOnExtraCallback = putFloatIfValid.onExtraCallback(quirksExternalSyntheticBackport02, getbacktracenote, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i18 = onExtraCallbackWithResult + 7;
                    onWarmupCompleted = i18 % 128;
                    int i19 = i18 % 2;
                    return unitOnExtraCallback;
                }
            });
            int i16 = onNavigationEvent + 101;
            onWarmupCompleted = i16 % 128;
            int i17 = i16 % 2;
        }
    }

    private static final Unit onExtraCallback(getBacktraceNote getbacktracenote, getDifferenceSet getdifferenceset, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 39;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-486353973, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.cta.LeftRight.<anonymous> (TdsAgreementV4Cta.kt:225)");
        }
        if (getbacktracenote == null) {
            int i4 = onNavigationEvent + 111;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2046501975);
                int i5 = 78 / 0;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2046501975);
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(765267800);
            getbacktracenote.invoke(getdifferenceset, cameraCaptureResultEmptyCameraCaptureResult, 6);
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        int i6 = onNavigationEvent + 11;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(final boolean z, final ImageViewUtilsExternalSyntheticLambda5 imageViewUtilsExternalSyntheticLambda5, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final getBacktraceNote<? super getDifferenceSet, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        ResourceManagerInternalResourceManagerHooks resourceManagerInternalResourceManagerHooksOnExtraCallback;
        SearchView searchViewOnNavigationEvent;
        int i4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(871163123);
        if ((i & 6) == 0) {
            int i6 = onWarmupCompleted + 21;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z);
                throw null;
            }
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(imageViewUtilsExternalSyntheticLambda5) ^ true ? 16 : 32;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                int i8 = onWarmupCompleted + 81;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 128 : 256;
            }
            if ((i & 3072) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote)) {
                    int i10 = onWarmupCompleted + 15;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 1171) == 1170, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            } else {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i7 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i12 = onNavigationEvent + 69;
                    onWarmupCompleted = i12 % 128;
                    int i13 = i12 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(871163123, i3, -1, "im.toss.tds.compose.component.compound.agreement.v4.cta.LeftRight (TdsAgreementV4Cta.kt:194)");
                }
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized = new getDifferenceSet();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                final getDifferenceSet getdifferenceset = (getDifferenceSet) objOnMinimized;
                getIconContentView geticoncontentview = getIconContentView.onWarmupCompleted;
                getThumbPosition getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(geticoncontentview.onTransact(), 0, 2, (Object) null);
                getThumbPosition getthumbpositionOnExtraCallback2 = getSplitTrack.onExtraCallback(geticoncontentview.onWarmupCompleted(), 0, 2, (Object) null);
                int i14 = i3 >> 3;
                getSwitchMinWidth getswitchminwidthOnWarmupCompleted = getSwitchPadding.onWarmupCompleted(imageViewUtilsExternalSyntheticLambda5, "processTransition", cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i14 & 14) | 48, 0);
                ResourceManagerInternalResourceManagerHooks resourceManagerInternalResourceManagerHooksIAuthTabCallback = ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback(getthumbpositionOnExtraCallback, 0.0f, 2, (Object) null);
                ImageViewUtilsExternalSyntheticLambda5 imageViewUtilsExternalSyntheticLambda52 = (ImageViewUtilsExternalSyntheticLambda5) getswitchminwidthOnWarmupCompleted.access000();
                if ((!(imageViewUtilsExternalSyntheticLambda52 instanceof ImageViewUtilsExternalSyntheticLambda5.onExtraCallback)) || ((ImageViewUtilsExternalSyntheticLambda5.onExtraCallback) imageViewUtilsExternalSyntheticLambda52).onWarmupCompleted()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1665978275);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    resourceManagerInternalResourceManagerHooksOnExtraCallback = ResourceManagerInternalVdcInflateDelegate.onExtraCallback(getthumbpositionOnExtraCallback, 0.5f, 0L, 4, (Object) null);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1666127075);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.cta.TdsAgreementV4CtaKt$$ExternalSyntheticLambda15
                            private static int onNavigationEvent = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj) {
                                int i15 = 2 % 2;
                                int i16 = onNavigationEvent + 43;
                                onWarmupCompleted = i16 % 128;
                                int i17 = i16 % 2;
                                Integer numValueOf = Integer.valueOf(putFloatIfValid.onNavigationEvent(((Integer) obj).intValue()));
                                int i18 = onNavigationEvent + 73;
                                onWarmupCompleted = i18 % 128;
                                int i19 = i18 % 2;
                                return numValueOf;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                    }
                    resourceManagerInternalResourceManagerHooksOnExtraCallback = ResourceManagerInternalVdcInflateDelegate.onExtraCallback(getthumbpositionOnExtraCallback2, (Function1) objOnMinimized2);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                ResourceManagerInternalResourceManagerHooks resourceManagerInternalResourceManagerHooksOnNavigationEvent = resourceManagerInternalResourceManagerHooksIAuthTabCallback.onNavigationEvent(resourceManagerInternalResourceManagerHooksOnExtraCallback);
                SearchView searchViewOnWarmupCompleted = ResourceManagerInternalVdcInflateDelegate.onWarmupCompleted(getthumbpositionOnExtraCallback, 0.0f, 2, (Object) null);
                ImageViewUtilsExternalSyntheticLambda5 imageViewUtilsExternalSyntheticLambda53 = (ImageViewUtilsExternalSyntheticLambda5) getswitchminwidthOnWarmupCompleted.IAuthTabCallback();
                if (!(imageViewUtilsExternalSyntheticLambda53 instanceof ImageViewUtilsExternalSyntheticLambda5.onExtraCallback) || ((ImageViewUtilsExternalSyntheticLambda5.onExtraCallback) imageViewUtilsExternalSyntheticLambda53).onWarmupCompleted()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1665581475);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    searchViewOnNavigationEvent = ResourceManagerInternalVdcInflateDelegate.onNavigationEvent(getthumbpositionOnExtraCallback, 0.5f, 0L, 4, (Object) null);
                } else {
                    int i15 = onWarmupCompleted + 55;
                    onNavigationEvent = i15 % 128;
                    if (i15 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1665730275);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        onwarmupcompleted.onExtraCallback();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1665730275);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized3 = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.cta.TdsAgreementV4CtaKt$$ExternalSyntheticLambda16
                            private static int IAuthTabCallback = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke(Object obj2) {
                                int i16 = 2 % 2;
                                int i17 = IAuthTabCallback + 39;
                                onNavigationEvent = i17 % 128;
                                int i18 = i17 % 2;
                                int iOnWarmupCompleted = putFloatIfValid.onWarmupCompleted(((Integer) obj2).intValue());
                                if (i18 != 0) {
                                    return Integer.valueOf(iOnWarmupCompleted);
                                }
                                Integer.valueOf(iOnWarmupCompleted);
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                    }
                    searchViewOnNavigationEvent = ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback(getthumbpositionOnExtraCallback2, (Function1) objOnMinimized3);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                setVerticalGravity.onWarmupCompleted(z, quirksExternalSyntheticBackport04, resourceManagerInternalResourceManagerHooksOnNavigationEvent, searchViewOnWarmupCompleted.onNavigationEvent(searchViewOnNavigationEvent), (String) null, ForwardingCameraControl.onExtraCallback(-486353973, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.agreement.v4.cta.TdsAgreementV4CtaKt$$ExternalSyntheticLambda17
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i16 = 2 % 2;
                        int i17 = onWarmupCompleted + 25;
                        onExtraCallback = i17 % 128;
                        int i18 = i17 % 2;
                        Unit unitOnWarmupCompleted = putFloatIfValid.onWarmupCompleted(getbacktracenote, getdifferenceset, (setHorizontalGravity) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i19 = onWarmupCompleted + 69;
                        onExtraCallback = i19 % 128;
                        int i20 = i19 % 2;
                        return unitOnWarmupCompleted;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196608 | (i3 & 14) | (i14 & 112), 16);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.cta.TdsAgreementV4CtaKt$$ExternalSyntheticLambda18
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i16 = 2 % 2;
                        int i17 = onExtraCallbackWithResult + 49;
                        IAuthTabCallback = i17 % 128;
                        int i18 = i17 % 2;
                        Unit unitOnExtraCallback = putFloatIfValid.onExtraCallback(z, imageViewUtilsExternalSyntheticLambda5, quirksExternalSyntheticBackport03, getbacktracenote, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i19 = IAuthTabCallback + 95;
                        onExtraCallbackWithResult = i19 % 128;
                        if (i19 % 2 == 0) {
                            int i20 = 0 / 0;
                        }
                        return unitOnExtraCallback;
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if ((i & 3072) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 1171) == 1170, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        getSwitchMinWidth getswitchminwidth = (getSwitchMinWidth) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (!Intrinsics.areEqual(getswitchminwidth.IAuthTabCallback(), ImageViewUtilsExternalSyntheticLambda5.onExtraCallbackWithResult.onNavigationEvent)) {
            int i4 = onWarmupCompleted + 101;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return Integer.valueOf(iIntValue);
        }
        int i6 = onNavigationEvent + 103;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return Integer.valueOf(iIntValue2);
    }

    private static final int onExtraCallback(getSwitchMinWidth getswitchminwidth, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 3;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Object objAccess000 = getswitchminwidth.access000();
        if (i5 == 0) {
            Intrinsics.areEqual(objAccess000, ImageViewUtilsExternalSyntheticLambda5.onExtraCallbackWithResult.onNavigationEvent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (Intrinsics.areEqual(objAccess000, ImageViewUtilsExternalSyntheticLambda5.onExtraCallbackWithResult.onNavigationEvent)) {
            return i2;
        }
        int i6 = onNavigationEvent + 53;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        getSizeSafely getsizesafely = (getSizeSafely) objArr[1];
        setHorizontalGravity sethorizontalgravity = (setHorizontalGravity) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(773561785, iIntValue, -1, "im.toss.tds.compose.component.compound.agreement.v4.cta.Optional.<anonymous> (TdsAgreementV4Cta.kt:260)");
        }
        if (getbacktracenote == null) {
            int i2 = onWarmupCompleted + 27;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1615355141);
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(363533766);
            getbacktracenote.invoke(getsizesafely, cameraCaptureResultEmptyCameraCaptureResult, 6);
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        int i4 = onNavigationEvent + 67;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else if (CameraConfigExternalSyntheticLambda0.asBinder()) {
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 99;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(final ImageViewUtilsExternalSyntheticLambda5 imageViewUtilsExternalSyntheticLambda5, final getBacktraceNote<? super getSizeSafely, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(152250593);
        if ((i & 6) == 0) {
            int i5 = onNavigationEvent + 121;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 / 0;
                i3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(imageViewUtilsExternalSyntheticLambda5) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(imageViewUtilsExternalSyntheticLambda5)) {
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i7 = onNavigationEvent + 81;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 32 : 16;
        }
        if ((i2 & 19) != 18) {
            int i9 = onWarmupCompleted + 13;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(152250593, i2, -1, "im.toss.tds.compose.component.compound.agreement.v4.cta.Optional (TdsAgreementV4Cta.kt:233)");
            }
            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new getSizeSafely();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            final getSizeSafely getsizesafely = (getSizeSafely) objOnMinimized;
            getIconContentView geticoncontentview = getIconContentView.onWarmupCompleted;
            getThumbPosition getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(geticoncontentview.onTransact(), 0, 2, (Object) null);
            getThumbPosition getthumbpositionOnExtraCallback2 = getSplitTrack.onExtraCallback(geticoncontentview.onTransact(), 0, 2, (Object) null);
            final getSwitchMinWidth getswitchminwidthOnWarmupCompleted = getSwitchPadding.onWarmupCompleted(imageViewUtilsExternalSyntheticLambda5, "processTransition", cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i2 & 14) | 48, 0);
            final int iOnExtraCallback = (int) r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f));
            boolean zAreEqual = Intrinsics.areEqual(imageViewUtilsExternalSyntheticLambda5, ImageViewUtilsExternalSyntheticLambda5.onNavigationEvent.IAuthTabCallback);
            ResourceManagerInternalResourceManagerHooks resourceManagerInternalResourceManagerHooksIAuthTabCallback = ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback(getthumbpositionOnExtraCallback, 0.0f, 2, (Object) null);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOnExtraCallback);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((zOnNavigationEvent | zOnExtraCallback) || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.cta.TdsAgreementV4CtaKt$$ExternalSyntheticLambda6
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj) {
                        int i11 = 2 % 2;
                        int i12 = onNavigationEvent + 25;
                        onExtraCallback = i12 % 128;
                        int i13 = i12 % 2;
                        Integer numValueOf = Integer.valueOf(putFloatIfValid.IAuthTabCallback(getswitchminwidthOnWarmupCompleted, iOnExtraCallback, ((Integer) obj).intValue()));
                        int i14 = onNavigationEvent + 9;
                        onExtraCallback = i14 % 128;
                        if (i14 % 2 != 0) {
                            return numValueOf;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            ResourceManagerInternalResourceManagerHooks resourceManagerInternalResourceManagerHooksOnNavigationEvent = resourceManagerInternalResourceManagerHooksIAuthTabCallback.onNavigationEvent(ResourceManagerInternalVdcInflateDelegate.onNavigationEvent(getthumbpositionOnExtraCallback2, (Function1) objOnMinimized2));
            SearchView searchViewOnWarmupCompleted = ResourceManagerInternalVdcInflateDelegate.onWarmupCompleted(getthumbpositionOnExtraCallback, 0.0f, 2, (Object) null);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOnExtraCallback);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((zOnNavigationEvent2 | zOnExtraCallback2) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.cta.TdsAgreementV4CtaKt$$ExternalSyntheticLambda7
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj) {
                        int i11 = 2 % 2;
                        int i12 = IAuthTabCallback + 27;
                        onWarmupCompleted = i12 % 128;
                        int i13 = i12 % 2;
                        getSwitchMinWidth getswitchminwidth = getswitchminwidthOnWarmupCompleted;
                        if (i13 != 0) {
                            return Integer.valueOf(putFloatIfValid.onNavigationEvent(getswitchminwidth, iOnExtraCallback, ((Integer) obj).intValue()));
                        }
                        Integer numValueOf = Integer.valueOf(putFloatIfValid.onNavigationEvent(getswitchminwidth, iOnExtraCallback, ((Integer) obj).intValue()));
                        int i14 = 75 / 0;
                        return numValueOf;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
            }
            setVerticalGravity.onWarmupCompleted(zAreEqual, (QuirksExternalSyntheticBackport0) null, resourceManagerInternalResourceManagerHooksOnNavigationEvent, searchViewOnWarmupCompleted.onNavigationEvent(ResourceManagerInternalVdcInflateDelegate.asBinder(getthumbpositionOnExtraCallback2, (Function1) objOnMinimized3)), (String) null, ForwardingCameraControl.onExtraCallback(773561785, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.agreement.v4.cta.TdsAgreementV4CtaKt$$ExternalSyntheticLambda8
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i11 = 2 % 2;
                    int i12 = onNavigationEvent + 107;
                    IAuthTabCallback = i12 % 128;
                    int i13 = i12 % 2;
                    Object[] objArr = {getbacktracenote, getsizesafely, (setHorizontalGravity) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                    Unit unit = (Unit) putFloatIfValid.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr, 1300638984, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1300638980, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
                    int i14 = IAuthTabCallback + 25;
                    onNavigationEvent = i14 % 128;
                    if (i14 % 2 != 0) {
                        return unit;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196608, 18);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.cta.TdsAgreementV4CtaKt$$ExternalSyntheticLambda9
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i11 = 2 % 2;
                    int i12 = onNavigationEvent + 117;
                    IAuthTabCallback = i12 % 128;
                    int i13 = i12 % 2;
                    Unit unitIAuthTabCallback = putFloatIfValid.IAuthTabCallback(imageViewUtilsExternalSyntheticLambda5, getbacktracenote, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i14 = IAuthTabCallback + 7;
                    onNavigationEvent = i14 % 128;
                    int i15 = i14 % 2;
                    return unitIAuthTabCallback;
                }
            });
        }
    }

    private static final int onExtraCallback(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, getSwitchMinWidth getswitchminwidth, int i) {
        float fIAuthTabCallback;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 7;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        ImageViewUtilsExternalSyntheticLambda5 imageViewUtilsExternalSyntheticLambda5 = (ImageViewUtilsExternalSyntheticLambda5) getswitchminwidth.IAuthTabCallback();
        if (Intrinsics.areEqual(imageViewUtilsExternalSyntheticLambda5, ImageViewUtilsExternalSyntheticLambda5.onNavigationEvent.IAuthTabCallback)) {
            int i5 = onWarmupCompleted + 45;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-10.0f);
                int i6 = 76 / 0;
            } else {
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-10.0f);
            }
            int i7 = onWarmupCompleted + 27;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
        } else {
            fIAuthTabCallback = imageViewUtilsExternalSyntheticLambda5 instanceof ImageViewUtilsExternalSyntheticLambda5.onExtraCallback ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(50.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        }
        return (int) r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(fIAuthTabCallback);
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        float fIAuthTabCallback;
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) objArr[0];
        getSwitchMinWidth getswitchminwidth = (getSwitchMinWidth) objArr[1];
        ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        ImageViewUtilsExternalSyntheticLambda5 imageViewUtilsExternalSyntheticLambda5 = (ImageViewUtilsExternalSyntheticLambda5) getswitchminwidth.access000();
        if (!(!Intrinsics.areEqual(imageViewUtilsExternalSyntheticLambda5, ImageViewUtilsExternalSyntheticLambda5.onNavigationEvent.IAuthTabCallback))) {
            int i2 = onWarmupCompleted + 99;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-10.0f);
                throw null;
            }
            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-10.0f);
        } else if (imageViewUtilsExternalSyntheticLambda5 instanceof ImageViewUtilsExternalSyntheticLambda5.onExtraCallback) {
            int i3 = onNavigationEvent + 119;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(50.0f);
        } else {
            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        }
        int iOnExtraCallback = (int) r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(fIAuthTabCallback);
        int i5 = onNavigationEvent + 9;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return Integer.valueOf(iOnExtraCallback);
        }
        int i6 = 79 / 0;
        return Integer.valueOf(iOnExtraCallback);
    }

    private static final Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, RequiredPreset requiredPreset, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 53;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
            CameraConfigExternalSyntheticLambda0.asBinder();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = onNavigationEvent + 121;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(189725914, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.cta.Required.<anonymous> (TdsAgreementV4Cta.kt:305)");
        }
        if (getbacktracenote == null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-52239302);
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1937977511);
            getbacktracenote.invoke(requiredPreset, cameraCaptureResultEmptyCameraCaptureResult, 6);
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onWarmupCompleted + 67;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(final ImageViewUtilsExternalSyntheticLambda5 imageViewUtilsExternalSyntheticLambda5, final getBacktraceNote<? super RequiredPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-431585278);
        Object obj = null;
        if ((i & 6) == 0) {
            int i6 = onWarmupCompleted + 3;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(imageViewUtilsExternalSyntheticLambda5);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(imageViewUtilsExternalSyntheticLambda5)) {
                int i7 = onNavigationEvent + 43;
                onWarmupCompleted = i7 % 128;
                i4 = i7 % 2 != 0 ? 5 : 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote)) {
                int i8 = onNavigationEvent + 23;
                onWarmupCompleted = i8 % 128;
                i3 = i8 % 2 != 0 ? 77 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            int i9 = onNavigationEvent + 27;
            onWarmupCompleted = i9 % 128;
            z = i9 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-431585278, i2, -1, "im.toss.tds.compose.component.compound.agreement.v4.cta.Required (TdsAgreementV4Cta.kt:268)");
            }
            final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new RequiredPreset();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            final RequiredPreset requiredPreset = (RequiredPreset) objOnMinimized;
            getIconContentView geticoncontentview = getIconContentView.onWarmupCompleted;
            getThumbPosition getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(geticoncontentview.onTransact(), 0, 2, (Object) null);
            getThumbPosition getthumbpositionOnExtraCallback2 = getSplitTrack.onExtraCallback(geticoncontentview.onTransact(), 0, 2, (Object) null);
            final getSwitchMinWidth getswitchminwidthOnWarmupCompleted = getSwitchPadding.onWarmupCompleted(imageViewUtilsExternalSyntheticLambda5, "processTransition", cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i2 & 14) | 48, 0);
            boolean zAreEqual = Intrinsics.areEqual(imageViewUtilsExternalSyntheticLambda5, ImageViewUtilsExternalSyntheticLambda5.onWarmupCompleted.IAuthTabCallback);
            ResourceManagerInternalResourceManagerHooks resourceManagerInternalResourceManagerHooksIAuthTabCallback = ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback(getthumbpositionOnExtraCallback, 0.0f, 2, (Object) null);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((zOnNavigationEvent | zOnNavigationEvent2) || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.cta.TdsAgreementV4CtaKt$$ExternalSyntheticLambda2
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj2) {
                        int i10 = 2 % 2;
                        int i11 = onNavigationEvent + 113;
                        IAuthTabCallback = i11 % 128;
                        int i12 = i11 % 2;
                        Integer numValueOf = Integer.valueOf(putFloatIfValid.IAuthTabCallback(r8lambdanm9dm2eewl4vrptnjmesfjqky4, getswitchminwidthOnWarmupCompleted, ((Integer) obj2).intValue()));
                        int i13 = onNavigationEvent + 43;
                        IAuthTabCallback = i13 % 128;
                        int i14 = i13 % 2;
                        return numValueOf;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            ResourceManagerInternalResourceManagerHooks resourceManagerInternalResourceManagerHooksOnNavigationEvent = resourceManagerInternalResourceManagerHooksIAuthTabCallback.onNavigationEvent(ResourceManagerInternalVdcInflateDelegate.onNavigationEvent(getthumbpositionOnExtraCallback2, (Function1) objOnMinimized2));
            SearchView searchViewOnWarmupCompleted = ResourceManagerInternalVdcInflateDelegate.onWarmupCompleted(getthumbpositionOnExtraCallback, 0.0f, 2, (Object) null);
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4);
            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(zOnNavigationEvent3 | zOnNavigationEvent4)) {
                int i10 = onWarmupCompleted + 33;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 == 0) {
                    onwarmupcompleted.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized3 = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.cta.TdsAgreementV4CtaKt$$ExternalSyntheticLambda3
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj2) {
                            int i11 = 2 % 2;
                            int i12 = onNavigationEvent + 31;
                            onExtraCallbackWithResult = i12 % 128;
                            int i13 = i12 % 2;
                            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky42 = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
                            if (i13 != 0) {
                                return Integer.valueOf(putFloatIfValid.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky42, getswitchminwidthOnWarmupCompleted, ((Integer) obj2).intValue()));
                            }
                            Integer.valueOf(putFloatIfValid.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky42, getswitchminwidthOnWarmupCompleted, ((Integer) obj2).intValue()));
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                }
                setVerticalGravity.onWarmupCompleted(zAreEqual, (QuirksExternalSyntheticBackport0) null, resourceManagerInternalResourceManagerHooksOnNavigationEvent, searchViewOnWarmupCompleted.onNavigationEvent(ResourceManagerInternalVdcInflateDelegate.asBinder(getthumbpositionOnExtraCallback2, (Function1) objOnMinimized3)), (String) null, ForwardingCameraControl.onExtraCallback(189725914, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.agreement.v4.cta.TdsAgreementV4CtaKt$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i11 = 2 % 2;
                        int i12 = onExtraCallbackWithResult + 45;
                        IAuthTabCallback = i12 % 128;
                        int i13 = i12 % 2;
                        Unit unitIAuthTabCallback = putFloatIfValid.IAuthTabCallback(getbacktracenote, requiredPreset, (setHorizontalGravity) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i14 = IAuthTabCallback + 15;
                        onExtraCallbackWithResult = i14 % 128;
                        int i15 = i14 % 2;
                        return unitIAuthTabCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196608, 18);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.cta.TdsAgreementV4CtaKt$$ExternalSyntheticLambda5
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i11 = 2 % 2;
                    int i12 = onExtraCallback + 71;
                    onWarmupCompleted = i12 % 128;
                    int i13 = i12 % 2;
                    ImageViewUtilsExternalSyntheticLambda5 imageViewUtilsExternalSyntheticLambda52 = imageViewUtilsExternalSyntheticLambda5;
                    if (i13 != 0) {
                        getBacktraceNote getbacktracenote2 = getbacktracenote;
                        int i14 = i;
                        int iIntValue = ((Integer) obj3).intValue();
                        Object[] objArr = {imageViewUtilsExternalSyntheticLambda52, getbacktracenote2, Integer.valueOf(i14), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                        return (Unit) putFloatIfValid.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr, -1427247069, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1427247071, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
                    }
                    getBacktraceNote getbacktracenote3 = getbacktracenote;
                    int i15 = i;
                    int iIntValue2 = ((Integer) obj3).intValue();
                    Object[] objArr2 = {imageViewUtilsExternalSyntheticLambda52, getbacktracenote3, Integer.valueOf(i15), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue2)};
                    throw null;
                }
            });
        }
    }

    private static final float onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<VirtualCameraControlExternalSyntheticLambda1> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1 = (VirtualCameraControlExternalSyntheticLambda1) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float fIAuthTabCallback = virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback();
        int i4 = onNavigationEvent + 21;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return fIAuthTabCallback;
    }

    private static final float onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<VirtualCameraControlExternalSyntheticLambda1> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1 = (VirtualCameraControlExternalSyntheticLambda1) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback();
            throw null;
        }
        float fIAuthTabCallback = virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback();
        int i4 = onWarmupCompleted + 83;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return fIAuthTabCallback;
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<VirtualCameraControlExternalSyntheticLambda1> getsupportedhighspeedresolutionsfor, float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(f));
        int i4 = onWarmupCompleted + 113;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final boolean onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onWarmupCompleted + 71;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return zBooleanValue;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        int i5 = onWarmupCompleted + 87;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        int i = onExtraCallbackWithResult + 15;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getBacktraceNote getbacktracenote, getSizeSafely getsizesafely, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, getsizesafely, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr, 1300638984, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1300638980, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onWarmupCompleted(ImageViewUtilsExternalSyntheticLambda5 imageViewUtilsExternalSyntheticLambda5, getBacktraceNote getbacktracenote, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {imageViewUtilsExternalSyntheticLambda5, getbacktracenote, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr, -1427247069, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1427247071, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
    }

    public static /* synthetic */ Unit IAuthTabCallback(readFully readfully, setOrientationDegrees setorientationdegrees) {
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (Unit) onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{readfully, setorientationdegrees}, -1382444942, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1382444942, iOnWarmupCompleted2);
    }

    public static /* synthetic */ updateFocusedState onNavigationEvent(getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {onextracallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (updateFocusedState) onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr, 794289639, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -794289638, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
    }

    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {quirksExternalSyntheticBackport0, getbacktracenote, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr, -116315261, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 116315267, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
    }

    private static final int onExtraCallbackWithResult(getSwitchMinWidth getswitchminwidth, int i, int i2) {
        Object[] objArr = {getswitchminwidth, Integer.valueOf(i), Integer.valueOf(i2)};
        return ((Integer) onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr, 1845793446, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1845793439, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted())).intValue();
    }

    private static final Unit onExtraCallback(getBacktraceNote getbacktracenote, getSizeSafely getsizesafely, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, getsizesafely, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr, -14974368, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 14974371, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
    }

    private static final int onWarmupCompleted(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, getSwitchMinWidth getswitchminwidth, int i) {
        Object[] objArr = {r8lambdanm9dm2eewl4vrptnjmesfjqky4, getswitchminwidth, Integer.valueOf(i)};
        return ((Integer) onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr, 1616927659, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1616927654, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted())).intValue();
    }

    private static final updateFocusedState onExtraCallback(getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {onextracallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (updateFocusedState) onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr, -1312089431, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1312089439, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted());
    }

    public static final class onNavigationEvent implements Function0<VirtualCameraControlExternalSyntheticLambda1> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getSwitchMinWidth onExtraCallbackWithResult;

        public onNavigationEvent(getSwitchMinWidth getswitchminwidth) {
            this.onExtraCallbackWithResult = getswitchminwidth;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, o.VirtualCameraControlExternalSyntheticLambda1] */
        public final VirtualCameraControlExternalSyntheticLambda1 invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                this.onExtraCallbackWithResult.access000();
                throw null;
            }
            ?? Access000 = this.onExtraCallbackWithResult.access000();
            int i3 = onWarmupCompleted + 27;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return Access000;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static final class onWarmupCompleted implements Function0<getSwitchMinWidth.onExtraCallback<VirtualCameraControlExternalSyntheticLambda1>> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ getSwitchMinWidth onWarmupCompleted;

        public onWarmupCompleted(getSwitchMinWidth getswitchminwidth) {
            this.onWarmupCompleted = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                onNavigationEvent();
                throw null;
            }
            getSwitchMinWidth.onExtraCallback<VirtualCameraControlExternalSyntheticLambda1> onextracallbackOnNavigationEvent = onNavigationEvent();
            int i3 = onNavigationEvent + 3;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return onextracallbackOnNavigationEvent;
            }
            obj.hashCode();
            throw null;
        }

        public final getSwitchMinWidth.onExtraCallback<VirtualCameraControlExternalSyntheticLambda1> onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<VirtualCameraControlExternalSyntheticLambda1> onextracallbackIAuthTabCallbackDefault = this.onWarmupCompleted.IAuthTabCallbackDefault();
            int i4 = onNavigationEvent + 121;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackIAuthTabCallbackDefault;
        }
    }
}
