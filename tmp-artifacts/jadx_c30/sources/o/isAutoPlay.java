package o;

import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class isAutoPlay {
    private final String balEp;
    private final String cardStCode;
    private final String errMsg;
    private final String franchiseId;
    private final String frcsReqUuid;
    private final String idEp;
    private final String mPda;
    private final String ntEp;
    private final String respCode;
    private final String sign3;
    private final String vkEp;

    public isAutoPlay(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str4, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str5, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str6, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str7, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str8, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str9, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str10, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str11, BuildConfig.FLAVOR);
        this.frcsReqUuid = str;
        this.idEp = str2;
        this.vkEp = str3;
        this.balEp = str4;
        this.ntEp = str5;
        this.mPda = str6;
        this.sign3 = str7;
        this.franchiseId = str8;
        this.cardStCode = str9;
        this.respCode = str10;
        this.errMsg = str11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isAutoPlay)) {
            return false;
        }
        isAutoPlay isautoplay = (isAutoPlay) obj;
        return Intrinsics.areEqual(this.frcsReqUuid, isautoplay.frcsReqUuid) && Intrinsics.areEqual(this.idEp, isautoplay.idEp) && Intrinsics.areEqual(this.vkEp, isautoplay.vkEp) && Intrinsics.areEqual(this.balEp, isautoplay.balEp) && Intrinsics.areEqual(this.ntEp, isautoplay.ntEp) && Intrinsics.areEqual(this.mPda, isautoplay.mPda) && Intrinsics.areEqual(this.sign3, isautoplay.sign3) && Intrinsics.areEqual(this.franchiseId, isautoplay.franchiseId) && Intrinsics.areEqual(this.cardStCode, isautoplay.cardStCode) && Intrinsics.areEqual(this.respCode, isautoplay.respCode) && Intrinsics.areEqual(this.errMsg, isautoplay.errMsg);
    }

    public int hashCode() {
        return this.errMsg.hashCode() + getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.respCode, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.cardStCode, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.franchiseId, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.sign3, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.mPda, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.ntEp, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.balEp, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.vkEp, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.idEp, this.frcsReqUuid.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        return "CreditPsamRequest(frcsReqUuid=" + this.frcsReqUuid + ", idEp=" + this.idEp + ", vkEp=" + this.vkEp + ", balEp=" + this.balEp + ", ntEp=" + this.ntEp + ", mPda=" + this.mPda + ", sign3=" + this.sign3 + ", franchiseId=" + this.franchiseId + ", cardStCode=" + this.cardStCode + ", respCode=" + this.respCode + ", errMsg=" + this.errMsg + ')';
    }
}
