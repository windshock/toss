package o;

import im.toss.tosssecurities.webview.TossSecuritiesWebView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFi1aSDK {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public static final /* synthetic */ class onExtraCallback {
        private static int onExtraCallbackWithResult = 1;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[TossSecuritiesWebView.onWarmupCompleted.values().length];
            try {
                iArr[TossSecuritiesWebView.onWarmupCompleted.FINTECH.ordinal()] = 1;
                int i = onExtraCallbackWithResult + 31;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TossSecuritiesWebView.onWarmupCompleted.MICRO_MTS.ordinal()] = 2;
                int i4 = onExtraCallbackWithResult + 69;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
        }
    }

    public static final String onExtraCallback(@NotNull TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted, @NotNull accessgetStatep accessgetstatep) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(accessgetstatep, "");
        int i2 = onExtraCallback.onNavigationEvent[onwarmupcompleted.ordinal()];
        if (i2 == 1) {
            return accessgetstatep.ResultReceiver();
        }
        int i3 = onNavigationEvent;
        int i4 = i3 + 13;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i6 = i3 + 65;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return accessgetstatep.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
    }
}
