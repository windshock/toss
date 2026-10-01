package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getOrCreateProfile {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static final ViewPager2RecyclerViewImpl onWarmupCompleted(@NotNull String str, @Nullable ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl) {
        getBacktraceNote<onPageScrollStateChanged, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteIAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (viewPager2LinearLayoutManagerImpl != null) {
            int i2 = IAuthTabCallback + 27;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                getbacktracenoteIAuthTabCallback = viewPager2LinearLayoutManagerImpl.IAuthTabCallback(str);
                int i3 = 1 / 0;
            } else {
                getbacktracenoteIAuthTabCallback = viewPager2LinearLayoutManagerImpl.IAuthTabCallback(str);
            }
        } else {
            getbacktracenoteIAuthTabCallback = null;
        }
        if (getbacktracenoteIAuthTabCallback != null) {
            return ViewPager2RecyclerViewImpl.CUSTOM;
        }
        if (WebSettingsAdapterExternalSyntheticLambda0.onWarmupCompleted.IAuthTabCallback(str) == null) {
            return ViewPager2RecyclerViewImpl.TURNKEY;
        }
        int i4 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return ViewPager2RecyclerViewImpl.TEMPLATE;
        }
        ViewPager2RecyclerViewImpl viewPager2RecyclerViewImpl = ViewPager2RecyclerViewImpl.TEMPLATE;
        throw null;
    }

    public static final getBacktraceNote<onPageScrollStateChanged, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback(@NotNull String str, @Nullable ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (viewPager2LinearLayoutManagerImpl != null) {
            int i2 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                getBacktraceNote<onPageScrollStateChanged, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteIAuthTabCallback = viewPager2LinearLayoutManagerImpl.IAuthTabCallback(str);
                if (getbacktracenoteIAuthTabCallback != null) {
                    return getbacktracenoteIAuthTabCallback;
                }
            } else {
                viewPager2LinearLayoutManagerImpl.IAuthTabCallback(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        getBacktraceNote<onPageScrollStateChanged, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteIAuthTabCallback2 = WebSettingsAdapterExternalSyntheticLambda0.onWarmupCompleted.IAuthTabCallback(str);
        int i3 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return getbacktracenoteIAuthTabCallback2;
    }
}
