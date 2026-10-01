package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getLogsList {
    public static boolean onExtraCallbackWithResult(AtomicReference<deserializeUriNullableCollection> atomicReference, deserializeUriNullableCollection deserializeurinullablecollection, Class<?> cls) {
        floatExponent.onExtraCallbackWithResult(deserializeurinullablecollection, "next is null");
        if (setSupportImageTintList.onNavigationEvent(atomicReference, (Object) null, deserializeurinullablecollection)) {
            return true;
        }
        deserializeurinullablecollection.dispose();
        if (atomicReference.get() == deserializeNumber.DISPOSED) {
            return false;
        }
        onNavigationEvent(cls);
        return false;
    }

    public static String onNavigationEvent(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    public static void onNavigationEvent(Class<?> cls) {
        RxJavaPlugins.onExtraCallbackWithResult(new deserializeDoubleArray(onNavigationEvent(cls.getName())));
    }
}
