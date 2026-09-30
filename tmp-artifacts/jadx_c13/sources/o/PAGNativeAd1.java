package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class PAGNativeAd1 extends FilterInputStream {
    private long onNavigationEvent;

    public PAGNativeAd1(InputStream inputStream) {
        super(inputStream);
    }

    protected final void IAuthTabCallback(long j) {
        if (j != -1) {
            this.onNavigationEvent += j;
        }
    }

    public long onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i >= 0) {
            IAuthTabCallback(1L);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i3 >= 0) {
            IAuthTabCallback(i3);
        }
        return i3;
    }
}
