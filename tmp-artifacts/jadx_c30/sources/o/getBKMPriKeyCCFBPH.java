package o;

import o.Cert;
import o.UST_TRANS_Finalize;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getBKMPriKeyCCFBPH extends getAuthorityInformationAccess {
    private final String onExtraCallback;
    private final getM_nTransType onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final UST_TRANS_Finalize.onExtraCallback onWarmupCompleted;

    public getBKMPriKeyCCFBPH(String str, String str2, getM_nTransType getm_ntranstype, String str3, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo2, UST_TRANS_Finalize.onExtraCallback onextracallback) {
        super(str, uST_TRANS_V2_SendReceiverInfo, uST_TRANS_V2_SendReceiverInfo2);
        this.onExtraCallback = str2;
        this.onExtraCallbackWithResult = getm_ntranstype;
        if (str3 == null) {
            throw new NullPointerException("Value must be provided.");
        }
        this.onNavigationEvent = str3;
        if (onextracallback == null) {
            throw new NullPointerException("Style must be provided.");
        }
        this.onWarmupCompleted = onextracallback;
    }

    public String onWarmupCompleted() {
        return this.onExtraCallback;
    }

    public UST_TRANS_Finalize.onExtraCallback IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    public String asInterface() {
        return this.onNavigationEvent;
    }

    public getM_nTransType onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.getAuthorityInformationAccess, o.Cert
    protected String onNavigationEvent() {
        return super.onNavigationEvent() + ", tag=" + this.onExtraCallback + ", style=" + this.onWarmupCompleted + "," + this.onExtraCallbackWithResult + ", value=" + this.onNavigationEvent;
    }

    @Override // o.Cert
    public Cert.onNavigationEvent onExtraCallback() {
        return Cert.onNavigationEvent.Scalar;
    }

    public boolean IAuthTabCallback_Parcel() {
        return this.onWarmupCompleted == UST_TRANS_Finalize.onExtraCallback.PLAIN;
    }

    public boolean IAuthTabCallbackStubProxy() {
        return this.onWarmupCompleted == UST_TRANS_Finalize.onExtraCallback.LITERAL;
    }

    public boolean access100() {
        return this.onWarmupCompleted == UST_TRANS_Finalize.onExtraCallback.SINGLE_QUOTED;
    }

    public boolean asBinder() {
        return this.onWarmupCompleted == UST_TRANS_Finalize.onExtraCallback.DOUBLE_QUOTED;
    }

    public boolean getInterfaceDescriptor() {
        return this.onWarmupCompleted == UST_TRANS_Finalize.onExtraCallback.FOLDED;
    }

    public boolean access000() {
        return this.onWarmupCompleted == UST_TRANS_Finalize.onExtraCallback.JSON_SCALAR_STYLE;
    }
}
