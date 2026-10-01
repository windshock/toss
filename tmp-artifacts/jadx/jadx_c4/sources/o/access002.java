package o;

import android.app.Activity;
import android.app.Application;
import androidx.activity.ComponentActivity;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class access002 implements matchNames<Object> {
    private final matchNames<TracingReceiverExternalSyntheticLambda0> onExtraCallback;
    protected final Activity onExtraCallbackWithResult;
    private volatile Object onNavigationEvent;
    private final Object onWarmupCompleted = new Object();

    public interface IAuthTabCallback {
        SafeLibLoaderExternalSyntheticLambda1 onNavigationEvent();
    }

    public access002(Activity activity) {
        this.onExtraCallbackWithResult = activity;
        this.onExtraCallback = new ActivityRetainedComponentManager((ComponentActivity) activity);
    }

    @Override // o.matchNames
    public Object generatedComponent() {
        if (this.onNavigationEvent == null) {
            synchronized (this.onWarmupCompleted) {
                if (this.onNavigationEvent == null) {
                    this.onNavigationEvent = IAuthTabCallback();
                }
            }
        }
        return this.onNavigationEvent;
    }

    public final isValidMatch onWarmupCompleted() {
        return ((ActivityRetainedComponentManager) this.onExtraCallback).onNavigationEvent();
    }

    protected Object IAuthTabCallback() {
        String str;
        if (!(this.onExtraCallbackWithResult.getApplication() instanceof matchNames)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
            if (Application.class.equals(this.onExtraCallbackWithResult.getApplication().getClass())) {
                str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
            } else {
                str = "Found: " + this.onExtraCallbackWithResult.getApplication().getClass();
            }
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
        return ((IAuthTabCallback) setSlingshotDistance.onNavigationEvent(this.onExtraCallback, IAuthTabCallback.class)).onNavigationEvent().onNavigationEvent(this.onExtraCallbackWithResult).onWarmupCompleted();
    }
}
