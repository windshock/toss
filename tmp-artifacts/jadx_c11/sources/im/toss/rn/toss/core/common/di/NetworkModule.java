package im.toss.rn.toss.core.common.di;

import android.content.Context;
import im.toss.rn.toss.core.common.cache.RnHttpCacheDirectory;
import java.io.File;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class NetworkModule {
    public static final NetworkModule IAuthTabCallback = new NetworkModule();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallbackWithResult + 3;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private NetworkModule() {
    }

    @Singleton
    public final Cache IAuthTabCallback(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        RnHttpCacheDirectory rnHttpCacheDirectory = RnHttpCacheDirectory.onWarmupCompleted;
        File cacheDir = context.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "");
        Cache cache = new Cache(rnHttpCacheDirectory.onNavigationEvent(cacheDir, "toss_react_network_cache"), 10485760L);
        int i2 = onWarmupCompleted + 125;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return cache;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
