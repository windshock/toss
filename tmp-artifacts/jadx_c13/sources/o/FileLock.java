package o;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
class FileLock<E> extends dj<E> implements BsPatch<E> {
    public FileLock(@NotNull CoroutineContext coroutineContext, @NotNull nLockFileSegment<E> nlockfilesegment, boolean z) {
        super(coroutineContext, nlockfilesegment, false, z);
        onExtraCallbackWithResult((getPackageType) coroutineContext.get(getPackageType.onNavigationEvent));
    }

    @Override // o.setFullPackage
    public void IAuthTabCallbackDefault(@Nullable Throwable th) {
        nLockFileSegment<E> nlockfilesegmentOnTransact = onTransact();
        if (th != null) {
            cancellationExceptionOnExtraCallbackWithResult = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionOnExtraCallbackWithResult == null) {
                cancellationExceptionOnExtraCallbackWithResult = getUniversalStrategies.onExtraCallbackWithResult(getResCount.IAuthTabCallback(this) + " was cancelled", th);
            }
        }
        nlockfilesegmentOnTransact.onNavigationEvent(cancellationExceptionOnExtraCallbackWithResult);
    }

    @Override // o.setFullPackage
    public boolean asInterface(@NotNull Throwable th) {
        inst.onNavigationEvent(getContext(), th);
        return true;
    }
}
