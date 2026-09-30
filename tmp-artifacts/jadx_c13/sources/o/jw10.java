package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jw10 {
    public static final boolean IAuthTabCallback(char c) {
        return '0' <= c && c < ':';
    }

    public static final boolean onNavigationEvent(char c) {
        if ('A' > c || c >= '[') {
            return 'a' <= c && c < '{';
        }
        return true;
    }

    public static final int onWarmupCompleted(char c) {
        return c - '0';
    }

    private static final String IAuthTabCallback(String str, int i) {
        int iIndexOf$default;
        if (str.length() < i + 12) {
            return str;
        }
        int i2 = 0;
        if (!StringsKt__StringsKt.contains$default((CharSequence) "+-", str.charAt(0), false, 2, (Object) null) || (iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, '-', 1, false, 4, (Object) null)) < 12) {
            return str;
        }
        while (true) {
            int i3 = i2 + 1;
            if (str.charAt(i3) != '0') {
                break;
            }
            i2 = i3;
        }
        return iIndexOf$default - i2 < 12 ? StringsKt__StringsKt.removeRange((CharSequence) str, 1, iIndexOf$default - 10).toString() : str;
    }

    public static final String IAuthTabCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return IAuthTabCallback(str.toString(), 6);
    }

    public static final String onWarmupCompleted(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return IAuthTabCallback(str.toString(), 12);
    }

    public static final String onExtraCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return IAuthTabCallback(str.toString(), 3);
    }
}
