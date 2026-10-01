package o;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getBackgroundScheduler {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final getBackgroundScheduler onNavigationEvent = new getBackgroundScheduler();
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallbackWithResult + 77;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 12 / 0;
        }
    }

    private getBackgroundScheduler() {
    }

    public final boolean IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            return StringsKt.startsWith$default(lowerCase, "aaaaaaaa", true, 4, (Object) null);
        }
        Intrinsics.checkNotNullParameter(str, "");
        String lowerCase2 = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        return StringsKt.startsWith$default(lowerCase2, "aaaaaaaa", false, 2, (Object) null);
    }
}
