package kotlin.text;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class CharsKt__CharJVMKt {
    public static boolean IAuthTabCallbackDefault(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static final String onExtraCallback(char c, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "");
        String strValueOf = String.valueOf(c);
        Intrinsics.checkNotNull(strValueOf, "");
        String upperCase = strValueOf.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    public static String IAuthTabCallback(char c, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "");
        String strValueOf = String.valueOf(c);
        Intrinsics.checkNotNull(strValueOf, "");
        String lowerCase = strValueOf.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    public static String onNavigationEvent(char c, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "");
        String strOnExtraCallback = onExtraCallback(c, locale);
        if (strOnExtraCallback.length() <= 1) {
            String strValueOf = String.valueOf(c);
            Intrinsics.checkNotNull(strValueOf, "");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            if (Intrinsics.areEqual(strOnExtraCallback, upperCase)) {
                return String.valueOf(Character.toTitleCase(c));
            }
        } else if (c != 329) {
            char cCharAt = strOnExtraCallback.charAt(0);
            Intrinsics.checkNotNull(strOnExtraCallback, "");
            String strSubstring = strOnExtraCallback.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            Intrinsics.checkNotNull(strSubstring, "");
            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            return cCharAt + lowerCase;
        }
        return strOnExtraCallback;
    }

    public static final int onExtraCallback(char c, int i) {
        return Character.digit((int) c, i);
    }

    public static int checkRadix(int i) {
        if (2 <= i && i < 37) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new IntRange(2, 36));
    }
}
