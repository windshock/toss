package im.toss.features.credit.ui.legacy.detail.base;

import android.view.View;
import im.toss.features.credit.ui.legacy.detail.base.CreditDetailHeaderViewHolder;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditDetailHeaderViewHolder$CreditDetailHelpInfoBottomSheet$$ExternalSyntheticLambda1 implements View.OnClickListener {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CreditDetailHeaderViewHolder.CreditDetailHelpInfoBottomSheet f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditDetailHeaderViewHolder.CreditDetailHelpInfoBottomSheet.onExtraCallback(this.f$0, view);
        int i4 = onNavigationEvent + 101;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
    }
}
