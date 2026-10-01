package im.toss.features.home.presentation.bottomsheet;

import android.content.DialogInterface;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAccountBottomSheetSchemeActivity$$ExternalSyntheticLambda2 implements DialogInterface.OnDismissListener {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ HomeAccountBottomSheetSchemeActivity f$0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        HomeAccountBottomSheetSchemeActivity.IAuthTabCallback(this.f$0, dialogInterface);
        int i4 = onExtraCallback + 83;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
