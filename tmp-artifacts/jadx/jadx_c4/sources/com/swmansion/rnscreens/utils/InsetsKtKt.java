package com.swmansion.rnscreens.utils;

import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;
import kotlin.jvm.internal.Intrinsics;
import o.CameraControllerExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class InsetsKtKt {
    public static /* synthetic */ CameraControllerExternalSyntheticLambda0 resolveInsetsOrZero$default(View view, int i, WindowInsets windowInsets, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            windowInsets = view.getRootWindowInsets();
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return resolveInsetsOrZero(view, i, windowInsets, z);
    }

    public static final CameraControllerExternalSyntheticLambda0 resolveInsetsOrZero(@NotNull View view, int i, @Nullable WindowInsets windowInsets, boolean z) {
        Intrinsics.checkNotNullParameter(view, "");
        if (windowInsets == null) {
            CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0 = CameraControllerExternalSyntheticLambda0.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0, "");
            return cameraControllerExternalSyntheticLambda0;
        }
        WindowInsetsCompat windowInsetsCompatOnExtraCallbackWithResult = WindowInsetsCompat.onExtraCallbackWithResult(windowInsets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompatOnExtraCallbackWithResult, "");
        if (!z) {
            CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompatOnExtraCallbackWithResult.onWarmupCompleted(i);
            Intrinsics.checkNotNull(cameraControllerExternalSyntheticLambda0OnWarmupCompleted);
            return cameraControllerExternalSyntheticLambda0OnWarmupCompleted;
        }
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnExtraCallbackWithResult = windowInsetsCompatOnExtraCallbackWithResult.onExtraCallbackWithResult(i);
        Intrinsics.checkNotNull(cameraControllerExternalSyntheticLambda0OnExtraCallbackWithResult);
        return cameraControllerExternalSyntheticLambda0OnExtraCallbackWithResult;
    }
}
