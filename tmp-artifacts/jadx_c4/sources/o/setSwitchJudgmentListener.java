package o;

import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setSwitchJudgmentListener {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final ConcurrentHashMap<CrashOptimizeSwitch, enableSensorServiceContextOpt> onWarmupCompleted = new ConcurrentHashMap<>();

    @Inject
    public setSwitchJudgmentListener() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        r3 = kotlin.Result.Companion;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        return kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(new o.addHistoryQos()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r0 = kotlin.Result.Companion;
        r3 = kotlin.Result.constructor-impl(r3);
        r0 = o.setSwitchJudgmentListener.onExtraCallback + 109;
        o.setSwitchJudgmentListener.IAuthTabCallback = r0 % 128;
        r0 = r0 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallback(@NotNull CrashOptimizeSwitch crashOptimizeSwitch, @NotNull access13800<? super kotlin.Result<enableSensorServiceContextOpt>> access13800Var) {
        enableSensorServiceContextOpt enablesensorservicecontextopt;
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            enablesensorservicecontextopt = this.onWarmupCompleted.get(crashOptimizeSwitch);
            int i3 = 54 / 0;
        } else {
            enablesensorservicecontextopt = this.onWarmupCompleted.get(crashOptimizeSwitch);
        }
    }

    public final void onExtraCallbackWithResult(@NotNull CrashOptimizeSwitch crashOptimizeSwitch, @NotNull enableSensorServiceContextOpt enablesensorservicecontextopt) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(crashOptimizeSwitch, "");
            Intrinsics.checkNotNullParameter(enablesensorservicecontextopt, "");
            this.onWarmupCompleted.put(crashOptimizeSwitch, enablesensorservicecontextopt);
            throw null;
        }
        Intrinsics.checkNotNullParameter(crashOptimizeSwitch, "");
        Intrinsics.checkNotNullParameter(enablesensorservicecontextopt, "");
        this.onWarmupCompleted.put(crashOptimizeSwitch, enablesensorservicecontextopt);
        int i3 = onExtraCallback + 75;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public Object onNavigationEvent(@NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.clear();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 53;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
