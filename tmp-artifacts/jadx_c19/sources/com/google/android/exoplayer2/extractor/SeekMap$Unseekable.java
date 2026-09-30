package com.google.android.exoplayer2.extractor;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class SeekMap$Unseekable implements SeekMap {
    private final long durationUs;
    private final SeekMap$SeekPoints startSeekPoints;

    public boolean isSeekable() {
        return false;
    }

    public SeekMap$Unseekable(long j) {
        this(j, 0L);
    }

    public SeekMap$Unseekable(long j, long j2) {
        this.durationUs = j;
        this.startSeekPoints = new SeekMap$SeekPoints(j2 == 0 ? SeekPoint.START : new SeekPoint(0L, j2));
    }

    public long getDurationUs() {
        return this.durationUs;
    }

    public SeekMap$SeekPoints getSeekPoints(long j) {
        return this.startSeekPoints;
    }
}
