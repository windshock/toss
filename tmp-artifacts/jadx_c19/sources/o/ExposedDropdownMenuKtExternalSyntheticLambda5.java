package o;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import o.ExposedDropdownMenuKtExternalSyntheticLambda4$onExtraCallback;
import o.FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1;
import o.HorizontalCenterOpticallyKtExternalSyntheticLambda0;
import o.HorizontalCenterOpticallyKtExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ExposedDropdownMenuKtExternalSyntheticLambda5 implements FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.IAuthTabCallback {
    private final HorizontalCenterOpticallyKtExternalSyntheticLambda1 IAuthTabCallbackStub;
    private final HorizontalCenterOpticallyKtExternalSyntheticLambda0 asBinder;
    private final ExposedDropdownMenuKtExternalSyntheticLambda4$onExtraCallback.onWarmupCompleted onExtraCallbackWithResult;
    private final ExposedDropdownMenuKtExternalSyntheticLambda4 onWarmupCompleted;
    private List<WeakReference<RecyclerView>> IAuthTabCallback = new ArrayList();
    private final IdentityHashMap<RecyclerView.ViewHolder, FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1> onNavigationEvent = new IdentityHashMap<>();
    private List<FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1> IAuthTabCallbackDefault = new ArrayList();
    private IAuthTabCallback onExtraCallback = new IAuthTabCallback();

    ExposedDropdownMenuKtExternalSyntheticLambda5(ExposedDropdownMenuKtExternalSyntheticLambda4 exposedDropdownMenuKtExternalSyntheticLambda4, ExposedDropdownMenuKtExternalSyntheticLambda4$onExtraCallback exposedDropdownMenuKtExternalSyntheticLambda4$onExtraCallback) {
        this.onWarmupCompleted = exposedDropdownMenuKtExternalSyntheticLambda4;
        if (exposedDropdownMenuKtExternalSyntheticLambda4$onExtraCallback.onWarmupCompleted) {
            this.asBinder = new HorizontalCenterOpticallyKtExternalSyntheticLambda0.onExtraCallback();
        } else {
            this.asBinder = new HorizontalCenterOpticallyKtExternalSyntheticLambda0.onExtraCallbackWithResult();
        }
        ExposedDropdownMenuKtExternalSyntheticLambda4$onExtraCallback.onWarmupCompleted onwarmupcompleted = exposedDropdownMenuKtExternalSyntheticLambda4$onExtraCallback.onExtraCallbackWithResult;
        this.onExtraCallbackWithResult = onwarmupcompleted;
        if (onwarmupcompleted == ExposedDropdownMenuKtExternalSyntheticLambda4$onExtraCallback.onWarmupCompleted.NO_STABLE_IDS) {
            this.IAuthTabCallbackStub = new HorizontalCenterOpticallyKtExternalSyntheticLambda1.onExtraCallback();
        } else if (onwarmupcompleted == ExposedDropdownMenuKtExternalSyntheticLambda4$onExtraCallback.onWarmupCompleted.ISOLATED_STABLE_IDS) {
            this.IAuthTabCallbackStub = new HorizontalCenterOpticallyKtExternalSyntheticLambda1.onExtraCallbackWithResult();
        } else {
            if (onwarmupcompleted == ExposedDropdownMenuKtExternalSyntheticLambda4$onExtraCallback.onWarmupCompleted.SHARED_STABLE_IDS) {
                this.IAuthTabCallbackStub = new HorizontalCenterOpticallyKtExternalSyntheticLambda1.onWarmupCompleted();
                return;
            }
            throw new IllegalArgumentException("unknown stable id mode");
        }
    }

    private FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 IAuthTabCallback(RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
        int iOnWarmupCompleted = onWarmupCompleted(adapter);
        if (iOnWarmupCompleted == -1) {
            return null;
        }
        return this.IAuthTabCallbackDefault.get(iOnWarmupCompleted);
    }

    private int onWarmupCompleted(RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
        int size = this.IAuthTabCallbackDefault.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.IAuthTabCallbackDefault.get(i2).IAuthTabCallback == adapter) {
                return i2;
            }
        }
        return -1;
    }

    boolean onExtraCallbackWithResult(RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
        return onNavigationEvent(this.IAuthTabCallbackDefault.size(), adapter);
    }

    boolean onNavigationEvent(int i2, RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
        if (i2 < 0 || i2 > this.IAuthTabCallbackDefault.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + this.IAuthTabCallbackDefault.size() + ". Given:" + i2);
        }
        if (IAuthTabCallback()) {
            setCardElevation.onExtraCallback(adapter.hasStableIds(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        } else {
            adapter.hasStableIds();
        }
        if (IAuthTabCallback(adapter) != null) {
            return false;
        }
        FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 = new FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1(adapter, this, this.asBinder, this.IAuthTabCallbackStub.onNavigationEvent());
        this.IAuthTabCallbackDefault.add(i2, floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1);
        Iterator<WeakReference<RecyclerView>> it = this.IAuthTabCallback.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = it.next().get();
            if (recyclerView != null) {
                adapter.onAttachedToRecyclerView(recyclerView);
            }
        }
        if (floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.IAuthTabCallback() > 0) {
            this.onWarmupCompleted.notifyItemRangeInserted(IAuthTabCallback(floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1), floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.IAuthTabCallback());
        }
        onWarmupCompleted();
        return true;
    }

    private int IAuthTabCallback(FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1) {
        FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 next;
        Iterator<FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1> it = this.IAuthTabCallbackDefault.iterator();
        int iIAuthTabCallback = 0;
        while (it.hasNext() && (next = it.next()) != floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1) {
            iIAuthTabCallback += next.IAuthTabCallback();
        }
        return iIAuthTabCallback;
    }

    public long IAuthTabCallback(int i2) {
        IAuthTabCallback iAuthTabCallbackOnNavigationEvent = onNavigationEvent(i2);
        long jIAuthTabCallback = iAuthTabCallbackOnNavigationEvent.onExtraCallback.IAuthTabCallback(iAuthTabCallbackOnNavigationEvent.onExtraCallbackWithResult);
        onWarmupCompleted(iAuthTabCallbackOnNavigationEvent);
        return jIAuthTabCallback;
    }

    @Override // o.FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.IAuthTabCallback
    public void onWarmupCompleted(@NonNull FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1) {
        this.onWarmupCompleted.notifyDataSetChanged();
        onWarmupCompleted();
    }

    @Override // o.FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.IAuthTabCallback
    public void onExtraCallbackWithResult(@NonNull FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1, int i2, int i3, @Nullable Object obj) {
        this.onWarmupCompleted.notifyItemRangeChanged(i2 + IAuthTabCallback(floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1), i3, obj);
    }

    @Override // o.FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.IAuthTabCallback
    public void onExtraCallback(@NonNull FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1, int i2, int i3) {
        this.onWarmupCompleted.notifyItemRangeInserted(i2 + IAuthTabCallback(floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1), i3);
    }

    @Override // o.FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.IAuthTabCallback
    public void onWarmupCompleted(@NonNull FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1, int i2, int i3) {
        this.onWarmupCompleted.notifyItemRangeRemoved(i2 + IAuthTabCallback(floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1), i3);
    }

    @Override // o.FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.IAuthTabCallback
    public void onExtraCallbackWithResult(@NonNull FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1, int i2, int i3) {
        int iIAuthTabCallback = IAuthTabCallback(floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1);
        this.onWarmupCompleted.notifyItemMoved(i2 + iIAuthTabCallback, i3 + iIAuthTabCallback);
    }

    @Override // o.FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.IAuthTabCallback
    public void onExtraCallbackWithResult(FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1) {
        onWarmupCompleted();
    }

    private void onWarmupCompleted() {
        RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicyOnExtraCallback = onExtraCallback();
        if (stateRestorationPolicyOnExtraCallback != this.onWarmupCompleted.getStateRestorationPolicy()) {
            this.onWarmupCompleted.IAuthTabCallback(stateRestorationPolicyOnExtraCallback);
        }
    }

    private RecyclerView.Adapter.StateRestorationPolicy onExtraCallback() {
        for (FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 : this.IAuthTabCallbackDefault) {
            RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy = floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.IAuthTabCallback.getStateRestorationPolicy();
            RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy2 = RecyclerView.Adapter.StateRestorationPolicy.PREVENT;
            if (stateRestorationPolicy == stateRestorationPolicy2 || (stateRestorationPolicy == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY && floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.IAuthTabCallback() == 0)) {
                return stateRestorationPolicy2;
            }
        }
        return RecyclerView.Adapter.StateRestorationPolicy.ALLOW;
    }

    public int onNavigationEvent() {
        Iterator<FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1> it = this.IAuthTabCallbackDefault.iterator();
        int iIAuthTabCallback = 0;
        while (it.hasNext()) {
            iIAuthTabCallback += it.next().IAuthTabCallback();
        }
        return iIAuthTabCallback;
    }

    public int onExtraCallback(int i2) {
        IAuthTabCallback iAuthTabCallbackOnNavigationEvent = onNavigationEvent(i2);
        int iOnWarmupCompleted = iAuthTabCallbackOnNavigationEvent.onExtraCallback.onWarmupCompleted(iAuthTabCallbackOnNavigationEvent.onExtraCallbackWithResult);
        onWarmupCompleted(iAuthTabCallbackOnNavigationEvent);
        return iOnWarmupCompleted;
    }

    public RecyclerView.ViewHolder onExtraCallbackWithResult(ViewGroup viewGroup, int i2) {
        return this.asBinder.onExtraCallbackWithResult(i2).onWarmupCompleted(viewGroup, i2);
    }

    private IAuthTabCallback onNavigationEvent(int i2) {
        IAuthTabCallback iAuthTabCallback = this.onExtraCallback;
        if (iAuthTabCallback.onNavigationEvent) {
            iAuthTabCallback = new IAuthTabCallback();
        } else {
            iAuthTabCallback.onNavigationEvent = true;
        }
        Iterator<FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1> it = this.IAuthTabCallbackDefault.iterator();
        int iIAuthTabCallback = i2;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 next = it.next();
            if (next.IAuthTabCallback() > iIAuthTabCallback) {
                iAuthTabCallback.onExtraCallback = next;
                iAuthTabCallback.onExtraCallbackWithResult = iIAuthTabCallback;
                break;
            }
            iIAuthTabCallback -= next.IAuthTabCallback();
        }
        if (iAuthTabCallback.onExtraCallback != null) {
            return iAuthTabCallback;
        }
        throw new IllegalArgumentException("Cannot find wrapper for " + i2);
    }

    private void onWarmupCompleted(IAuthTabCallback iAuthTabCallback) {
        iAuthTabCallback.onNavigationEvent = false;
        iAuthTabCallback.onExtraCallback = null;
        iAuthTabCallback.onExtraCallbackWithResult = -1;
        this.onExtraCallback = iAuthTabCallback;
    }

    public void onNavigationEvent(RecyclerView.ViewHolder viewHolder, int i2) {
        IAuthTabCallback iAuthTabCallbackOnNavigationEvent = onNavigationEvent(i2);
        this.onNavigationEvent.put(viewHolder, iAuthTabCallbackOnNavigationEvent.onExtraCallback);
        iAuthTabCallbackOnNavigationEvent.onExtraCallback.onExtraCallbackWithResult(viewHolder, iAuthTabCallbackOnNavigationEvent.onExtraCallbackWithResult);
        onWarmupCompleted(iAuthTabCallbackOnNavigationEvent);
    }

    public void onExtraCallback(RecyclerView.ViewHolder viewHolder) {
        onNavigationEvent(viewHolder).IAuthTabCallback.onViewAttachedToWindow(viewHolder);
    }

    public void onExtraCallbackWithResult(RecyclerView.ViewHolder viewHolder) {
        onNavigationEvent(viewHolder).IAuthTabCallback.onViewDetachedFromWindow(viewHolder);
    }

    public void IAuthTabCallback(RecyclerView.ViewHolder viewHolder) {
        FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 = this.onNavigationEvent.get(viewHolder);
        if (floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 == null) {
            throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + this);
        }
        floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.IAuthTabCallback.onViewRecycled(viewHolder);
        this.onNavigationEvent.remove(viewHolder);
    }

    public boolean onWarmupCompleted(RecyclerView.ViewHolder viewHolder) {
        FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 = this.onNavigationEvent.get(viewHolder);
        if (floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 == null) {
            throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + this);
        }
        boolean zOnFailedToRecycleView = floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.IAuthTabCallback.onFailedToRecycleView(viewHolder);
        this.onNavigationEvent.remove(viewHolder);
        return zOnFailedToRecycleView;
    }

    private FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 onNavigationEvent(RecyclerView.ViewHolder viewHolder) {
        FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 = this.onNavigationEvent.get(viewHolder);
        if (floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 != null) {
            return floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1;
        }
        throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + this);
    }

    private boolean IAuthTabCallback(RecyclerView recyclerView) {
        Iterator<WeakReference<RecyclerView>> it = this.IAuthTabCallback.iterator();
        while (it.hasNext()) {
            if (it.next().get() == recyclerView) {
                return true;
            }
        }
        return false;
    }

    public void onExtraCallbackWithResult(RecyclerView recyclerView) {
        if (IAuthTabCallback(recyclerView)) {
            return;
        }
        this.IAuthTabCallback.add(new WeakReference<>(recyclerView));
        Iterator<FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1> it = this.IAuthTabCallbackDefault.iterator();
        while (it.hasNext()) {
            it.next().IAuthTabCallback.onAttachedToRecyclerView(recyclerView);
        }
    }

    public void onNavigationEvent(RecyclerView recyclerView) {
        int size = this.IAuthTabCallback.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference<RecyclerView> weakReference = this.IAuthTabCallback.get(size);
            if (weakReference.get() == null) {
                this.IAuthTabCallback.remove(size);
            } else if (weakReference.get() == recyclerView) {
                this.IAuthTabCallback.remove(size);
                break;
            }
            size--;
        }
        Iterator<FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1> it = this.IAuthTabCallbackDefault.iterator();
        while (it.hasNext()) {
            it.next().IAuthTabCallback.onDetachedFromRecyclerView(recyclerView);
        }
    }

    public int onExtraCallbackWithResult(RecyclerView.Adapter<? extends RecyclerView.ViewHolder> adapter, RecyclerView.ViewHolder viewHolder, int i2) {
        FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 = this.onNavigationEvent.get(viewHolder);
        if (floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 == null) {
            return -1;
        }
        int iIAuthTabCallback = i2 - IAuthTabCallback(floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1);
        int itemCount = floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.IAuthTabCallback.getItemCount();
        if (iIAuthTabCallback < 0 || iIAuthTabCallback >= itemCount) {
            throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + iIAuthTabCallback + " which is out of bounds for the adapter with size " + itemCount + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + viewHolder + "adapter:" + adapter);
        }
        return floatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1.IAuthTabCallback.findRelativeAdapterPositionIn(adapter, viewHolder, iIAuthTabCallback);
    }

    public boolean IAuthTabCallback() {
        return this.onExtraCallbackWithResult != ExposedDropdownMenuKtExternalSyntheticLambda4$onExtraCallback.onWarmupCompleted.NO_STABLE_IDS;
    }

    static class IAuthTabCallback {
        FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda1 onExtraCallback;
        int onExtraCallbackWithResult;
        boolean onNavigationEvent;

        IAuthTabCallback() {
        }
    }
}
