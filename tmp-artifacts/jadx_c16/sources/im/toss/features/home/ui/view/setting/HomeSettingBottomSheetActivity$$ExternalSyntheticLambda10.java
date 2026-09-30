package im.toss.features.home.ui.view.setting;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeSettingBottomSheetActivity$$ExternalSyntheticLambda10 implements View.OnClickListener {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ HomeSettingBottomSheetActivity f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ HomeSettingBottomSheetActivity$$ExternalSyntheticLambda10(HomeSettingBottomSheetActivity homeSettingBottomSheetActivity, String str, String str2) {
        this.f$0 = homeSettingBottomSheetActivity;
        this.f$1 = str;
        this.f$2 = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        HomeSettingBottomSheetActivity homeSettingBottomSheetActivity = this.f$0;
        if (i3 == 0) {
            HomeSettingBottomSheetActivity.onExtraCallback(homeSettingBottomSheetActivity, this.f$1, this.f$2, view);
            return;
        }
        HomeSettingBottomSheetActivity.onExtraCallback(homeSettingBottomSheetActivity, this.f$1, this.f$2, view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
