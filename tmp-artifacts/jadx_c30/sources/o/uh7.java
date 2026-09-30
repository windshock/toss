package o;

import java.util.HashMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class uh7 extends uh9 {
    private final Map<uh25, setAdCreativeClickListener> onExtraCallback;

    public uh7() {
        HashMap map = new HashMap();
        this.onExtraCallback = map;
        map.put(uh25.onNavigationEvent, new sya10());
        map.put(uh25.IAuthTabCallbackDefault, new sya151());
        map.put(uh25.onWarmupCompleted, new yzp1());
    }

    @Override // o.uh9, o.lt14
    public uh31 onWarmupCompleted() {
        return new uh5();
    }

    @Override // o.uh9, o.lt14
    public Map<uh25, setAdCreativeClickListener> onExtraCallback() {
        Map<uh25, setAdCreativeClickListener> mapOnExtraCallback = super.onExtraCallback();
        mapOnExtraCallback.putAll(this.onExtraCallback);
        return mapOnExtraCallback;
    }
}
