package o;

import o.Cert;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getM_deviceName extends Cert {
    private final boolean onWarmupCompleted;

    public getM_deviceName(UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo2, boolean z) {
        super(uST_TRANS_V2_SendReceiverInfo, uST_TRANS_V2_SendReceiverInfo2);
        this.onWarmupCompleted = z;
    }

    public boolean IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    @Override // o.Cert
    public Cert.onNavigationEvent onExtraCallback() {
        return Cert.onNavigationEvent.DocumentEnd;
    }
}
