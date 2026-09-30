package o;

import im.toss.ads_sdk.NativeAdsManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class setMode {
    public static final setMode IAuthTabCallback = new setMode();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        int i = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private setMode() {
    }

    public final NativeAdsManager onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull Function0<NativeAdsManager> function0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
            Intrinsics.checkNotNullParameter(function0, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(function0, "");
        r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq != null ? r8lambdakrhaimf1bm5cgjbilhp45vln_xq : null;
        if (activity == null) {
            activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        }
        String strValueOf = String.valueOf(System.identityHashCode(activity));
        getPlatformCallback getplatformcallback = getPlatformCallback.IAuthTabCallback;
        NativeAdsManager nativeAdsManagerOnExtraCallback = getplatformcallback.onExtraCallback(strValueOf);
        if (nativeAdsManagerOnExtraCallback != null) {
            return nativeAdsManagerOnExtraCallback;
        }
        int i3 = onNavigationEvent + 71;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        NativeAdsManager nativeAdsManager = (NativeAdsManager) function0.invoke();
        getplatformcallback.onExtraCallbackWithResult(strValueOf, nativeAdsManager);
        return nativeAdsManager;
    }
}
