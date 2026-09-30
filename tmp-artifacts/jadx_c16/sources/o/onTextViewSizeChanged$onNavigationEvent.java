package o;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import im.toss.core.network.NetworkMonitor$NetworkHandlerCallback$;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class onTextViewSizeChanged$onNavigationEvent extends ConnectivityManager.NetworkCallback {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final ConnectivityManager.NetworkCallback onExtraCallback;
    private final Handler onNavigationEvent;

    public static /* synthetic */ void IAuthTabCallback(onTextViewSizeChanged$onNavigationEvent ontextviewsizechanged_onnavigationevent, Network network, NetworkCapabilities networkCapabilities) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(ontextviewsizechanged_onnavigationevent, network, networkCapabilities);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(onTextViewSizeChanged$onNavigationEvent ontextviewsizechanged_onnavigationevent, Network network) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(ontextviewsizechanged_onnavigationevent, network);
        int i4 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onWarmupCompleted(onTextViewSizeChanged$onNavigationEvent ontextviewsizechanged_onnavigationevent, Network network) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(ontextviewsizechanged_onnavigationevent, network);
        int i4 = onExtraCallbackWithResult + 19;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public onTextViewSizeChanged$onNavigationEvent(@NotNull Handler handler, @NotNull ConnectivityManager.NetworkCallback networkCallback) {
        Intrinsics.checkNotNullParameter(handler, "");
        Intrinsics.checkNotNullParameter(networkCallback, "");
        this.onNavigationEvent = handler;
        this.onExtraCallback = networkCallback;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(@NotNull Network network) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(network, "");
        this.onNavigationEvent.post(new NetworkMonitor$NetworkHandlerCallback$.ExternalSyntheticLambda1(this, network));
        int i2 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 66 / 0;
        }
    }

    private static final void IAuthTabCallback(onTextViewSizeChanged$onNavigationEvent ontextviewsizechanged_onnavigationevent, Network network) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ontextviewsizechanged_onnavigationevent.onExtraCallback.onAvailable(network);
        int i4 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(@NotNull Network network) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(network, "");
        this.onNavigationEvent.post(new NetworkMonitor$NetworkHandlerCallback$.ExternalSyntheticLambda0(this, network));
        int i2 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 98 / 0;
        }
    }

    private static final void onExtraCallback(onTextViewSizeChanged$onNavigationEvent ontextviewsizechanged_onnavigationevent, Network network) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ontextviewsizechanged_onnavigationevent.onExtraCallback.onLost(network);
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        int i5 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(@NotNull Network network, @NotNull NetworkCapabilities networkCapabilities) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(network, "");
        Intrinsics.checkNotNullParameter(networkCapabilities, "");
        this.onNavigationEvent.post(new NetworkMonitor$NetworkHandlerCallback$.ExternalSyntheticLambda2(this, network, networkCapabilities));
        int i2 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void onWarmupCompleted(onTextViewSizeChanged$onNavigationEvent ontextviewsizechanged_onnavigationevent, Network network, NetworkCapabilities networkCapabilities) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ontextviewsizechanged_onnavigationevent.onExtraCallback.onCapabilitiesChanged(network, networkCapabilities);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
