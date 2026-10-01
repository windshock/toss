package im.toss.features.kyc.activities;

import android.view.View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycTestActivity$$ExternalSyntheticLambda15 implements View.OnClickListener {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ TdsListRowV1View f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KycTestActivity.onExtraCallbackWithResult(this.f$0, view);
        int i4 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
