package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setShowDividerHorizontal {
    public static final void onNavigationEvent(int i) {
        if (i > 0) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i).toString());
    }

    public static final GeckoHubImp onExtraCallback(@NotNull GeckoHubImp geckoHubImp, @Nullable String str) {
        return str != null ? new lv(geckoHubImp, str) : geckoHubImp;
    }
}
