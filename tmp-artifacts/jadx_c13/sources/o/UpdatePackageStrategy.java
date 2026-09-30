package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface UpdatePackageStrategy<S> extends CoroutineContext.Element {
    void onExtraCallbackWithResult(@NotNull CoroutineContext coroutineContext, S s);

    S onWarmupCompleted(@NotNull CoroutineContext coroutineContext);

    public static final class onExtraCallbackWithResult {
        public static <S> CoroutineContext IAuthTabCallback(@NotNull UpdatePackageStrategy<S> updatePackageStrategy, @NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.onNavigationEvent.onExtraCallbackWithResult(updatePackageStrategy, coroutineContext);
        }

        public static <S, R> R onExtraCallbackWithResult(@NotNull UpdatePackageStrategy<S> updatePackageStrategy, R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.onNavigationEvent.onExtraCallback(updatePackageStrategy, r, function2);
        }
    }
}
