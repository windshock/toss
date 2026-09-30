package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AppLoadInterceptorPoint$onWarmupCompleted extends AppLoadInterceptorPoint {
    public static final AppLoadInterceptorPoint$onWarmupCompleted IAuthTabCallback = new AppLoadInterceptorPoint$onWarmupCompleted();
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onNavigationEvent + 99;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private AppLoadInterceptorPoint$onWarmupCompleted() {
        super((DefaultConstructorMarker) null);
    }
}
