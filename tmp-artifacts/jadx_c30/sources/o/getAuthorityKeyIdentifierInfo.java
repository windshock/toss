package o;

import o.Cert;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getAuthorityKeyIdentifierInfo extends Cert {
    public getAuthorityKeyIdentifierInfo(UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo2) {
        super(uST_TRANS_V2_SendReceiverInfo, uST_TRANS_V2_SendReceiverInfo2);
    }

    @Override // o.Cert
    public Cert.onNavigationEvent onExtraCallback() {
        return Cert.onNavigationEvent.StreamStart;
    }
}
