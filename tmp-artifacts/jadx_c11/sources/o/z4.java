package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class z4 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static final z1ExternalSyntheticLambda3 onExtraCallback(long j) {
        int i = 2 % 2;
        z1ExternalSyntheticLambda3 z1externalsyntheticlambda3 = new z1ExternalSyntheticLambda3(j, null);
        int i2 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 27 / 0;
        }
        return z1externalsyntheticlambda3;
    }

    public static /* synthetic */ z1ExternalSyntheticLambda3 onExtraCallbackWithResult(long j, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            j = MaxDebuggerTestLiveNetworkActivity.IAuthTabCallback.IAuthTabCallback();
            int i4 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        return onExtraCallback(j);
    }

    public static final z1ExternalSyntheticLambda3 onNavigationEvent(long j) {
        int i = 2 % 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        z1ExternalSyntheticLambda3 z1externalsyntheticlambda3 = new z1ExternalSyntheticLambda3(j, defaultConstructorMarker);
        int i2 = onExtraCallbackWithResult + 19;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return z1externalsyntheticlambda3;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ z1ExternalSyntheticLambda3 onNavigationEvent(long j, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 45;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 47;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity = MaxDebuggerMultiAdActivity.IAuthTabCallback;
            if (i7 == 0) {
                maxDebuggerMultiAdActivity.onExtraCallbackWithResult();
                throw null;
            }
            j = maxDebuggerMultiAdActivity.onExtraCallbackWithResult();
        }
        return onNavigationEvent(j);
    }
}
