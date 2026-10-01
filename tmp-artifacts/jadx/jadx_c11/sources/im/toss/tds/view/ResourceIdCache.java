package im.toss.tds.view;

import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.setAttachListener;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ResourceIdCache {
    private final setAttachListener<TypedValue> onNavigationEvent = new setAttachListener<>(0, 1, (DefaultConstructorMarker) null);

    public final TypedValue onExtraCallbackWithResult(@NotNull Resources resources, int i) {
        TypedValue typedValue;
        Intrinsics.checkNotNullParameter(resources, "");
        synchronized (this) {
            typedValue = (TypedValue) this.onNavigationEvent.onExtraCallback(i);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                this.onNavigationEvent.IAuthTabCallback(i, typedValue);
            }
        }
        return typedValue;
    }

    public final void onWarmupCompleted() {
        synchronized (this) {
            this.onNavigationEvent.onExtraCallback();
            Unit unit = Unit.INSTANCE;
        }
    }
}
