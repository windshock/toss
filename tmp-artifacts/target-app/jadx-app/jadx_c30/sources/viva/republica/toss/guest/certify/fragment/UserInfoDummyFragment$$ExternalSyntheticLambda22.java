package viva.republica.toss.guest.certify.fragment;

import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.onPreemption;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class UserInfoDummyFragment$$ExternalSyntheticLambda22 implements Function1 {
    public final /* synthetic */ UserInfoDummyFragment f$0;
    public final /* synthetic */ onPreemption f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ UserInfoDummyFragment$$ExternalSyntheticLambda22(UserInfoDummyFragment userInfoDummyFragment, onPreemption onpreemption, String str) {
        this.f$0 = userInfoDummyFragment;
        this.f$1 = onpreemption;
        this.f$2 = str;
    }

    public final Object invoke(Object obj) {
        return UserInfoDummyFragment.onWarmupCompleted(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
    }
}
