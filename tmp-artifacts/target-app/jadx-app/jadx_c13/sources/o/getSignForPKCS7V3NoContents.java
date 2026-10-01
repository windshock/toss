package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getSignForPKCS7V3NoContents {
    public static final getSignForPKCS7V3NoContents IAuthTabCallback = new getSignForPKCS7V3NoContents();
    private static final char[] onExtraCallback = {12593, 12594, 12596, 12599, 12600, 12601, 12609, 12610, 12611, 12613, 12614, 12615, 12616, 12617, 12618, 12619, 12620, 12621, 12622};
    public static final int onExtraCallbackWithResult = 8;

    public final boolean onExtraCallback(char c) {
        return 44032 <= c && c < 55204;
    }

    private getSignForPKCS7V3NoContents() {
    }

    public final boolean onNavigationEvent(char c) {
        for (char c2 : onExtraCallback) {
            if (c == c2) {
                return true;
            }
        }
        return false;
    }

    public final char IAuthTabCallback(char c) {
        return onExtraCallback[(c - 44032) / 588];
    }

    public final boolean onNavigationEvent(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return onExtraCallback(str, str2) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IntRange onExtraCallback(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int length = str.length() - str2.length();
        int length2 = str2.length();
        if (length >= 0 && length >= 0) {
            int i = 0;
            while (true) {
                int i2 = 0;
                while (i2 < length2) {
                    if (onNavigationEvent(str2.charAt(i2))) {
                        int i3 = i + i2;
                        if (onExtraCallback(str.charAt(i3))) {
                            if (IAuthTabCallback(str.charAt(i3)) != str2.charAt(i2)) {
                                break;
                            }
                            i2++;
                        } else {
                            if (Character.toLowerCase(str.charAt(i + i2)) != Character.toLowerCase(str2.charAt(i2))) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
                if (i2 != length2) {
                    if (i == length) {
                        break;
                    }
                    i++;
                } else {
                    return new IntRange(i, length2 + i);
                }
            }
        }
        return null;
    }
}
