package im.toss.features.main.ui.shopping;

import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.ExtHubRVEngine;
import o.SetDetectableSize;
import viva.republica.toss.network.model.shopping.ToastV2Data;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TabBarBubbleHelper$$ExternalSyntheticLambda7 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ ExtHubRVEngine f$0;
    public final /* synthetic */ ToastV2Data f$1;
    public final /* synthetic */ Integer f$2;
    public final /* synthetic */ String f$3;

    public /* synthetic */ TabBarBubbleHelper$$ExternalSyntheticLambda7(ExtHubRVEngine extHubRVEngine, ToastV2Data toastV2Data, Integer num, String str) {
        this.f$0 = extHubRVEngine;
        this.f$1 = toastV2Data;
        this.f$2 = num;
        this.f$3 = str;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ExtHubRVEngine extHubRVEngine = this.f$0;
        if (i3 == 0) {
            Object[] objArr = {extHubRVEngine, this.f$1, this.f$2, this.f$3, (SetDetectableSize) obj};
            return (Unit) ExtHubRVEngine.onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -1646971601, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 1646971625, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), objArr);
        }
        Object[] objArr2 = {extHubRVEngine, this.f$1, this.f$2, this.f$3, (SetDetectableSize) obj};
        int i4 = 54 / 0;
        return (Unit) ExtHubRVEngine.onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -1646971601, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 1646971625, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), objArr2);
    }
}
