package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setExpressViewAccepted {

    @SerializedName("cardStCode")
    private final String cardStCode;

    @SerializedName("frcsReqUuid")
    private final String frcsReqUuid;

    @SerializedName("idPsam")
    private final String idPsam;

    @SerializedName("ntPsam")
    private final String ntPsam;

    @SerializedName("respCode")
    private final String respCode;

    @SerializedName("sign2")
    private final String sign2;

    @SerializedName("stCodePsam")
    private final String stCodePsam;

    public final String IAuthTabCallback() {
        return this.idPsam;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setExpressViewAccepted)) {
            return false;
        }
        setExpressViewAccepted setexpressviewaccepted = (setExpressViewAccepted) obj;
        return Intrinsics.areEqual(this.idPsam, setexpressviewaccepted.idPsam) && Intrinsics.areEqual(this.ntPsam, setexpressviewaccepted.ntPsam) && Intrinsics.areEqual(this.stCodePsam, setexpressviewaccepted.stCodePsam) && Intrinsics.areEqual(this.sign2, setexpressviewaccepted.sign2) && Intrinsics.areEqual(this.frcsReqUuid, setexpressviewaccepted.frcsReqUuid) && Intrinsics.areEqual(this.respCode, setexpressviewaccepted.respCode) && Intrinsics.areEqual(this.cardStCode, setexpressviewaccepted.cardStCode);
    }

    public int hashCode() {
        return this.cardStCode.hashCode() + getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.respCode, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.frcsReqUuid, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.sign2, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.stCodePsam, getExpressViewAcceptedHeight.onExtraCallbackWithResult(this.ntPsam, this.idPsam.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String onExtraCallback() {
        return this.respCode;
    }

    public final String onExtraCallbackWithResult() {
        return this.sign2;
    }

    public final String onNavigationEvent() {
        return this.ntPsam;
    }

    public final String onTransact() {
        return this.stCodePsam;
    }

    public final String onWarmupCompleted() {
        return this.cardStCode;
    }

    public String toString() {
        return "InitializePsamResponse(idPsam=" + this.idPsam + ", ntPsam=" + this.ntPsam + ", stCodePsam=" + this.stCodePsam + ", sign2=" + this.sign2 + ", frcsReqUuid=" + this.frcsReqUuid + ", respCode=" + this.respCode + ", cardStCode=" + this.cardStCode + ')';
    }
}
