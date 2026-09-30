package com.google.firebase.installations;

import com.google.firebase.installations.InstallationTokenResult;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class AutoValue_InstallationTokenResult extends InstallationTokenResult {
    private final String token;
    private final long tokenCreationTimestamp;
    private final long tokenExpirationTimestamp;

    private AutoValue_InstallationTokenResult(String str, long j, long j2) {
        this.token = str;
        this.tokenExpirationTimestamp = j;
        this.tokenCreationTimestamp = j2;
    }

    public String getToken() {
        return this.token;
    }

    public long getTokenExpirationTimestamp() {
        return this.tokenExpirationTimestamp;
    }

    public long getTokenCreationTimestamp() {
        return this.tokenCreationTimestamp;
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.token + ", tokenExpirationTimestamp=" + this.tokenExpirationTimestamp + ", tokenCreationTimestamp=" + this.tokenCreationTimestamp + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationTokenResult)) {
            return false;
        }
        InstallationTokenResult installationTokenResult = (InstallationTokenResult) obj;
        return this.token.equals(installationTokenResult.getToken()) && this.tokenExpirationTimestamp == installationTokenResult.getTokenExpirationTimestamp() && this.tokenCreationTimestamp == installationTokenResult.getTokenCreationTimestamp();
    }

    public int hashCode() {
        int iHashCode = this.token.hashCode();
        long j = this.tokenExpirationTimestamp;
        int i2 = (int) (j ^ (j >>> 32));
        long j2 = this.tokenCreationTimestamp;
        return ((((iHashCode ^ 1000003) * 1000003) ^ i2) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public InstallationTokenResult.Builder toBuilder() {
        return new Builder(this, (AnonymousClass1) null);
    }
}
