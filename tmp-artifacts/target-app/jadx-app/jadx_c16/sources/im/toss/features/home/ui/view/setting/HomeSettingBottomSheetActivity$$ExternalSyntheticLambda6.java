package im.toss.features.home.ui.view.setting;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeSettingBottomSheetActivity$$ExternalSyntheticLambda6 implements View.OnClickListener {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ HomeSettingBottomSheetActivity f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ HomeSettingBottomSheetActivity$$ExternalSyntheticLambda6(HomeSettingBottomSheetActivity homeSettingBottomSheetActivity, String str) {
        this.f$0 = homeSettingBottomSheetActivity;
        this.f$1 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            HomeSettingBottomSheetActivity.onNavigationEvent(this.f$0, this.f$1, view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        HomeSettingBottomSheetActivity.onNavigationEvent(this.f$0, this.f$1, view);
        int i3 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }
}
