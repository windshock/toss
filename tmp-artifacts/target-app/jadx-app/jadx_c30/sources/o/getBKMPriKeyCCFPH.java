package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class getBKMPriKeyCCFPH implements getBKMPriKeyFH {
    private static final ThreadLocal<char[]> IAuthTabCallback = new ThreadLocal<char[]>() { // from class: o.getBKMPriKeyCCFPH.2
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public char[] initialValue() {
            return new char[1024];
        }
    };

    protected abstract char[] onExtraCallbackWithResult(int i);

    protected int onNavigationEvent(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(charSequence, i, i2);
            if (iOnExtraCallbackWithResult < 0 || onExtraCallbackWithResult(iOnExtraCallbackWithResult) != null) {
                break;
            }
            i += Character.isSupplementaryCodePoint(iOnExtraCallbackWithResult) ? 2 : 1;
        }
        return i;
    }

    @Override // o.getBKMPriKeyFH
    public String IAuthTabCallback(String str) {
        int length = str.length();
        int iOnNavigationEvent = onNavigationEvent(str, 0, length);
        return iOnNavigationEvent == length ? str : IAuthTabCallback(str, iOnNavigationEvent);
    }

    protected final String IAuthTabCallback(String str, int i) {
        int length = str.length();
        char[] cArrOnExtraCallbackWithResult = IAuthTabCallback.get();
        int i2 = 0;
        int length2 = 0;
        while (i < length) {
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(str, i, length);
            if (iOnExtraCallbackWithResult < 0) {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
            char[] cArrOnExtraCallbackWithResult2 = onExtraCallbackWithResult(iOnExtraCallbackWithResult);
            if (cArrOnExtraCallbackWithResult2 != null) {
                int i3 = i - i2;
                int i4 = length2 + i3;
                int length3 = cArrOnExtraCallbackWithResult2.length + i4;
                if (cArrOnExtraCallbackWithResult.length < length3) {
                    cArrOnExtraCallbackWithResult = onExtraCallbackWithResult(cArrOnExtraCallbackWithResult, length2, length3 + (length - i) + 32);
                }
                if (i3 > 0) {
                    str.getChars(i2, i, cArrOnExtraCallbackWithResult, length2);
                    length2 = i4;
                }
                if (cArrOnExtraCallbackWithResult2.length > 0) {
                    System.arraycopy(cArrOnExtraCallbackWithResult2, 0, cArrOnExtraCallbackWithResult, length2, cArrOnExtraCallbackWithResult2.length);
                    length2 += cArrOnExtraCallbackWithResult2.length;
                }
            }
            i2 = (Character.isSupplementaryCodePoint(iOnExtraCallbackWithResult) ? 2 : 1) + i;
            i = onNavigationEvent(str, i2, length);
        }
        int i5 = length - i2;
        if (i5 > 0) {
            int i6 = i5 + length2;
            if (cArrOnExtraCallbackWithResult.length < i6) {
                cArrOnExtraCallbackWithResult = onExtraCallbackWithResult(cArrOnExtraCallbackWithResult, length2, i6);
            }
            str.getChars(i2, length, cArrOnExtraCallbackWithResult, length2);
            length2 = i6;
        }
        return new String(cArrOnExtraCallbackWithResult, 0, length2);
    }

    protected static final int onExtraCallbackWithResult(CharSequence charSequence, int i, int i2) {
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

    private static final char[] onExtraCallbackWithResult(char[] cArr, int i, int i2) {
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }
}
