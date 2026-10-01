package o;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setVideoCacheUrl extends Reader {
    PushbackInputStream IAuthTabCallback;
    private static final Charset asBinder = StandardCharsets.UTF_8;
    private static final Charset onExtraCallbackWithResult = StandardCharsets.UTF_16BE;
    private static final Charset onNavigationEvent = StandardCharsets.UTF_16LE;
    private static final Charset IAuthTabCallbackStub = Charset.forName("UTF-32BE");
    private static final Charset asInterface = Charset.forName("UTF-32LE");
    InputStreamReader onWarmupCompleted = null;
    Charset onExtraCallback = asBinder;

    public setVideoCacheUrl(InputStream inputStream) {
        this.IAuthTabCallback = new PushbackInputStream(inputStream, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onExtraCallbackWithResult() throws IOException {
        int i;
        if (this.onWarmupCompleted != null) {
            return;
        }
        byte[] bArr = new byte[4];
        int i2 = this.IAuthTabCallback.read(bArr, 0, 4);
        byte b = bArr[0];
        if (b == 0 && bArr[1] == 0 && bArr[2] == -2 && bArr[3] == -1) {
            this.onExtraCallback = IAuthTabCallbackStub;
        } else if (b == -1 && bArr[1] == -2 && bArr[2] == 0 && bArr[3] == 0) {
            this.onExtraCallback = asInterface;
        } else {
            if (b == -17 && bArr[1] == -69 && bArr[2] == -65) {
                this.onExtraCallback = asBinder;
                i = i2 - 3;
            } else {
                if (b == -2 && bArr[1] == -1) {
                    this.onExtraCallback = onExtraCallbackWithResult;
                } else if (b == -1 && bArr[1] == -2) {
                    this.onExtraCallback = onNavigationEvent;
                } else {
                    this.onExtraCallback = asBinder;
                    i = i2;
                }
                i = i2 - 2;
            }
            if (i > 0) {
                this.IAuthTabCallback.unread(bArr, i2 - i, i);
            }
            this.onWarmupCompleted = new InputStreamReader(this.IAuthTabCallback, this.onExtraCallback.newDecoder().onUnmappableCharacter(CodingErrorAction.REPORT));
        }
        i = i2 - 4;
        if (i > 0) {
        }
        this.onWarmupCompleted = new InputStreamReader(this.IAuthTabCallback, this.onExtraCallback.newDecoder().onUnmappableCharacter(CodingErrorAction.REPORT));
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        onExtraCallbackWithResult();
        this.onWarmupCompleted.close();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        onExtraCallbackWithResult();
        return this.onWarmupCompleted.read(cArr, i, i2);
    }
}
