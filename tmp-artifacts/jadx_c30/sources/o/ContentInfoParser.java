package o;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ContentInfoParser implements Serializable {
    public static final int $stable = 0;
    private final String cardNo;
    private final String cardWebSiteId;
    private final String encryptedSsn;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentInfoParser)) {
            return false;
        }
        ContentInfoParser contentInfoParser = (ContentInfoParser) obj;
        return Intrinsics.areEqual(this.encryptedSsn, contentInfoParser.encryptedSsn) && Intrinsics.areEqual(this.cardWebSiteId, contentInfoParser.cardWebSiteId) && Intrinsics.areEqual(this.cardNo, contentInfoParser.cardNo);
    }

    public int hashCode() {
        int iHashCode = this.encryptedSsn.hashCode();
        String str = this.cardWebSiteId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.cardNo;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CertRegisterInfo(encryptedSsn=" + this.encryptedSsn + ", cardWebSiteId=" + this.cardWebSiteId + ", cardNo=" + this.cardNo + ")";
    }
}
