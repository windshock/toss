package org.chromium.net;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class QuicException extends NetworkException {
    public abstract int getQuicDetailedErrorCode();

    public QuicException(String str, Throwable th) {
        super(str, th);
    }
}
