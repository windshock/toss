package o;

import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
abstract class ImmutableConfig {

    interface onNavigationEvent {
        onNavigationEvent IAuthTabCallback(@Nullable String str);

        onNavigationEvent IAuthTabCallback(@Nullable List<String> list);

        ImmutableConfig IAuthTabCallback();

        onNavigationEvent onExtraCallback(@Nullable String str);

        onNavigationEvent onNavigationEvent(@Nullable Map<String, Object> map);
    }

    @Nullable
    abstract String IAuthTabCallback();

    @Nullable
    abstract String onExtraCallback();

    @Nullable
    abstract List<String> onExtraCallbackWithResult();

    @Nullable
    abstract String onNavigationEvent();

    @Nullable
    abstract Map<String, Object> onWarmupCompleted();

    ImmutableConfig() {
    }

    static onActivityPostStopped$onExtraCallback IAuthTabCallbackDefault() {
        return new onActivityPostStopped$onExtraCallback();
    }
}
