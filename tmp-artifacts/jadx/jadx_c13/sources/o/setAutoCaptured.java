package o;

import android.os.Process;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setAutoCaptured implements rootThreadGroup {
    public static int onExtraCallback;
    public static int onNavigationEvent;

    @Override // o.rootThreadGroup
    public r8lambdag_OpjN6PHscXZa7nfHnXWBb0X4 IAuthTabCallback(captureThreadTracetoBugsnagThread capturethreadtracetobugsnagthread) {
        return markTracked.onNavigationEvent();
    }

    @Override // o.rootThreadGroup
    public String onWarmupCompleted() {
        return "ottrace";
    }

    public static int onExtraCallbackWithResult() {
        int i = onNavigationEvent;
        int i2 = i % 6668492;
        onNavigationEvent = i + 1;
        if (i2 != 0) {
            return onExtraCallback;
        }
        int iMyPid = Process.myPid();
        onExtraCallback = iMyPid;
        return iMyPid;
    }
}
