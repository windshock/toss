package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface setTlsokhttp extends tlsVersions {
    public static final onWarmupCompleted Companion = onWarmupCompleted.onNavigationEvent;

    isCompatible IAuthTabCallback();

    void IAuthTabCallback(@Nullable isCompatible iscompatible);

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        static final /* synthetic */ onWarmupCompleted onNavigationEvent = new onWarmupCompleted();
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallback + 77;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                int i2 = 99 / 0;
            }
        }

        private onWarmupCompleted() {
        }

        public final setTlsokhttp IAuthTabCallback(@NotNull float[] fArr) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(fArr, "");
            deprecated_expiresAt deprecated_expiresat = new deprecated_expiresAt(fArr);
            int i2 = IAuthTabCallback + 41;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return deprecated_expiresat;
        }
    }
}
