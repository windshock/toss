package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class PsExtractor$PesReader {
    private static final int PES_SCRATCH_SIZE = 64;
    private boolean dtsFlag;
    private int extendedHeaderLength;
    private final ElementaryStreamReader pesPayloadReader;
    private final ParsableBitArray pesScratch = new ParsableBitArray(new byte[PES_SCRATCH_SIZE]);
    private boolean ptsFlag;
    private boolean seenFirstDts;
    private long timeUs;
    private final TimestampAdjuster timestampAdjuster;

    public PsExtractor$PesReader(ElementaryStreamReader elementaryStreamReader, TimestampAdjuster timestampAdjuster) {
        this.pesPayloadReader = elementaryStreamReader;
        this.timestampAdjuster = timestampAdjuster;
    }

    public void seek() {
        this.seenFirstDts = false;
        this.pesPayloadReader.seek();
    }

    public void consume(ParsableByteArray parsableByteArray) throws ParserException {
        parsableByteArray.readBytes(this.pesScratch.data, 0, 3);
        this.pesScratch.setPosition(0);
        parseHeader();
        parsableByteArray.readBytes(this.pesScratch.data, 0, this.extendedHeaderLength);
        this.pesScratch.setPosition(0);
        parseHeaderExtension();
        this.pesPayloadReader.packetStarted(this.timeUs, 4);
        this.pesPayloadReader.consume(parsableByteArray);
        this.pesPayloadReader.packetFinished();
    }

    private void parseHeader() {
        this.pesScratch.skipBits(8);
        this.ptsFlag = this.pesScratch.readBit();
        this.dtsFlag = this.pesScratch.readBit();
        this.pesScratch.skipBits(6);
        this.extendedHeaderLength = this.pesScratch.readBits(8);
    }

    private void parseHeaderExtension() {
        char c;
        this.timeUs = 0L;
        if (this.ptsFlag) {
            this.pesScratch.skipBits(4);
            long bits = this.pesScratch.readBits(3);
            this.pesScratch.skipBits(1);
            long bits2 = this.pesScratch.readBits(15) << 15;
            this.pesScratch.skipBits(1);
            long bits3 = this.pesScratch.readBits(15);
            this.pesScratch.skipBits(1);
            if (this.seenFirstDts || !this.dtsFlag) {
                c = 30;
            } else {
                this.pesScratch.skipBits(4);
                long bits4 = this.pesScratch.readBits(3);
                this.pesScratch.skipBits(1);
                long bits5 = this.pesScratch.readBits(15) << 15;
                this.pesScratch.skipBits(1);
                long bits6 = this.pesScratch.readBits(15);
                this.pesScratch.skipBits(1);
                c = 30;
                this.timestampAdjuster.adjustTsTimestamp((bits4 << 30) | bits5 | bits6);
                this.seenFirstDts = true;
            }
            this.timeUs = this.timestampAdjuster.adjustTsTimestamp((bits << c) | bits2 | bits3);
        }
    }
}
