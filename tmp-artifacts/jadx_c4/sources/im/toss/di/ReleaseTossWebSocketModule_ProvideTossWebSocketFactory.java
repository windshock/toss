package im.toss.di;

import o.captureStartValues;
import o.clearFeatureFlags;
import o.convertThreadbugsnag_android_core_release;
import o.createAnimator;
import o.createAnimators;
import o.findResAndMsg;
import o.getBreadcrumbs;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ReleaseTossWebSocketModule_ProvideTossWebSocketFactory implements captureStartValues<getBreadcrumbs> {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final createAnimators<clearFeatureFlags> IAuthTabCallback;
    private final createAnimators<findResAndMsg> onExtraCallback;
    private final createAnimators<convertThreadbugsnag_android_core_release> onWarmupCompleted;

    public /* synthetic */ Object get() {
        getBreadcrumbs getbreadcrumbsOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            getbreadcrumbsOnWarmupCompleted = onWarmupCompleted();
            int i3 = 15 / 0;
        } else {
            getbreadcrumbsOnWarmupCompleted = onWarmupCompleted();
        }
        int i4 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return getbreadcrumbsOnWarmupCompleted;
    }

    public getBreadcrumbs onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = this.onExtraCallback.get();
        if (i3 == 0) {
            return onWarmupCompleted((findResAndMsg) obj, (clearFeatureFlags) this.IAuthTabCallback.get(), (convertThreadbugsnag_android_core_release) this.onWarmupCompleted.get());
        }
        onWarmupCompleted((findResAndMsg) obj, (clearFeatureFlags) this.IAuthTabCallback.get(), (convertThreadbugsnag_android_core_release) this.onWarmupCompleted.get());
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static getBreadcrumbs onWarmupCompleted(findResAndMsg findresandmsg, clearFeatureFlags clearfeatureflags, convertThreadbugsnag_android_core_release convertthreadbugsnag_android_core_release) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getBreadcrumbs getbreadcrumbs = (getBreadcrumbs) createAnimator.onNavigationEvent(ReleaseTossWebSocketModule.onNavigationEvent.onExtraCallbackWithResult(findresandmsg, clearfeatureflags, convertthreadbugsnag_android_core_release));
        int i4 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return getbreadcrumbs;
    }
}
