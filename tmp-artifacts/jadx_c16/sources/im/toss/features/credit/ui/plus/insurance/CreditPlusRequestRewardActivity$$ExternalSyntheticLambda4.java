package im.toss.features.credit.ui.plus.insurance;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusRequestRewardActivity$$ExternalSyntheticLambda4 implements View.OnClickListener {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Function0 f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CreditPlusRequestRewardActivity.onWarmupCompleted(this.f$0, view);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
