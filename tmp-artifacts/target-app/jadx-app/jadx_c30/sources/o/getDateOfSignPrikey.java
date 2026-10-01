package o;

import java.util.Objects;
import o.getOCSPAddress;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getDateOfSignPrikey extends getOCSPAddress {
    private final String onNavigationEvent;
    private final UST_TRANS_V2_ExportCert onWarmupCompleted;

    public getDateOfSignPrikey(UST_TRANS_V2_ExportCert uST_TRANS_V2_ExportCert, String str, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo2) {
        super(uST_TRANS_V2_SendReceiverInfo, uST_TRANS_V2_SendReceiverInfo2);
        Objects.requireNonNull(uST_TRANS_V2_ExportCert);
        this.onWarmupCompleted = uST_TRANS_V2_ExportCert;
        Objects.requireNonNull(str);
        this.onNavigationEvent = str;
    }

    public UST_TRANS_V2_ExportCert onExtraCallback() {
        return this.onWarmupCompleted;
    }

    public String IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    @Override // o.getOCSPAddress
    public getOCSPAddress.onWarmupCompleted onWarmupCompleted() {
        return getOCSPAddress.onWarmupCompleted.Comment;
    }
}
