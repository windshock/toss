package o;

import android.content.res.Configuration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.getObjectAtIndex;
import o.optList;
import o.setHorizontalGravity;
import o.setOrientationDegrees;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getObjectAtIndex {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i5;
        int i8 = (~(i7 | i3)) | i4;
        int i9 = ~i4;
        int i10 = ~(i7 | i9);
        int i11 = ~i3;
        int i12 = i10 | (~(i9 | i11));
        int i13 = (~(i3 | i9)) | (~(i7 | i11));
        int i14 = i5 + i4 + i6 + (417615942 * i2) + (566850886 * i);
        int i15 = i14 * i14;
        int i16 = ((-370608051) * i5) + 147849216 + ((-2147356519) * i4) + (i8 * 1776748468) + (i12 * 1776748468) + (1776748468 * i13) + (1406140416 * i6) + ((-354418688) * i2) + ((-85983232) * i) + ((-608960512) * i15);
        int i17 = (i5 * (-1357469509)) + 140661806 + (i4 * (-1357469617)) + (i8 * 108) + (i12 * 108) + (i13 * 108) + (i6 * (-1357469401)) + (i2 * 1137340586) + (i * 304092074) + (i15 * 1282146304);
        return i16 + ((i17 * i17) * 1158414336) != 1 ? onWarmupCompleted(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, encodeUriString encodeuristring, putDoubleIfValid putdoubleifvalid, optList optlist, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return onExtraCallback(quirksExternalSyntheticBackport0, encodeuristring, putdoubleifvalid, optlist, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onExtraCallback(quirksExternalSyntheticBackport0, encodeuristring, putdoubleifvalid, optlist, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final int onExtraCallback(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return i;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int iIntValue2 = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return Integer.valueOf(onExtraCallback(iIntValue, iIntValue2));
        }
        onExtraCallback(iIntValue, iIntValue2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, encodeUriString encodeuristring, putDoubleIfValid putdoubleifvalid, optList optlist, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            onExtraCallback(quirksExternalSyntheticBackport0, encodeuristring, putdoubleifvalid, optlist, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            onExtraCallback(quirksExternalSyntheticBackport0, encodeuristring, putdoubleifvalid, optlist, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 60 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(optList optlist, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(optlist, setorientationdegrees);
        }
        IAuthTabCallback(optlist, setorientationdegrees);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        optList optlist = (optList) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[2];
        encodeUriString encodeuristring = (encodeUriString) objArr[3];
        putDoubleIfValid putdoubleifvalid = (putDoubleIfValid) objArr[4];
        setHorizontalGravity sethorizontalgravity = (setHorizontalGravity) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(optlist, fFloatValue, quirksExternalSyntheticBackport0, encodeuristring, putdoubleifvalid, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, optList optlist, encodeUriString encodeuristring, putDoubleIfValid putdoubleifvalid, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, optlist, encodeuristring, putdoubleifvalid, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(optList optlist, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        setOrientationDegrees.onWarmupCompleted(setorientationdegrees, optlist.access100(), 0L, 0L, 0.0f, (hasMoreElements) null, (seek) null, 0, 126, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final optList optlist, encodeUriString encodeuristring, putDoubleIfValid putdoubleifvalid, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = onExtraCallbackWithResult + 55;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-211469922, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.payment.TdsPaymentAgreement.<anonymous>.<anonymous>.<anonymous> (TdsPaymentAgreement.kt:85)");
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(optlist);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.payment.TdsPaymentAgreementKt$$ExternalSyntheticLambda4
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i5 = 2 % 2;
                        int i6 = onNavigationEvent + 49;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                        Unit unitOnExtraCallbackWithResult = getObjectAtIndex.onExtraCallbackWithResult(optlist, (setOrientationDegrees) obj);
                        int i8 = onNavigationEvent + 57;
                        onWarmupCompleted = i8 % 128;
                        if (i8 % 2 == 0) {
                            return unitOnExtraCallbackWithResult;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            emptyIfNull.IAuthTabCallback(SessionProcessorSurface.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, (Function1) objOnMinimized), optlist, encodeuristring, putdoubleifvalid, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallbackWithResult + 97;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
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

    private static final Unit IAuthTabCallback(final optList optlist, float f, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final encodeUriString encodeuristring, final putDoubleIfValid putdoubleifvalid, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i3 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(373424404, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.payment.TdsPaymentAgreement.<anonymous> (TdsPaymentAgreement.kt:65)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(373424404, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.payment.TdsPaymentAgreement.<anonymous> (TdsPaymentAgreement.kt:65)");
            int i4 = onExtraCallbackWithResult + 83;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = submit.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null), Float.MAX_VALUE);
        component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallback(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 6);
        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
            int i6 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                getAwbState.onExtraCallback();
                int i7 = 23 / 0;
            } else {
                getAwbState.onExtraCallback();
            }
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
        if (!(!optlist.onNavigationEvent())) {
            int i8 = onNavigationEvent + 117;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1710232628);
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(setMaxAdCount.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, f), 0.0f, 1, (Object) null), optlist.onExtraCallback(), optlist.onExtraCallbackWithResult(), 90.0f, 0, 0, cameraCaptureResultEmptyCameraCaptureResult, 3072, 24), cameraCaptureResultEmptyCameraCaptureResult, 0);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1710617028);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        setPostviewFormatSelector.onNavigationEvent(getRegexMatches.onExtraCallbackWithResult().onExtraCallback(0), ForwardingCameraControl.onExtraCallback(-211469922, true, new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.payment.TdsPaymentAgreementKt$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                int i10 = 2 % 2;
                int i11 = onNavigationEvent + 101;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                Unit unitOnWarmupCompleted = getObjectAtIndex.onWarmupCompleted(quirksExternalSyntheticBackport0, optlist, encodeuristring, putdoubleifvalid, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i13 = onExtraCallback + 51;
                onNavigationEvent = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 35 / 0;
                }
                return unitOnWarmupCompleted;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0039 A[PHI: r1 r3
      0x0039: PHI (r1v34 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v37 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0030, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0039: PHI (r3v25 int) = (r3v4 int), (r3v26 int) binds: [B:8:0x0030, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[PHI: r1 r3
      0x0032: PHI (r1v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v37 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0030, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r3v5 int) = (r3v4 int), (r3v26 int) binds: [B:8:0x0030, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final encodeUriString encodeuristring, @Nullable putDoubleIfValid putdoubleifvalid, @Nullable optList optlist, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        putDoubleIfValid putdoubleifvalid2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final putDoubleIfValid putdoubleifvalid3;
        final optList optlist2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        int i5;
        optList optlist3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05;
        putDoubleIfValid putdoubleifvalid4;
        int i6;
        int i7;
        optList optlistOnNavigationEvent = optlist;
        int i8 = 2 % 2;
        int i9 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i9 % 128;
        if (i9 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encodeuristring, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1057474284);
            i3 = i2 & 1;
            if (i3 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i4 = i | 6;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            } else if ((i & 6) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2) | i;
            } else {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i4 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(encodeuristring, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1057474284);
            i3 = i2 & 1;
            if (i3 != 0) {
            }
        }
        if ((i & 48) == 0) {
            int i10 = onNavigationEvent + 121;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 1 / 0;
                i7 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(encodeuristring) ? 32 : 16;
            } else if (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(encodeuristring)) {
            }
            i4 |= i7;
        }
        int i12 = i2 & 4;
        if (i12 == 0) {
            if ((i & 384) == 0) {
                putdoubleifvalid2 = putdoubleifvalid;
                i4 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(putdoubleifvalid2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    int i13 = onExtraCallbackWithResult + 21;
                    onNavigationEvent = i13 % 128;
                    if (i13 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(optlistOnNavigationEvent);
                        throw null;
                    }
                    if (!cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(optlistOnNavigationEvent)) {
                        i6 = 1024;
                    } else {
                        int i14 = onExtraCallbackWithResult + 23;
                        onNavigationEvent = i14 % 128;
                        int i15 = i14 % 2;
                        i6 = 2048;
                    }
                    i4 |= i6;
                }
            }
            if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i4 & 1171) == 1170, i4 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                putdoubleifvalid3 = putdoubleifvalid2;
                optlist2 = optlistOnNavigationEvent;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStub();
                if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResult2.onPostMessage()) {
                    if (i3 != 0) {
                        int i16 = onNavigationEvent + 125;
                        onExtraCallbackWithResult = i16 % 128;
                        int i17 = i16 % 2;
                        quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
                    } else {
                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                    }
                    putDoubleIfValid putdoubleifvalid5 = i12 != 0 ? null : putdoubleifvalid2;
                    if ((i2 & 8) != 0) {
                        i5 = 0;
                        optlistOnNavigationEvent = C0084toJsonArray.onNavigationEvent(null, null, null, 0.0f, 0L, 0L, false, false, cameraCaptureResultEmptyCameraCaptureResult2, 0, 255);
                        i4 &= -7169;
                    } else {
                        i5 = 0;
                    }
                    optlist3 = optlistOnNavigationEvent;
                    quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                    putdoubleifvalid4 = putdoubleifvalid5;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                    }
                    optlist3 = optlistOnNavigationEvent;
                    quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport02;
                    putdoubleifvalid4 = putdoubleifvalid2;
                    i5 = 0;
                }
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1057474284, i4, -1, "im.toss.tds.compose.component.compound.agreement.v4.payment.TdsPaymentAgreement (TdsPaymentAgreement.kt:37)");
                }
                Configuration configuration = (Configuration) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult());
                boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(optlist3.onWarmupCompleted());
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if (zIAuthTabCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(configuration.screenHeightDp * 0.33f * optlist3.onWarmupCompleted()));
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                }
                final float fIAuthTabCallback = ((VirtualCameraControlExternalSyntheticLambda1) objOnMinimized).IAuthTabCallback();
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(Boolean.valueOf(optlist3.IAuthTabCallback()), cameraCaptureResultEmptyCameraCaptureResult2, i5);
                r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    int i18 = onExtraCallbackWithResult + 51;
                    onNavigationEvent = i18 % 128;
                    int i19 = i18 % 2;
                    objOnMinimized2 = Integer.valueOf((int) r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(50.0f)));
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
                }
                final int iIntValue = ((Number) objOnMinimized2).intValue();
                boolean zOnExtraCallback = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                getIconContentView geticoncontentview = getIconContentView.onWarmupCompleted;
                ResourceManagerInternalResourceManagerHooks resourceManagerInternalResourceManagerHooksIAuthTabCallback = ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback(getSplitTrack.onExtraCallback(geticoncontentview.IAuthTabCallback(), i5, 2, (Object) null), 0.0f, 2, (Object) null);
                SearchView searchViewOnWarmupCompleted = ResourceManagerInternalVdcInflateDelegate.onWarmupCompleted(getSplitTrack.onExtraCallback(geticoncontentview.asBinder(), i5, 2, (Object) null), 0.0f, 2, (Object) null);
                getThumbPosition getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(geticoncontentview.onExtraCallbackWithResult(), i5, 2, (Object) null);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized3 = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.payment.TdsPaymentAgreementKt$$ExternalSyntheticLambda1
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj) {
                            int i20 = 2 % 2;
                            int i21 = onWarmupCompleted + 53;
                            onNavigationEvent = i21 % 128;
                            int i22 = i21 % 2;
                            Object[] objArr = {Integer.valueOf(iIntValue), Integer.valueOf(((Integer) obj).intValue())};
                            int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                            int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                            int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                            if (i22 != 0) {
                                return Integer.valueOf(((Integer) getObjectAtIndex.IAuthTabCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, 51127456, objArr, -51127455, iOnExtraCallbackWithResult2)).intValue());
                            }
                            Integer.valueOf(((Integer) getObjectAtIndex.IAuthTabCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, 51127456, objArr, -51127455, iOnExtraCallbackWithResult2)).intValue());
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized3);
                }
                final optList optlist4 = optlist3;
                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport05;
                final putDoubleIfValid putdoubleifvalid6 = putdoubleifvalid4;
                setVerticalGravity.onWarmupCompleted(zOnExtraCallback, (QuirksExternalSyntheticBackport0) null, resourceManagerInternalResourceManagerHooksIAuthTabCallback, searchViewOnWarmupCompleted.onNavigationEvent(ResourceManagerInternalVdcInflateDelegate.asBinder(getthumbpositionOnExtraCallback, (Function1) objOnMinimized3)), (String) null, ForwardingCameraControl.onExtraCallback(373424404, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.agreement.v4.payment.TdsPaymentAgreementKt$$ExternalSyntheticLambda2
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i20 = 2 % 2;
                        int i21 = IAuthTabCallback + 35;
                        onExtraCallback = i21 % 128;
                        int i22 = i21 % 2;
                        optList optlist5 = optlist4;
                        float f = fIAuthTabCallback;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        Object[] objArr = {optlist5, Float.valueOf(f), quirksExternalSyntheticBackport06, encodeuristring, putdoubleifvalid6, (setHorizontalGravity) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue2)};
                        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
                        Unit unit = (Unit) getObjectAtIndex.IAuthTabCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 492555137, objArr, -492555137, iOnExtraCallbackWithResult2);
                        int i23 = IAuthTabCallback + 99;
                        onExtraCallback = i23 % 128;
                        if (i23 % 2 != 0) {
                            return unit;
                        }
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 196992, 18);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                putdoubleifvalid3 = putdoubleifvalid4;
                optlist2 = optlist3;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.payment.TdsPaymentAgreementKt$$ExternalSyntheticLambda3
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i20 = 2 % 2;
                        int i21 = onNavigationEvent + 55;
                        onExtraCallbackWithResult = i21 % 128;
                        int i22 = i21 % 2;
                        Unit unitIAuthTabCallback = getObjectAtIndex.IAuthTabCallback(quirksExternalSyntheticBackport03, encodeuristring, putdoubleifvalid3, optlist2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i23 = onExtraCallbackWithResult + 3;
                        onNavigationEvent = i23 % 128;
                        if (i23 % 2 != 0) {
                            return unitIAuthTabCallback;
                        }
                        throw null;
                    }
                });
                return;
            }
            return;
        }
        i4 |= 384;
        putdoubleifvalid2 = putdoubleifvalid;
        if ((i & 3072) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i4 & 1171) == 1170, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final boolean onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            bool.booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zBooleanValue = bool.booleanValue();
        int i4 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public static /* synthetic */ int onNavigationEvent(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return ((Integer) IAuthTabCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 51127456, objArr, -51127455, iOnExtraCallbackWithResult2)).intValue();
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(optList optlist, float f, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, encodeUriString encodeuristring, putDoubleIfValid putdoubleifvalid, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {optlist, Float.valueOf(f), quirksExternalSyntheticBackport0, encodeuristring, putdoubleifvalid, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 492555137, objArr, -492555137, iOnExtraCallbackWithResult2);
    }
}
