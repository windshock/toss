package o;

import im.toss.securities.core.router.spec.TossSecRoute;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import o.hExternalSyntheticLambda4;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class n8 implements o3ExternalSyntheticLambda0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public static final n8 onExtraCallbackWithResult = new n8();
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallback + 35;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private n8() {
    }

    @Override // o.o3ExternalSyntheticLambda0
    public String onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        hExternalSyntheticLambda4.onExtraCallback onextracallback = hExternalSyntheticLambda4.Companion;
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String str5 = onextracallback.IAuthTabCallback(lowerCase, str3).getBundleBaseUrl() + str + TossSecRoute.Main.PATH + str4 + "/rn84";
        int i2 = onWarmupCompleted + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str5;
    }
}
