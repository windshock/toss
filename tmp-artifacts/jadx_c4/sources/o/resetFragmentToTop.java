package o;

import im.toss.di.TossPayBarcodeModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class resetFragmentToTop implements captureStartValues<toolbarMenusUpdated> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final createAnimators<GeckoHubImp> onNavigationEvent;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent();
        }
        onNavigationEvent();
        throw null;
    }

    public toolbarMenusUpdated onNavigationEvent() {
        toolbarMenusUpdated toolbarmenusupdatedOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            toolbarmenusupdatedOnNavigationEvent = onNavigationEvent((GeckoHubImp) this.onNavigationEvent.get());
            int i3 = 16 / 0;
        } else {
            toolbarmenusupdatedOnNavigationEvent = onNavigationEvent((GeckoHubImp) this.onNavigationEvent.get());
        }
        int i4 = onExtraCallback + 21;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
        return toolbarmenusupdatedOnNavigationEvent;
    }

    public static toolbarMenusUpdated onNavigationEvent(GeckoHubImp geckoHubImp) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        toolbarMenusUpdated toolbarmenusupdatedOnExtraCallback = TossPayBarcodeModule.onExtraCallback.onExtraCallback(geckoHubImp);
        if (i3 != 0) {
            return (toolbarMenusUpdated) createAnimator.onNavigationEvent(toolbarmenusupdatedOnExtraCallback);
        }
        int i4 = 81 / 0;
        return (toolbarMenusUpdated) createAnimator.onNavigationEvent(toolbarmenusupdatedOnExtraCallback);
    }
}
