package o;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class uh9 implements lt14 {
    private final Map<uh25, setAdCreativeClickListener> onExtraCallback;
    private final uh31 onWarmupCompleted;

    public uh9() {
        HashMap map = new HashMap();
        this.onExtraCallback = map;
        this.onWarmupCompleted = new uh6();
        map.put(uh25.asInterface, new getDownloadButton());
        map.put(uh25.onNavigationEvent, new sya20());
        map.put(uh25.IAuthTabCallbackDefault, new sya26());
        map.put(uh25.onWarmupCompleted, new sya24());
        map.put(uh25.onExtraCallbackWithResult, new sya25());
        map.put(new uh25((Class<? extends Object>) UUID.class), new sya27());
        map.put(new uh25((Class<? extends Object>) Optional.class), new ry6(onWarmupCompleted()));
    }

    @Override // o.lt14
    public uh31 onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    @Override // o.lt14
    public Map<uh25, setAdCreativeClickListener> onExtraCallback() {
        return this.onExtraCallback;
    }
}
