package o;

import o.Cert;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class UST_TRANS_V2_IsReceiverConnected extends getAuthorityInformationAccess {
    public UST_TRANS_V2_IsReceiverConnected(String str, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo2) {
        super(str, uST_TRANS_V2_SendReceiverInfo, uST_TRANS_V2_SendReceiverInfo2);
        if (str == null) {
            throw new NullPointerException("anchor is not specified for alias");
        }
    }

    @Override // o.Cert
    public Cert.onNavigationEvent onExtraCallback() {
        return Cert.onNavigationEvent.Alias;
    }
}
