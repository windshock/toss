package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinNativeAdImplExternalSyntheticLambda3 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static final /* synthetic */ long onExtraCallback(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4, accessgettlsversionsasstringp);
        }
        onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4, accessgettlsversionsasstringp);
        throw null;
    }

    public static final long IAuthTabCallback(@NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, float f) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        long jOnNavigationEvent = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(O0.Companion.IAuthTabCallback(f)));
        int i4 = onExtraCallback + 51;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return jOnNavigationEvent;
    }

    private static final long onNavigationEvent(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        long jOnNavigationEvent = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(O0.Companion.IAuthTabCallback(connectionCount.onExtraCallback(AppLovinInitProvider.onWarmupCompleted(accessgettlsversionsasstringp, Float.MAX_VALUE), r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent(), 0.0f, 2, null))));
        int i4 = onNavigationEvent + 69;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return jOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }
}
