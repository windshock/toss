package com.google.android.exoplayer2.extractor;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ForwardingExtractorInput implements ExtractorInput {
    private final ExtractorInput input;

    public ForwardingExtractorInput(ExtractorInput extractorInput) {
        this.input = extractorInput;
    }

    public int read(byte[] bArr, int i2, int i3) throws IOException {
        return this.input.read(bArr, i2, i3);
    }

    public boolean readFully(byte[] bArr, int i2, int i3, boolean z) throws IOException {
        return this.input.readFully(bArr, i2, i3, z);
    }

    public void readFully(byte[] bArr, int i2, int i3) throws IOException {
        this.input.readFully(bArr, i2, i3);
    }

    public int skip(int i2) throws IOException {
        return this.input.skip(i2);
    }

    public boolean skipFully(int i2, boolean z) throws IOException {
        return this.input.skipFully(i2, z);
    }

    public void skipFully(int i2) throws IOException {
        this.input.skipFully(i2);
    }

    public int peek(byte[] bArr, int i2, int i3) throws IOException {
        return this.input.peek(bArr, i2, i3);
    }

    public boolean peekFully(byte[] bArr, int i2, int i3, boolean z) throws IOException {
        return this.input.peekFully(bArr, i2, i3, z);
    }

    public void peekFully(byte[] bArr, int i2, int i3) throws IOException {
        this.input.peekFully(bArr, i2, i3);
    }

    public boolean advancePeekPosition(int i2, boolean z) throws IOException {
        return this.input.advancePeekPosition(i2, z);
    }

    public void advancePeekPosition(int i2) throws IOException {
        this.input.advancePeekPosition(i2);
    }

    public void resetPeekPosition() {
        this.input.resetPeekPosition();
    }

    public long getPeekPosition() {
        return this.input.getPeekPosition();
    }

    public long getPosition() {
        return this.input.getPosition();
    }

    public long getLength() {
        return this.input.getLength();
    }

    public <E extends Throwable> void setRetryPosition(long j, E e) throws Throwable {
        this.input.setRetryPosition(j, e);
    }
}
