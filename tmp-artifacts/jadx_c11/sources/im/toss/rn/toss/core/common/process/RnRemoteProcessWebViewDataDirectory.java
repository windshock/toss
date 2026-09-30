package im.toss.rn.toss.core.common.process;

import android.os.Build;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RnRemoteProcessWebViewDataDirectory {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    public static final RnRemoteProcessWebViewDataDirectory onExtraCallbackWithResult = new RnRemoteProcessWebViewDataDirectory();
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallback + 11;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private RnRemoteProcessWebViewDataDirectory() {
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallbackWithResult(@Nullable String str, @NotNull String str2, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str2, "");
            if (Build.VERSION.SDK_INT >= 105) {
                if (RnProcessRuntime.onWarmupCompleted.onWarmupCompleted(str, str2)) {
                    WebView.setDataDirectorySuffix("rn_remote");
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(str2, "");
            if (Build.VERSION.SDK_INT >= 28) {
            }
        }
        int i3 = onWarmupCompleted + 77;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }
}
