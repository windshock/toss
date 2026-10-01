package o;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setHorizontalStyle implements setVerticalStyle {
    private final Set<Layer> IAuthTabCallback = Collections.newSetFromMap(new WeakHashMap());
    private boolean onExtraCallbackWithResult;
    private boolean onWarmupCompleted;

    @Override // o.setVerticalStyle
    public void onNavigationEvent(@NonNull Layer layer) {
        this.IAuthTabCallback.add(layer);
        if (this.onWarmupCompleted) {
            layer.onDestroy();
        } else if (this.onExtraCallbackWithResult) {
            layer.onStart();
        } else {
            layer.onStop();
        }
    }

    @Override // o.setVerticalStyle
    public void onExtraCallbackWithResult(@NonNull Layer layer) {
        this.IAuthTabCallback.remove(layer);
    }

    public void onExtraCallback() {
        this.onExtraCallbackWithResult = true;
        Iterator it = applyConstraintsFromLayoutParams.IAuthTabCallback(this.IAuthTabCallback).iterator();
        while (it.hasNext()) {
            ((Layer) it.next()).onStart();
        }
    }

    public void onExtraCallbackWithResult() {
        this.onExtraCallbackWithResult = false;
        Iterator it = applyConstraintsFromLayoutParams.IAuthTabCallback(this.IAuthTabCallback).iterator();
        while (it.hasNext()) {
            ((Layer) it.next()).onStop();
        }
    }

    public void onWarmupCompleted() {
        this.onWarmupCompleted = true;
        Iterator it = applyConstraintsFromLayoutParams.IAuthTabCallback(this.IAuthTabCallback).iterator();
        while (it.hasNext()) {
            ((Layer) it.next()).onDestroy();
        }
    }
}
