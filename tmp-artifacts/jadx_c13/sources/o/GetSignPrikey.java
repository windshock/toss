package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class GetSignPrikey implements TRANS_ImportCert {
    private static final getColumnIndexOrThrow onExtraCallback = new getColumnIndexOrThrow();

    @Override // o.TRANS_ImportCert
    public TRANS_V2_ExportCert onNavigationEvent() {
        return onExtraCallback;
    }

    @Override // o.TRANS_ImportCert
    public TRANS_IsPCconnected IAuthTabCallback() {
        return onExtraCallback;
    }
}
