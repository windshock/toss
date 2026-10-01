package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public enum deserializeNumber implements deserializeUriNullableCollection {
    DISPOSED;

    @Override // o.deserializeUriNullableCollection
    public void dispose() {
    }

    @Override // o.deserializeUriNullableCollection
    public boolean isDisposed() {
        return true;
    }

    public static boolean isDisposed(deserializeUriNullableCollection deserializeurinullablecollection) {
        return deserializeurinullablecollection == DISPOSED;
    }

    public static boolean set(AtomicReference<deserializeUriNullableCollection> atomicReference, deserializeUriNullableCollection deserializeurinullablecollection) {
        deserializeUriNullableCollection deserializeurinullablecollection2;
        do {
            deserializeurinullablecollection2 = atomicReference.get();
            if (deserializeurinullablecollection2 == DISPOSED) {
                if (deserializeurinullablecollection == null) {
                    return false;
                }
                deserializeurinullablecollection.dispose();
                return false;
            }
        } while (!setSupportImageTintList.onNavigationEvent(atomicReference, deserializeurinullablecollection2, deserializeurinullablecollection));
        if (deserializeurinullablecollection2 == null) {
            return true;
        }
        deserializeurinullablecollection2.dispose();
        return true;
    }

    public static boolean setOnce(AtomicReference<deserializeUriNullableCollection> atomicReference, deserializeUriNullableCollection deserializeurinullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializeurinullablecollection, "d is null");
        if (setSupportImageTintList.onNavigationEvent(atomicReference, (Object) null, deserializeurinullablecollection)) {
            return true;
        }
        deserializeurinullablecollection.dispose();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        reportDisposableSet();
        return false;
    }

    public static boolean replace(AtomicReference<deserializeUriNullableCollection> atomicReference, deserializeUriNullableCollection deserializeurinullablecollection) {
        deserializeUriNullableCollection deserializeurinullablecollection2;
        do {
            deserializeurinullablecollection2 = atomicReference.get();
            if (deserializeurinullablecollection2 == DISPOSED) {
                if (deserializeurinullablecollection == null) {
                    return false;
                }
                deserializeurinullablecollection.dispose();
                return false;
            }
        } while (!setSupportImageTintList.onNavigationEvent(atomicReference, deserializeurinullablecollection2, deserializeurinullablecollection));
        return true;
    }

    public static boolean dispose(AtomicReference<deserializeUriNullableCollection> atomicReference) {
        deserializeUriNullableCollection andSet;
        deserializeUriNullableCollection deserializeurinullablecollection = atomicReference.get();
        deserializeNumber deserializenumber = DISPOSED;
        if (deserializeurinullablecollection == deserializenumber || (andSet = atomicReference.getAndSet(deserializenumber)) == deserializenumber) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean validate(deserializeUriNullableCollection deserializeurinullablecollection, deserializeUriNullableCollection deserializeurinullablecollection2) {
        if (deserializeurinullablecollection2 == null) {
            RxJavaPlugins.onExtraCallbackWithResult(new NullPointerException("next is null"));
            return false;
        }
        if (deserializeurinullablecollection == null) {
            return true;
        }
        deserializeurinullablecollection2.dispose();
        reportDisposableSet();
        return false;
    }

    public static void reportDisposableSet() {
        RxJavaPlugins.onExtraCallbackWithResult(new deserializeDoubleArray("Disposable already set!"));
    }

    public static boolean trySet(AtomicReference<deserializeUriNullableCollection> atomicReference, deserializeUriNullableCollection deserializeurinullablecollection) {
        if (setSupportImageTintList.onNavigationEvent(atomicReference, (Object) null, deserializeurinullablecollection)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        deserializeurinullablecollection.dispose();
        return false;
    }
}
