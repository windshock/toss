package o;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.serialization.json.internal.JsonEncodingException;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class fbyycx2 implements setPreProgressHundred {
    private final byte[] onExtraCallback;
    private int onExtraCallbackWithResult;
    private final OutputStream onNavigationEvent;
    private char[] onWarmupCompleted;

    public fbyycx2(@NotNull OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "");
        this.onNavigationEvent = outputStream;
        this.onExtraCallback = setSubmitTimestamp.onNavigationEvent.onExtraCallbackWithResult();
        this.onWarmupCompleted = setDataDirectorySuffix.onWarmupCompleted.onExtraCallback();
    }

    @Override // o.setPreProgressHundred
    public void onExtraCallback(long j) throws IOException {
        onNavigationEvent(String.valueOf(j));
    }

    @Override // o.setPreProgressHundred
    public void onExtraCallback(char c) throws IOException {
        onWarmupCompleted(c);
    }

    @Override // o.setPreProgressHundred
    public void onNavigationEvent(@NotNull String str) throws IOException {
        Intrinsics.checkNotNullParameter(str, "");
        int length = str.length();
        onExtraCallback(0, length);
        str.getChars(0, length, this.onWarmupCompleted, 0);
        onWarmupCompleted(this.onWarmupCompleted, length);
    }

    @Override // o.setPreProgressHundred
    public void onExtraCallback(@NotNull String str) throws IOException {
        Intrinsics.checkNotNullParameter(str, "");
        onExtraCallback(0, str.length() + 2);
        char[] cArr = this.onWarmupCompleted;
        cArr[0] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, 1);
        int i = length + 1;
        for (int i2 = 1; i2 < i; i2++) {
            char c = cArr[i2];
            if (c < PglCryptUtils.onExtraCallback().length && PglCryptUtils.onExtraCallback()[c] != 0) {
                onNavigationEvent(i2, str);
                return;
            }
        }
        cArr[i] = '\"';
        onWarmupCompleted(cArr, length + 2);
        IAuthTabCallback();
    }

    private final void onNavigationEvent(int i, String str) throws IOException {
        byte b;
        int length = str.length();
        for (int i2 = i - 1; i2 < length; i2++) {
            int iOnExtraCallback = onExtraCallback(i, 2);
            char cCharAt = str.charAt(i2);
            if (cCharAt >= PglCryptUtils.onExtraCallback().length || (b = PglCryptUtils.onExtraCallback()[cCharAt]) == 0) {
                this.onWarmupCompleted[iOnExtraCallback] = cCharAt;
                i = iOnExtraCallback + 1;
            } else if (b == 1) {
                String str2 = PglCryptUtils.onNavigationEvent()[cCharAt];
                Intrinsics.checkNotNull(str2);
                int iOnExtraCallback2 = onExtraCallback(iOnExtraCallback, str2.length());
                str2.getChars(0, str2.length(), this.onWarmupCompleted, iOnExtraCallback2);
                i = iOnExtraCallback2 + str2.length();
            } else {
                char[] cArr = this.onWarmupCompleted;
                cArr[iOnExtraCallback] = '\\';
                cArr[iOnExtraCallback + 1] = (char) b;
                i = iOnExtraCallback + 2;
            }
        }
        onExtraCallback(i, 1);
        char[] cArr2 = this.onWarmupCompleted;
        cArr2[i] = '\"';
        onWarmupCompleted(cArr2, i + 1);
        IAuthTabCallback();
    }

    private final int onExtraCallback(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = this.onWarmupCompleted;
        if (cArr.length <= i3) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, RangesKt___RangesKt.coerceAtLeast(i3, i << 1));
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "");
            this.onWarmupCompleted = cArrCopyOf;
        }
        return i;
    }

    public void onExtraCallbackWithResult() throws IOException {
        IAuthTabCallback();
        setDataDirectorySuffix.onWarmupCompleted.IAuthTabCallback(this.onWarmupCompleted);
        setSubmitTimestamp.onNavigationEvent.onWarmupCompleted(this.onExtraCallback);
    }

    private final void IAuthTabCallback() throws IOException {
        this.onNavigationEvent.write(this.onExtraCallback, 0, this.onExtraCallbackWithResult);
        this.onExtraCallbackWithResult = 0;
    }

    private final void onWarmupCompleted(char[] cArr, int i) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException("count < 0");
        }
        if (i > cArr.length) {
            throw new IllegalArgumentException(("count > string.length: " + i + " > " + cArr.length).toString());
        }
        int i2 = 0;
        while (i2 < i) {
            char c = cArr[i2];
            if (c < 128) {
                if (this.onExtraCallback.length - this.onExtraCallbackWithResult <= 0) {
                    IAuthTabCallback();
                }
                byte[] bArr = this.onExtraCallback;
                int i3 = this.onExtraCallbackWithResult;
                int i4 = i3 + 1;
                this.onExtraCallbackWithResult = i4;
                bArr[i3] = (byte) c;
                i2++;
                int iMin = Math.min(i, (bArr.length - i4) + i2);
                while (i2 < iMin) {
                    char c2 = cArr[i2];
                    if (c2 < 128) {
                        byte[] bArr2 = this.onExtraCallback;
                        int i5 = this.onExtraCallbackWithResult;
                        this.onExtraCallbackWithResult = i5 + 1;
                        bArr2[i5] = (byte) c2;
                        i2++;
                    }
                }
            } else {
                if (c < 2048) {
                    if (this.onExtraCallback.length - this.onExtraCallbackWithResult < 2) {
                        IAuthTabCallback();
                    }
                    byte[] bArr3 = this.onExtraCallback;
                    int i6 = this.onExtraCallbackWithResult;
                    bArr3[i6] = (byte) ((c >> 6) | BERTags.PRIVATE);
                    this.onExtraCallbackWithResult = i6 + 2;
                    bArr3[i6 + 1] = (byte) ((c & '?') | 128);
                } else if (c >= 55296 && c <= 57343) {
                    int i7 = i2 + 1;
                    char c3 = i7 < i ? cArr[i7] : (char) 0;
                    if (c > 56319 || 56320 > c3 || c3 >= 57344) {
                        if (this.onExtraCallback.length - this.onExtraCallbackWithResult <= 0) {
                            IAuthTabCallback();
                        }
                        byte[] bArr4 = this.onExtraCallback;
                        int i8 = this.onExtraCallbackWithResult;
                        this.onExtraCallbackWithResult = i8 + 1;
                        bArr4[i8] = 63;
                        i2 = i7;
                    } else {
                        int i9 = (((c & 1023) << 10) | (c3 & 1023)) + Imgproc.FLOODFILL_FIXED_RANGE;
                        if (this.onExtraCallback.length - this.onExtraCallbackWithResult < 4) {
                            IAuthTabCallback();
                        }
                        byte[] bArr5 = this.onExtraCallback;
                        int i10 = this.onExtraCallbackWithResult;
                        bArr5[i10] = (byte) ((i9 >> 18) | 240);
                        bArr5[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                        bArr5[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                        this.onExtraCallbackWithResult = i10 + 4;
                        bArr5[i10 + 3] = (byte) ((i9 & 63) | 128);
                        i2 += 2;
                    }
                } else {
                    if (this.onExtraCallback.length - this.onExtraCallbackWithResult < 3) {
                        IAuthTabCallback();
                    }
                    byte[] bArr6 = this.onExtraCallback;
                    int i11 = this.onExtraCallbackWithResult;
                    bArr6[i11] = (byte) ((c >> '\f') | BERTags.FLAGS);
                    bArr6[i11 + 1] = (byte) ((63 & (c >> 6)) | 128);
                    this.onExtraCallbackWithResult = i11 + 3;
                    bArr6[i11 + 2] = (byte) ((c & '?') | 128);
                }
                i2++;
            }
        }
    }

    private final void onWarmupCompleted(int i) throws IOException {
        if (i < 128) {
            if (this.onExtraCallback.length - this.onExtraCallbackWithResult <= 0) {
                IAuthTabCallback();
            }
            byte[] bArr = this.onExtraCallback;
            int i2 = this.onExtraCallbackWithResult;
            this.onExtraCallbackWithResult = i2 + 1;
            bArr[i2] = (byte) i;
            return;
        }
        if (i < 2048) {
            if (this.onExtraCallback.length - this.onExtraCallbackWithResult < 2) {
                IAuthTabCallback();
            }
            byte[] bArr2 = this.onExtraCallback;
            int i3 = this.onExtraCallbackWithResult;
            bArr2[i3] = (byte) ((i >> 6) | BERTags.PRIVATE);
            this.onExtraCallbackWithResult = i3 + 2;
            bArr2[i3 + 1] = (byte) ((i & 63) | 128);
            return;
        }
        if (55296 <= i && i < 57344) {
            if (this.onExtraCallback.length - this.onExtraCallbackWithResult <= 0) {
                IAuthTabCallback();
            }
            byte[] bArr3 = this.onExtraCallback;
            int i4 = this.onExtraCallbackWithResult;
            this.onExtraCallbackWithResult = i4 + 1;
            bArr3[i4] = 63;
            return;
        }
        if (i < 65536) {
            if (this.onExtraCallback.length - this.onExtraCallbackWithResult < 3) {
                IAuthTabCallback();
            }
            byte[] bArr4 = this.onExtraCallback;
            int i5 = this.onExtraCallbackWithResult;
            bArr4[i5] = (byte) ((i >> 12) | BERTags.FLAGS);
            bArr4[i5 + 1] = (byte) (((i >> 6) & 63) | 128);
            this.onExtraCallbackWithResult = i5 + 3;
            bArr4[i5 + 2] = (byte) ((i & 63) | 128);
            return;
        }
        if (i > 1114111) {
            throw new JsonEncodingException("Unexpected code point: " + i);
        }
        if (this.onExtraCallback.length - this.onExtraCallbackWithResult < 4) {
            IAuthTabCallback();
        }
        byte[] bArr5 = this.onExtraCallback;
        int i6 = this.onExtraCallbackWithResult;
        bArr5[i6] = (byte) ((i >> 18) | 240);
        bArr5[i6 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr5[i6 + 2] = (byte) (((i >> 6) & 63) | 128);
        this.onExtraCallbackWithResult = i6 + 4;
        bArr5[i6 + 3] = (byte) ((i & 63) | 128);
    }
}
