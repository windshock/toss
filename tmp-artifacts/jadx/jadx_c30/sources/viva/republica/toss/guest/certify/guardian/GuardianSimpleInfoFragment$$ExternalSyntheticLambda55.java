package viva.republica.toss.guest.certify.guardian;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class GuardianSimpleInfoFragment$$ExternalSyntheticLambda55 implements Runnable {
    public final /* synthetic */ GuardianSimpleInfoFragment f$0;
    public final /* synthetic */ Function0 f$1;

    public /* synthetic */ GuardianSimpleInfoFragment$$ExternalSyntheticLambda55(GuardianSimpleInfoFragment guardianSimpleInfoFragment, Function0 function0) {
        this.f$0 = guardianSimpleInfoFragment;
        this.f$1 = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GuardianSimpleInfoFragment.onWarmupCompleted(this.f$0, this.f$1);
    }
}
