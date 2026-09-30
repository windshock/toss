package viva.republica.toss.dataprovider.scraping.bank;

import im.toss.network.model.BaseApiResponse;
import kotlin.jvm.functions.Function1;
import o.verifySignatureValue;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class MissingPieceManager$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ verifySignatureValue.IAuthTabCallback f$0;

    public final Object invoke(Object obj) {
        return verifySignatureValue.onWarmupCompleted(this.f$0, (BaseApiResponse) obj);
    }
}
