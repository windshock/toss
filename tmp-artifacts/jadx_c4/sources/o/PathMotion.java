package o;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import java.util.Map;
import javax.inject.Inject;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PathMotion {

    public interface IAuthTabCallback {
        onExtraCallback IAuthTabCallback();
    }

    public interface onWarmupCompleted {
        onExtraCallback IAuthTabCallback();
    }

    public static ViewModelProvider.onWarmupCompleted onWarmupCompleted(ComponentActivity componentActivity, ViewModelProvider.onWarmupCompleted onwarmupcompleted) {
        return ((IAuthTabCallback) setSlingshotDistance.onNavigationEvent(componentActivity, IAuthTabCallback.class)).IAuthTabCallback().onExtraCallback(componentActivity, onwarmupcompleted);
    }

    public static ViewModelProvider.onWarmupCompleted onNavigationEvent(Fragment fragment, ViewModelProvider.onWarmupCompleted onwarmupcompleted) {
        return ((onWarmupCompleted) setSlingshotDistance.onNavigationEvent(fragment, onWarmupCompleted.class)).IAuthTabCallback().IAuthTabCallback(fragment, onwarmupcompleted);
    }

    public static final class onExtraCallback {
        private final GhostViewHolder onExtraCallback;
        private final Map<Class<?>, Boolean> onExtraCallbackWithResult;

        @Inject
        onExtraCallback(Map<Class<?>, Boolean> map, GhostViewHolder ghostViewHolder) {
            this.onExtraCallbackWithResult = map;
            this.onExtraCallback = ghostViewHolder;
        }

        ViewModelProvider.onWarmupCompleted onExtraCallback(ComponentActivity componentActivity, ViewModelProvider.onWarmupCompleted onwarmupcompleted) {
            return onExtraCallbackWithResult(onwarmupcompleted);
        }

        ViewModelProvider.onWarmupCompleted IAuthTabCallback(Fragment fragment, ViewModelProvider.onWarmupCompleted onwarmupcompleted) {
            return onExtraCallbackWithResult(onwarmupcompleted);
        }

        private ViewModelProvider.onWarmupCompleted onExtraCallbackWithResult(ViewModelProvider.onWarmupCompleted onwarmupcompleted) {
            return new addUnmatched(this.onExtraCallbackWithResult, (ViewModelProvider.onWarmupCompleted) runAnimator.onExtraCallback(onwarmupcompleted), this.onExtraCallback);
        }
    }
}
