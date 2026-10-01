package o;

import android.view.View;
import mozilla.components.support.base.feature.LifecycleAwareFeature;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ApmHelperycx<T extends LifecycleAwareFeature> implements View.OnAttachStateChangeListener {
    private final getOnceLogCount<T> onExtraCallback;

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@Nullable View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@Nullable View view) {
        this.onExtraCallback.onNavigationEvent();
    }
}
