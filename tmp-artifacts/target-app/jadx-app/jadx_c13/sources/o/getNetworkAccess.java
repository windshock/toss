package o;

import java.util.function.Predicate;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface getNetworkAccess {
    default getNetworkAccess onExtraCallback(Predicate<getLocationStatus<?>> predicate) {
        return this;
    }

    getNetworkAccess onExtraCallback(getScreenDensityDpi getscreendensitydpi);

    getScreenDensityDpi onExtraCallback();

    <T> getNetworkAccess onNavigationEvent(getLocationStatus<T> getlocationstatus, T t);

    default getNetworkAccess IAuthTabCallback(String str, String str2) {
        return onNavigationEvent((getLocationStatus<getLocationStatus<String>>) getLocationStatus.IAuthTabCallbackDefault(str), (getLocationStatus<String>) str2);
    }

    default getNetworkAccess onExtraCallback(String str, long j) {
        return onNavigationEvent((getLocationStatus<getLocationStatus<Long>>) getLocationStatus.asInterface(str), (getLocationStatus<Long>) Long.valueOf(j));
    }

    default getNetworkAccess onNavigationEvent(String str, double d) {
        return onNavigationEvent((getLocationStatus<getLocationStatus<Double>>) getLocationStatus.IAuthTabCallback(str), (getLocationStatus<Double>) Double.valueOf(d));
    }

    default getNetworkAccess onWarmupCompleted(String str, boolean z) {
        return onNavigationEvent((getLocationStatus<getLocationStatus<Boolean>>) getLocationStatus.onExtraCallbackWithResult(str), (getLocationStatus<Boolean>) Boolean.valueOf(z));
    }
}
