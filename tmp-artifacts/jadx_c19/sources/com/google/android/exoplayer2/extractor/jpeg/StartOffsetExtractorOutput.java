package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekMap$SeekPoints;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.TrackOutput;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class StartOffsetExtractorOutput implements ExtractorOutput {
    private final ExtractorOutput extractorOutput;
    private final long startOffset;

    public StartOffsetExtractorOutput(long j, ExtractorOutput extractorOutput) {
        this.startOffset = j;
        this.extractorOutput = extractorOutput;
    }

    public TrackOutput track(int i2, int i3) {
        return this.extractorOutput.track(i2, i3);
    }

    public void endTracks() {
        this.extractorOutput.endTracks();
    }

    public void seekMap(final SeekMap seekMap) {
        this.extractorOutput.seekMap(new SeekMap() { // from class: com.google.android.exoplayer2.extractor.jpeg.StartOffsetExtractorOutput.1
            public boolean isSeekable() {
                return seekMap.isSeekable();
            }

            public long getDurationUs() {
                return seekMap.getDurationUs();
            }

            public SeekMap$SeekPoints getSeekPoints(long j) {
                SeekMap$SeekPoints seekPoints = seekMap.getSeekPoints(j);
                SeekPoint seekPoint = seekPoints.first;
                SeekPoint seekPoint2 = new SeekPoint(seekPoint.timeUs, seekPoint.position + StartOffsetExtractorOutput.this.startOffset);
                SeekPoint seekPoint3 = seekPoints.second;
                return new SeekMap$SeekPoints(seekPoint2, new SeekPoint(seekPoint3.timeUs, seekPoint3.position + StartOffsetExtractorOutput.this.startOffset));
            }
        });
    }
}
