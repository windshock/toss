package viva.republica.toss.util.databinding;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import o.enableLayoutAnimationsOnAndroid;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TossBindingAdapterKt$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ SwipeRefreshLayout f$0;
    public final /* synthetic */ Boolean f$1;

    public /* synthetic */ TossBindingAdapterKt$$ExternalSyntheticLambda0(SwipeRefreshLayout swipeRefreshLayout, Boolean bool) {
        this.f$0 = swipeRefreshLayout;
        this.f$1 = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        enableLayoutAnimationsOnAndroid.onWarmupCompleted(this.f$0, this.f$1);
    }
}
