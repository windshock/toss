package im.toss.features.home.core.remote.model.dst.widget;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.liq;
import o.pushWebview$IAuthTabCallbackStub;
import o.safelyFillForConcurrentMap;

@liq(onNavigationEvent = HomeListRowAttributeResponse$asBinder.class)
/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class HomeListRowAttributeResponse$Top implements safelyFillForConcurrentMap<pushWebview$IAuthTabCallbackStub> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 5;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ HomeListRowAttributeResponse$Top(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private HomeListRowAttributeResponse$Top() {
    }
}
