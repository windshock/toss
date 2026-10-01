package im.toss.securities.core.cert.data.di;

import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.afErrorLogForExcManagerOnly;
import o.o6;
import o.o7;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class TossSecCertHiltModule {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    public static final TossSecCertHiltModule onNavigationEvent = new TossSecCertHiltModule();
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private TossSecCertHiltModule() {
    }

    @Singleton
    public final o7 IAuthTabCallback(@NotNull afErrorLogForExcManagerOnly aferrorlogforexcmanageronly) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aferrorlogforexcmanageronly, "");
        o6 o6Var = new o6(aferrorlogforexcmanageronly);
        int i2 = onExtraCallback + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return o6Var;
    }
}
