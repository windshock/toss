package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.ImageLoaderBuilderExternalSyntheticLambda3;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ImageLoaderBuilderExternalSyntheticLambda3 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    private static final Unit onExtraCallback(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 84 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return onExtraCallback(textFieldScrollKtExternalSyntheticLambda0, function0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onExtraCallback(textFieldScrollKtExternalSyntheticLambda0, function0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@Nullable final TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, @NotNull final Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        boolean z;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1839514189);
        if ((i & 6) == 0) {
            int i6 = onExtraCallbackWithResult + 115;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            if ((i2 & 1) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0)) {
                int i8 = onExtraCallbackWithResult + 47;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 32 : 16;
        }
        if ((i3 & 19) != 18) {
            int i10 = onWarmupCompleted + 53;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
            int i12 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i12 % 128;
            if (i12 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((i & 1) != 0 && !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 1) != 0) {
                        i3 &= -15;
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1839514189, i3, -1, "im.toss.components.compose.extensions.OnResume (OnLifecycleEvent.kt:14)");
                    }
                    int i13 = i3 << 3;
                    AndroidTextContextMenuToolbarProviderExternalSyntheticLambda5.IAuthTabCallback(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_RESUME, textFieldScrollKtExternalSyntheticLambda0, function0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i13 & 112) | 6 | (i13 & 896), 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i14 = onWarmupCompleted + 7;
                        onExtraCallbackWithResult = i14 % 128;
                        if (i14 % 2 == 0) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            int i15 = 65 / 0;
                        } else {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                }
            }
            if ((i2 & 1) != 0) {
                int i16 = onExtraCallbackWithResult + 101;
                onWarmupCompleted = i16 % 128;
                int i17 = i16 % 2;
                textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda1.IAuthTabCallback());
                i3 &= -15;
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
            int i132 = i3 << 3;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda5.IAuthTabCallback(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_RESUME, textFieldScrollKtExternalSyntheticLambda0, function0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i132 & 112) | 6 | (i132 & 896), 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.components.compose.extensions.OnLifecycleEventKt$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i18 = 2 % 2;
                    int i19 = onExtraCallback + 47;
                    onExtraCallbackWithResult = i19 % 128;
                    int i20 = i19 % 2;
                    Unit unitOnExtraCallbackWithResult = ImageLoaderBuilderExternalSyntheticLambda3.onExtraCallbackWithResult(textFieldScrollKtExternalSyntheticLambda0, function0, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i21 = onExtraCallbackWithResult + 53;
                    onExtraCallback = i21 % 128;
                    if (i21 % 2 == 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
        }
    }
}
