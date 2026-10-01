package o;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.observability.instrumentation.memory.PssReader$;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.ImageLoaderBuilderExternalSyntheticLambda5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ImageLoaderBuilderExternalSyntheticLambda5 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Unit IAuthTabCallback(float f, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 15;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            onNavigationEvent(f, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(f, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onWarmupCompleted + 55;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(float f, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 31;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(f, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 81;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit IAuthTabCallback(RowScope rowScope, float f, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {rowScope, Float.valueOf(f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))};
        onExtraCallbackWithResult(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -965895646, objArr, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 965895647);
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 63;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        float fFloatValue = ((Number) objArr[0]).floatValue();
        int iIntValue = ((Number) objArr[1]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(fFloatValue, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 1;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7;
        int i8;
        int i9 = ~i6;
        int i10 = ~i3;
        int i11 = ~(i9 | i10);
        int i12 = ~(i9 | i3);
        int i13 = ~i4;
        int i14 = (~(i10 | i13 | i6)) | i12;
        int i15 = (~(i3 | i13)) | (~(i9 | i13));
        int i16 = i6 + i4 + i + (1941422536 * i2) + ((-555707305) * i5);
        int i17 = i16 * i16;
        int i18 = (i6 * (-2131549542)) + 177471488 + ((-2131549542) * i4) + (i11 * (-207299225)) + (i14 * (-207299225)) + ((-207299225) * i15) + (1956118528 * i) + ((-1363148800) * i2) + (2141716480 * i5) + ((-573308928) * i17);
        int i19 = ((i6 * 487360618) - 1291405921) + (i4 * 487360618) + (i11 * 543) + (i14 * 543) + (i15 * 543) + (i * 487361161) + (i2 * (-1188264952)) + (i5 * 624576655) + (i17 * (-25952256));
        if (i18 + (i19 * i19 * 74186752) != 1) {
            return onExtraCallback(objArr);
        }
        final RowScope rowScope = (RowScope) objArr[0];
        final float fFloatValue = ((Number) objArr[1]).floatValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        final int iIntValue = ((Number) objArr[3]).intValue();
        int i20 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1664840329);
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rowScope)) {
                int i21 = onWarmupCompleted + 21;
                onExtraCallback = i21 % 128;
                int i22 = i21 % 2;
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i8 | iIntValue;
        } else {
            i7 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue) ? 32 : 16;
            int i23 = onExtraCallback + 97;
            onWarmupCompleted = i23 % 128;
            int i24 = i23 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 19) != 18, i7 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1664840329, i7, -1, "im.toss.components.compose.extensions.HorizontalSpacer (Spacer.kt:28)");
            }
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(RowScope.onNavigationEvent(rowScope, QuirksExternalSyntheticBackport0.Companion, fFloatValue, false, 2, (Object) null), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i25 = onWarmupCompleted + 71;
                onExtraCallback = i25 % 128;
                int i26 = i25 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.components.compose.extensions.SpacerKt$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i27 = 2 % 2;
                    int i28 = onWarmupCompleted + 7;
                    onExtraCallbackWithResult = i28 % 128;
                    Object obj3 = null;
                    if (i28 % 2 != 0) {
                        ImageLoaderBuilderExternalSyntheticLambda5.onWarmupCompleted(rowScope, fFloatValue, iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        obj3.hashCode();
                        throw null;
                    }
                    Unit unitOnWarmupCompleted = ImageLoaderBuilderExternalSyntheticLambda5.onWarmupCompleted(rowScope, fFloatValue, iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i29 = onExtraCallbackWithResult + 85;
                    onWarmupCompleted = i29 % 128;
                    if (i29 % 2 != 0) {
                        return unitOnWarmupCompleted;
                    }
                    obj3.hashCode();
                    throw null;
                }
            });
        }
        return null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(float f, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 123;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -1077337654, new Object[]{Float.valueOf(f), Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 1077337654);
        int i5 = onWarmupCompleted + 87;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, float f, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 83;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(meteringRepeatingSessionExternalSyntheticLambda0, f, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 65;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(float f, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 33;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(f, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 95;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, float f, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 27;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return onExtraCallbackWithResult(meteringRepeatingSessionExternalSyntheticLambda0, f, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onExtraCallbackWithResult(meteringRepeatingSessionExternalSyntheticLambda0, f, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RowScope rowScope, float f, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 67;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            IAuthTabCallback(rowScope, f, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(rowScope, f, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onExtraCallback + 5;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static final void IAuthTabCallback(final float f, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(453545809);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f)) {
                i3 = 4;
            } else {
                int i5 = onWarmupCompleted + 65;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 3 % 3;
                }
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            int i7 = onExtraCallback + 63;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            int i9 = onWarmupCompleted + 9;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(453545809, i2, -1, "im.toss.components.compose.extensions.VerticalSpacer (Spacer.kt:13)");
            }
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, f), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onExtraCallback + 123;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.components.compose.extensions.SpacerKt$$ExternalSyntheticLambda3
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = onExtraCallbackWithResult + 75;
                    onWarmupCompleted = i14 % 128;
                    if (i14 % 2 == 0) {
                        ImageLoaderBuilderExternalSyntheticLambda5.onExtraCallbackWithResult(f, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        throw null;
                    }
                    Unit unitOnExtraCallbackWithResult = ImageLoaderBuilderExternalSyntheticLambda5.onExtraCallbackWithResult(f, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i15 = onExtraCallbackWithResult + 89;
                    onWarmupCompleted = i15 % 128;
                    if (i15 % 2 != 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    throw null;
                }
            });
        }
    }

    public static final void onNavigationEvent(final float f, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 71;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-133284253);
        boolean z = true;
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ^ true ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            int i6 = onWarmupCompleted + 97;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-133284253, i2, -1, "im.toss.components.compose.extensions.HorizontalSpacer (Spacer.kt:18)");
            }
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(QuirksExternalSyntheticBackport0.Companion, f), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.components.compose.extensions.SpacerKt$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i8 = 2 % 2;
                    int i9 = IAuthTabCallback + 97;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitIAuthTabCallback = ImageLoaderBuilderExternalSyntheticLambda5.IAuthTabCallback(f, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i11 = IAuthTabCallback + 9;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                    return unitIAuthTabCallback;
                }
            });
        }
    }

    public static final void onWarmupCompleted(@NotNull final MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, final float f, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(meteringRepeatingSessionExternalSyntheticLambda0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-520605983);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(meteringRepeatingSessionExternalSyntheticLambda0)) {
                int i6 = onExtraCallback + 31;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f)) {
                i3 = 16;
            } else {
                int i8 = onExtraCallback + 89;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 4 % 2;
                }
                i3 = 32;
            }
            i2 |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i10 = onWarmupCompleted + 41;
            onExtraCallback = i10 % 128;
            if (i10 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-520605983, i2, -1, "im.toss.components.compose.extensions.VerticalSpacer (Spacer.kt:23)");
            }
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(MeteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(meteringRepeatingSessionExternalSyntheticLambda0, QuirksExternalSyntheticBackport0.Companion, f, false, 2, (Object) null), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i11 = onExtraCallback + 99;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.components.compose.extensions.SpacerKt$$ExternalSyntheticLambda2
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i13 = 2 % 2;
                    int i14 = onExtraCallback + 87;
                    onExtraCallbackWithResult = i14 % 128;
                    int i15 = i14 % 2;
                    Unit unitOnNavigationEvent = ImageLoaderBuilderExternalSyntheticLambda5.onNavigationEvent(meteringRepeatingSessionExternalSyntheticLambda0, f, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i16 = onExtraCallbackWithResult + 107;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                    return unitOnNavigationEvent;
                }
            });
        }
    }

    private static final Unit onExtraCallbackWithResult(float f, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 73;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if ((i & 17) != 16) {
            int i5 = onWarmupCompleted + 91;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1286850682, i, -1, "im.toss.components.compose.extensions.verticalSpacer.<anonymous> (Spacer.kt:33)");
            }
            IAuthTabCallback(f, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i7 = onExtraCallback + 17;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i9 = onWarmupCompleted + 121;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i11 = onExtraCallback + 37;
        onWarmupCompleted = i11 % 128;
        if (i11 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void onExtraCallbackWithResult(@NotNull RowScope rowScope, float f, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rowScope, Float.valueOf(f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        onExtraCallbackWithResult(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -965895646, objArr, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 965895647);
    }

    private static final Unit onWarmupCompleted(float f, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Float.valueOf(f), Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onExtraCallbackWithResult(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -1077337654, objArr, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 1077337654);
    }
}
