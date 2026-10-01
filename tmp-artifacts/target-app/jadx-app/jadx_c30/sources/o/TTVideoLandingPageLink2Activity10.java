package o;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* loaded from: /tmp/toss_alldex/classes30.dex */
class TTVideoLandingPageLink2Activity10 extends InflaterInputStream {
    private long IAuthTabCallback;
    private long onWarmupCompleted;

    public TTVideoLandingPageLink2Activity10(InputStream inputStream, Inflater inflater) {
        super(inputStream, inflater);
    }

    @Override // java.util.zip.InflaterInputStream
    protected void fill() throws IOException {
        super.fill();
        this.IAuthTabCallback += ((InflaterInputStream) this).inf.getRemaining();
    }

    @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i = super.read();
        if (i >= 0) {
            this.onWarmupCompleted++;
        }
        return i;
    }

    @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        if (i3 >= 0) {
            this.onWarmupCompleted += i3;
        }
        return i3;
    }
}
