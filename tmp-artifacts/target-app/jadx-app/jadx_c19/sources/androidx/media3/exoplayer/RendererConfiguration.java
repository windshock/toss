package androidx.media3.exoplayer;

import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RendererConfiguration {
    public static final RendererConfiguration onExtraCallbackWithResult = new RendererConfiguration(0, false);
    public final int onNavigationEvent;
    public final boolean onWarmupCompleted;

    public RendererConfiguration(int i2, boolean z) {
        this.onNavigationEvent = i2;
        this.onWarmupCompleted = z;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RendererConfiguration.class != obj.getClass()) {
            return false;
        }
        RendererConfiguration rendererConfiguration = (RendererConfiguration) obj;
        return this.onNavigationEvent == rendererConfiguration.onNavigationEvent && this.onWarmupCompleted == rendererConfiguration.onWarmupCompleted;
    }

    public int hashCode() {
        return (this.onNavigationEvent << 1) + (this.onWarmupCompleted ? 1 : 0);
    }
}
