package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class atLeastOneValueMatch {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final putStringIfValid onNavigationEvent(long j, long j2, long j3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        boolean z;
        boolean z2;
        int i3 = 2 % 2;
        long jIAuthTabCallbackDefault = (i2 & 2) != 0 ? setByteOrder.Companion.IAuthTabCallbackDefault() : j2;
        long jIAuthTabCallbackDefault2 = (i2 & 4) != 0 ? setByteOrder.Companion.IAuthTabCallbackDefault() : j3;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1509980748, i, -1, "im.toss.tds.compose.component.compound.agreement.v4.badge.rememberTdsAgreementV4BadgeState (TdsAgreementV4BadgeState.kt:50)");
        }
        boolean z3 = true;
        if ((((i & 14) ^ 6) <= 4 || !cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(j)) && (i & 6) != 4) {
            int i4 = IAuthTabCallback + 55;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        } else {
            z = true;
        }
        if ((((i & 112) ^ 48) <= 32 || !cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(jIAuthTabCallbackDefault)) && (i & 48) != 32) {
            z2 = false;
        } else {
            int i6 = onWarmupCompleted + 21;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            z2 = true;
        }
        if ((((i & 896) ^ 384) <= 256 || !cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(jIAuthTabCallbackDefault2)) && (i & 384) != 256) {
            z3 = false;
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(z | z2 | z3)) {
            int i8 = onWarmupCompleted + 65;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 == 0) {
                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                throw null;
            }
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new explode(j, jIAuthTabCallbackDefault, jIAuthTabCallbackDefault2, null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                int i9 = IAuthTabCallback + 125;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 3 / 5;
                }
            }
        }
        explode explodeVar = (explode) objOnMinimized;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return explodeVar;
    }
}
