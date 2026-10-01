package o;

import java.util.List;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class getBSignPriKeyCCFFH {
    private List<UST_TRANS_V2_Finalize> IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private Class<? extends Object> IAuthTabCallbackStub;
    private final UST_TRANS_V2_SendReceiverInfo asBinder;
    private List<UST_TRANS_V2_Finalize> asInterface;
    protected Boolean onExtraCallback;
    private List<UST_TRANS_V2_Finalize> onExtraCallbackWithResult;
    protected boolean onNavigationEvent;
    private getBSignPriKeyCCFBFH onTransact;
    protected UST_TRANS_V2_SendReceiverInfo onWarmupCompleted;

    public getBSignPriKeyCCFFH(getBSignPriKeyCCFBFH getbsignprikeyccfbfh, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo2) {
        onExtraCallbackWithResult(getbsignprikeyccfbfh);
        this.asBinder = uST_TRANS_V2_SendReceiverInfo;
        this.onWarmupCompleted = uST_TRANS_V2_SendReceiverInfo2;
        this.IAuthTabCallbackStub = Object.class;
        this.IAuthTabCallbackDefault = false;
        this.onNavigationEvent = true;
        this.onExtraCallback = null;
        this.asInterface = null;
        this.IAuthTabCallback = null;
        this.onExtraCallbackWithResult = null;
    }

    public getBSignPriKeyCCFBFH onNavigationEvent() {
        return this.onTransact;
    }

    public UST_TRANS_V2_SendReceiverInfo onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    public UST_TRANS_V2_SendReceiverInfo onWarmupCompleted() {
        return this.asBinder;
    }

    public void onExtraCallbackWithResult(getBSignPriKeyCCFBFH getbsignprikeyccfbfh) {
        if (getbsignprikeyccfbfh == null) {
            throw new NullPointerException("tag in a Node is required.");
        }
        this.onTransact = getbsignprikeyccfbfh;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }
}
