package o;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class onSystemUiVisibilityChange {
    public static final onSystemUiVisibilityChange onWarmupCompleted = new onSystemUiVisibilityChange();

    private onSystemUiVisibilityChange() {
    }

    @Deprecated
    public final TTAppOpenAdActivity9 IAuthTabCallback(@NotNull TTHistoryActivity41 tTHistoryActivity41) {
        Intrinsics.checkNotNullParameter(tTHistoryActivity41, "");
        return TTCeilingLandingPageActivity5.onExtraCallbackWithResult(tTHistoryActivity41);
    }

    @Deprecated
    public final TTAppOpenAdTransActivity onExtraCallback(@NotNull TTHistoryActivity42 tTHistoryActivity42) {
        Intrinsics.checkNotNullParameter(tTHistoryActivity42, "");
        return TTCeilingLandingPageActivity5.onExtraCallback(tTHistoryActivity42);
    }

    @Deprecated
    public final TTHistoryActivity41 onExtraCallback(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "");
        return TTFullScreenExpressVideoActivity.onExtraCallbackWithResult(file, false, 1, null);
    }

    @Deprecated
    public final TTHistoryActivity41 onWarmupCompleted(@NotNull OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "");
        return TTCeilingLandingPageActivity5.IAuthTabCallback(outputStream);
    }

    @Deprecated
    public final TTHistoryActivity42 onNavigationEvent(@NotNull InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "");
        return TTCeilingLandingPageActivity5.IAuthTabCallback(inputStream);
    }
}
