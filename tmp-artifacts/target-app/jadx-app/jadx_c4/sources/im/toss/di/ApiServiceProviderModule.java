package im.toss.di;

import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.a2;
import o.g1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ApiServiceProviderModule {
    public static final ApiServiceProviderModule IAuthTabCallback = new ApiServiceProviderModule();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallback + 37;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private ApiServiceProviderModule() {
    }

    @Singleton
    public final g1 onWarmupCompleted(@NotNull a2 a2Var) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(a2Var, "");
        g1 g1Var = new g1(a2Var);
        int i2 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return g1Var;
    }
}
