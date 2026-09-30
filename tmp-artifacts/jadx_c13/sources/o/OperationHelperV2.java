package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class OperationHelperV2 extends RecyclerView.OnScrollListener {
    private final LinearLayoutManager IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private final int asInterface;
    private int onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private final onWarmupCompleted onNavigationEvent;
    private int onTransact;
    private int onWarmupCompleted;

    public interface onWarmupCompleted {
        int IAuthTabCallback();

        boolean onNavigationEvent();
    }

    public abstract void onExtraCallback();

    public OperationHelperV2(@NotNull onWarmupCompleted onwarmupcompleted, @NotNull LinearLayoutManager linearLayoutManager) {
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(linearLayoutManager, "");
        this.onNavigationEvent = onwarmupcompleted;
        this.IAuthTabCallback = linearLayoutManager;
        this.onExtraCallbackWithResult = true;
        this.asInterface = 3;
    }

    public final void onNavigationEvent() {
        this.onExtraCallback = 0;
        this.onExtraCallbackWithResult = false;
    }

    public void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onScrolled(recyclerView, i, i2);
        this.IAuthTabCallbackDefault = recyclerView.getChildCount();
        this.onTransact = this.onNavigationEvent.IAuthTabCallback();
        this.onWarmupCompleted = this.IAuthTabCallback.findFirstVisibleItemPosition();
        if (this.onExtraCallbackWithResult && (i3 = this.onTransact) > this.onExtraCallback) {
            this.onExtraCallbackWithResult = false;
            this.onExtraCallback = i3;
        }
        if (this.onExtraCallbackWithResult || !this.onNavigationEvent.onNavigationEvent() || this.onTransact - this.IAuthTabCallbackDefault > this.onWarmupCompleted + this.asInterface) {
            return;
        }
        onExtraCallback();
        this.onExtraCallbackWithResult = true;
    }

    public final void onExtraCallbackWithResult() {
        onExtraCallback();
        this.onExtraCallbackWithResult = true;
    }
}
