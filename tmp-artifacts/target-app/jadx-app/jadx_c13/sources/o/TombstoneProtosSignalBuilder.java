package o;

import java.util.Timer;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TombstoneProtosSignalBuilder {
    public static final Timer onWarmupCompleted(@Nullable String str, boolean z) {
        return str == null ? new Timer(z) : new Timer(str, z);
    }
}
