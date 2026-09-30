package o;

import android.opengl.GLES20;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class isLayoutSuppressed {
    private final int onWarmupCompleted;

    public isLayoutSuppressed(int i2) {
        this.onWarmupCompleted = i2;
    }

    public void onExtraCallbackWithResult() {
        onWarmupCompleted(this.onWarmupCompleted);
    }

    public void onWarmupCompleted() {
        onWarmupCompleted(0);
    }

    private void onWarmupCompleted(int i2) {
        GLES20.glBindTexture(36197, i2);
    }
}
