package o;

import o.UST_TRANS_Finalize;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class UST_TRNAS_Init_Check extends getAuthorityInformationAccess {
    private final boolean onExtraCallback;
    private final String onNavigationEvent;
    private final UST_TRANS_Finalize.onExtraCallbackWithResult onWarmupCompleted;

    public UST_TRNAS_Init_Check(String str, String str2, boolean z, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo2, UST_TRANS_Finalize.onExtraCallbackWithResult onextracallbackwithresult) {
        super(str, uST_TRANS_V2_SendReceiverInfo, uST_TRANS_V2_SendReceiverInfo2);
        this.onNavigationEvent = str2;
        this.onExtraCallback = z;
        if (onextracallbackwithresult == null) {
            throw new NullPointerException("Flow style must be provided.");
        }
        this.onWarmupCompleted = onextracallbackwithresult;
    }

    public String IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    public boolean onWarmupCompleted() {
        return this.onExtraCallback;
    }

    @Override // o.getAuthorityInformationAccess, o.Cert
    protected String onNavigationEvent() {
        return super.onNavigationEvent() + ", tag=" + this.onNavigationEvent + ", implicit=" + this.onExtraCallback;
    }

    public boolean onExtraCallbackWithResult() {
        return UST_TRANS_Finalize.onExtraCallbackWithResult.FLOW == this.onWarmupCompleted;
    }
}
