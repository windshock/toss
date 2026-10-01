package im.toss.features.home.presentation.analysis;

import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import viva.republica.toss.widget.pager.SwipeControlViewPager;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstAnalysisActivity$$ExternalSyntheticLambda7 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ HomeDstAnalysisActivity f$0;
    public final /* synthetic */ SwipeControlViewPager f$1;

    public /* synthetic */ HomeDstAnalysisActivity$$ExternalSyntheticLambda7(HomeDstAnalysisActivity homeDstAnalysisActivity, SwipeControlViewPager swipeControlViewPager) {
        this.f$0 = homeDstAnalysisActivity;
        this.f$1 = swipeControlViewPager;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) HomeDstAnalysisActivity.onNavigationEvent(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{this.f$0, this.f$1, (SetDetectableSize) obj}, -422694094, 422694094, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
        int i4 = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
