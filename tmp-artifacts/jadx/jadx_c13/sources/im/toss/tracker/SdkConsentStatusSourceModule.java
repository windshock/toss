package im.toss.tracker;

import javax.inject.Singleton;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AFj1kSDKAFa1uSDK;
import o.AFj1mSDKExternalSyntheticLambda0;
import o.AFj1mSDKExternalSyntheticLambda2;
import o.g1;
import o.zzad;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class SdkConsentStatusSourceModule {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    static {
        int i = onExtraCallback + 19;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    @Singleton
    public abstract AFj1mSDKExternalSyntheticLambda0 onWarmupCompleted(@NotNull AFj1kSDKAFa1uSDK aFj1kSDKAFa1uSDK);

    public static final class onNavigationEvent {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        @Singleton
        public final AFj1mSDKExternalSyntheticLambda2 onWarmupCompleted(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            AFj1mSDKExternalSyntheticLambda2 aFj1mSDKExternalSyntheticLambda2 = (AFj1mSDKExternalSyntheticLambda2) g1.onExtraCallback(g1Var, AFj1mSDKExternalSyntheticLambda2.class, zzadVar.IAuthTabCallbackStub(), (Long) null, 5L, (Function1) null, 20, (Object) null);
            int i4 = onWarmupCompleted + 73;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return aFj1mSDKExternalSyntheticLambda2;
        }
    }
}
