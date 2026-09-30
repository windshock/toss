package o;

import o.r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 {
    DeviceQuirksExternalSyntheticLambda0 IAuthTabCallback();

    void IAuthTabCallback(int i);

    void IAuthTabCallback(long j);

    boolean IAuthTabCallbackDefault();

    long IAuthTabCallbackStub();

    boolean access000();

    r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g.onWarmupCompleted asBinder();

    long asInterface();

    float onExtraCallback();

    void onExtraCallback(boolean z);

    float onExtraCallbackWithResult();

    void onExtraCallbackWithResult(long j, float f, boolean z);

    void onExtraCallbackWithResult(boolean z, boolean z2);

    int onNavigationEvent();

    getHumanReadableName onTransact();

    long onWarmupCompleted();

    void onWarmupCompleted(long j);

    void onWarmupCompleted(@NotNull String str, long j);

    default void IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        onExtraCallbackWithResult(asInterface(), onExtraCallback(), IAuthTabCallbackDefault());
    }

    default void onExtraCallback(long j) {
        int i = 2 % 2;
        onExtraCallbackWithResult(j, onExtraCallback(), IAuthTabCallbackDefault());
    }

    static /* synthetic */ void IAuthTabCallback(r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, boolean z, boolean z2, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hide");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4.onExtraCallbackWithResult(z, z2);
    }
}
