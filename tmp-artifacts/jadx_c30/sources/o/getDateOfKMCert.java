package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class getDateOfKMCert {
    private final int IAuthTabCallback;
    private final int IAuthTabCallbackStub;
    private final int onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final UST_TRANS_V2_SendReceiverInfo onWarmupCompleted;

    public getDateOfKMCert(int i, boolean z, int i2, int i3, int i4, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo) {
        this.IAuthTabCallbackStub = i;
        this.onExtraCallbackWithResult = z;
        this.onNavigationEvent = i2;
        this.onExtraCallback = i3;
        this.IAuthTabCallback = i4;
        this.onWarmupCompleted = uST_TRANS_V2_SendReceiverInfo;
    }

    public int onWarmupCompleted() {
        return this.IAuthTabCallbackStub;
    }

    public int onExtraCallback() {
        return this.IAuthTabCallback;
    }

    public UST_TRANS_V2_SendReceiverInfo onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public int IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    public int onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public boolean IAuthTabCallbackDefault() {
        return this.onExtraCallbackWithResult;
    }

    public String toString() {
        return "SimpleKey - tokenNumber=" + this.IAuthTabCallbackStub + " required=" + this.onExtraCallbackWithResult + " index=" + this.onNavigationEvent + " line=" + this.onExtraCallback + " column=" + this.IAuthTabCallback;
    }
}
