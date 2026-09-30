package im.toss.features.cardrecommend.test.ui.funnel;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.forceDomainCheck;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardRecommendTestFunnelListActivity$$ExternalSyntheticLambda11 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ CardRecommendTestFunnelListActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
        Unit unit = (Unit) CardRecommendTestFunnelListActivity.onWarmupCompleted(-101511423, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 101511428, objArr, forceDomainCheck.IAuthTabCallback());
        int i4 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
