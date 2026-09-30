package im.toss.features.home.core.local.model.dst.widget;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.RVInitializer1;
import o.liq;
import o.pushWebview$onWarmupCompleted;
import o.safelyFillForConcurrentMap;

@liq(onNavigationEvent = RVInitializer1.class)
/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class HomeListRowAttributeLocal$Bottom implements safelyFillForConcurrentMap<pushWebview$onWarmupCompleted> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ HomeListRowAttributeLocal$Bottom(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private HomeListRowAttributeLocal$Bottom() {
    }
}
