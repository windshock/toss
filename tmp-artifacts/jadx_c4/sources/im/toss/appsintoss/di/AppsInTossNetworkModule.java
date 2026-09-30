package im.toss.appsintoss.di;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityWindowInfoCallbackControllerExternalSyntheticLambda0;
import o.OverlayControlleroverlayInfo1ExternalSyntheticLambda0;
import o.OverlayControlleroverlayInfo1ExternalSyntheticLambda1;
import o.SafeWindowLayoutComponentProviderExternalSyntheticLambda5;
import o.SplitAttributesSplitTypeCompanionExternalSyntheticLambda0;
import o.g1;
import o.zzad;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppsInTossNetworkModule {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final AppsInTossNetworkModule onNavigationEvent = new AppsInTossNetworkModule();
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallback + 9;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private AppsInTossNetworkModule() {
    }

    public final ActivityWindowInfoCallbackControllerExternalSyntheticLambda0 onWarmupCompleted(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        ActivityWindowInfoCallbackControllerExternalSyntheticLambda0 activityWindowInfoCallbackControllerExternalSyntheticLambda0 = (ActivityWindowInfoCallbackControllerExternalSyntheticLambda0) g1.onExtraCallback(g1Var, ActivityWindowInfoCallbackControllerExternalSyntheticLambda0.class, zzadVar.access000(), (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        int i4 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return activityWindowInfoCallbackControllerExternalSyntheticLambda0;
    }

    public final SafeWindowLayoutComponentProviderExternalSyntheticLambda5 IAuthTabCallback(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, SafeWindowLayoutComponentProviderExternalSyntheticLambda5.class, zzadVar.access000(), (Long) null, (Long) null, (Function1) null, 119, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, SafeWindowLayoutComponentProviderExternalSyntheticLambda5.class, zzadVar.access000(), (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        }
        return (SafeWindowLayoutComponentProviderExternalSyntheticLambda5) objOnExtraCallback;
    }

    public final SplitAttributesSplitTypeCompanionExternalSyntheticLambda0 onNavigationEvent(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, SplitAttributesSplitTypeCompanionExternalSyntheticLambda0.class, zzadVar.access000(), (Long) null, (Long) null, (Function1) null, 90, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, SplitAttributesSplitTypeCompanionExternalSyntheticLambda0.class, zzadVar.access000(), (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        }
        return (SplitAttributesSplitTypeCompanionExternalSyntheticLambda0) objOnExtraCallback;
    }

    public final OverlayControlleroverlayInfo1ExternalSyntheticLambda1 onExtraCallbackWithResult(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, OverlayControlleroverlayInfo1ExternalSyntheticLambda1.class, zzadVar.access000(), (Long) null, (Long) null, (Function1) null, 17, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, OverlayControlleroverlayInfo1ExternalSyntheticLambda1.class, zzadVar.access000(), (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        }
        return (OverlayControlleroverlayInfo1ExternalSyntheticLambda1) objOnExtraCallback;
    }

    public final OverlayControlleroverlayInfo1ExternalSyntheticLambda0 onExtraCallback(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        OverlayControlleroverlayInfo1ExternalSyntheticLambda0 overlayControlleroverlayInfo1ExternalSyntheticLambda0 = (OverlayControlleroverlayInfo1ExternalSyntheticLambda0) g1.onExtraCallback(g1Var, OverlayControlleroverlayInfo1ExternalSyntheticLambda0.class, zzadVar.writeTypedObject(), (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        int i4 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return overlayControlleroverlayInfo1ExternalSyntheticLambda0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
