package o;

import java.io.Serializable;
import java.nio.CharBuffer;

@Deprecated
/* renamed from: o.getTopDislike, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public class C0016getTopDislike implements CharSequence, Appendable, Serializable {
    private static final long serialVersionUID = 7628716375283629643L;
    char[] buffer;
    private String newLine;
    private String nullText;
    private int size;

    public C0016getTopDislike() {
        this(32);
    }

    public C0016getTopDislike(int i) {
        this.buffer = new char[i <= 0 ? 32 : i];
    }

    @Override // java.lang.Appendable
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public C0016getTopDislike append(char c) {
        IAuthTabCallback(length() + 1);
        char[] cArr = this.buffer;
        int i = this.size;
        this.size = i + 1;
        cArr[i] = c;
        return this;
    }

    public C0016getTopDislike onExtraCallbackWithResult(CharBuffer charBuffer) {
        if (charBuffer == null) {
            return onWarmupCompleted();
        }
        if (charBuffer.hasArray()) {
            int iRemaining = charBuffer.remaining();
            int length = length();
            IAuthTabCallback(length + iRemaining);
            System.arraycopy(charBuffer.array(), charBuffer.arrayOffset() + charBuffer.position(), this.buffer, length, iRemaining);
            this.size += iRemaining;
            return this;
        }
        onExtraCallbackWithResult(charBuffer.toString());
        return this;
    }

    @Override // java.lang.Appendable
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public C0016getTopDislike append(CharSequence charSequence) {
        if (charSequence == null) {
            return onWarmupCompleted();
        }
        if (charSequence instanceof C0016getTopDislike) {
            return IAuthTabCallback((C0016getTopDislike) charSequence);
        }
        if (charSequence instanceof StringBuilder) {
            return IAuthTabCallback((StringBuilder) charSequence);
        }
        if (charSequence instanceof StringBuffer) {
            return IAuthTabCallback((StringBuffer) charSequence);
        }
        if (charSequence instanceof CharBuffer) {
            return onExtraCallbackWithResult((CharBuffer) charSequence);
        }
        return onExtraCallbackWithResult(charSequence.toString());
    }

    @Override // java.lang.Appendable
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public C0016getTopDislike append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            return onWarmupCompleted();
        }
        return onWarmupCompleted(charSequence.toString(), i, i2);
    }

    public C0016getTopDislike onWarmupCompleted(Object obj) {
        if (obj == null) {
            return onWarmupCompleted();
        }
        if (obj instanceof CharSequence) {
            return append((CharSequence) obj);
        }
        return onExtraCallbackWithResult(obj.toString());
    }

    public C0016getTopDislike IAuthTabCallback(C0016getTopDislike c0016getTopDislike) {
        if (c0016getTopDislike == null) {
            return onWarmupCompleted();
        }
        int length = c0016getTopDislike.length();
        if (length > 0) {
            int length2 = length();
            IAuthTabCallback(length2 + length);
            System.arraycopy(c0016getTopDislike.buffer, 0, this.buffer, length2, length);
            this.size += length;
        }
        return this;
    }

    public C0016getTopDislike onExtraCallbackWithResult(String str) {
        if (str == null) {
            return onWarmupCompleted();
        }
        int length = str.length();
        if (length > 0) {
            int length2 = length();
            IAuthTabCallback(length2 + length);
            str.getChars(0, length, this.buffer, length2);
            this.size += length;
        }
        return this;
    }

    public C0016getTopDislike onWarmupCompleted(String str, int i, int i2) {
        int i3;
        if (str == null) {
            return onWarmupCompleted();
        }
        if (i < 0 || i > str.length()) {
            throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        if (i2 < 0 || (i3 = i + i2) > str.length()) {
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        if (i2 > 0) {
            int length = length();
            IAuthTabCallback(length + i2);
            str.getChars(i, i3, this.buffer, length);
            this.size += i2;
        }
        return this;
    }

    public C0016getTopDislike IAuthTabCallback(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return onWarmupCompleted();
        }
        int length = stringBuffer.length();
        if (length > 0) {
            int length2 = length();
            IAuthTabCallback(length2 + length);
            stringBuffer.getChars(0, length, this.buffer, length2);
            this.size += length;
        }
        return this;
    }

    public C0016getTopDislike IAuthTabCallback(StringBuilder sb) {
        if (sb == null) {
            return onWarmupCompleted();
        }
        int length = sb.length();
        if (length > 0) {
            int length2 = length();
            IAuthTabCallback(length2 + length);
            sb.getChars(0, length, this.buffer, length2);
            this.size += length;
        }
        return this;
    }

    public C0016getTopDislike onWarmupCompleted() {
        String str = this.nullText;
        return str == null ? this : onExtraCallbackWithResult(str);
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        if (i < 0 || i >= length()) {
            throw new StringIndexOutOfBoundsException(i);
        }
        return this.buffer[i];
    }

    public C0016getTopDislike IAuthTabCallback(int i) {
        char[] cArr = this.buffer;
        if (i > cArr.length) {
            char[] cArr2 = new char[i << 1];
            this.buffer = cArr2;
            System.arraycopy(cArr, 0, cArr2, 0, this.size);
        }
        return this;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0016getTopDislike) && onExtraCallbackWithResult((C0016getTopDislike) obj);
    }

    public boolean onExtraCallbackWithResult(C0016getTopDislike c0016getTopDislike) {
        int i;
        if (this == c0016getTopDislike) {
            return true;
        }
        if (c0016getTopDislike == null || (i = this.size) != c0016getTopDislike.size) {
            return false;
        }
        char[] cArr = this.buffer;
        char[] cArr2 = c0016getTopDislike.buffer;
        do {
            i--;
            if (i < 0) {
                return true;
            }
        } while (cArr[i] == cArr2[i]);
        return false;
    }

    public int hashCode() {
        char[] cArr = this.buffer;
        int i = 0;
        for (int i2 = this.size - 1; i2 >= 0; i2--) {
            i = (i * 31) + cArr[i2];
        }
        return i;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.size;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        if (i < 0) {
            throw new StringIndexOutOfBoundsException(i);
        }
        if (i2 > this.size) {
            throw new StringIndexOutOfBoundsException(i2);
        }
        if (i > i2) {
            throw new StringIndexOutOfBoundsException(i2 - i);
        }
        return onExtraCallbackWithResult(i, i2);
    }

    public String onExtraCallbackWithResult(int i, int i2) {
        return new String(this.buffer, i, onNavigationEvent(i, i2) - i);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return new String(this.buffer, 0, this.size);
    }

    protected int onNavigationEvent(int i, int i2) {
        if (i < 0) {
            throw new StringIndexOutOfBoundsException(i);
        }
        int i3 = this.size;
        if (i2 > i3) {
            i2 = i3;
        }
        if (i <= i2) {
            return i2;
        }
        throw new StringIndexOutOfBoundsException("end < start");
    }
}
