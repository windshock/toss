package o;

import android.content.Context;
import android.content.Intent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface onDeviceStateChanged {
    public static final onExtraCallbackWithResult Companion = onExtraCallbackWithResult.IAuthTabCallback;

    boolean IAuthTabCallback(@NotNull RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1);

    Intent[] IAuthTabCallback(@Nullable Intent[] intentArr);

    wasLastName onExtraCallbackWithResult(@NotNull Context context, @NotNull RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, @Nullable Intent[] intentArr);

    boolean onExtraCallbackWithResult(@Nullable Intent[] intentArr);

    boolean onNavigationEvent();

    wasLastName onWarmupCompleted(@NotNull Context context, @NotNull RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, @Nullable Intent intent);

    boolean onWarmupCompleted(@Nullable Intent intent);

    public static final class onExtraCallbackWithResult {
        static final /* synthetic */ onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        static {
            int i = onExtraCallback + 21;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onExtraCallbackWithResult() {
        }
    }
}
