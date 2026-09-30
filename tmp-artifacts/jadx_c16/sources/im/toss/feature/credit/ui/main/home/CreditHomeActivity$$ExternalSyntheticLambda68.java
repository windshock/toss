package im.toss.feature.credit.ui.main.home;

import android.view.ViewTreeObserver;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditHomeActivity$$ExternalSyntheticLambda68 implements ViewTreeObserver.OnScrollChangedListener {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CreditHomeActivity f$0;

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CreditHomeActivity.extraCallbackWithResult(this.f$0);
        int i4 = onNavigationEvent + 75;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
