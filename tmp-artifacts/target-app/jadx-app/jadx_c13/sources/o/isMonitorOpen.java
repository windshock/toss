package o;

import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface isMonitorOpen {
    void onExtraCallbackWithResult(@NonNull Runnable runnable);

    void onNavigationEvent(@NonNull Runnable runnable, long j);

    void onWarmupCompleted(@NonNull Runnable runnable);
}
