package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class startInterceptRequestLayout {
    private int IAuthTabCallback;
    private int onExtraCallbackWithResult;
    private repositionShadowingViews onNavigationEvent;
    private setItemViewCacheSize onWarmupCompleted;

    public startInterceptRequestLayout(@NotNull repositionShadowingViews repositionshadowingviews, @NotNull setItemViewCacheSize setitemviewcachesize) {
        Intrinsics.checkNotNullParameter(repositionshadowingviews, "");
        Intrinsics.checkNotNullParameter(setitemviewcachesize, "");
        this.onNavigationEvent = repositionshadowingviews;
        this.onWarmupCompleted = setitemviewcachesize;
        this.onExtraCallbackWithResult = -1;
        this.IAuthTabCallback = -1;
    }

    public final int onExtraCallback() {
        int i2 = this.onExtraCallbackWithResult;
        return i2 < 0 ? this.onNavigationEvent.onNavigationEvent(this.onWarmupCompleted, setLayoutFrozen.writeTypedObject()) : i2;
    }

    public final int onNavigationEvent() {
        int i2 = this.IAuthTabCallback;
        return i2 < 0 ? this.onNavigationEvent.onNavigationEvent(this.onWarmupCompleted, setLayoutFrozen.onTransact()) : i2;
    }

    public void onExtraCallbackWithResult() {
        this.onNavigationEvent.IAuthTabCallback(this.onWarmupCompleted);
        this.onWarmupCompleted = setLayoutFrozen.asInterface();
        this.IAuthTabCallback = -1;
        this.onExtraCallbackWithResult = -1;
    }

    public final boolean onWarmupCompleted() {
        return this.onNavigationEvent.onExtraCallback(this.onWarmupCompleted);
    }

    public final void IAuthTabCallback() {
        this.onNavigationEvent.onWarmupCompleted(this.onWarmupCompleted);
    }
}
