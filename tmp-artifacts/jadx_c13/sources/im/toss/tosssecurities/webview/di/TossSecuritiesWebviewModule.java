package im.toss.tosssecurities.webview.di;

import kotlin.jvm.internal.Intrinsics;
import o.accessgetStatep;
import o.getHasConsentForAdStorage;
import o.r8lambdaGeF1OpgRxhfJiXGWbs9OMNOxg;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TossSecuritiesWebviewModule {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    public static final TossSecuritiesWebviewModule onNavigationEvent = new TossSecuritiesWebviewModule();
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private TossSecuritiesWebviewModule() {
    }

    public final getHasConsentForAdStorage onNavigationEvent(@NotNull accessgetStatep accessgetstatep) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(accessgetstatep, "");
        r8lambdaGeF1OpgRxhfJiXGWbs9OMNOxg r8lambdagef1opgrxhfjixgwbs9omnoxg = new r8lambdaGeF1OpgRxhfJiXGWbs9OMNOxg(accessgetstatep);
        int i2 = onExtraCallback + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return r8lambdagef1opgrxhfjixgwbs9omnoxg;
    }
}
