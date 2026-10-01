package o;

import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTVideoLandingPageActivity10 {
    private final long IAuthTabCallback;
    private final long onNavigationEvent;

    public TTVideoLandingPageActivity10(long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("offset must not be negative");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("numbytes must not be negative");
        }
        this.IAuthTabCallback = j;
        this.onNavigationEvent = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TTVideoLandingPageActivity10.class != obj.getClass()) {
            return false;
        }
        TTVideoLandingPageActivity10 tTVideoLandingPageActivity10 = (TTVideoLandingPageActivity10) obj;
        return this.IAuthTabCallback == tTVideoLandingPageActivity10.IAuthTabCallback && this.onNavigationEvent == tTVideoLandingPageActivity10.onNavigationEvent;
    }

    public long onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public long IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.IAuthTabCallback), Long.valueOf(this.onNavigationEvent));
    }

    public String toString() {
        return "TarArchiveStructSparse{offset=" + this.IAuthTabCallback + ", numbytes=" + this.onNavigationEvent + '}';
    }
}
