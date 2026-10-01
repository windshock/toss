package o;

import java.util.Map;
import o.UST_TRANS_Finalize;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class getBSignPriKeyCCFPH {
    private final Map<String, String> IAuthTabCallback;
    private final UST_TRANS_Finalize.onWarmupCompleted onExtraCallback;

    public getBSignPriKeyCCFPH(UST_TRANS_Finalize.onWarmupCompleted onwarmupcompleted, Map<String, String> map) {
        this.onExtraCallback = onwarmupcompleted;
        this.IAuthTabCallback = map;
    }

    public UST_TRANS_Finalize.onWarmupCompleted onWarmupCompleted() {
        return this.onExtraCallback;
    }

    public Map<String, String> onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    public String toString() {
        return String.format("VersionTagsTuple<%s, %s>", this.onExtraCallback, this.IAuthTabCallback);
    }
}
