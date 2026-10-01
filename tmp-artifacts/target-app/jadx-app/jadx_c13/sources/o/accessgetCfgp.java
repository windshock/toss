package o;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import io.opentelemetry.android.instrumentation.annotations.RumScreenName;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface accessgetCfgp {
    public static final accessgetCfgp onWarmupCompleted = new accessgetCfgp() { // from class: o.accessgetCfgp.3
        @Override // o.accessgetCfgp
        public String IAuthTabCallback(Activity activity) {
            return onNavigationEvent(activity.getClass());
        }

        @Override // o.accessgetCfgp
        public String onExtraCallbackWithResult(Fragment fragment) {
            return onNavigationEvent(fragment.getClass());
        }

        private String onNavigationEvent(Class<?> cls) {
            RumScreenName annotation = cls.getAnnotation(RumScreenName.class);
            return annotation == null ? cls.getSimpleName() : annotation.onExtraCallback();
        }
    };

    String IAuthTabCallback(Activity activity);

    String onExtraCallbackWithResult(Fragment fragment);
}
