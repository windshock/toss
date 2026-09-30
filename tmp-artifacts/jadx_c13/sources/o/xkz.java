package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class xkz<T> extends sz<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater onExtraCallback = AtomicIntegerFieldUpdater.newUpdater(xkz.class, "consumed$volatile");
    private final boolean asBinder;
    private volatile /* synthetic */ int consumed$volatile;
    private final ReceiveChannel<T> onWarmupCompleted;

    public /* synthetic */ xkz(ReceiveChannel receiveChannel, boolean z, CoroutineContext coroutineContext, int i, CloseableUtils closeableUtils, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(receiveChannel, z, (i2 & 4) != 0 ? access13600.IAuthTabCallback : coroutineContext, (i2 & 8) != 0 ? -3 : i, (i2 & 16) != 0 ? CloseableUtils.SUSPEND : closeableUtils);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xkz(@NotNull ReceiveChannel<? extends T> receiveChannel, boolean z, @NotNull CoroutineContext coroutineContext, int i, @NotNull CloseableUtils closeableUtils) {
        super(coroutineContext, i, closeableUtils);
        this.onWarmupCompleted = receiveChannel;
        this.asBinder = z;
    }

    private final void IAuthTabCallbackDefault() {
        if (this.asBinder && onExtraCallback.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    @Override // o.sz
    public sz<T> onExtraCallbackWithResult(@NotNull CoroutineContext coroutineContext, int i, @NotNull CloseableUtils closeableUtils) {
        return new xkz(this.onWarmupCompleted, this.asBinder, coroutineContext, i, closeableUtils);
    }

    @Override // o.sz
    public IAnimation<T> onWarmupCompleted() {
        return new xkz(this.onWarmupCompleted, this.asBinder, null, 0, null, 28, null);
    }

    @Override // o.sz
    public Object onExtraCallback(@NotNull ok<? super T> okVar, @NotNull access13800<? super Unit> access13800Var) {
        Object objOnWarmupCompleted = sycycx.onWarmupCompleted(new getAlignItems(okVar), this.onWarmupCompleted, this.asBinder, access13800Var);
        return objOnWarmupCompleted == access14100.onExtraCallback() ? objOnWarmupCompleted : Unit.INSTANCE;
    }

    @Override // o.sz
    public ReceiveChannel<T> onNavigationEvent(@NotNull findResAndMsg findresandmsg) {
        IAuthTabCallbackDefault();
        if (this.onExtraCallbackWithResult == -3) {
            return this.onWarmupCompleted;
        }
        return super.onNavigationEvent(findresandmsg);
    }

    @Override // o.sz, o.IAnimation
    public Object collect(@NotNull setRipple<? super T> setripple, @NotNull access13800<? super Unit> access13800Var) {
        if (this.onExtraCallbackWithResult == -3) {
            IAuthTabCallbackDefault();
            Object objOnWarmupCompleted = sycycx.onWarmupCompleted(setripple, this.onWarmupCompleted, this.asBinder, access13800Var);
            return objOnWarmupCompleted == access14100.onExtraCallback() ? objOnWarmupCompleted : Unit.INSTANCE;
        }
        Object objCollect = super.collect(setripple, access13800Var);
        return objCollect == access14100.onExtraCallback() ? objCollect : Unit.INSTANCE;
    }

    @Override // o.sz
    public String onNavigationEvent() {
        return "channel=" + this.onWarmupCompleted;
    }
}
