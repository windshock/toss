package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DummyTrackOutput implements TrackOutput {
    private final byte[] readBuffer = new byte[4096];

    public void format(Format format) {
    }

    public void sampleMetadata(long j, int i2, int i3, int i4, @Nullable TrackOutput.CryptoData cryptoData) {
    }

    public int sampleData(DataReader dataReader, int i2, boolean z, int i3) throws IOException {
        int i4 = dataReader.read(this.readBuffer, 0, Math.min(this.readBuffer.length, i2));
        if (i4 != -1) {
            return i4;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public void sampleData(ParsableByteArray parsableByteArray, int i2, int i3) {
        parsableByteArray.skipBytes(i2);
    }
}
