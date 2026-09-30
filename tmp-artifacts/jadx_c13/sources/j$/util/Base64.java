package j$.util;

import j$.sun.nio.cs.c;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class Base64 {
    public static Encoder getEncoder() {
        return Encoder.c;
    }

    public static Decoder getDecoder() {
        return Decoder.c;
    }

    public static class Encoder {
        public static final char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        public static final char[] b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};
        public static final Encoder c = new Encoder();

        public String encodeToString(byte[] bArr) {
            int i;
            int length = ((bArr.length + 2) / 3) * 4;
            byte[] bArrCopyOf = new byte[length];
            int length2 = bArr.length;
            int i2 = (length2 / 3) * 3;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                char[] cArr = a;
                if (i3 >= i2) {
                    if (i3 < length2) {
                        int i5 = i3 + 1;
                        int i6 = bArr[i3] & 255;
                        int i7 = i4 + 1;
                        bArrCopyOf[i4] = (byte) cArr[i6 >> 2];
                        if (i5 == length2) {
                            bArrCopyOf[i7] = (byte) cArr[(i6 << 4) & 63];
                            bArrCopyOf[i4 + 2] = 61;
                            i = i4 + 4;
                            bArrCopyOf[i4 + 3] = 61;
                        } else {
                            int i8 = bArr[i5] & 255;
                            bArrCopyOf[i7] = (byte) cArr[((i6 << 4) & 63) | (i8 >> 4)];
                            bArrCopyOf[i4 + 2] = (byte) cArr[(i8 << 2) & 63];
                            i = i4 + 4;
                            bArrCopyOf[i4 + 3] = 61;
                        }
                        i4 = i;
                    }
                    if (i4 != length) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i4);
                    }
                    return new String(bArrCopyOf, 0, 0, bArrCopyOf.length);
                }
                int iMin = Math.min(i3 + i2, i2);
                int i9 = i3;
                int i10 = i4;
                while (i9 < iMin) {
                    int i11 = i9 + 3;
                    int i12 = (bArr[i9 + 2] & 255) | ((bArr[i9] & 255) << 16) | ((bArr[i9 + 1] & 255) << 8);
                    bArrCopyOf[i10] = (byte) cArr[(i12 >>> 18) & 63];
                    bArrCopyOf[i10 + 1] = (byte) cArr[(i12 >>> 12) & 63];
                    bArrCopyOf[i10 + 2] = (byte) cArr[(i12 >>> 6) & 63];
                    bArrCopyOf[i10 + 3] = (byte) cArr[i12 & 63];
                    i10 += 4;
                    i9 = i11;
                }
                int i13 = ((iMin - i3) / 3) * 4;
                i4 += i13;
                if (i13 == -1 && iMin < length2) {
                    throw null;
                }
                i3 = iMin;
            }
        }
    }

    public static class Decoder {
        public static final int[] a;
        public static final int[] b;
        public static final Decoder c;

        static {
            int[] iArr = new int[256];
            a = iArr;
            Arrays.fill(iArr, -1);
            for (int i = 0; i < 64; i++) {
                a[Encoder.a[i]] = i;
            }
            a[61] = -2;
            int[] iArr2 = new int[256];
            b = iArr2;
            Arrays.fill(iArr2, -1);
            for (int i2 = 0; i2 < 64; i2++) {
                b[Encoder.b[i2]] = i2;
            }
            b[61] = -2;
            c = new Decoder();
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x00bb, code lost:
        
            if (r10 != 18) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0107, code lost:
        
            if (r10 != 6) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0109, code lost:
        
            r5[r9] = (byte) (r11 >> 16);
            r9 = r9 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0113, code lost:
        
            if (r10 != 0) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0115, code lost:
        
            r5[r9] = (byte) (r11 >> 16);
            r5[r9 + 1] = (byte) (r11 >> 8);
            r9 = r9 + 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0127, code lost:
        
            if (r10 == 12) goto L70;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0129, code lost:
        
            if (r8 < r6) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x012b, code lost:
        
            if (r9 == r1) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0131, code lost:
        
            return java.util.Arrays.copyOf(r5, r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0132, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0146, code lost:
        
            throw new java.lang.IllegalArgumentException("Input byte array has incorrect ending byte at " + r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x014e, code lost:
        
            throw new java.lang.IllegalArgumentException("Last unit does not have enough valid bits");
         */
        /* JADX WARN: Removed duplicated region for block: B:35:0x009f A[PHI: r8 r9
          0x009f: PHI (r8v3 int) = (r8v1 int), (r8v1 int), (r8v13 int) binds: [B:22:0x0040, B:24:0x0044, B:33:0x009b] A[DONT_GENERATE, DONT_INLINE]
          0x009f: PHI (r9v7 int) = (r9v1 int), (r9v1 int), (r9v11 int) binds: [B:22:0x0040, B:24:0x0044, B:33:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public byte[] decode(String str) {
            int i;
            int i2;
            int i3;
            byte[] bytes = str.getBytes(c.a);
            int length = bytes.length;
            if (length == 0) {
                i2 = 0;
            } else {
                if (length < 2) {
                    throw new IllegalArgumentException("Input byte[] should at least have 2 bytes for base64 bytes");
                }
                if (bytes[length - 1] == 61) {
                    i = bytes[length + (-2)] == 61 ? 2 : 1;
                } else {
                    i = 0;
                }
                if (i == 0 && (i3 = length & 3) != 0) {
                    i = 4 - i3;
                }
                i2 = (((length + 3) / 4) * 3) - i;
            }
            byte[] bArr = new byte[i2];
            int length2 = bytes.length;
            int i4 = 18;
            int i5 = 18;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i6 >= length2) {
                    break;
                }
                int[] iArr = a;
                if (i5 != i4 || i6 + 4 >= length2) {
                    int i9 = i6 + 1;
                    byte b2 = bytes[i6];
                    int i10 = iArr[b2 & 255];
                    if (i10 >= 0) {
                        int i11 = (i10 << i5) | i8;
                        i5 -= 6;
                        if (i5 < 0) {
                            bArr[i7] = (byte) (i11 >> 16);
                            bArr[i7 + 1] = (byte) (i11 >> 8);
                            bArr[i7 + 2] = (byte) i11;
                            i7 += 3;
                            i5 = 18;
                            i8 = 0;
                        } else {
                            i8 = i11;
                        }
                        i6 = i9;
                        i4 = 18;
                    } else {
                        if (i10 != -2) {
                            throw new IllegalArgumentException("Illegal base64 character " + Integer.toString(b2, 16));
                        }
                        if (i5 == 6) {
                            if (i9 != length2) {
                                i6 += 2;
                                if (bytes[i9] == 61) {
                                }
                            }
                            throw new IllegalArgumentException("Input byte array has wrong 4-byte ending unit");
                        }
                        i6 = i9;
                    }
                } else {
                    int i12 = i6;
                    while (i12 < ((length2 - i6) & (-4)) + i6) {
                        int i13 = iArr[bytes[i12] & 255];
                        int i14 = iArr[bytes[i12 + 1] & 255];
                        int i15 = iArr[bytes[i12 + 2] & 255];
                        int i16 = iArr[bytes[i12 + 3] & 255];
                        if ((i13 | i14 | i15 | i16) < 0) {
                            break;
                        }
                        int i17 = i16 | (i13 << 18) | (i14 << 12) | (i15 << 6);
                        bArr[i7] = (byte) (i17 >> 16);
                        bArr[i7 + 1] = (byte) (i17 >> 8);
                        bArr[i7 + 2] = (byte) i17;
                        i12 += 4;
                        i7 += 3;
                    }
                    i6 = i12;
                    if (i12 >= length2) {
                        break;
                    }
                }
            }
        }
    }
}
