package o;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class findRes {
    public static final findResAndMsg IAuthTabCallback(@NotNull findResAndMsg findresandmsg, @NotNull CoroutineContext coroutineContext) {
        return new setDividerDrawableHorizontal(findresandmsg.getCoroutineContext().plus(coroutineContext));
    }

    public static final findResAndMsg onExtraCallbackWithResult() {
        return new setDividerDrawableHorizontal(isNeedUnzip.onExtraCallbackWithResult(null, 1, null).plus(putChannelInfo.onExtraCallback()));
    }

    public static final boolean onWarmupCompleted(@NotNull findResAndMsg findresandmsg) {
        getPackageType getpackagetype = (getPackageType) findresandmsg.getCoroutineContext().get(getPackageType.onNavigationEvent);
        if (getpackagetype != null) {
            return getpackagetype.onExtraCallback();
        }
        return true;
    }

    public static final <R> Object onExtraCallbackWithResult(@NotNull Function2<? super findResAndMsg, ? super access13800<? super R>, ? extends Object> function2, @NotNull access13800<? super R> access13800Var) {
        ycx4 ycx4Var = new ycx4(access13800Var.getContext(), access13800Var);
        Object objOnWarmupCompleted = fromInt.onWarmupCompleted(ycx4Var, ycx4Var, function2);
        if (objOnWarmupCompleted == access14100.onExtraCallback()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        return objOnWarmupCompleted;
    }

    public static final findResAndMsg onWarmupCompleted(@NotNull CoroutineContext coroutineContext) {
        if (coroutineContext.get(getPackageType.onNavigationEvent) == null) {
            coroutineContext = coroutineContext.plus(isFullUpdate.IAuthTabCallback((getPackageType) null, 1, (Object) null));
        }
        return new setDividerDrawableHorizontal(coroutineContext);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(findResAndMsg findresandmsg, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        onExtraCallback(findresandmsg, cancellationException);
    }

    public static final void onExtraCallback(@NotNull findResAndMsg findresandmsg, @Nullable CancellationException cancellationException) {
        getPackageType getpackagetype = (getPackageType) findresandmsg.getCoroutineContext().get(getPackageType.onNavigationEvent);
        if (getpackagetype == null) {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + findresandmsg).toString());
        }
        getpackagetype.onNavigationEvent(cancellationException);
    }

    public static final void IAuthTabCallback(@NotNull findResAndMsg findresandmsg, @NotNull String str, @Nullable Throwable th) {
        onExtraCallback(findresandmsg, getUniversalStrategies.onExtraCallbackWithResult(str, th));
    }

    public static /* synthetic */ void onExtraCallbackWithResult(findResAndMsg findresandmsg, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        IAuthTabCallback(findresandmsg, str, th);
    }

    public static final void onExtraCallbackWithResult(@NotNull findResAndMsg findresandmsg) {
        getFullPackage.IAuthTabCallback(findresandmsg.getCoroutineContext());
    }
}
