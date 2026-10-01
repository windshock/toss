package o;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;
import o.PAGAppOpenAdLoadCallback;
import o.onVideoAdComplete;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class onVideoAdComplete {
    private static final Map<String, PAGAppOpenAdLoadCallback> onWarmupCompleted = new HashMap();

    static {
        onWarmupCompleted();
    }

    private static void onWarmupCompleted() {
        IAuthTabCallbackStub();
        asInterface();
        onNavigationEvent();
        IAuthTabCallback();
        onExtraCallbackWithResult();
        onExtraCallback();
    }

    private static void IAuthTabCallbackStub() {
        onExtraCallback(new PAGAppOpenAdLoadCallback(PAGAppOpenAdLoadCallback.IAuthTabCallback.BIT_32, PAGAppOpenAdLoadCallback.onWarmupCompleted.X86), "x86", "i386", "i486", "i586", "i686", "pentium");
    }

    private static void asInterface() {
        onExtraCallback(new PAGAppOpenAdLoadCallback(PAGAppOpenAdLoadCallback.IAuthTabCallback.BIT_64, PAGAppOpenAdLoadCallback.onWarmupCompleted.X86), "x86_64", "amd64", "em64t", "universal");
    }

    private static void onNavigationEvent() {
        onExtraCallback(new PAGAppOpenAdLoadCallback(PAGAppOpenAdLoadCallback.IAuthTabCallback.BIT_32, PAGAppOpenAdLoadCallback.onWarmupCompleted.IA_64), "ia64_32", "ia64n");
    }

    private static void IAuthTabCallback() {
        onExtraCallback(new PAGAppOpenAdLoadCallback(PAGAppOpenAdLoadCallback.IAuthTabCallback.BIT_64, PAGAppOpenAdLoadCallback.onWarmupCompleted.IA_64), "ia64", "ia64w");
    }

    private static void onExtraCallbackWithResult() {
        onExtraCallback(new PAGAppOpenAdLoadCallback(PAGAppOpenAdLoadCallback.IAuthTabCallback.BIT_32, PAGAppOpenAdLoadCallback.onWarmupCompleted.PPC), "ppc", "power", "powerpc", "power_pc", "power_rs");
    }

    private static void onExtraCallback() {
        onExtraCallback(new PAGAppOpenAdLoadCallback(PAGAppOpenAdLoadCallback.IAuthTabCallback.BIT_64, PAGAppOpenAdLoadCallback.onWarmupCompleted.PPC), "ppc64", "power64", "powerpc64", "power_pc64", "power_rs64");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onWarmupCompleted(String str, PAGAppOpenAdLoadCallback pAGAppOpenAdLoadCallback) {
        Map<String, PAGAppOpenAdLoadCallback> map = onWarmupCompleted;
        if (map.containsKey(str)) {
            throw new IllegalStateException("Key " + str + " already exists in processor map");
        }
        map.put(str, pAGAppOpenAdLoadCallback);
    }

    private static void onExtraCallback(final PAGAppOpenAdLoadCallback pAGAppOpenAdLoadCallback, String... strArr) {
        Stream.of((Object[]) strArr).forEach(new Consumer() { // from class: org.apache.commons.lang3.ArchUtils$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                onVideoAdComplete.onWarmupCompleted((String) obj, pAGAppOpenAdLoadCallback);
            }
        });
    }
}
