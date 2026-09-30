package o;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class findViewHolderForLayoutPosition {
    private static final Map<animateAppearance, String> IAuthTabCallback;
    private static final Map<clearOnChildAttachStateChangeListeners, String> onExtraCallback;
    private static final Map<clearOldPositions, Integer> onExtraCallbackWithResult;
    private static final Map<dispatchLayout, String> onNavigationEvent;
    private static findViewHolderForLayoutPosition onWarmupCompleted;

    public static findViewHolderForLayoutPosition onExtraCallbackWithResult() {
        if (onWarmupCompleted == null) {
            onWarmupCompleted = new findViewHolderForLayoutPosition();
        }
        return onWarmupCompleted;
    }

    static {
        HashMap map = new HashMap();
        IAuthTabCallback = map;
        HashMap map2 = new HashMap();
        onNavigationEvent = map2;
        HashMap map3 = new HashMap();
        onExtraCallbackWithResult = map3;
        HashMap map4 = new HashMap();
        onExtraCallback = map4;
        map.put(animateAppearance.OFF, "off");
        map.put(animateAppearance.ON, "on");
        map.put(animateAppearance.AUTO, TtmlNode.TEXT_EMPHASIS_AUTO);
        map.put(animateAppearance.TORCH, "torch");
        map3.put(clearOldPositions.BACK, 0);
        map3.put(clearOldPositions.FRONT, 1);
        map2.put(dispatchLayout.AUTO, TtmlNode.TEXT_EMPHASIS_AUTO);
        map2.put(dispatchLayout.INCANDESCENT, "incandescent");
        map2.put(dispatchLayout.FLUORESCENT, "fluorescent");
        map2.put(dispatchLayout.DAYLIGHT, "daylight");
        map2.put(dispatchLayout.CLOUDY, "cloudy-daylight");
        map4.put(clearOnChildAttachStateChangeListeners.OFF, TtmlNode.TEXT_EMPHASIS_AUTO);
        map4.put(clearOnChildAttachStateChangeListeners.ON, "hdr");
    }

    private findViewHolderForLayoutPosition() {
    }

    public String onNavigationEvent(@NonNull animateAppearance animateappearance) {
        return IAuthTabCallback.get(animateappearance);
    }

    public int IAuthTabCallback(@NonNull clearOldPositions clearoldpositions) {
        return onExtraCallbackWithResult.get(clearoldpositions).intValue();
    }

    public String onExtraCallback(@NonNull dispatchLayout dispatchlayout) {
        return onNavigationEvent.get(dispatchlayout);
    }

    public String onNavigationEvent(@NonNull clearOnChildAttachStateChangeListeners clearonchildattachstatechangelisteners) {
        return onExtraCallback.get(clearonchildattachstatechangelisteners);
    }

    public animateAppearance onExtraCallbackWithResult(@NonNull String str) {
        return onNavigationEvent(IAuthTabCallback, str);
    }

    public clearOldPositions onExtraCallback(int i2) {
        return onNavigationEvent(onExtraCallbackWithResult, Integer.valueOf(i2));
    }

    public dispatchLayout onWarmupCompleted(@NonNull String str) {
        return onNavigationEvent(onNavigationEvent, str);
    }

    public clearOnChildAttachStateChangeListeners IAuthTabCallback(@NonNull String str) {
        return onNavigationEvent(onExtraCallback, str);
    }

    private <C extends addOnScrollListener, T> C onNavigationEvent(@NonNull Map<C, T> map, @NonNull T t) {
        for (C c : map.keySet()) {
            if (t.equals(map.get(c))) {
                return c;
            }
        }
        return null;
    }
}
