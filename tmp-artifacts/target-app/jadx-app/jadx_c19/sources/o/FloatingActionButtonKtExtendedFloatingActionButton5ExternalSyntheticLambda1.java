package o;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import o.HorizontalCenterOpticallyKtExternalSyntheticLambda0;
import o.HorizontalCenterOpticallyKtExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 {
    public final RecyclerView.Adapter<RecyclerView.ViewHolder> IAuthTabCallback;
    private final HorizontalCenterOpticallyKtExternalSyntheticLambda0.onWarmupCompleted asInterface;
    private RecyclerView.AdapterDataObserver onExtraCallback = new RecyclerView.AdapterDataObserver() { // from class: o.FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.5
        public void onChanged() {
            FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 = FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.this;
            floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.onWarmupCompleted = floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.IAuthTabCallback.getItemCount();
            FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda12 = FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.this;
            floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda12.onExtraCallbackWithResult.onWarmupCompleted(floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda12);
        }

        public void onItemRangeChanged(int i2, int i3) {
            FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 = FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.this;
            floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.onExtraCallbackWithResult.onExtraCallbackWithResult(floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1, i2, i3, null);
        }

        public void onItemRangeChanged(int i2, int i3, @Nullable Object obj) {
            FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 = FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.this;
            floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.onExtraCallbackWithResult.onExtraCallbackWithResult(floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1, i2, i3, obj);
        }

        public void onItemRangeInserted(int i2, int i3) {
            FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 = FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.this;
            floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.onWarmupCompleted += i3;
            floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.onExtraCallbackWithResult.onExtraCallback(floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1, i2, i3);
            FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda12 = FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.this;
            if (floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda12.onWarmupCompleted <= 0 || floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda12.IAuthTabCallback.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                return;
            }
            FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda13 = FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.this;
            floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda13.onExtraCallbackWithResult.onExtraCallbackWithResult(floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda13);
        }

        public void onItemRangeRemoved(int i2, int i3) {
            FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 = FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.this;
            floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.onWarmupCompleted -= i3;
            floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.onExtraCallbackWithResult.onWarmupCompleted(floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1, i2, i3);
            FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda12 = FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.this;
            if (floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda12.onWarmupCompleted > 0 || floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda12.IAuthTabCallback.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                return;
            }
            FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda13 = FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.this;
            floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda13.onExtraCallbackWithResult.onExtraCallbackWithResult(floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda13);
        }

        public void onItemRangeMoved(int i2, int i3, int i4) {
            setCardElevation.onExtraCallback(i4 == 1, "moving more than 1 item is not supported in RecyclerView");
            FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 = FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.this;
            floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.onExtraCallbackWithResult.onExtraCallbackWithResult(floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1, i2, i3);
        }

        public void onStateRestorationPolicyChanged() {
            FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 = FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.this;
            floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.onExtraCallbackWithResult.onExtraCallbackWithResult(floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1);
        }
    };
    final IAuthTabCallback onExtraCallbackWithResult;
    private final HorizontalCenterOpticallyKtExternalSyntheticLambda1.IAuthTabCallback onNavigationEvent;
    int onWarmupCompleted;

    interface IAuthTabCallback {
        void onExtraCallback(@NonNull FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1, int i2, int i3);

        void onExtraCallbackWithResult(FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1);

        void onExtraCallbackWithResult(@NonNull FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1, int i2, int i3);

        void onExtraCallbackWithResult(@NonNull FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1, int i2, int i3, @Nullable Object obj);

        void onWarmupCompleted(@NonNull FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1);

        void onWarmupCompleted(@NonNull FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1, int i2, int i3);
    }

    FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1(RecyclerView.Adapter<RecyclerView.ViewHolder> adapter, IAuthTabCallback iAuthTabCallback, HorizontalCenterOpticallyKtExternalSyntheticLambda0 horizontalCenterOpticallyKtExternalSyntheticLambda0, HorizontalCenterOpticallyKtExternalSyntheticLambda1.IAuthTabCallback iAuthTabCallback2) {
        this.IAuthTabCallback = adapter;
        this.onExtraCallbackWithResult = iAuthTabCallback;
        this.asInterface = horizontalCenterOpticallyKtExternalSyntheticLambda0.onWarmupCompleted(this);
        this.onNavigationEvent = iAuthTabCallback2;
        this.onWarmupCompleted = adapter.getItemCount();
        adapter.registerAdapterDataObserver(this.onExtraCallback);
    }

    int IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    int onWarmupCompleted(int i2) {
        return this.asInterface.IAuthTabCallback(this.IAuthTabCallback.getItemViewType(i2));
    }

    RecyclerView.ViewHolder onWarmupCompleted(ViewGroup viewGroup, int i2) {
        return this.IAuthTabCallback.onCreateViewHolder(viewGroup, this.asInterface.onWarmupCompleted(i2));
    }

    void onExtraCallbackWithResult(RecyclerView.ViewHolder viewHolder, int i2) {
        this.IAuthTabCallback.bindViewHolder(viewHolder, i2);
    }

    public long IAuthTabCallback(int i2) {
        return this.onNavigationEvent.onNavigationEvent(this.IAuthTabCallback.getItemId(i2));
    }
}
