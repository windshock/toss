package com.google.android.exoplayer2.text.cea;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.text.SubtitleInputBuffer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class CeaDecoder$CeaInputBuffer extends SubtitleInputBuffer implements Comparable<CeaDecoder$CeaInputBuffer> {
    private long queuedInputBufferCount;

    private CeaDecoder$CeaInputBuffer() {
    }

    @Override // java.lang.Comparable
    public int compareTo(CeaDecoder$CeaInputBuffer ceaDecoder$CeaInputBuffer) {
        if (isEndOfStream() != ceaDecoder$CeaInputBuffer.isEndOfStream()) {
            return isEndOfStream() ? 1 : -1;
        }
        long j = ((DecoderInputBuffer) this).timeUs - ((DecoderInputBuffer) ceaDecoder$CeaInputBuffer).timeUs;
        if (j == 0) {
            j = this.queuedInputBufferCount - ceaDecoder$CeaInputBuffer.queuedInputBufferCount;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
