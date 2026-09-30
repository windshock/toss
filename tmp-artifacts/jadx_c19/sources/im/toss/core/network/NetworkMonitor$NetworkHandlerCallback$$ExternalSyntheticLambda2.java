package im.toss.core.network;

import android.net.Network;
import android.net.NetworkCapabilities;
import o.onTextViewSizeChanged;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NetworkMonitor$NetworkHandlerCallback$$ExternalSyntheticLambda2 implements Runnable {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ onTextViewSizeChanged.onNavigationEvent f$0;
    public final /* synthetic */ Network f$1;
    public final /* synthetic */ NetworkCapabilities f$2;

    public /* synthetic */ NetworkMonitor$NetworkHandlerCallback$$ExternalSyntheticLambda2(onTextViewSizeChanged.onNavigationEvent onnavigationevent, Network network, NetworkCapabilities networkCapabilities) {
        this.f$0 = onnavigationevent;
        this.f$1 = network;
        this.f$2 = networkCapabilities;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        onTextViewSizeChanged.onNavigationEvent onnavigationevent = this.f$0;
        if (i4 != 0) {
            onTextViewSizeChanged.onNavigationEvent.IAuthTabCallback(onnavigationevent, this.f$1, this.f$2);
        } else {
            onTextViewSizeChanged.onNavigationEvent.IAuthTabCallback(onnavigationevent, this.f$1, this.f$2);
            int i5 = 78 / 0;
        }
    }
}
