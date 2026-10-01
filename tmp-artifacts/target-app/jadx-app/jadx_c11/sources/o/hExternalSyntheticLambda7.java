package o;

import java.security.PublicKey;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class hExternalSyntheticLambda7 {
    public static final hExternalSyntheticLambda7 IAuthTabCallback = new hExternalSyntheticLambda7();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private hExternalSyntheticLambda7() {
    }

    public final PublicKey onExtraCallback(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            return hExternalSyntheticLambda4.Companion.IAuthTabCallback(lowerCase, str2).getVerificationKey();
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String lowerCase2 = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        PublicKey verificationKey = hExternalSyntheticLambda4.Companion.IAuthTabCallback(lowerCase2, str2).getVerificationKey();
        int i3 = 13 / 0;
        return verificationKey;
    }
}
