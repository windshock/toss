package o;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class onTextViewSizeChanged$onExtraCallbackWithResult extends ConnectivityManager.NetworkCallback {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(@NotNull Network network) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(network, "");
        Objects.toString(network);
        onTextViewSizeChanged.onWarmupCompleted(onTextViewSizeChanged.onExtraCallbackWithResult, true, "DNC.onAvailable", network);
        onTextViewSizeChanged.onWarmupCompleted().onExtraCallback(new RoundCornerTextView(network));
        int i2 = onNavigationEvent + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(@NotNull Network network) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(network, "");
        Objects.toString(network);
        onTextViewSizeChanged.onWarmupCompleted(onTextViewSizeChanged.onExtraCallbackWithResult, false, "DNC.onLost", network);
        Object obj = null;
        onTextViewSizeChanged.onWarmupCompleted((alignTextProgressInsideProgress) null);
        onTextViewSizeChanged.onNavigationEvent((Boolean) null);
        onTextViewSizeChanged.onWarmupCompleted().onExtraCallback(new RoundCornerTextViewOnSizeChangedListener(network));
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(@NotNull Network network, @NotNull NetworkCapabilities networkCapabilities) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(network, "");
        Intrinsics.checkNotNullParameter(networkCapabilities, "");
        onTextViewSizeChanged ontextviewsizechanged = onTextViewSizeChanged.onExtraCallbackWithResult;
        onTextViewSizeChanged.onWarmupCompleted(ontextviewsizechanged, networkCapabilities);
        Objects.toString(network);
        Objects.toString(networkCapabilities);
        onTextViewSizeChanged.onWarmupCompleted(onTextViewSizeChanged.onWarmupCompleted(ontextviewsizechanged, networkCapabilities));
        onTextViewSizeChanged.onNavigationEvent(Boolean.valueOf(onTextViewSizeChanged.IAuthTabCallback(ontextviewsizechanged, networkCapabilities)));
        onTextViewSizeChanged.onWarmupCompleted().onExtraCallback(new setOnSizeChangedListener(network, networkCapabilities));
        int i2 = onWarmupCompleted + 125;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 11 / 0;
        }
    }
}
