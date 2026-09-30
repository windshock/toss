package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class z1ExternalSyntheticLambda2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static final z1ExternalSyntheticLambda0 IAuthTabCallback(long j) {
        int i = 2 % 2;
        z1ExternalSyntheticLambda0 z1externalsyntheticlambda0 = new z1ExternalSyntheticLambda0(j, null);
        int i2 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return z1externalsyntheticlambda0;
    }

    public static /* synthetic */ z1ExternalSyntheticLambda0 onWarmupCompleted(long j, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 73;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 79;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            j = MaxAdViewConfigurationAdaptiveType.IAuthTabCallback.IAuthTabCallback();
            if (i7 != 0) {
                int i8 = 62 / 0;
            }
        }
        return IAuthTabCallback(j);
    }

    public static final z1ExternalSyntheticLambda0 onNavigationEvent(long j) {
        int i = 2 % 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        z1ExternalSyntheticLambda0 z1externalsyntheticlambda0 = new z1ExternalSyntheticLambda0(j, defaultConstructorMarker);
        int i2 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return z1externalsyntheticlambda0;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ z1ExternalSyntheticLambda0 onNavigationEvent(long j, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            j = MaxAdWaterfallInfo.onExtraCallback.onExtraCallback();
        }
        z1ExternalSyntheticLambda0 z1externalsyntheticlambda0OnNavigationEvent = onNavigationEvent(j);
        int i5 = IAuthTabCallback + 97;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 0 / 0;
        }
        return z1externalsyntheticlambda0OnNavigationEvent;
    }
}
