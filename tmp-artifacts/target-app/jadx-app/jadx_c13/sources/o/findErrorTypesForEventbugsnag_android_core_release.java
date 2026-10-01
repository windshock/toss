package o;

import java.util.List;
import java.util.function.BiConsumer;

/* loaded from: /tmp/toss_alldex/classes13.dex */
abstract class findErrorTypesForEventbugsnag_android_core_release implements getUserImplbugsnag_android_core_release {
    abstract List<String> onExtraCallbackWithResult();

    @Override // o.getUserImplbugsnag_android_core_release
    public int onWarmupCompleted() {
        return onExtraCallbackWithResult().size() / 2;
    }

    @Override // o.getUserImplbugsnag_android_core_release
    public boolean IAuthTabCallback() {
        return onExtraCallbackWithResult().isEmpty();
    }

    @Override // o.getUserImplbugsnag_android_core_release
    public void onNavigationEvent(BiConsumer<String, String> biConsumer) {
        if (biConsumer != null) {
            List<String> listOnExtraCallbackWithResult = onExtraCallbackWithResult();
            for (int i = 0; i < listOnExtraCallbackWithResult.size(); i += 2) {
                biConsumer.accept(listOnExtraCallbackWithResult.get(i), listOnExtraCallbackWithResult.get(i + 1));
            }
        }
    }

    static findErrorTypesForEventbugsnag_android_core_release IAuthTabCallback(List<String> list) {
        return new findSuffixInFilenamebugsnag_android_core_release(list);
    }

    findErrorTypesForEventbugsnag_android_core_release() {
    }
}
