package org.snakeyaml.engine.v2.exceptions;

import o.uh16;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class ReaderException extends uh16 {
    private final int codePoint;
    private final String name;
    private final int position;

    public ReaderException(String str, int i, int i2, String str2) {
        super(str2);
        this.name = str;
        this.codePoint = i2;
        this.position = i;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "unacceptable code point '" + new String(Character.toChars(this.codePoint)) + "' (0x" + Integer.toHexString(this.codePoint).toUpperCase() + ") " + getMessage() + "\nin \"" + this.name + "\", position " + this.position;
    }
}
