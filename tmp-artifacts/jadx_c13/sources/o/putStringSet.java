package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class putStringSet {
    public static String onWarmupCompleted(byte b) {
        return onWarmupCompleted(new byte[]{b});
    }

    public static String onWarmupCompleted(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < bArr.length; i++) {
            int i2 = (bArr[i] >> 4) & 15;
            if (i2 <= 9) {
                stringBuffer.append(i2);
            } else {
                stringBuffer.append((char) (i2 + 55));
            }
            int i3 = bArr[i] & 15;
            if (i3 <= 9) {
                stringBuffer.append(i3);
            } else {
                stringBuffer.append((char) (i3 + 55));
            }
        }
        return stringBuffer.toString();
    }

    public static String onNavigationEvent(byte[] bArr, int i, int i2) {
        if (i2 <= 0 || bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = i; i3 < i2 + i; i3++) {
            int i4 = (bArr[i3] >> 4) & 15;
            if (i4 <= 9) {
                stringBuffer.append(i4);
            } else {
                stringBuffer.append((char) (i4 + 55));
            }
            int i5 = bArr[i3] & 15;
            if (i5 <= 9) {
                stringBuffer.append(i5);
            } else {
                stringBuffer.append((char) (i5 + 55));
            }
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] onNavigationEvent(String str) {
        int iCharAt;
        int iCharAt2;
        if (str == null) {
            return null;
        }
        String upperCase = str.toUpperCase();
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i << 1;
            if (upperCase.charAt(i2) >= '0' && upperCase.charAt(i2) <= '9') {
                iCharAt = upperCase.charAt(i2) - '0';
            } else {
                iCharAt = (upperCase.charAt(i2) < 'A' || upperCase.charAt(i2) > 'F') ? 0 : upperCase.charAt(i2) - '7';
            }
            if (upperCase.charAt(i2) >= '0') {
                int i3 = i2 + 1;
                if (upperCase.charAt(i3) <= '9') {
                    iCharAt2 = upperCase.charAt(i3) - '0';
                } else {
                    int i4 = i2 + 1;
                    iCharAt2 = (upperCase.charAt(i4) < 'A' || upperCase.charAt(i4) > 'F') ? 0 : upperCase.charAt(i4) - '7';
                }
            }
            bArr[i] = (byte) ((iCharAt << 4) + iCharAt2);
        }
        return bArr;
    }
}
