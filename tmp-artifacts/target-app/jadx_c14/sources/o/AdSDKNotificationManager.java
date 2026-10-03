package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AdSDKNotificationManager {
    private final float onExtraCallback;
    private final float onExtraCallbackWithResult;
    private final float onNavigationEvent;
    private final float onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSDKNotificationManager)) {
            return false;
        }
        AdSDKNotificationManager adSDKNotificationManager = (AdSDKNotificationManager) obj;
        return Float.compare(this.onExtraCallback, adSDKNotificationManager.onExtraCallback) == 0 && Float.compare(this.onNavigationEvent, adSDKNotificationManager.onNavigationEvent) == 0 && Float.compare(this.onExtraCallbackWithResult, adSDKNotificationManager.onExtraCallbackWithResult) == 0 && Float.compare(this.onWarmupCompleted, adSDKNotificationManager.onWarmupCompleted) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.onExtraCallback) * 31) + Float.hashCode(this.onNavigationEvent)) * 31) + Float.hashCode(this.onExtraCallbackWithResult)) * 31) + Float.hashCode(this.onWarmupCompleted);
    }

    public String toString() {
        return "PullUpWebViewport(top=" + this.onExtraCallback + ", bottom=" + this.onNavigationEvent + ", systemBarsTop=" + this.onExtraCallbackWithResult + ", systemBarsBottom=" + this.onWarmupCompleted + ")";
    }

    public AdSDKNotificationManager(float f, float f2, float f3, float f4) {
        this.onExtraCallback = f;
        this.onNavigationEvent = f2;
        this.onExtraCallbackWithResult = f3;
        this.onWarmupCompleted = f4;
    }

    public final float onExtraCallback() {
        return this.onExtraCallback;
    }

    public final float onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public final float IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    public final float onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public final float onWarmupCompleted() {
        return this.onNavigationEvent - this.onExtraCallback;
    }
}
