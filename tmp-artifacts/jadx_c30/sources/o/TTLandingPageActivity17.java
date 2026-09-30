package o;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class TTLandingPageActivity17 extends OutputStream {
    private final byte[] IAuthTabCallback = new byte[1];
    private long onExtraCallback;

    public void onNavigationEvent(long j) {
        if (j != -1) {
            this.onExtraCallback += j;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.IAuthTabCallback;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }
}
