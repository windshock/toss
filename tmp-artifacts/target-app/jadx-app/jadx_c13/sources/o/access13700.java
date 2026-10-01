package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface access13700 extends CoroutineContext.Element {
    public static final onWarmupCompleted onWarmupCompleted = onWarmupCompleted.onNavigationEvent;

    void onExtraCallback(@NotNull access13800<?> access13800Var);

    <T> access13800<T> onWarmupCompleted(@NotNull access13800<? super T> access13800Var);

    public static final class onWarmupCompleted implements CoroutineContext.onExtraCallback<access13700> {
        static final /* synthetic */ onWarmupCompleted onNavigationEvent = new onWarmupCompleted();

        private onWarmupCompleted() {
        }
    }

    public static final class IAuthTabCallback {
        public static <E extends CoroutineContext.Element> E IAuthTabCallback(@NotNull access13700 access13700Var, @NotNull CoroutineContext.onExtraCallback<E> onextracallback) {
            E e;
            Intrinsics.checkNotNullParameter(onextracallback, "");
            if (onextracallback instanceof hasFaultAdjacentMetadata) {
                hasFaultAdjacentMetadata hasfaultadjacentmetadata = (hasFaultAdjacentMetadata) onextracallback;
                if (!hasfaultadjacentmetadata.onExtraCallback(access13700Var.getKey()) || (e = (E) hasfaultadjacentmetadata.onNavigationEvent(access13700Var)) == null) {
                    return null;
                }
                return e;
            }
            if (access13700.onWarmupCompleted != onextracallback) {
                return null;
            }
            Intrinsics.checkNotNull(access13700Var, "");
            return access13700Var;
        }

        public static CoroutineContext onExtraCallbackWithResult(@NotNull access13700 access13700Var, @NotNull CoroutineContext.onExtraCallback<?> onextracallback) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            if (!(onextracallback instanceof hasFaultAdjacentMetadata)) {
                return access13700.onWarmupCompleted == onextracallback ? access13600.IAuthTabCallback : access13700Var;
            }
            hasFaultAdjacentMetadata hasfaultadjacentmetadata = (hasFaultAdjacentMetadata) onextracallback;
            return (!hasfaultadjacentmetadata.onExtraCallback(access13700Var.getKey()) || hasfaultadjacentmetadata.onNavigationEvent(access13700Var) == null) ? access13700Var : access13600.IAuthTabCallback;
        }
    }
}
