package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder$FramePredicate;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class Id3Peeker {
    private final ParsableByteArray scratch = new ParsableByteArray(10);

    public Metadata peekId3Data(ExtractorInput extractorInput, @Nullable Id3Decoder$FramePredicate id3Decoder$FramePredicate) throws IOException {
        Metadata metadataDecode = null;
        int i2 = 0;
        while (true) {
            try {
                extractorInput.peekFully(this.scratch.getData(), 0, 10);
                this.scratch.setPosition(0);
                if (this.scratch.readUnsignedInt24() != 4801587) {
                    break;
                }
                this.scratch.skipBytes(3);
                int synchSafeInt = this.scratch.readSynchSafeInt();
                int i3 = synchSafeInt + 10;
                if (metadataDecode == null) {
                    byte[] bArr = new byte[i3];
                    System.arraycopy(this.scratch.getData(), 0, bArr, 0, 10);
                    extractorInput.peekFully(bArr, 10, synchSafeInt);
                    metadataDecode = new Id3Decoder(id3Decoder$FramePredicate).decode(bArr, i3);
                } else {
                    extractorInput.advancePeekPosition(synchSafeInt);
                }
                i2 += i3;
            } catch (EOFException unused) {
            }
        }
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(i2);
        return metadataDecode;
    }
}
