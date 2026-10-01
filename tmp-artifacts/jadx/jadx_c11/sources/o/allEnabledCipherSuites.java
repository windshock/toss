package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface allEnabledCipherSuites extends tlsVersions {
    public static final onExtraCallback Companion = onExtraCallback.onExtraCallback;

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 0;
        static final /* synthetic */ onExtraCallback onExtraCallback = new onExtraCallback();
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        static {
            int i = onNavigationEvent + 47;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        private onExtraCallback() {
        }

        public final allEnabledCipherSuites onExtraCallback(@NotNull int[] iArr) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(iArr, "");
            parseAll parseall = new parseAll(iArr);
            int i2 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return parseall;
        }
    }
}
