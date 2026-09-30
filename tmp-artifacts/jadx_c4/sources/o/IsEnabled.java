package o;

import com.skp.smarttouch.sem.tools.smartcard.AbstractSmartcard;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class IsEnabled {
    private static final byte[] IAuthTabCallback = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access100;
    private static int asBinder;
    private static final byte[] onExtraCallback;
    private static final byte[] onExtraCallbackWithResult;
    private static final byte[] onNavigationEvent;
    private static final IsEnabled onWarmupCompleted;
    private final byte[] IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final String asInterface;
    private final String onTransact;

    static {
        byte[] bArr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, AbstractSmartcard.BYTE_READ_MORE, 98, 99, 100, 101, 102};
        onExtraCallbackWithResult = bArr;
        onExtraCallback = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        onWarmupCompleted = new IsEnabled("", "", "", bArr);
        onNavigationEvent = new byte[0];
        int i = asBinder + 39;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    private IsEnabled(String str, String str2, String str3, byte[] bArr) {
        Objects.requireNonNull(str, "delimiter");
        this.asInterface = str;
        Objects.requireNonNull(str2, "prefix");
        this.onTransact = str2;
        Objects.requireNonNull(str3, "suffix");
        this.IAuthTabCallbackStub = str3;
        this.IAuthTabCallbackDefault = bArr;
    }

    public static IsEnabled onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 35;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        IsEnabled isEnabled = onWarmupCompleted;
        int i5 = i2 + 111;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
        return isEnabled;
    }

    public IsEnabled IAuthTabCallback() {
        int i = 2 % 2;
        IsEnabled isEnabled = new IsEnabled(this.asInterface, this.onTransact, this.IAuthTabCallbackStub, IAuthTabCallback);
        int i2 = access100 + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return isEnabled;
    }

    public String onWarmupCompleted(byte[] bArr) throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 117;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onNavigationEvent(bArr, 0, bArr.length);
        int i4 = access100 + 15;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return strOnNavigationEvent;
    }

    public String onNavigationEvent(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 2 % 2;
        Objects.requireNonNull(bArr, "bytes");
        StartMotionInteraction.onWarmupCompleted(i, i2, bArr.length);
        int i4 = i2 - i;
        if (i4 != 0) {
            String strOnWarmupCompleted = onWarmupCompleted(bArr, i, i2);
            if (strOnWarmupCompleted != null) {
                return strOnWarmupCompleted;
            }
            long length = this.onTransact.length();
            StringBuilder sb = new StringBuilder(onWarmupCompleted((i4 * (((length + 2) + this.IAuthTabCallbackStub.length()) + this.asInterface.length())) - this.asInterface.length()));
            IAuthTabCallback(sb, bArr, i, i2);
            return sb.toString();
        }
        int i5 = access100;
        int i6 = i5 + 115;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 25 / 0;
        }
        int i8 = i5 + 81;
        IAuthTabCallbackStubProxy = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 99 / 0;
        }
        return "";
    }

    public <A extends Appendable> A IAuthTabCallback(A a, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 2 % 2;
        Objects.requireNonNull(a, "out");
        Objects.requireNonNull(bArr, "bytes");
        StartMotionInteraction.onWarmupCompleted(i, i2, bArr.length);
        int i4 = i2 - i;
        if (i4 <= 0) {
            return a;
        }
        try {
            String str = this.IAuthTabCallbackStub + this.asInterface + this.onTransact;
            a.append(this.onTransact);
            onExtraCallback(a, bArr[i]);
            int i5 = 1;
            if (str.isEmpty()) {
                int i6 = access100 + 123;
                IAuthTabCallbackStubProxy = i6 % 128;
                int i7 = i6 % 2;
                while (i5 < i4) {
                    int i8 = IAuthTabCallbackStubProxy + 45;
                    access100 = i8 % 128;
                    if (i8 % 2 != 0) {
                        onExtraCallback(a, bArr[i / i5]);
                        i5 += 25;
                    } else {
                        onExtraCallback(a, bArr[i + i5]);
                        i5++;
                    }
                }
            } else {
                while (i5 < i4) {
                    int i9 = IAuthTabCallbackStubProxy + 85;
                    access100 = i9 % 128;
                    int i10 = i9 % 2;
                    a.append(str);
                    onExtraCallback(a, bArr[i + i5]);
                    i5++;
                }
            }
            a.append(this.IAuthTabCallbackStub);
            return a;
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    private String onWarmupCompleted(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        int i3 = 2 % 2;
        if (!this.onTransact.isEmpty() || !this.IAuthTabCallbackStub.isEmpty()) {
            return null;
        }
        int i4 = access100 + 93;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i2 - i;
        if (this.asInterface.isEmpty()) {
            bArr2 = new byte[onWarmupCompleted(i6 << 1)];
            int i7 = access100 + 59;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            for (int i9 = 0; i9 < i6; i9++) {
                int i10 = IAuthTabCallbackStubProxy + 49;
                access100 = i10 % 128;
                int i11 = i10 % 2;
                int i12 = i9 << 1;
                int i13 = i + i9;
                bArr2[i12] = (byte) onExtraCallback(bArr[i13]);
                bArr2[i12 + 1] = (byte) onExtraCallbackWithResult(bArr[i13]);
            }
        } else {
            if (this.asInterface.length() != 1) {
                return null;
            }
            int i14 = access100 + 61;
            IAuthTabCallbackStubProxy = i14 % 128;
            if (i14 % 2 == 0) {
                if (this.asInterface.charAt(0) >= 10214) {
                    return null;
                }
            } else if (this.asInterface.charAt(0) >= 256) {
                return null;
            }
            char cCharAt = this.asInterface.charAt(0);
            bArr2 = new byte[onWarmupCompleted((i6 * 3) - 1)];
            bArr2[0] = (byte) onExtraCallback(bArr[i]);
            bArr2[1] = (byte) onExtraCallbackWithResult(bArr[i]);
            int i15 = 1;
            while (i15 < i6) {
                int i16 = i15 * 3;
                bArr2[i16 - 1] = (byte) cCharAt;
                int i17 = i + i15;
                bArr2[i16] = (byte) onExtraCallback(bArr[i17]);
                bArr2[i16 + 1] = (byte) onExtraCallbackWithResult(bArr[i17]);
                i15++;
                int i18 = access100 + 85;
                IAuthTabCallbackStubProxy = i18 % 128;
                int i19 = i18 % 2;
            }
        }
        return new String(bArr2, StandardCharsets.ISO_8859_1);
    }

    private static int onWarmupCompleted(long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 33;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        if (j <= 2147483647L) {
            int i5 = i3 + 103;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return (int) j;
        }
        throw new OutOfMemoryError("String size " + j + " exceeds maximum 2147483647");
    }

    public byte[] onExtraCallbackWithResult(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = access100 + 105;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArrOnExtraCallbackWithResult = onExtraCallbackWithResult(charSequence, 0, charSequence.length());
        int i4 = access100 + 39;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return bArrOnExtraCallbackWithResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] onExtraCallbackWithResult(CharSequence charSequence, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = access100 + 115;
        IAuthTabCallbackStubProxy = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            Objects.requireNonNull(charSequence, "string");
            StartMotionInteraction.onWarmupCompleted(i, i2, charSequence.length());
            if (i != 0 || i2 != charSequence.length()) {
                charSequence = charSequence.subSequence(i, i2);
            }
            if (charSequence.length() == 0) {
                int i5 = IAuthTabCallbackStubProxy + 57;
                access100 = i5 % 128;
                if (i5 % 2 == 0) {
                    return onNavigationEvent;
                }
                throw null;
            }
            int i6 = 0;
            if (this.asInterface.isEmpty()) {
                int i7 = IAuthTabCallbackStubProxy + 45;
                access100 = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 18 / 0;
                    if (this.onTransact.isEmpty()) {
                        if (this.IAuthTabCallbackStub.isEmpty()) {
                            return IAuthTabCallback(charSequence);
                        }
                    }
                } else if (this.onTransact.isEmpty()) {
                }
            }
            long length = this.onTransact.length() + 2 + this.IAuthTabCallbackStub.length();
            long length2 = this.asInterface.length() + length;
            if ((charSequence.length() - length) % length2 != 0) {
                throw new IllegalArgumentException("extra or missing delimiters or values consisting of prefix, two hexadecimal digits, and suffix");
            }
            onNavigationEvent(charSequence, 0, this.onTransact);
            onNavigationEvent(charSequence, charSequence.length() - this.IAuthTabCallbackStub.length(), this.IAuthTabCallbackStub);
            String str = this.IAuthTabCallbackStub + this.asInterface + this.onTransact;
            int length3 = (int) (((charSequence.length() - length) / length2) + 1);
            byte[] bArr = new byte[length3];
            int length4 = this.onTransact.length();
            while (i6 < length3 - 1) {
                bArr[i6] = (byte) onWarmupCompleted(charSequence, length4);
                onNavigationEvent(charSequence, length4 + 2, str);
                i6++;
                length4 += str.length() + 2;
            }
            bArr[i6] = (byte) onWarmupCompleted(charSequence, length4);
            return bArr;
        }
        Objects.requireNonNull(charSequence, "string");
        StartMotionInteraction.onWarmupCompleted(i, i2, charSequence.length());
        obj.hashCode();
        throw null;
    }

    private static void onNavigationEvent(CharSequence charSequence, int i, String str) {
        int i2;
        int i3 = 2 % 2;
        if (str.isEmpty()) {
            return;
        }
        int i4 = 0;
        if (str.length() == 1 && str.charAt(0) == charSequence.charAt(i)) {
            return;
        }
        while (i4 < str.length()) {
            int i5 = access100 + 81;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                i2 = i + i4;
                if (charSequence.charAt(i2) != str.charAt(i4)) {
                    throw new IllegalArgumentException(onExtraCallbackWithResult("found: \"" + ((Object) charSequence.subSequence(i, str.length() + i)) + "\", expected: \"" + str + "\", index: " + i + " ch: " + ((int) charSequence.charAt(i2))));
                }
                i4++;
                int i6 = IAuthTabCallbackStubProxy + 95;
                access100 = i6 % 128;
                int i7 = i6 % 2;
            } else {
                i2 = i + i4;
                if (charSequence.charAt(i2) != str.charAt(i4)) {
                    throw new IllegalArgumentException(onExtraCallbackWithResult("found: \"" + ((Object) charSequence.subSequence(i, str.length() + i)) + "\", expected: \"" + str + "\", index: " + i + " ch: " + ((int) charSequence.charAt(i2))));
                }
                i4++;
                int i62 = IAuthTabCallbackStubProxy + 95;
                access100 = i62 % 128;
                int i72 = i62 % 2;
            }
        }
    }

    private static String onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 29;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String strReplace = str.replace("\n", "\\n").replace("\r", "\\r");
        int i4 = access100 + 97;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return strReplace;
    }

    public char onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 103;
        int i4 = i3 % 128;
        access100 = i4;
        int i5 = i3 % 2;
        char c = (char) this.IAuthTabCallbackDefault[i & 15];
        int i6 = i4 + 57;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return c;
    }

    public char onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = access100;
        int i4 = i3 + 61;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        char c = (char) this.IAuthTabCallbackDefault[(i >> 4) & 15];
        int i6 = i3 + 23;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 98 / 0;
        }
        return c;
    }

    public <A extends Appendable> A onExtraCallback(A a, byte b) throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 77;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Objects.requireNonNull(a, "out");
        try {
            a.append(onExtraCallback(b));
            a.append(onExtraCallbackWithResult(b));
            int i4 = IAuthTabCallbackStubProxy + 83;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            return a;
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    private static byte[] IAuthTabCallback(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = access100 + 71;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if ((charSequence.length() & 1) != 0) {
            throw new IllegalArgumentException("string length not even: " + charSequence.length());
        }
        int length = charSequence.length() / 2;
        byte[] bArr = new byte[length];
        int i4 = 0;
        while (i4 < length) {
            int i5 = IAuthTabCallbackStubProxy + 75;
            access100 = i5 % 128;
            if (i5 % 2 != 0) {
                bArr[i4] = (byte) onWarmupCompleted(charSequence, i4);
                i4 += 48;
            } else {
                bArr[i4] = (byte) onWarmupCompleted(charSequence, i4 << 1);
                i4++;
            }
        }
        int i6 = IAuthTabCallbackStubProxy + 23;
        access100 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 87 / 0;
        }
        return bArr;
    }

    public static int onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = access100;
        int i4 = i3 + 91;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        if ((i >>> 8) == 0) {
            int i6 = i3 + 73;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            byte b = onExtraCallback[i];
            if (b >= 0) {
                return b;
            }
        }
        throw new NumberFormatException("not a hexadecimal digit: \"" + ((char) i) + "\" = " + i);
    }

    private static int onWarmupCompleted(CharSequence charSequence, int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 87;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        int iOnNavigationEvent = onNavigationEvent(charSequence.charAt(i + 1)) | (onNavigationEvent(charSequence.charAt(i)) << 4);
        int i5 = access100 + 115;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return iOnNavigationEvent;
        }
        throw null;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj == null || IsEnabled.class != obj.getClass()) {
            return false;
        }
        int i2 = IAuthTabCallbackStubProxy + 71;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            Arrays.equals(this.IAuthTabCallbackDefault, ((IsEnabled) obj).IAuthTabCallbackDefault);
            throw null;
        }
        IsEnabled isEnabled = (IsEnabled) obj;
        if ((!Arrays.equals(this.IAuthTabCallbackDefault, isEnabled.IAuthTabCallbackDefault)) || !this.asInterface.equals(isEnabled.asInterface)) {
            return false;
        }
        int i3 = access100 + 29;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            this.onTransact.equals(isEnabled.onTransact);
            throw null;
        }
        if (!this.onTransact.equals(isEnabled.onTransact)) {
            return false;
        }
        int i4 = IAuthTabCallbackStubProxy + 59;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return this.IAuthTabCallbackStub.equals(isEnabled.IAuthTabCallbackStub);
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = access100 + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iHash = (Objects.hash(this.asInterface, this.onTransact, this.IAuthTabCallbackStub) * 31) + Boolean.hashCode(Arrays.equals(this.IAuthTabCallbackDefault, IAuthTabCallback));
        int i4 = IAuthTabCallbackStubProxy + 43;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return iHash;
    }

    public String toString() {
        int i = 2 % 2;
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult("uppercase: " + Arrays.equals(this.IAuthTabCallbackDefault, IAuthTabCallback) + ", delimiter: \"" + this.asInterface + "\", prefix: \"" + this.onTransact + "\", suffix: \"" + this.IAuthTabCallbackStub + "\"");
        int i2 = IAuthTabCallbackStubProxy + 123;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return strOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
