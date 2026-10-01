package o;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class drawPrimaryProgress {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static final AppSetIdAndScope1 onExtraCallbackWithResult = ea10.onExtraCallbackWithResult(Class.forName("o.BaseRoundCornerProgressBar").getSimpleName());
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ AppSetIdAndScope1 onExtraCallback() {
        AppSetIdAndScope1 appSetIdAndScope1;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 95;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            appSetIdAndScope1 = onExtraCallbackWithResult;
            int i4 = 83 / 0;
        } else {
            appSetIdAndScope1 = onExtraCallbackWithResult;
        }
        int i5 = i2 + 33;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
        return appSetIdAndScope1;
    }

    static {
        int i = onNavigationEvent + 69;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
