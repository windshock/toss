package im.toss.features.home.ui.view.asset.mydata;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MydataAssetAddBottomSheetSchemeActivity$$ExternalSyntheticLambda2 implements View.OnClickListener {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ MydataAssetAddBottomSheetSchemeActivity f$0;
    public final /* synthetic */ MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback f$1;

    public /* synthetic */ MydataAssetAddBottomSheetSchemeActivity$$ExternalSyntheticLambda2(MydataAssetAddBottomSheetSchemeActivity mydataAssetAddBottomSheetSchemeActivity, MydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback mydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback) {
        this.f$0 = mydataAssetAddBottomSheetSchemeActivity;
        this.f$1 = mydataAssetAddBottomSheetSchemeActivity$IAuthTabCallback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        MydataAssetAddBottomSheetSchemeActivity mydataAssetAddBottomSheetSchemeActivity = this.f$0;
        if (i3 == 0) {
            MydataAssetAddBottomSheetSchemeActivity.IAuthTabCallback(mydataAssetAddBottomSheetSchemeActivity, this.f$1, view);
            return;
        }
        MydataAssetAddBottomSheetSchemeActivity.IAuthTabCallback(mydataAssetAddBottomSheetSchemeActivity, this.f$1, view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
