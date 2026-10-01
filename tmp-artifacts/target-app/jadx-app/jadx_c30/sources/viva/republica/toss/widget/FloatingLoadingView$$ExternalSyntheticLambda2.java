package viva.republica.toss.widget;

import o.deserializeDecimalCollection;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class FloatingLoadingView$$ExternalSyntheticLambda2 implements deserializeDecimalCollection {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ FloatingLoadingView f$0;

    public final void run() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            FloatingLoadingView.onExtraCallbackWithResult(this.f$0);
            throw null;
        }
        FloatingLoadingView.onExtraCallbackWithResult(this.f$0);
        int i3 = onWarmupCompleted + 27;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 90 / 0;
        }
    }
}
