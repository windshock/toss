package o;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class isDecorView {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private static volatile IAuthTabCallback onExtraCallback = null;
    private static int onWarmupCompleted = 1;
    public static final isDecorView onNavigationEvent = new isDecorView();
    public static final int onExtraCallbackWithResult = 8;

    public interface IAuthTabCallback {
    }

    static {
        int i = IAuthTabCallback + 75;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 2 / 0;
        }
    }

    private isDecorView() {
    }

    public final IAuthTabCallback onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        IAuthTabCallback iAuthTabCallback = onExtraCallback;
        int i3 = asInterface + 45;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return iAuthTabCallback;
    }
}
