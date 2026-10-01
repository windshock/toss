package im.toss.features.home.ui.view.lock;

import android.content.DialogInterface;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAppLockOfferBottomSheetActivity$$ExternalSyntheticLambda1 implements DialogInterface.OnDismissListener {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ HomeAppLockOfferBottomSheetActivity f$0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        HomeAppLockOfferBottomSheetActivity.IAuthTabCallback(this.f$0, dialogInterface);
        if (i3 == 0) {
            int i4 = 47 / 0;
        }
    }
}
