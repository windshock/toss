package o;

import java.util.function.BiConsumer;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface getUserImplbugsnag_android_core_release {
    boolean IAuthTabCallback();

    void onNavigationEvent(BiConsumer<String, String> biConsumer);

    int onWarmupCompleted();

    static getUserImplbugsnag_android_core_release onExtraCallback() {
        return findErrorTypesInFilenamebugsnag_android_core_release.onWarmupCompleted();
    }

    static setThreads onNavigationEvent() {
        return new findErrorTypesInFilenamebugsnag_android_core_release();
    }
}
