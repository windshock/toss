package im.toss.features.home.presentation.analysis;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import viva.republica.toss.widget.pager.SwipeControlViewPager;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstAnalysisActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ Ref.BooleanRef f$0;
    public final /* synthetic */ HomeDstAnalysisActivity f$1;
    public final /* synthetic */ SwipeControlViewPager f$2;

    public /* synthetic */ HomeDstAnalysisActivity$$ExternalSyntheticLambda4(Ref.BooleanRef booleanRef, HomeDstAnalysisActivity homeDstAnalysisActivity, SwipeControlViewPager swipeControlViewPager) {
        this.f$0 = booleanRef;
        this.f$1 = homeDstAnalysisActivity;
        this.f$2 = swipeControlViewPager;
    }

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallbackWithResult = HomeDstAnalysisActivity.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, ((Integer) obj).intValue());
            int i3 = 3 / 0;
        } else {
            unitOnExtraCallbackWithResult = HomeDstAnalysisActivity.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, ((Integer) obj).intValue());
        }
        int i4 = IAuthTabCallback + 27;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
