package o;

import android.content.Context;
import dagger.hilt.android.internal.modules.ApplicationContextModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class notifyFromTransition implements captureStartValues<Context> {
    private final ApplicationContextModule onWarmupCompleted;

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return onNavigationEvent(this.onWarmupCompleted);
    }

    public static Context onNavigationEvent(ApplicationContextModule applicationContextModule) {
        return (Context) createAnimator.onNavigationEvent(applicationContextModule.onExtraCallback());
    }
}
