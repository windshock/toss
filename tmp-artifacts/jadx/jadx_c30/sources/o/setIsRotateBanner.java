package o;

import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setIsRotateBanner {
    private final String algEp;
    private final String aliasNo;
    private final String balEp;
    private final String cardType;
    private final String franchiseDivCode;
    private final String franchiseId;
    private final String frcsReqUuid;
    private final String idCenter;
    private final String idEp;
    private final String mPda;
    private final String ntEp;
    private final String serviceCode;
    private final String sign1;
    private final String vkEp;

    public setIsRotateBanner(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
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
        Intrinsics.checkNotNullParameter(str12, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str13, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str14, BuildConfig.FLAVOR);
        this.idEp = str;
        this.algEp = str2;
        this.vkEp = str3;
        this.balEp = str4;
        this.idCenter = str5;
        this.ntEp = str6;
        this.sign1 = str7;
        this.mPda = str8;
        this.franchiseDivCode = str9;
        this.cardType = str10;
        this.franchiseId = str11;
        this.aliasNo = str12;
        this.serviceCode = str13;
        this.frcsReqUuid = str14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setIsRotateBanner)) {
            return false;
        }
        setIsRotateBanner setisrotatebanner = (setIsRotateBanner) obj;
        return Intrinsics.areEqual(this.idEp, setisrotatebanner.idEp) && Intrinsics.areEqual(this.algEp, setisrotatebanner.algEp) && Intrinsics.areEqual(this.vkEp, setisrotatebanner.vkEp) && Intrinsics.areEqual(this.balEp, setisrotatebanner.balEp) && Intrinsics.areEqual(this.idCenter, setisrotatebanner.idCenter) && Intrinsics.areEqual(this.ntEp, setisrotatebanner.ntEp) && Intrinsics.areEqual(this.sign1, setisrotatebanner.sign1) && Intrinsics.areEqual(this.mPda, setisrotatebanner.mPda) && Intrinsics.areEqual(this.franchiseDivCode, setisrotatebanner.franchiseDivCode) && Intrinsics.areEqual(this.cardType, setisrotatebanner.cardType) && Intrinsics.areEqual(this.franchiseId, setisrotatebanner.franchiseId) && Intrinsics.areEqual(this.aliasNo, setisrotatebanner.aliasNo) && Intrinsics.areEqual(this.serviceCode, setisrotatebanner.serviceCode) && Intrinsics.areEqual(this.frcsReqUuid, setisrotatebanner.frcsReqUuid);
    }

    public int hashCode() {
        return this.frcsReqUuid.hashCode() + getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.serviceCode, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.aliasNo, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.franchiseId, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.cardType, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.franchiseDivCode, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.mPda, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.sign1, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.ntEp, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.idCenter, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.balEp, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.vkEp, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.algEp, this.idEp.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        return "InitPsamRequest(idEp=" + this.idEp + ", algEp=" + this.algEp + ", vkEp=" + this.vkEp + ", balEp=" + this.balEp + ", idCenter=" + this.idCenter + ", ntEp=" + this.ntEp + ", sign1=" + this.sign1 + ", mPda=" + this.mPda + ", franchiseDivCode=" + this.franchiseDivCode + ", cardType=" + this.cardType + ", franchiseId=" + this.franchiseId + ", aliasNo=" + this.aliasNo + ", serviceCode=" + this.serviceCode + ", frcsReqUuid=" + this.frcsReqUuid + ')';
    }
}
