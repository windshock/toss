package o;

import androidx.recyclerview.widget.DiffUtil;
import java.util.Collection;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setBackgroundColor extends DiffUtil.Callback {
    private final Collection<? extends SwipeRefreshLayout> IAuthTabCallback;
    private final Collection<? extends SwipeRefreshLayout> onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final int onWarmupCompleted;

    public setBackgroundColor(Collection<? extends SwipeRefreshLayout> collection, Collection<? extends SwipeRefreshLayout> collection2) {
        this.onWarmupCompleted = CircleImageView.onExtraCallbackWithResult(collection);
        this.onExtraCallbackWithResult = CircleImageView.onExtraCallbackWithResult(collection2);
        this.IAuthTabCallback = collection;
        this.onExtraCallback = collection2;
    }

    public int getOldListSize() {
        return this.onWarmupCompleted;
    }

    public int getNewListSize() {
        return this.onExtraCallbackWithResult;
    }

    public boolean areItemsTheSame(int i2, int i3) {
        return CircleImageView.onExtraCallbackWithResult(this.onExtraCallback, i3).isSameAs(CircleImageView.onExtraCallbackWithResult(this.IAuthTabCallback, i2));
    }

    public boolean areContentsTheSame(int i2, int i3) {
        return CircleImageView.onExtraCallbackWithResult(this.onExtraCallback, i3).hasSameContentAs(CircleImageView.onExtraCallbackWithResult(this.IAuthTabCallback, i2));
    }

    public Object getChangePayload(int i2, int i3) {
        return CircleImageView.onExtraCallbackWithResult(this.IAuthTabCallback, i2).getChangePayload(CircleImageView.onExtraCallbackWithResult(this.onExtraCallback, i3));
    }
}
