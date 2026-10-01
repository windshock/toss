package o;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPOutputStream;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class mm {
    private static final byte[] onExtraCallback = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] onNavigationEvent = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    private static final byte[] IAuthTabCallback = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] asBinder = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    private static final byte[] onWarmupCompleted = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
    private static final byte[] onExtraCallbackWithResult = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    private static final byte[] onNavigationEvent(int i) {
        if ((i & 16) == 16) {
            return IAuthTabCallback;
        }
        if ((i & 32) == 32) {
            return onWarmupCompleted;
        }
        return onExtraCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] onExtraCallback(int i) {
        if ((i & 16) == 16) {
            return asBinder;
        }
        if ((i & 32) == 32) {
            return onExtraCallbackWithResult;
        }
        return onNavigationEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] onExtraCallback(byte[] bArr, byte[] bArr2, int i, int i2) {
        IAuthTabCallback(bArr2, 0, i, bArr, 0, i2);
        return bArr;
    }

    private static byte[] IAuthTabCallback(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        byte[] bArrOnNavigationEvent = onNavigationEvent(i4);
        int i5 = (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0) | (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0) | (i2 > 2 ? (bArr[i + 2] << 24) >>> 24 : 0);
        if (i2 == 1) {
            bArr2[i3] = bArrOnNavigationEvent[i5 >>> 18];
            bArr2[i3 + 1] = bArrOnNavigationEvent[(i5 >>> 12) & 63];
            bArr2[i3 + 2] = 61;
            bArr2[i3 + 3] = 61;
            return bArr2;
        }
        if (i2 == 2) {
            bArr2[i3] = bArrOnNavigationEvent[i5 >>> 18];
            bArr2[i3 + 1] = bArrOnNavigationEvent[(i5 >>> 12) & 63];
            bArr2[i3 + 2] = bArrOnNavigationEvent[(i5 >>> 6) & 63];
            bArr2[i3 + 3] = 61;
            return bArr2;
        }
        if (i2 != 3) {
            return bArr2;
        }
        bArr2[i3] = bArrOnNavigationEvent[i5 >>> 18];
        bArr2[i3 + 1] = bArrOnNavigationEvent[(i5 >>> 12) & 63];
        bArr2[i3 + 2] = bArrOnNavigationEvent[(i5 >>> 6) & 63];
        bArr2[i3 + 3] = bArrOnNavigationEvent[i5 & 63];
        return bArr2;
    }

    public static String onExtraCallback(byte[] bArr) {
        try {
            return IAuthTabCallback(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    public static String IAuthTabCallback(byte[] bArr, int i, int i2, int i3) throws Throwable {
        byte[] bArrOnWarmupCompleted = onWarmupCompleted(bArr, i, i2, i3);
        try {
            return new String(bArrOnWarmupCompleted, "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArrOnWarmupCompleted);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.OutputStream, java.util.zip.GZIPOutputStream] */
    public static byte[] onWarmupCompleted(byte[] bArr, int i, int i2, int i3) throws Throwable {
        onNavigationEvent onnavigationevent;
        Object obj;
        ?? gZIPOutputStream;
        if (bArr == null) {
            throw new IllegalArgumentException("Cannot serialize a null array.");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + i);
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Cannot have length offset: " + i2);
        }
        int i4 = i + i2;
        ?? length = bArr.length;
        if (i4 > length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr.length)));
        }
        if ((i3 & 2) != 0) {
            onNavigationEvent onnavigationevent2 = null;
            try {
                try {
                    length = new ByteArrayOutputStream();
                    try {
                        onnavigationevent = new onNavigationEvent(length, i3 | 1);
                        try {
                            gZIPOutputStream = new GZIPOutputStream(onnavigationevent);
                        } catch (IOException e) {
                            e = e;
                            gZIPOutputStream = 0;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        obj = null;
                    } catch (Throwable th) {
                        th = th;
                        onnavigationevent = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e3) {
                throw e3;
            } catch (Throwable th3) {
                th = th3;
                length = 0;
                onnavigationevent = null;
            }
            try {
                gZIPOutputStream.write(bArr, i, i2);
                gZIPOutputStream.close();
                try {
                    gZIPOutputStream.close();
                } catch (Exception unused) {
                }
                try {
                    onnavigationevent.close();
                } catch (Exception unused2) {
                }
                try {
                    length.close();
                } catch (Exception unused3) {
                }
                return length.toByteArray();
            } catch (IOException e4) {
                e = e4;
                onnavigationevent2 = onnavigationevent;
                obj = gZIPOutputStream;
                throw e;
            } catch (Throwable th4) {
                th = th4;
                onnavigationevent2 = gZIPOutputStream;
                try {
                    onnavigationevent2.close();
                } catch (Exception unused4) {
                }
                try {
                    onnavigationevent.close();
                } catch (Exception unused5) {
                }
                try {
                    length.close();
                    throw th;
                } catch (Exception unused6) {
                    throw th;
                }
            }
        }
        boolean z = (i3 & 8) != 0;
        int i5 = ((i2 / 3) << 2) + (i2 % 3 > 0 ? 4 : 0);
        if (z) {
            i5 += i5 / 76;
        }
        int i6 = i5;
        byte[] bArr2 = new byte[i6];
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < i2 - 2) {
            IAuthTabCallback(bArr, i7 + i, 3, bArr2, i8, i3);
            int i10 = i9 + 4;
            if (!z || i10 < 76) {
                i9 = i10;
            } else {
                bArr2[i8 + 4] = 10;
                i8++;
                i9 = 0;
            }
            i7 += 3;
            i8 += 4;
        }
        if (i7 < i2) {
            IAuthTabCallback(bArr, i7 + i, i2 - i7, bArr2, i8, i3);
            i8 += 4;
        }
        int i11 = i8;
        if (i11 > i6 - 1) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i11];
        System.arraycopy(bArr2, 0, bArr3, 0, i11);
        return bArr3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int onWarmupCompleted(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        int i5;
        if (bArr == null) {
            throw new IllegalArgumentException("Source array was null.");
        }
        if (bArr2 == null) {
            throw new IllegalArgumentException("Destination array was null.");
        }
        if (i < 0 || (i4 = i + 3) >= bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i)));
        }
        if (i2 < 0 || (i5 = i2 + 2) >= bArr2.length) {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(bArr2.length), Integer.valueOf(i2)));
        }
        byte[] bArrOnExtraCallback = onExtraCallback(i3);
        byte b = bArr[i + 2];
        if (b == 61) {
            bArr2[i2] = (byte) ((((bArrOnExtraCallback[bArr[i + 1]] & 255) << 12) | ((bArrOnExtraCallback[bArr[i]] & 255) << 18)) >>> 16);
            return 1;
        }
        byte b2 = bArr[i4];
        if (b2 == 61) {
            int i6 = ((bArrOnExtraCallback[bArr[i + 1]] & 255) << 12) | ((bArrOnExtraCallback[bArr[i]] & 255) << 18) | ((bArrOnExtraCallback[b] & 255) << 6);
            bArr2[i2] = (byte) (i6 >>> 16);
            bArr2[i2 + 1] = (byte) (i6 >>> 8);
            return 2;
        }
        int i7 = ((bArrOnExtraCallback[bArr[i + 1]] & 255) << 12) | ((bArrOnExtraCallback[bArr[i]] & 255) << 18) | ((bArrOnExtraCallback[b] & 255) << 6) | (bArrOnExtraCallback[b2] & 255);
        bArr2[i2] = (byte) (i7 >> 16);
        bArr2[i2 + 1] = (byte) (i7 >> 8);
        bArr2[i5] = (byte) i7;
        return 3;
    }

    public static class onNavigationEvent extends FilterOutputStream {
        private byte[] IAuthTabCallback;
        private boolean IAuthTabCallbackDefault;
        private int IAuthTabCallbackStub;
        private int asBinder;
        private boolean asInterface;
        private boolean onExtraCallback;
        private byte[] onExtraCallbackWithResult;
        private int onNavigationEvent;
        private int onTransact;
        private byte[] onWarmupCompleted;

        public onNavigationEvent(OutputStream outputStream, int i) {
            super(outputStream);
            this.onExtraCallback = (i & 8) != 0;
            boolean z = (i & 1) != 0;
            this.IAuthTabCallbackDefault = z;
            int i2 = z ? 3 : 4;
            this.onNavigationEvent = i2;
            this.onExtraCallbackWithResult = new byte[i2];
            this.IAuthTabCallbackStub = 0;
            this.onTransact = 0;
            this.asInterface = false;
            this.onWarmupCompleted = new byte[4];
            this.asBinder = i;
            this.IAuthTabCallback = mm.onExtraCallback(i);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i) throws IOException {
            if (this.asInterface) {
                ((FilterOutputStream) this).out.write(i);
                return;
            }
            if (this.IAuthTabCallbackDefault) {
                byte[] bArr = this.onExtraCallbackWithResult;
                int i2 = this.IAuthTabCallbackStub;
                int i3 = i2 + 1;
                this.IAuthTabCallbackStub = i3;
                bArr[i2] = (byte) i;
                int i4 = this.onNavigationEvent;
                if (i3 >= i4) {
                    ((FilterOutputStream) this).out.write(mm.onExtraCallback(this.onWarmupCompleted, bArr, i4, this.asBinder));
                    int i5 = this.onTransact + 4;
                    this.onTransact = i5;
                    if (this.onExtraCallback && i5 >= 76) {
                        ((FilterOutputStream) this).out.write(10);
                        this.onTransact = 0;
                    }
                    this.IAuthTabCallbackStub = 0;
                    return;
                }
                return;
            }
            byte b = this.IAuthTabCallback[i & 127];
            if (b <= -5) {
                if (b != -5) {
                    throw new IOException("Invalid character in Base64 data.");
                }
                return;
            }
            byte[] bArr2 = this.onExtraCallbackWithResult;
            int i6 = this.IAuthTabCallbackStub;
            int i7 = i6 + 1;
            this.IAuthTabCallbackStub = i7;
            bArr2[i6] = (byte) i;
            if (i7 >= this.onNavigationEvent) {
                ((FilterOutputStream) this).out.write(this.onWarmupCompleted, 0, mm.onWarmupCompleted(bArr2, 0, this.onWarmupCompleted, 0, this.asBinder));
                this.IAuthTabCallbackStub = 0;
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            if (this.asInterface) {
                ((FilterOutputStream) this).out.write(bArr, i, i2);
                return;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                write(bArr[i + i3]);
            }
        }

        public void IAuthTabCallback() throws IOException {
            int i = this.IAuthTabCallbackStub;
            if (i > 0) {
                if (this.IAuthTabCallbackDefault) {
                    ((FilterOutputStream) this).out.write(mm.onExtraCallback(this.onWarmupCompleted, this.onExtraCallbackWithResult, i, this.asBinder));
                    this.IAuthTabCallbackStub = 0;
                    return;
                }
                throw new IOException("Base64 input not properly padded.");
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            IAuthTabCallback();
            super.close();
            this.onExtraCallbackWithResult = null;
            ((FilterOutputStream) this).out = null;
        }
    }
}
