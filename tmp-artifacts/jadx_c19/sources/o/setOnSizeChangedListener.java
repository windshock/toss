package o;

import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setOnSizeChangedListener implements TextRoundCornerProgressBar {
    private final Network onExtraCallback;
    private final NetworkCapabilities onWarmupCompleted;

    public setOnSizeChangedListener(@NotNull Network network, @NotNull NetworkCapabilities networkCapabilities) {
        Intrinsics.checkNotNullParameter(network, "");
        Intrinsics.checkNotNullParameter(networkCapabilities, "");
        this.onExtraCallback = network;
        this.onWarmupCompleted = networkCapabilities;
    }
}
