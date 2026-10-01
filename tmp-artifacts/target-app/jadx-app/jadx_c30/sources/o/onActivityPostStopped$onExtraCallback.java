package o;

import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import o.ImmutableConfig;
import o.onActivityPostStopped;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class onActivityPostStopped$onExtraCallback implements ImmutableConfig.onNavigationEvent {
    private Map<String, Object> IAuthTabCallback;
    private List<String> onExtraCallback;
    private String onExtraCallbackWithResult;
    private String onNavigationEvent;
    private String onWarmupCompleted;

    onActivityPostStopped$onExtraCallback() {
    }

    public ImmutableConfig.onNavigationEvent onNavigationEvent(@Nullable String str) {
        this.onNavigationEvent = str;
        return this;
    }

    @Override // o.ImmutableConfig.onNavigationEvent
    public ImmutableConfig.onNavigationEvent IAuthTabCallback(@Nullable String str) {
        this.onExtraCallbackWithResult = str;
        return this;
    }

    @Override // o.ImmutableConfig.onNavigationEvent
    public ImmutableConfig.onNavigationEvent onExtraCallback(@Nullable String str) {
        this.onWarmupCompleted = str;
        return this;
    }

    @Override // o.ImmutableConfig.onNavigationEvent
    public ImmutableConfig.onNavigationEvent onNavigationEvent(@Nullable Map<String, Object> map) {
        this.IAuthTabCallback = map;
        return this;
    }

    @Override // o.ImmutableConfig.onNavigationEvent
    public ImmutableConfig.onNavigationEvent IAuthTabCallback(@Nullable List<String> list) {
        this.onExtraCallback = list;
        return this;
    }

    @Override // o.ImmutableConfig.onNavigationEvent
    public ImmutableConfig IAuthTabCallback() {
        return new onActivityPostStopped(this.onNavigationEvent, this.onExtraCallbackWithResult, this.onWarmupCompleted, this.IAuthTabCallback, this.onExtraCallback, (onActivityPostStopped.2) null);
    }
}
