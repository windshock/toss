package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class maybeAddAttachStateListener {
    public static final <T> void IAuthTabCallback(@NotNull maybeRemoveAttachStateListener<? super T> mayberemoveattachstatelistener, @NotNull BitmapImageViewTarget bitmapImageViewTarget) {
        if (!(mayberemoveattachstatelistener instanceof setResourceInternal)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((setResourceInternal) mayberemoveattachstatelistener).IAuthTabCallback(bitmapImageViewTarget);
    }

    public static final <T> setResourceInternal<T> onWarmupCompleted(@NotNull access13800<? super T> access13800Var) {
        if (!(access13800Var instanceof setFlexWrap)) {
            return new setResourceInternal<>(access13800Var, 1);
        }
        setResourceInternal<T> setresourceinternalOnWarmupCompleted = ((setFlexWrap) access13800Var).onWarmupCompleted();
        if (setresourceinternalOnWarmupCompleted != null) {
            if (!setresourceinternalOnWarmupCompleted.getInterfaceDescriptor()) {
                setresourceinternalOnWarmupCompleted = null;
            }
            if (setresourceinternalOnWarmupCompleted != null) {
                return setresourceinternalOnWarmupCompleted;
            }
        }
        return new setResourceInternal<>(access13800Var, 2);
    }

    public static final void onExtraCallbackWithResult(@NotNull maybeRemoveAttachStateListener<?> mayberemoveattachstatelistener, @NotNull setDeployments setdeployments) {
        IAuthTabCallback(mayberemoveattachstatelistener, new CheckRequestBodyModelChannelInfo(setdeployments));
    }
}
