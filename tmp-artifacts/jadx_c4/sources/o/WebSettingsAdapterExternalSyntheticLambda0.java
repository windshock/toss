package o;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class WebSettingsAdapterExternalSyntheticLambda0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final WebSettingsAdapterExternalSyntheticLambda0 onWarmupCompleted = new WebSettingsAdapterExternalSyntheticLambda0();

    static {
        int i = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private WebSettingsAdapterExternalSyntheticLambda0() {
    }

    public final getBacktraceNote<onPageScrollStateChanged, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        getBacktraceNote<onPageScrollStateChanged, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = NavigationImplExternalSyntheticLambda0.onExtraCallback().get(str);
        if (getbacktracenote != null) {
            return getbacktracenote;
        }
        if (!onNavigationEvent()) {
            int i2 = onNavigationEvent + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        getBacktraceNote<onPageScrollStateChanged, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote2 = NavigationImplExternalSyntheticLambda0.onNavigationEvent().get(str);
        int i4 = onNavigationEvent + 67;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return getbacktracenote2;
    }

    private final boolean onNavigationEvent() {
        Object obj;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onExtraCallback = i2 % 128;
        try {
        } catch (Throwable th) {
            Result.Companion companion = kotlin.Result.Companion;
            Object obj2 = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
            int i3 = onExtraCallback + 43;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            obj = obj2;
        }
        if (i2 % 2 != 0) {
            Result.Companion companion2 = kotlin.Result.Companion;
            boolean z = true;
            if (!zzaj.onNavigationEvent().RemoteActionCompatParcelizer()) {
                int i5 = onExtraCallback + 7;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                if (!zzaj.onNavigationEvent().onActivityLayout() && !zzaj.onNavigationEvent().MediaBrowserCompatMediaItem()) {
                    z = false;
                }
            }
            obj = kotlin.Result.constructor-impl(Boolean.valueOf(z));
            Boolean bool = Boolean.FALSE;
            if (kotlin.Result.onExtraCallback(obj)) {
                obj = bool;
            }
            return ((Boolean) obj).booleanValue();
        }
        Result.Companion companion3 = kotlin.Result.Companion;
        zzaj.onNavigationEvent().RemoteActionCompatParcelizer();
        throw null;
    }
}
