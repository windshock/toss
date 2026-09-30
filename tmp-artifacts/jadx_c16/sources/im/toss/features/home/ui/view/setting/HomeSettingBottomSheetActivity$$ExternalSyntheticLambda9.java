package im.toss.features.home.ui.view.setting;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeSettingBottomSheetActivity$$ExternalSyntheticLambda9 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ HomeSettingBottomSheetActivity f$2;

    public /* synthetic */ HomeSettingBottomSheetActivity$$ExternalSyntheticLambda9(String str, String str2, HomeSettingBottomSheetActivity homeSettingBottomSheetActivity) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = homeSettingBottomSheetActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = HomeSettingBottomSheetActivity.IAuthTabCallback(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i4 = onExtraCallback + 35;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
