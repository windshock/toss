package im.toss.core.network;

import android.net.Network;
import o.onTextViewSizeChanged;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NetworkMonitor$NetworkHandlerCallback$$ExternalSyntheticLambda1 implements Runnable {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ onTextViewSizeChanged.onNavigationEvent f$0;
    public final /* synthetic */ Network f$1;

    public /* synthetic */ NetworkMonitor$NetworkHandlerCallback$$ExternalSyntheticLambda1(onTextViewSizeChanged.onNavigationEvent onnavigationevent, Network network) {
        this.f$0 = onnavigationevent;
        this.f$1 = network;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 121;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        onTextViewSizeChanged.onNavigationEvent onnavigationevent = this.f$0;
        if (i4 == 0) {
            onTextViewSizeChanged.onNavigationEvent.onExtraCallbackWithResult(onnavigationevent, this.f$1);
        } else {
            onTextViewSizeChanged.onNavigationEvent.onExtraCallbackWithResult(onnavigationevent, this.f$1);
            throw null;
        }
    }
}
