package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class setCreativeDebuggerEnabled<T> {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final T onExtraCallback;

    public abstract void onExtraCallbackWithResult(@NotNull isCreativeDebuggerEnabled iscreativedebuggerenabled, float f);

    public abstract Float onWarmupCompleted(@NotNull isCreativeDebuggerEnabled iscreativedebuggerenabled);

    public setCreativeDebuggerEnabled(T t) {
        this.onExtraCallback = t;
    }

    public final T ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 101;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        T t = this.onExtraCallback;
        int i5 = i2 + 23;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
        return t;
    }
}
