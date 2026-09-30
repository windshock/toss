package o;

import im.toss.ads_sdk.NativeAdsManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getPlatformCallback {
    public static final getPlatformCallback IAuthTabCallback = new getPlatformCallback();
    private static final ConcurrentHashMap<String, WeakReference<NativeAdsManager>> onExtraCallback = new ConcurrentHashMap<>();
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted = 1;

    private getPlatformCallback() {
    }

    static {
        int i = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @NotNull NativeAdsManager nativeAdsManager) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(nativeAdsManager, "");
        onExtraCallback.put(str, new WeakReference<>(nativeAdsManager));
        int i2 = onTransact + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    public final NativeAdsManager onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        WeakReference<NativeAdsManager> weakReference = onExtraCallback.get(str);
        if (weakReference == null) {
            return null;
        }
        NativeAdsManager nativeAdsManager = weakReference.get();
        int i4 = onTransact + 119;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
        return nativeAdsManager;
    }

    public final void IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallback.remove(str);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallback.remove(str);
            int i3 = 77 / 0;
        }
    }
}
