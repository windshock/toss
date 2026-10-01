package j$.util.concurrent;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface Flow$Subscriber<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(Flow$Subscription flow$Subscription);
}
