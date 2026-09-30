package im.toss.feature.credit.ui.main.test;

import android.view.View;
import o.getTypedExportedConstants;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda3 implements View.OnClickListener {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ getTypedExportedConstants f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CreditTestActivity.onNavigationEvent(this.f$0, view);
        int i4 = IAuthTabCallback + 29;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
