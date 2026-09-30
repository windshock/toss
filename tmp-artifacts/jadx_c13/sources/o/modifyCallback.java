package o;

import java.util.List;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface modifyCallback {
    static modifyCallback onNavigationEvent() {
        return withContext.asBinder();
    }

    static modifyCallback onExtraCallbackWithResult() {
        return createAndPut.IAuthTabCallbackStub();
    }

    static modifyCallback asInterface() {
        return Grisu3CachedPowers.asBinder();
    }

    static modifyCallback onWarmupCompleted() {
        return Grisu3.onTransact();
    }

    static modifyCallback IAuthTabCallback() {
        return tryFindConverter.onTransact();
    }

    static modifyCallback onExtraCallback(List<Double> list) {
        return tryFindConverter.onNavigationEvent(list);
    }

    static modifyCallback onExtraCallback() {
        return useStringValuesCache.IAuthTabCallbackStub();
    }

    static modifyCallback onExtraCallbackWithResult(int i, int i2) {
        return useStringValuesCache.onExtraCallback(i, i2);
    }
}
