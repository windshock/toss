package o;

import o.Rmenu;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getMediaContentView {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final getMediaContentView onWarmupCompleted = new getMediaContentView();

    static {
        int i = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private getMediaContentView() {
    }

    public final getMainView IAuthTabCallback(double d, double d2) {
        int i = 2 % 2;
        getMainView getmainview = new getMainView(new Rmenu.onNavigationEvent(d, d2));
        int i2 = onExtraCallback + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return getmainview;
    }
}
