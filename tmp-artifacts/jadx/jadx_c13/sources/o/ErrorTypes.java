package o;

import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ErrorTypes {
    private static boolean onExtraCallbackWithResult(char c) {
        return c >= ' ' && c <= '~';
    }

    public static boolean onNavigationEvent(@Nullable String str) {
        return str == null || str.isEmpty();
    }

    public static String IAuthTabCallback(String str, int i) {
        return IAuthTabCallback(str, i, '0');
    }

    private static String IAuthTabCallback(String str, int i, char c) {
        Objects.requireNonNull(str);
        if (str.length() >= i) {
            return str;
        }
        StringBuilder sb = new StringBuilder(i);
        for (int length = str.length(); length < i; length++) {
            sb.append(c);
        }
        sb.append(str);
        return sb.toString();
    }

    public static boolean onExtraCallback(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!onExtraCallbackWithResult(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
