package o;

import android.app.Application;
import dagger.hilt.android.internal.modules.ApplicationContextModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class parseMatchOrder implements captureStartValues<Application> {
    private final ApplicationContextModule onNavigationEvent;

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public Application get() {
        return onExtraCallbackWithResult(this.onNavigationEvent);
    }

    public static Application onExtraCallbackWithResult(ApplicationContextModule applicationContextModule) {
        return (Application) createAnimator.onNavigationEvent(applicationContextModule.onNavigationEvent());
    }
}
