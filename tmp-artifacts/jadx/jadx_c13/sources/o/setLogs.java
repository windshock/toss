package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public enum setLogs implements ycxExternalSyntheticLambda1 {
    CANCELLED;

    @Override // o.ycxExternalSyntheticLambda1
    public void cancel() {
    }

    @Override // o.ycxExternalSyntheticLambda1
    public void request(long j) {
    }

    public static boolean validate(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1, ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda12) {
        if (ycxexternalsyntheticlambda12 == null) {
            RxJavaPlugins.onExtraCallbackWithResult(new NullPointerException("next is null"));
            return false;
        }
        if (ycxexternalsyntheticlambda1 == null) {
            return true;
        }
        ycxexternalsyntheticlambda12.cancel();
        reportSubscriptionSet();
        return false;
    }

    public static void reportSubscriptionSet() {
        RxJavaPlugins.onExtraCallbackWithResult(new deserializeDoubleArray("Subscription already set!"));
    }

    public static boolean validate(long j) {
        if (j > 0) {
            return true;
        }
        RxJavaPlugins.onExtraCallbackWithResult(new IllegalArgumentException("n > 0 required but it was " + j));
        return false;
    }

    public static void reportMoreProduced(long j) {
        RxJavaPlugins.onExtraCallbackWithResult(new deserializeDoubleArray("More produced than requested: " + j));
    }

    public static boolean set(AtomicReference<ycxExternalSyntheticLambda1> atomicReference, ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda12;
        do {
            ycxexternalsyntheticlambda12 = atomicReference.get();
            if (ycxexternalsyntheticlambda12 == CANCELLED) {
                if (ycxexternalsyntheticlambda1 == null) {
                    return false;
                }
                ycxexternalsyntheticlambda1.cancel();
                return false;
            }
        } while (!setSupportImageTintList.onNavigationEvent(atomicReference, ycxexternalsyntheticlambda12, ycxexternalsyntheticlambda1));
        if (ycxexternalsyntheticlambda12 == null) {
            return true;
        }
        ycxexternalsyntheticlambda12.cancel();
        return true;
    }

    public static boolean setOnce(AtomicReference<ycxExternalSyntheticLambda1> atomicReference, ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        floatExponent.onExtraCallbackWithResult(ycxexternalsyntheticlambda1, "s is null");
        if (setSupportImageTintList.onNavigationEvent(atomicReference, (Object) null, ycxexternalsyntheticlambda1)) {
            return true;
        }
        ycxexternalsyntheticlambda1.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        reportSubscriptionSet();
        return false;
    }

    public static boolean replace(AtomicReference<ycxExternalSyntheticLambda1> atomicReference, ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda12;
        do {
            ycxexternalsyntheticlambda12 = atomicReference.get();
            if (ycxexternalsyntheticlambda12 == CANCELLED) {
                if (ycxexternalsyntheticlambda1 == null) {
                    return false;
                }
                ycxexternalsyntheticlambda1.cancel();
                return false;
            }
        } while (!setSupportImageTintList.onNavigationEvent(atomicReference, ycxexternalsyntheticlambda12, ycxexternalsyntheticlambda1));
        return true;
    }

    public static boolean cancel(AtomicReference<ycxExternalSyntheticLambda1> atomicReference) {
        ycxExternalSyntheticLambda1 andSet;
        ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1 = atomicReference.get();
        setLogs setlogs = CANCELLED;
        if (ycxexternalsyntheticlambda1 == setlogs || (andSet = atomicReference.getAndSet(setlogs)) == setlogs) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static boolean deferredSetOnce(AtomicReference<ycxExternalSyntheticLambda1> atomicReference, AtomicLong atomicLong, ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        if (!setOnce(atomicReference, ycxexternalsyntheticlambda1)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        ycxexternalsyntheticlambda1.request(andSet);
        return true;
    }

    public static void deferredRequest(AtomicReference<ycxExternalSyntheticLambda1> atomicReference, AtomicLong atomicLong, long j) {
        ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1 = atomicReference.get();
        if (ycxexternalsyntheticlambda1 != null) {
            ycxexternalsyntheticlambda1.request(j);
            return;
        }
        if (validate(j)) {
            TombstoneProtosLogBufferBuilder.onWarmupCompleted(atomicLong, j);
            ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda12 = atomicReference.get();
            if (ycxexternalsyntheticlambda12 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    ycxexternalsyntheticlambda12.request(andSet);
                }
            }
        }
    }

    public static boolean setOnce(AtomicReference<ycxExternalSyntheticLambda1> atomicReference, ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1, long j) {
        if (!setOnce(atomicReference, ycxexternalsyntheticlambda1)) {
            return false;
        }
        ycxexternalsyntheticlambda1.request(j);
        return true;
    }
}
