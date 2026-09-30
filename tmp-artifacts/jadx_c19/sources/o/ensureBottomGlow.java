package o;

import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class ensureBottomGlow implements dispatchNestedPreScroll {
    protected abstract void onNavigationEvent(@NonNull dispatchNestedFling dispatchnestedfling);

    @Override // o.dispatchNestedPreScroll
    public final void onNavigationEvent(@NonNull dispatchNestedFling dispatchnestedfling, int i2) {
        if (i2 == Integer.MAX_VALUE) {
            onNavigationEvent(dispatchnestedfling);
        }
    }
}
