package o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class InteractingState implements ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final int IAuthTabCallback;
    private final Map<Class<? extends drawTextBox>, List<String>> onExtraCallbackWithResult;
    private final Map<String, Class<? extends drawTextBox>> onNavigationEvent;

    public InteractingState() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.onNavigationEvent = linkedHashMap;
        this.onExtraCallbackWithResult = access8100.onNavigationEvent(getWrite.IAuthTabCallback(PackageParseUtils.class, CollectionsKt.listOf("closeHanaWebview")));
        this.IAuthTabCallback = linkedHashMap.size();
        linkedHashMap.put("getCertificateInfo", fastReadTarIntoMemory.class);
        linkedHashMap.put("completeHanaLoan", preParsePackage.class);
        linkedHashMap.put("confirmMyAccount", getPreParsedPackage.class);
        linkedHashMap.put("copyMyAccount", inBlackList.class);
        linkedHashMap.put("sendLoanBizScrapingResult", parsePackage.class);
        linkedHashMap.put("applyLoan", getCacheKey.class);
        linkedHashMap.put("requestPrescreen", verifyPackage.class);
        linkedHashMap.put("requestPrescreenWithTermsAgreed", verifyPackage.class);
        linkedHashMap.put("sendLoanNhisScrapingResult", PackageParseUtilsCachedParseResult.class);
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public Map<Class<? extends drawTextBox>, List<String>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 63;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Map<Class<? extends drawTextBox>, List<String>> map = this.onExtraCallbackWithResult;
        int i5 = i2 + 29;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    @Override // o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda1
    public drawTextBox IAuthTabCallback(@NotNull String str) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Class<? extends drawTextBox> cls = this.onNavigationEvent.get(str);
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
            setKeySet = this.onNavigationEvent.keySet();
        }
        return setKeySet;
    }
}
