package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class HomeWatcherReceiver {
    public static final <T> void IAuthTabCallback(@NotNull wie2 wie2Var, @NotNull py<? super T> pyVar, T t, @NotNull TTAppOpenAdActivity9 tTAppOpenAdActivity9) {
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(pyVar, "");
        Intrinsics.checkNotNullParameter(tTAppOpenAdActivity9, "");
        fbydj.onNavigationEvent(wie2Var, new bhiycx(tTAppOpenAdActivity9), pyVar, t);
    }

    public static final <T> T onExtraCallbackWithResult(@NotNull wie2 wie2Var, @NotNull jp<? extends T> jpVar, @NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity) {
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(jpVar, "");
        Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
        return (T) fbydj.onWarmupCompleted(wie2Var, jpVar, new bhi1(tTAppOpenAdTransActivity));
    }
}
