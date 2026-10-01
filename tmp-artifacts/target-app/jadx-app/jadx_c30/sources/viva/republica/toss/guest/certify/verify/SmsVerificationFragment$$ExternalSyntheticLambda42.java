package viva.republica.toss.guest.certify.verify;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import o.showPop;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class SmsVerificationFragment$$ExternalSyntheticLambda42 implements Function1 {
    public final /* synthetic */ String f$0;
    public final /* synthetic */ SmsVerificationFragment f$1;
    public final /* synthetic */ Context f$2;

    public /* synthetic */ SmsVerificationFragment$$ExternalSyntheticLambda42(String str, SmsVerificationFragment smsVerificationFragment, Context context) {
        this.f$0 = str;
        this.f$1 = smsVerificationFragment;
        this.f$2 = context;
    }

    public final Object invoke(Object obj) {
        return SmsVerificationFragment.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, (showPop) obj);
    }
}
