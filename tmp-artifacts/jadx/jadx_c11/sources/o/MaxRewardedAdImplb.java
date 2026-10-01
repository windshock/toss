package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface MaxRewardedAdImplb {
    public static final IAuthTabCallback Companion = IAuthTabCallback.onExtraCallback;

    int IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4);

    void IAuthTabCallback();

    void onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4);

    void onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4);

    static /* synthetic */ boolean onExtraCallback(MaxRewardedAdImplb maxRewardedAdImplb, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hasExceededThreshold");
        }
        if ((i2 & 16) != 0) {
            i = 1;
        }
        return maxRewardedAdImplb.onExtraCallback(str, str2, str3, str4, i);
    }

    default boolean onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return IAuthTabCallback(str, str2, str3, str4) >= i;
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        static final /* synthetic */ IAuthTabCallback onExtraCallback = new IAuthTabCallback();
        private static int onExtraCallbackWithResult = 1;

        static {
            int i = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private IAuthTabCallback() {
        }
    }
}
