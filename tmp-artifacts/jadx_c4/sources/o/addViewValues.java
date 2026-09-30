package o;

import java.util.Map;
import o.PathMotion;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class addViewValues implements captureStartValues<PathMotion.onExtraCallback> {
    private final createAnimators<Map<Class<?>, Boolean>> onExtraCallbackWithResult;
    private final createAnimators<GhostViewHolder> onWarmupCompleted;

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public PathMotion.onExtraCallback get() {
        return onNavigationEvent((Map) this.onExtraCallbackWithResult.get(), (GhostViewHolder) this.onWarmupCompleted.get());
    }

    public static PathMotion.onExtraCallback onNavigationEvent(Map<Class<?>, Boolean> map, GhostViewHolder ghostViewHolder) {
        return new PathMotion.onExtraCallback(map, ghostViewHolder);
    }
}
