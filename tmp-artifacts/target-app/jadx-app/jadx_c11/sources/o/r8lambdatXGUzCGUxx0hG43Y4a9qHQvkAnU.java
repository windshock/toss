package o;

import android.net.Uri;
import im.toss.securities.core.router.spec.TossSecRoute;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface r8lambdatXGUzCGUxx0hG43Y4a9qHQvkAnU {
    public static final onExtraCallbackWithResult Companion = onExtraCallbackWithResult.onExtraCallbackWithResult;

    boolean IAuthTabCallback(@Nullable Uri uri, boolean z, boolean z2);

    boolean onExtraCallback(@NotNull String str);

    default boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        return false;
    }

    boolean onExtraCallbackWithResult(@NotNull Uri uri);

    void onWarmupCompleted(@NotNull TossSecRoute tossSecRoute);

    static /* synthetic */ boolean IAuthTabCallback(r8lambdatXGUzCGUxx0hG43Y4a9qHQvkAnU r8lambdatxguzcguxx0hg43y4a9qhqvkanu, Uri uri, boolean z, boolean z2, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: landingUri");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return r8lambdatxguzcguxx0hg43y4a9qhqvkanu.IAuthTabCallback(uri, z, z2);
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallback = 0;
        static final /* synthetic */ onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 97;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 53 / 0;
            }
        }

        private onExtraCallbackWithResult() {
        }
    }
}
