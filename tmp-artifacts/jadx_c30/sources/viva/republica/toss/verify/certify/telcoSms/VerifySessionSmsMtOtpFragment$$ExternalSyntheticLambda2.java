package viva.republica.toss.verify.certify.telcoSms;

import android.content.DialogInterface;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class VerifySessionSmsMtOtpFragment$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ VerifySessionSmsMtOtpFragment f$0;
    public final /* synthetic */ Throwable f$1;

    public /* synthetic */ VerifySessionSmsMtOtpFragment$$ExternalSyntheticLambda2(VerifySessionSmsMtOtpFragment verifySessionSmsMtOtpFragment, Throwable th) {
        this.f$0 = verifySessionSmsMtOtpFragment;
        this.f$1 = th;
    }

    public final Object invoke(Object obj) {
        return VerifySessionSmsMtOtpFragment.IAuthTabCallback(this.f$0, this.f$1, (DialogInterface) obj);
    }
}
