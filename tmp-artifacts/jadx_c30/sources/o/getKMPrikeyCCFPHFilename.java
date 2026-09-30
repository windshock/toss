package o;

import o.UST_TRANS_Finalize;
import o.getOCSPAddress;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getKMPrikeyCCFPHFilename extends getOCSPAddress {
    private final UST_TRANS_Finalize.onExtraCallback IAuthTabCallback;
    private final String onNavigationEvent;
    private final boolean onWarmupCompleted;

    public getKMPrikeyCCFPHFilename(String str, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo2, boolean z) {
        this(str, z, uST_TRANS_V2_SendReceiverInfo, uST_TRANS_V2_SendReceiverInfo2, UST_TRANS_Finalize.onExtraCallback.PLAIN);
    }

    public getKMPrikeyCCFPHFilename(String str, boolean z, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo2, UST_TRANS_Finalize.onExtraCallback onextracallback) {
        super(uST_TRANS_V2_SendReceiverInfo, uST_TRANS_V2_SendReceiverInfo2);
        this.onNavigationEvent = str;
        this.onWarmupCompleted = z;
        if (onextracallback == null) {
            throw new NullPointerException("Style must be provided.");
        }
        this.IAuthTabCallback = onextracallback;
    }

    public boolean IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    public String onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public UST_TRANS_Finalize.onExtraCallback onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    @Override // o.getOCSPAddress
    public getOCSPAddress.onWarmupCompleted onWarmupCompleted() {
        return getOCSPAddress.onWarmupCompleted.Scalar;
    }
}
