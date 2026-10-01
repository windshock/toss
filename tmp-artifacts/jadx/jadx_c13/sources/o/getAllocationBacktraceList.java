package o;

import java.util.Arrays;
import java.util.NoSuchElementException;
import o.clearDeallocationBacktrace;
import o.setAddress;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getAllocationBacktraceList<T, R> extends writeRaw<R> {
    final Iterable<? extends deserializeIp<? extends T>> onNavigationEvent;
    final deserializeIntNullableCollection<? super Object[], ? extends R> onWarmupCompleted;

    public getAllocationBacktraceList(Iterable<? extends deserializeIp<? extends T>> iterable, deserializeIntNullableCollection<? super Object[], ? extends R> deserializeintnullablecollection) {
        this.onNavigationEvent = iterable;
        this.onWarmupCompleted = deserializeintnullablecollection;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super R> deserializeipnullablecollection) {
        deserializeIp[] deserializeipArr = new deserializeIp[8];
        try {
            int i = 0;
            for (deserializeIp<? extends T> deserializeip : this.onNavigationEvent) {
                if (deserializeip == null) {
                    deserializeShort.error(new NullPointerException("One of the sources is null"), deserializeipnullablecollection);
                    return;
                }
                if (i == deserializeipArr.length) {
                    deserializeipArr = (deserializeIp[]) Arrays.copyOf(deserializeipArr, (i >> 2) + i);
                }
                deserializeipArr[i] = deserializeip;
                i++;
            }
            if (i == 0) {
                deserializeShort.error(new NoSuchElementException(), deserializeipnullablecollection);
                return;
            }
            if (i == 1) {
                deserializeipArr[0].IAuthTabCallback(new clearDeallocationBacktrace.IAuthTabCallback(deserializeipnullablecollection, new IAuthTabCallback()));
                return;
            }
            setAddress.onExtraCallbackWithResult onextracallbackwithresult = new setAddress.onExtraCallbackWithResult(deserializeipnullablecollection, i, this.onWarmupCompleted);
            deserializeipnullablecollection.IAuthTabCallback(onextracallbackwithresult);
            for (int i2 = 0; i2 < i && !onextracallbackwithresult.isDisposed(); i2++) {
                deserializeipArr[i2].IAuthTabCallback(onextracallbackwithresult.observers[i2]);
            }
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            deserializeShort.error(th, deserializeipnullablecollection);
        }
    }

    final class IAuthTabCallback implements deserializeIntNullableCollection<T, R> {
        IAuthTabCallback() {
        }

        @Override // o.deserializeIntNullableCollection
        public R apply(T t) throws Exception {
            return (R) floatExponent.onExtraCallbackWithResult(getAllocationBacktraceList.this.onWarmupCompleted.apply(new Object[]{t}), "The zipper returned a null value");
        }
    }
}
