package org.xbill.DNS;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class TextParseException extends IOException {
    public TextParseException() {
    }

    public TextParseException(String str) {
        super(str);
    }

    public TextParseException(String str, String str2) {
        super("'" + str + "': " + str2);
    }

    public TextParseException(String str, String str2, Exception exc) {
        super("'" + str + "': " + str2, exc);
    }
}
