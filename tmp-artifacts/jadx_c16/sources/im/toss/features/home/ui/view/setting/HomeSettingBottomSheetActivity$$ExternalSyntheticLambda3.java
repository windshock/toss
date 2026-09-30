package im.toss.features.home.ui.view.setting;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeSettingBottomSheetActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ HomeSettingBottomSheetActivity f$1;

    public /* synthetic */ HomeSettingBottomSheetActivity$$ExternalSyntheticLambda3(String str, HomeSettingBottomSheetActivity homeSettingBottomSheetActivity) {
        this.f$0 = str;
        this.f$1 = homeSettingBottomSheetActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = HomeSettingBottomSheetActivity.onExtraCallback(this.f$0, this.f$1, (SetDetectableSize) obj);
        int i4 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return unitOnExtraCallback;
    }
}
