package com.google.android.exoplayer2.extractor.avi;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekMap$SeekPoints;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class AviExtractor$AviSeekMap implements SeekMap {
    private final long durationUs;
    final /* synthetic */ AviExtractor this$0;

    public boolean isSeekable() {
        return true;
    }

    public AviExtractor$AviSeekMap(AviExtractor aviExtractor, long j) {
        this.this$0 = aviExtractor;
        this.durationUs = j;
    }

    public long getDurationUs() {
        return this.durationUs;
    }

    public SeekMap$SeekPoints getSeekPoints(long j) {
        SeekMap$SeekPoints seekPoints = AviExtractor.access$100(this.this$0)[0].getSeekPoints(j);
        for (int i2 = 1; i2 < AviExtractor.access$100(this.this$0).length; i2++) {
            SeekMap$SeekPoints seekPoints2 = AviExtractor.access$100(this.this$0)[i2].getSeekPoints(j);
            if (seekPoints2.first.position < seekPoints.first.position) {
                seekPoints = seekPoints2;
            }
        }
        return seekPoints;
    }
}
