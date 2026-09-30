package im.toss.base.impl;

import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.JFunction2;
import o.TextRoundCornerProgressBarSavedState1;
import o.getForegroundInfo;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class BaseDelegateProviderModule {
    public static final BaseDelegateProviderModule IAuthTabCallback = new BaseDelegateProviderModule();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 32 / 0;
        }
    }

    private BaseDelegateProviderModule() {
    }

    @Singleton
    public final JFunction2 onWarmupCompleted(@NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        getForegroundInfo getforegroundinfo = new getForegroundInfo(textRoundCornerProgressBarSavedState1);
        int i2 = onExtraCallback + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return getforegroundinfo;
    }
}
