package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class isSupportDeepLink {

    @SerializedName("algEp")
    private final String algEp;

    @SerializedName("aliasNo")
    private final String aliasNo;

    @SerializedName("balEp")
    private final String balEp;

    @SerializedName("birthDay")
    private final String birthDay;

    @SerializedName("cardNumber")
    private final String cardNumber;

    @SerializedName("cardType")
    private final String cardType;

    @SerializedName("franchiseId")
    private final String franchiseId;

    @SerializedName("idCenter")
    private final String idCenter;

    @SerializedName("ntEp")
    private final String ntEp;

    @SerializedName("rEp")
    private final String rEp;

    @SerializedName("sign1")
    private final String sign1;

    @SerializedName("frcsReqUuid")
    private final String tradeUid;

    @SerializedName("vkKdub")
    private final String vkKdub;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isSupportDeepLink)) {
            return false;
        }
        isSupportDeepLink issupportdeeplink = (isSupportDeepLink) obj;
        return Intrinsics.areEqual(this.algEp, issupportdeeplink.algEp) && Intrinsics.areEqual(this.balEp, issupportdeeplink.balEp) && Intrinsics.areEqual(this.idCenter, issupportdeeplink.idCenter) && Intrinsics.areEqual(this.ntEp, issupportdeeplink.ntEp) && Intrinsics.areEqual(this.rEp, issupportdeeplink.rEp) && Intrinsics.areEqual(this.sign1, issupportdeeplink.sign1) && Intrinsics.areEqual(this.vkKdub, issupportdeeplink.vkKdub) && Intrinsics.areEqual(this.birthDay, issupportdeeplink.birthDay) && Intrinsics.areEqual(this.cardNumber, issupportdeeplink.cardNumber) && Intrinsics.areEqual(this.cardType, issupportdeeplink.cardType) && Intrinsics.areEqual(this.franchiseId, issupportdeeplink.franchiseId) && Intrinsics.areEqual(this.aliasNo, issupportdeeplink.aliasNo) && Intrinsics.areEqual(this.tradeUid, issupportdeeplink.tradeUid);
    }

    public int hashCode() {
        return this.tradeUid.hashCode() + getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.aliasNo, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.franchiseId, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.cardType, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.cardNumber, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.birthDay, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.vkKdub, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.sign1, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.rEp, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.ntEp, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.idCenter, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.balEp, this.algEp.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        return "CardTypeChangeRequest(algEp=" + this.algEp + ", balEp=" + this.balEp + ", idCenter=" + this.idCenter + ", ntEp=" + this.ntEp + ", rEp=" + this.rEp + ", sign1=" + this.sign1 + ", vkKdub=" + this.vkKdub + ", birthDay=" + this.birthDay + ", cardNumber=" + this.cardNumber + ", cardType=" + this.cardType + ", franchiseId=" + this.franchiseId + ", aliasNo=" + this.aliasNo + ", tradeUid=" + this.tradeUid + ')';
    }
}
