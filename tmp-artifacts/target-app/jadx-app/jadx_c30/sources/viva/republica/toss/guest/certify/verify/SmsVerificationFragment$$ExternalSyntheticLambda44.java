package viva.republica.toss.guest.certify.verify;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class SmsVerificationFragment$$ExternalSyntheticLambda44 implements Function1 {
    public final /* synthetic */ SmsVerificationFragment f$0;
    public final /* synthetic */ Context f$1;

    public /* synthetic */ SmsVerificationFragment$$ExternalSyntheticLambda44(SmsVerificationFragment smsVerificationFragment, Context context) {
        this.f$0 = smsVerificationFragment;
        this.f$1 = context;
    }

    public final Object invoke(Object obj) {
        return SmsVerificationFragment.onWarmupCompleted(this.f$0, this.f$1, (Throwable) obj);
    }
}
