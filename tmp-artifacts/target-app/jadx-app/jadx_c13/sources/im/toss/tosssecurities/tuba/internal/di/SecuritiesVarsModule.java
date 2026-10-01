package im.toss.tosssecurities.tuba.internal.di;

import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.AFe1cSDK;
import o.AFe1jSDKAFa1uSDK;
import o.AFe1mSDK;
import o.AFe1qSDK;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class SecuritiesVarsModule {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    public static final SecuritiesVarsModule onNavigationEvent = new SecuritiesVarsModule();
    private static int onWarmupCompleted;

    static {
        int i = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private SecuritiesVarsModule() {
    }

    @Singleton
    public final AFe1cSDK onWarmupCompleted(@NotNull AFe1mSDK aFe1mSDK, @NotNull AFe1qSDK aFe1qSDK) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aFe1mSDK, "");
        Intrinsics.checkNotNullParameter(aFe1qSDK, "");
        AFe1jSDKAFa1uSDK aFe1jSDKAFa1uSDK = new AFe1jSDKAFa1uSDK(aFe1mSDK, aFe1qSDK);
        int i2 = onWarmupCompleted + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return aFe1jSDKAFa1uSDK;
    }
}
