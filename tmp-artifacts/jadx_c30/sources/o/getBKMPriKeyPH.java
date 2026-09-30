package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getBKMPriKeyPH extends getBKMPriKeyCCFPH {
    private static final char[] onExtraCallbackWithResult = {'+'};
    private static final char[] onNavigationEvent = "0123456789ABCDEF".toCharArray();
    private final boolean[] IAuthTabCallback;
    private final boolean onWarmupCompleted;

    public getBKMPriKeyPH(String str, boolean z) {
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        if (z && str.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        if (str.contains("%")) {
            throw new IllegalArgumentException("The '%' character cannot be specified as 'safe'");
        }
        this.onWarmupCompleted = z;
        this.IAuthTabCallback = onWarmupCompleted(str);
    }

    private static boolean[] onWarmupCompleted(String str) {
        char[] charArray = str.toCharArray();
        int iMax = 122;
        for (char c : charArray) {
            iMax = Math.max((int) c, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (int i = 48; i <= 57; i++) {
            zArr[i] = true;
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            zArr[i2] = true;
        }
        for (int i3 = 97; i3 <= 122; i3++) {
            zArr[i3] = true;
        }
        for (char c2 : charArray) {
            zArr[c2] = true;
        }
        return zArr;
    }

    @Override // o.getBKMPriKeyCCFPH
    protected int onNavigationEvent(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            boolean[] zArr = this.IAuthTabCallback;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                break;
            }
            i++;
        }
        return i;
    }

    @Override // o.getBKMPriKeyCCFPH, o.getBKMPriKeyFH
    public String IAuthTabCallback(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            boolean[] zArr = this.IAuthTabCallback;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                return IAuthTabCallback(str, i);
            }
        }
        return str;
    }

    @Override // o.getBKMPriKeyCCFPH
    protected char[] onExtraCallbackWithResult(int i) {
        boolean[] zArr = this.IAuthTabCallback;
        if (i < zArr.length && zArr[i]) {
            return null;
        }
        if (i == 32 && this.onWarmupCompleted) {
            return onExtraCallbackWithResult;
        }
        if (i <= 127) {
            char[] cArr = onNavigationEvent;
            return new char[]{'%', cArr[i >>> 4], cArr[i & 15]};
        }
        if (i <= 2047) {
            char[] cArr2 = onNavigationEvent;
            char c = cArr2[i & 15];
            return new char[]{'%', cArr2[(i >>> 10) | 12], cArr2[(i >>> 6) & 15], '%', cArr2[8 | ((i >>> 4) & 3)], c};
        }
        if (i <= 65535) {
            char[] cArr3 = onNavigationEvent;
            char c2 = cArr3[i & 15];
            char c3 = cArr3[((i >>> 4) & 3) | 8];
            return new char[]{'%', 'E', cArr3[i >>> 12], '%', cArr3[((i >>> 10) & 3) | 8], cArr3[(i >>> 6) & 15], '%', c3, c2};
        }
        if (i <= 1114111) {
            char[] cArr4 = onNavigationEvent;
            char c4 = cArr4[i & 15];
            char c5 = cArr4[((i >>> 4) & 3) | 8];
            char c6 = cArr4[(i >>> 6) & 15];
            char c7 = cArr4[((i >>> 10) & 3) | 8];
            return new char[]{'%', 'F', cArr4[(i >>> 18) & 7], '%', cArr4[((i >>> 16) & 3) | 8], cArr4[(i >>> 12) & 15], '%', c7, c6, '%', c5, c4};
        }
        throw new IllegalArgumentException("Invalid unicode character value " + i);
    }
}
