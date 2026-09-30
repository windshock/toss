package io.jsonwebtoken.security;

import io.jsonwebtoken.JwtException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class SecurityException extends JwtException {
    public SecurityException(String str) {
        super(str);
    }

    public SecurityException(String str, Throwable th) {
        super(str, th);
    }
}
