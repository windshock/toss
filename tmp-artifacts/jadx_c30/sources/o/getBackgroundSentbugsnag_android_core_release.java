package o;

import javax.annotation.Nullable;
import o.setTimestamp;

/* loaded from: /tmp/toss_alldex/classes30.dex */
abstract class getBackgroundSentbugsnag_android_core_release {

    interface onWarmupCompleted {
        onWarmupCompleted IAuthTabCallback(@Nullable String str);

        onWarmupCompleted onExtraCallback(@Nullable String str);

        onWarmupCompleted onNavigationEvent(@Nullable String str);

        getBackgroundSentbugsnag_android_core_release onNavigationEvent();

        onWarmupCompleted onWarmupCompleted(@Nullable String str);

        onWarmupCompleted onWarmupCompleted(@Nullable getDataTrimmed getdatatrimmed);
    }

    @Nullable
    abstract String IAuthTabCallback();

    @Nullable
    abstract String IAuthTabCallbackStub();

    @Nullable
    abstract getDataTrimmed onExtraCallback();

    @Nullable
    abstract String onExtraCallbackWithResult();

    @Nullable
    abstract String onNavigationEvent();

    @Nullable
    abstract String onWarmupCompleted();

    getBackgroundSentbugsnag_android_core_release() {
    }

    static setTimestamp.onNavigationEvent IAuthTabCallbackDefault() {
        return new setTimestamp.onNavigationEvent();
    }
}
