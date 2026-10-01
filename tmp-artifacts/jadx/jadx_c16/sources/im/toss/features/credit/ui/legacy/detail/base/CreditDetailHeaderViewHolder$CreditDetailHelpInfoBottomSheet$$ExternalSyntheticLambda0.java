package im.toss.features.credit.ui.legacy.detail.base;

import android.view.View;
import im.toss.features.credit.ui.legacy.detail.base.CreditDetailHeaderViewHolder;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditDetailHeaderViewHolder$CreditDetailHelpInfoBottomSheet$$ExternalSyntheticLambda0 implements View.OnClickListener {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ CreditDetailHeaderViewHolder.CreditDetailHelpInfoBottomSheet f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            CreditDetailHeaderViewHolder.CreditDetailHelpInfoBottomSheet.onNavigationEvent(this.f$0, view);
            throw null;
        }
        CreditDetailHeaderViewHolder.CreditDetailHelpInfoBottomSheet.onNavigationEvent(this.f$0, view);
        int i3 = onNavigationEvent + 69;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 86 / 0;
        }
    }
}
