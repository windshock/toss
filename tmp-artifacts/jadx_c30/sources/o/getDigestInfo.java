package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getDigestInfo {
    private final int IAuthTabCallback;
    private final int onExtraCallback;
    private final float onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final float onWarmupCompleted;

    public getDigestInfo() {
        this(0.0f, 0.0f, 0, 0, 0, 31, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDigestInfo)) {
            return false;
        }
        getDigestInfo getdigestinfo = (getDigestInfo) obj;
        return Float.compare(this.onExtraCallbackWithResult, getdigestinfo.onExtraCallbackWithResult) == 0 && Float.compare(this.onWarmupCompleted, getdigestinfo.onWarmupCompleted) == 0 && this.onNavigationEvent == getdigestinfo.onNavigationEvent && this.onExtraCallback == getdigestinfo.onExtraCallback && this.IAuthTabCallback == getdigestinfo.IAuthTabCallback;
    }

    public int hashCode() {
        return (((((((Float.hashCode(this.onExtraCallbackWithResult) * 31) + Float.hashCode(this.onWarmupCompleted)) * 31) + Integer.hashCode(this.onNavigationEvent)) * 31) + Integer.hashCode(this.onExtraCallback)) * 31) + Integer.hashCode(this.IAuthTabCallback);
    }

    public String toString() {
        return "GraniteVideoBufferConfigLive(maxPlaybackSpeed=" + this.onExtraCallbackWithResult + ", minPlaybackSpeed=" + this.onWarmupCompleted + ", maxOffsetMs=" + this.onNavigationEvent + ", minOffsetMs=" + this.onExtraCallback + ", targetOffsetMs=" + this.IAuthTabCallback + ")";
    }

    public getDigestInfo(float f, float f2, int i, int i2, int i3) {
        this.onExtraCallbackWithResult = f;
        this.onWarmupCompleted = f2;
        this.onNavigationEvent = i;
        this.onExtraCallback = i2;
        this.IAuthTabCallback = i3;
    }

    public /* synthetic */ getDigestInfo(float f, float f2, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1.0f : f, (i4 & 2) == 0 ? f2 : -1.0f, (i4 & 4) != 0 ? -1 : i, (i4 & 8) != 0 ? -1 : i2, (i4 & 16) != 0 ? -1 : i3);
    }
}
