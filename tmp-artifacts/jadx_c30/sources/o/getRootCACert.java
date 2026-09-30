package o;

import java.util.ArrayList;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getRootCACert<T> {
    private final ArrayList<T> onExtraCallback;

    public getRootCACert(int i) {
        this.onExtraCallback = new ArrayList<>(i);
    }

    public void onWarmupCompleted(T t) {
        this.onExtraCallback.add(t);
    }

    public T onWarmupCompleted() {
        return this.onExtraCallback.remove(r0.size() - 1);
    }

    public boolean onNavigationEvent() {
        return this.onExtraCallback.isEmpty();
    }
}
