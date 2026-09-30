package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class DeviceUtils2 {
    static byte[] onExtraCallbackWithResult(String str) {
        byte[] bArr = new byte[4];
        int length = str.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt < '0' || cCharAt > '9') {
                if (cCharAt != '.' || i == 3 || i2 == 0) {
                    return null;
                }
                bArr[i] = (byte) i3;
                i++;
                i2 = 0;
                i3 = 0;
            } else {
                if (i2 == 3) {
                    return null;
                }
                if (i2 > 0 && i3 == 0) {
                    return null;
                }
                i2++;
                i3 = (i3 * 10) + (cCharAt - '0');
                if (i3 > 255) {
                    return null;
                }
            }
        }
        if (i != 3 || i2 == 0) {
            return null;
        }
        bArr[i] = (byte) i3;
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r11[r4].isEmpty() != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static byte[] IAuthTabCallback(String str) throws NumberFormatException {
        int i;
        byte[] bArrOnExtraCallbackWithResult;
        byte[] bArr = new byte[16];
        int i2 = -1;
        String[] strArrSplit = str.split(":", -1);
        int length = strArrSplit.length;
        int i3 = length - 1;
        if (!strArrSplit[0].isEmpty()) {
            i = 0;
        } else {
            if (i3 <= 0 || !strArrSplit[1].isEmpty()) {
                return null;
            }
            i = 1;
        }
        if (strArrSplit[i3].isEmpty()) {
            if (i3 - i > 0) {
                i3 = length - 2;
            }
            return null;
        }
        if ((i3 - i) + 1 > 8) {
            return null;
        }
        int i4 = 0;
        while (true) {
            if (i > i3) {
                break;
            }
            if (strArrSplit[i].isEmpty()) {
                if (i2 >= 0) {
                    return null;
                }
                i2 = i4;
            } else if (strArrSplit[i].indexOf(46) < 0) {
                for (int i5 = 0; i5 < strArrSplit[i].length(); i5++) {
                    try {
                        if (Character.digit(strArrSplit[i].charAt(i5), 16) < 0) {
                            return null;
                        }
                    } catch (NumberFormatException unused) {
                        return null;
                    }
                }
                int i6 = Integer.parseInt(strArrSplit[i], 16);
                if (!lt56.onNavigationEvent(i6)) {
                    return null;
                }
                bArr[i4] = (byte) (i6 >>> 8);
                int i7 = i4 + 2;
                bArr[i4 + 1] = (byte) i6;
                i4 = i7;
            } else {
                if (i < i3 || i > 6 || (bArrOnExtraCallbackWithResult = dy6.onExtraCallbackWithResult(strArrSplit[i], 1)) == null) {
                    return null;
                }
                int i8 = 0;
                while (i8 < 4) {
                    bArr[i4] = bArrOnExtraCallbackWithResult[i8];
                    i8++;
                    i4++;
                }
            }
            i++;
        }
        if (i4 < 16 && i2 < 0) {
            return null;
        }
        if (i2 >= 0) {
            int i9 = (16 - i4) + i2;
            System.arraycopy(bArr, i2, bArr, i9, i4 - i2);
            while (i2 < i9) {
                bArr[i2] = 0;
                i2++;
            }
        }
        return bArr;
    }
}
