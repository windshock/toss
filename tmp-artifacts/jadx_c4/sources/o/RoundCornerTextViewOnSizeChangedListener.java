package o;

import android.net.Network;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RoundCornerTextViewOnSizeChangedListener implements TextRoundCornerProgressBar {
    private final Network IAuthTabCallback;

    public RoundCornerTextViewOnSizeChangedListener(@NotNull Network network) {
        Intrinsics.checkNotNullParameter(network, "");
        this.IAuthTabCallback = network;
    }
}
