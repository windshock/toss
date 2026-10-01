package im.toss.di;

import im.toss.R;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class LauncherIconModule {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    public static final LauncherIconModule onExtraCallbackWithResult = new LauncherIconModule();
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onNavigationEvent + 63;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private LauncherIconModule() {
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int i3 = R.mipmap.ic_launcher_round;
            obj.hashCode();
            throw null;
        }
        int i4 = R.mipmap.ic_launcher_round;
        int i5 = onExtraCallback + 123;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }
}
