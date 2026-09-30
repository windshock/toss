package com.google.android.exoplayer2.extractor;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DummyExtractorOutput implements ExtractorOutput {
    public void endTracks() {
    }

    public void seekMap(SeekMap seekMap) {
    }

    public TrackOutput track(int i2, int i3) {
        return new DummyTrackOutput();
    }
}
