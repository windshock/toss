package viva.republica.toss.tossmobile;

import gatewayprotocol.v1.AdResponseKtKt;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.RedBoxDialogSurfaceDelegate;
import o.findResAndMsg;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TossMobileCertificationHelper$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ findResAndMsg f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ TossMobileCertificationHelper$$ExternalSyntheticLambda4(findResAndMsg findresandmsg, Function1 function1, Function1 function12) {
        this.f$0 = findresandmsg;
        this.f$1 = function1;
        this.f$2 = function12;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object[] objArr = {this.f$0, this.f$1, this.f$2, (PrivateKey) obj, (X509Certificate[]) obj2};
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        return (Unit) RedBoxDialogSurfaceDelegate.onWarmupCompleted(AdResponseKtKt.IAuthTabCallback(), 1944282090, AdResponseKtKt.IAuthTabCallback(), -1944282086, iIAuthTabCallback, iIAuthTabCallback2, objArr);
    }
}
