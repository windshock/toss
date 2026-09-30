package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_mustRevalidate {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static final float onExtraCallbackWithResult = 0.5f;
    private static final float onWarmupCompleted = 0.099f;

    public static final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        float f = onWarmupCompleted;
        int i5 = i3 + 17;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public static final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        float f = onExtraCallbackWithResult;
        int i5 = i3 + 89;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }
}
