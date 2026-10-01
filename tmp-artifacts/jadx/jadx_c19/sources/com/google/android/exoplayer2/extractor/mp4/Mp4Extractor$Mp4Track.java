package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.TrueHdSampleRechunker;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class Mp4Extractor$Mp4Track {
    public int sampleIndex;
    public final TrackSampleTable sampleTable;
    public final Track track;
    public final TrackOutput trackOutput;
    public final TrueHdSampleRechunker trueHdSampleRechunker;

    public Mp4Extractor$Mp4Track(Track track, TrackSampleTable trackSampleTable, TrackOutput trackOutput) {
        this.track = track;
        this.sampleTable = trackSampleTable;
        this.trackOutput = trackOutput;
        this.trueHdSampleRechunker = "audio/true-hd".equals(track.format.sampleMimeType) ? new TrueHdSampleRechunker() : null;
    }
}
