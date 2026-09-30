package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.pin;
import o.t7;
import o.t7ExternalSyntheticLambda0;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class t7 extends t7ExternalSyntheticLambda0.onWarmupCompleted {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public static final t7 onNavigationEvent = new t7();
    private static int onWarmupCompleted;

    static {
        int i = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ float onExtraCallbackWithResult(pin pinVar) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(pinVar);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float fOnNavigationEvent = onNavigationEvent(pinVar);
        int i3 = onWarmupCompleted + 81;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 74 / 0;
        }
        return fOnNavigationEvent;
    }

    @Override // o.t7ExternalSyntheticLambda0.onWarmupCompleted
    public boolean onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 73;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 55;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    private t7() {
    }

    private static final float onNavigationEvent(pin pinVar) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pinVar, "");
        float fOnNavigationEvent = CipherSuiteCompanionORDER_BY_NAME1.onNavigationEvent(pinVar);
        int i4 = onWarmupCompleted + 87;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return fOnNavigationEvent;
    }

    @Override // o.t7ExternalSyntheticLambda0.onWarmupCompleted
    public t7ExternalSyntheticLambda0.onWarmupCompleted onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        t7ExternalSyntheticLambda0.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 119;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-721264188);
        Object obj = null;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i5 = onWarmupCompleted + 1;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-721264188, i, -1, "im.toss.tds.compose.component.compound.bottomcta.DefaultFontScaleReflowPolicy.resolve (TdsBottomCtaV1.kt:446)");
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-721264188, i, -1, "im.toss.tds.compose.component.compound.bottomcta.DefaultFontScaleReflowPolicy.resolve (TdsBottomCtaV1.kt:446)");
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.bottomcta.DefaultFontScaleReflowPolicy$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2) {
                    int i6 = 2 % 2;
                    int i7 = onNavigationEvent + 21;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    Float fValueOf = Float.valueOf(t7.onExtraCallbackWithResult((pin) obj2));
                    int i9 = onExtraCallback + 1;
                    onNavigationEvent = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 95 / 0;
                    }
                    return fValueOf;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        if (getFixedPositions.onWarmupCompleted((Function1<? super pin, Float>) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 6)) {
            int i6 = onWarmupCompleted + 61;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            onwarmupcompletedOnExtraCallbackWithResult = t7ExternalSyntheticLambda0.onWarmupCompleted.Companion.onWarmupCompleted();
        } else {
            onwarmupcompletedOnExtraCallbackWithResult = t7ExternalSyntheticLambda0.onWarmupCompleted.Companion.onExtraCallbackWithResult();
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = onWarmupCompleted + 101;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return onwarmupcompletedOnExtraCallbackWithResult;
    }
}
