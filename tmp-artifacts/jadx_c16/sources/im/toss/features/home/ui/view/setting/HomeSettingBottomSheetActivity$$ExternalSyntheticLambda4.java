package im.toss.features.home.ui.view.setting;

import android.view.View;
import com.horcrux.svg.SvgPackage;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeSettingBottomSheetActivity$$ExternalSyntheticLambda4 implements View.OnClickListener {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ HomeSettingBottomSheetActivity f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ HomeSettingBottomSheetActivity$$ExternalSyntheticLambda4(HomeSettingBottomSheetActivity homeSettingBottomSheetActivity, String str) {
        this.f$0 = homeSettingBottomSheetActivity;
        this.f$1 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        HomeSettingBottomSheetActivity.onExtraCallbackWithResult(-1078577444, new Object[]{this.f$0, this.f$1, view}, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), 1078577445, SvgPackage.21.onExtraCallbackWithResult());
        int i4 = onExtraCallback + 5;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
