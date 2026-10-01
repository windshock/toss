package im.toss.devtool.sharedpref.presentation;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SharedPrefStoreViewModel_HiltModules$KeyModule {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public static boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return true;
    }
}
