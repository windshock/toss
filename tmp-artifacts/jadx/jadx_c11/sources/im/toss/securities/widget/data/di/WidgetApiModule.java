package im.toss.securities.widget.data.di;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.accessgetStatep;
import o.performOnAppAttribution;
import o.r2ExternalSyntheticLambda0;
import o.r8lambdaxutXMDQmdGLEK_rWLdybXibdyiY;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class WidgetApiModule {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    public static final WidgetApiModule onNavigationEvent = new WidgetApiModule();
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private WidgetApiModule() {
    }

    public final r2ExternalSyntheticLambda0 onWarmupCompleted(@NotNull performOnAppAttribution performonappattribution, @NotNull accessgetStatep accessgetstatep) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(performonappattribution, "");
        Intrinsics.checkNotNullParameter(accessgetstatep, "");
        r2ExternalSyntheticLambda0 r2externalsyntheticlambda0 = (r2ExternalSyntheticLambda0) performOnAppAttribution.onWarmupCompleted(performonappattribution, r2ExternalSyntheticLambda0.class, accessgetstatep.RatingCompatStarStyle(), (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        int i4 = onExtraCallback + 53;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return r2externalsyntheticlambda0;
    }

    public final r8lambdaxutXMDQmdGLEK_rWLdybXibdyiY onExtraCallback(@NotNull performOnAppAttribution performonappattribution, @NotNull accessgetStatep accessgetstatep) {
        Object objOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(performonappattribution, "");
            Intrinsics.checkNotNullParameter(accessgetstatep, "");
            objOnWarmupCompleted = performOnAppAttribution.onWarmupCompleted(performonappattribution, r8lambdaxutXMDQmdGLEK_rWLdybXibdyiY.class, accessgetstatep.ComponentActivity(), (Long) null, (Long) null, (Function1) null, 109, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(performonappattribution, "");
            Intrinsics.checkNotNullParameter(accessgetstatep, "");
            objOnWarmupCompleted = performOnAppAttribution.onWarmupCompleted(performonappattribution, r8lambdaxutXMDQmdGLEK_rWLdybXibdyiY.class, accessgetstatep.ComponentActivity(), (Long) null, (Long) null, (Function1) null, 28, (Object) null);
        }
        r8lambdaxutXMDQmdGLEK_rWLdybXibdyiY r8lambdaxutxmdqmdglek_rwldybxibdyiy = (r8lambdaxutXMDQmdGLEK_rWLdybXibdyiY) objOnWarmupCompleted;
        int i3 = onExtraCallback + 5;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return r8lambdaxutxmdqmdglek_rwldybxibdyiy;
    }
}
