package o;

import android.R;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class clearAllocationBacktrace<T> extends writeRaw<T> {
    final Callable<? extends T> onNavigationEvent;

    public clearAllocationBacktrace(Callable<? extends T> callable) {
        this.onNavigationEvent = callable;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
        deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallbackWithResult = bigDecimalOrDouble.onExtraCallbackWithResult();
        deserializeipnullablecollection.IAuthTabCallback(deserializeurinullablecollectionOnExtraCallbackWithResult);
        if (deserializeurinullablecollectionOnExtraCallbackWithResult.isDisposed()) {
            return;
        }
        try {
            R.color colorVar = (Object) floatExponent.onExtraCallbackWithResult((Object) this.onNavigationEvent.call(), "The callable returned a null value");
            if (deserializeurinullablecollectionOnExtraCallbackWithResult.isDisposed()) {
                return;
            }
            deserializeipnullablecollection.onNavigationEvent(colorVar);
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            if (!deserializeurinullablecollectionOnExtraCallbackWithResult.isDisposed()) {
                deserializeipnullablecollection.onExtraCallbackWithResult(th);
            } else {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            }
        }
    }
}
