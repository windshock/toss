package j$.time.format;

import j$.time.DateTimeException;
import j$.time.temporal.ChronoField;
import java.util.Objects;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class j implements e {
    public static final String[] d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};
    public static final j e = new j("+HH:MM:ss", "Z");
    public static final j f = new j("+HH:MM:ss", "0");
    public final String a;
    public final int b;
    public final int c;

    public j(String str, String str2) {
        Objects.requireNonNull(str, "pattern");
        Objects.requireNonNull(str2, "noOffsetText");
        int i = 0;
        while (true) {
            String[] strArr = d;
            if (i < strArr.length) {
                if (strArr[i].equals(str)) {
                    this.b = i;
                    this.c = i % 11;
                    this.a = str2;
                    return;
                }
                i++;
            } else {
                throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
            }
        }
    }

    @Override // j$.time.format.e
    public final boolean o(w wVar, StringBuilder sb) {
        Long lA = wVar.a(ChronoField.OFFSET_SECONDS);
        boolean z = false;
        if (lA == null) {
            return false;
        }
        int intExact = Math.toIntExact(lA.longValue());
        String str = this.a;
        if (intExact == 0) {
            sb.append(str);
            return true;
        }
        int iAbs = Math.abs((intExact / 3600) % 100);
        int iAbs2 = Math.abs((intExact / 60) % 60);
        int iAbs3 = Math.abs(intExact % 60);
        int length = sb.length();
        sb.append(intExact < 0 ? "-" : "+");
        if (this.b < 11 || iAbs >= 10) {
            a(false, iAbs, sb);
        } else {
            sb.append((char) (iAbs + 48));
        }
        int i = this.c;
        if ((i >= 3 && i <= 8) || ((i >= 9 && iAbs3 > 0) || (i >= 1 && iAbs2 > 0))) {
            a(i > 0 && i % 2 == 0, iAbs2, sb);
            iAbs += iAbs2;
            if (i == 7 || i == 8 || (i >= 5 && iAbs3 > 0)) {
                if (i > 0 && i % 2 == 0) {
                    z = true;
                }
                a(z, iAbs3, sb);
                iAbs += iAbs3;
            }
        }
        if (iAbs == 0) {
            sb.setLength(length);
            sb.append(str);
        }
        return true;
    }

    public static void a(boolean z, int i, StringBuilder sb) {
        sb.append(z ? ":" : _UrlKt.FRAGMENT_ENCODE_SET);
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f1  */
    @Override // j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int w(u uVar, CharSequence charSequence, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int length = charSequence.length();
        int length2 = this.a.length();
        if (length2 == 0) {
            if (i == length) {
                return uVar.f(ChronoField.OFFSET_SECONDS, 0L, i, i);
            }
        } else {
            if (i == length) {
                return ~i;
            }
            if (uVar.g(charSequence, i, this.a, 0, length2)) {
                return uVar.f(ChronoField.OFFSET_SECONDS, 0L, i, i + length2);
            }
        }
        char cCharAt = charSequence.charAt(i);
        if (cCharAt == '+' || cCharAt == '-') {
            int i7 = cCharAt == '-' ? -1 : 1;
            int i8 = this.c;
            boolean z = i8 > 0 && i8 % 2 == 0;
            int i9 = this.b;
            boolean z2 = i9 < 11;
            int[] iArr = new int[4];
            iArr[0] = i + 1;
            if (!uVar.c) {
                if (z2) {
                    if (z || (i9 == 0 && length > (i6 = i + 3) && charSequence.charAt(i6) == ':')) {
                        i4 = 10;
                        i9 = i4;
                        z = true;
                    } else {
                        i9 = 9;
                    }
                } else if (z || (i9 == 11 && length > (i5 = i + 3) && (charSequence.charAt(i + 2) == ':' || charSequence.charAt(i5) == ':'))) {
                    i4 = 21;
                    i9 = i4;
                    z = true;
                } else {
                    i9 = 20;
                }
            }
            switch (i9) {
                case 0:
                case 11:
                    c = 0;
                    c(charSequence, z2, iArr);
                    break;
                case 1:
                case 2:
                case 13:
                    c = 0;
                    c(charSequence, z2, iArr);
                    d(charSequence, z, false, iArr);
                    break;
                case 3:
                case 4:
                case 15:
                    c = 0;
                    c(charSequence, z2, iArr);
                    d(charSequence, z, true, iArr);
                    break;
                case 5:
                case 6:
                case 17:
                    c = 0;
                    c(charSequence, z2, iArr);
                    d(charSequence, z, true, iArr);
                    b(charSequence, z, 3, iArr);
                    break;
                case 7:
                case 8:
                case 19:
                    c(charSequence, z2, iArr);
                    d(charSequence, z, true, iArr);
                    if (!b(charSequence, z, 3, iArr)) {
                        c = 0;
                        iArr[0] = ~iArr[0];
                        break;
                    } else {
                        c = 0;
                        break;
                    }
                case 9:
                case 10:
                case 21:
                    c(charSequence, z2, iArr);
                    if (b(charSequence, z, 2, iArr)) {
                        b(charSequence, z, 3, iArr);
                    }
                    c = 0;
                    break;
                case 12:
                    e(charSequence, 1, 4, iArr);
                    c = 0;
                    break;
                case 14:
                    e(charSequence, 3, 4, iArr);
                    c = 0;
                    break;
                case 16:
                    e(charSequence, 3, 6, iArr);
                    c = 0;
                    break;
                case 18:
                    e(charSequence, 5, 6, iArr);
                    c = 0;
                    break;
                case 20:
                    e(charSequence, 1, 6, iArr);
                    c = 0;
                    break;
            }
            int i10 = iArr[c];
            if (i10 > 0) {
                int i11 = iArr[1];
                if (i11 > 23 || (i2 = iArr[2]) > 59 || (i3 = iArr[3]) > 59) {
                    throw new DateTimeException("Value out of range: Hour[0-23], Minute[0-59], Second[0-59]");
                }
                return uVar.f(ChronoField.OFFSET_SECONDS, ((i2 * 60) + (i11 * 3600) + i3) * i7, i, i10);
            }
        }
        return length2 == 0 ? uVar.f(ChronoField.OFFSET_SECONDS, 0L, i, i) : ~i;
    }

    public static void c(CharSequence charSequence, boolean z, int[] iArr) {
        if (z) {
            if (b(charSequence, false, 1, iArr)) {
                return;
            }
            iArr[0] = ~iArr[0];
            return;
        }
        e(charSequence, 1, 2, iArr);
    }

    public static void d(CharSequence charSequence, boolean z, boolean z2, int[] iArr) {
        if (b(charSequence, z, 2, iArr) || !z2) {
            return;
        }
        iArr[0] = ~iArr[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(CharSequence charSequence, boolean z, int i, int[] iArr) {
        int i2;
        int i3;
        int i4 = iArr[0];
        if (i4 < 0) {
            return true;
        }
        if (z && i != 1) {
            int i5 = i4 + 1;
            if (i5 <= charSequence.length() && charSequence.charAt(i4) == ':') {
                i4 = i5;
                i2 = i4 + 2;
                if (i2 <= charSequence.length()) {
                }
            }
        } else {
            i2 = i4 + 2;
            if (i2 <= charSequence.length()) {
                char cCharAt = charSequence.charAt(i4);
                char cCharAt2 = charSequence.charAt(i4 + 1);
                if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9' && (i3 = (cCharAt2 - '0') + ((cCharAt - '0') * 10)) >= 0 && i3 <= 59) {
                    iArr[i] = i3;
                    iArr[0] = i2;
                    return true;
                }
            }
        }
        return false;
    }

    public static void e(CharSequence charSequence, int i, int i2, int[] iArr) {
        int i3;
        char cCharAt;
        int i4 = iArr[0];
        char[] cArr = new char[i2];
        int i5 = 0;
        int i6 = 0;
        while (i5 < i2 && (i3 = i4 + 1) <= charSequence.length() && (cCharAt = charSequence.charAt(i4)) >= '0' && cCharAt <= '9') {
            cArr[i5] = cCharAt;
            i6++;
            i5++;
            i4 = i3;
        }
        if (i6 < i) {
            iArr[0] = ~iArr[0];
            return;
        }
        switch (i6) {
            case 1:
                iArr[1] = cArr[0] - '0';
                break;
            case 2:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                break;
            case 3:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                break;
            case 4:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                break;
            case 5:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                iArr[3] = (cArr[4] - '0') + ((cArr[3] - '0') * 10);
                break;
            case 6:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                iArr[3] = (cArr[5] - '0') + ((cArr[4] - '0') * 10);
                break;
        }
        iArr[0] = i4;
    }

    public final String toString() {
        String strReplace = this.a.replace("'", "''");
        return "Offset(" + d[this.b] + ",'" + strReplace + "')";
    }
}
