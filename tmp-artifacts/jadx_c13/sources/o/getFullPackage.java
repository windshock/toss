package o;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getFullPackage {
    public static final setDeployments IAuthTabCallback(@NotNull getPackageType getpackagetype, @NotNull setDeployments setdeployments) {
        return isFullUpdate.onNavigationEvent(getpackagetype, setdeployments);
    }

    public static final void IAuthTabCallback(@NotNull CoroutineContext coroutineContext) {
        isFullUpdate.onExtraCallback(coroutineContext);
    }

    public static final void IAuthTabCallback(@NotNull getPackageType getpackagetype) {
        isFullUpdate.onExtraCallback(getpackagetype);
    }

    public static final getPackageType onExtraCallback(@NotNull CoroutineContext coroutineContext) {
        return isFullUpdate.onNavigationEvent(coroutineContext);
    }

    public static final setDeployments onExtraCallback(@NotNull getPackageType getpackagetype, boolean z, @NotNull isPatchUpdate ispatchupdate) {
        return isFullUpdate.IAuthTabCallback(getpackagetype, z, ispatchupdate);
    }

    public static final Object onExtraCallbackWithResult(@NotNull getPackageType getpackagetype, @NotNull access13800<? super Unit> access13800Var) {
        return isFullUpdate.onNavigationEvent(getpackagetype, access13800Var);
    }

    public static final waitForLayout onExtraCallbackWithResult(@Nullable getPackageType getpackagetype) {
        return isFullUpdate.onNavigationEvent(getpackagetype);
    }

    public static final void onExtraCallbackWithResult(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        isFullUpdate.onNavigationEvent(coroutineContext, cancellationException);
    }

    public static final boolean onExtraCallbackWithResult(@NotNull CoroutineContext coroutineContext) {
        return isFullUpdate.onWarmupCompleted(coroutineContext);
    }

    public static final void onWarmupCompleted(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        isFullUpdate.onExtraCallbackWithResult(coroutineContext, cancellationException);
    }

    public static final void onWarmupCompleted(@NotNull getPackageType getpackagetype, @NotNull String str, @Nullable Throwable th) {
        isFullUpdate.onExtraCallback(getpackagetype, str, th);
    }
}
