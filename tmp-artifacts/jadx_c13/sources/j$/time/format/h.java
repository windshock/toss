package j$.time.format;

import j$.time.temporal.ChronoField;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class h implements e {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ h(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // j$.time.format.e
    public final boolean o(w wVar, StringBuilder sb) {
        if (this.a != 0) {
            sb.append((String) this.b);
            return true;
        }
        Long lA = wVar.a(ChronoField.OFFSET_SECONDS);
        if (lA == null) {
            return false;
        }
        sb.append("GMT");
        int intExact = Math.toIntExact(lA.longValue());
        if (intExact == 0) {
            return true;
        }
        int iAbs = Math.abs((intExact / 3600) % 100);
        int iAbs2 = Math.abs((intExact / 60) % 60);
        int iAbs3 = Math.abs(intExact % 60);
        sb.append(intExact < 0 ? "-" : "+");
        if (((TextStyle) this.b) == TextStyle.FULL) {
            a(sb, iAbs);
            sb.append(':');
            a(sb, iAbs2);
            if (iAbs3 == 0) {
                return true;
            }
            sb.append(':');
            a(sb, iAbs3);
            return true;
        }
        if (iAbs >= 10) {
            sb.append((char) ((iAbs / 10) + 48));
        }
        sb.append((char) ((iAbs % 10) + 48));
        if (iAbs2 == 0 && iAbs3 == 0) {
            return true;
        }
        sb.append(':');
        a(sb, iAbs2);
        if (iAbs3 == 0) {
            return true;
        }
        sb.append(':');
        a(sb, iAbs3);
        return true;
    }

    @Override // j$.time.format.e
    public final int w(u uVar, CharSequence charSequence, int i) {
        int i2;
        int iB;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (this.a != 0) {
            String str = (String) this.b;
            if (i > charSequence.length() || i < 0) {
                throw new IndexOutOfBoundsException();
            }
            return !uVar.g(charSequence, i, str, 0, str.length()) ? ~i : str.length() + i;
        }
        int length = charSequence.length();
        if (uVar.g(charSequence, i, "GMT", 0, 3)) {
            int i8 = i + 3;
            if (i8 == length) {
                return uVar.f(ChronoField.OFFSET_SECONDS, 0L, i, i8);
            }
            char cCharAt = charSequence.charAt(i8);
            if (cCharAt == '+') {
                i2 = 1;
            } else {
                if (cCharAt != '-') {
                    return uVar.f(ChronoField.OFFSET_SECONDS, 0L, i, i8);
                }
                i2 = -1;
            }
            int i9 = i + 4;
            int i10 = 0;
            if (((TextStyle) this.b) == TextStyle.FULL) {
                int iB2 = b(charSequence, i9);
                int iB3 = b(charSequence, i + 5);
                if (iB2 >= 0 && iB3 >= 0 && charSequence.charAt(i + 6) == ':') {
                    iB = (iB2 * 10) + iB3;
                    int iB4 = b(charSequence, i + 7);
                    i7 = i + 9;
                    int iB5 = b(charSequence, i + 8);
                    if (iB4 >= 0 && iB5 >= 0) {
                        i6 = (iB4 * 10) + iB5;
                        int i11 = i + 11;
                        if (i11 < length && charSequence.charAt(i7) == ':') {
                            int iB6 = b(charSequence, i + 10);
                            int iB7 = b(charSequence, i11);
                            if (iB6 >= 0 && iB7 >= 0) {
                                i10 = (iB6 * 10) + iB7;
                                i7 = i + 12;
                            }
                        }
                        i5 = i7;
                    }
                }
            } else {
                int i12 = i + 5;
                iB = b(charSequence, i9);
                if (iB >= 0) {
                    if (i12 < length) {
                        int iB8 = b(charSequence, i12);
                        if (iB8 >= 0) {
                            iB = (iB * 10) + iB8;
                            i12 = i + 6;
                        }
                        int i13 = i12 + 2;
                        if (i13 < length && charSequence.charAt(i12) == ':' && i13 < length && charSequence.charAt(i12) == ':') {
                            int iB9 = b(charSequence, i12 + 1);
                            int iB10 = b(charSequence, i13);
                            if (iB9 >= 0 && iB10 >= 0) {
                                int i14 = iB10 + (iB9 * 10);
                                i5 = i12 + 3;
                                int i15 = i12 + 5;
                                if (i15 < length && charSequence.charAt(i5) == ':') {
                                    int iB11 = b(charSequence, i12 + 4);
                                    int iB12 = b(charSequence, i15);
                                    if (iB11 >= 0 && iB12 >= 0) {
                                        i10 = (iB11 * 10) + iB12;
                                        int i16 = i12 + 6;
                                        i6 = i14;
                                        i7 = i16;
                                        i5 = i7;
                                    }
                                }
                                i6 = i14;
                            }
                        }
                    }
                    i3 = i12;
                    i4 = 0;
                    return uVar.f(ChronoField.OFFSET_SECONDS, ((i10 * 60) + (iB * 3600) + i4) * i2, i, i3);
                }
            }
            i4 = i10;
            i3 = i5;
            i10 = i6;
            return uVar.f(ChronoField.OFFSET_SECONDS, ((i10 * 60) + (iB * 3600) + i4) * i2, i, i3);
        }
        return ~i;
    }

    public final String toString() {
        if (this.a != 0) {
            return "'" + ((String) this.b).replace("'", "''") + "'";
        }
        return "LocalizedOffset(" + ((TextStyle) this.b) + ")";
    }

    public static void a(StringBuilder sb, int i) {
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    public static int b(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if (cCharAt < '0' || cCharAt > '9') {
            return -1;
        }
        return cCharAt - '0';
    }
}
