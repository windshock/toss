package o;

import java.io.Serializable;
import java.nio.CharBuffer;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class getDynamicShowType implements CharSequence, Appendable, Serializable {
    private static final long serialVersionUID = 1;
    private char[] buffer;
    private String newLine;
    private String nullText;
    private int reallocations;
    private int size;
    private static final int onExtraCallbackWithResult = Boolean.FALSE.toString().length();
    private static final int IAuthTabCallback = Boolean.TRUE.toString().length();

    public getDynamicShowType() {
        this(32);
    }

    public getDynamicShowType(int i) {
        this.buffer = new char[i <= 0 ? 32 : i];
    }

    @Override // java.lang.Appendable
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public getDynamicShowType append(char c) {
        IAuthTabCallback(length() + 1);
        char[] cArr = this.buffer;
        int i = this.size;
        this.size = i + 1;
        cArr[i] = c;
        return this;
    }

    public getDynamicShowType onNavigationEvent(CharBuffer charBuffer) {
        return onWarmupCompleted(charBuffer, 0, PAGAppOpenAd.onWarmupCompleted(charBuffer));
    }

    public getDynamicShowType onWarmupCompleted(CharBuffer charBuffer, int i, int i2) {
        if (charBuffer == null) {
            return onNavigationEvent();
        }
        if (charBuffer.hasArray()) {
            int iRemaining = charBuffer.remaining();
            if (i < 0 || i > iRemaining) {
                throw new StringIndexOutOfBoundsException("startIndex must be valid");
            }
            if (i2 < 0 || i + i2 > iRemaining) {
                throw new StringIndexOutOfBoundsException("length must be valid");
            }
            int length = length();
            IAuthTabCallback(length + i2);
            System.arraycopy(charBuffer.array(), charBuffer.arrayOffset() + charBuffer.position() + i, this.buffer, length, i2);
            this.size += i2;
            return this;
        }
        IAuthTabCallback(charBuffer.toString(), i, i2);
        return this;
    }

    @Override // java.lang.Appendable
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public getDynamicShowType append(CharSequence charSequence) {
        if (charSequence == null) {
            return onNavigationEvent();
        }
        if (charSequence instanceof getDynamicShowType) {
            return onExtraCallbackWithResult((getDynamicShowType) charSequence);
        }
        if (charSequence instanceof StringBuilder) {
            return onNavigationEvent((StringBuilder) charSequence);
        }
        if (charSequence instanceof StringBuffer) {
            return onNavigationEvent((StringBuffer) charSequence);
        }
        if (charSequence instanceof CharBuffer) {
            return onNavigationEvent((CharBuffer) charSequence);
        }
        return IAuthTabCallback(charSequence.toString());
    }

    @Override // java.lang.Appendable
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public getDynamicShowType append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            return onNavigationEvent();
        }
        if (i2 <= 0) {
            throw new StringIndexOutOfBoundsException("endIndex must be valid");
        }
        if (i >= i2) {
            throw new StringIndexOutOfBoundsException("endIndex must be greater than startIndex");
        }
        return IAuthTabCallback(charSequence.toString(), i, i2 - i);
    }

    public getDynamicShowType onExtraCallbackWithResult(Object obj) {
        if (obj == null) {
            return onNavigationEvent();
        }
        if (obj instanceof CharSequence) {
            return append((CharSequence) obj);
        }
        return IAuthTabCallback(obj.toString());
    }

    public getDynamicShowType IAuthTabCallback(String str) {
        return IAuthTabCallback(str, 0, PAGAppOpenAd.onWarmupCompleted(str));
    }

    public getDynamicShowType IAuthTabCallback(String str, int i, int i2) {
        int i3;
        if (str == null) {
            return onNavigationEvent();
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

    public getDynamicShowType onNavigationEvent(StringBuffer stringBuffer) {
        return IAuthTabCallback(stringBuffer, 0, PAGAppOpenAd.onWarmupCompleted(stringBuffer));
    }

    public getDynamicShowType IAuthTabCallback(StringBuffer stringBuffer, int i, int i2) {
        int i3;
        if (stringBuffer == null) {
            return onNavigationEvent();
        }
        if (i < 0 || i > stringBuffer.length()) {
            throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        if (i2 < 0 || (i3 = i + i2) > stringBuffer.length()) {
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        if (i2 > 0) {
            int length = length();
            IAuthTabCallback(length + i2);
            stringBuffer.getChars(i, i3, this.buffer, length);
            this.size += i2;
        }
        return this;
    }

    public getDynamicShowType onNavigationEvent(StringBuilder sb) {
        return onExtraCallbackWithResult(sb, 0, PAGAppOpenAd.onWarmupCompleted(sb));
    }

    public getDynamicShowType onExtraCallbackWithResult(StringBuilder sb, int i, int i2) {
        int i3;
        if (sb == null) {
            return onNavigationEvent();
        }
        if (i < 0 || i > sb.length()) {
            throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        if (i2 < 0 || (i3 = i + i2) > sb.length()) {
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        if (i2 > 0) {
            int length = length();
            IAuthTabCallback(length + i2);
            sb.getChars(i, i3, this.buffer, length);
            this.size += i2;
        }
        return this;
    }

    public getDynamicShowType onExtraCallbackWithResult(getDynamicShowType getdynamicshowtype) {
        return onExtraCallback(getdynamicshowtype, 0, PAGAppOpenAd.onWarmupCompleted(getdynamicshowtype));
    }

    public getDynamicShowType onExtraCallback(getDynamicShowType getdynamicshowtype, int i, int i2) {
        int i3;
        if (getdynamicshowtype == null) {
            return onNavigationEvent();
        }
        if (i < 0 || i > getdynamicshowtype.length()) {
            throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        if (i2 < 0 || (i3 = i + i2) > getdynamicshowtype.length()) {
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        if (i2 > 0) {
            int length = length();
            IAuthTabCallback(length + i2);
            getdynamicshowtype.onExtraCallback(i, i3, this.buffer, length);
            this.size += i2;
        }
        return this;
    }

    public getDynamicShowType onNavigationEvent() {
        String str = this.nullText;
        return str == null ? this : IAuthTabCallback(str);
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        onExtraCallbackWithResult(i);
        return this.buffer[i];
    }

    public getDynamicShowType IAuthTabCallback(int i) {
        if (i > 0 && i - this.buffer.length > 0) {
            onNavigationEvent(i);
        }
        return this;
    }

    public boolean equals(Object obj) {
        return (obj instanceof getDynamicShowType) && IAuthTabCallback((getDynamicShowType) obj);
    }

    public boolean IAuthTabCallback(getDynamicShowType getdynamicshowtype) {
        int i;
        if (this == getdynamicshowtype) {
            return true;
        }
        if (getdynamicshowtype == null || (i = this.size) != getdynamicshowtype.size) {
            return false;
        }
        char[] cArr = this.buffer;
        char[] cArr2 = getdynamicshowtype.buffer;
        do {
            i--;
            if (i < 0) {
                return true;
            }
        } while (cArr[i] == cArr2[i]);
        return false;
    }

    public void onExtraCallback(int i, int i2, char[] cArr, int i3) {
        if (i < 0) {
            throw new StringIndexOutOfBoundsException(i);
        }
        if (i2 < 0 || i2 > length()) {
            throw new StringIndexOutOfBoundsException(i2);
        }
        if (i > i2) {
            throw new StringIndexOutOfBoundsException("end < start");
        }
        System.arraycopy(this.buffer, i, cArr, i3, i2 - i);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.size;
    }

    private void onNavigationEvent(int i) {
        this.buffer = Arrays.copyOf(this.buffer, i);
        this.reallocations++;
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
        return onExtraCallback(i, i2);
    }

    public String onExtraCallback(int i, int i2) {
        return new String(this.buffer, i, IAuthTabCallback(i, i2) - i);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return new String(this.buffer, 0, this.size);
    }

    protected void onExtraCallbackWithResult(int i) {
        if (i < 0 || i >= this.size) {
            throw new StringIndexOutOfBoundsException(i);
        }
    }

    protected int IAuthTabCallback(int i, int i2) {
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
