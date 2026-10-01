package com.google.accompanist.swiperefresh;

import kotlin.ranges.RangesKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SlingshotKt {
    public static final float MaxProgressArc = 0.8f;

    public static final Slingshot rememberUpdatedSlingshot(float f, float f2, int i2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(-2136847435);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2136847435, i3, -1, "com.google.accompanist.swiperefresh.rememberUpdatedSlingshot (Slingshot.kt:40)");
        }
        float fMin = Math.min(1.0f, f / f2);
        float fMax = (Math.max(fMin - 0.4f, 0.0f) * 5.0f) / 3.0f;
        float fMax2 = Math.max(0.0f, Math.min(Math.abs(f) - f2, f2 * 2.0f) / f2) / 4.0f;
        float fPow = (fMax2 - ((float) Math.pow(fMax2, 2.0d))) * 2.0f;
        int i4 = (int) ((fMin * f2) + (f2 * fPow * 2.0f));
        float fCoerceAtMost = RangesKt.coerceAtMost(fMax * 0.8f, 0.8f);
        float fMin2 = Math.min(1.0f, fMax);
        cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(-492369756);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new Slingshot();
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackStubProxy();
        Slingshot slingshot = (Slingshot) objOnMinimized;
        slingshot.setOffset((i4 + i2) - i2);
        slingshot.setStartTrim(0.0f);
        slingshot.setEndTrim(fCoerceAtMost);
        slingshot.setRotation((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        slingshot.setArrowScale(fMin2);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackStubProxy();
        return slingshot;
    }
}
