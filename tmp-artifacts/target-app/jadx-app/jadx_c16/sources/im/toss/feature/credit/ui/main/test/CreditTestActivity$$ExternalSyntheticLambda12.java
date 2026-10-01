package im.toss.feature.credit.ui.main.test;

import android.view.View;
import o.getTypedExportedConstants;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda12 implements View.OnClickListener {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ getTypedExportedConstants f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            CreditTestActivity.IAuthTabCallback(this.f$0, view);
            int i3 = 16 / 0;
        } else {
            CreditTestActivity.IAuthTabCallback(this.f$0, view);
        }
        int i4 = onNavigationEvent + 63;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
