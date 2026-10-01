package im.toss.features.home.ui.dst.view.card;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstCardTransactionsActivity$$ExternalSyntheticLambda0 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ HomeDstCardTransactionsActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            HomeDstCardTransactionsActivity.onNavigationEvent(this.f$0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        View viewOnNavigationEvent = HomeDstCardTransactionsActivity.onNavigationEvent(this.f$0);
        int i3 = onExtraCallback + 61;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return viewOnNavigationEvent;
    }
}
