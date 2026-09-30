package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
interface WavExtractor$OutputWriter {
    void init(int i2, long j) throws ParserException;

    void reset(long j);

    boolean sampleData(ExtractorInput extractorInput, long j) throws IOException;
}
