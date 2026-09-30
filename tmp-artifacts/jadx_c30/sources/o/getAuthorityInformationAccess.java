package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class getAuthorityInformationAccess extends Cert {
    private final String IAuthTabCallback;

    public getAuthorityInformationAccess(String str, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo2) {
        super(uST_TRANS_V2_SendReceiverInfo, uST_TRANS_V2_SendReceiverInfo2);
        this.IAuthTabCallback = str;
    }

    public String onTransact() {
        return this.IAuthTabCallback;
    }

    @Override // o.Cert
    protected String onNavigationEvent() {
        return "anchor=" + this.IAuthTabCallback;
    }
}
