package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import o.getRunningAnimators;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class captureHierarchy implements matchNames<Object> {
    private final Fragment IAuthTabCallback;
    private volatile Object onNavigationEvent;
    private final Object onWarmupCompleted = new Object();

    public interface IAuthTabCallback {
        nativeTraceEventEnd onExtraCallback();
    }

    public captureHierarchy(Fragment fragment) {
        this.IAuthTabCallback = fragment;
    }

    @Override // o.matchNames
    public Object generatedComponent() {
        if (this.onNavigationEvent == null) {
            synchronized (this.onWarmupCompleted) {
                if (this.onNavigationEvent == null) {
                    this.onNavigationEvent = onWarmupCompleted();
                }
            }
        }
        return this.onNavigationEvent;
    }

    private Object onWarmupCompleted() {
        runAnimator.onExtraCallbackWithResult(this.IAuthTabCallback.getHost(), "Hilt Fragments must be attached before creating the component.");
        runAnimator.IAuthTabCallback(this.IAuthTabCallback.getHost() instanceof matchNames, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.IAuthTabCallback.getHost().getClass());
        return ((IAuthTabCallback) setSlingshotDistance.onNavigationEvent(this.IAuthTabCallback.getHost(), IAuthTabCallback.class)).onExtraCallback().IAuthTabCallback(this.IAuthTabCallback).onExtraCallback();
    }

    public static final Context onWarmupCompleted(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static ContextWrapper onWarmupCompleted(Context context, Fragment fragment) {
        return new getRunningAnimators.onNavigationEvent(context, fragment);
    }

    public static ContextWrapper IAuthTabCallback(LayoutInflater layoutInflater, Fragment fragment) {
        return new getRunningAnimators.onNavigationEvent(layoutInflater, fragment);
    }
}
