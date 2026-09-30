package im.toss.features.home.core.remote.model.dst.widget;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.liq;
import o.pushWebview$onWarmupCompleted;
import o.safelyFillForConcurrentMap;

@liq(onNavigationEvent = HomeListRowAttributeResponse$onExtraCallbackWithResult.class)
/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class HomeListRowAttributeResponse$Bottom implements safelyFillForConcurrentMap<pushWebview$onWarmupCompleted> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    static {
        int i = onNavigationEvent + 75;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ HomeListRowAttributeResponse$Bottom(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private HomeListRowAttributeResponse$Bottom() {
    }
}
