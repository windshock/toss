package viva.republica.toss.guest.certify.verify;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import o.JsonReaderEmptyEOFException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class SmsVerificationFragment$$ExternalSyntheticLambda19 implements Function0 {
    public final /* synthetic */ SmsVerificationFragment f$0;
    public final /* synthetic */ Context f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ JsonReaderEmptyEOFException f$3;

    public /* synthetic */ SmsVerificationFragment$$ExternalSyntheticLambda19(SmsVerificationFragment smsVerificationFragment, Context context, long j, JsonReaderEmptyEOFException jsonReaderEmptyEOFException) {
        this.f$0 = smsVerificationFragment;
        this.f$1 = context;
        this.f$2 = j;
        this.f$3 = jsonReaderEmptyEOFException;
    }

    public final Object invoke() {
        return SmsVerificationFragment.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3);
    }
}
