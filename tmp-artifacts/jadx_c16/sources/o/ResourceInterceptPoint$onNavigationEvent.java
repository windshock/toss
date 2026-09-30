package o;

import o.getStackTraceString;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ResourceInterceptPoint$onNavigationEvent implements getStackTraceString.onWarmupCompleted {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public static final ResourceInterceptPoint$onNavigationEvent onNavigationEvent = new ResourceInterceptPoint$onNavigationEvent();

    static {
        int i = onExtraCallback + 85;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private ResourceInterceptPoint$onNavigationEvent() {
    }
}
