package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access25500<T> extends AtomicReference<ycxExternalSyntheticLambda1> implements JsonReaderReadObject<T>, ycxExternalSyntheticLambda1, deserializeUriNullableCollection {
    private static final long serialVersionUID = -7251123623727029452L;
    final deserializeDecimalCollection onComplete;
    final deserializeFloat<? super Throwable> onError;
    final deserializeFloat<? super T> onNext;
    final deserializeFloat<? super ycxExternalSyntheticLambda1> onSubscribe;

    public access25500(deserializeFloat<? super T> deserializefloat, deserializeFloat<? super Throwable> deserializefloat2, deserializeDecimalCollection deserializedecimalcollection, deserializeFloat<? super ycxExternalSyntheticLambda1> deserializefloat3) {
        this.onNext = deserializefloat;
        this.onError = deserializefloat2;
        this.onComplete = deserializedecimalcollection;
        this.onSubscribe = deserializefloat3;
    }

    @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
    public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        if (setLogs.setOnce(this, ycxexternalsyntheticlambda1)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                ycxexternalsyntheticlambda1.cancel();
                onWarmupCompleted(th);
            }
        }
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onWarmupCompleted(T t) {
        if (isDisposed()) {
            return;
        }
        try {
            this.onNext.accept(t);
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            get().cancel();
            onWarmupCompleted(th);
        }
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onWarmupCompleted(Throwable th) {
        ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1 = get();
        setLogs setlogs = setLogs.CANCELLED;
        if (ycxexternalsyntheticlambda1 != setlogs) {
            lazySet(setlogs);
            try {
                this.onError.accept(th);
                return;
            } catch (Throwable th2) {
                NumberConverter.onWarmupCompleted(th2);
                RxJavaPlugins.onExtraCallbackWithResult(new deserializeDecimal(th, th2));
                return;
            }
        }
        RxJavaPlugins.onExtraCallbackWithResult(th);
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onExtraCallbackWithResult() {
        ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1 = get();
        setLogs setlogs = setLogs.CANCELLED;
        if (ycxexternalsyntheticlambda1 != setlogs) {
            lazySet(setlogs);
            try {
                this.onComplete.run();
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                RxJavaPlugins.onExtraCallbackWithResult(th);
            }
        }
    }

    @Override // o.deserializeUriNullableCollection
    public void dispose() {
        cancel();
    }

    @Override // o.deserializeUriNullableCollection
    public boolean isDisposed() {
        return get() == setLogs.CANCELLED;
    }

    @Override // o.ycxExternalSyntheticLambda1
    public void request(long j) {
        get().request(j);
    }

    @Override // o.ycxExternalSyntheticLambda1
    public void cancel() {
        setLogs.cancel(this);
    }
}
