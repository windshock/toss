package viva.republica.toss.guest.certify.verify;

import android.content.Context;
import o.JsonReaderEmptyEOFException;
import o.fillInStackTrace;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class SmsVerificationFragment$$ExternalSyntheticLambda3 implements fillInStackTrace {
    public final /* synthetic */ SmsVerificationFragment f$0;
    public final /* synthetic */ Context f$1;
    public final /* synthetic */ long f$2;

    public /* synthetic */ SmsVerificationFragment$$ExternalSyntheticLambda3(SmsVerificationFragment smsVerificationFragment, Context context, long j) {
        this.f$0 = smsVerificationFragment;
        this.f$1 = context;
        this.f$2 = j;
    }

    public final void subscribe(JsonReaderEmptyEOFException jsonReaderEmptyEOFException) {
        SmsVerificationFragment.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, jsonReaderEmptyEOFException);
    }
}
