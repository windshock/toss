package o;

import java.util.Map;
import o.Cert;
import o.UST_TRANS_Finalize;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getM_nDeviceOS extends Cert {
    private final Map<String, String> IAuthTabCallback;
    private final boolean onExtraCallback;
    private final UST_TRANS_Finalize.onWarmupCompleted onNavigationEvent;

    public getM_nDeviceOS(UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo2, boolean z, UST_TRANS_Finalize.onWarmupCompleted onwarmupcompleted, Map<String, String> map) {
        super(uST_TRANS_V2_SendReceiverInfo, uST_TRANS_V2_SendReceiverInfo2);
        this.onExtraCallback = z;
        this.onNavigationEvent = onwarmupcompleted;
        this.IAuthTabCallback = map;
    }

    public boolean onWarmupCompleted() {
        return this.onExtraCallback;
    }

    public UST_TRANS_Finalize.onWarmupCompleted onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public Map<String, String> IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    @Override // o.Cert
    public Cert.onNavigationEvent onExtraCallback() {
        return Cert.onNavigationEvent.DocumentStart;
    }
}
