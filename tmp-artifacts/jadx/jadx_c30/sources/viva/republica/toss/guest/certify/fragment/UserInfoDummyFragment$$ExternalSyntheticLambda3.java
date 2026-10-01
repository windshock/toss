package viva.republica.toss.guest.certify.fragment;

import im.toss.features.verify.kakao.KakaoAuthenticateResponse;
import im.toss.splittarget.impl.fsm.AppStateImpl$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class UserInfoDummyFragment$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ UserInfoDummyFragment f$1;

    public /* synthetic */ UserInfoDummyFragment$$ExternalSyntheticLambda3(Function1 function1, UserInfoDummyFragment userInfoDummyFragment) {
        this.f$0 = function1;
        this.f$1 = userInfoDummyFragment;
    }

    public final Object invoke(Object obj) {
        return (Unit) UserInfoDummyFragment.onNavigationEvent(new Object[]{this.f$0, this.f$1, (KakaoAuthenticateResponse) obj}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 2063385729, -2063385715);
    }
}
