package o;

import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface getScreenDensityDpi {
    void forEach(BiConsumer<? super getLocationStatus<?>, ? super Object> biConsumer);

    boolean isEmpty();

    getNetworkAccess onExtraCallbackWithResult();

    @Nullable
    <T> T onNavigationEvent(getLocationStatus<T> getlocationstatus);

    Map<getLocationStatus<?>, Object> onNavigationEvent();

    int size();

    static getScreenDensityDpi bB_() {
        return calculateTotalMemory.IAuthTabCallback;
    }

    static <T> getScreenDensityDpi onExtraCallbackWithResult(getLocationStatus<T> getlocationstatus, T t) {
        if (getlocationstatus == null || getlocationstatus.IAuthTabCallback().isEmpty() || t == null) {
            return bB_();
        }
        return new calculateTotalMemory(new Object[]{getlocationstatus, t});
    }

    static <T, U> getScreenDensityDpi onNavigationEvent(getLocationStatus<T> getlocationstatus, T t, getLocationStatus<U> getlocationstatus2, U u) {
        if (getlocationstatus == null || getlocationstatus.IAuthTabCallback().isEmpty() || t == null) {
            return onExtraCallbackWithResult(getlocationstatus2, u);
        }
        if (getlocationstatus2 == null || getlocationstatus2.IAuthTabCallback().isEmpty() || u == null) {
            return onExtraCallbackWithResult(getlocationstatus, t);
        }
        if (getlocationstatus.IAuthTabCallback().equals(getlocationstatus2.IAuthTabCallback())) {
            return onExtraCallbackWithResult(getlocationstatus2, u);
        }
        if (getlocationstatus.IAuthTabCallback().compareTo(getlocationstatus2.IAuthTabCallback()) > 0) {
            return new calculateTotalMemory(new Object[]{getlocationstatus2, u, getlocationstatus, t});
        }
        return new calculateTotalMemory(new Object[]{getlocationstatus, t, getlocationstatus2, u});
    }

    static <T, U, V> getScreenDensityDpi onWarmupCompleted(getLocationStatus<T> getlocationstatus, T t, getLocationStatus<U> getlocationstatus2, U u, getLocationStatus<V> getlocationstatus3, V v) {
        return calculateTotalMemory.onExtraCallback(getlocationstatus, t, getlocationstatus2, u, getlocationstatus3, v);
    }

    static getNetworkAccess onWarmupCompleted() {
        return new r8lambdam_Qv1Bq95F9USSqzH_fdoo4U8lk();
    }
}
