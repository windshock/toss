package im.toss.features.home.presentation.analysis;

import kotlin.jvm.functions.Function1;
import viva.republica.toss.widget.pager.SwipeControlViewPager;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstAnalysisActivity$$ExternalSyntheticLambda6 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ HomeDstAnalysisActivity f$0;
    public final /* synthetic */ SwipeControlViewPager f$1;

    public /* synthetic */ HomeDstAnalysisActivity$$ExternalSyntheticLambda6(HomeDstAnalysisActivity homeDstAnalysisActivity, SwipeControlViewPager swipeControlViewPager) {
        this.f$0 = homeDstAnalysisActivity;
        this.f$1 = swipeControlViewPager;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        HomeDstAnalysisActivity homeDstAnalysisActivity = this.f$0;
        if (i3 == 0) {
            return HomeDstAnalysisActivity.IAuthTabCallback(homeDstAnalysisActivity, this.f$1, ((Integer) obj).intValue());
        }
        HomeDstAnalysisActivity.IAuthTabCallback(homeDstAnalysisActivity, this.f$1, ((Integer) obj).intValue());
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
