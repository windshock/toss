package o;

import java.util.List;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface getLocationStatus<T> {
    String IAuthTabCallback();

    checkIsRooted onNavigationEvent();

    static getLocationStatus<String> IAuthTabCallbackDefault(String str) {
        return getAnrs.IAuthTabCallback(str, checkIsRooted.STRING);
    }

    static getLocationStatus<Boolean> onExtraCallbackWithResult(String str) {
        return getAnrs.IAuthTabCallback(str, checkIsRooted.BOOLEAN);
    }

    static getLocationStatus<Long> asInterface(String str) {
        return getAnrs.IAuthTabCallback(str, checkIsRooted.LONG);
    }

    static getLocationStatus<Double> IAuthTabCallback(String str) {
        return getAnrs.IAuthTabCallback(str, checkIsRooted.DOUBLE);
    }

    static getLocationStatus<List<String>> onTransact(String str) {
        return getAnrs.IAuthTabCallback(str, checkIsRooted.STRING_ARRAY);
    }

    static getLocationStatus<List<Boolean>> onExtraCallback(String str) {
        return getAnrs.IAuthTabCallback(str, checkIsRooted.BOOLEAN_ARRAY);
    }

    static getLocationStatus<List<Long>> onWarmupCompleted(String str) {
        return getAnrs.IAuthTabCallback(str, checkIsRooted.LONG_ARRAY);
    }

    static getLocationStatus<List<Double>> onNavigationEvent(String str) {
        return getAnrs.IAuthTabCallback(str, checkIsRooted.DOUBLE_ARRAY);
    }
}
