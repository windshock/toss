package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class jniSetSourceURL {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final long guestSessionId;
    private final boolean sentSmsToLegalRepresentative;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 101;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof jniSetSourceURL) {
            jniSetSourceURL jnisetsourceurl = (jniSetSourceURL) obj;
            return this.guestSessionId == jnisetsourceurl.guestSessionId && this.sentSmsToLegalRepresentative == jnisetsourceurl.sentSmsToLegalRepresentative;
        }
        int i4 = onNavigationEvent + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Long.hashCode(this.guestSessionId) * 31) + Boolean.hashCode(this.sentSmsToLegalRepresentative);
        int i4 = onWarmupCompleted + 111;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuestUnderFourteenGuardianSendAgreementLinkRequest(guestSessionId=" + this.guestSessionId + ", sentSmsToLegalRepresentative=" + this.sentSmsToLegalRepresentative + ")";
        int i2 = onNavigationEvent + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public jniSetSourceURL(long j, boolean z) {
        this.guestSessionId = j;
        this.sentSmsToLegalRepresentative = z;
    }
}
