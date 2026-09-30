package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class setControllerStatusCallBack implements getCurrentPlayTime {
    private static final ThreadLocal<char[]> IAuthTabCallback = new ThreadLocal<char[]>() { // from class: o.setControllerStatusCallBack.4
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public char[] initialValue() {
            return new char[1024];
        }
    };

    protected abstract char[] onExtraCallbackWithResult(int i);

    protected static final int onExtraCallback(CharSequence charSequence, int i, int i2) {
        if (i < i2) {
            int i3 = i + 1;
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 55296 || cCharAt > 57343) {
                return cCharAt;
            }
            if (cCharAt > 56319) {
                throw new IllegalArgumentException("Unexpected low surrogate character '" + cCharAt + "' with value " + ((int) cCharAt) + " at index " + i);
            }
            if (i3 == i2) {
                return -cCharAt;
            }
            char cCharAt2 = charSequence.charAt(i3);
            if (Character.isLowSurrogate(cCharAt2)) {
                return Character.toCodePoint(cCharAt, cCharAt2);
            }
            throw new IllegalArgumentException("Expected low surrogate but got char '" + cCharAt2 + "' with value " + ((int) cCharAt2) + " at index " + i3);
        }
        throw new IndexOutOfBoundsException("Index exceeds specified range");
    }

    private static final char[] IAuthTabCallback(char[] cArr, int i, int i2) {
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }

    protected int onExtraCallbackWithResult(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            int iOnExtraCallback = onExtraCallback(charSequence, i, i2);
            if (iOnExtraCallback < 0 || onExtraCallbackWithResult(iOnExtraCallback) != null) {
                break;
            }
            i += Character.isSupplementaryCodePoint(iOnExtraCallback) ? 2 : 1;
        }
        return i;
    }

    @Override // o.getCurrentPlayTime
    public String onExtraCallback(String str) {
        int length = str.length();
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(str, 0, length);
        return iOnExtraCallbackWithResult == length ? str : onWarmupCompleted(str, iOnExtraCallbackWithResult);
    }

    protected final String onWarmupCompleted(String str, int i) {
        int length = str.length();
        char[] cArrIAuthTabCallback = IAuthTabCallback.get();
        int i2 = 0;
        int length2 = 0;
        while (i < length) {
            int iOnExtraCallback = onExtraCallback(str, i, length);
            if (iOnExtraCallback < 0) {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
            char[] cArrOnExtraCallbackWithResult = onExtraCallbackWithResult(iOnExtraCallback);
            if (cArrOnExtraCallbackWithResult != null) {
                int i3 = i - i2;
                int i4 = length2 + i3;
                int length3 = cArrOnExtraCallbackWithResult.length + i4;
                if (cArrIAuthTabCallback.length < length3) {
                    cArrIAuthTabCallback = IAuthTabCallback(cArrIAuthTabCallback, length2, length3 + (length - i) + 32);
                }
                if (i3 > 0) {
                    str.getChars(i2, i, cArrIAuthTabCallback, length2);
                    length2 = i4;
                }
                if (cArrOnExtraCallbackWithResult.length > 0) {
                    System.arraycopy(cArrOnExtraCallbackWithResult, 0, cArrIAuthTabCallback, length2, cArrOnExtraCallbackWithResult.length);
                    length2 += cArrOnExtraCallbackWithResult.length;
                }
            }
            i2 = (Character.isSupplementaryCodePoint(iOnExtraCallback) ? 2 : 1) + i;
            i = onExtraCallbackWithResult(str, i2, length);
        }
        int i5 = length - i2;
        if (i5 > 0) {
            int i6 = i5 + length2;
            if (cArrIAuthTabCallback.length < i6) {
                cArrIAuthTabCallback = IAuthTabCallback(cArrIAuthTabCallback, length2, i6);
            }
            str.getChars(i2, length, cArrIAuthTabCallback, length2);
            length2 = i6;
        }
        return new String(cArrIAuthTabCallback, 0, length2);
    }
}
