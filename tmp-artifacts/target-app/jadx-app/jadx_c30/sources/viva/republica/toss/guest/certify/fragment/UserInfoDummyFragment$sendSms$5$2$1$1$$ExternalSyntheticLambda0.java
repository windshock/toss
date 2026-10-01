package viva.republica.toss.guest.certify.fragment;

import im.toss.network.throwable.TossApiCallException;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import viva.republica.toss.guest.certify.fragment.UserInfoDummyFragment;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class UserInfoDummyFragment$sendSms$5$2$1$1$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ UserInfoDummyFragment f$0;
    public final /* synthetic */ TossApiCallException.ApiError f$1;

    public /* synthetic */ UserInfoDummyFragment$sendSms$5$2$1$1$$ExternalSyntheticLambda0(UserInfoDummyFragment userInfoDummyFragment, TossApiCallException.ApiError apiError) {
        this.f$0 = userInfoDummyFragment;
        this.f$1 = apiError;
    }

    public final Object invoke(Object obj) {
        return UserInfoDummyFragment.IAuthTabCallback_Parcel.onWarmupCompleted(this.f$0, this.f$1, (SetDetectableSize) obj);
    }
}
