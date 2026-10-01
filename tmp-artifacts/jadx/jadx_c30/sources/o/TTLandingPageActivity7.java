package o;

import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TTLandingPageActivity7 {
    private String onExtraCallback;
    private long onExtraCallbackWithResult;
    private String onNavigationEvent;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TTLandingPageActivity7 tTLandingPageActivity7 = (TTLandingPageActivity7) obj;
        return Objects.equals(this.onExtraCallback, tTLandingPageActivity7.onExtraCallback) && this.onExtraCallbackWithResult == tTLandingPageActivity7.onExtraCallbackWithResult && Objects.equals(this.onNavigationEvent, tTLandingPageActivity7.onNavigationEvent);
    }

    public int hashCode() {
        String str = this.onExtraCallback;
        long j = this.onExtraCallbackWithResult;
        return Objects.hash(str, Long.valueOf(j), this.onNavigationEvent);
    }
}
