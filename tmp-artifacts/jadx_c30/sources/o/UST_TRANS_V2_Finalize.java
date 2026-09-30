package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class UST_TRANS_V2_Finalize {
    private final String IAuthTabCallback;
    private final UST_TRANS_V2_SendReceiverInfo onExtraCallback;
    private final UST_TRANS_V2_SendReceiverInfo onExtraCallbackWithResult;
    private final UST_TRANS_V2_ExportCert onWarmupCompleted;

    public UST_TRANS_V2_Finalize(UST_TRNAS_Password_GenOut uST_TRNAS_Password_GenOut) {
        this(uST_TRNAS_Password_GenOut.IAuthTabCallbackStub(), uST_TRNAS_Password_GenOut.IAuthTabCallbackDefault(), uST_TRNAS_Password_GenOut.IAuthTabCallback(), uST_TRNAS_Password_GenOut.onExtraCallbackWithResult());
    }

    public UST_TRANS_V2_Finalize(UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo2, String str, UST_TRANS_V2_ExportCert uST_TRANS_V2_ExportCert) {
        this.onExtraCallbackWithResult = uST_TRANS_V2_SendReceiverInfo;
        this.onExtraCallback = uST_TRANS_V2_SendReceiverInfo2;
        this.IAuthTabCallback = str;
        this.onWarmupCompleted = uST_TRANS_V2_ExportCert;
    }

    public UST_TRANS_V2_ExportCert onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public String onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    public String toString() {
        return "<" + getClass().getName() + " (type=" + onNavigationEvent() + ", value=" + onWarmupCompleted() + ")>";
    }
}
