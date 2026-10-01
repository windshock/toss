package viva.republica.toss.guest.certify;

import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import viva.republica.toss.guest.certify.CertifyGuestViewModel;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class CertifyGuestViewModel$sendSmsForOverseasKorean$1$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ CertifyGuestViewModel f$0;
    public final /* synthetic */ Throwable f$1;

    public /* synthetic */ CertifyGuestViewModel$sendSmsForOverseasKorean$1$$ExternalSyntheticLambda0(CertifyGuestViewModel certifyGuestViewModel, Throwable th) {
        this.f$0 = certifyGuestViewModel;
        this.f$1 = th;
    }

    public final Object invoke(Object obj) {
        return CertifyGuestViewModel.IAuthTabCallback_Parcel.onWarmupCompleted(this.f$0, this.f$1, (SetDetectableSize) obj);
    }
}
