package o;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import o.sya43;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class sya39 extends sya43 {
    private final Map<String, String> onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final Optional<onDowngrade> onWarmupCompleted;

    public sya39(boolean z, Optional<onDowngrade> optional, Map<String, String> map, Optional<sya8> optional2, Optional<sya8> optional3) {
        super(optional2, optional3);
        this.onExtraCallbackWithResult = z;
        Objects.requireNonNull(optional);
        this.onWarmupCompleted = optional;
        Objects.requireNonNull(map);
        this.onExtraCallback = map;
    }

    public boolean onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    public Optional<onDowngrade> IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    public Map<String, String> onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public sya43.IAuthTabCallback onNavigationEvent() {
        return sya43.IAuthTabCallback.DocumentStart;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("+DOC");
        if (onExtraCallback()) {
            sb.append(" ---");
        }
        return sb.toString();
    }
}
