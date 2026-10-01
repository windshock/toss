package im.toss.features.home.presentation.analysis;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import viva.republica.toss.widget.pager.SwipeControlViewPager;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstAnalysisActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ HomeDstAnalysisActivity f$0;
    public final /* synthetic */ SwipeControlViewPager f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ HomeDstAnalysisActivity$$ExternalSyntheticLambda2(HomeDstAnalysisActivity homeDstAnalysisActivity, SwipeControlViewPager swipeControlViewPager, int i) {
        this.f$0 = homeDstAnalysisActivity;
        this.f$1 = swipeControlViewPager;
        this.f$2 = i;
    }

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallbackWithResult = HomeDstAnalysisActivity.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
            int i3 = 19 / 0;
        } else {
            unitOnExtraCallbackWithResult = HomeDstAnalysisActivity.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
        }
        int i4 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
