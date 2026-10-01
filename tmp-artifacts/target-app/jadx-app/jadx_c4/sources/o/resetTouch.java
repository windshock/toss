package o;

import im.toss.ads_sdk.NativeAdsManager;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class resetTouch {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private final Map<getGroupName, WeakReference<RestrictionAllowlist>> onExtraCallback = new LinkedHashMap();
    private final Map<getGroupName, WeakReference<NativeAdsManager>> onWarmupCompleted = new LinkedHashMap();
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final int onExtraCallbackWithResult = 8;

    static {
        int i = onNavigationEvent + 93;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    @Inject
    public resetTouch() {
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }
}
