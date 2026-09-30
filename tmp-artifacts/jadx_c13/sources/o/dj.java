package o;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class dj<E> extends RequestCoordinator<Unit> implements nLockFileSegment<E> {
    private final nLockFileSegment<E> onExtraCallbackWithResult;

    @Override // o.lt
    public Object IAuthTabCallback(E e) {
        return this.onExtraCallbackWithResult.IAuthTabCallback((nLockFileSegment<E>) e);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public Object IAuthTabCallback(@NotNull access13800<? super lud<? extends E>> access13800Var) {
        return this.onExtraCallbackWithResult.IAuthTabCallback((access13800) access13800Var);
    }

    @Override // o.lt
    public boolean IAuthTabCallback() {
        return this.onExtraCallbackWithResult.IAuthTabCallback();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public jni_YGNodeStyleGetAlignItemsJNI<E> IAuthTabCallbackStub() {
        return this.onExtraCallbackWithResult.IAuthTabCallbackStub();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public jni_YGNodeStyleGetAlignItemsJNI<lud<E>> asInterface() {
        return this.onExtraCallbackWithResult.asInterface();
    }

    @Override // o.lt
    public Object onExtraCallback(E e, @NotNull access13800<? super Unit> access13800Var) {
        return this.onExtraCallbackWithResult.onExtraCallback(e, access13800Var);
    }

    @Override // o.lt
    public boolean onExtraCallback(@Nullable Throwable th) {
        return this.onExtraCallbackWithResult.onExtraCallback(th);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public Object onExtraCallbackWithResult(@NotNull access13800<? super E> access13800Var) {
        return this.onExtraCallbackWithResult.onExtraCallbackWithResult(access13800Var);
    }

    @Override // o.lt
    public void onExtraCallbackWithResult(@NotNull Function1<? super Throwable, Unit> function1) {
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(function1);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public Object onMinimized() {
        return this.onExtraCallbackWithResult.onMinimized();
    }

    public final nLockFileSegment<E> onNavigationEvent() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean readTypedObject() {
        return this.onExtraCallbackWithResult.readTypedObject();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public nUnlockFile<E> writeTypedObject() {
        return this.onExtraCallbackWithResult.writeTypedObject();
    }

    protected final nLockFileSegment<E> onTransact() {
        return this.onExtraCallbackWithResult;
    }

    public dj(@NotNull CoroutineContext coroutineContext, @NotNull nLockFileSegment<E> nlockfilesegment, boolean z, boolean z2) {
        super(coroutineContext, z, z2);
        this.onExtraCallbackWithResult = nlockfilesegment;
    }

    @Override // o.setFullPackage, o.getPackageType
    public final void onNavigationEvent(@Nullable CancellationException cancellationException) {
        if (access000()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new getPatch(cl_(), null, this);
        }
        onNavigationEvent((Throwable) cancellationException);
    }

    @Override // o.setFullPackage
    public void onNavigationEvent(@NotNull Throwable th) {
        CancellationException cancellationExceptionOnExtraCallback = setFullPackage.onExtraCallback(this, th, null, 1, null);
        this.onExtraCallbackWithResult.onNavigationEvent(cancellationExceptionOnExtraCallback);
        onWarmupCompleted((Throwable) cancellationExceptionOnExtraCallback);
    }

    @Override // o.setFullPackage
    @Deprecated
    public /* synthetic */ void cancel() {
        onNavigationEvent((Throwable) new getPatch(cl_(), null, this));
    }
}
