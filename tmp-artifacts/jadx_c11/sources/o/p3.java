package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class p3 {
    private static int IAuthTabCallbackStub = 1;
    private static int onWarmupCompleted;
    private boolean onExtraCallback;
    private boolean onNavigationEvent;
    private float onExtraCallbackWithResult = Float.MAX_VALUE;
    private float IAuthTabCallback = -3.4028235E38f;

    public final void IAuthTabCallback(float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 87;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallbackWithResult = f;
        int i5 = i2 + 107;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 95;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        float f = this.onExtraCallbackWithResult;
        int i5 = i2 + 119;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f = this.IAuthTabCallback;
        int i4 = i3 + 125;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    public final void onExtraCallbackWithResult(float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 67;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallback = f;
        if (i4 == 0) {
            int i5 = 79 / 0;
        }
        int i6 = i2 + 3;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback = z;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 61;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.onExtraCallback;
        int i4 = i2 + 13;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent = z;
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 5;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        boolean z = this.onNavigationEvent;
        int i5 = i3 + 73;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
