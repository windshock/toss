package im.toss.features.home.ui.view.consumption;

import android.content.DialogInterface;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionCardNoticeMinorSchemeActivity$$ExternalSyntheticLambda4 implements DialogInterface.OnDismissListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ ConsumptionCardNoticeMinorSchemeActivity f$0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ConsumptionCardNoticeMinorSchemeActivity.onExtraCallback(this.f$0, dialogInterface);
        int i4 = IAuthTabCallback + 81;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
