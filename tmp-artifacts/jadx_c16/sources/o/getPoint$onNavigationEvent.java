package o;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import o.getPoint;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getPoint$onNavigationEvent {
    static final /* synthetic */ getPoint$onNavigationEvent IAuthTabCallback = new getPoint$onNavigationEvent();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallback + 101;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private getPoint$onNavigationEvent() {
    }

    public final getPoint.onExtraCallback onNavigationEvent(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Response response = Response.onNavigationEvent;
        getPoint.onExtraCallback onextracallback = (getPoint.onExtraCallback) Response.onExtraCallback(context, getPoint.onExtraCallback.class);
        int i4 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return onextracallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
