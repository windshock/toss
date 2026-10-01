package o;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import okio.FileSystem;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTCeilingLandingPageActivity5 {
    public static final TTHistoryActivity41 IAuthTabCallback(@NotNull OutputStream outputStream) {
        return TTFullScreenExpressVideoActivity.onExtraCallback(outputStream);
    }

    public static final TTHistoryActivity42 IAuthTabCallback(@NotNull InputStream inputStream) {
        return TTFullScreenExpressVideoActivity.onExtraCallbackWithResult(inputStream);
    }

    public static final FileSystem IAuthTabCallback(@NotNull FileSystem fileSystem, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException {
        return TTFullScreenVideoActivity2.onExtraCallbackWithResult(fileSystem, tTFullScreenVideoActivity3);
    }

    public static final TTAppOpenAdTransActivity onExtraCallback(@NotNull TTHistoryActivity42 tTHistoryActivity42) {
        return TTDelegateActivity1.onNavigationEvent(tTHistoryActivity42);
    }

    public static final TTHistoryActivity41 onExtraCallback() {
        return TTDelegateActivity1.onExtraCallbackWithResult();
    }

    public static final TTAppOpenAdActivity9 onExtraCallbackWithResult(@NotNull TTHistoryActivity41 tTHistoryActivity41) {
        return TTDelegateActivity1.onWarmupCompleted(tTHistoryActivity41);
    }

    public static final TTHistoryActivity41 onExtraCallbackWithResult(@NotNull File file) throws FileNotFoundException {
        return TTFullScreenExpressVideoActivity.onWarmupCompleted(file);
    }

    public static final TTHistoryActivity41 onWarmupCompleted(@NotNull File file, boolean z) throws FileNotFoundException {
        return TTFullScreenExpressVideoActivity.onWarmupCompleted(file, z);
    }

    public static final TTHistoryActivity42 onWarmupCompleted(@NotNull File file) throws FileNotFoundException {
        return TTFullScreenExpressVideoActivity.IAuthTabCallback(file);
    }

    public static final TTHistoryActivity5 onWarmupCompleted(@NotNull Socket socket) {
        return TTFullScreenExpressVideoActivity.onWarmupCompleted(socket);
    }
}
