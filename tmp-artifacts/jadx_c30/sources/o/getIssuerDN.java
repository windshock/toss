package o;

import o.getOCSPAddress;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getIssuerDN extends getOCSPAddress {
    public getIssuerDN(UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo2) {
        super(uST_TRANS_V2_SendReceiverInfo, uST_TRANS_V2_SendReceiverInfo2);
    }

    @Override // o.getOCSPAddress
    public getOCSPAddress.onWarmupCompleted onWarmupCompleted() {
        return getOCSPAddress.onWarmupCompleted.BlockEnd;
    }
}
