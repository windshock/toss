package im.toss.features.home.ui.view.setting;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeSettingBottomSheetActivity$$ExternalSyntheticLambda13 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ HomeSettingBottomSheetActivity f$1;

    public /* synthetic */ HomeSettingBottomSheetActivity$$ExternalSyntheticLambda13(String str, HomeSettingBottomSheetActivity homeSettingBottomSheetActivity) {
        this.f$0 = str;
        this.f$1 = homeSettingBottomSheetActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f$0;
        if (i3 == 0) {
            return HomeSettingBottomSheetActivity.onWarmupCompleted(str, this.f$1, (SetDetectableSize) obj);
        }
        Unit unitOnWarmupCompleted = HomeSettingBottomSheetActivity.onWarmupCompleted(str, this.f$1, (SetDetectableSize) obj);
        int i4 = 68 / 0;
        return unitOnWarmupCompleted;
    }
}
