package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class o8a {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    public static final o8a onWarmupCompleted = new o8a();

    static {
        int i = onExtraCallback + 89;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallbackWithResult(float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        if (f2 < 0.2f * f3 || f > f3 * 0.8f) {
            return false;
        }
        int i5 = i3 + 97;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public final boolean onNavigationEvent(float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 87;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (f >= 0.0f) {
            int i5 = i2 + 95;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (f2 <= f3) {
                return true;
            }
        }
        int i7 = i2 + 69;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    private o8a() {
    }

    public final boolean IAuthTabCallback(float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (onExtraCallbackWithResult(f, f2, f3) || onNavigationEvent(f, f2, f3)) {
            int i4 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = onExtraCallbackWithResult + 23;
        int i7 = i6 % 128;
        IAuthTabCallback = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 43;
        onExtraCallbackWithResult = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }
}
