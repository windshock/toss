package dagger.hilt.android.internal.modules;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import dagger.Reusable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class ActivityModule {
    abstract Context onExtraCallback(Activity activity);

    @Reusable
    public static FragmentActivity onNavigationEvent(Activity activity) {
        try {
            return (FragmentActivity) activity;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Expected activity to be a FragmentActivity: " + activity, e);
        }
    }
}
