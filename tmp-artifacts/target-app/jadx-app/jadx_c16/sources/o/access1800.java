package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class access1800 {
    public static final access1800 IAuthTabCallback = new access1800();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private access1800() {
    }

    public final String onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = "BIO-" + access508.onWarmupCompleted.onNavigationEvent().onNavigationEvent(access1302.PERSONAL, str);
        int i2 = onNavigationEvent + 115;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strIAuthTabCallback = access508.onWarmupCompleted.onNavigationEvent().IAuthTabCallback(access1302.PERSONAL, StringsKt.substringAfter$default(str, "BIO-", (String) null, 2, (Object) null));
        if (strIAuthTabCallback != null) {
            return strIAuthTabCallback;
        }
        int i4 = onExtraCallback + 7;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 49;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return "";
    }
}
