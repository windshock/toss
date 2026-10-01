package im.toss.features.home.ui.view.hideamount;

import java.util.List;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeHideAmountViewModel$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ List f$0;
    public final /* synthetic */ HomeHideAmountViewModel f$1;

    public /* synthetic */ HomeHideAmountViewModel$$ExternalSyntheticLambda0(List list, HomeHideAmountViewModel homeHideAmountViewModel) {
        this.f$0 = list;
        this.f$1 = homeHideAmountViewModel;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        List list = this.f$0;
        if (i3 != 0) {
            return HomeHideAmountViewModel.onNavigationEvent(list, this.f$1, (SetDetectableSize) obj);
        }
        HomeHideAmountViewModel.onNavigationEvent(list, this.f$1, (SetDetectableSize) obj);
        throw null;
    }
}
