package o;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getPostOnViewCreatedAlpha implements Serializable {
    private static final long serialVersionUID = 1;
    private final int _maxLineLength;
    final String _name;
    private final char _paddingChar;
    private final onWarmupCompleted _paddingReadBehaviour;
    private final boolean _writePadding;
    private final transient byte[] onExtraCallback;
    private final transient char[] onExtraCallbackWithResult;
    private final transient int[] onNavigationEvent;

    public enum onWarmupCompleted {
        PADDING_FORBIDDEN,
        PADDING_REQUIRED,
        PADDING_ALLOWED
    }

    public getPostOnViewCreatedAlpha(String str, String str2, boolean z, char c, int i2) {
        int[] iArr = new int[128];
        this.onNavigationEvent = iArr;
        char[] cArr = new char[64];
        this.onExtraCallbackWithResult = cArr;
        this.onExtraCallback = new byte[64];
        this._name = str;
        this._writePadding = z;
        this._paddingChar = c;
        this._maxLineLength = i2;
        int length = str2.length();
        if (length != 64) {
            throw new IllegalArgumentException("Base64Alphabet length must be exactly 64 (was " + length + ")");
        }
        str2.getChars(0, length, cArr, 0);
        Arrays.fill(iArr, -1);
        for (int i3 = 0; i3 < length; i3++) {
            char c2 = this.onExtraCallbackWithResult[i3];
            this.onExtraCallback[i3] = (byte) c2;
            this.onNavigationEvent[c2] = i3;
        }
        if (z) {
            this.onNavigationEvent[c] = -2;
        }
        this._paddingReadBehaviour = z ? onWarmupCompleted.PADDING_REQUIRED : onWarmupCompleted.PADDING_FORBIDDEN;
    }

    public getPostOnViewCreatedAlpha(getPostOnViewCreatedAlpha getpostonviewcreatedalpha, String str, int i2) {
        this(getpostonviewcreatedalpha, str, getpostonviewcreatedalpha._writePadding, getpostonviewcreatedalpha._paddingChar, i2);
    }

    public getPostOnViewCreatedAlpha(getPostOnViewCreatedAlpha getpostonviewcreatedalpha, String str, boolean z, char c, int i2) {
        this(getpostonviewcreatedalpha, str, z, c, getpostonviewcreatedalpha._paddingReadBehaviour, i2);
    }

    private getPostOnViewCreatedAlpha(getPostOnViewCreatedAlpha getpostonviewcreatedalpha, String str, boolean z, char c, onWarmupCompleted onwarmupcompleted, int i2) {
        int[] iArr = new int[128];
        this.onNavigationEvent = iArr;
        char[] cArr = new char[64];
        this.onExtraCallbackWithResult = cArr;
        byte[] bArr = new byte[64];
        this.onExtraCallback = bArr;
        this._name = str;
        byte[] bArr2 = getpostonviewcreatedalpha.onExtraCallback;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = getpostonviewcreatedalpha.onExtraCallbackWithResult;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = getpostonviewcreatedalpha.onNavigationEvent;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this._writePadding = z;
        this._paddingChar = c;
        this._maxLineLength = i2;
        this._paddingReadBehaviour = onwarmupcompleted;
    }

    protected Object readResolve() throws IllegalArgumentException {
        getPostOnViewCreatedAlpha getpostonviewcreatedalphaIAuthTabCallback = getPopEnterAnim.IAuthTabCallback(this._name);
        boolean z = this._writePadding;
        return (z == getpostonviewcreatedalphaIAuthTabCallback._writePadding && this._paddingChar == getpostonviewcreatedalphaIAuthTabCallback._paddingChar && this._paddingReadBehaviour == getpostonviewcreatedalphaIAuthTabCallback._paddingReadBehaviour && this._maxLineLength == getpostonviewcreatedalphaIAuthTabCallback._maxLineLength) ? getpostonviewcreatedalphaIAuthTabCallback : new getPostOnViewCreatedAlpha(getpostonviewcreatedalphaIAuthTabCallback, this._name, z, this._paddingChar, this._paddingReadBehaviour, this._maxLineLength);
    }

    public String onExtraCallback() {
        return this._name;
    }

    public boolean asBinder() {
        return this._writePadding;
    }

    public boolean IAuthTabCallbackDefault() {
        return this._paddingReadBehaviour == onWarmupCompleted.PADDING_REQUIRED;
    }

    public boolean onExtraCallbackWithResult() {
        return this._paddingReadBehaviour != onWarmupCompleted.PADDING_FORBIDDEN;
    }

    public boolean onWarmupCompleted(char c) {
        return c == this._paddingChar;
    }

    public boolean onWarmupCompleted(int i2) {
        return i2 == this._paddingChar;
    }

    public char onTransact() {
        return this._paddingChar;
    }

    public int IAuthTabCallback() {
        return this._maxLineLength;
    }

    public int onNavigationEvent(char c) {
        if (c <= 127) {
            return this.onNavigationEvent[c];
        }
        return -1;
    }

    public int onNavigationEvent(int i2) {
        if (i2 <= 127) {
            return this.onNavigationEvent[i2];
        }
        return -1;
    }

    public int onWarmupCompleted(int i2, char[] cArr, int i3) {
        char[] cArr2 = this.onExtraCallbackWithResult;
        cArr[i3] = cArr2[(i2 >> 18) & 63];
        cArr[i3 + 1] = cArr2[(i2 >> 12) & 63];
        cArr[i3 + 2] = cArr2[(i2 >> 6) & 63];
        cArr[i3 + 3] = cArr2[i2 & 63];
        return i3 + 4;
    }

    public void onExtraCallbackWithResult(StringBuilder sb, int i2) {
        sb.append(this.onExtraCallbackWithResult[(i2 >> 18) & 63]);
        sb.append(this.onExtraCallbackWithResult[(i2 >> 12) & 63]);
        sb.append(this.onExtraCallbackWithResult[(i2 >> 6) & 63]);
        sb.append(this.onExtraCallbackWithResult[i2 & 63]);
    }

    public int onWarmupCompleted(int i2, int i3, char[] cArr, int i4) {
        char[] cArr2 = this.onExtraCallbackWithResult;
        cArr[i4] = cArr2[(i2 >> 18) & 63];
        int i5 = i4 + 2;
        cArr[i4 + 1] = cArr2[(i2 >> 12) & 63];
        if (asBinder()) {
            cArr[i5] = i3 == 2 ? this.onExtraCallbackWithResult[(i2 >> 6) & 63] : this._paddingChar;
            cArr[i4 + 3] = this._paddingChar;
            return i4 + 4;
        }
        if (i3 != 2) {
            return i5;
        }
        cArr[i5] = this.onExtraCallbackWithResult[(i2 >> 6) & 63];
        return i4 + 3;
    }

    public void onExtraCallbackWithResult(StringBuilder sb, int i2, int i3) {
        sb.append(this.onExtraCallbackWithResult[(i2 >> 18) & 63]);
        sb.append(this.onExtraCallbackWithResult[(i2 >> 12) & 63]);
        if (asBinder()) {
            sb.append(i3 == 2 ? this.onExtraCallbackWithResult[(i2 >> 6) & 63] : this._paddingChar);
            sb.append(this._paddingChar);
        } else if (i3 == 2) {
            sb.append(this.onExtraCallbackWithResult[(i2 >> 6) & 63]);
        }
    }

    public int onNavigationEvent(int i2, byte[] bArr, int i3) {
        byte[] bArr2 = this.onExtraCallback;
        bArr[i3] = bArr2[(i2 >> 18) & 63];
        bArr[i3 + 1] = bArr2[(i2 >> 12) & 63];
        bArr[i3 + 2] = bArr2[(i2 >> 6) & 63];
        bArr[i3 + 3] = bArr2[i2 & 63];
        return i3 + 4;
    }

    public int onExtraCallback(int i2, int i3, byte[] bArr, int i4) {
        byte[] bArr2 = this.onExtraCallback;
        bArr[i4] = bArr2[(i2 >> 18) & 63];
        int i5 = i4 + 2;
        bArr[i4 + 1] = bArr2[(i2 >> 12) & 63];
        if (asBinder()) {
            byte b = (byte) this._paddingChar;
            bArr[i5] = i3 == 2 ? this.onExtraCallback[(i2 >> 6) & 63] : b;
            bArr[i4 + 3] = b;
            return i4 + 4;
        }
        if (i3 != 2) {
            return i5;
        }
        bArr[i5] = this.onExtraCallback[(i2 >> 6) & 63];
        return i4 + 3;
    }

    public String onNavigationEvent(byte[] bArr) {
        return onExtraCallbackWithResult(bArr, false);
    }

    public String onExtraCallbackWithResult(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z) {
            sb.append('\"');
        }
        int iIAuthTabCallback = IAuthTabCallback() >> 2;
        int i2 = 0;
        while (i2 <= length - 3) {
            byte b = bArr[i2];
            byte b2 = bArr[i2 + 1];
            int i3 = i2 + 3;
            onExtraCallbackWithResult(sb, (bArr[i2 + 2] & 255) | (((b << 8) | (b2 & 255)) << 8));
            iIAuthTabCallback--;
            if (iIAuthTabCallback <= 0) {
                sb.append('\\');
                sb.append('n');
                iIAuthTabCallback = IAuthTabCallback() >> 2;
            }
            i2 = i3;
        }
        int i4 = length - i2;
        if (i4 > 0) {
            int i5 = bArr[i2] << 16;
            if (i4 == 2) {
                i5 |= (bArr[i2 + 1] & 255) << 8;
            }
            onExtraCallbackWithResult(sb, i5, i4);
        }
        if (z) {
            sb.append('\"');
        }
        return sb.toString();
    }

    public byte[] onWarmupCompleted(String str) throws IllegalArgumentException {
        startPostponedEnterTransition startpostponedentertransition = new startPostponedEnterTransition();
        onWarmupCompleted(str, startpostponedentertransition);
        return startpostponedentertransition.asInterface();
    }

    public void onWarmupCompleted(String str, startPostponedEnterTransition startpostponedentertransition) throws IllegalArgumentException {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt > ' ') {
                int iOnNavigationEvent = onNavigationEvent(cCharAt);
                if (iOnNavigationEvent < 0) {
                    onExtraCallbackWithResult(cCharAt, 0, (String) null);
                }
                if (i3 >= length) {
                    onNavigationEvent();
                }
                int i4 = i2 + 2;
                char cCharAt2 = str.charAt(i3);
                int iOnNavigationEvent2 = onNavigationEvent(cCharAt2);
                if (iOnNavigationEvent2 < 0) {
                    onExtraCallbackWithResult(cCharAt2, 1, (String) null);
                }
                int i5 = (iOnNavigationEvent << 6) | iOnNavigationEvent2;
                if (i4 >= length) {
                    if (!IAuthTabCallbackDefault()) {
                        startpostponedentertransition.onWarmupCompleted(i5 >> 4);
                        return;
                    }
                    onNavigationEvent();
                }
                int i6 = i2 + 3;
                char cCharAt3 = str.charAt(i4);
                int iOnNavigationEvent3 = onNavigationEvent(cCharAt3);
                if (iOnNavigationEvent3 < 0) {
                    if (iOnNavigationEvent3 != -2) {
                        onExtraCallbackWithResult(cCharAt3, 2, (String) null);
                    }
                    if (!onExtraCallbackWithResult()) {
                        onWarmupCompleted();
                    }
                    if (i6 >= length) {
                        onNavigationEvent();
                    }
                    i2 += 4;
                    char cCharAt4 = str.charAt(i6);
                    if (!onWarmupCompleted(cCharAt4)) {
                        onExtraCallbackWithResult(cCharAt4, 3, "expected padding character '" + onTransact() + "'");
                    }
                    startpostponedentertransition.onWarmupCompleted(i5 >> 4);
                } else {
                    int i7 = (i5 << 6) | iOnNavigationEvent3;
                    if (i6 >= length) {
                        if (!IAuthTabCallbackDefault()) {
                            startpostponedentertransition.onExtraCallbackWithResult(i7 >> 2);
                            return;
                        }
                        onNavigationEvent();
                    }
                    i2 += 4;
                    char cCharAt5 = str.charAt(i6);
                    int iOnNavigationEvent4 = onNavigationEvent(cCharAt5);
                    if (iOnNavigationEvent4 < 0) {
                        if (iOnNavigationEvent4 != -2) {
                            onExtraCallbackWithResult(cCharAt5, 3, (String) null);
                        }
                        if (!onExtraCallbackWithResult()) {
                            onWarmupCompleted();
                        }
                        startpostponedentertransition.onExtraCallbackWithResult(i7 >> 2);
                    } else {
                        startpostponedentertransition.onExtraCallback((i7 << 6) | iOnNavigationEvent4);
                    }
                }
            } else {
                i2 = i3;
            }
        }
    }

    public String toString() {
        return this._name;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getPostOnViewCreatedAlpha.class) {
            return false;
        }
        getPostOnViewCreatedAlpha getpostonviewcreatedalpha = (getPostOnViewCreatedAlpha) obj;
        return getpostonviewcreatedalpha._paddingChar == this._paddingChar && getpostonviewcreatedalpha._maxLineLength == this._maxLineLength && getpostonviewcreatedalpha._writePadding == this._writePadding && getpostonviewcreatedalpha._paddingReadBehaviour == this._paddingReadBehaviour && this._name.equals(getpostonviewcreatedalpha._name);
    }

    public int hashCode() {
        return this._name.hashCode();
    }

    protected void onExtraCallbackWithResult(char c, int i2, String str) throws IllegalArgumentException {
        String str2;
        if (c <= ' ') {
            str2 = "Illegal white space character (code 0x" + Integer.toHexString(c) + ") as character #" + (i2 + 1) + " of 4-char base64 unit: can only used between units";
        } else if (onWarmupCompleted(c)) {
            str2 = "Unexpected padding character ('" + onTransact() + "') as character #" + (i2 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(c) || Character.isISOControl(c)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(c) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + c + "' (code 0x" + Integer.toHexString(c) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        throw new IllegalArgumentException(str2);
    }

    protected void onNavigationEvent() throws IllegalArgumentException {
        throw new IllegalArgumentException(asInterface());
    }

    protected void onWarmupCompleted() throws IllegalArgumentException {
        throw new IllegalArgumentException(IAuthTabCallbackStub());
    }

    protected String IAuthTabCallbackStub() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured", onExtraCallback());
    }

    public String asInterface() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end. This Base64Variant might have been incorrectly configured", onExtraCallback(), Character.valueOf(onTransact()));
    }
}
