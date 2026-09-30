package o;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import dagger.hilt.android.internal.modules.ActivityModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class matchIds implements captureStartValues<FragmentActivity> {
    private final createAnimators<Activity> IAuthTabCallback;

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public FragmentActivity get() {
        return onExtraCallback((Activity) this.IAuthTabCallback.get());
    }

    public static FragmentActivity onExtraCallback(Activity activity) {
        return (FragmentActivity) createAnimator.onNavigationEvent(ActivityModule.onNavigationEvent(activity));
    }
}
