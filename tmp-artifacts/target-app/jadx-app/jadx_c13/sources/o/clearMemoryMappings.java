package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class clearMemoryMappings<T> extends clearCommandLine<T> implements Iterator<T>, access13800<Unit>, KMappedMarker {
    private T IAuthTabCallback;
    private Iterator<? extends T> onExtraCallback;
    private access13800<? super Unit> onExtraCallbackWithResult;
    private int onWarmupCompleted;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void onExtraCallback(@Nullable access13800<? super Unit> access13800Var) {
        this.onExtraCallbackWithResult = access13800Var;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i = this.onWarmupCompleted;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw onWarmupCompleted();
                }
                Iterator<? extends T> it = this.onExtraCallback;
                Intrinsics.checkNotNull(it);
                if (it.hasNext()) {
                    this.onWarmupCompleted = 2;
                    return true;
                }
                this.onExtraCallback = null;
            }
            this.onWarmupCompleted = 5;
            access13800<? super Unit> access13800Var = this.onExtraCallbackWithResult;
            Intrinsics.checkNotNull(access13800Var);
            this.onExtraCallbackWithResult = null;
            Unit unit = Unit.INSTANCE;
            Result.Companion companion = Result.Companion;
            access13800Var.resumeWith(Result.m31constructorimpl(unit));
        }
    }

    @Override // java.util.Iterator
    public T next() throws Throwable {
        int i = this.onWarmupCompleted;
        if (i == 0 || i == 1) {
            return onNavigationEvent();
        }
        if (i == 2) {
            this.onWarmupCompleted = 1;
            Iterator<? extends T> it = this.onExtraCallback;
            Intrinsics.checkNotNull(it);
            return it.next();
        }
        if (i == 3) {
            this.onWarmupCompleted = 0;
            T t = this.IAuthTabCallback;
            this.IAuthTabCallback = null;
            return t;
        }
        throw onWarmupCompleted();
    }

    private final T onNavigationEvent() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    private final Throwable onWarmupCompleted() {
        int i = this.onWarmupCompleted;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.onWarmupCompleted);
    }

    @Override // o.clearCommandLine
    public Object onNavigationEvent(T t, @NotNull access13800<? super Unit> access13800Var) {
        this.IAuthTabCallback = t;
        this.onWarmupCompleted = 3;
        this.onExtraCallbackWithResult = access13800Var;
        Object objOnExtraCallback = access14100.onExtraCallback();
        if (objOnExtraCallback == access14100.onExtraCallback()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        return objOnExtraCallback == access14100.onExtraCallback() ? objOnExtraCallback : Unit.INSTANCE;
    }

    @Override // o.clearCommandLine
    public Object onExtraCallback(@NotNull Iterator<? extends T> it, @NotNull access13800<? super Unit> access13800Var) {
        if (!it.hasNext()) {
            return Unit.INSTANCE;
        }
        this.onExtraCallback = it;
        this.onWarmupCompleted = 2;
        this.onExtraCallbackWithResult = access13800Var;
        Object objOnExtraCallback = access14100.onExtraCallback();
        if (objOnExtraCallback == access14100.onExtraCallback()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        return objOnExtraCallback == access14100.onExtraCallback() ? objOnExtraCallback : Unit.INSTANCE;
    }

    @Override // o.access13800
    public void resumeWith(@NotNull Object obj) {
        ResultKt.onNavigationEvent(obj);
        this.onWarmupCompleted = 4;
    }

    @Override // o.access13800
    public CoroutineContext getContext() {
        return access13600.IAuthTabCallback;
    }
}
