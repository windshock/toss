package im.toss.components.tuba.distribution;

import javax.inject.Singleton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.UtilsKtExternalSyntheticLambda14;
import o.ca;
import o.ea;
import o.g1;
import o.zzad;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TubaDistributionModule {
    public static final TubaDistributionModule IAuthTabCallback = new TubaDistributionModule();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    static {
        int i = onNavigationEvent + 51;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(ea eaVar, OkHttpClient.Builder builder) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(eaVar, builder);
        int i4 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    private TubaDistributionModule() {
    }

    @Singleton
    public final UtilsKtExternalSyntheticLambda14 onNavigationEvent(@NotNull g1 g1Var, @NotNull final ea eaVar, @NotNull zzad zzadVar) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        Intrinsics.checkNotNullParameter(eaVar, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        UtilsKtExternalSyntheticLambda14 utilsKtExternalSyntheticLambda14 = (UtilsKtExternalSyntheticLambda14) g1.onExtraCallback(g1Var, UtilsKtExternalSyntheticLambda14.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, new Function1() { // from class: im.toss.components.tuba.distribution.TubaDistributionModule$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 103;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = TubaDistributionModule.onWarmupCompleted(eaVar, (OkHttpClient.Builder) obj);
                int i5 = onNavigationEvent + 71;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unitOnWarmupCompleted;
            }
        }, 12, (Object) null);
        int i2 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 11 / 0;
        }
        return utilsKtExternalSyntheticLambda14;
    }

    private static final Unit IAuthTabCallback(ea eaVar, OkHttpClient.Builder builder) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(builder, "");
        builder.dns(eaVar.onNavigationEvent(ca.INFRA));
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
