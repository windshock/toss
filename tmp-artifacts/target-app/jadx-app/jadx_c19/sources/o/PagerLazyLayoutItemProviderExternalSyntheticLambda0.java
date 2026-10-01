package o;

import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class PagerLazyLayoutItemProviderExternalSyntheticLambda0 {
    private static final onNavigationEvent onNavigationEvent;

    static {
        onNavigationEvent onextracallbackwithresult;
        if (onExtraCallback.onNavigationEvent() && !LazyLayoutKtExternalSyntheticLambda1.onWarmupCompleted()) {
            onextracallbackwithresult = new onExtraCallback();
        } else {
            onextracallbackwithresult = new onExtraCallbackWithResult();
        }
        onNavigationEvent = onextracallbackwithresult;
    }

    public static class onWarmupCompleted extends IllegalArgumentException {
        onWarmupCompleted(int i2, int i3) {
            super("Unpaired surrogate at index " + i2 + " of " + i3);
        }
    }

    public static int onExtraCallbackWithResult(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int iOnExtraCallbackWithResult = length;
        while (true) {
            if (i2 < length) {
                char cCharAt = str.charAt(i2);
                if (cCharAt >= 2048) {
                    iOnExtraCallbackWithResult += onExtraCallbackWithResult(str, i2);
                    break;
                }
                iOnExtraCallbackWithResult += (127 - cCharAt) >>> 31;
                i2++;
            } else {
                break;
            }
        }
        if (iOnExtraCallbackWithResult >= length) {
            return iOnExtraCallbackWithResult;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (iOnExtraCallbackWithResult + 4294967296L));
    }

    private static int onExtraCallbackWithResult(String str, int i2) {
        int length = str.length();
        int i3 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
            } else {
                i3 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(str, i2) < 65536) {
                        throw new onWarmupCompleted(i2, length);
                    }
                    i2++;
                }
            }
            i2++;
        }
        return i3;
    }

    public static int onExtraCallbackWithResult(String str, byte[] bArr, int i2, int i3) {
        return onNavigationEvent.onWarmupCompleted(str, bArr, i2, i3);
    }

    static String onExtraCallback(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
        return onNavigationEvent.onExtraCallbackWithResult(byteBuffer, i2, i3);
    }

    static String IAuthTabCallback(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
        return onNavigationEvent.onNavigationEvent(bArr, i2, i3);
    }

    static abstract class onNavigationEvent {
        abstract String onNavigationEvent(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException;

        abstract String onNavigationEvent(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException;

        abstract int onWarmupCompleted(String str, byte[] bArr, int i2, int i3);

        onNavigationEvent() {
        }

        final String onExtraCallbackWithResult(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return onNavigationEvent(byteBuffer.array(), byteBuffer.arrayOffset() + i2, i3);
            }
            if (byteBuffer.isDirect()) {
                return onNavigationEvent(byteBuffer, i2, i3);
            }
            return IAuthTabCallback(byteBuffer, i2, i3);
        }

        final String IAuthTabCallback(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
            if ((i2 | i3 | ((byteBuffer.limit() - i2) - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            int i4 = i2 + i3;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (i2 < i4) {
                byte b = byteBuffer.get(i2);
                if (!IAuthTabCallback.onNavigationEvent(b)) {
                    break;
                }
                i2++;
                IAuthTabCallback.onNavigationEvent(b, cArr, i5);
                i5++;
            }
            int i6 = i5;
            while (i2 < i4) {
                int i7 = i2 + 1;
                byte b2 = byteBuffer.get(i2);
                if (IAuthTabCallback.onNavigationEvent(b2)) {
                    IAuthTabCallback.onNavigationEvent(b2, cArr, i6);
                    i6++;
                    i2 = i7;
                    while (i2 < i4) {
                        byte b3 = byteBuffer.get(i2);
                        if (IAuthTabCallback.onNavigationEvent(b3)) {
                            i2++;
                            IAuthTabCallback.onNavigationEvent(b3, cArr, i6);
                            i6++;
                        }
                    }
                } else if (IAuthTabCallback.IAuthTabCallbackDefault(b2)) {
                    if (i7 >= i4) {
                        throw InvalidProtocolBufferException.onWarmupCompleted();
                    }
                    i2 += 2;
                    IAuthTabCallback.onExtraCallbackWithResult(b2, byteBuffer.get(i7), cArr, i6);
                    i6++;
                } else if (IAuthTabCallback.IAuthTabCallbackStub(b2)) {
                    if (i7 >= i4 - 1) {
                        throw InvalidProtocolBufferException.onWarmupCompleted();
                    }
                    IAuthTabCallback.onWarmupCompleted(b2, byteBuffer.get(i7), byteBuffer.get(i2 + 2), cArr, i6);
                    i6++;
                    i2 += 3;
                } else {
                    if (i7 >= i4 - 2) {
                        throw InvalidProtocolBufferException.onWarmupCompleted();
                    }
                    IAuthTabCallback.IAuthTabCallback(b2, byteBuffer.get(i7), byteBuffer.get(i2 + 2), byteBuffer.get(i2 + 3), cArr, i6);
                    i6 += 2;
                    i2 += 4;
                }
            }
            return new String(cArr, 0, i6);
        }
    }

    static final class onExtraCallbackWithResult extends onNavigationEvent {
        onExtraCallbackWithResult() {
        }

        @Override // o.PagerLazyLayoutItemProviderExternalSyntheticLambda0.onNavigationEvent
        String onNavigationEvent(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
            if ((i2 | i3 | ((bArr.length - i2) - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            int i4 = i2 + i3;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (i2 < i4) {
                byte b = bArr[i2];
                if (!IAuthTabCallback.onNavigationEvent(b)) {
                    break;
                }
                i2++;
                IAuthTabCallback.onNavigationEvent(b, cArr, i5);
                i5++;
            }
            int i6 = i5;
            while (i2 < i4) {
                int i7 = i2 + 1;
                byte b2 = bArr[i2];
                if (IAuthTabCallback.onNavigationEvent(b2)) {
                    IAuthTabCallback.onNavigationEvent(b2, cArr, i6);
                    i6++;
                    i2 = i7;
                    while (i2 < i4) {
                        byte b3 = bArr[i2];
                        if (IAuthTabCallback.onNavigationEvent(b3)) {
                            i2++;
                            IAuthTabCallback.onNavigationEvent(b3, cArr, i6);
                            i6++;
                        }
                    }
                } else if (IAuthTabCallback.IAuthTabCallbackDefault(b2)) {
                    if (i7 >= i4) {
                        throw InvalidProtocolBufferException.onWarmupCompleted();
                    }
                    i2 += 2;
                    IAuthTabCallback.onExtraCallbackWithResult(b2, bArr[i7], cArr, i6);
                    i6++;
                } else if (IAuthTabCallback.IAuthTabCallbackStub(b2)) {
                    if (i7 >= i4 - 1) {
                        throw InvalidProtocolBufferException.onWarmupCompleted();
                    }
                    IAuthTabCallback.onWarmupCompleted(b2, bArr[i7], bArr[i2 + 2], cArr, i6);
                    i6++;
                    i2 += 3;
                } else {
                    if (i7 >= i4 - 2) {
                        throw InvalidProtocolBufferException.onWarmupCompleted();
                    }
                    IAuthTabCallback.IAuthTabCallback(b2, bArr[i7], bArr[i2 + 2], bArr[i2 + 3], cArr, i6);
                    i6 += 2;
                    i2 += 4;
                }
            }
            return new String(cArr, 0, i6);
        }

        @Override // o.PagerLazyLayoutItemProviderExternalSyntheticLambda0.onNavigationEvent
        String onNavigationEvent(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
            return IAuthTabCallback(byteBuffer, i2, i3);
        }

        @Override // o.PagerLazyLayoutItemProviderExternalSyntheticLambda0.onNavigationEvent
        int onWarmupCompleted(String str, byte[] bArr, int i2, int i3) {
            int i4;
            int i5;
            int i6;
            char cCharAt;
            int length = str.length();
            int i7 = i3 + i2;
            int i8 = 0;
            while (i8 < length && (i6 = i8 + i2) < i7 && (cCharAt = str.charAt(i8)) < 128) {
                bArr[i6] = (byte) cCharAt;
                i8++;
            }
            if (i8 == length) {
                return i2 + length;
            }
            int i9 = i2 + i8;
            while (i8 < length) {
                char cCharAt2 = str.charAt(i8);
                if (cCharAt2 >= 128 || i9 >= i7) {
                    if (cCharAt2 < 2048 && i9 <= i7 - 2) {
                        bArr[i9] = (byte) ((cCharAt2 >>> 6) | 960);
                        i4 = i9 + 2;
                        bArr[i9 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i9 > i7 - 3) {
                            if (i9 <= i7 - 4) {
                                int i10 = i8 + 1;
                                if (i10 != str.length()) {
                                    char cCharAt3 = str.charAt(i10);
                                    if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                        int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                        bArr[i9] = (byte) ((codePoint >>> 18) | 240);
                                        bArr[i9 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        bArr[i9 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        bArr[i9 + 3] = (byte) ((codePoint & 63) | 128);
                                        i9 += 4;
                                        i8 = i10;
                                    } else {
                                        i8 = i10;
                                    }
                                }
                                throw new onWarmupCompleted(i8 - 1, length);
                            }
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i5 = i8 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i5)))) {
                                throw new onWarmupCompleted(i8, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i9);
                        }
                        bArr[i9] = (byte) ((cCharAt2 >>> '\f') | 480);
                        bArr[i9 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                        i4 = i9 + 3;
                        bArr[i9 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    }
                    i9 = i4;
                } else {
                    bArr[i9] = (byte) cCharAt2;
                    i9++;
                }
                i8++;
            }
            return i9;
        }
    }

    static final class onExtraCallback extends onNavigationEvent {
        onExtraCallback() {
        }

        static boolean onNavigationEvent() {
            return PagerKtExternalSyntheticLambda5.onExtraCallback() && PagerKtExternalSyntheticLambda5.onNavigationEvent();
        }

        @Override // o.PagerLazyLayoutItemProviderExternalSyntheticLambda0.onNavigationEvent
        String onNavigationEvent(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
            Charset charset = LazySaveableStateHolderKtExternalSyntheticLambda1.onTransact;
            String str = new String(bArr, i2, i3, charset);
            if (str.indexOf(65533) < 0 || Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i2, i3 + i2))) {
                return str;
            }
            throw InvalidProtocolBufferException.onWarmupCompleted();
        }

        @Override // o.PagerLazyLayoutItemProviderExternalSyntheticLambda0.onNavigationEvent
        String onNavigationEvent(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
            if ((i2 | i3 | ((byteBuffer.limit() - i2) - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            long jIAuthTabCallback = PagerKtExternalSyntheticLambda5.IAuthTabCallback(byteBuffer) + i2;
            long j = i3 + jIAuthTabCallback;
            char[] cArr = new char[i3];
            int i4 = 0;
            while (jIAuthTabCallback < j) {
                byte bOnExtraCallbackWithResult = PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(jIAuthTabCallback);
                if (!IAuthTabCallback.onNavigationEvent(bOnExtraCallbackWithResult)) {
                    break;
                }
                jIAuthTabCallback++;
                IAuthTabCallback.onNavigationEvent(bOnExtraCallbackWithResult, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (jIAuthTabCallback < j) {
                long j2 = jIAuthTabCallback + 1;
                byte bOnExtraCallbackWithResult2 = PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(jIAuthTabCallback);
                if (IAuthTabCallback.onNavigationEvent(bOnExtraCallbackWithResult2)) {
                    IAuthTabCallback.onNavigationEvent(bOnExtraCallbackWithResult2, cArr, i5);
                    i5++;
                    jIAuthTabCallback = j2;
                    while (jIAuthTabCallback < j) {
                        byte bOnExtraCallbackWithResult3 = PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(jIAuthTabCallback);
                        if (IAuthTabCallback.onNavigationEvent(bOnExtraCallbackWithResult3)) {
                            jIAuthTabCallback++;
                            IAuthTabCallback.onNavigationEvent(bOnExtraCallbackWithResult3, cArr, i5);
                            i5++;
                        }
                    }
                } else if (IAuthTabCallback.IAuthTabCallbackDefault(bOnExtraCallbackWithResult2)) {
                    if (j2 >= j) {
                        throw InvalidProtocolBufferException.onWarmupCompleted();
                    }
                    jIAuthTabCallback += 2;
                    IAuthTabCallback.onExtraCallbackWithResult(bOnExtraCallbackWithResult2, PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(j2), cArr, i5);
                    i5++;
                } else if (IAuthTabCallback.IAuthTabCallbackStub(bOnExtraCallbackWithResult2)) {
                    if (j2 >= j - 1) {
                        throw InvalidProtocolBufferException.onWarmupCompleted();
                    }
                    IAuthTabCallback.onWarmupCompleted(bOnExtraCallbackWithResult2, PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(j2), PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(jIAuthTabCallback + 2), cArr, i5);
                    i5++;
                    jIAuthTabCallback = 3 + jIAuthTabCallback;
                } else {
                    if (j2 >= j - 2) {
                        throw InvalidProtocolBufferException.onWarmupCompleted();
                    }
                    IAuthTabCallback.IAuthTabCallback(bOnExtraCallbackWithResult2, PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(j2), PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(2 + jIAuthTabCallback), PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(jIAuthTabCallback + 3), cArr, i5);
                    i5 += 2;
                    jIAuthTabCallback += 4;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // o.PagerLazyLayoutItemProviderExternalSyntheticLambda0.onNavigationEvent
        int onWarmupCompleted(String str, byte[] bArr, int i2, int i3) {
            long j;
            String str2;
            String str3;
            int i4;
            char cCharAt;
            long j2 = i2;
            long j3 = i3 + j2;
            int length = str.length();
            String str4 = " at index ";
            String str5 = "Failed writing ";
            if (length > i3 || bArr.length - i3 < i2) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i2 + i3));
            }
            int i5 = 0;
            while (true) {
                j = 1;
                if (i5 >= length || (cCharAt = str.charAt(i5)) >= 128) {
                    break;
                }
                PagerKtExternalSyntheticLambda5.onExtraCallback(bArr, j2, (byte) cCharAt);
                i5++;
                j2++;
            }
            if (i5 == length) {
                return (int) j2;
            }
            while (i5 < length) {
                char cCharAt2 = str.charAt(i5);
                if (cCharAt2 < 128 && j2 < j3) {
                    PagerKtExternalSyntheticLambda5.onExtraCallback(bArr, j2, (byte) cCharAt2);
                    j2 += j;
                    str2 = str4;
                    str3 = str5;
                } else if (cCharAt2 < 2048 && j2 <= j3 - 2) {
                    PagerKtExternalSyntheticLambda5.onExtraCallback(bArr, j2, (byte) ((cCharAt2 >>> 6) | 960));
                    PagerKtExternalSyntheticLambda5.onExtraCallback(bArr, j2 + j, (byte) ((cCharAt2 & '?') | 128));
                    str2 = str4;
                    str3 = str5;
                    j2 = 2 + j2;
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j2 > j3 - 3) {
                        str2 = str4;
                        str3 = str5;
                        if (j2 <= j3 - 4) {
                            int i6 = i5 + 1;
                            if (i6 != length) {
                                char cCharAt3 = str.charAt(i6);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    PagerKtExternalSyntheticLambda5.onExtraCallback(bArr, j2, (byte) ((codePoint >>> 18) | 240));
                                    PagerKtExternalSyntheticLambda5.onExtraCallback(bArr, j2 + j, (byte) (((codePoint >>> 12) & 63) | 128));
                                    PagerKtExternalSyntheticLambda5.onExtraCallback(bArr, j2 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    PagerKtExternalSyntheticLambda5.onExtraCallback(bArr, j2 + 3, (byte) ((codePoint & 63) | 128));
                                    j2 = 4 + j2;
                                    i5 = i6;
                                } else {
                                    i5 = i6;
                                }
                            }
                            throw new onWarmupCompleted(i5 - 1, length);
                        }
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i4 = i5 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i4)))) {
                            throw new onWarmupCompleted(i5, length);
                        }
                        throw new ArrayIndexOutOfBoundsException(str3 + cCharAt2 + str2 + j2);
                    }
                    PagerKtExternalSyntheticLambda5.onExtraCallback(bArr, j2, (byte) ((cCharAt2 >>> '\f') | 480));
                    str2 = str4;
                    str3 = str5;
                    PagerKtExternalSyntheticLambda5.onExtraCallback(bArr, j2 + j, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    PagerKtExternalSyntheticLambda5.onExtraCallback(bArr, j2 + 2, (byte) ((cCharAt2 & '?') | 128));
                    j2 += 3;
                }
                i5++;
                str4 = str2;
                str5 = str3;
                j = 1;
            }
            return (int) j2;
        }
    }

    static class IAuthTabCallback {
        private static char IAuthTabCallback(int i2) {
            return (char) ((i2 >>> 10) + 55232);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean IAuthTabCallbackDefault(byte b) {
            return b < -32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean IAuthTabCallbackStub(byte b) {
            return b < -16;
        }

        private static int asInterface(byte b) {
            return b & 63;
        }

        private static boolean onExtraCallback(byte b) {
            return b > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean onNavigationEvent(byte b) {
            return b >= 0;
        }

        private static char onWarmupCompleted(int i2) {
            return (char) ((i2 & 1023) + 56320);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void onNavigationEvent(byte b, char[] cArr, int i2) {
            cArr[i2] = (char) b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void onExtraCallbackWithResult(byte b, byte b2, char[] cArr, int i2) throws InvalidProtocolBufferException {
            if (b < -62 || onExtraCallback(b2)) {
                throw InvalidProtocolBufferException.onWarmupCompleted();
            }
            cArr[i2] = (char) (((b & 31) << 6) | asInterface(b2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void onWarmupCompleted(byte b, byte b2, byte b3, char[] cArr, int i2) throws InvalidProtocolBufferException {
            if (onExtraCallback(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || onExtraCallback(b3)))) {
                throw InvalidProtocolBufferException.onWarmupCompleted();
            }
            cArr[i2] = (char) (((b & 15) << 12) | (asInterface(b2) << 6) | asInterface(b3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void IAuthTabCallback(byte b, byte b2, byte b3, byte b4, char[] cArr, int i2) throws InvalidProtocolBufferException {
            if (onExtraCallback(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || onExtraCallback(b3) || onExtraCallback(b4)) {
                throw InvalidProtocolBufferException.onWarmupCompleted();
            }
            int iAsInterface = ((b & 7) << 18) | (asInterface(b2) << 12) | (asInterface(b3) << 6) | asInterface(b4);
            cArr[i2] = IAuthTabCallback(iAsInterface);
            cArr[i2 + 1] = onWarmupCompleted(iAsInterface);
        }
    }
}
