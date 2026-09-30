package im.toss.features.home.ui.view.hideamount;

import android.content.DialogInterface;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeHideAmountBottomSheetActivity$$ExternalSyntheticLambda2 implements DialogInterface.OnDismissListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ HomeHideAmountBottomSheetActivity f$0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        HomeHideAmountBottomSheetActivity.onExtraCallback(this.f$0, dialogInterface);
        int i4 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
