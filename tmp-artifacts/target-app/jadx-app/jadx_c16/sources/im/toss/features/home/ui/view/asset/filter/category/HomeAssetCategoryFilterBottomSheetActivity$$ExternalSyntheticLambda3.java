package im.toss.features.home.ui.view.asset.filter.category;

import android.content.DialogInterface;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAssetCategoryFilterBottomSheetActivity$$ExternalSyntheticLambda3 implements DialogInterface.OnDismissListener {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ HomeAssetCategoryFilterBottomSheetActivity f$0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            HomeAssetCategoryFilterBottomSheetActivity.IAuthTabCallback(this.f$0, dialogInterface);
            int i3 = 44 / 0;
        } else {
            HomeAssetCategoryFilterBottomSheetActivity.IAuthTabCallback(this.f$0, dialogInterface);
        }
        int i4 = IAuthTabCallback + 121;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
    }
}
