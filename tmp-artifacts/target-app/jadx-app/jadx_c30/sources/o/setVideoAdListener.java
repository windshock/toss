package o;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.zip.Checksum;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setVideoAdListener extends InputStream {
    private final InputStream onExtraCallbackWithResult;
    private final Checksum onNavigationEvent;

    public setVideoAdListener(Checksum checksum, InputStream inputStream) {
        Objects.requireNonNull(checksum, "checksum");
        Objects.requireNonNull(inputStream, "inputStream");
        this.onNavigationEvent = checksum;
        this.onExtraCallbackWithResult = inputStream;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i = this.onExtraCallbackWithResult.read();
        if (i >= 0) {
            this.onNavigationEvent.update(i);
        }
        return i;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.onExtraCallbackWithResult.read(bArr, i, i2);
        if (i3 >= 0) {
            this.onNavigationEvent.update(bArr, i, i3);
        }
        return i3;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return read() >= 0 ? 1L : 0L;
    }
}
