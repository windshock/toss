package im.toss.features.home.presentation.analysis;

import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstAnalysisActivity$$ExternalSyntheticLambda8 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ HomeDstAnalysisActivity f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ HomeDstAnalysisActivity$$ExternalSyntheticLambda8(int i, HomeDstAnalysisActivity homeDstAnalysisActivity, int i2) {
        this.f$0 = i;
        this.f$1 = homeDstAnalysisActivity;
        this.f$2 = i2;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.f$0;
        if (i3 == 0) {
            HomeDstAnalysisActivity homeDstAnalysisActivity = this.f$1;
            int i5 = this.f$2;
            Integer numValueOf = Integer.valueOf(i4);
            Integer numValueOf2 = Integer.valueOf(i5);
            int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
            int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
            return (Unit) HomeDstAnalysisActivity.onNavigationEvent(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), new Object[]{numValueOf, homeDstAnalysisActivity, numValueOf2, (SetDetectableSize) obj}, -98529568, 98529570, iIAuthTabCallback, iIAuthTabCallback2);
        }
        HomeDstAnalysisActivity homeDstAnalysisActivity2 = this.f$1;
        int i6 = this.f$2;
        Integer numValueOf3 = Integer.valueOf(i4);
        Integer numValueOf4 = Integer.valueOf(i6);
        int iIAuthTabCallback3 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback4 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
