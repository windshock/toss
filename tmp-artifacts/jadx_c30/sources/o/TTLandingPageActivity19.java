package o;

import java.util.Locale;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Consumer;
import o.TTLandingPageActivity19;
import o.TTLandingPageActivity4;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TTLandingPageActivity19 implements TTLandingPageActivity4 {
    public static final TTLandingPageActivity19 onNavigationEvent = new TTLandingPageActivity19();
    private final String IAuthTabCallback;
    private volatile String onExtraCallback;

    private static Iterable<TTLandingPageActivity4> onExtraCallback() {
        return ServiceLoader.load(TTLandingPageActivity4.class, ClassLoader.getSystemClassLoader());
    }

    public static /* synthetic */ SortedMap onNavigationEvent() {
        final TreeMap treeMap = new TreeMap();
        TTLandingPageActivity19 tTLandingPageActivity19 = onNavigationEvent;
        onExtraCallback(tTLandingPageActivity19.onWarmupCompleted(), tTLandingPageActivity19, treeMap);
        onExtraCallback().forEach(new Consumer() { // from class: org.apache.commons.compress.archivers.ArchiveStreamFactory$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                TTLandingPageActivity4 tTLandingPageActivity4 = (TTLandingPageActivity4) obj;
                TTLandingPageActivity19.onExtraCallback(tTLandingPageActivity4.onWarmupCompleted(), tTLandingPageActivity4, treeMap);
            }
        });
        return treeMap;
    }

    public static /* synthetic */ SortedMap onExtraCallbackWithResult() {
        final TreeMap treeMap = new TreeMap();
        TTLandingPageActivity19 tTLandingPageActivity19 = onNavigationEvent;
        onExtraCallback(tTLandingPageActivity19.IAuthTabCallback(), tTLandingPageActivity19, treeMap);
        onExtraCallback().forEach(new Consumer() { // from class: org.apache.commons.compress.archivers.ArchiveStreamFactory$$ExternalSyntheticLambda4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                TTLandingPageActivity4 tTLandingPageActivity4 = (TTLandingPageActivity4) obj;
                TTLandingPageActivity19.onExtraCallback(tTLandingPageActivity4.IAuthTabCallback(), tTLandingPageActivity4, treeMap);
            }
        });
        return treeMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void onExtraCallback(Set<String> set, final TTLandingPageActivity4 tTLandingPageActivity4, final TreeMap<String, TTLandingPageActivity4> treeMap) {
        set.forEach(new Consumer() { // from class: org.apache.commons.compress.archivers.ArchiveStreamFactory$$ExternalSyntheticLambda1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                TTLandingPageActivity19.onWarmupCompleted(treeMap, tTLandingPageActivity4, (String) obj);
            }
        });
    }

    public static /* synthetic */ void onWarmupCompleted(TreeMap treeMap, TTLandingPageActivity4 tTLandingPageActivity4, String str) {
    }

    private static String IAuthTabCallback(String str) {
        return str.toUpperCase(Locale.ROOT);
    }

    public TTLandingPageActivity19() {
        this(null);
    }

    public TTLandingPageActivity19(String str) {
        this.IAuthTabCallback = str;
        this.onExtraCallback = str;
    }

    @Override // o.TTLandingPageActivity4
    public Set<String> onWarmupCompleted() {
        return PAGNativeAdDataPAGNativeMediaType.onWarmupCompleted("ar", "arj", "zip", "tar", "jar", "cpio", "dump", "7z");
    }

    @Override // o.TTLandingPageActivity4
    public Set<String> IAuthTabCallback() {
        return PAGNativeAdDataPAGNativeMediaType.onWarmupCompleted("ar", "zip", "tar", "jar", "cpio", "7z");
    }
}
