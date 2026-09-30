package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class StringsKt__StringNumberConversionsKt extends StringsKt__StringNumberConversionsJVMKt {
    public static Byte toByteOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return toByteOrNull(str, 10);
    }

    public static final Byte toByteOrNull(@NotNull String str, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(str, "");
        Integer intOrNull = toIntOrNull(str, i);
        if (intOrNull == null || (iIntValue = intOrNull.intValue()) < -128 || iIntValue > 127) {
            return null;
        }
        return Byte.valueOf((byte) iIntValue);
    }

    public static Short toShortOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return toShortOrNull(str, 10);
    }

    public static final Short toShortOrNull(@NotNull String str, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(str, "");
        Integer intOrNull = toIntOrNull(str, i);
        if (intOrNull == null || (iIntValue = intOrNull.intValue()) < -32768 || iIntValue > 32767) {
            return null;
        }
        return Short.valueOf((short) iIntValue);
    }

    public static Integer toIntOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return toIntOrNull(str, 10);
    }

    public static Integer toIntOrNull(@NotNull String str, int i) {
        int i2;
        boolean z;
        int i3;
        Intrinsics.checkNotNullParameter(str, "");
        CharsKt__CharJVMKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char cCharAt = str.charAt(0);
        int i5 = -2147483647;
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                i2 = 1;
                z = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i5 = Integer.MIN_VALUE;
                i2 = 1;
            }
        } else {
            i2 = 0;
            z = false;
        }
        int i6 = -59652323;
        while (i2 < length) {
            int iOnExtraCallback = CharsKt__CharJVMKt.onExtraCallback(str.charAt(i2), i);
            if (iOnExtraCallback < 0) {
                return null;
            }
            if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / i))) || (i3 = i4 * i) < i5 + iOnExtraCallback) {
                return null;
            }
            i4 = i3 - iOnExtraCallback;
            i2++;
        }
        return z ? Integer.valueOf(i4) : Integer.valueOf(-i4);
    }

    public static Long toLongOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return toLongOrNull(str, 10);
    }

    public static Long toLongOrNull(@NotNull String str, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "");
        CharsKt__CharJVMKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
                i2 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i2 = 1;
            }
        } else {
            z = false;
        }
        long j2 = -256204778801521550L;
        long j3 = 0;
        long j4 = -256204778801521550L;
        while (i2 < length) {
            int iOnExtraCallback = CharsKt__CharJVMKt.onExtraCallback(str.charAt(i2), i);
            if (iOnExtraCallback < 0) {
                return null;
            }
            if (j3 < j4) {
                if (j4 == j2) {
                    j4 = j / i;
                    if (j3 < j4) {
                    }
                }
                return null;
            }
            long j5 = j3 * i;
            long j6 = iOnExtraCallback;
            if (j5 < j + j6) {
                return null;
            }
            j3 = j5 - j6;
            i2++;
            j2 = -256204778801521550L;
        }
        return z ? Long.valueOf(j3) : Long.valueOf(-j3);
    }

    public static final Void numberFormatError(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }
}
