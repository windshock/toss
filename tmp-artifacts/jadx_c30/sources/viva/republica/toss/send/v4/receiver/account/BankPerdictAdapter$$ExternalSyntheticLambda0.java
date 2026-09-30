package viva.republica.toss.send.v4.receiver.account;

import kotlin.jvm.functions.Function2;
import o.AppMsgReceiver2;
import o.ReadableArrayBuilder;
import viva.republica.toss.network.model.transfer.PredictedBanks;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class BankPerdictAdapter$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ ReadableArrayBuilder f$0;

    public final Object invoke(Object obj, Object obj2) {
        return ReadableArrayBuilder.onExtraCallback(this.f$0, (AppMsgReceiver2) obj, (PredictedBanks.Bank) obj2);
    }
}
