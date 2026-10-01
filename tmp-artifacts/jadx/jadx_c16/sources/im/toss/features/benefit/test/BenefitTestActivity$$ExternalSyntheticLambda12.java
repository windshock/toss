package im.toss.features.benefit.test;

import android.content.DialogInterface;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitTestActivity$$ExternalSyntheticLambda12 implements DialogInterface.OnClickListener {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ BenefitTestActivity f$0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 65;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        BenefitTestActivity.IAuthTabCallback(this.f$0, dialogInterface, i);
        int i5 = onExtraCallback + 101;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }
}
