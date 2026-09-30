package o;

import android.app.Application;
import android.app.Service;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class isValueChanged implements matchNames<Object> {
    private final Service onNavigationEvent;
    private Object onWarmupCompleted;

    public interface onWarmupCompleted {
        FragmentTransitionSupportExternalSyntheticLambda0 onWarmupCompleted();
    }

    public isValueChanged(Service service) {
        this.onNavigationEvent = service;
    }

    @Override // o.matchNames
    public Object generatedComponent() {
        if (this.onWarmupCompleted == null) {
            this.onWarmupCompleted = IAuthTabCallback();
        }
        return this.onWarmupCompleted;
    }

    private Object IAuthTabCallback() {
        Application application = this.onNavigationEvent.getApplication();
        runAnimator.IAuthTabCallback(application instanceof matchNames, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
        return ((onWarmupCompleted) setSlingshotDistance.onNavigationEvent(application, onWarmupCompleted.class)).onWarmupCompleted().onNavigationEvent(this.onNavigationEvent).IAuthTabCallback();
    }
}
