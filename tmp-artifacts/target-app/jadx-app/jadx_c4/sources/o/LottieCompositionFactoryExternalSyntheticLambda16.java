package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.LottieCompositionFactoryExternalSyntheticLambda16;
import o.LottieCompositionFactoryExternalSyntheticLambda18;
import o.QuirksExternalSyntheticBackport0;
import o.flipHorizontally;
import o.isQueryRefinementEnabled;
import o.setCurrentIndex;
import o.setHorizontalGravity;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class LottieCompositionFactoryExternalSyntheticLambda16 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i2;
        int i8 = (~(i7 | i)) | (~(i4 | i));
        int i9 = i4 | i2;
        int i10 = (~(i2 | (~i))) | (~(i7 | (~i4))) | (~i9);
        int i11 = i4 + i + i3 + (1350191703 * i6) + ((-44904237) * i5);
        int i12 = i11 * i11;
        int i13 = ((i4 * (-560584373)) - 948043776) + ((-560584373) * i) + ((-826660534) * i8) + (i9 * 826660534) + (826660534 * i10) + (266076160 * i3) + ((-71041024) * i6) + ((-766246912) * i5) + (1339949056 * i12);
        int i14 = (i4 * 1657715387) + 2046152777 + (i * 1657715387) + (i8 * (-918)) + (i9 * 918) + (i10 * 918) + (i3 * 1657716305) + (i6 * 1507858311) + (i5 * 1845144771) + (i12 * 155058176);
        if (i13 + (i14 * i14 * 417464320) != 1) {
            return onNavigationEvent(objArr);
        }
        LottieCompositionFactoryExternalSyntheticLambda18 lottieCompositionFactoryExternalSyntheticLambda18 = (LottieCompositionFactoryExternalSyntheticLambda18) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i15 = 2 % 2;
        int i16 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i16 % 128;
        int i17 = i16 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(lottieCompositionFactoryExternalSyntheticLambda18, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i18 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i18 % 128;
        int i19 = i18 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        isQueryRefinementEnabled isqueryrefinementenabled = (isQueryRefinementEnabled) objArr[0];
        isQueryRefinementEnabled isqueryrefinementenabled2 = (isQueryRefinementEnabled) objArr[1];
        flipHorizontally fliphorizontally = (flipHorizontally) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(isqueryrefinementenabled, isqueryrefinementenabled2, fliphorizontally);
        }
        IAuthTabCallback(isqueryrefinementenabled, isqueryrefinementenabled2, fliphorizontally);
        throw null;
    }

    private static final Unit onNavigationEvent(LottieCompositionFactoryExternalSyntheticLambda17 lottieCompositionFactoryExternalSyntheticLambda17, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(lottieCompositionFactoryExternalSyntheticLambda17, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(isQueryRefinementEnabled isqueryrefinementenabled, isQueryRefinementEnabled isqueryrefinementenabled2, isQueryRefinementEnabled isqueryrefinementenabled3, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(isqueryrefinementenabled, isqueryrefinementenabled2, isqueryrefinementenabled3, fliphorizontally);
        int i4 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LottieCompositionFactoryExternalSyntheticLambda17 lottieCompositionFactoryExternalSyntheticLambda17, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda17, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda17, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        throw null;
    }

    private static final Unit onWarmupCompleted(LottieCompositionFactoryExternalSyntheticLambda18 lottieCompositionFactoryExternalSyntheticLambda18, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda18, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 85 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, LottieCompositionFactoryExternalSyntheticLambda17 lottieCompositionFactoryExternalSyntheticLambda17, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, lottieCompositionFactoryExternalSyntheticLambda17, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, LottieCompositionFactoryExternalSyntheticLambda17 lottieCompositionFactoryExternalSyntheticLambda17, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1924239929, i, -1, "im.toss.compose.widget.point.gradient.PointComponentPointGradientGroup.<anonymous> (PointComponentPointGradientGroup.kt:29)");
        }
        component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0);
        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
            int i4 = onWarmupCompleted + 125;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                getAwbState.onExtraCallback();
                throw null;
            }
            getAwbState.onExtraCallback();
        }
        cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
        if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            int i5 = onWarmupCompleted + 67;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
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
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-48362534);
        Iterator<T> it = lottieCompositionFactoryExternalSyntheticLambda17.onExtraCallbackWithResult().iterator();
        while (it.hasNext()) {
            onNavigationEvent((LottieCompositionFactoryExternalSyntheticLambda18) it.next(), cameraCaptureResultEmptyCameraCaptureResult, 0);
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i8 = 25 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull final LottieCompositionFactoryExternalSyntheticLambda17 lottieCompositionFactoryExternalSyntheticLambda17, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        boolean z;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i4;
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        Intrinsics.checkNotNullParameter(lottieCompositionFactoryExternalSyntheticLambda17, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1544492129);
        if ((i & 6) == 0) {
            int i8 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 89 / 0;
                i4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda17) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda17)) {
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                int i11 = onExtraCallbackWithResult + 39;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
                int i13 = onWarmupCompleted + 25;
                onExtraCallbackWithResult = i13 % 128;
                int i14 = i13 % 2;
            }
            if ((i3 & 19) == 18) {
                int i15 = onWarmupCompleted + 61;
                onExtraCallbackWithResult = i15 % 128;
                int i16 = i15 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            } else {
                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i10 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1544492129, i3, -1, "im.toss.compose.widget.point.gradient.PointComponentPointGradientGroup (PointComponentPointGradientGroup.kt:23)");
                    int i17 = onWarmupCompleted + 7;
                    onExtraCallbackWithResult = i17 % 128;
                    int i18 = i17 % 2;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                setVerticalGravity.onWarmupCompleted(((Boolean) LottieCompositionFactoryExternalSyntheticLambda17.onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -379597656, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 379597657, new Object[]{lottieCompositionFactoryExternalSyntheticLambda17})).booleanValue(), (QuirksExternalSyntheticBackport0) null, lottieCompositionFactoryExternalSyntheticLambda17.onWarmupCompleted(), lottieCompositionFactoryExternalSyntheticLambda17.onExtraCallback(), (String) null, ForwardingCameraControl.onExtraCallback(-1924239929, true, new getBacktraceNote() { // from class: im.toss.compose.widget.point.gradient.PointComponentPointGradientGroupKt$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i19 = 2 % 2;
                        int i20 = onNavigationEvent + 53;
                        onExtraCallback = i20 % 128;
                        int i21 = i20 % 2;
                        Unit unitOnWarmupCompleted = LottieCompositionFactoryExternalSyntheticLambda16.onWarmupCompleted(quirksExternalSyntheticBackport03, lottieCompositionFactoryExternalSyntheticLambda17, (setHorizontalGravity) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i22 = onNavigationEvent + 111;
                        onExtraCallback = i22 % 128;
                        int i23 = i22 % 2;
                        return unitOnWarmupCompleted;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196608, 18);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i19 = onWarmupCompleted + 33;
                    onExtraCallbackWithResult = i19 % 128;
                    if (i19 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i20 = 15 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.widget.point.gradient.PointComponentPointGradientGroupKt$$ExternalSyntheticLambda1
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj, Object obj2) {
                        int i21 = 2 % 2;
                        int i22 = onExtraCallback + 21;
                        onExtraCallbackWithResult = i22 % 128;
                        int i23 = i22 % 2;
                        Unit unitOnWarmupCompleted = LottieCompositionFactoryExternalSyntheticLambda16.onWarmupCompleted(lottieCompositionFactoryExternalSyntheticLambda17, quirksExternalSyntheticBackport02, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i24 = onExtraCallbackWithResult + 11;
                        onExtraCallback = i24 % 128;
                        int i25 = i24 % 2;
                        return unitOnWarmupCompleted;
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if ((i3 & 19) == 18) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final Unit onWarmupCompleted(isQueryRefinementEnabled isqueryrefinementenabled, isQueryRefinementEnabled isqueryrefinementenabled2, isQueryRefinementEnabled isqueryrefinementenabled3, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.IAuthTabCallback_Parcel(((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue());
        fliphorizontally.access000(((Number) isqueryrefinementenabled2.IAuthTabCallback()).floatValue());
        fliphorizontally.IAuthTabCallbackStubProxy(((Number) isqueryrefinementenabled3.IAuthTabCallback()).floatValue());
        fliphorizontally.getInterfaceDescriptor(((Number) isqueryrefinementenabled3.IAuthTabCallback()).floatValue());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 53;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(isQueryRefinementEnabled isqueryrefinementenabled, isQueryRefinementEnabled isqueryrefinementenabled2, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.IAuthTabCallbackStub(((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue());
        fliphorizontally.IAuthTabCallbackStubProxy(((Number) isqueryrefinementenabled2.IAuthTabCallback()).floatValue());
        fliphorizontally.getInterfaceDescriptor(((Number) isqueryrefinementenabled2.IAuthTabCallback()).floatValue());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
        return unit;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $opacity;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $scale;
        final /* synthetic */ LottieCompositionFactoryExternalSyntheticLambda18 $state;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $translationX;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $translationY;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(LottieCompositionFactoryExternalSyntheticLambda18 lottieCompositionFactoryExternalSyntheticLambda18, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled2, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled3, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled4, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$state = lottieCompositionFactoryExternalSyntheticLambda18;
            this.$opacity = isqueryrefinementenabled;
            this.$scale = isqueryrefinementenabled2;
            this.$translationX = isqueryrefinementenabled3;
            this.$translationY = isqueryrefinementenabled4;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$state, this.$opacity, this.$scale, this.$translationX, this.$translationY, access13800Var);
            onnavigationevent.L$0 = obj;
            int i2 = onExtraCallback + 91;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 9 / 0;
            }
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 23;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 23;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 125;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 83;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12OnNavigationEvent = this.$state.onNavigationEvent();
            if (lottieCompositionFactoryExternalSyntheticLambda12OnNavigationEvent != null) {
                maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(this.$opacity, lottieCompositionFactoryExternalSyntheticLambda12OnNavigationEvent, null), 3, (Object) null);
            }
            LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12IAuthTabCallback = this.$state.IAuthTabCallback();
            if (lottieCompositionFactoryExternalSyntheticLambda12IAuthTabCallback != null) {
                maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new C0015onNavigationEvent(this.$scale, lottieCompositionFactoryExternalSyntheticLambda12IAuthTabCallback, null), 3, (Object) null);
            }
            LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12OnWarmupCompleted = this.$state.onWarmupCompleted();
            if (lottieCompositionFactoryExternalSyntheticLambda12OnWarmupCompleted != null) {
                maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(this.$translationX, lottieCompositionFactoryExternalSyntheticLambda12OnWarmupCompleted, null), 3, (Object) null);
            }
            LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12IAuthTabCallbackDefault = this.$state.IAuthTabCallbackDefault();
            if (lottieCompositionFactoryExternalSyntheticLambda12IAuthTabCallbackDefault != null) {
                maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(this.$translationY, lottieCompositionFactoryExternalSyntheticLambda12IAuthTabCallbackDefault, null), 3, (Object) null);
            }
            return Unit.INSTANCE;
        }

        static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            final /* synthetic */ LottieCompositionFactoryExternalSyntheticLambda12 $it;
            final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $opacity;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallbackWithResult(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12, access13800<? super onExtraCallbackWithResult> access13800Var) {
                super(2, access13800Var);
                this.$opacity = isqueryrefinementenabled;
                this.$it = lottieCompositionFactoryExternalSyntheticLambda12;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$opacity, this.$it, access13800Var);
                int i2 = IAuthTabCallback + 87;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return onextracallbackwithresult;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 43;
                IAuthTabCallback = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 != 0) {
                    onNavigationEvent(findresandmsg, access13800Var);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
                int i3 = IAuthTabCallback + 83;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return objOnNavigationEvent;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 21;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
                if (i3 != 0) {
                    onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 79;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 19;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$opacity;
                    Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(this.$it.onNavigationEvent());
                    onItemClicked<Float> onitemclickedOnExtraCallbackWithResult = this.$it.onExtraCallbackWithResult();
                    this.label = 1;
                    if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, onitemclickedOnExtraCallbackWithResult, (Object) null, (Function1) null, this, 12, (Object) null) == objOnWarmupCompleted) {
                        int i5 = IAuthTabCallback + 87;
                        onExtraCallbackWithResult = i5 % 128;
                        if (i5 % 2 != 0) {
                            return objOnWarmupCompleted;
                        }
                        throw null;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* renamed from: o.LottieCompositionFactoryExternalSyntheticLambda16$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        static final class C0015onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;
            final /* synthetic */ LottieCompositionFactoryExternalSyntheticLambda12 $it;
            final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $scale;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0015onNavigationEvent(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12, access13800<? super C0015onNavigationEvent> access13800Var) {
                super(2, access13800Var);
                this.$scale = isqueryrefinementenabled;
                this.$it = lottieCompositionFactoryExternalSyntheticLambda12;
            }

            public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 75;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallbackWithResult + 57;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                C0015onNavigationEvent c0015onNavigationEvent = new C0015onNavigationEvent(this.$scale, this.$it, access13800Var);
                int i2 = onExtraCallbackWithResult + 51;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return c0015onNavigationEvent;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 39;
                IAuthTabCallback = i2 % 128;
                Object obj3 = null;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    IAuthTabCallback(findresandmsg, access13800Var);
                    obj3.hashCode();
                    throw null;
                }
                Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
                int i3 = IAuthTabCallback + 27;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    return objIAuthTabCallback;
                }
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
            
                if (r13 == r1) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
            
                if (r13 != r1) goto L22;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 125;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    if (!processDeepLink.onExtraCallback()) {
                        isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$scale;
                        Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(this.$it.onNavigationEvent());
                        onItemClicked<Float> onitemclickedOnExtraCallbackWithResult = this.$it.onExtraCallbackWithResult();
                        this.label = 2;
                        obj = isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, onitemclickedOnExtraCallbackWithResult, (Object) null, (Function1) null, this, 12, (Object) null);
                    } else {
                        int i5 = onExtraCallbackWithResult + 17;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled2 = this.$scale;
                        Float fOnExtraCallbackWithResult2 = access14000.onExtraCallbackWithResult(this.$it.onNavigationEvent());
                        getThumbPosition getthumbpositionOnExtraCallbackWithResult = onQueryRefine.onExtraCallbackWithResult(0, 0, (setOnQueryTextListener) null, 6, (Object) null);
                        this.label = 1;
                        obj = isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled2, fOnExtraCallbackWithResult2, getthumbpositionOnExtraCallbackWithResult, (Object) null, (Function1) null, this, 12, (Object) null);
                    }
                    return objOnWarmupCompleted;
                }
                int i7 = onExtraCallbackWithResult + 57;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0 ? i4 == 1 : i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                } else {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                return Unit.INSTANCE;
            }
        }

        static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ LottieCompositionFactoryExternalSyntheticLambda12 $it;
            final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $translationX;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallback(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12, access13800<? super onExtraCallback> access13800Var) {
                super(2, access13800Var);
                this.$translationX = isqueryrefinementenabled;
                this.$it = lottieCompositionFactoryExternalSyntheticLambda12;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallback onextracallback = new onExtraCallback(this.$translationX, this.$it, access13800Var);
                int i2 = onExtraCallback + 79;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return onextracallback;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 15;
                onWarmupCompleted = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    onExtraCallback(findresandmsg, access13800Var);
                    throw null;
                }
                Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
                int i3 = onWarmupCompleted + 19;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return objOnExtraCallback;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 45;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    return onextracallbackCreate.invokeSuspend(unit);
                }
                onextracallbackCreate.invokeSuspend(unit);
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
            
                if (r14 != r1) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0091, code lost:
            
                if (r14 == r1) goto L20;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 79;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    access14300.onWarmupCompleted();
                    throw null;
                }
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i3 = this.label;
                if (i3 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    if (processDeepLink.onExtraCallback()) {
                        int i4 = onExtraCallback + 117;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$translationX;
                        Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(this.$it.onNavigationEvent());
                        getThumbPosition getthumbpositionOnExtraCallbackWithResult = onQueryRefine.onExtraCallbackWithResult(0, 0, (setOnQueryTextListener) null, 6, (Object) null);
                        this.label = 1;
                        obj = isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, getthumbpositionOnExtraCallbackWithResult, (Object) null, (Function1) null, this, 12, (Object) null);
                    } else {
                        isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled2 = this.$translationX;
                        Float fOnExtraCallbackWithResult2 = access14000.onExtraCallbackWithResult(this.$it.onNavigationEvent());
                        onItemClicked<Float> onitemclickedOnExtraCallbackWithResult = this.$it.onExtraCallbackWithResult();
                        this.label = 2;
                        obj = isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled2, fOnExtraCallbackWithResult2, onitemclickedOnExtraCallbackWithResult, (Object) null, (Function1) null, this, 12, (Object) null);
                    }
                    return objOnWarmupCompleted;
                }
                if (i3 != 1) {
                    int i6 = onExtraCallback + 17;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    int i8 = onWarmupCompleted + 13;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    ResultKt.onNavigationEvent(obj);
                }
                return Unit.INSTANCE;
            }
        }

        static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            final /* synthetic */ LottieCompositionFactoryExternalSyntheticLambda12 $it;
            final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $translationY;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onWarmupCompleted(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12, access13800<? super onWarmupCompleted> access13800Var) {
                super(2, access13800Var);
                this.$translationY = isqueryrefinementenabled;
                this.$it = lottieCompositionFactoryExternalSyntheticLambda12;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$translationY, this.$it, access13800Var);
                int i2 = onExtraCallbackWithResult + 101;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return onwarmupcompleted;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 5;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
                int i4 = onExtraCallbackWithResult + 53;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return objOnExtraCallbackWithResult;
                }
                throw null;
            }

            public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 45;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
                if (i3 != 0) {
                    return onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
                }
                onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
            
                if (r13 != r1) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
            
                if (r13 == r1) goto L23;
             */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0048 A[PHI: r1
              0x0048: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r4
              0x0024: PHI (r4v1 int) = (r4v0 int), (r4v4 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objOnWarmupCompleted;
                int i;
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 87;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    objOnWarmupCompleted = access14300.onWarmupCompleted();
                    i = this.label;
                    int i4 = 54 / 0;
                    if (i == 0) {
                        ResultKt.onNavigationEvent(obj);
                        if (processDeepLink.onExtraCallback()) {
                            isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$translationY;
                            Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(this.$it.onNavigationEvent());
                            getThumbPosition getthumbpositionOnExtraCallbackWithResult = onQueryRefine.onExtraCallbackWithResult(0, 0, (setOnQueryTextListener) null, 6, (Object) null);
                            this.label = 1;
                            obj = isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, getthumbpositionOnExtraCallbackWithResult, (Object) null, (Function1) null, this, 12, (Object) null);
                        } else {
                            isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled2 = this.$translationY;
                            Float fOnExtraCallbackWithResult2 = access14000.onExtraCallbackWithResult(this.$it.onNavigationEvent());
                            onItemClicked<Float> onitemclickedOnExtraCallbackWithResult = this.$it.onExtraCallbackWithResult();
                            this.label = 2;
                            obj = isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled2, fOnExtraCallbackWithResult2, onitemclickedOnExtraCallbackWithResult, (Object) null, (Function1) null, this, 12, (Object) null);
                        }
                        int i5 = onExtraCallbackWithResult + 13;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        return objOnWarmupCompleted;
                    }
                    int i7 = onExtraCallback;
                    int i8 = i7 + 5;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    if (i == 1) {
                        ResultKt.onNavigationEvent(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i10 = i7 + 33;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        ResultKt.onNavigationEvent(obj);
                    }
                } else {
                    objOnWarmupCompleted = access14300.onWarmupCompleted();
                    i = this.label;
                    if (i != 0) {
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x029c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(final LottieCompositionFactoryExternalSyntheticLambda18 lottieCompositionFactoryExternalSyntheticLambda18, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        float fIAuthTabCallback;
        Float fValueOf;
        float fIAuthTabCallback2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(475758381);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda18)) {
                int i6 = onWarmupCompleted + 115;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(475758381, i2, -1, "im.toss.compose.widget.point.gradient.PointGradient (PointComponentPointGradientGroup.kt:38)");
            }
            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            long jOnNavigationEvent = VirtualCameraControlExternalSyntheticLambda2.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(Float.intBitsToFloat((int) (lottieCompositionFactoryExternalSyntheticLambda18.onExtraCallbackWithResult() >> 32))), r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(Float.intBitsToFloat((int) lottieCompositionFactoryExternalSyntheticLambda18.onExtraCallbackWithResult())));
            LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12OnNavigationEvent = lottieCompositionFactoryExternalSyntheticLambda18.onNavigationEvent();
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda12OnNavigationEvent != null ? Float.valueOf(lottieCompositionFactoryExternalSyntheticLambda12OnNavigationEvent.IAuthTabCallback()) : null);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!zOnNavigationEvent) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12OnNavigationEvent2 = lottieCompositionFactoryExternalSyntheticLambda18.onNavigationEvent();
                    if (lottieCompositionFactoryExternalSyntheticLambda12OnNavigationEvent2 != null) {
                        fIAuthTabCallback = lottieCompositionFactoryExternalSyntheticLambda12OnNavigationEvent2.IAuthTabCallback();
                    } else {
                        int i8 = onExtraCallbackWithResult + 27;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                        fIAuthTabCallback = 0.0f;
                    }
                    isQueryRefinementEnabled isqueryrefinementenabledOnWarmupCompleted = isIconified.onWarmupCompleted(fIAuthTabCallback, 0.0f, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(isqueryrefinementenabledOnWarmupCompleted);
                    obj = isqueryrefinementenabledOnWarmupCompleted;
                }
                final isQueryRefinementEnabled isqueryrefinementenabled = (isQueryRefinementEnabled) obj;
                LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12IAuthTabCallback = lottieCompositionFactoryExternalSyntheticLambda18.IAuthTabCallback();
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda12IAuthTabCallback != null ? Float.valueOf(lottieCompositionFactoryExternalSyntheticLambda12IAuthTabCallback.IAuthTabCallback()) : null);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!zOnNavigationEvent2) {
                    Object obj2 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12IAuthTabCallback2 = lottieCompositionFactoryExternalSyntheticLambda18.IAuthTabCallback();
                        isQueryRefinementEnabled isqueryrefinementenabledOnWarmupCompleted2 = isIconified.onWarmupCompleted(lottieCompositionFactoryExternalSyntheticLambda12IAuthTabCallback2 != null ? lottieCompositionFactoryExternalSyntheticLambda12IAuthTabCallback2.IAuthTabCallback() : 1.0f, 0.0f, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(isqueryrefinementenabledOnWarmupCompleted2);
                        obj2 = isqueryrefinementenabledOnWarmupCompleted2;
                    }
                    final isQueryRefinementEnabled isqueryrefinementenabled2 = (isQueryRefinementEnabled) obj2;
                    LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12OnWarmupCompleted = lottieCompositionFactoryExternalSyntheticLambda18.onWarmupCompleted();
                    boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda12OnWarmupCompleted != null ? Float.valueOf(lottieCompositionFactoryExternalSyntheticLambda12OnWarmupCompleted.IAuthTabCallback()) : null);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnNavigationEvent3 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12OnWarmupCompleted2 = lottieCompositionFactoryExternalSyntheticLambda18.onWarmupCompleted();
                        objOnMinimized3 = isIconified.onWarmupCompleted(lottieCompositionFactoryExternalSyntheticLambda12OnWarmupCompleted2 != null ? lottieCompositionFactoryExternalSyntheticLambda12OnWarmupCompleted2.IAuthTabCallback() : 0.0f, 0.0f, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                    }
                    final isQueryRefinementEnabled isqueryrefinementenabled3 = (isQueryRefinementEnabled) objOnMinimized3;
                    LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12IAuthTabCallbackDefault = lottieCompositionFactoryExternalSyntheticLambda18.IAuthTabCallbackDefault();
                    if (lottieCompositionFactoryExternalSyntheticLambda12IAuthTabCallbackDefault != null) {
                        int i10 = onWarmupCompleted + 117;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        fValueOf = Float.valueOf(lottieCompositionFactoryExternalSyntheticLambda12IAuthTabCallbackDefault.IAuthTabCallback());
                    } else {
                        fValueOf = null;
                    }
                    boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(fValueOf);
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnNavigationEvent4 || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12IAuthTabCallbackDefault2 = lottieCompositionFactoryExternalSyntheticLambda18.IAuthTabCallbackDefault();
                        if (lottieCompositionFactoryExternalSyntheticLambda12IAuthTabCallbackDefault2 != null) {
                            int i12 = onWarmupCompleted + 35;
                            onExtraCallbackWithResult = i12 % 128;
                            int i13 = i12 % 2;
                            fIAuthTabCallback2 = lottieCompositionFactoryExternalSyntheticLambda12IAuthTabCallbackDefault2.IAuthTabCallback();
                        } else {
                            int i14 = onExtraCallbackWithResult + 121;
                            onWarmupCompleted = i14 % 128;
                            int i15 = i14 % 2;
                            fIAuthTabCallback2 = 0.0f;
                        }
                        objOnMinimized4 = isIconified.onWarmupCompleted(fIAuthTabCallback2, 0.0f, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                    }
                    final isQueryRefinementEnabled isqueryrefinementenabled4 = (isQueryRefinementEnabled) objOnMinimized4;
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled3);
                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled4);
                    boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled2);
                    Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((zOnExtraCallback | zOnExtraCallback2 | zOnExtraCallback3) || objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized5 = new Function1() { // from class: im.toss.compose.widget.point.gradient.PointComponentPointGradientGroupKt$$ExternalSyntheticLambda2
                            private static int IAuthTabCallback = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj3) {
                                int i16 = 2 % 2;
                                int i17 = onWarmupCompleted + 67;
                                IAuthTabCallback = i17 % 128;
                                if (i17 % 2 == 0) {
                                    LottieCompositionFactoryExternalSyntheticLambda16.onNavigationEvent(isqueryrefinementenabled3, isqueryrefinementenabled4, isqueryrefinementenabled2, (flipHorizontally) obj3);
                                    throw null;
                                }
                                Unit unitOnNavigationEvent = LottieCompositionFactoryExternalSyntheticLambda16.onNavigationEvent(isqueryrefinementenabled3, isqueryrefinementenabled4, isqueryrefinementenabled2, (flipHorizontally) obj3);
                                int i18 = IAuthTabCallback + 69;
                                onWarmupCompleted = i18 % 128;
                                int i19 = i18 % 2;
                                return unitOnNavigationEvent;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = attachTimestamp.IAuthTabCallback(onextracallback, (Function1) objOnMinimized5);
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallback);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
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
                    String strOnExtraCallback = lottieCompositionFactoryExternalSyntheticLambda18.onExtraCallback();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, jOnNavigationEvent);
                    boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled);
                    boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled2);
                    Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((zOnExtraCallback4 | zOnExtraCallback5) || objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized6 = new Function1() { // from class: im.toss.compose.widget.point.gradient.PointComponentPointGradientGroupKt$$ExternalSyntheticLambda3
                            private static int IAuthTabCallback = 1;
                            private static int onExtraCallbackWithResult;

                            public final Object invoke(Object obj3) {
                                int i16 = 2 % 2;
                                int i17 = onExtraCallbackWithResult + 21;
                                IAuthTabCallback = i17 % 128;
                                int i18 = i17 % 2;
                                isQueryRefinementEnabled isqueryrefinementenabled5 = isqueryrefinementenabled;
                                if (i18 != 0) {
                                    Object[] objArr = {isqueryrefinementenabled5, isqueryrefinementenabled2, (flipHorizontally) obj3};
                                    return (Unit) LottieCompositionFactoryExternalSyntheticLambda16.onNavigationEvent(-1554569719, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), 1554569719, objArr, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
                                }
                                Object[] objArr2 = {isqueryrefinementenabled5, isqueryrefinementenabled2, (flipHorizontally) obj3};
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                        int i16 = onExtraCallbackWithResult + 123;
                        onWarmupCompleted = i16 % 128;
                        int i17 = i16 % 2;
                    }
                    AppLovinNativeAdImplc.onExtraCallbackWithResult(strOnExtraCallback, attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized6), 0L, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, immediateFailedFuture.Companion.onNavigationEvent(), (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 12582912, 380);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                    Unit unit = Unit.INSTANCE;
                    boolean z = (i2 & 14) == 4;
                    boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled);
                    boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled2);
                    boolean zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled3);
                    boolean zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled4);
                    Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!(z | zOnExtraCallback6 | zOnExtraCallback7 | zOnExtraCallback8 | zOnExtraCallback9)) {
                        int i18 = onExtraCallbackWithResult + 45;
                        onWarmupCompleted = i18 % 128;
                        int i19 = i18 % 2;
                        if (objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            i3 = 0;
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            objOnMinimized7 = new onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda18, isqueryrefinementenabled, isqueryrefinementenabled2, isqueryrefinementenabled3, isqueryrefinementenabled4, null);
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized7);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            i3 = 0;
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized7, cameraCaptureResultEmptyCameraCaptureResult2, 6);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i20 = onWarmupCompleted + 71;
                            onExtraCallbackWithResult = i20 % 128;
                            if (i20 % 2 == 0) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                                int i21 = 3 / i3;
                            } else {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.widget.point.gradient.PointComponentPointGradientGroupKt$$ExternalSyntheticLambda4
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj3, Object obj4) {
                    int i22 = 2 % 2;
                    int i23 = onWarmupCompleted + 1;
                    onExtraCallbackWithResult = i23 % 128;
                    int i24 = i23 % 2;
                    LottieCompositionFactoryExternalSyntheticLambda18 lottieCompositionFactoryExternalSyntheticLambda182 = lottieCompositionFactoryExternalSyntheticLambda18;
                    if (i24 != 0) {
                        int i25 = i;
                        int iIntValue = ((Integer) obj4).intValue();
                        Object[] objArr = {lottieCompositionFactoryExternalSyntheticLambda182, Integer.valueOf(i25), (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(iIntValue)};
                        return (Unit) LottieCompositionFactoryExternalSyntheticLambda16.onNavigationEvent(1494043289, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), -1494043288, objArr, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
                    }
                    int i26 = i;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    Object[] objArr2 = {lottieCompositionFactoryExternalSyntheticLambda182, Integer.valueOf(i26), (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(iIntValue2)};
                    int i27 = 39 / 0;
                    return (Unit) LottieCompositionFactoryExternalSyntheticLambda16.onNavigationEvent(1494043289, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), -1494043288, objArr2, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
                }
            });
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(LottieCompositionFactoryExternalSyntheticLambda18 lottieCompositionFactoryExternalSyntheticLambda18, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {lottieCompositionFactoryExternalSyntheticLambda18, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onNavigationEvent(1494043289, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), -1494043288, objArr, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallback(isQueryRefinementEnabled isqueryrefinementenabled, isQueryRefinementEnabled isqueryrefinementenabled2, flipHorizontally fliphorizontally) {
        return (Unit) onNavigationEvent(-1554569719, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), 1554569719, new Object[]{isqueryrefinementenabled, isqueryrefinementenabled2, fliphorizontally}, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
    }
}
