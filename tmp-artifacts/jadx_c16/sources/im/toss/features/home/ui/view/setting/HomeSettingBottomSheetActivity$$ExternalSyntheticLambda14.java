package im.toss.features.home.ui.view.setting;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeSettingBottomSheetActivity$$ExternalSyntheticLambda14 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ HomeSettingBottomSheetActivity f$2;

    public /* synthetic */ HomeSettingBottomSheetActivity$$ExternalSyntheticLambda14(String str, String str2, HomeSettingBottomSheetActivity homeSettingBottomSheetActivity) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = homeSettingBottomSheetActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = HomeSettingBottomSheetActivity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i4 = IAuthTabCallback + 27;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
