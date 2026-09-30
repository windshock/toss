package org.xbill.DNS;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class WireParseException extends IOException {
    public WireParseException() {
    }

    public WireParseException(String str) {
        super(str);
    }

    public WireParseException(String str, Throwable th) {
        super(str, th);
    }
}
