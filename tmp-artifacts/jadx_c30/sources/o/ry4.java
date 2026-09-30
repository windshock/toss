package o;

import java.util.Map;
import java.util.function.Function;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class ry4<V> extends getVideoFrameLayout {
    private final Function<String, V> onNavigationEvent;

    static <R> ry4<R> onExtraCallback(Function<String, R> function) {
        return new ry4<>(function);
    }

    static <V> ry4<V> onExtraCallback(Map<String, V> map) {
        final Map mapOnWarmupCompleted = initListener.onWarmupCompleted(map);
        return onExtraCallback(new Function() { // from class: org.apache.commons.text.lookup.FunctionStringLookup$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mapOnWarmupCompleted.get((String) obj);
            }
        });
    }

    private ry4(Function<String, V> function) {
        this.onNavigationEvent = function;
    }

    public String toString() {
        return super.toString() + " [function=" + this.onNavigationEvent + "]";
    }
}
