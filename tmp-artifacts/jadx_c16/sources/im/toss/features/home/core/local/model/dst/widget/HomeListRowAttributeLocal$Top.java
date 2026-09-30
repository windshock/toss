package im.toss.features.home.core.local.model.dst.widget;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.liq;
import o.pushWebview$IAuthTabCallbackStub;
import o.removeAppRecord;
import o.safelyFillForConcurrentMap;

@liq(onNavigationEvent = removeAppRecord.class)
/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class HomeListRowAttributeLocal$Top implements safelyFillForConcurrentMap<pushWebview$IAuthTabCallbackStub> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    static {
        Object obj = null;
        int i = onNavigationEvent + 57;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ HomeListRowAttributeLocal$Top(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private HomeListRowAttributeLocal$Top() {
    }
}
