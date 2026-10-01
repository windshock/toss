package kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Settings;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public class StringsKt__StringNumberConversionsJVMKt extends StringsKt__StringBuilderKt {
    private static final int asciiLetterToLowerCaseCode$StringsKt__StringNumberConversionsJVMKt(char c) {
        return c | ' ';
    }

    private static final boolean isAsciiDigit$StringsKt__StringNumberConversionsJVMKt(char c) {
        return ((c + 65488) & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 10;
    }

    private static final boolean isHexLetter$StringsKt__StringNumberConversionsJVMKt(char c) {
        return (((c | ' ') + (-97)) & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 6;
    }

    private static final String toString(byte b, int i) {
        String string = Integer.toString(b, CharsKt__CharJVMKt.checkRadix(i));
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private static final String toString(short s, int i) {
        String string = Integer.toString(s, CharsKt__CharJVMKt.checkRadix(i));
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private static final String toString(int i, int i2) {
        String string = Integer.toString(i, CharsKt__CharJVMKt.checkRadix(i2));
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private static final String toString(long j, int i) {
        String string = Long.toString(j, CharsKt__CharJVMKt.checkRadix(i));
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private static final boolean toBoolean(String str) {
        return Boolean.parseBoolean(str);
    }

    private static final byte toByte(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Byte.parseByte(str);
    }

    private static final byte toByte(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return Byte.parseByte(str, CharsKt__CharJVMKt.checkRadix(i));
    }

    private static final short toShort(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Short.parseShort(str);
    }

    private static final short toShort(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return Short.parseShort(str, CharsKt__CharJVMKt.checkRadix(i));
    }

    private static final int toInt(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Integer.parseInt(str);
    }

    private static final int toInt(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return Integer.parseInt(str, CharsKt__CharJVMKt.checkRadix(i));
    }

    private static final long toLong(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Long.parseLong(str);
    }

    private static final long toLong(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return Long.parseLong(str, CharsKt__CharJVMKt.checkRadix(i));
    }

    private static final float toFloat(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Float.parseFloat(str);
    }

    private static final double toDouble(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Double.parseDouble(str);
    }

    private static final BigInteger toBigInteger(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new BigInteger(str);
    }

    private static final BigInteger toBigInteger(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new BigInteger(str, CharsKt__CharJVMKt.checkRadix(i));
    }

    public static final BigInteger toBigIntegerOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return toBigIntegerOrNull(str, 10);
    }

    public static final BigInteger toBigIntegerOrNull(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        CharsKt__CharJVMKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        if (length == 1) {
            if (CharsKt__CharJVMKt.onExtraCallback(str.charAt(0), i) < 0) {
                return null;
            }
        } else {
            for (int i2 = str.charAt(0) != '-' ? 0 : 1; i2 < length; i2++) {
                if (CharsKt__CharJVMKt.onExtraCallback(str.charAt(i2), i) < 0) {
                    return null;
                }
            }
        }
        return new BigInteger(str, CharsKt__CharJVMKt.checkRadix(i));
    }

    private static final BigDecimal toBigDecimal(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new BigDecimal(str);
    }

    private static final BigDecimal toBigDecimal(String str, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mathContext, "");
        return new BigDecimal(str, mathContext);
    }

    private static final <T> T screenFloatValue$StringsKt__StringNumberConversionsJVMKt(String str, Function1<? super String, ? extends T> function1) {
        try {
            if (isValidFloat$StringsKt__StringNumberConversionsJVMKt(str)) {
                return function1.invoke(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static final <T> T screenBigDecimalValue$StringsKt__StringNumberConversionsJVMKt(String str, Function1<? super String, ? extends T> function1) {
        try {
            if (isValidBigDecimal$StringsKt__StringNumberConversionsJVMKt(str)) {
                return function1.invoke(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ec A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean isValidFloat$StringsKt__StringNumberConversionsJVMKt(String str) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        int length = str.length() - 1;
        int i2 = 0;
        while (i2 <= length && str.charAt(i2) <= ' ') {
            i2++;
        }
        if (i2 > length) {
            return false;
        }
        while (length > i2 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i2) == '+' || str.charAt(i2) == '-') {
            i2++;
        }
        if (i2 > length) {
            return false;
        }
        if (str.charAt(i2) != '0') {
            z = false;
        } else {
            int i3 = i2 + 1;
            if (i3 > length) {
                return true;
            }
            if ((str.charAt(i3) | ' ') == 120) {
                int i4 = i2 + 2;
                int i5 = i4;
                while (i5 <= length) {
                    if (((str.charAt(i5) - '0') & Settings.DEFAULT_INITIAL_WINDOW_SIZE) >= 10 && (((r15 | ' ') - 97) & Settings.DEFAULT_INITIAL_WINDOW_SIZE) >= 6) {
                        break;
                    }
                    i5++;
                }
                boolean z4 = i4 != i5;
                if (i5 <= length) {
                    if (str.charAt(i5) != '.') {
                        z3 = false;
                        if (z4) {
                        }
                        if (i2 != -1) {
                        }
                        return false;
                    }
                    int i6 = i5 + 1;
                    int i7 = i6;
                    while (i7 <= length) {
                        if (((str.charAt(i7) - '0') & Settings.DEFAULT_INITIAL_WINDOW_SIZE) >= 10 && (((r15 | ' ') - 97) & Settings.DEFAULT_INITIAL_WINDOW_SIZE) >= 6) {
                            break;
                        }
                        i7++;
                    }
                    if (i6 == i7) {
                        i5 = i7;
                        z3 = false;
                        if (z4) {
                        }
                        if (i2 != -1) {
                        }
                        return false;
                    }
                    i5 = i7;
                    z3 = true;
                    i2 = (!z4 || z3) ? i5 : -1;
                    if (i2 != -1 || i2 > length) {
                        return false;
                    }
                    z = true;
                }
            }
        }
        if (!z) {
            int i8 = i2;
            while (i8 <= length && ((str.charAt(i8) - '0') & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 10) {
                i8++;
            }
            boolean z5 = i2 != i8;
            if (i8 > length) {
                i2 = i8;
            } else if (str.charAt(i8) == '.') {
                int i9 = i8 + 1;
                i = i9;
                while (i <= length && ((str.charAt(i) - '0') & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 10) {
                    i++;
                }
                if (i9 != i) {
                    z2 = true;
                    if (z5 || z2) {
                        i2 = i;
                    } else {
                        String str2 = length == i + 2 ? "NaN" : length == i + 7 ? "Infinity" : null;
                        i2 = (str2 != null && StringsKt__StringsKt.indexOf((CharSequence) str, str2, i, false) == i) ? length + 1 : -1;
                    }
                } else {
                    i8 = i;
                    i = i8;
                    z2 = false;
                    if (z5) {
                        i2 = i;
                    }
                }
            } else {
                i = i8;
                z2 = false;
                if (z5) {
                }
            }
            if (i2 == -1) {
                return false;
            }
            if (i2 > length) {
                return true;
            }
        }
        int i10 = i2 + 1;
        int iCharAt = str.charAt(i2) | ' ';
        if (iCharAt != (z ? 112 : 101)) {
            return !z && (iCharAt == 102 || iCharAt == 100) && i10 > length;
        }
        if (i10 > length) {
            return false;
        }
        if ((str.charAt(i10) == '+' || str.charAt(i10) == '-') && (i10 = i2 + 2) > length) {
            return false;
        }
        while (i10 <= length && ((str.charAt(i10) - '0') & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 10) {
            i10++;
        }
        if (i10 > length) {
            return true;
        }
        if (i10 != length) {
            return false;
        }
        int iCharAt2 = str.charAt(i10) | ' ';
        return iCharAt2 == 102 || iCharAt2 == 100;
    }

    private static final boolean isValidBigDecimal$StringsKt__StringNumberConversionsJVMKt(String str) {
        int i;
        if (str.length() == 0) {
            return false;
        }
        int i2 = (str.charAt(0) == '-' || str.charAt(0) == '+') ? 1 : 0;
        int i3 = i2;
        while (i3 < str.length() && Character.isDigit(str.charAt(i3))) {
            i3++;
        }
        if (i3 == str.length()) {
            return i3 - i2 > 0;
        }
        if (str.charAt(i3) == '.') {
            i3++;
            if (i3 == str.length()) {
                return i3 - i2 > 1;
            }
            while (i3 < str.length() && Character.isDigit(str.charAt(i3))) {
                i3++;
            }
        }
        if (i3 == str.length()) {
            return true;
        }
        if ((str.charAt(i3) != 'e' && str.charAt(i3) != 'E') || (i = i3 + 1) == str.length()) {
            return false;
        }
        if (str.charAt(i) == '+' || str.charAt(i) == '-') {
            i = i3 + 2;
        }
        if (i == str.length()) {
            return false;
        }
        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            i++;
        }
        return i == str.length();
    }

    private static final String guessNamedFloatConstant$StringsKt__StringNumberConversionsJVMKt(int i, int i2) {
        if (i2 == i + 2) {
            return "NaN";
        }
        if (i2 == i + 7) {
            return "Infinity";
        }
        return null;
    }

    private static final int advanceWhile$StringsKt__StringNumberConversionsJVMKt(String str, int i, int i2, Function1<? super Character, Boolean> function1) {
        while (i <= i2 && function1.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
            i++;
        }
        return i;
    }

    private static final int backtrackWhile$StringsKt__StringNumberConversionsJVMKt(String str, int i, int i2, Function1<? super Character, Boolean> function1) {
        while (i2 > i && function1.invoke(Character.valueOf(str.charAt(i2))).booleanValue()) {
            i2--;
        }
        return i2;
    }

    private static final int advanceAndValidateMantissa$StringsKt__StringNumberConversionsJVMKt(String str, int i, int i2, boolean z, Function1<? super Character, Boolean> function1) {
        boolean z2;
        String str2;
        int i3 = i;
        while (i3 <= i2 && function1.invoke(Character.valueOf(str.charAt(i3))).booleanValue()) {
            i3++;
        }
        boolean z3 = i != i3;
        if (i3 > i2) {
            if (z) {
                return -1;
            }
            return i3;
        }
        if (str.charAt(i3) == '.') {
            int i4 = i3 + 1;
            int i5 = i4;
            while (i5 <= i2 && function1.invoke(Character.valueOf(str.charAt(i5))).booleanValue()) {
                i5++;
            }
            z2 = i4 != i5;
            i3 = i5;
        } else {
            z2 = false;
        }
        if (z3 || z2) {
            return i3;
        }
        if (z) {
            return -1;
        }
        if (i2 == i3 + 2) {
            str2 = "NaN";
        } else {
            str2 = i2 == i3 + 7 ? "Infinity" : null;
        }
        if (str2 != null && StringsKt__StringsKt.indexOf((CharSequence) str, str2, i3, false) == i3) {
            return i2 + 1;
        }
        return -1;
    }

    public static Float toFloatOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (isValidFloat$StringsKt__StringNumberConversionsJVMKt(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Double toDoubleOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (isValidFloat$StringsKt__StringNumberConversionsJVMKt(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static BigDecimal toBigDecimalOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (isValidBigDecimal$StringsKt__StringNumberConversionsJVMKt(str)) {
                return new BigDecimal(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final BigDecimal toBigDecimalOrNull(@NotNull String str, @NotNull MathContext mathContext) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mathContext, "");
        try {
            if (isValidBigDecimal$StringsKt__StringNumberConversionsJVMKt(str)) {
                return new BigDecimal(str, mathContext);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
