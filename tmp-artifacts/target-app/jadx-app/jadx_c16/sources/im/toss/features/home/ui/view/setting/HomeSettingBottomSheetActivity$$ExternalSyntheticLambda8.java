package im.toss.features.home.ui.view.setting;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeSettingBottomSheetActivity$$ExternalSyntheticLambda8 implements View.OnClickListener {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ HomeSettingBottomSheetActivity f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ HomeSettingBottomSheetActivity$$ExternalSyntheticLambda8(HomeSettingBottomSheetActivity homeSettingBottomSheetActivity, String str) {
        this.f$0 = homeSettingBottomSheetActivity;
        this.f$1 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            HomeSettingBottomSheetActivity.onWarmupCompleted(this.f$0, this.f$1, view);
            obj.hashCode();
            throw null;
        }
        HomeSettingBottomSheetActivity.onWarmupCompleted(this.f$0, this.f$1, view);
        int i3 = onWarmupCompleted + 107;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
