package org.apache.commons.compress.archivers.dump;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class ShortFileException extends DumpArchiveException {
    private static final long serialVersionUID = 1;

    public ShortFileException() {
        super("unexpected EOF");
    }
}
