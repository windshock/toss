package o;

import android.opengl.Matrix;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class DrawerKtExternalSyntheticLambda21 {
    private boolean IAuthTabCallback;
    private final float[] onWarmupCompleted = new float[16];
    private final float[] onExtraCallbackWithResult = new float[16];
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda26<float[]> onExtraCallback = new TextFieldDecoratorModifierNodeExternalSyntheticLambda26<>();

    public void onExtraCallbackWithResult(long j, float[] fArr) {
        this.onExtraCallback.onWarmupCompleted(j, fArr);
    }

    public void onWarmupCompleted() {
        this.onExtraCallback.onNavigationEvent();
        this.IAuthTabCallback = false;
    }

    public boolean onExtraCallback(float[] fArr, long j) {
        float[] fArrOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult(j);
        if (fArrOnExtraCallbackWithResult == null) {
            return false;
        }
        onExtraCallbackWithResult(this.onExtraCallbackWithResult, fArrOnExtraCallbackWithResult);
        if (!this.IAuthTabCallback) {
            IAuthTabCallback(this.onWarmupCompleted, this.onExtraCallbackWithResult);
            this.IAuthTabCallback = true;
        }
        Matrix.multiplyMM(fArr, 0, this.onWarmupCompleted, 0, this.onExtraCallbackWithResult, 0);
        return true;
    }

    public static void IAuthTabCallback(float[] fArr, float[] fArr2) {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onExtraCallback(fArr);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        float f3 = fArr2[10] / fSqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3;
    }

    private static void onExtraCallbackWithResult(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = -fArr2[1];
        float f3 = -fArr2[2];
        float length = Matrix.length(f, f2, f3);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
        } else {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onExtraCallback(fArr);
        }
    }
}
