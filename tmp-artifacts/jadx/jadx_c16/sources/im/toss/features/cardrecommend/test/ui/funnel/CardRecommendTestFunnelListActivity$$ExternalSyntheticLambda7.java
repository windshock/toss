package im.toss.features.cardrecommend.test.ui.funnel;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardRecommendTestFunnelListActivity$$ExternalSyntheticLambda7 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ CardRecommendTestFunnelListActivity f$0;
    public final /* synthetic */ QuirksExternalSyntheticBackport0 f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ CardRecommendTestFunnelListActivity$$ExternalSyntheticLambda7(CardRecommendTestFunnelListActivity cardRecommendTestFunnelListActivity, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i) {
        this.f$0 = cardRecommendTestFunnelListActivity;
        this.f$1 = quirksExternalSyntheticBackport0;
        this.f$2 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            CardRecommendTestFunnelListActivity.IAuthTabCallback(this.f$0, this.f$1, this.f$2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = CardRecommendTestFunnelListActivity.IAuthTabCallback(this.f$0, this.f$1, this.f$2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = IAuthTabCallback + 35;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }
}
