package org.apache.commons.compress.archivers.dump;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class InvalidFormatException extends DumpArchiveException {
    private static final long serialVersionUID = 1;
    protected long offset;

    public InvalidFormatException() {
        super("there was an error decoding a tape segment");
    }
}
