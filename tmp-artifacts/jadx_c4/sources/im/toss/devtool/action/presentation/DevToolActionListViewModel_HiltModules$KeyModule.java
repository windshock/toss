package im.toss.devtool.action.presentation;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DevToolActionListViewModel_HiltModules$KeyModule {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = (((i2 & (-24)) | ((~i2) & 23)) - (~(-(-((i2 & 23) << 1))))) - 1;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 49;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
