package im.toss.di;

import kotlin.jvm.internal.Intrinsics;
import o.PerfMonitorOverlayManagerExternalSyntheticLambda5;
import o.PerfMonitorOverlayViewExternalSyntheticLambda1;
import o.onSeekEngaged;
import o.r8lambdayAxCciBTrlcy1PZkLupny43YYs;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TossTransferModule {
    private static int IAuthTabCallback = 1;
    public static final TossTransferModule onExtraCallback = new TossTransferModule();
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        int i = onNavigationEvent + 91;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private TossTransferModule() {
    }

    public final PerfMonitorOverlayManagerExternalSyntheticLambda5 onExtraCallbackWithResult(@NotNull onSeekEngaged onseekengaged) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onseekengaged, "");
        PerfMonitorOverlayManagerExternalSyntheticLambda5 perfMonitorOverlayManagerExternalSyntheticLambda5 = new PerfMonitorOverlayManagerExternalSyntheticLambda5(onseekengaged);
        int i2 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 5 / 0;
        }
        return perfMonitorOverlayManagerExternalSyntheticLambda5;
    }

    public final PerfMonitorOverlayViewExternalSyntheticLambda1 IAuthTabCallback(@NotNull onSeekEngaged onseekengaged) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onseekengaged, "");
        PerfMonitorOverlayViewExternalSyntheticLambda1 perfMonitorOverlayViewExternalSyntheticLambda1 = new PerfMonitorOverlayViewExternalSyntheticLambda1(onseekengaged);
        int i2 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return perfMonitorOverlayViewExternalSyntheticLambda1;
    }

    public final r8lambdayAxCciBTrlcy1PZkLupny43YYs onWarmupCompleted() {
        int i = 2 % 2;
        r8lambdayAxCciBTrlcy1PZkLupny43YYs r8lambdayaxccibtrlcy1pzklupny43yys = new r8lambdayAxCciBTrlcy1PZkLupny43YYs();
        int i2 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 15 / 0;
        }
        return r8lambdayaxccibtrlcy1pzklupny43yys;
    }
}
