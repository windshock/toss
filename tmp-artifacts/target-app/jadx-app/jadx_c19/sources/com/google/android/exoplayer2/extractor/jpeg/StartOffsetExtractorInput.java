package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ForwardingExtractorInput;
import com.google.android.exoplayer2.util.Assertions;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class StartOffsetExtractorInput extends ForwardingExtractorInput {
    private final long startOffset;

    public StartOffsetExtractorInput(ExtractorInput extractorInput, long j) {
        super(extractorInput);
        Assertions.checkArgument(extractorInput.getPosition() >= j);
        this.startOffset = j;
    }

    @Override // com.google.android.exoplayer2.extractor.ForwardingExtractorInput
    public long getPosition() {
        return super.getPosition() - this.startOffset;
    }

    @Override // com.google.android.exoplayer2.extractor.ForwardingExtractorInput
    public long getPeekPosition() {
        return super.getPeekPosition() - this.startOffset;
    }

    @Override // com.google.android.exoplayer2.extractor.ForwardingExtractorInput
    public long getLength() {
        return super.getLength() - this.startOffset;
    }

    @Override // com.google.android.exoplayer2.extractor.ForwardingExtractorInput
    public <E extends Throwable> void setRetryPosition(long j, E e) throws Throwable {
        super.setRetryPosition(j + this.startOffset, e);
    }
}
