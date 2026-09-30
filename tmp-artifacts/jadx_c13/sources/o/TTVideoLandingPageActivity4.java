package o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.ByteCompanionObject;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTVideoLandingPageActivity4 {
    static final TTWebsiteActivity7 onExtraCallback = dj13.onExtraCallback(null);
    static final TTWebsiteActivity7 onExtraCallbackWithResult = new TTWebsiteActivity7() { // from class: o.TTVideoLandingPageActivity4.5
        @Override // o.TTWebsiteActivity7
        public boolean onWarmupCompleted(String str) {
            return true;
        }

        @Override // o.TTWebsiteActivity7
        public String onNavigationEvent(byte[] bArr) {
            StringBuilder sb = new StringBuilder(bArr.length);
            for (byte b : bArr) {
                if (b == 0) {
                    break;
                }
                sb.append((char) (b & 255));
            }
            return sb.toString();
        }

        @Override // o.TTWebsiteActivity7
        public ByteBuffer onExtraCallbackWithResult(String str) {
            int length = str.length();
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr[i] = (byte) str.charAt(i);
            }
            return ByteBuffer.wrap(bArr);
        }
    };

    private static String onExtraCallbackWithResult(byte[] bArr, int i, int i2, int i3, byte b) {
        return "Invalid byte " + ((int) b) + " at offset " + (i3 - i) + " in '" + new String(bArr, i, i2, Charset.defaultCharset()).replace("\u0000", "{NUL}") + "' len=" + i2;
    }

    private static long onNavigationEvent(byte[] bArr, int i, int i2, boolean z) {
        int i3 = i2 - 1;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i + 1, bArr2, 0, i3);
        BigInteger bigInteger = new BigInteger(bArr2);
        if (z) {
            bigInteger = bigInteger.add(BigInteger.valueOf(-1L)).not();
        }
        if (bigInteger.bitLength() > 63) {
            throw new IllegalArgumentException("At offset " + i + ", " + i2 + " byte binary number exceeds maximum signed long value");
        }
        long jLongValue = bigInteger.longValue();
        return z ? -jLongValue : jLongValue;
    }

    private static long IAuthTabCallback(byte[] bArr, int i, int i2, boolean z) {
        if (i2 >= 9) {
            throw new IllegalArgumentException("At offset " + i + ", " + i2 + " byte binary number exceeds maximum signed long value");
        }
        long jPow = 0;
        for (int i3 = 1; i3 < i2; i3++) {
            jPow = (jPow << 8) + (bArr[i + i3] & 255);
        }
        if (z) {
            jPow = (jPow - 1) ^ (((long) Math.pow(2.0d, (i2 - 1) * 8.0d)) - 1);
        }
        return z ? -jPow : jPow;
    }

    public static boolean onNavigationEvent(byte[] bArr, int i) {
        return bArr[i] == 1;
    }

    protected static List<TTVideoLandingPageActivity10> onNavigationEvent(String str) throws NumberFormatException, IOException {
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length % 2 == 1) {
            throw new IOException("Corrupted TAR archive. Bad format in GNU.sparse.map PAX Header");
        }
        for (int i = 0; i < strArrSplit.length; i += 2) {
            try {
                long j = Long.parseLong(strArrSplit[i]);
                if (j < 0) {
                    throw new IOException("Corrupted TAR archive. Sparse struct offset contains negative value");
                }
                try {
                    long j2 = Long.parseLong(strArrSplit[i + 1]);
                    if (j2 < 0) {
                        throw new IOException("Corrupted TAR archive. Sparse struct numbytes contains negative value");
                    }
                    arrayList.add(new TTVideoLandingPageActivity10(j, j2));
                } catch (NumberFormatException unused) {
                    throw new IOException("Corrupted TAR archive. Sparse struct numbytes contains a non-numeric value");
                }
            } catch (NumberFormatException unused2) {
                throw new IOException("Corrupted TAR archive. Sparse struct offset contains a non-numeric value");
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static String IAuthTabCallback(byte[] bArr, int i, int i2) {
        try {
            try {
                return onNavigationEvent(bArr, i, i2, onExtraCallback);
            } catch (IOException unused) {
                return onNavigationEvent(bArr, i, i2, onExtraCallbackWithResult);
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public static String onNavigationEvent(byte[] bArr, int i, int i2, TTWebsiteActivity7 tTWebsiteActivity7) throws IOException {
        int i3 = 0;
        for (int i4 = i; i3 < i2 && bArr[i4] != 0; i4++) {
            i3++;
        }
        if (i3 > 0) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i, bArr2, 0, i3);
            return tTWebsiteActivity7.onNavigationEvent(bArr2);
        }
        return _UrlKt.FRAGMENT_ENCODE_SET;
    }

    public static long onExtraCallback(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        if (i2 < 2) {
            throw new IllegalArgumentException("Length " + i2 + " must be at least 2");
        }
        long j = 0;
        if (bArr[i] == 0) {
            return 0L;
        }
        int i4 = i;
        while (i4 < i3 && bArr[i4] == 32) {
            i4++;
        }
        byte b = bArr[i3 - 1];
        while (i4 < i3 && (b == 0 || b == 32)) {
            b = bArr[i3 - 2];
            i3--;
        }
        while (i4 < i3) {
            byte b2 = bArr[i4];
            if (b2 < 48 || b2 > 55) {
                throw new IllegalArgumentException(onExtraCallbackWithResult(bArr, i, i2, i4, b2));
            }
            j = (j << 3) + (b2 - 48);
            i4++;
        }
        return j;
    }

    public static long onNavigationEvent(byte[] bArr, int i, int i2) {
        byte b = bArr[i];
        if ((b & ByteCompanionObject.MIN_VALUE) == 0) {
            return onExtraCallback(bArr, i, i2);
        }
        boolean z = b == -1;
        if (i2 < 9) {
            return IAuthTabCallback(bArr, i, i2, z);
        }
        return onNavigationEvent(bArr, i, i2, z);
    }

    protected static List<TTVideoLandingPageActivity10> onWarmupCompleted(InputStream inputStream, int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        long[] jArrOnNavigationEvent = onNavigationEvent(inputStream);
        long j = jArrOnNavigationEvent[0];
        if (j < 0) {
            throw new IOException("Corrupted TAR archive. Negative value in sparse headers block");
        }
        long j2 = jArrOnNavigationEvent[1];
        while (j > 0) {
            long[] jArrOnNavigationEvent2 = onNavigationEvent(inputStream);
            long j3 = jArrOnNavigationEvent2[0];
            if (j3 < 0) {
                throw new IOException("Corrupted TAR archive. Sparse header block offset contains negative value");
            }
            long j4 = jArrOnNavigationEvent2[1];
            long[] jArrOnNavigationEvent3 = onNavigationEvent(inputStream);
            long j5 = jArrOnNavigationEvent3[0];
            if (j5 < 0) {
                throw new IOException("Corrupted TAR archive. Sparse header block numbytes contains negative value");
            }
            j2 = j2 + j4 + jArrOnNavigationEvent3[1];
            arrayList.add(new TTVideoLandingPageActivity10(j3, j5));
            j--;
        }
        long j6 = i;
        PAGNativeAdLoadListener.onExtraCallbackWithResult(inputStream, j6 - (j2 % j6));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0152, code lost:
    
        throw new java.io.IOException("Failed to read Paxheader. Encountered a non-number while reading length");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static Map<String, String> onExtraCallbackWithResult(InputStream inputStream, List<TTVideoLandingPageActivity10> list, Map<String, String> map, long j) throws IOException, NumberFormatException {
        int i;
        int i2;
        long j2;
        HashMap map2 = new HashMap(map);
        int i3 = 0;
        int i4 = 0;
        Long lValueOf = null;
        loop0: while (true) {
            int i5 = i3;
            int i6 = i5;
            while (true) {
                i = inputStream.read();
                int i7 = -1;
                long j3 = 0;
                if (i == -1) {
                    break;
                }
                i5++;
                i4++;
                if (i == 10) {
                    break;
                }
                if (i == 32) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        i2 = inputStream.read();
                        if (i2 == i7) {
                            break;
                        }
                        i5++;
                        i4++;
                        if (i4 < 0 || (j >= j3 && i4 >= j)) {
                            break;
                        }
                        if (i2 == 61) {
                            String string = byteArrayOutputStream.toString("UTF-8");
                            int i8 = i6 - i5;
                            if (i8 <= 1) {
                                map2.remove(string);
                            } else {
                                if (j >= j3 && i8 > j - i4) {
                                    throw new IOException("Paxheader value size " + i8 + " exceeds size of header record");
                                }
                                byte[] bArrOnExtraCallback = PAGNativeAdLoadListener.onExtraCallback(inputStream, i8);
                                int length = bArrOnExtraCallback.length;
                                if (length != i8) {
                                    throw new IOException("Failed to read Paxheader. Expected " + i8 + " bytes, read " + length);
                                }
                                i4 += i8;
                                int i9 = i8 - 1;
                                if (bArrOnExtraCallback[i9] != 10) {
                                    throw new IOException("Failed to read Paxheader.Value should end with a newline");
                                }
                                String str = new String(bArrOnExtraCallback, i3, i9, StandardCharsets.UTF_8);
                                map2.put(string, str);
                                if (string.equals("GNU.sparse.offset")) {
                                    if (lValueOf != null) {
                                        j2 = 0;
                                        list.add(new TTVideoLandingPageActivity10(lValueOf.longValue(), 0L));
                                    } else {
                                        j2 = 0;
                                    }
                                    try {
                                        lValueOf = Long.valueOf(str);
                                        if (lValueOf.longValue() < j2) {
                                            throw new IOException("Failed to read Paxheader.GNU.sparse.offset contains negative value");
                                        }
                                    } catch (NumberFormatException unused) {
                                        throw new IOException("Failed to read Paxheader.GNU.sparse.offset contains a non-numeric value");
                                    }
                                }
                                if (string.equals("GNU.sparse.numbytes")) {
                                    if (lValueOf == null) {
                                        throw new IOException("Failed to read Paxheader.GNU.sparse.offset is expected before GNU.sparse.numbytes shows up.");
                                    }
                                    try {
                                        long j4 = Long.parseLong(str);
                                        if (j4 < 0) {
                                            throw new IOException("Failed to read Paxheader.GNU.sparse.numbytes contains negative value");
                                        }
                                        list.add(new TTVideoLandingPageActivity10(lValueOf.longValue(), j4));
                                        lValueOf = null;
                                    } catch (NumberFormatException unused2) {
                                        throw new IOException("Failed to read Paxheader.GNU.sparse.numbytes contains a non-numeric value.");
                                    }
                                }
                            }
                        } else {
                            byteArrayOutputStream.write((byte) i2);
                            i3 = 0;
                            i7 = -1;
                            j3 = 0;
                        }
                    }
                    i = i2;
                } else {
                    if (i < 48 || i > 57) {
                        break loop0;
                    }
                    i6 = (i6 * 10) + (i - 48);
                    i3 = 0;
                }
            }
            if (i == -1) {
                if (lValueOf != null) {
                    list.add(new TTVideoLandingPageActivity10(lValueOf.longValue(), 0L));
                }
                return map2;
            }
            i3 = 0;
        }
    }

    public static TTVideoLandingPageActivity10 onExtraCallbackWithResult(byte[] bArr, int i) {
        return new TTVideoLandingPageActivity10(onNavigationEvent(bArr, i, 12), onNavigationEvent(bArr, i + 12, 12));
    }

    private static long[] onNavigationEvent(InputStream inputStream) throws IOException {
        long j = 0;
        long j2 = 0;
        while (true) {
            int i = inputStream.read();
            if (i == 10) {
                return new long[]{j, j2 + 1};
            }
            j2++;
            if (i == -1) {
                throw new IOException("Unexpected EOF when reading parse information of 1.X PAX format");
            }
            if (i < 48 || i > 57) {
                break;
            }
            j = (j * 10) + (i - 48);
        }
        throw new IOException("Corrupted TAR archive. Non-numeric value in sparse headers block");
    }

    static List<TTVideoLandingPageActivity10> onWarmupCompleted(byte[] bArr, int i, int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            try {
                TTVideoLandingPageActivity10 tTVideoLandingPageActivity10OnExtraCallbackWithResult = onExtraCallbackWithResult(bArr, (i3 * 24) + i);
                if (tTVideoLandingPageActivity10OnExtraCallbackWithResult.IAuthTabCallback() < 0) {
                    throw new IOException("Corrupted TAR archive, sparse entry with negative offset");
                }
                if (tTVideoLandingPageActivity10OnExtraCallbackWithResult.onNavigationEvent() < 0) {
                    throw new IOException("Corrupted TAR archive, sparse entry with negative numbytes");
                }
                arrayList.add(tTVideoLandingPageActivity10OnExtraCallbackWithResult);
            } catch (IllegalArgumentException e) {
                throw new IOException("Corrupted TAR archive, sparse entry is invalid", e);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static boolean onExtraCallback(byte[] bArr) {
        long jOnExtraCallback = onExtraCallback(bArr, 148, 8);
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            if (148 <= i && i < 156) {
                b = 32;
            }
            j += b & 255;
            j2 += b;
        }
        return jOnExtraCallback == j || jOnExtraCallback == j2;
    }
}
