package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import com.google.firebase.installations.remote.AutoValue_TokenResult;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class TokenResult {

    public static abstract class Builder {
        public abstract TokenResult build();

        public abstract Builder setResponseCode(@NonNull ResponseCode responseCode);

        public abstract Builder setToken(@NonNull String str);

        public abstract Builder setTokenExpirationTimestamp(long j);
    }

    public enum ResponseCode {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public abstract ResponseCode getResponseCode();

    public abstract String getToken();

    public abstract long getTokenExpirationTimestamp();

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new AutoValue_TokenResult.Builder().setTokenExpirationTimestamp(0L);
    }
}
