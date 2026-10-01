package im.toss.features.credit.ui.plus.gift.send;

import android.view.View;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftCreateCardActivity$$ExternalSyntheticLambda4 implements View.OnClickListener {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ List f$0;
    public final /* synthetic */ CreditPlusGiftCreateCardActivity f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ TdsRoundLayout f$3;

    public /* synthetic */ CreditPlusGiftCreateCardActivity$$ExternalSyntheticLambda4(List list, CreditPlusGiftCreateCardActivity creditPlusGiftCreateCardActivity, int i, TdsRoundLayout tdsRoundLayout) {
        this.f$0 = list;
        this.f$1 = creditPlusGiftCreateCardActivity;
        this.f$2 = i;
        this.f$3 = tdsRoundLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            CreditPlusGiftCreateCardActivity.IAuthTabCallback(this.f$0, this.f$1, this.f$2, this.f$3, view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CreditPlusGiftCreateCardActivity.IAuthTabCallback(this.f$0, this.f$1, this.f$2, this.f$3, view);
        int i3 = onNavigationEvent + 31;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 22 / 0;
        }
    }
}
