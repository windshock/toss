package im.toss.di;

import im.toss.components.tuba.variable.TubaVarV1SyncState;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.isJacksonCreator;
import o.trackCustomTabsTabHidden;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class StateMachineModule {
    private static int IAuthTabCallback = 1;
    public static final StateMachineModule onExtraCallback = new StateMachineModule();
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onWarmupCompleted + 117;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private StateMachineModule() {
    }

    @Singleton
    public final TubaVarV1SyncState onWarmupCompleted(@NotNull isJacksonCreator isjacksoncreator) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isjacksoncreator, "");
        trackCustomTabsTabHidden trackcustomtabstabhidden = new trackCustomTabsTabHidden(isjacksoncreator);
        int i2 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return trackcustomtabstabhidden;
    }
}
