package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;
import java.util.Collection;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class FrameworkSQLiteOpenHelperOpenHelperExternalSyntheticLambda0 {
    private final onNavigationEvent IAuthTabCallback;
    private int onNavigationEvent;
    private Collection<? extends SwipeRefreshLayout> onWarmupCompleted;

    public interface onNavigationEvent extends ExposedDropdownMenuKtExposedDropdownMenuBoxscope11ExternalSyntheticLambda0 {
        void onNavigationEvent(@NonNull Collection<? extends SwipeRefreshLayout> collection);
    }

    public FrameworkSQLiteOpenHelperOpenHelperExternalSyntheticLambda0(@NonNull onNavigationEvent onnavigationevent) {
        this.IAuthTabCallback = onnavigationevent;
    }

    onNavigationEvent onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    Collection<? extends SwipeRefreshLayout> onExtraCallback() {
        return this.onWarmupCompleted;
    }

    int IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    public void onExtraCallbackWithResult(@NonNull Collection<? extends SwipeRefreshLayout> collection, @NonNull DiffUtil.Callback callback, @Nullable setLegacyRequestDisallowInterceptTouchEventEnabled setlegacyrequestdisallowintercepttoucheventenabled, boolean z) {
        this.onWarmupCompleted = collection;
        int i2 = this.onNavigationEvent + 1;
        this.onNavigationEvent = i2;
        new finishSpinner(this, callback, i2, z, setlegacyrequestdisallowintercepttoucheventenabled).execute(new Void[0]);
    }
}
