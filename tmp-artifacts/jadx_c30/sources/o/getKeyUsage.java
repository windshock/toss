package o;

import o.getOCSPAddress;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getKeyUsage extends getOCSPAddress {
    private final getPublicKeyAlgorithmType onWarmupCompleted;

    public getKeyUsage(getPublicKeyAlgorithmType getpublickeyalgorithmtype, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo2) {
        super(uST_TRANS_V2_SendReceiverInfo, uST_TRANS_V2_SendReceiverInfo2);
        this.onWarmupCompleted = getpublickeyalgorithmtype;
    }

    public getPublicKeyAlgorithmType onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    @Override // o.getOCSPAddress
    public getOCSPAddress.onWarmupCompleted onWarmupCompleted() {
        return getOCSPAddress.onWarmupCompleted.Tag;
    }
}
