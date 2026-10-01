package viva.republica.toss.guest.certify.guardian;

import kotlin.jvm.functions.Function1;
import o.getTurboModuleRegistry;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class GuardianSimpleInfoFragment$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ GuardianSimpleInfoFragment f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ GuardianSimpleInfoFragment$$ExternalSyntheticLambda1(GuardianSimpleInfoFragment guardianSimpleInfoFragment, String str) {
        this.f$0 = guardianSimpleInfoFragment;
        this.f$1 = str;
    }

    public final Object invoke(Object obj) {
        return GuardianSimpleInfoFragment.onWarmupCompleted(this.f$0, this.f$1, (getTurboModuleRegistry) obj);
    }
}
