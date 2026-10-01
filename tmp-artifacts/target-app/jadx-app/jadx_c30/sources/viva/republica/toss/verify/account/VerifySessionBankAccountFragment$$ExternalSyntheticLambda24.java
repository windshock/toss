package viva.republica.toss.verify.account;

import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class VerifySessionBankAccountFragment$$ExternalSyntheticLambda24 implements Function1 {
    public final /* synthetic */ VerifySessionBankAccountFragment f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ VerifySessionBankAccountFragment$$ExternalSyntheticLambda24(VerifySessionBankAccountFragment verifySessionBankAccountFragment, Function1 function1) {
        this.f$0 = verifySessionBankAccountFragment;
        this.f$1 = function1;
    }

    public final Object invoke(Object obj) {
        return VerifySessionBankAccountFragment.onWarmupCompleted(this.f$0, this.f$1, (SetDetectableSize) obj);
    }
}
