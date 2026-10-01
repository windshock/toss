package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import o.lud;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class dy<E> extends nLockFile<E> {
    private final CloseableUtils onExtraCallback;
    private final int onWarmupCompleted;

    @Override // o.nLockFile, o.lt
    public Object onExtraCallback(E e, @NotNull access13800<? super Unit> access13800Var) {
        return onExtraCallbackWithResult(this, e, access13800Var);
    }

    public dy(int i, @NotNull CloseableUtils closeableUtils, @Nullable Function1<? super E, Unit> function1) {
        super(i, function1);
        this.onWarmupCompleted = i;
        this.onExtraCallback = closeableUtils;
        if (closeableUtils == CloseableUtils.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + Reflection.getOrCreateKotlinClass(nLockFile.class).getSimpleName() + " instead").toString());
        }
        if (i > 0) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i + " was specified").toString());
    }

    @Override // o.nLockFile
    protected boolean extraCallbackWithResult() {
        return this.onExtraCallback == CloseableUtils.DROP_OLDEST;
    }

    static /* synthetic */ <E> Object onExtraCallbackWithResult(dy<E> dyVar, E e, access13800<? super Unit> access13800Var) throws Throwable {
        setIndicatorDirection setindicatordirectionOnExtraCallbackWithResult;
        Object objOnNavigationEvent = dyVar.onNavigationEvent((dy<E>) e, true);
        if (objOnNavigationEvent instanceof lud.onExtraCallbackWithResult) {
            lud.onWarmupCompleted(objOnNavigationEvent);
            Function1<E, Unit> function1 = dyVar.IAuthTabCallback;
            if (function1 != null && (setindicatordirectionOnExtraCallbackWithResult = ycx7.onExtraCallbackWithResult(function1, e, null, 2, null)) != null) {
                setExecute.onNavigationEvent(setindicatordirectionOnExtraCallbackWithResult, dyVar.access000());
                throw setindicatordirectionOnExtraCallbackWithResult;
            }
            throw dyVar.access000();
        }
        return Unit.INSTANCE;
    }

    @Override // o.nLockFile, o.lt
    public Object IAuthTabCallback(E e) {
        return onNavigationEvent((dy<E>) e, false);
    }

    private final Object onNavigationEvent(E e, boolean z) {
        return this.onExtraCallback == CloseableUtils.DROP_LATEST ? IAuthTabCallback((dy<E>) e, z) : onExtraCallbackWithResult((dy<E>) e);
    }

    private final Object IAuthTabCallback(E e, boolean z) {
        Function1<E, Unit> function1;
        setIndicatorDirection setindicatordirectionOnExtraCallbackWithResult;
        Object objIAuthTabCallback = super.IAuthTabCallback((dy<E>) e);
        if (lud.asInterface(objIAuthTabCallback) || lud.onTransact(objIAuthTabCallback)) {
            return objIAuthTabCallback;
        }
        if (z && (function1 = this.IAuthTabCallback) != null && (setindicatordirectionOnExtraCallbackWithResult = ycx7.onExtraCallbackWithResult(function1, e, null, 2, null)) != null) {
            throw setindicatordirectionOnExtraCallbackWithResult;
        }
        return lud.Companion.onNavigationEvent(Unit.INSTANCE);
    }
}
