package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access12400<T> extends setPc<T, T> {
    final deserializeFloat<? super Throwable> IAuthTabCallback;
    final deserializeFloat<? super T> onExtraCallback;
    final deserializeDecimalCollection onExtraCallbackWithResult;
    final deserializeDecimalCollection onNavigationEvent;

    public access12400(serializeRaw<T> serializeraw, deserializeFloat<? super T> deserializefloat, deserializeFloat<? super Throwable> deserializefloat2, deserializeDecimalCollection deserializedecimalcollection, deserializeDecimalCollection deserializedecimalcollection2) {
        super(serializeraw);
        this.onExtraCallback = deserializefloat;
        this.IAuthTabCallback = deserializefloat2;
        this.onNavigationEvent = deserializedecimalcollection;
        this.onExtraCallbackWithResult = deserializedecimalcollection2;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        this.onWarmupCompleted.subscribe(new onExtraCallback(writequoted, this.onExtraCallback, this.IAuthTabCallback, this.onNavigationEvent, this.onExtraCallbackWithResult));
    }

    static final class onExtraCallback<T> implements writeQuoted<T>, deserializeUriNullableCollection {
        final writeQuoted<? super T> IAuthTabCallback;
        final deserializeFloat<? super T> IAuthTabCallbackStub;
        deserializeUriNullableCollection asInterface;
        boolean onExtraCallback;
        final deserializeDecimalCollection onExtraCallbackWithResult;
        final deserializeFloat<? super Throwable> onNavigationEvent;
        final deserializeDecimalCollection onWarmupCompleted;

        onExtraCallback(writeQuoted<? super T> writequoted, deserializeFloat<? super T> deserializefloat, deserializeFloat<? super Throwable> deserializefloat2, deserializeDecimalCollection deserializedecimalcollection, deserializeDecimalCollection deserializedecimalcollection2) {
            this.IAuthTabCallback = writequoted;
            this.IAuthTabCallbackStub = deserializefloat;
            this.onNavigationEvent = deserializefloat2;
            this.onExtraCallbackWithResult = deserializedecimalcollection;
            this.onWarmupCompleted = deserializedecimalcollection2;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.asInterface, deserializeurinullablecollection)) {
                this.asInterface = deserializeurinullablecollection;
                this.IAuthTabCallback.IAuthTabCallback(this);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.asInterface.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.asInterface.isDisposed();
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            if (this.onExtraCallback) {
                return;
            }
            try {
                this.IAuthTabCallbackStub.accept(t);
                this.IAuthTabCallback.onExtraCallback(t);
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                this.asInterface.dispose();
                onExtraCallbackWithResult(th);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            if (this.onExtraCallback) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
                return;
            }
            this.onExtraCallback = true;
            try {
                this.onNavigationEvent.accept(th);
            } catch (Throwable th2) {
                NumberConverter.onWarmupCompleted(th2);
                th = new deserializeDecimal(th, th2);
            }
            this.IAuthTabCallback.onExtraCallbackWithResult(th);
            try {
                this.onWarmupCompleted.run();
            } catch (Throwable th3) {
                NumberConverter.onWarmupCompleted(th3);
                RxJavaPlugins.onExtraCallbackWithResult(th3);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            if (this.onExtraCallback) {
                return;
            }
            try {
                this.onExtraCallbackWithResult.run();
                this.onExtraCallback = true;
                this.IAuthTabCallback.onExtraCallback();
                try {
                    this.onWarmupCompleted.run();
                } catch (Throwable th) {
                    NumberConverter.onWarmupCompleted(th);
                    RxJavaPlugins.onExtraCallbackWithResult(th);
                }
            } catch (Throwable th2) {
                NumberConverter.onWarmupCompleted(th2);
                onExtraCallbackWithResult(th2);
            }
        }
    }
}
