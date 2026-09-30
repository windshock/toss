package o;

import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTHistoryLandingPageActivity5 {
    private static final Logger IAuthTabCallback = Logger.getLogger("okio.Okio");

    public static final boolean onNavigationEvent(@NotNull AssertionError assertionError) {
        String message;
        Intrinsics.checkNotNullParameter(assertionError, "");
        return (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "getsockname failed", false, 2, (Object) null)) ? false : true;
    }
}
