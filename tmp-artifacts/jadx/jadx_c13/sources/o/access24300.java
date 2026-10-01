package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access24300<T> extends setPc<T, T> {
    final deserializeIntNullableCollection<? super Throwable, ? extends serializeRaw<? extends T>> onExtraCallbackWithResult;
    final boolean onNavigationEvent;

    public access24300(serializeRaw<T> serializeraw, deserializeIntNullableCollection<? super Throwable, ? extends serializeRaw<? extends T>> deserializeintnullablecollection, boolean z) {
        super(serializeraw);
        this.onExtraCallbackWithResult = deserializeintnullablecollection;
        this.onNavigationEvent = z;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(writequoted, this.onExtraCallbackWithResult, this.onNavigationEvent);
        writequoted.IAuthTabCallback(iAuthTabCallback.onNavigationEvent);
        this.onWarmupCompleted.subscribe(iAuthTabCallback);
    }

    static final class IAuthTabCallback<T> implements writeQuoted<T> {
        boolean IAuthTabCallback;
        final deserializeIntNullableCollection<? super Throwable, ? extends serializeRaw<? extends T>> onExtraCallback;
        final writeQuoted<? super T> onExtraCallbackWithResult;
        final deserializeShortArray onNavigationEvent = new deserializeShortArray();
        boolean onTransact;
        final boolean onWarmupCompleted;

        IAuthTabCallback(writeQuoted<? super T> writequoted, deserializeIntNullableCollection<? super Throwable, ? extends serializeRaw<? extends T>> deserializeintnullablecollection, boolean z) {
            this.onExtraCallbackWithResult = writequoted;
            this.onExtraCallback = deserializeintnullablecollection;
            this.onWarmupCompleted = z;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            this.onNavigationEvent.IAuthTabCallback(deserializeurinullablecollection);
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            if (this.IAuthTabCallback) {
                return;
            }
            this.onExtraCallbackWithResult.onExtraCallback(t);
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            if (this.onTransact) {
                if (this.IAuthTabCallback) {
                    RxJavaPlugins.onExtraCallbackWithResult(th);
                    return;
                } else {
                    this.onExtraCallbackWithResult.onExtraCallbackWithResult(th);
                    return;
                }
            }
            this.onTransact = true;
            if (this.onWarmupCompleted && !(th instanceof Exception)) {
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(th);
                return;
            }
            try {
                serializeRaw<? extends T> serializerawApply = this.onExtraCallback.apply(th);
                if (serializerawApply == null) {
                    NullPointerException nullPointerException = new NullPointerException("Observable is null");
                    nullPointerException.initCause(th);
                    this.onExtraCallbackWithResult.onExtraCallbackWithResult(nullPointerException);
                    return;
                }
                serializerawApply.subscribe(this);
            } catch (Throwable th2) {
                NumberConverter.onWarmupCompleted(th2);
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(new deserializeDecimal(th, th2));
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            if (this.IAuthTabCallback) {
                return;
            }
            this.IAuthTabCallback = true;
            this.onTransact = true;
            this.onExtraCallbackWithResult.onExtraCallback();
        }
    }
}
