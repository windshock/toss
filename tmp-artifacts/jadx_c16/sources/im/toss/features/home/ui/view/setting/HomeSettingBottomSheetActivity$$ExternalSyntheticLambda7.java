package im.toss.features.home.ui.view.setting;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeSettingBottomSheetActivity$$ExternalSyntheticLambda7 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ HomeSettingBottomSheetActivity f$1;

    public /* synthetic */ HomeSettingBottomSheetActivity$$ExternalSyntheticLambda7(String str, HomeSettingBottomSheetActivity homeSettingBottomSheetActivity) {
        this.f$0 = str;
        this.f$1 = homeSettingBottomSheetActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = HomeSettingBottomSheetActivity.onExtraCallbackWithResult(this.f$0, this.f$1, (SetDetectableSize) obj);
        int i4 = onNavigationEvent + 31;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
