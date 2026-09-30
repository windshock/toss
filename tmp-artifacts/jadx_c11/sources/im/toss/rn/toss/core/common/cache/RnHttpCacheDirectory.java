package im.toss.rn.toss.core.common.cache;

import im.toss.rn.toss.core.common.process.RnProcessRuntime;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RnHttpCacheDirectory {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    public static final RnHttpCacheDirectory onWarmupCompleted = new RnHttpCacheDirectory();

    static {
        int i = onExtraCallback + 29;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private RnHttpCacheDirectory() {
    }

    public final File onNavigationEvent(@NotNull File file, @NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (RnProcessRuntime.onWarmupCompleted.IAuthTabCallback()) {
            str = str + "_rn_remote";
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        int i4 = IAuthTabCallback + 77;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return file2;
    }
}
