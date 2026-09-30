package o;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import kotlin.jvm.internal.Intrinsics;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final /* synthetic */ class TTFullScreenExpressVideoActivity {
    public static final TTHistoryActivity41 onExtraCallback(@NotNull OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "");
        return new TTFullScreenVideoActivity(outputStream, new Timeout());
    }

    public static final TTHistoryActivity42 onExtraCallbackWithResult(@NotNull InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "");
        return new TTCeilingLandingPageActivity2(inputStream, new Timeout());
    }

    public static final TTHistoryActivity5 onWarmupCompleted(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "");
        return new TTHistoryLandingPageActivity10(socket);
    }

    public static /* synthetic */ TTHistoryActivity41 onExtraCallbackWithResult(File file, boolean z, int i, Object obj) throws FileNotFoundException {
        if ((i & 1) != 0) {
            z = false;
        }
        return TTCeilingLandingPageActivity5.onWarmupCompleted(file, z);
    }

    public static final TTHistoryActivity41 onWarmupCompleted(@NotNull File file, boolean z) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "");
        return TTCeilingLandingPageActivity5.IAuthTabCallback(new FileOutputStream(file, z));
    }

    public static final TTHistoryActivity41 onWarmupCompleted(@NotNull File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "");
        return TTCeilingLandingPageActivity5.IAuthTabCallback(new FileOutputStream(file, true));
    }

    public static final TTHistoryActivity42 IAuthTabCallback(@NotNull File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "");
        return new TTCeilingLandingPageActivity2(new FileInputStream(file), Timeout.onNavigationEvent);
    }
}
