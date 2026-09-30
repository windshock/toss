package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import o.TTLandingPageActivity5;
import org.apache.commons.compress.archivers.dump.DumpArchiveException;
import org.apache.commons.compress.archivers.dump.ShortFileException;
import org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class TTLandingPageActivity81 extends FilterInputStream {
    private int IAuthTabCallback;
    private long onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private int onNavigationEvent;
    private int onTransact;
    private byte[] onWarmupCompleted;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i = this.onTransact;
        int i2 = this.onNavigationEvent;
        return i < i2 ? i2 - i : ((FilterInputStream) this).in.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (((FilterInputStream) this).in == null || ((FilterInputStream) this).in == System.in) {
            return;
        }
        ((FilterInputStream) this).in.close();
    }

    public long onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public byte[] onExtraCallback() throws IOException {
        if (this.onTransact == this.onNavigationEvent) {
            try {
                onExtraCallbackWithResult(true);
            } catch (ShortFileException unused) {
                return null;
            }
        }
        byte[] bArr = new byte[1024];
        System.arraycopy(this.onWarmupCompleted, this.onTransact, bArr, 0, 1024);
        return bArr;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        throw new IllegalArgumentException("All reads must be multiple of record size (1024 bytes.");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (i2 % 1024 != 0) {
            throw new IllegalArgumentException("All reads must be multiple of record size (1024 bytes.");
        }
        while (i3 < i2) {
            if (this.onTransact == this.onNavigationEvent) {
                try {
                    onExtraCallbackWithResult(true);
                } catch (ShortFileException unused) {
                    return -1;
                }
            }
            int i4 = this.onTransact;
            int i5 = i2 - i3;
            int i6 = this.onNavigationEvent;
            if (i4 + i5 > i6) {
                i5 = i6 - i4;
            }
            System.arraycopy(this.onWarmupCompleted, i4, bArr, i, i5);
            this.onTransact += i5;
            i3 += i5;
            i += i5;
        }
        return i3;
    }

    private void onExtraCallbackWithResult(boolean z) throws IOException {
        if (((FilterInputStream) this).in == null) {
            throw new IOException("Input buffer is closed");
        }
        if (!this.onExtraCallbackWithResult || this.IAuthTabCallback == -1) {
            onWarmupCompleted(this.onWarmupCompleted, 0, this.onNavigationEvent);
            this.onExtraCallback += this.onNavigationEvent;
        } else {
            onWarmupCompleted(this.onWarmupCompleted, 0, 4);
            this.onExtraCallback += 4;
            int iOnNavigationEvent = TTLandingPageActivity61.onNavigationEvent(this.onWarmupCompleted, 0);
            if ((iOnNavigationEvent & 1) != 1) {
                onWarmupCompleted(this.onWarmupCompleted, 0, this.onNavigationEvent);
                this.onExtraCallback += this.onNavigationEvent;
            } else {
                int i = (iOnNavigationEvent >> 4) & 268435455;
                byte[] bArrIAuthTabCallback = IAuthTabCallback(i);
                this.onExtraCallback += i;
                if (!z) {
                    Arrays.fill(this.onWarmupCompleted, (byte) 0);
                } else {
                    int i2 = AnonymousClass4.onNavigationEvent[TTLandingPageActivity5.onWarmupCompleted.find((iOnNavigationEvent >> 1) & 3).ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            throw new UnsupportedCompressionAlgorithmException("BZLIB2");
                        }
                        if (i2 == 3) {
                            throw new UnsupportedCompressionAlgorithmException("LZO");
                        }
                        throw new UnsupportedCompressionAlgorithmException();
                    }
                    Inflater inflater = new Inflater();
                    try {
                        try {
                            inflater.setInput(bArrIAuthTabCallback, 0, bArrIAuthTabCallback.length);
                            if (inflater.inflate(this.onWarmupCompleted) != this.onNavigationEvent) {
                                throw new ShortFileException();
                            }
                        } catch (DataFormatException e) {
                            throw new DumpArchiveException("Bad data", e);
                        }
                    } finally {
                        inflater.end();
                    }
                }
            }
        }
        this.IAuthTabCallback++;
        this.onTransact = 0;
    }

    /* renamed from: o.TTLandingPageActivity81$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[TTLandingPageActivity5.onWarmupCompleted.values().length];
            onNavigationEvent = iArr;
            try {
                iArr[TTLandingPageActivity5.onWarmupCompleted.ZLIB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onNavigationEvent[TTLandingPageActivity5.onWarmupCompleted.BZLIB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onNavigationEvent[TTLandingPageActivity5.onWarmupCompleted.LZO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void onWarmupCompleted(byte[] bArr, int i, int i2) throws IOException {
        if (PAGNativeAdLoadListener.onExtraCallback(((FilterInputStream) this).in, bArr, i, i2) < i2) {
            throw new ShortFileException();
        }
    }

    private byte[] IAuthTabCallback(int i) throws IOException {
        byte[] bArrOnExtraCallback = PAGNativeAdLoadListener.onExtraCallback(((FilterInputStream) this).in, i);
        if (bArrOnExtraCallback.length >= i) {
            return bArrOnExtraCallback;
        }
        throw new ShortFileException();
    }

    public byte[] onNavigationEvent() throws IOException {
        byte[] bArr = new byte[1024];
        if (-1 != read(bArr, 0, 1024)) {
            return bArr;
        }
        throw new ShortFileException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long j2 = 0;
        if (j % 1024 != 0) {
            throw new IllegalArgumentException("All reads must be multiple of record size (1024 bytes.");
        }
        while (j2 < j) {
            int i = this.onTransact;
            int i2 = this.onNavigationEvent;
            if (i == i2) {
                try {
                    onExtraCallbackWithResult(j - j2 < ((long) i2));
                } catch (ShortFileException unused) {
                    return -1L;
                }
            }
            int i3 = this.onTransact;
            long j3 = i3;
            long j4 = j - j2;
            long j5 = j3 + j4;
            long j6 = this.onNavigationEvent;
            if (j5 > j6) {
                j4 = j6 - j3;
            }
            this.onTransact = PAGNativeAdData.IAuthTabCallback(i3, j4);
            j2 += j4;
        }
        return j2;
    }
}
