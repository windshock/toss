package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public enum setCornerTopRightRadius {
    STANDARD(true, true),
    IWORK_ARCHIVE(false, false);

    private final boolean checksumWithCompressedChunks;
    private final boolean streamIdentifier;

    setCornerTopRightRadius(boolean z, boolean z2) {
        this.streamIdentifier = z;
        this.checksumWithCompressedChunks = z2;
    }

    boolean hasStreamIdentifier() {
        return this.streamIdentifier;
    }

    boolean usesChecksumWithCompressedChunks() {
        return this.checksumWithCompressedChunks;
    }
}
