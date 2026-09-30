package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class logicDisuseCert {
    public static final void onExtraCallbackWithResult(@NotNull logicDisuseCertRr logicdisusecertrr) {
        Intrinsics.checkNotNullParameter(logicdisusecertrr, "");
        if (logicdisusecertrr.onMessageChannelReady()) {
            throw new IllegalStateException((logicdisusecertrr + " is already destroyed").toString());
        }
    }
}
