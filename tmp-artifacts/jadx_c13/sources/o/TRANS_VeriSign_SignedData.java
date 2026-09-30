package o;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TRANS_VeriSign_SignedData {
    private final boolean IAuthTabCallback;
    private final boolean onNavigationEvent;
    private final String onWarmupCompleted;

    private static int onExtraCallbackWithResult(int i) {
        if (i == 1) {
            return 6;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 3;
        }
        if (i != 4) {
            return i != 5 ? -1 : 0;
        }
        return 1;
    }

    private static int onNavigationEvent(int i) {
        if (i == 0) {
            return 5;
        }
        if (i == 1) {
            return 4;
        }
        if (i == 3) {
            return 3;
        }
        if (i != 4) {
            return i != 6 ? -1 : 1;
        }
        return 2;
    }

    public TRANS_VeriSign_SignedData(String str, boolean z, boolean z2) {
        this.onWarmupCompleted = str;
        this.IAuthTabCallback = z;
        this.onNavigationEvent = z2;
    }

    public String onWarmupCompleted(byte[] bArr) {
        int i;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i2 = 0; i2 < (bArr.length + 4) / 5; i2++) {
            short[] sArr = new short[5];
            int i3 = 5;
            for (int i4 = 0; i4 < 5; i4++) {
                int i5 = (i2 * 5) + i4;
                if (i5 < bArr.length) {
                    sArr[i4] = (short) (bArr[i5] & 255);
                } else {
                    sArr[i4] = 0;
                    i3--;
                }
            }
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(i3);
            short s = sArr[0];
            int i6 = (byte) ((s >> 3) & 31);
            short s2 = sArr[1];
            int i7 = (byte) (((s & 7) << 2) | ((s2 >> 6) & 3));
            int i8 = (byte) ((s2 >> 1) & 31);
            short s3 = sArr[2];
            int i9 = (byte) (((s2 & 1) << 4) | ((s3 >> 4) & 15));
            short s4 = sArr[3];
            short s5 = sArr[4];
            int[] iArr = {i6, i7, i8, i9, (byte) (((s4 >> 7) & 1) | ((s3 & 15) << 1)), (byte) ((s4 >> 2) & 31), (byte) (((s5 >> 5) & 7) | ((s4 & 3) << 3)), (byte) (s5 & 31)};
            int i10 = 0;
            while (true) {
                i = 8 - iOnExtraCallbackWithResult;
                if (i10 >= i) {
                    break;
                }
                char cCharAt = this.onWarmupCompleted.charAt(iArr[i10]);
                if (this.onNavigationEvent) {
                    cCharAt = Character.toLowerCase(cCharAt);
                }
                byteArrayOutputStream.write(cCharAt);
                i10++;
            }
            if (this.IAuthTabCallback) {
                while (i < 8) {
                    byteArrayOutputStream.write(61);
                    i++;
                }
            }
        }
        return byteArrayOutputStream.toString();
    }

    public byte[] onExtraCallback(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (byte b : str.getBytes()) {
            char c = (char) b;
            if (!Character.isWhitespace(c)) {
                byteArrayOutputStream.write((byte) Character.toUpperCase(c));
            }
        }
        if (this.IAuthTabCallback) {
            if (byteArrayOutputStream.size() % 8 != 0) {
                return null;
            }
        } else {
            while (byteArrayOutputStream.size() % 8 != 0) {
                byteArrayOutputStream.write(61);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        for (int i = 0; i < byteArray.length / 8; i++) {
            short[] sArr = new short[8];
            int i2 = 8;
            for (int i3 = 0; i3 < 8; i3++) {
                byte b2 = byteArray[(i << 3) + i3];
                if (((char) b2) == '=') {
                    break;
                }
                short sIndexOf = (short) this.onWarmupCompleted.indexOf(b2);
                sArr[i3] = sIndexOf;
                if (sIndexOf < 0) {
                    return null;
                }
                i2--;
            }
            int iOnNavigationEvent = onNavigationEvent(i2);
            if (iOnNavigationEvent < 0) {
                return null;
            }
            short s = sArr[0];
            short s2 = sArr[1];
            short s3 = sArr[2];
            short s4 = sArr[3];
            short s5 = sArr[4];
            short s6 = sArr[5];
            short s7 = sArr[6];
            int[] iArr = {(s << 3) | (s2 >> 2), (s3 << 1) | ((s2 & 3) << 6) | (s4 >> 4), ((s4 & 15) << 4) | ((s5 >> 1) & 15), (s6 << 2) | (s5 << 7) | (s7 >> 3), sArr[7] | ((s7 & 7) << 5)};
            for (int i4 = 0; i4 < iOnNavigationEvent; i4++) {
                try {
                    dataOutputStream.writeByte((byte) iArr[i4]);
                } catch (IOException unused) {
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
}
