package o;

import o.getOCSPAddress;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getDateOfFile extends getOCSPAddress {
    private final String onWarmupCompleted;

    public getDateOfFile(String str, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo2) {
        super(uST_TRANS_V2_SendReceiverInfo, uST_TRANS_V2_SendReceiverInfo2);
        if (str == null) {
            throw new NullPointerException("alias is expected");
        }
        this.onWarmupCompleted = str;
    }

    public String onExtraCallback() {
        return this.onWarmupCompleted;
    }

    @Override // o.getOCSPAddress
    public getOCSPAddress.onWarmupCompleted onWarmupCompleted() {
        return getOCSPAddress.onWarmupCompleted.Alias;
    }
}
