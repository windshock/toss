package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getSelinuxLabel {
    private Object onNavigationEvent;

    public getSelinuxLabel(@Nullable Object obj) {
        this.onNavigationEvent = obj;
    }

    public final Object onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public final void onWarmupCompleted(@Nullable Object obj) {
        this.onNavigationEvent = obj;
    }
}
