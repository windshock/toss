package im.toss.feature.bank.prefs.di;

import android.content.Context;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.IMtopProxyCallback;
import o.TextRoundCornerProgressBarSavedState1;
import o.getMax;
import o.getProgressColor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class BankPrefsModule {
    private static int IAuthTabCallback = 0;
    public static final BankPrefsModule onExtraCallback = new BankPrefsModule();
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallbackWithResult + 81;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private BankPrefsModule() {
    }

    @Singleton
    public final TextRoundCornerProgressBarSavedState1 onWarmupCompleted(@NotNull Context context, @NotNull getProgressColor getprogresscolor, @NotNull getMax getmax) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(getprogresscolor, "");
            Intrinsics.checkNotNullParameter(getmax, "");
            return IMtopProxyCallback.Companion.IAuthTabCallback(context, getprogresscolor, getmax);
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(getprogresscolor, "");
        Intrinsics.checkNotNullParameter(getmax, "");
        IMtopProxyCallback.Companion.IAuthTabCallback(context, getprogresscolor, getmax);
        throw null;
    }
}
