package o;

import java.util.ArrayList;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PAGLogoView<T> {
    private final ArrayList<T> onWarmupCompleted;

    public PAGLogoView(int i) {
        this.onWarmupCompleted = new ArrayList<>(i);
    }

    public void onExtraCallback(T t) {
        this.onWarmupCompleted.add(t);
    }

    public T onNavigationEvent() {
        return this.onWarmupCompleted.remove(r0.size() - 1);
    }

    public boolean onExtraCallbackWithResult() {
        return this.onWarmupCompleted.isEmpty();
    }
}
