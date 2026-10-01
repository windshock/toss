package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class write2<T> extends read2<T> {
    private static final long serialVersionUID = -5502432239815349361L;
    public final writeQuoted<? super T> downstream;
    protected T value;

    public write2(writeQuoted<? super T> writequoted) {
        this.downstream = writequoted;
    }

    @Override // o.parseFloatGeneric
    public final int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final void onExtraCallback(T t) {
        int i = get();
        if ((i & 54) == 0) {
            writeQuoted<? super T> writequoted = this.downstream;
            if (i == 8) {
                this.value = t;
                lazySet(16);
                writequoted.onExtraCallback(null);
            } else {
                lazySet(2);
                writequoted.onExtraCallback(t);
            }
            if (get() != 4) {
                writequoted.onExtraCallback();
            }
        }
    }

    public final void onNavigationEvent(Throwable th) {
        if ((get() & 54) != 0) {
            RxJavaPlugins.onExtraCallbackWithResult(th);
        } else {
            lazySet(2);
            this.downstream.onExtraCallbackWithResult(th);
        }
    }

    @Override // o.parsePositiveDecimal
    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t = this.value;
        this.value = null;
        lazySet(32);
        return t;
    }

    @Override // o.parsePositiveDecimal
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // o.parsePositiveDecimal
    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    public void dispose() {
        set(4);
        this.value = null;
    }

    @Override // o.deserializeUriNullableCollection
    public final boolean isDisposed() {
        return get() == 4;
    }
}
