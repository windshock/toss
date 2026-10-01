package o;

import java.nio.FloatBuffer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class setChildImportantForAccessibilityInternal extends setClipToPadding {
    private int IAuthTabCallback;
    private final float[] onExtraCallback = setScrollState.onExtraCallbackWithResult(scrollByInternal.onExtraCallbackWithResult);

    public abstract void onExtraCallbackWithResult();

    public abstract int onNavigationEvent();

    public abstract FloatBuffer onWarmupCompleted();

    public final float[] IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public int asInterface() {
        return onNavigationEvent() << 2;
    }

    public int onTransact() {
        return onWarmupCompleted().limit() / onNavigationEvent();
    }

    public final int onExtraCallback() {
        return this.IAuthTabCallback;
    }
}
