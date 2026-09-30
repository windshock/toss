package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getRunTime {
    public static final String onWarmupCompleted(byte b) {
        if (b == 1) {
            return "quotation mark '\"'";
        }
        if (b == 2) {
            return "string escape sequence '\\'";
        }
        if (b == 4) {
            return "comma ','";
        }
        if (b == 5) {
            return "colon ':'";
        }
        if (b == 6) {
            return "start of the object '{'";
        }
        if (b == 7) {
            return "end of the object '}'";
        }
        if (b == 8) {
            return "start of the array '['";
        }
        if (b == 9) {
            return "end of the array ']'";
        }
        if (b == 10) {
            return "end of the input";
        }
        if (b == Byte.MAX_VALUE) {
            return "invalid token";
        }
        return "valid token";
    }

    public static final byte onExtraCallback(char c) {
        if (c < '~') {
            return setDeepShakeValue.onWarmupCompleted[c];
        }
        return (byte) 0;
    }

    public static final char onWarmupCompleted(int i) {
        if (i < 117) {
            return setDeepShakeValue.onExtraCallbackWithResult[i];
        }
        return (char) 0;
    }
}
