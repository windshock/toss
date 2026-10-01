package o;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setRotation implements Layer {
    private final Set<setTransitionDuration<?>> onNavigationEvent = Collections.newSetFromMap(new WeakHashMap());

    public void IAuthTabCallback(@NonNull setTransitionDuration<?> settransitionduration) {
        this.onNavigationEvent.add(settransitionduration);
    }

    public void onWarmupCompleted(@NonNull setTransitionDuration<?> settransitionduration) {
        this.onNavigationEvent.remove(settransitionduration);
    }

    @Override // o.Layer
    public void onStart() {
        Iterator it = applyConstraintsFromLayoutParams.IAuthTabCallback(this.onNavigationEvent).iterator();
        while (it.hasNext()) {
            ((setTransitionDuration) it.next()).onStart();
        }
    }

    @Override // o.Layer
    public void onStop() {
        Iterator it = applyConstraintsFromLayoutParams.IAuthTabCallback(this.onNavigationEvent).iterator();
        while (it.hasNext()) {
            ((setTransitionDuration) it.next()).onStop();
        }
    }

    @Override // o.Layer
    public void onDestroy() {
        Iterator it = applyConstraintsFromLayoutParams.IAuthTabCallback(this.onNavigationEvent).iterator();
        while (it.hasNext()) {
            ((setTransitionDuration) it.next()).onDestroy();
        }
    }

    public List<setTransitionDuration<?>> onExtraCallback() {
        return applyConstraintsFromLayoutParams.IAuthTabCallback(this.onNavigationEvent);
    }

    public void onWarmupCompleted() {
        this.onNavigationEvent.clear();
    }
}
