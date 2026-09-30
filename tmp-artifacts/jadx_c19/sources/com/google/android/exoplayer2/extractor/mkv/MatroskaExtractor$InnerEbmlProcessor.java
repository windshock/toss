package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class MatroskaExtractor$InnerEbmlProcessor implements EbmlProcessor {
    final /* synthetic */ MatroskaExtractor this$0;

    private MatroskaExtractor$InnerEbmlProcessor(MatroskaExtractor matroskaExtractor) {
        this.this$0 = matroskaExtractor;
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
    public int getElementType(int i2) {
        return this.this$0.getElementType(i2);
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
    public boolean isLevel1Element(int i2) {
        return this.this$0.isLevel1Element(i2);
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
    public void startMasterElement(int i2, long j, long j2) throws ParserException {
        this.this$0.startMasterElement(i2, j, j2);
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
    public void endMasterElement(int i2) throws ParserException {
        this.this$0.endMasterElement(i2);
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
    public void integerElement(int i2, long j) throws ParserException {
        this.this$0.integerElement(i2, j);
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
    public void floatElement(int i2, double d) throws ParserException {
        this.this$0.floatElement(i2, d);
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
    public void stringElement(int i2, String str) throws ParserException {
        this.this$0.stringElement(i2, str);
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
    public void binaryElement(int i2, int i3, ExtractorInput extractorInput) throws IOException {
        this.this$0.binaryElement(i2, i3, extractorInput);
    }
}
