package com.google.android.exoplayer2.extractor.avi;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class AviExtractor$ChunkHeaderHolder {
    public int chunkType;
    public int listType;
    public int size;

    private AviExtractor$ChunkHeaderHolder() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.exoplayer2.ParserException */
    public void populateWithListHeaderFrom(ParsableByteArray parsableByteArray) throws ParserException {
        populateFrom(parsableByteArray);
        if (this.chunkType != 1414744396) {
            throw ParserException.createForMalformedContainer("LIST expected, found: " + this.chunkType, (Throwable) null);
        }
        this.listType = parsableByteArray.readLittleEndianInt();
    }

    public void populateFrom(ParsableByteArray parsableByteArray) {
        this.chunkType = parsableByteArray.readLittleEndianInt();
        this.size = parsableByteArray.readLittleEndianInt();
        this.listType = 0;
    }
}
