package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class NumberConverter13<T, U, V> extends NumberConverter11 implements writeQuoted<T>, TombstoneProtosLogBufferOrBuilder<U, V> {
    public volatile boolean IAuthTabCallback;
    public final parseNegativeInt<U> onExtraCallback;
    public final writeQuoted<? super V> onExtraCallbackWithResult;
    public volatile boolean onNavigationEvent;
    protected Throwable onWarmupCompleted;

    @Override // o.TombstoneProtosLogBufferOrBuilder
    public void onExtraCallbackWithResult(writeQuoted<? super V> writequoted, U u) {
    }

    public NumberConverter13(writeQuoted<? super V> writequoted, parseNegativeInt<U> parsenegativeint) {
        this.onExtraCallbackWithResult = writequoted;
        this.onExtraCallback = parsenegativeint;
    }

    @Override // o.TombstoneProtosLogBufferOrBuilder
    public final boolean onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    @Override // o.TombstoneProtosLogBufferOrBuilder
    public final boolean IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    public final boolean onExtraCallbackWithResult() {
        return this.IAuthTabCallbackDefault.getAndIncrement() == 0;
    }

    public final void onNavigationEvent(U u, boolean z, deserializeUriNullableCollection deserializeurinullablecollection) {
        writeQuoted<? super V> writequoted = this.onExtraCallbackWithResult;
        parseNegativeInt<U> parsenegativeint = this.onExtraCallback;
        if (this.IAuthTabCallbackDefault.get() == 0 && this.IAuthTabCallbackDefault.compareAndSet(0, 1)) {
            onExtraCallbackWithResult(writequoted, u);
            if (IAuthTabCallback(-1) == 0) {
                return;
            }
        } else {
            parsenegativeint.offer(u);
            if (!onExtraCallbackWithResult()) {
                return;
            }
        }
        access26500.onExtraCallback(parsenegativeint, writequoted, z, deserializeurinullablecollection, this);
    }

    public final void onExtraCallback(U u, boolean z, deserializeUriNullableCollection deserializeurinullablecollection) {
        writeQuoted<? super V> writequoted = this.onExtraCallbackWithResult;
        parseNegativeInt<U> parsenegativeint = this.onExtraCallback;
        if (this.IAuthTabCallbackDefault.get() == 0 && this.IAuthTabCallbackDefault.compareAndSet(0, 1)) {
            if (parsenegativeint.isEmpty()) {
                onExtraCallbackWithResult(writequoted, u);
                if (IAuthTabCallback(-1) == 0) {
                    return;
                }
            } else {
                parsenegativeint.offer(u);
            }
        } else {
            parsenegativeint.offer(u);
            if (!onExtraCallbackWithResult()) {
                return;
            }
        }
        access26500.onExtraCallback(parsenegativeint, writequoted, z, deserializeurinullablecollection, this);
    }

    @Override // o.TombstoneProtosLogBufferOrBuilder
    public final Throwable onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    @Override // o.TombstoneProtosLogBufferOrBuilder
    public final int IAuthTabCallback(int i) {
        return this.IAuthTabCallbackDefault.addAndGet(i);
    }
}
