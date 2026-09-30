package im.toss.di;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.FullScreenAdShowAdConfig;
import o.InterstitialAdInterstitialLoadAdConfig;
import o.decapitalize;
import o.g1;
import o.zzad;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class OnboardingNetworkModule {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public static final OnboardingNetworkModule onExtraCallbackWithResult = new OnboardingNetworkModule();
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallback + 109;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private OnboardingNetworkModule() {
    }

    public final FullScreenAdShowAdConfig onWarmupCompleted(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, FullScreenAdShowAdConfig.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, (Function1) null, 99, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, FullScreenAdShowAdConfig.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        }
        return (FullScreenAdShowAdConfig) objOnExtraCallback;
    }

    public final InterstitialAdInterstitialLoadAdConfig onNavigationEvent(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, InterstitialAdInterstitialLoadAdConfig.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, (Function1) null, 33, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, InterstitialAdInterstitialLoadAdConfig.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        }
        InterstitialAdInterstitialLoadAdConfig interstitialAdInterstitialLoadAdConfig = (InterstitialAdInterstitialLoadAdConfig) objOnExtraCallback;
        int i3 = onNavigationEvent + 93;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return interstitialAdInterstitialLoadAdConfig;
    }

    public final decapitalize IAuthTabCallback(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, decapitalize.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, (Function1) null, 87, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, decapitalize.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        }
        return (decapitalize) objOnExtraCallback;
    }
}
