package im.toss.core.webkit.ksp.bridge;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import o.A0;
import o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1;
import o.access8100;
import o.drawTextBox;
import o.f2b;
import o.v0;
import o.x0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RnGraniteCoreKspWebMessageHandlerPool implements ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private final Map<String, Class<? extends drawTextBox>> onExtraCallback;
    private final Map<Class<? extends drawTextBox>, List<String>> onExtraCallbackWithResult;
    private final int onWarmupCompleted;

    public RnGraniteCoreKspWebMessageHandlerPool() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.onExtraCallback = linkedHashMap;
        this.onExtraCallbackWithResult = access8100.onNavigationEvent();
        this.onWarmupCompleted = linkedHashMap.size();
        linkedHashMap.put("appsInTossLog", f2b.class);
        linkedHashMap.put("deleteMiniAppBundle", v0.class);
        linkedHashMap.put("getMiniAppBundleInfo", x0.class);
        linkedHashMap.put("getMiniAppPermission", A0.class);
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Map<Class<? extends drawTextBox>, List<String>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public drawTextBox IAuthTabCallback(@NotNull String str) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Class<? extends drawTextBox> cls = this.onExtraCallback.get(str);
            if (cls == null) {
                return null;
            }
            return cls.newInstance();
        }
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Set<String> onExtraCallbackWithResult() {
        Set<String> setKeySet;
        synchronized (this) {
            setKeySet = this.onExtraCallback.keySet();
        }
        return setKeySet;
    }
}
