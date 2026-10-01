package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class playTransition {
    public static final playTransition onExtraCallbackWithResult = new playTransition();

    private playTransition() {
    }

    public final setOnChildScrollUpCallback onExtraCallbackWithResult(@NotNull getTargetIds gettargetids, @NotNull getStartDelay getstartdelay, @NotNull String str) {
        Intrinsics.checkNotNullParameter(gettargetids, "");
        Intrinsics.checkNotNullParameter(getstartdelay, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new setOnChildScrollUpCallback(gettargetids.onExtraCallback(), gettargetids.IAuthTabCallback(), gettargetids.IAuthTabCallbackStub(), str, getstartdelay.IAuthTabCallback(), getstartdelay.IAuthTabCallbackStub(), getstartdelay.onWarmupCompleted());
    }

    public final setProgressBackgroundColorSchemeColor onExtraCallbackWithResult(@NotNull getTargetIds gettargetids, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(gettargetids, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new setProgressBackgroundColorSchemeColor(gettargetids.onExtraCallbackWithResult(), gettargetids.onNavigationEvent(), gettargetids.onWarmupCompleted(), gettargetids.onExtraCallback(), str, gettargetids.IAuthTabCallback(), gettargetids.IAuthTabCallbackStub(), gettargetids.IAuthTabCallbackDefault(), gettargetids.asBinder(), str2, str3, str4, str5, str6);
    }
}
