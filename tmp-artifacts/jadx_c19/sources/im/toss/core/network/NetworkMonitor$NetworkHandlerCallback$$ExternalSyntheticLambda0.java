package im.toss.core.network;

import android.net.Network;
import o.onTextViewSizeChanged;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NetworkMonitor$NetworkHandlerCallback$$ExternalSyntheticLambda0 implements Runnable {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ onTextViewSizeChanged.onNavigationEvent f$0;
    public final /* synthetic */ Network f$1;

    public /* synthetic */ NetworkMonitor$NetworkHandlerCallback$$ExternalSyntheticLambda0(onTextViewSizeChanged.onNavigationEvent onnavigationevent, Network network) {
        this.f$0 = onnavigationevent;
        this.f$1 = network;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 33;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        onTextViewSizeChanged.onNavigationEvent.onWarmupCompleted(this.f$0, this.f$1);
        int i5 = onExtraCallbackWithResult + 19;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
