package o;

import android.content.Context;
import im.toss.securities.core.router.spec.TossSecRoute;
import java.io.File;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxRewardedAdImpla implements MaxNativeAdLoaderImpla {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final Context IAuthTabCallback;

    static {
        int i = onExtraCallback + 5;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    @Inject
    public MaxRewardedAdImpla(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallback = context;
    }

    @Override // o.MaxNativeAdLoaderImpla
    public File onWarmupCompleted() {
        int i = 2 % 2;
        File file = new File(this.IAuthTabCallback.getCacheDir(), "toss_react_bundle_cache");
        if (!file.exists()) {
            int i2 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            file.mkdirs();
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return file;
    }

    @Override // o.MaxNativeAdLoaderImpla
    public File onExtraCallbackWithResult(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        File file = new File(onWarmupCompleted(), str + TossSecRoute.Main.PATH + str2);
        if (!file.exists()) {
            int i2 = onNavigationEvent + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            file.mkdirs();
        }
        int i4 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return file;
        }
        throw null;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }
}
