package im.toss.features.credit.ui.legacy.detail.base;

import android.view.View;
import im.toss.features.credit.ui.legacy.detail.base.CreditDetailHeaderViewHolder;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditDetailHeaderViewHolder$CreditDetailHelpInfoBottomSheet$$ExternalSyntheticLambda2 implements View.OnClickListener {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ CreditDetailHeaderViewHolder.CreditDetailHelpInfoBottomSheet f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CreditDetailHeaderViewHolder.CreditDetailHelpInfoBottomSheet.IAuthTabCallback(this.f$0, view);
        int i4 = onExtraCallback + 83;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
