package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class approximateDouble extends RuntimeException {
    private static final long serialVersionUID = -6298857009889503852L;

    public approximateDouble(String str, Throwable th) {
        super(str, th == null ? new NullPointerException() : th);
    }

    public approximateDouble(Throwable th) {
        this("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + th, th);
    }
}
