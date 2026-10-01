package im.toss.features.home.ui.view.asset.mydata;

import android.content.DialogInterface;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MydataAssetAddBottomSheetSchemeActivity$$ExternalSyntheticLambda1 implements DialogInterface.OnDismissListener {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ MydataAssetAddBottomSheetSchemeActivity f$0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        MydataAssetAddBottomSheetSchemeActivity.onExtraCallbackWithResult(this.f$0, dialogInterface);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
