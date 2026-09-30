package im.toss.devtool.runtime.ui.scheme.history;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SchemeHistoryViewModel_HiltModules$KeyModule {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = ((i3 | 11) << 1) - (i3 ^ 11);
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }
}
