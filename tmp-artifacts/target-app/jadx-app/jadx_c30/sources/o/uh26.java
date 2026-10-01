package o;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class uh26 {
    private final Optional<onDowngrade> onExtraCallback;
    private final Map<String, String> onWarmupCompleted;

    public uh26(Optional<onDowngrade> optional, Map<String, String> map) {
        Objects.requireNonNull(optional);
        this.onExtraCallback = optional;
        this.onWarmupCompleted = map;
    }

    public Optional<onDowngrade> onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public Map<String, String> onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public String toString() {
        return String.format("VersionTagsTuple<%s, %s>", this.onExtraCallback, this.onWarmupCompleted);
    }
}
