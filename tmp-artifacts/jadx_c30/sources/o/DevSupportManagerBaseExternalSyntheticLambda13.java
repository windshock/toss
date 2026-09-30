package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class DevSupportManagerBaseExternalSyntheticLambda13 {
    public static final int $stable = 0;

    @SerializedName("isReady")
    private final boolean isReady;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DevSupportManagerBaseExternalSyntheticLambda13) && this.isReady == ((DevSupportManagerBaseExternalSyntheticLambda13) obj).isReady;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isReady);
    }

    public String toString() {
        return "CertificateSessionPolicyResponse(isReady=" + this.isReady + ")";
    }
}
