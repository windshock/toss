package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.lExternalSyntheticLambda4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class lExternalSyntheticLambda4 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    private static final Unit IAuthTabCallback(float f, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(f, function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 25;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 61 / 0;
        }
        return unit;
    }

    private static final Unit asBinder(float f, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(f, function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(float f, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 21;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(f, function2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(float f, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return IAuthTabCallback(f, function2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        IAuthTabCallback(f, function2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(float f, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            i |= 1;
        }
        onExtraCallback(f, function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(float f, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 97;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unitAsBinder = asBinder(f, function2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return unitAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void onNavigationEvent(final float f, @NotNull final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-284424208);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 32 : 16;
        }
        if ((i2 & 19) != 18) {
            int i4 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i6 = onExtraCallbackWithResult + 49;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-284424208, i2, -1, "im.toss.tds.compose.component.ProvideMaxFontScale (FontScales.kt:11)");
            }
            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            if (r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent() > f) {
                int i8 = IAuthTabCallback + 87;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(689064579);
                setPostviewFormatSelector.onNavigationEvent(needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(), f)), function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i2 & 112) | accessgetCameraFactoryp.onNavigationEvent);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(689239481);
                function2.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i2 >> 3) & 14));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.FontScalesKt$$ExternalSyntheticLambda1
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    Unit unitOnExtraCallbackWithResult;
                    int i10 = 2 % 2;
                    int i11 = onNavigationEvent + 91;
                    onWarmupCompleted = i11 % 128;
                    if (i11 % 2 == 0) {
                        unitOnExtraCallbackWithResult = lExternalSyntheticLambda4.onExtraCallbackWithResult(f, function2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i12 = 57 / 0;
                    } else {
                        unitOnExtraCallbackWithResult = lExternalSyntheticLambda4.onExtraCallbackWithResult(f, function2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    int i13 = onNavigationEvent + 9;
                    onWarmupCompleted = i13 % 128;
                    if (i13 % 2 != 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
        }
        int i10 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(final float f, @NotNull final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(331089346);
        if ((i & 6) == 0) {
            int i4 = onExtraCallbackWithResult + 13;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f)) {
                int i6 = onExtraCallbackWithResult + 111;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2 != 0 ? 2 : 4;
                i2 = i7 | i;
            }
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 32 : 16;
        }
        if ((i2 & 19) != 18) {
            int i10 = onExtraCallbackWithResult;
            int i11 = i10 + 119;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            int i13 = i10 + 117;
            IAuthTabCallback = i13 % 128;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i15 = onExtraCallbackWithResult + 77;
                IAuthTabCallback = i15 % 128;
                int i16 = i15 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(331089346, i2, -1, "im.toss.tds.compose.component.ProvideMinFontScale (FontScales.kt:27)");
            }
            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            if (r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent() < f) {
                int i17 = onExtraCallbackWithResult + 121;
                IAuthTabCallback = i17 % 128;
                int i18 = i17 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2057002127);
                setPostviewFormatSelector.onNavigationEvent(needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(), f)), function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i2 & 112) | accessgetCameraFactoryp.onNavigationEvent);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2056827225);
                function2.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i2 >> 3) & 14));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            int i19 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i19 % 128;
            int i20 = i19 % 2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.FontScalesKt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i21 = 2 % 2;
                    int i22 = IAuthTabCallback + 3;
                    onNavigationEvent = i22 % 128;
                    int i23 = i22 % 2;
                    Unit unitOnWarmupCompleted = lExternalSyntheticLambda4.onWarmupCompleted(f, function2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i24 = onNavigationEvent + 87;
                    IAuthTabCallback = i24 % 128;
                    int i25 = i24 % 2;
                    return unitOnWarmupCompleted;
                }
            });
        }
        int i21 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i21 % 128;
        if (i21 % 2 == 0) {
            int i22 = 44 / 0;
        }
    }

    public static final void onExtraCallback(final float f, @NotNull final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-159353056);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f)) {
                int i5 = IAuthTabCallback + 5;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i7 = onExtraCallbackWithResult + 25;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 32 : 16;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            int i8 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-159353056, i2, -1, "im.toss.tds.compose.component.ProvideFixedFontScale (FontScales.kt:43)");
            }
            setPostviewFormatSelector.onNavigationEvent(needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).IAuthTabCallback(), f)), function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | (i2 & 112));
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.FontScalesKt$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i10 = 2 % 2;
                    int i11 = IAuthTabCallback + 73;
                    onExtraCallback = i11 % 128;
                    Object obj4 = null;
                    if (i11 % 2 == 0) {
                        lExternalSyntheticLambda4.onExtraCallback(f, function2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        obj4.hashCode();
                        throw null;
                    }
                    Unit unitOnExtraCallback = lExternalSyntheticLambda4.onExtraCallback(f, function2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i12 = IAuthTabCallback + 83;
                    onExtraCallback = i12 % 128;
                    if (i12 % 2 != 0) {
                        return unitOnExtraCallback;
                    }
                    obj4.hashCode();
                    throw null;
                }
            });
        }
    }
}
