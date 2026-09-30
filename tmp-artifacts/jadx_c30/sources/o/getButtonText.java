package o;

import java.io.FilterOutputStream;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getButtonText extends FilterOutputStream {
    private long onExtraCallbackWithResult;

    protected void onExtraCallback(long j) {
        if (j != -1) {
            this.onExtraCallbackWithResult += j;
        }
    }

    public long onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        onExtraCallback(i2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        onExtraCallback(1L);
    }
}
