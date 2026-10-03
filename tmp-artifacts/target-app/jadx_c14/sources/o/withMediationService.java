package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class withMediationService {

    @SerializedName("bankCode")
    private String bankCode;

    @SerializedName("breakTime")
    private withPlacementIds breakTime;

    @SerializedName("isCircuitOpen")
    private boolean isCircuitOpen;

    @SerializedName("type")
    private String type;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof withMediationService)) {
            return false;
        }
        withMediationService withmediationservice = (withMediationService) obj;
        return Intrinsics.areEqual(this.breakTime, withmediationservice.breakTime) && this.isCircuitOpen == withmediationservice.isCircuitOpen && Intrinsics.areEqual(this.bankCode, withmediationservice.bankCode) && Intrinsics.areEqual(this.type, withmediationservice.type);
    }

    public int hashCode() {
        withPlacementIds withplacementids = this.breakTime;
        return ((((((withplacementids == null ? 0 : withplacementids.hashCode()) * 31) + Boolean.hashCode(this.isCircuitOpen)) * 31) + this.bankCode.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "BankBreakInfo(breakTime=" + this.breakTime + ", isCircuitOpen=" + this.isCircuitOpen + ", bankCode=" + this.bankCode + ", type=" + this.type + ")";
    }

    public final withPlacementIds getBreakTime() {
        return this.breakTime;
    }

    public final String getBankCode() {
        return this.bankCode;
    }

    public final String getType() {
        return this.type;
    }
}
