package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.addValueCallback;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class addValueCallback {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    private static final Unit onExtraCallback(boolean z, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z2, Function0 function0, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 31;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(z, quirksExternalSyntheticBackport0, z2, function0, function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 9;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(function0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function0);
        int i3 = IAuthTabCallback + 91;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(boolean z, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z2, Function0 function0, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 83;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(z, quirksExternalSyntheticBackport0, z2, function0, function2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = IAuthTabCallback + 17;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 48 / 0;
        }
        int i5 = onExtraCallback + 3;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(final boolean z, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z2, @NotNull final Function0<Unit> function0, @NotNull final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        final boolean z5;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean z6;
        int i6;
        int i7 = 2 % 2;
        int i8 = onExtraCallback + 99;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1795060159);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 4 : 2) | i;
        } else {
            int i10 = onExtraCallback + 107;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 16 : 32;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z3 = z2;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    int i13 = onExtraCallback + 123;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                        int i15 = IAuthTabCallback + 61;
                        onExtraCallback = i15 % 128;
                        int i16 = i15 % 2;
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                if ((i & 24576) == 0) {
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 16384 : 8192;
                }
                i5 = i3;
                if ((i5 & 9363) != 9362) {
                    int i17 = IAuthTabCallback + 103;
                    onExtraCallback = i17 % 128;
                    int i18 = i17 % 2;
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z4, i5 & 1)) {
                    if (i12 != 0) {
                        int i19 = onExtraCallback + 59;
                        IAuthTabCallback = i19 % 128;
                        if (i19 % 2 == 0) {
                            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                            throw null;
                        }
                        quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                    }
                    if (i4 != 0) {
                        int i20 = IAuthTabCallback + 79;
                        onExtraCallback = i20 % 128;
                        int i21 = i20 % 2;
                        z3 = true;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1795060159, i5, -1, "im.toss.compose.PullToRefreshContainer (PullToRefreshContainer.kt:20)");
                    }
                    if ((i5 & 7168) == 2048) {
                        int i22 = IAuthTabCallback + 101;
                        onExtraCallback = i22 % 128;
                        int i23 = i22 % 2;
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!z6) {
                        Object obj = objOnMinimized;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            Function0 function02 = new Function0() { // from class: im.toss.compose.PullToRefreshContainerKt$$ExternalSyntheticLambda0
                                private static int IAuthTabCallback = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke() {
                                    Unit unitOnNavigationEvent;
                                    int i24 = 2 % 2;
                                    int i25 = onWarmupCompleted + 39;
                                    IAuthTabCallback = i25 % 128;
                                    if (i25 % 2 == 0) {
                                        unitOnNavigationEvent = addValueCallback.onNavigationEvent(function0);
                                        int i26 = 34 / 0;
                                    } else {
                                        unitOnNavigationEvent = addValueCallback.onNavigationEvent(function0);
                                    }
                                    int i27 = IAuthTabCallback + 119;
                                    onWarmupCompleted = i27 % 128;
                                    int i28 = i27 % 2;
                                    return unitOnNavigationEvent;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function02);
                            obj = function02;
                        }
                        int i24 = i5 & 14;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                        boolean z7 = z3;
                        RetryPolicyBuilder retryPolicyBuilderOnExtraCallbackWithResult = RetryPolicyExternalSyntheticLambda0.onExtraCallbackWithResult(z, (Function0) obj, 0.0f, 0.0f, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i24, 12);
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = RetryPolicyExecutionState.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback2, 0.0f, 1, (Object) null), retryPolicyBuilderOnExtraCallbackWithResult, z7).onExtraCallback(quirksExternalSyntheticBackport03);
                        QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                        component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                            int i25 = onExtraCallback + 45;
                            IAuthTabCallback = i25 % 128;
                            int i26 = i25 % 2;
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
                        function2.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i5 >> 12) & 14));
                        RetryPolicy.onExtraCallbackWithResult(z, retryPolicyBuilderOnExtraCallbackWithResult, highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback2, onextracallbackwithresult.IAuthTabCallback_Parcel()), 0L, 0L, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i24 | (RetryPolicyBuilder.IAuthTabCallback << 3), 56);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        z5 = z7;
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    z5 = z3;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.PullToRefreshContainerKt$$ExternalSyntheticLambda1
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj2, Object obj3) {
                            int i27 = 2 % 2;
                            int i28 = IAuthTabCallback + 103;
                            onNavigationEvent = i28 % 128;
                            int i29 = i28 % 2;
                            Unit unitOnNavigationEvent = addValueCallback.onNavigationEvent(z, quirksExternalSyntheticBackport04, z5, function0, function2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i30 = IAuthTabCallback + 125;
                            onNavigationEvent = i30 % 128;
                            if (i30 % 2 != 0) {
                                return unitOnNavigationEvent;
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
            int i27 = onExtraCallback + 109;
            IAuthTabCallback = i27 % 128;
            int i28 = i27 % 2;
            i3 |= 384;
            z3 = z2;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i3;
            if ((i5 & 9363) != 9362) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z4, i5 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        z3 = z2;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i3;
        if ((i5 & 9363) != 9362) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z4, i5 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }
}
