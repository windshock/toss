package o;

import im.toss.di.TossApiServiceModule;
import im.toss.features.home.core.local.model.TransactionFilterLocal;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class isRenderReady implements captureStartValues<getAddPhoneContactDialog> {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final createAnimators<g1> onExtraCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getAddPhoneContactDialog getaddphonecontactdialogOnWarmupCompleted = onWarmupCompleted();
        int i4 = onNavigationEvent + 53;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return getaddphonecontactdialogOnWarmupCompleted;
    }

    public getAddPhoneContactDialog onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getAddPhoneContactDialog getaddphonecontactdialogOnWarmupCompleted = onWarmupCompleted((g1) this.onExtraCallback.get());
        int i4 = onNavigationEvent + 119;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return getaddphonecontactdialogOnWarmupCompleted;
        }
        throw null;
    }

    public static getAddPhoneContactDialog onWarmupCompleted(g1 g1Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {TossApiServiceModule.IAuthTabCallback, g1Var};
        if (i3 != 0) {
            return (getAddPhoneContactDialog) createAnimator.onNavigationEvent((getAddPhoneContactDialog) TossApiServiceModule.onExtraCallbackWithResult(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 708073920, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -708073913, objArr));
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
