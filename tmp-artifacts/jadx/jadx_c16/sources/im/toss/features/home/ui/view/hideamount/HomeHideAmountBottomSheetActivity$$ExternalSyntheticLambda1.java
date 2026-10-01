package im.toss.features.home.ui.view.hideamount;

import java.util.List;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeHideAmountBottomSheetActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ List f$0;
    public final /* synthetic */ HomeHideAmountBottomSheetActivity f$1;

    public /* synthetic */ HomeHideAmountBottomSheetActivity$$ExternalSyntheticLambda1(List list, HomeHideAmountBottomSheetActivity homeHideAmountBottomSheetActivity) {
        this.f$0 = list;
        this.f$1 = homeHideAmountBottomSheetActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        List list = this.f$0;
        if (i3 == 0) {
            return HomeHideAmountBottomSheetActivity.onExtraCallback(list, this.f$1, (SetDetectableSize) obj);
        }
        HomeHideAmountBottomSheetActivity.onExtraCallback(list, this.f$1, (SetDetectableSize) obj);
        throw null;
    }
}
