package o;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setUserData {
    private final String balEp;
    private final String cardStCode;
    private final String errMsg;
    private final String idPsam;
    private final String mpda;
    private final String ncPsam;
    private final String niPsam;
    private final String ntEp;
    private final String ntPsam;
    private final String postBalEp;
    private final String reqDate;
    private final String reqUuid;
    private final String respCode;
    private final String signInd;
    private final String totPsam;
    private final String tradeDate;
    private final String trt;
    private final String vkKdind;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setUserData)) {
            return false;
        }
        setUserData setuserdata = (setUserData) obj;
        return Intrinsics.areEqual(this.trt, setuserdata.trt) && Intrinsics.areEqual(this.balEp, setuserdata.balEp) && Intrinsics.areEqual(this.ntEp, setuserdata.ntEp) && Intrinsics.areEqual(this.mpda, setuserdata.mpda) && Intrinsics.areEqual(this.idPsam, setuserdata.idPsam) && Intrinsics.areEqual(this.ntPsam, setuserdata.ntPsam) && Intrinsics.areEqual(this.vkKdind, setuserdata.vkKdind) && Intrinsics.areEqual(this.postBalEp, setuserdata.postBalEp) && Intrinsics.areEqual(this.ncPsam, setuserdata.ncPsam) && Intrinsics.areEqual(this.niPsam, setuserdata.niPsam) && Intrinsics.areEqual(this.totPsam, setuserdata.totPsam) && Intrinsics.areEqual(this.signInd, setuserdata.signInd) && Intrinsics.areEqual(this.tradeDate, setuserdata.tradeDate) && Intrinsics.areEqual(this.reqDate, setuserdata.reqDate) && Intrinsics.areEqual(this.reqUuid, setuserdata.reqUuid) && Intrinsics.areEqual(this.respCode, setuserdata.respCode) && Intrinsics.areEqual(this.errMsg, setuserdata.errMsg) && Intrinsics.areEqual(this.cardStCode, setuserdata.cardStCode);
    }

    public int hashCode() {
        return this.cardStCode.hashCode() + getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.errMsg, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.respCode, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.reqUuid, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.reqDate, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.tradeDate, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.signInd, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.totPsam, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.niPsam, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.ncPsam, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.postBalEp, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.vkKdind, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.ntPsam, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.idPsam, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.mpda, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.ntEp, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.balEp, this.trt.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String onWarmupCompleted() {
        return this.respCode;
    }

    public String toString() {
        return "PlaCreditPsamResponse(trt=" + this.trt + ", balEp=" + this.balEp + ", ntEp=" + this.ntEp + ", mpda=" + this.mpda + ", idPsam=" + this.idPsam + ", ntPsam=" + this.ntPsam + ", vkKdind=" + this.vkKdind + ", postBalEp=" + this.postBalEp + ", ncPsam=" + this.ncPsam + ", niPsam=" + this.niPsam + ", totPsam=" + this.totPsam + ", signInd=" + this.signInd + ", tradeDate=" + this.tradeDate + ", reqDate=" + this.reqDate + ", reqUuid=" + this.reqUuid + ", respCode=" + this.respCode + ", errMsg=" + this.errMsg + ", cardStCode=" + this.cardStCode + ')';
    }
}
