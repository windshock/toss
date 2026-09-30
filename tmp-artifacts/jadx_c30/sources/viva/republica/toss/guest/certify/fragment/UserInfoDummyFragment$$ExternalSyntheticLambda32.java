package viva.republica.toss.guest.certify.fragment;

import android.content.DialogInterface;
import im.toss.splittarget.impl.fsm.AppStateImpl$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.CommonModule_setLeftEdgeTouchEnabled;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class UserInfoDummyFragment$$ExternalSyntheticLambda32 implements Function1 {
    public final /* synthetic */ CommonModule_setLeftEdgeTouchEnabled f$0;
    public final /* synthetic */ UserInfoDummyFragment f$1;
    public final /* synthetic */ Throwable f$2;

    public /* synthetic */ UserInfoDummyFragment$$ExternalSyntheticLambda32(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, UserInfoDummyFragment userInfoDummyFragment, Throwable th) {
        this.f$0 = commonModule_setLeftEdgeTouchEnabled;
        this.f$1 = userInfoDummyFragment;
        this.f$2 = th;
    }

    public final Object invoke(Object obj) {
        return (Unit) UserInfoDummyFragment.onNavigationEvent(new Object[]{this.f$0, this.f$1, this.f$2, (DialogInterface) obj}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1205069939, 1205069942);
    }
}
