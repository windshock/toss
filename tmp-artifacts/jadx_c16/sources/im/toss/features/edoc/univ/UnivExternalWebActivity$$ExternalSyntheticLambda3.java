package im.toss.features.edoc.univ;

import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.getReactQueueConfiguration;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class UnivExternalWebActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ UnivExternalWebActivity f$1;

    public /* synthetic */ UnivExternalWebActivity$$ExternalSyntheticLambda3(Function0 function0, UnivExternalWebActivity univExternalWebActivity) {
        this.f$0 = function0;
        this.f$1 = univExternalWebActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1, (getReactQueueConfiguration) obj};
        Unit unit = (Unit) UnivExternalWebActivity.onExtraCallbackWithResult(602836875, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), objArr, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -602836874);
        int i4 = onExtraCallback + 43;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }
}
