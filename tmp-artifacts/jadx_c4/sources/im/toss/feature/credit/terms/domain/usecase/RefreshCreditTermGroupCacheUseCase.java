package im.toss.feature.credit.terms.domain.usecase;

import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.CrashOptimizeSwitch;
import o.access13800;
import o.access14300;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RefreshCreditTermGroupCacheUseCase {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final setConfig onWarmupCompleted;

    @Inject
    public RefreshCreditTermGroupCacheUseCase(@NotNull setConfig setconfig) {
        Intrinsics.checkNotNullParameter(setconfig, "");
        this.onWarmupCompleted = setconfig;
    }

    public static final /* synthetic */ setConfig IAuthTabCallback(RefreshCreditTermGroupCacheUseCase refreshCreditTermGroupCacheUseCase) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setConfig setconfig = refreshCreditTermGroupCacheUseCase.onWarmupCompleted;
        if (i3 == 0) {
            return setconfig;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Object onNavigationEvent(@NotNull CrashOptimizeSwitch[] crashOptimizeSwitchArr, @NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        Object obj = null;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new RefreshCreditTermGroupCacheUseCase$invoke$2(this, crashOptimizeSwitchArr, null), access13800Var);
        if (objOnExtraCallback != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i2 = IAuthTabCallback;
        int i3 = i2 + 75;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 27;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return objOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }
}
