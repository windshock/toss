package o;

import o.Cert;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class UST_TRNAS_Password_GenOut extends Cert {
    private final String onExtraCallbackWithResult;
    private final UST_TRANS_V2_ExportCert onWarmupCompleted;

    public UST_TRNAS_Password_GenOut(UST_TRANS_V2_ExportCert uST_TRANS_V2_ExportCert, String str, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo2) {
        super(uST_TRANS_V2_SendReceiverInfo, uST_TRANS_V2_SendReceiverInfo2);
        if (uST_TRANS_V2_ExportCert == null) {
            throw new NullPointerException("Event Type must be provided.");
        }
        this.onWarmupCompleted = uST_TRANS_V2_ExportCert;
        if (str == null) {
            throw new NullPointerException("Value must be provided.");
        }
        this.onExtraCallbackWithResult = str;
    }

    public String IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    public UST_TRANS_V2_ExportCert onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    @Override // o.Cert
    protected String onNavigationEvent() {
        return super.onNavigationEvent() + "type=" + this.onWarmupCompleted + ", value=" + this.onExtraCallbackWithResult;
    }

    @Override // o.Cert
    public Cert.onNavigationEvent onExtraCallback() {
        return Cert.onNavigationEvent.Comment;
    }
}
