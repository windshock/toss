package im.toss.rn.toss.core.observability;

import im.toss.securities.core.router.spec.TossSecRoute;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ReactNativeRouteKey {
    private static int asBinder = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    public static final ReactNativeRouteKey onExtraCallbackWithResult = new ReactNativeRouteKey();
    private static final Regex IAuthTabCallback = new Regex("-[A-Za-z0-9_-]{21}$");

    private ReactNativeRouteKey() {
    }

    static {
        int i = onNavigationEvent + 79;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String onNavigationEvent(@Nullable String str) {
        int i = 2 % 2;
        if (str != null) {
            int i2 = asBinder + 1;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 1 / 0;
                if (str.length() <= 0) {
                    str = null;
                }
                if (str != null) {
                    int i4 = onWarmupCompleted + 95;
                    asBinder = i4 % 128;
                    int i5 = i4 % 2;
                    String strReplace = IAuthTabCallback.replace(str, "");
                    if (strReplace != null && strReplace.length() > 0) {
                        int i6 = asBinder + 47;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                        return strReplace;
                    }
                }
            } else {
                if (str.length() <= 0) {
                }
                if (str != null) {
                }
            }
        }
        return null;
    }

    public final String IAuthTabCallback(@Nullable String str, @Nullable String str2) {
        String strRemovePrefix;
        String strRemovePrefix2;
        int i = 2 % 2;
        String str3 = null;
        if (str != null && (strRemovePrefix = StringsKt.removePrefix(str, TossSecRoute.Main.PATH)) != null) {
            if (strRemovePrefix.length() <= 0) {
                int i2 = asBinder + 61;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                strRemovePrefix = null;
            }
            if (strRemovePrefix != null) {
                if (str2 != null && (strRemovePrefix2 = StringsKt.removePrefix(str2, TossSecRoute.Main.PATH)) != null && strRemovePrefix2.length() > 0) {
                    int i3 = asBinder + 11;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 64 / 0;
                    }
                    str3 = strRemovePrefix2;
                }
                if (str3 != null) {
                    strRemovePrefix = strRemovePrefix + TossSecRoute.Main.PATH + str3;
                    int i5 = onWarmupCompleted + 79;
                    asBinder = i5 % 128;
                    int i6 = i5 % 2;
                }
                return "RN(/" + strRemovePrefix + ")";
            }
        }
        return null;
    }
}
