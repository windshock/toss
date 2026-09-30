package o;

import java.util.Objects;
import java.util.Optional;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class IPBroadcastReceiver1 {
    private final Optional<String> onNavigationEvent;
    private final String onWarmupCompleted;

    public IPBroadcastReceiver1(Optional<String> optional, String str) {
        Objects.requireNonNull(optional);
        this.onNavigationEvent = optional;
        Objects.requireNonNull(str);
        this.onWarmupCompleted = str;
    }

    public Optional<String> onExtraCallback() {
        return this.onNavigationEvent;
    }

    public String onWarmupCompleted() {
        return this.onWarmupCompleted;
    }
}
