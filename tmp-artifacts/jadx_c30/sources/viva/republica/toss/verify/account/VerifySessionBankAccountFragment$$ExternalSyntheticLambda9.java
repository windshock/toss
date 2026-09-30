package viva.republica.toss.verify.account;

import android.content.DialogInterface;
import im.toss.network.throwable.TossApiCallException;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class VerifySessionBankAccountFragment$$ExternalSyntheticLambda9 implements Function1 {
    public final /* synthetic */ TossApiCallException.ApiError f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ VerifySessionBankAccountFragment f$2;

    public /* synthetic */ VerifySessionBankAccountFragment$$ExternalSyntheticLambda9(TossApiCallException.ApiError apiError, boolean z, VerifySessionBankAccountFragment verifySessionBankAccountFragment) {
        this.f$0 = apiError;
        this.f$1 = z;
        this.f$2 = verifySessionBankAccountFragment;
    }

    public final Object invoke(Object obj) {
        return VerifySessionBankAccountFragment.IAuthTabCallback(this.f$0, this.f$1, this.f$2, (DialogInterface) obj);
    }
}
