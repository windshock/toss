package im.toss.devtool.sharedpref.presentation;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SharedPrefEditViewModel_HiltModules$KeyModule {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public static boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 ^ 109;
        int i4 = -(-((i2 & 109) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        onExtraCallbackWithResult = i5 % 128;
        return i5 % 2 == 0;
    }
}
