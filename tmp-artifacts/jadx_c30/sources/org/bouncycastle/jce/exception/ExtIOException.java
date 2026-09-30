package org.bouncycastle.jce.exception;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class ExtIOException extends IOException implements ExtException {
    private Throwable cause;

    public ExtIOException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
