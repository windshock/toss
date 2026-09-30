package o;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class jc<E> extends FileLock<E> {
    private access13800<? super Unit> IAuthTabCallback;

    public jc(@NotNull CoroutineContext coroutineContext, @NotNull nLockFileSegment<E> nlockfilesegment, @NotNull Function2<? super BsPatch<E>, ? super access13800<? super Unit>, ? extends Object> function2) {
        super(coroutineContext, nlockfilesegment, false);
        this.IAuthTabCallback = access14200.onNavigationEvent(function2, this, this);
    }

    @Override // o.setFullPackage
    public void onActivityResized() throws Throwable {
        setLoop.onExtraCallback(this.IAuthTabCallback, this);
    }

    @Override // o.dj, o.lt
    public Object onExtraCallback(E e, @NotNull access13800<? super Unit> access13800Var) {
        IAuthTabCallback_Parcel();
        Object objOnExtraCallback = super.onExtraCallback((jc<E>) e, access13800Var);
        return objOnExtraCallback == access14100.onExtraCallback() ? objOnExtraCallback : Unit.INSTANCE;
    }

    @Override // o.dj, o.lt
    public Object IAuthTabCallback(E e) {
        IAuthTabCallback_Parcel();
        return super.IAuthTabCallback((jc<E>) e);
    }

    @Override // o.dj, o.lt
    public boolean onExtraCallback(@Nullable Throwable th) {
        boolean zOnExtraCallback = super.onExtraCallback(th);
        IAuthTabCallback_Parcel();
        return zOnExtraCallback;
    }
}
