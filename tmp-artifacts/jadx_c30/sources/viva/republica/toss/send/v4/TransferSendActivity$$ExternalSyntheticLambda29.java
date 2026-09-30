package viva.republica.toss.send.v4;

import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TransferSendActivity$$ExternalSyntheticLambda29 implements Function1 {
    public final /* synthetic */ TransferSendActivity f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ TransferSendActivity$$ExternalSyntheticLambda29(TransferSendActivity transferSendActivity, String str, String str2) {
        this.f$0 = transferSendActivity;
        this.f$1 = str;
        this.f$2 = str2;
    }

    public final Object invoke(Object obj) {
        return TransferSendActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
    }
}
