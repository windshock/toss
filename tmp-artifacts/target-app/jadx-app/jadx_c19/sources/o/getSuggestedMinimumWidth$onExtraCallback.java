package o;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class getSuggestedMinimumWidth$onExtraCallback {
    private WeakReference<View> onExtraCallback;
    private String onWarmupCompleted;

    public getSuggestedMinimumWidth$onExtraCallback(View view, String str) {
        this.onExtraCallback = new WeakReference<>(view);
        this.onWarmupCompleted = str;
    }

    public View onNavigationEvent() {
        WeakReference<View> weakReference = this.onExtraCallback;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public String onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }
}
