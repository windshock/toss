package o;

import o.AFd1wSDK1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface AFd1wSDKExternalSyntheticLambda3 {
    void IAuthTabCallback(@NotNull AFd1wSDK1.onWarmupCompleted onwarmupcompleted);

    void IAuthTabCallback(@NotNull AFd1wSDK1.onWarmupCompleted onwarmupcompleted, long j);

    void IAuthTabCallback(@NotNull AFd1wSDK1.onWarmupCompleted onwarmupcompleted, @NotNull String str, boolean z, long j);

    void onExtraCallback(@NotNull AFd1wSDK1.onWarmupCompleted onwarmupcompleted, long j);

    zzag onExtraCallbackWithResult();

    void onNavigationEvent();

    static /* synthetic */ void onNavigationEvent(AFd1wSDKExternalSyntheticLambda3 aFd1wSDKExternalSyntheticLambda3, AFd1wSDK1.onWarmupCompleted onwarmupcompleted, long j, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
        }
        if ((i & 2) != 0) {
            j = aFd1wSDKExternalSyntheticLambda3.onExtraCallbackWithResult().onExtraCallback();
        }
        aFd1wSDKExternalSyntheticLambda3.onExtraCallback(onwarmupcompleted, j);
    }

    static /* synthetic */ void IAuthTabCallback(AFd1wSDKExternalSyntheticLambda3 aFd1wSDKExternalSyntheticLambda3, AFd1wSDK1.onWarmupCompleted onwarmupcompleted, String str, boolean z, long j, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stamp");
        }
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            j = aFd1wSDKExternalSyntheticLambda3.onExtraCallbackWithResult().onExtraCallback();
        }
        aFd1wSDKExternalSyntheticLambda3.IAuthTabCallback(onwarmupcompleted, str, z2, j);
    }

    static /* synthetic */ void IAuthTabCallback(AFd1wSDKExternalSyntheticLambda3 aFd1wSDKExternalSyntheticLambda3, AFd1wSDK1.onWarmupCompleted onwarmupcompleted, long j, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: end");
        }
        if ((i & 2) != 0) {
            j = aFd1wSDKExternalSyntheticLambda3.onExtraCallbackWithResult().onExtraCallback();
        }
        aFd1wSDKExternalSyntheticLambda3.IAuthTabCallback(onwarmupcompleted, j);
    }
}
