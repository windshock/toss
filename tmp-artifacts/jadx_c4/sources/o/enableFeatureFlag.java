package o;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableFeatureFlag {
    private static int asInterface = 1;
    private static int onWarmupCompleted;
    private final boolean IAuthTabCallback;
    private final int onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final int onNavigationEvent;

    public enableFeatureFlag(boolean z, int i, int i2, int i3) {
        this.IAuthTabCallback = z;
        this.onExtraCallback = i;
        this.onExtraCallbackWithResult = i2;
        this.onNavigationEvent = i3;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 19;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onExtraCallback;
        int i6 = i2 + 103;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = this.onNavigationEvent;
        int i6 = i3 + 71;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
