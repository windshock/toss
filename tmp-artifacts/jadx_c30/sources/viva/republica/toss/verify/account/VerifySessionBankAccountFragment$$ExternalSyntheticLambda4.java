package viva.republica.toss.verify.account;

import android.content.DialogInterface;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class VerifySessionBankAccountFragment$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ Throwable f$0;
    public final /* synthetic */ VerifySessionBankAccountFragment f$1;

    public /* synthetic */ VerifySessionBankAccountFragment$$ExternalSyntheticLambda4(Throwable th, VerifySessionBankAccountFragment verifySessionBankAccountFragment) {
        this.f$0 = th;
        this.f$1 = verifySessionBankAccountFragment;
    }

    public final Object invoke(Object obj) {
        return VerifySessionBankAccountFragment.onNavigationEvent(this.f$0, this.f$1, (DialogInterface) obj);
    }
}
