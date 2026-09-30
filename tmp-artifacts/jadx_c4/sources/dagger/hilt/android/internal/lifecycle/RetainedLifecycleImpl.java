package dagger.hilt.android.internal.lifecycle;

import dagger.hilt.android.lifecycle.RetainedLifecycle;
import java.util.HashSet;
import java.util.Set;
import o.SafeLibLoaderExternalSyntheticLambda0;
import o.StartupTracingInitializer;
import o.setRefreshing;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RetainedLifecycleImpl implements setRefreshing, StartupTracingInitializer {
    private final Set<RetainedLifecycle.OnClearedListener> IAuthTabCallback = new HashSet();
    private boolean onExtraCallback = false;

    public void onExtraCallbackWithResult() {
        SafeLibLoaderExternalSyntheticLambda0.onNavigationEvent();
        this.onExtraCallback = true;
        for (RetainedLifecycle.OnClearedListener onClearedListener : this.IAuthTabCallback) {
        }
    }
}
