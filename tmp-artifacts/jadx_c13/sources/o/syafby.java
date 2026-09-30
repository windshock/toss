package o;

import java.util.concurrent.CancellationException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class syafby extends CancellationException {
    public syafby() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
