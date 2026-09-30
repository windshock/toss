package im.toss.features.cardrecommend.test.ui.funnel;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardRecommendTestFunnelListActivity$$ExternalSyntheticLambda3 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CardRecommendTestFunnelListActivity f$0;
    public final /* synthetic */ QuirksExternalSyntheticBackport0 f$1;
    public final /* synthetic */ List f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ CardRecommendTestFunnelListActivity$$ExternalSyntheticLambda3(CardRecommendTestFunnelListActivity cardRecommendTestFunnelListActivity, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, int i) {
        this.f$0 = cardRecommendTestFunnelListActivity;
        this.f$1 = quirksExternalSyntheticBackport0;
        this.f$2 = list;
        this.f$3 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        Unit unitOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallbackWithResult = CardRecommendTestFunnelListActivity.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, this.f$3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i3 = 20 / 0;
        } else {
            unitOnExtraCallbackWithResult = CardRecommendTestFunnelListActivity.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, this.f$3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        int i4 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
