package o;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import o.initListener;
import o.zb7;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setLoadStatusListener extends getVideoFrameLayout {
    static final getVideoFrameLayout onWarmupCompleted = new setLoadStatusListener();
    private final Map<String, zb7> onExtraCallback;
    private final zb7 onExtraCallbackWithResult;

    setLoadStatusListener() {
        this((Map) null);
    }

    setLoadStatusListener(Map<String, zb7> map, zb7 zb7Var, boolean z) {
        this.onExtraCallbackWithResult = zb7Var;
        Map<String, zb7> map2 = (Map) map.entrySet().stream().collect(Collectors.toMap(new Function() { // from class: org.apache.commons.text.lookup.InterpolatorStringLookup$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return initListener.onExtraCallback((String) ((Map.Entry) obj).getKey());
            }
        }, new Function() { // from class: org.apache.commons.text.lookup.InterpolatorStringLookup$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (zb7) ((Map.Entry) obj).getValue();
            }
        }));
        this.onExtraCallback = map2;
        if (z) {
            initListener.IAuthTabCallback.IAuthTabCallback(map2);
        }
    }

    <V> setLoadStatusListener(Map<String, V> map) {
        this(initListener.IAuthTabCallback.onExtraCallback(map));
    }

    setLoadStatusListener(zb7 zb7Var) {
        this(Collections.EMPTY_MAP, zb7Var, true);
    }

    public String toString() {
        return super.toString() + " [stringLookupMap=" + this.onExtraCallback + ", defaultStringLookup=" + this.onExtraCallbackWithResult + "]";
    }
}
