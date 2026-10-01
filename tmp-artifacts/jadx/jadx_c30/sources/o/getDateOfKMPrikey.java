package o;

import o.getOCSPAddress;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getDateOfKMPrikey extends getOCSPAddress {
    private final String onWarmupCompleted;

    public getDateOfKMPrikey(String str, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo2) {
        super(uST_TRANS_V2_SendReceiverInfo, uST_TRANS_V2_SendReceiverInfo2);
        this.onWarmupCompleted = str;
    }

    public String onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    @Override // o.getOCSPAddress
    public getOCSPAddress.onWarmupCompleted onWarmupCompleted() {
        return getOCSPAddress.onWarmupCompleted.Anchor;
    }
}
