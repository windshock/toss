package o;

import java.security.SecureRandom;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getTitleBar {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static final SecretKey onWarmupCompleted(@NotNull KeyGenerator keyGenerator) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(keyGenerator, "");
            keyGenerator.init(26994, SecureRandom.getInstance("SHA1PRNG"));
        } else {
            Intrinsics.checkNotNullParameter(keyGenerator, "");
            keyGenerator.init(256, SecureRandom.getInstance("SHA1PRNG"));
        }
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        Intrinsics.checkNotNullExpressionValue(secretKeyGenerateKey, "");
        return secretKeyGenerateKey;
    }
}
