package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class StaticImageDecoderExternalSyntheticLambda0 implements getMax {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final BlackholeDecoderFactoryExternalSyntheticLambda0 onWarmupCompleted;

    public StaticImageDecoderExternalSyntheticLambda0() throws Throwable {
        try {
            BlackholeDecoderFactoryExternalSyntheticLambda0 blackholeDecoderFactoryExternalSyntheticLambda0OnExtraCallbackWithResult = BlackholeDecoderFactoryExternalSyntheticLambda0.Companion.onExtraCallbackWithResult();
            this.onWarmupCompleted = blackholeDecoderFactoryExternalSyntheticLambda0OnExtraCallbackWithResult;
            if (!blackholeDecoderFactoryExternalSyntheticLambda0OnExtraCallbackWithResult.onNavigationEvent()) {
                throw new AbstractContentPainterNodeExternalSyntheticLambda0(null, 1, null);
            }
            int i = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossKeyStore", "[KeyStoreValueCipher] TossKeyStoreCryptor is not available", th, (Map) null, 8, (Object) null);
            throw th;
        }
    }

    @Override // o.getMax
    public String onNavigationEvent(@NotNull String str, @NotNull String str2) {
        String strOnWarmupCompleted;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            strOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted(str);
        }
        return strOnWarmupCompleted;
    }

    @Override // o.getMax
    public String IAuthTabCallback(@NotNull String str, @NotNull String str2) {
        String strOnNavigationEvent;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            strOnNavigationEvent = this.onWarmupCompleted.onNavigationEvent(str);
        }
        return strOnNavigationEvent;
    }
}
