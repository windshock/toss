package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.SurfaceProcessorNodeOut;
import o.r8lambda7_Hp2Bu5eHUy2xyMZq0oSvRlHtA;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambda7_Hp2Bu5eHUy2xyMZq0oSvRlHtA {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 IAuthTabCallback;

    private static final Unit IAuthTabCallback(r8lambda7_Hp2Bu5eHUy2xyMZq0oSvRlHtA r8lambda7_hp2bu5ehuy2xymzq0osvrlhta, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 47;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            i |= 1;
        }
        r8lambda7_hp2bu5ehuy2xymzq0osvrlhta.onNavigationEvent(function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        Unit unit = Unit.INSTANCE;
        int i5 = onWarmupCompleted + 107;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 69 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(r8lambda7_Hp2Bu5eHUy2xyMZq0oSvRlHtA r8lambda7_hp2bu5ehuy2xymzq0osvrlhta, SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(r8lambda7_hp2bu5ehuy2xymzq0osvrlhta, surfaceProcessorNodeOut);
        if (i3 != 0) {
            int i4 = 71 / 0;
        }
        int i5 = onWarmupCompleted + 39;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 95 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(r8lambda7_Hp2Bu5eHUy2xyMZq0oSvRlHtA r8lambda7_hp2bu5ehuy2xymzq0osvrlhta, String str, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 17;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(r8lambda7_hp2bu5ehuy2xymzq0osvrlhta, str, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 5;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    private static final Unit onWarmupCompleted(r8lambda7_Hp2Bu5eHUy2xyMZq0oSvRlHtA r8lambda7_hp2bu5ehuy2xymzq0osvrlhta, String str, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 9;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        r8lambda7_hp2bu5ehuy2xymzq0osvrlhta.IAuthTabCallback(str, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 107;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(r8lambda7_Hp2Bu5eHUy2xyMZq0oSvRlHtA r8lambda7_hp2bu5ehuy2xymzq0osvrlhta, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 9;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(r8lambda7_hp2bu5ehuy2xymzq0osvrlhta, function2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onWarmupCompleted + 125;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 43 / 0;
        }
        return unitIAuthTabCallback;
    }

    public r8lambda7_Hp2Bu5eHUy2xyMZq0oSvRlHtA(@NotNull r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4) {
        Intrinsics.checkNotNullParameter(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, "");
        this.IAuthTabCallback = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4;
    }

    private static final Unit onExtraCallback(r8lambda7_Hp2Bu5eHUy2xyMZq0oSvRlHtA r8lambda7_hp2bu5ehuy2xymzq0osvrlhta, SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
        r8lambda7_hp2bu5ehuy2xymzq0osvrlhta.IAuthTabCallback.IAuthTabCallback(surfaceProcessorNodeOut.IAuthTabCallbackDefault());
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 93;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[PHI: r1
      0x004a: PHI (r1v7 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v8 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0031, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033 A[PHI: r1
      0x0033: PHI (r1v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v8 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0031, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(@NotNull final String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) throws NoWhenBranchMatchedException {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2;
        int i3;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        Object obj;
        int i4;
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 55;
        onNavigationEvent = i6 % 128;
        boolean z2 = true;
        if (i6 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1918783999);
            if ((i & 122) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                    int i7 = onWarmupCompleted + 1;
                    onNavigationEvent = i7 % 128;
                    i2 = i7 % 2 != 0 ? 5 : 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1918783999);
            if ((i & 6) == 0) {
            }
        }
        if ((i & 48) == 0) {
            int i8 = onNavigationEvent + 75;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                int i10 = onNavigationEvent + 103;
                onWarmupCompleted = i10 % 128;
                i4 = i10 % 2 == 0 ? 57 : 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
            int i11 = onNavigationEvent + 29;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
        }
        if ((i3 & 19) != 18) {
            int i13 = onNavigationEvent;
            int i14 = i13 + 49;
            onWarmupCompleted = i14 % 128;
            z = !(i14 % 2 == 0);
            int i15 = i13 + 121;
            onWarmupCompleted = i15 % 128;
            int i16 = i15 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1918783999, i3, -1, "im.toss.tds.compose.component.compound.toast.v1.CenterPreset.Text (TdsToastV1Presets.kt:138)");
            }
            getHumanReadableName gethumanreadablenameOnTransact = this.IAuthTabCallback.onTransact();
            if ((i3 & 112) == 32) {
                int i17 = onNavigationEvent + 91;
                int i18 = i17 % 128;
                onWarmupCompleted = i18;
                int i19 = i17 % 2;
                int i20 = i18 + 21;
                onNavigationEvent = i20 % 128;
                int i21 = i20 % 2;
            } else {
                z2 = false;
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!z2) {
                int i22 = onNavigationEvent + 25;
                onWarmupCompleted = i22 % 128;
                if (i22 % 2 == 0) {
                    int i23 = 77 / 0;
                    obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function1 function1 = new Function1() { // from class: im.toss.tds.compose.component.compound.toast.v1.CenterPreset$$ExternalSyntheticLambda1
                            private static int onExtraCallback = 0;
                            private static int onExtraCallbackWithResult = 1;

                            public final Object invoke(Object obj2) {
                                int i24 = 2 % 2;
                                int i25 = onExtraCallback + 3;
                                onExtraCallbackWithResult = i25 % 128;
                                int i26 = i25 % 2;
                                Unit unitIAuthTabCallback = r8lambda7_Hp2Bu5eHUy2xyMZq0oSvRlHtA.IAuthTabCallback(this.f$0, (SurfaceProcessorNodeOut) obj2);
                                int i27 = onExtraCallback + 49;
                                onExtraCallbackWithResult = i27 % 128;
                                if (i27 % 2 != 0) {
                                    return unitIAuthTabCallback;
                                }
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function1);
                        obj = function1;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, gethumanreadablenameOnTransact, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(i3 & 14), 0, 65530}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, gethumanreadablenameOnTransact, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(i3 & 14), 0, 65530}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.toast.v1.CenterPreset$$ExternalSyntheticLambda2
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                    int i24 = 2 % 2;
                    int i25 = onNavigationEvent + 13;
                    onExtraCallbackWithResult = i25 % 128;
                    int i26 = i25 % 2;
                    Unit unitOnExtraCallbackWithResult = r8lambda7_Hp2Bu5eHUy2xyMZq0oSvRlHtA.onExtraCallbackWithResult(this.f$0, str, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i27 = onExtraCallbackWithResult + 15;
                    onNavigationEvent = i27 % 128;
                    if (i27 % 2 != 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    throw null;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-696149263);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 4 : 2) | i;
        } else {
            int i4 = onNavigationEvent + 73;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            int i6 = onWarmupCompleted + 3;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            int i8 = onWarmupCompleted + 59;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            int i10 = onWarmupCompleted + 89;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 21 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i12 = onWarmupCompleted + 89;
                    onNavigationEvent = i12 % 128;
                    int i13 = i12 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-696149263, i2, -1, "im.toss.tds.compose.component.compound.toast.v1.CenterPreset.Content (TdsToastV1Presets.kt:151)");
                }
                function2.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i2 & 14));
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i14 = onNavigationEvent + 69;
                    onWarmupCompleted = i14 % 128;
                    if (i14 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i15 = 66 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                function2.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i2 & 14));
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.toast.v1.CenterPreset$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i16 = 2 % 2;
                    int i17 = onExtraCallbackWithResult + 93;
                    onWarmupCompleted = i17 % 128;
                    Object obj3 = null;
                    if (i17 % 2 == 0) {
                        r8lambda7_Hp2Bu5eHUy2xyMZq0oSvRlHtA.onWarmupCompleted(this.f$0, function2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        obj3.hashCode();
                        throw null;
                    }
                    Unit unitOnWarmupCompleted = r8lambda7_Hp2Bu5eHUy2xyMZq0oSvRlHtA.onWarmupCompleted(this.f$0, function2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i18 = onWarmupCompleted + 27;
                    onExtraCallbackWithResult = i18 % 128;
                    if (i18 % 2 == 0) {
                        return unitOnWarmupCompleted;
                    }
                    obj3.hashCode();
                    throw null;
                }
            });
            int i16 = onNavigationEvent + 37;
            onWarmupCompleted = i16 % 128;
            int i17 = i16 % 2;
        }
    }
}
