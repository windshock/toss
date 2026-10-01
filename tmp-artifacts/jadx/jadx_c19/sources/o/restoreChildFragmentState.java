package o;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class restoreChildFragmentState extends Writer {
    private byte[] IAuthTabCallback;
    private int asInterface;
    private int onExtraCallback = 0;
    private OutputStream onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final performViewCreated onWarmupCompleted;

    public restoreChildFragmentState(performViewCreated performviewcreated, OutputStream outputStream) {
        this.onWarmupCompleted = performviewcreated;
        this.onExtraCallbackWithResult = outputStream;
        this.IAuthTabCallback = performviewcreated.onExtraCallbackWithResult();
        this.onNavigationEvent = r1.length - 4;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) throws IOException {
        write(c);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = this.onExtraCallbackWithResult;
        if (outputStream != null) {
            int i2 = this.onExtraCallback;
            if (i2 > 0) {
                outputStream.write(this.IAuthTabCallback, 0, i2);
                this.onExtraCallback = 0;
            }
            OutputStream outputStream2 = this.onExtraCallbackWithResult;
            this.onExtraCallbackWithResult = null;
            byte[] bArr = this.IAuthTabCallback;
            if (bArr != null) {
                this.IAuthTabCallback = null;
                this.onWarmupCompleted.IAuthTabCallback(bArr);
            }
            outputStream2.close();
            int i3 = this.asInterface;
            this.asInterface = 0;
            if (i3 > 0) {
                onWarmupCompleted(i3);
            }
        }
        this.onWarmupCompleted.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this.onExtraCallbackWithResult;
        if (outputStream != null) {
            int i2 = this.onExtraCallback;
            if (i2 > 0) {
                outputStream.write(this.IAuthTabCallback, 0, i2);
                this.onExtraCallback = 0;
            }
            this.onExtraCallbackWithResult.flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) throws IOException {
        int i4;
        if (i3 < 2) {
            if (i3 == 1) {
                write(cArr[i2]);
                return;
            }
            return;
        }
        if (this.asInterface > 0) {
            i3--;
            write(onExtraCallback(cArr[i2]));
            i2++;
        }
        int i5 = this.onExtraCallback;
        byte[] bArr = this.IAuthTabCallback;
        int i6 = this.onNavigationEvent;
        int i7 = i3 + i2;
        while (i2 < i7) {
            if (i5 >= i6) {
                this.onExtraCallbackWithResult.write(bArr, 0, i5);
                i5 = 0;
            }
            int i8 = i2 + 1;
            char c = cArr[i2];
            if (c < 128) {
                i4 = i5 + 1;
                bArr[i5] = (byte) c;
                int i9 = i7 - i8;
                int i10 = i6 - i4;
                if (i9 > i10) {
                    i9 = i10;
                }
                int i11 = i8;
                while (i11 < i9 + i8) {
                    int i12 = i11 + 1;
                    char c2 = cArr[i11];
                    if (c2 < 128) {
                        bArr[i4] = (byte) c2;
                        i11 = i12;
                        i4++;
                    } else {
                        c = c2;
                        i5 = i4;
                        i8 = i12;
                    }
                }
                i2 = i11;
                i5 = i4;
            }
            if (c < 2048) {
                bArr[i5] = (byte) ((c >> 6) | 192);
                i4 = i5 + 2;
                bArr[i5 + 1] = (byte) ((c & '?') | 128);
            } else if (c < 55296 || c > 57343) {
                bArr[i5] = (byte) ((c >> '\f') | 224);
                bArr[i5 + 1] = (byte) (((c >> 6) & 63) | 128);
                i4 = i5 + 3;
                bArr[i5 + 2] = (byte) ((c & '?') | 128);
            } else {
                if (c > 56319) {
                    this.onExtraCallback = i5;
                    onWarmupCompleted(c);
                }
                this.asInterface = c;
                if (i8 >= i7) {
                    break;
                }
                i2 = i8 + 1;
                int iOnExtraCallback = onExtraCallback(cArr[i8]);
                if (iOnExtraCallback > 1114111) {
                    this.onExtraCallback = i5;
                    onWarmupCompleted(iOnExtraCallback);
                }
                bArr[i5] = (byte) ((iOnExtraCallback >> 18) | 240);
                bArr[i5 + 1] = (byte) (((iOnExtraCallback >> 12) & 63) | 128);
                bArr[i5 + 2] = (byte) (((iOnExtraCallback >> 6) & 63) | 128);
                i4 = i5 + 4;
                bArr[i5 + 3] = (byte) ((iOnExtraCallback & 63) | 128);
                i5 = i4;
            }
            i2 = i8;
            i5 = i4;
        }
        this.onExtraCallback = i5;
    }

    @Override // java.io.Writer
    public void write(int i2) throws IOException {
        int i3;
        if (this.asInterface > 0) {
            i2 = onExtraCallback(i2);
        } else if (i2 >= 55296 && i2 <= 57343) {
            if (i2 > 56319) {
                onWarmupCompleted(i2);
            }
            this.asInterface = i2;
            return;
        }
        int i4 = this.onExtraCallback;
        if (i4 >= this.onNavigationEvent) {
            this.onExtraCallbackWithResult.write(this.IAuthTabCallback, 0, i4);
            this.onExtraCallback = 0;
        }
        if (i2 < 128) {
            byte[] bArr = this.IAuthTabCallback;
            int i5 = this.onExtraCallback;
            this.onExtraCallback = i5 + 1;
            bArr[i5] = (byte) i2;
            return;
        }
        int i6 = this.onExtraCallback;
        if (i2 < 2048) {
            byte[] bArr2 = this.IAuthTabCallback;
            bArr2[i6] = (byte) ((i2 >> 6) | 192);
            i3 = i6 + 2;
            bArr2[i6 + 1] = (byte) ((i2 & 63) | 128);
        } else if (i2 <= 65535) {
            byte[] bArr3 = this.IAuthTabCallback;
            bArr3[i6] = (byte) ((i2 >> 12) | 224);
            bArr3[i6 + 1] = (byte) (((i2 >> 6) & 63) | 128);
            i3 = i6 + 3;
            bArr3[i6 + 2] = (byte) ((i2 & 63) | 128);
        } else {
            if (i2 > 1114111) {
                onWarmupCompleted(i2);
            }
            byte[] bArr4 = this.IAuthTabCallback;
            bArr4[i6] = (byte) ((i2 >> 18) | 240);
            bArr4[i6 + 1] = (byte) (((i2 >> 12) & 63) | 128);
            bArr4[i6 + 2] = (byte) (((i2 >> 6) & 63) | 128);
            i3 = i6 + 4;
            bArr4[i6 + 3] = (byte) ((i2 & 63) | 128);
        }
        this.onExtraCallback = i3;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    @Override // java.io.Writer
    public void write(String str, int i2, int i3) throws IOException {
        int i4;
        if (i3 < 2) {
            if (i3 == 1) {
                write(str.charAt(i2));
                return;
            }
            return;
        }
        if (this.asInterface > 0) {
            i3--;
            write(onExtraCallback(str.charAt(i2)));
            i2++;
        }
        int i5 = this.onExtraCallback;
        byte[] bArr = this.IAuthTabCallback;
        int i6 = this.onNavigationEvent;
        int i7 = i3 + i2;
        while (i2 < i7) {
            if (i5 >= i6) {
                this.onExtraCallbackWithResult.write(bArr, 0, i5);
                i5 = 0;
            }
            int i8 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                i4 = i5 + 1;
                bArr[i5] = (byte) cCharAt;
                int i9 = i7 - i8;
                int i10 = i6 - i4;
                if (i9 > i10) {
                    i9 = i10;
                }
                int i11 = i8;
                while (i11 < i9 + i8) {
                    int i12 = i11 + 1;
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 < 128) {
                        bArr[i4] = (byte) cCharAt2;
                        i11 = i12;
                        i4++;
                    } else {
                        cCharAt = cCharAt2;
                        i5 = i4;
                        i8 = i12;
                    }
                }
                i2 = i11;
                i5 = i4;
            }
            if (cCharAt < 2048) {
                bArr[i5] = (byte) ((cCharAt >> 6) | 192);
                i4 = i5 + 2;
                bArr[i5 + 1] = (byte) ((cCharAt & '?') | 128);
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                bArr[i5] = (byte) ((cCharAt >> '\f') | 224);
                bArr[i5 + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                i4 = i5 + 3;
                bArr[i5 + 2] = (byte) ((cCharAt & '?') | 128);
            } else {
                if (cCharAt > 56319) {
                    this.onExtraCallback = i5;
                    onWarmupCompleted(cCharAt);
                }
                this.asInterface = cCharAt;
                if (i8 >= i7) {
                    break;
                }
                i2 = i8 + 1;
                int iOnExtraCallback = onExtraCallback(str.charAt(i8));
                if (iOnExtraCallback > 1114111) {
                    this.onExtraCallback = i5;
                    onWarmupCompleted(iOnExtraCallback);
                }
                bArr[i5] = (byte) ((iOnExtraCallback >> 18) | 240);
                bArr[i5 + 1] = (byte) (((iOnExtraCallback >> 12) & 63) | 128);
                bArr[i5 + 2] = (byte) (((iOnExtraCallback >> 6) & 63) | 128);
                i4 = i5 + 4;
                bArr[i5 + 3] = (byte) ((iOnExtraCallback & 63) | 128);
                i5 = i4;
            }
            i2 = i8;
            i5 = i4;
        }
        this.onExtraCallback = i5;
    }

    protected int onExtraCallback(int i2) throws IOException {
        int i3 = this.asInterface;
        this.asInterface = 0;
        if (i2 >= 56320 && i2 <= 57343) {
            return ((i3 << 10) + i2) - 56613888;
        }
        throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(i3) + ", second 0x" + Integer.toHexString(i2) + "; illegal combination");
    }

    protected static void onWarmupCompleted(int i2) throws IOException {
        throw new IOException(onExtraCallbackWithResult(i2));
    }

    protected static String onExtraCallbackWithResult(int i2) {
        if (i2 > 1114111) {
            return "Illegal character point (0x" + Integer.toHexString(i2) + ") to output; max is 0x10FFFF as per RFC 4627";
        }
        if (i2 < 55296) {
            return "Illegal character point (0x" + Integer.toHexString(i2) + ") to output";
        }
        if (i2 <= 56319) {
            return "Unmatched first part of surrogate pair (0x" + Integer.toHexString(i2) + ")";
        }
        return "Unmatched second part of surrogate pair (0x" + Integer.toHexString(i2) + ")";
    }
}
