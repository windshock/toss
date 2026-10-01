package im.toss.features.edoc;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.CommonModule_setLeftEdgeTouchEnabled;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocDocCodeInfo;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocIssueSchemeActivity$$ExternalSyntheticLambda25 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ EDocDocCodeInfo f$0;
    public final /* synthetic */ EDocIssueSchemeActivity f$1;

    public /* synthetic */ EDocIssueSchemeActivity$$ExternalSyntheticLambda25(EDocDocCodeInfo eDocDocCodeInfo, EDocIssueSchemeActivity eDocIssueSchemeActivity) {
        this.f$0 = eDocDocCodeInfo;
        this.f$1 = eDocIssueSchemeActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = EDocIssueSchemeActivity.onNavigationEvent(this.f$0, this.f$1, (CommonModule_setLeftEdgeTouchEnabled) obj);
        int i4 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
