package im.toss.core.webkit.ksp.bridge;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1;
import o.Z;
import o.access8100;
import o.drawTextBox;
import o.getWrite;
import o.r8lambdaicixtRwf1QGDI5mWWT6K4Gg6lBA;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RnAppsInTossKspWebMessageHandlerPool implements ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private final Map<Class<? extends drawTextBox>, List<String>> onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final Map<String, Class<? extends drawTextBox>> onWarmupCompleted;

    public RnAppsInTossKspWebMessageHandlerPool() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.onWarmupCompleted = linkedHashMap;
        this.onExtraCallback = access8100.onNavigationEvent(getWrite.IAuthTabCallback(Z.class, CollectionsKt.listOf("setAppsInTossAuthorizationCode")));
        this.onExtraCallbackWithResult = linkedHashMap.size();
        linkedHashMap.put("setAppsInTossNotificationAgreement", r8lambdaicixtRwf1QGDI5mWWT6K4Gg6lBA.class);
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Map<Class<? extends drawTextBox>, List<String>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        Map<Class<? extends drawTextBox>, List<String>> map = this.onExtraCallback;
        int i5 = i3 + 77;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public drawTextBox IAuthTabCallback(@NotNull String str) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Class<? extends drawTextBox> cls = this.onWarmupCompleted.get(str);
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
            setKeySet = this.onWarmupCompleted.keySet();
        }
        return setKeySet;
    }
}
