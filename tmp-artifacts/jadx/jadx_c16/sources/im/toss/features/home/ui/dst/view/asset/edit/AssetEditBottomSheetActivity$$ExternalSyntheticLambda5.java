package im.toss.features.home.ui.dst.view.asset.edit;

import android.content.DialogInterface;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetEditBottomSheetActivity$$ExternalSyntheticLambda5 implements DialogInterface.OnDismissListener {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ AssetEditBottomSheetActivity f$0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            AssetEditBottomSheetActivity.IAuthTabCallback(this.f$0, dialogInterface);
            throw null;
        }
        AssetEditBottomSheetActivity.IAuthTabCallback(this.f$0, dialogInterface);
        int i3 = onNavigationEvent + 83;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }
}
