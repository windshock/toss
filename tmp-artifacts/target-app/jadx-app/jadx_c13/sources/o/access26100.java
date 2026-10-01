package o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access26100 {
    public static final Throwable IAuthTabCallback = new IAuthTabCallback();

    public static RuntimeException onExtraCallback(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        }
        return new RuntimeException(th);
    }

    public static <T> boolean onWarmupCompleted(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        do {
            th2 = atomicReference.get();
            if (th2 == IAuthTabCallback) {
                return false;
            }
        } while (!setSupportImageTintList.onNavigationEvent(atomicReference, th2, th2 == null ? th : new deserializeDecimal(th2, th)));
        return true;
    }

    public static <T> Throwable IAuthTabCallback(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = IAuthTabCallback;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }

    public static <E extends Throwable> Exception IAuthTabCallback(Throwable th) throws Throwable {
        if (th instanceof Exception) {
            return (Exception) th;
        }
        throw th;
    }

    public static String onNavigationEvent(long j, TimeUnit timeUnit) {
        return "The source did not signal an event for " + j + " " + timeUnit.toString().toLowerCase() + " and has been terminated.";
    }

    static final class IAuthTabCallback extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }

        IAuthTabCallback() {
            super("No further exceptions");
        }
    }
}
