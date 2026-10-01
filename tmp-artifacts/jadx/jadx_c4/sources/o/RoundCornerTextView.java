package o;

import android.net.Network;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RoundCornerTextView implements TextRoundCornerProgressBar {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final Network IAuthTabCallback;

    public RoundCornerTextView(@NotNull Network network) {
        Intrinsics.checkNotNullParameter(network, "");
        this.IAuthTabCallback = network;
    }

    public final Network onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Network network = this.IAuthTabCallback;
        int i5 = i3 + 113;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return network;
        }
        throw null;
    }
}
