package o;

import java.util.Objects;
import java.util.Optional;
import o.ycx41;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class IPBroadcastReceiver extends ycx41 {
    private final IPBroadcastReceiver1 onNavigationEvent;

    public IPBroadcastReceiver(IPBroadcastReceiver1 iPBroadcastReceiver1, Optional<sya8> optional, Optional<sya8> optional2) {
        super(optional, optional2);
        Objects.requireNonNull(iPBroadcastReceiver1);
        this.onNavigationEvent = iPBroadcastReceiver1;
    }

    public IPBroadcastReceiver1 onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public ycx41.IAuthTabCallback onNavigationEvent() {
        return ycx41.IAuthTabCallback.Tag;
    }
}
