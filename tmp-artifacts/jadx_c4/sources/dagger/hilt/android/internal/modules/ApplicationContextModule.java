package dagger.hilt.android.internal.modules;

import android.app.Application;
import android.content.Context;
import o.FragmentTransitionSupport;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ApplicationContextModule {
    private final Context onWarmupCompleted;

    public ApplicationContextModule(Context context) {
        this.onWarmupCompleted = context;
    }

    public Context onExtraCallback() {
        return this.onWarmupCompleted;
    }

    public Application onNavigationEvent() {
        return FragmentTransitionSupport.IAuthTabCallback(this.onWarmupCompleted);
    }
}
