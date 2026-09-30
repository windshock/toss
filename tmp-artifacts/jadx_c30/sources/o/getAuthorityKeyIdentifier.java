package o;

import o.Cert;
import o.UST_TRANS_Finalize;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getAuthorityKeyIdentifier extends UST_TRNAS_Init_Check {
    public getAuthorityKeyIdentifier(String str, String str2, boolean z, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo2, UST_TRANS_Finalize.onExtraCallbackWithResult onextracallbackwithresult) {
        super(str, str2, z, uST_TRANS_V2_SendReceiverInfo, uST_TRANS_V2_SendReceiverInfo2, onextracallbackwithresult);
    }

    @Override // o.Cert
    public Cert.onNavigationEvent onExtraCallback() {
        return Cert.onNavigationEvent.MappingStart;
    }
}
