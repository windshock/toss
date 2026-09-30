package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class r8lambdaChKvIV5SLB3mGu6g_zHUM1FIZcE {
    private static int IAuthTabCallbackDefault = 1;
    private static int onTransact;
    private boolean IAuthTabCallback;
    private float onExtraCallback;
    private final int onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private float onWarmupCompleted;

    public r8lambdaChKvIV5SLB3mGu6g_zHUM1FIZcE(int i) {
        this.onExtraCallbackWithResult = i;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        boolean z = this.IAuthTabCallback;
        int i5 = i3 + 57;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final void onExtraCallbackWithResult(int i, float f, float f2) {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 91;
        int i5 = i4 % 128;
        IAuthTabCallbackDefault = i5;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i == 0) {
            this.onWarmupCompleted = f;
            this.onExtraCallback = f2;
            this.IAuthTabCallback = false;
            this.onNavigationEvent = false;
            return;
        }
        if (i != 1) {
            if (i == 2) {
                if (this.onNavigationEvent) {
                    return;
                }
                int i6 = i5 + 5;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                float fAbs = Math.abs(f - this.onWarmupCompleted);
                float fAbs2 = Math.abs(f2 - this.onExtraCallback);
                float f3 = this.onExtraCallbackWithResult;
                if (fAbs > f3 && fAbs > fAbs2) {
                    int i8 = onTransact + 9;
                    IAuthTabCallbackDefault = i8 % 128;
                    int i9 = i8 % 2;
                    this.IAuthTabCallback = true;
                    this.onNavigationEvent = true;
                    return;
                }
                if (fAbs2 > f3) {
                    int i10 = onTransact;
                    int i11 = i10 + 99;
                    IAuthTabCallbackDefault = i11 % 128;
                    int i12 = i11 % 2;
                    if (fAbs2 > fAbs) {
                        int i13 = i10 + 79;
                        IAuthTabCallbackDefault = i13 % 128;
                        int i14 = i13 % 2;
                        this.onNavigationEvent = true;
                        return;
                    }
                    return;
                }
                return;
            }
            int i15 = i3 + 23;
            IAuthTabCallbackDefault = i15 % 128;
            if (i15 % 2 == 0) {
                if (i != 2) {
                    return;
                }
            } else if (i != 3) {
                return;
            }
        }
        this.IAuthTabCallback = false;
        this.onNavigationEvent = false;
    }
}
