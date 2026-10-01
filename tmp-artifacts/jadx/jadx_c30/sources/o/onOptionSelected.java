package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class onOptionSelected {
    public static final int $stable = 0;

    @SerializedName("sessionId")
    private final long sessionId;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onOptionSelected) && this.sessionId == ((onOptionSelected) obj).sessionId;
    }

    public int hashCode() {
        return Long.hashCode(this.sessionId);
    }

    public String toString() {
        return "CertificateSessionPolicyRequest(sessionId=" + this.sessionId + ")";
    }
}
