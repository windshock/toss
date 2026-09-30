package viva.republica.toss.guest.certify.verify;

import android.content.Context;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class SmsVerificationFragment$$ExternalSyntheticLambda22 implements Runnable {
    public final /* synthetic */ Throwable f$0;
    public final /* synthetic */ SmsVerificationFragment f$1;
    public final /* synthetic */ Context f$2;
    public final /* synthetic */ Throwable f$3;

    public /* synthetic */ SmsVerificationFragment$$ExternalSyntheticLambda22(Throwable th, SmsVerificationFragment smsVerificationFragment, Context context, Throwable th2) {
        this.f$0 = th;
        this.f$1 = smsVerificationFragment;
        this.f$2 = context;
        this.f$3 = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SmsVerificationFragment.IAuthTabCallback(this.f$0, this.f$1, this.f$2, this.f$3);
    }
}
