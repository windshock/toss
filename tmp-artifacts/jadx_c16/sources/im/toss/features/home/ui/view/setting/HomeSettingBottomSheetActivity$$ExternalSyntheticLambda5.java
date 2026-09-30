package im.toss.features.home.ui.view.setting;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeSettingBottomSheetActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ HomeSettingBottomSheetActivity f$1;

    public /* synthetic */ HomeSettingBottomSheetActivity$$ExternalSyntheticLambda5(String str, HomeSettingBottomSheetActivity homeSettingBottomSheetActivity) {
        this.f$0 = str;
        this.f$1 = homeSettingBottomSheetActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            HomeSettingBottomSheetActivity.IAuthTabCallback(this.f$0, this.f$1, (SetDetectableSize) obj);
            throw null;
        }
        Unit unitIAuthTabCallback = HomeSettingBottomSheetActivity.IAuthTabCallback(this.f$0, this.f$1, (SetDetectableSize) obj);
        int i3 = onNavigationEvent + 11;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 45 / 0;
        }
        return unitIAuthTabCallback;
    }
}
