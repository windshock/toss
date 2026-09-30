package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class r8lambdaxnlsrUWnZSWLAlZCj_icPo2spk0 {
    private static volatile ALCFaceSDK4 IAuthTabCallback = null;
    private static int onExtraCallback = 0;
    public static final r8lambdaxnlsrUWnZSWLAlZCj_icPo2spk0 onExtraCallbackWithResult = new r8lambdaxnlsrUWnZSWLAlZCj_icPo2spk0();
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallback + 19;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private r8lambdaxnlsrUWnZSWLAlZCj_icPo2spk0() {
    }

    public final void onWarmupCompleted(@NotNull ALCFaceSDK4 aLCFaceSDK4) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(aLCFaceSDK4, "");
        IAuthTabCallback = aLCFaceSDK4;
        int i4 = onTransact + 59;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public final trimMetadataStringsTo onNavigationEvent() {
        int i = 2 % 2;
        ALCFaceSDK4 aLCFaceSDK4 = IAuthTabCallback;
        Object obj = null;
        if (aLCFaceSDK4 == null) {
            int i2 = onNavigationEvent + 123;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = onNavigationEvent + 25;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return aLCFaceSDK4.onNavigationEvent();
        }
        aLCFaceSDK4.onNavigationEvent();
        obj.hashCode();
        throw null;
    }

    public final ALCFaceSDK4 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceSDK4 aLCFaceSDK4 = IAuthTabCallback;
        if (i3 != 0) {
            int i4 = 39 / 0;
        }
        return aLCFaceSDK4;
    }
}
