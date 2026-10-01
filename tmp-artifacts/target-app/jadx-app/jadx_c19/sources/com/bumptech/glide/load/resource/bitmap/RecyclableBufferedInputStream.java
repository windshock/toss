package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import o.Savers_androidKtExternalSyntheticLambda6;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class RecyclableBufferedInputStream extends FilterInputStream {
    private int IAuthTabCallback;
    private int asInterface;
    private volatile byte[] onExtraCallback;
    private int onExtraCallbackWithResult;
    private int onNavigationEvent;
    private final Savers_androidKtExternalSyntheticLambda6 onWarmupCompleted;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    public RecyclableBufferedInputStream(@NonNull InputStream inputStream, @NonNull Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) {
        this(inputStream, savers_androidKtExternalSyntheticLambda6, 65536);
    }

    RecyclableBufferedInputStream(@NonNull InputStream inputStream, @NonNull Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6, int i2) {
        super(inputStream);
        this.IAuthTabCallback = -1;
        this.onWarmupCompleted = savers_androidKtExternalSyntheticLambda6;
        this.onExtraCallback = (byte[]) savers_androidKtExternalSyntheticLambda6.onExtraCallback(i2, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i2;
        int i3;
        int iAvailable;
        synchronized (this) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (this.onExtraCallback == null || inputStream == null) {
                throw IAuthTabCallback();
            }
            i2 = this.onExtraCallbackWithResult;
            i3 = this.asInterface;
            iAvailable = inputStream.available();
        }
        return (i2 - i3) + iAvailable;
    }

    private static IOException IAuthTabCallback() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public void onWarmupCompleted() {
        synchronized (this) {
            this.onNavigationEvent = this.onExtraCallback.length;
        }
    }

    public void onExtraCallbackWithResult() {
        synchronized (this) {
            if (this.onExtraCallback != null) {
                this.onWarmupCompleted.onNavigationEvent((Savers_androidKtExternalSyntheticLambda6) this.onExtraCallback);
                this.onExtraCallback = null;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.onExtraCallback != null) {
            this.onWarmupCompleted.onNavigationEvent((Savers_androidKtExternalSyntheticLambda6) this.onExtraCallback);
            this.onExtraCallback = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    private int onExtraCallbackWithResult(InputStream inputStream, byte[] bArr) throws IOException {
        int i2 = this.IAuthTabCallback;
        if (i2 != -1) {
            int i3 = this.asInterface;
            int i4 = this.onNavigationEvent;
            if (i3 - i2 < i4) {
                if (i2 == 0 && i4 > bArr.length && this.onExtraCallbackWithResult == bArr.length) {
                    int length = bArr.length << 1;
                    if (length <= i4) {
                        i4 = length;
                    }
                    byte[] bArr2 = (byte[]) this.onWarmupCompleted.onExtraCallback(i4, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.onExtraCallback = bArr2;
                    this.onWarmupCompleted.onNavigationEvent((Savers_androidKtExternalSyntheticLambda6) bArr);
                    bArr = bArr2;
                } else if (i2 > 0) {
                    System.arraycopy(bArr, i2, bArr, 0, bArr.length - i2);
                }
                int i5 = this.asInterface - this.IAuthTabCallback;
                this.asInterface = i5;
                this.IAuthTabCallback = 0;
                this.onExtraCallbackWithResult = 0;
                int i6 = inputStream.read(bArr, i5, bArr.length - i5);
                int i7 = this.asInterface;
                if (i6 > 0) {
                    i7 += i6;
                }
                this.onExtraCallbackWithResult = i7;
                return i6;
            }
        }
        int i8 = inputStream.read(bArr);
        if (i8 > 0) {
            this.IAuthTabCallback = -1;
            this.asInterface = 0;
            this.onExtraCallbackWithResult = i8;
        }
        return i8;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i2) {
        synchronized (this) {
            this.onNavigationEvent = Math.max(this.onNavigationEvent, i2);
            this.IAuthTabCallback = this.asInterface;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        synchronized (this) {
            byte[] bArr = this.onExtraCallback;
            InputStream inputStream = ((FilterInputStream) this).in;
            if (bArr == null || inputStream == null) {
                throw IAuthTabCallback();
            }
            if (this.asInterface >= this.onExtraCallbackWithResult && onExtraCallbackWithResult(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.onExtraCallback && (bArr = this.onExtraCallback) == null) {
                throw IAuthTabCallback();
            }
            int i2 = this.onExtraCallbackWithResult;
            int i3 = this.asInterface;
            if (i2 - i3 <= 0) {
                return -1;
            }
            this.asInterface = i3 + 1;
            return bArr[i3] & 255;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        int i5;
        synchronized (this) {
            byte[] bArr2 = this.onExtraCallback;
            if (bArr2 == null) {
                throw IAuthTabCallback();
            }
            if (i3 == 0) {
                return 0;
            }
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream == null) {
                throw IAuthTabCallback();
            }
            int i6 = this.asInterface;
            int i7 = this.onExtraCallbackWithResult;
            if (i6 < i7) {
                int i8 = i7 - i6;
                if (i8 >= i3) {
                    i8 = i3;
                }
                System.arraycopy(bArr2, i6, bArr, i2, i8);
                this.asInterface += i8;
                if (i8 == i3 || inputStream.available() == 0) {
                    return i8;
                }
                i2 += i8;
                i4 = i3 - i8;
            } else {
                i4 = i3;
            }
            while (true) {
                if (this.IAuthTabCallback == -1 && i4 >= bArr2.length) {
                    i5 = inputStream.read(bArr, i2, i4);
                    if (i5 == -1) {
                        return i4 != i3 ? i3 - i4 : -1;
                    }
                } else {
                    if (onExtraCallbackWithResult(inputStream, bArr2) == -1) {
                        return i4 != i3 ? i3 - i4 : -1;
                    }
                    if (bArr2 != this.onExtraCallback && (bArr2 = this.onExtraCallback) == null) {
                        throw IAuthTabCallback();
                    }
                    int i9 = this.onExtraCallbackWithResult;
                    int i10 = this.asInterface;
                    i5 = i9 - i10;
                    if (i5 >= i4) {
                        i5 = i4;
                    }
                    System.arraycopy(bArr2, i10, bArr, i2, i5);
                    this.asInterface += i5;
                }
                i4 -= i5;
                if (i4 == 0) {
                    return i3;
                }
                if (inputStream.available() == 0) {
                    return i3 - i4;
                }
                i2 += i5;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        synchronized (this) {
            if (this.onExtraCallback == null) {
                throw new IOException("Stream is closed");
            }
            int i2 = this.IAuthTabCallback;
            if (-1 == i2) {
                throw new InvalidMarkException("Mark has been invalidated, pos: " + this.asInterface + " markLimit: " + this.onNavigationEvent);
            }
            this.asInterface = i2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        synchronized (this) {
            if (j < 1) {
                return 0L;
            }
            byte[] bArr = this.onExtraCallback;
            if (bArr == null) {
                throw IAuthTabCallback();
            }
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream == null) {
                throw IAuthTabCallback();
            }
            int i2 = this.onExtraCallbackWithResult;
            int i3 = this.asInterface;
            if (i2 - i3 >= j) {
                this.asInterface = (int) (i3 + j);
                return j;
            }
            long j2 = i2 - i3;
            this.asInterface = i2;
            if (this.IAuthTabCallback != -1 && j <= this.onNavigationEvent) {
                if (onExtraCallbackWithResult(inputStream, bArr) == -1) {
                    return j2;
                }
                int i4 = this.onExtraCallbackWithResult;
                int i5 = this.asInterface;
                if (i4 - i5 >= j - j2) {
                    this.asInterface = (int) ((i5 + j) - j2);
                    return j;
                }
                long j3 = i4;
                long j4 = i5;
                this.asInterface = i4;
                return (j2 + j3) - j4;
            }
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.IAuthTabCallback = -1;
            }
            return j2 + jSkip;
        }
    }

    static class InvalidMarkException extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        public InvalidMarkException(String str) {
            super(str);
        }
    }
}
