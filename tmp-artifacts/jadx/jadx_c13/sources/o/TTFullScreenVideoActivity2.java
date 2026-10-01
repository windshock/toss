package o;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okio.FileSystem;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final /* synthetic */ class TTFullScreenVideoActivity2 {
    public static final FileSystem onExtraCallbackWithResult(@NotNull FileSystem fileSystem, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "");
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        return TTHistoryLandingPageActivity13.onWarmupCompleted(tTFullScreenVideoActivity3, fileSystem, null, 4, null);
    }
}
