package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class endRearDisplayPresentationSession {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public static final String onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object obj = null;
        if (StringsKt.isBlank(str)) {
            int i4 = onExtraCallbackWithResult + 79;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        String strOnNavigationEvent = new Regex("(?i)\\.m3u8(?=($|[?#]))").onNavigationEvent(str, ".mp4");
        if (Intrinsics.areEqual(strOnNavigationEvent, str)) {
            int i5 = onWarmupCompleted + 107;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        int i7 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return strOnNavigationEvent;
    }
}
