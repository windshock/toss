package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class parseNumberGeneric<T, R> implements writeQuoted<T>, parseDoubleGeneric<R> {
    public parseDoubleGeneric<T> IAuthTabCallback;
    public boolean onExtraCallback;
    public int onExtraCallbackWithResult;
    protected deserializeUriNullableCollection onNavigationEvent;
    public final writeQuoted<? super R> onWarmupCompleted;

    protected boolean onExtraCallbackWithResult() {
        return true;
    }

    public parseNumberGeneric(writeQuoted<? super R> writequoted) {
        this.onWarmupCompleted = writequoted;
    }

    @Override // o.writeQuoted
    public final void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        if (deserializeNumber.validate(this.onNavigationEvent, deserializeurinullablecollection)) {
            this.onNavigationEvent = deserializeurinullablecollection;
            if (deserializeurinullablecollection instanceof parseDoubleGeneric) {
                this.IAuthTabCallback = (parseDoubleGeneric) deserializeurinullablecollection;
            }
            if (onExtraCallbackWithResult()) {
                this.onWarmupCompleted.IAuthTabCallback(this);
            }
        }
    }

    @Override // o.writeQuoted
    public void onExtraCallbackWithResult(Throwable th) {
        if (this.onExtraCallback) {
            RxJavaPlugins.onExtraCallbackWithResult(th);
        } else {
            this.onExtraCallback = true;
            this.onWarmupCompleted.onExtraCallbackWithResult(th);
        }
    }

    public final void onWarmupCompleted(Throwable th) {
        NumberConverter.onWarmupCompleted(th);
        this.onNavigationEvent.dispose();
        onExtraCallbackWithResult(th);
    }

    @Override // o.writeQuoted
    public void onExtraCallback() {
        if (this.onExtraCallback) {
            return;
        }
        this.onExtraCallback = true;
        this.onWarmupCompleted.onExtraCallback();
    }

    public final int IAuthTabCallback(int i) {
        parseDoubleGeneric<T> parsedoublegeneric = this.IAuthTabCallback;
        if (parsedoublegeneric == null || (i & 4) != 0) {
            return 0;
        }
        int iRequestFusion = parsedoublegeneric.requestFusion(i);
        if (iRequestFusion != 0) {
            this.onExtraCallbackWithResult = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // o.deserializeUriNullableCollection
    public void dispose() {
        this.onNavigationEvent.dispose();
    }

    @Override // o.deserializeUriNullableCollection
    public boolean isDisposed() {
        return this.onNavigationEvent.isDisposed();
    }

    @Override // o.parsePositiveDecimal
    public boolean isEmpty() {
        return this.IAuthTabCallback.isEmpty();
    }

    @Override // o.parsePositiveDecimal
    public void clear() {
        this.IAuthTabCallback.clear();
    }

    @Override // o.parsePositiveDecimal
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
