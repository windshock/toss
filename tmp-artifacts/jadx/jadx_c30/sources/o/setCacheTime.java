package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setCacheTime {

    @SerializedName("appPla")
    private String appPla;

    @SerializedName("cTypeHolder")
    private String cTypeHolder;

    @SerializedName("cardStCode")
    private String cardStCode;

    @SerializedName("idLsam")
    private String idLsam;

    @SerializedName("idLsamCenter")
    private String idLsamCenter;

    @SerializedName("par")
    private String par;

    @SerializedName("respCode")
    private String respCode;

    @SerializedName("sign2")
    private String sign2;

    @SerializedName("typeHolder")
    private String typeHolder;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setCacheTime)) {
            return false;
        }
        setCacheTime setcachetime = (setCacheTime) obj;
        return Intrinsics.areEqual(this.par, setcachetime.par) && Intrinsics.areEqual(this.cardStCode, setcachetime.cardStCode) && Intrinsics.areEqual(this.idLsam, setcachetime.idLsam) && Intrinsics.areEqual(this.respCode, setcachetime.respCode) && Intrinsics.areEqual(this.typeHolder, setcachetime.typeHolder) && Intrinsics.areEqual(this.idLsamCenter, setcachetime.idLsamCenter) && Intrinsics.areEqual(this.sign2, setcachetime.sign2) && Intrinsics.areEqual(this.cTypeHolder, setcachetime.cTypeHolder) && Intrinsics.areEqual(this.appPla, setcachetime.appPla);
    }

    public int hashCode() {
        return this.appPla.hashCode() + getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.cTypeHolder, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.sign2, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.idLsamCenter, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.typeHolder, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.respCode, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.idLsam, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.cardStCode, this.par.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        return "KorailCardTypeChangeResponse(par=" + this.par + ", cardStCode=" + this.cardStCode + ", idLsam=" + this.idLsam + ", respCode=" + this.respCode + ", typeHolder=" + this.typeHolder + ", idLsamCenter=" + this.idLsamCenter + ", sign2=" + this.sign2 + ", cTypeHolder=" + this.cTypeHolder + ", appPla=" + this.appPla + ')';
    }
}
