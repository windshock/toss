package im.toss.features.home.ui.view.alarm;

import android.content.DialogInterface;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeMydataServiceAvailableActivity$$ExternalSyntheticLambda0 implements DialogInterface.OnDismissListener {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ HomeMydataServiceAvailableActivity f$0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            HomeMydataServiceAvailableActivity.onNavigationEvent(this.f$0, dialogInterface);
            int i3 = 43 / 0;
        } else {
            HomeMydataServiceAvailableActivity.onNavigationEvent(this.f$0, dialogInterface);
        }
        int i4 = IAuthTabCallback + 71;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
