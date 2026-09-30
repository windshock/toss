package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SaversKtExternalSyntheticLambda0 {
    private final Map<Class<?>, Object> onExtraCallback;

    SaversKtExternalSyntheticLambda0(onExtraCallback onextracallback) {
        this.onExtraCallback = Collections.unmodifiableMap(new HashMap(onextracallback.onExtraCallbackWithResult));
    }

    public boolean onWarmupCompleted(Class<? extends Object> cls) {
        return this.onExtraCallback.containsKey(cls);
    }

    static final class onExtraCallback {
        private final Map<Class<?>, Object> onExtraCallbackWithResult = new HashMap();

        onExtraCallback() {
        }

        SaversKtExternalSyntheticLambda0 onExtraCallbackWithResult() {
            return new SaversKtExternalSyntheticLambda0(this);
        }
    }
}
