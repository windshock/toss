package o;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class NestfputmMountNotificationScheduled extends readBomAsCharset {
    private final int onNavigationEvent;

    public NestfputmMountNotificationScheduled(int i) {
        super("이미지 프리뷰");
        this.onNavigationEvent = i;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof NestfputmMountNotificationScheduled)) {
            return false;
        }
        NestfputmMountNotificationScheduled nestfputmMountNotificationScheduled = (NestfputmMountNotificationScheduled) obj;
        return nestfputmMountNotificationScheduled.onNavigationEvent == this.onNavigationEvent && Intrinsics.areEqual(nestfputmMountNotificationScheduled.onWarmupCompleted(), onWarmupCompleted());
    }

    public int hashCode() {
        return Objects.hash(onWarmupCompleted(), Integer.valueOf(this.onNavigationEvent));
    }
}
