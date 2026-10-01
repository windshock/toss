package com.xwray.groupie;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o.SwipeRefreshLayout;
import o.setAnimationListener;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class NestedGroup implements SwipeRefreshLayout, setAnimationListener {
    private final onExtraCallbackWithResult onNavigationEvent = new onExtraCallbackWithResult();

    public abstract SwipeRefreshLayout getGroup(int i2);

    public abstract int getGroupCount();

    public abstract int getPosition(@NonNull SwipeRefreshLayout swipeRefreshLayout);

    @Override // o.SwipeRefreshLayout
    public int getItemCount() {
        int itemCount = 0;
        for (int i2 = 0; i2 < getGroupCount(); i2++) {
            itemCount += getGroup(i2).getItemCount();
        }
        return itemCount;
    }

    protected int getItemCountBeforeGroup(@NonNull SwipeRefreshLayout swipeRefreshLayout) {
        return getItemCountBeforeGroup(getPosition(swipeRefreshLayout));
    }

    protected int getItemCountBeforeGroup(int i2) {
        int itemCount = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            itemCount += getGroup(i3).getItemCount();
        }
        return itemCount;
    }

    @Override // o.SwipeRefreshLayout
    public Item getItem(int i2) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < getGroupCount()) {
            SwipeRefreshLayout group = getGroup(i3);
            int itemCount = group.getItemCount() + i4;
            if (itemCount > i2) {
                return group.getItem(i2 - i4);
            }
            i3++;
            i4 = itemCount;
        }
        throw new IndexOutOfBoundsException("Wanted item at " + i2 + " but there are only " + getItemCount() + " items");
    }

    @Override // o.SwipeRefreshLayout
    public final int getPosition(@NonNull Item item) {
        int itemCount = 0;
        for (int i2 = 0; i2 < getGroupCount(); i2++) {
            SwipeRefreshLayout group = getGroup(i2);
            int position = group.getPosition(item);
            if (position >= 0) {
                return position + itemCount;
            }
            itemCount += group.getItemCount();
        }
        return -1;
    }

    @Override // o.SwipeRefreshLayout
    public final void registerGroupDataObserver(@NonNull setAnimationListener setanimationlistener) {
        this.onNavigationEvent.onNavigationEvent(setanimationlistener);
    }

    @Override // o.SwipeRefreshLayout
    public void unregisterGroupDataObserver(@NonNull setAnimationListener setanimationlistener) {
        this.onNavigationEvent.onExtraCallback(setanimationlistener);
    }

    public void add(@NonNull SwipeRefreshLayout swipeRefreshLayout) {
        swipeRefreshLayout.registerGroupDataObserver(this);
    }

    public void addAll(@NonNull Collection<? extends SwipeRefreshLayout> collection) {
        Iterator<? extends SwipeRefreshLayout> it = collection.iterator();
        while (it.hasNext()) {
            it.next().registerGroupDataObserver(this);
        }
    }

    public void add(int i2, @NonNull SwipeRefreshLayout swipeRefreshLayout) {
        swipeRefreshLayout.registerGroupDataObserver(this);
    }

    public void addAll(int i2, @NonNull Collection<? extends SwipeRefreshLayout> collection) {
        Iterator<? extends SwipeRefreshLayout> it = collection.iterator();
        while (it.hasNext()) {
            it.next().registerGroupDataObserver(this);
        }
    }

    public void remove(@NonNull SwipeRefreshLayout swipeRefreshLayout) {
        swipeRefreshLayout.unregisterGroupDataObserver(this);
    }

    public void removeAll(@NonNull Collection<? extends SwipeRefreshLayout> collection) {
        Iterator<? extends SwipeRefreshLayout> it = collection.iterator();
        while (it.hasNext()) {
            it.next().unregisterGroupDataObserver(this);
        }
    }

    public void replaceAll(@NonNull Collection<? extends SwipeRefreshLayout> collection) {
        for (int groupCount = getGroupCount() - 1; groupCount >= 0; groupCount--) {
            getGroup(groupCount).unregisterGroupDataObserver(this);
        }
        Iterator<? extends SwipeRefreshLayout> it = collection.iterator();
        while (it.hasNext()) {
            it.next().registerGroupDataObserver(this);
        }
    }

    @Override // o.setAnimationListener
    public void onChanged(@NonNull SwipeRefreshLayout swipeRefreshLayout) {
        this.onNavigationEvent.IAuthTabCallback(this, getItemCountBeforeGroup(swipeRefreshLayout), swipeRefreshLayout.getItemCount());
    }

    @Override // o.setAnimationListener
    public void onItemInserted(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2) {
        this.onNavigationEvent.onWarmupCompleted(this, getItemCountBeforeGroup(swipeRefreshLayout) + i2);
    }

    @Override // o.setAnimationListener
    public void onItemChanged(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2) {
        this.onNavigationEvent.onExtraCallbackWithResult(this, getItemCountBeforeGroup(swipeRefreshLayout) + i2);
    }

    @Override // o.setAnimationListener
    public void onItemChanged(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2, Object obj) {
        this.onNavigationEvent.IAuthTabCallback(this, getItemCountBeforeGroup(swipeRefreshLayout) + i2, obj);
    }

    @Override // o.setAnimationListener
    public void onItemRemoved(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2) {
        this.onNavigationEvent.onExtraCallback(this, getItemCountBeforeGroup(swipeRefreshLayout) + i2);
    }

    @Override // o.setAnimationListener
    public void onItemRangeChanged(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2, int i3) {
        this.onNavigationEvent.IAuthTabCallback(this, getItemCountBeforeGroup(swipeRefreshLayout) + i2, i3);
    }

    @Override // o.setAnimationListener
    public void onItemRangeChanged(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2, int i3, Object obj) {
        this.onNavigationEvent.onNavigationEvent(this, getItemCountBeforeGroup(swipeRefreshLayout) + i2, i3, obj);
    }

    @Override // o.setAnimationListener
    public void onItemRangeInserted(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2, int i3) {
        this.onNavigationEvent.onExtraCallbackWithResult(this, getItemCountBeforeGroup(swipeRefreshLayout) + i2, i3);
    }

    @Override // o.setAnimationListener
    public void onItemRangeRemoved(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2, int i3) {
        this.onNavigationEvent.onNavigationEvent(this, getItemCountBeforeGroup(swipeRefreshLayout) + i2, i3);
    }

    @Override // o.setAnimationListener
    public void onItemMoved(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2, int i3) {
        int itemCountBeforeGroup = getItemCountBeforeGroup(swipeRefreshLayout);
        this.onNavigationEvent.onExtraCallback(this, i2 + itemCountBeforeGroup, itemCountBeforeGroup + i3);
    }

    @Override // o.setAnimationListener
    public void onDataSetInvalidated() {
        this.onNavigationEvent.onWarmupCompleted();
    }

    public void notifyItemRangeInserted(int i2, int i3) {
        this.onNavigationEvent.onExtraCallbackWithResult(this, i2, i3);
    }

    public void notifyItemRangeRemoved(int i2, int i3) {
        this.onNavigationEvent.onNavigationEvent(this, i2, i3);
    }

    public void notifyItemMoved(int i2, int i3) {
        this.onNavigationEvent.onExtraCallback(this, i2, i3);
    }

    public void notifyChanged() {
        this.onNavigationEvent.onWarmupCompleted(this);
    }

    public void notifyItemInserted(int i2) {
        this.onNavigationEvent.onWarmupCompleted(this, i2);
    }

    public void notifyItemChanged(int i2) {
        this.onNavigationEvent.onExtraCallbackWithResult(this, i2);
    }

    public void notifyItemChanged(int i2, @Nullable Object obj) {
        this.onNavigationEvent.IAuthTabCallback(this, i2, obj);
    }

    public void notifyItemRemoved(int i2) {
        this.onNavigationEvent.onExtraCallback(this, i2);
    }

    public void notifyItemRangeChanged(int i2, int i3) {
        this.onNavigationEvent.IAuthTabCallback(this, i2, i3);
    }

    public void notifyItemRangeChanged(int i2, int i3, Object obj) {
        this.onNavigationEvent.onNavigationEvent(this, i2, i3, obj);
    }

    public void notifyDataSetInvalidated() {
        this.onNavigationEvent.onWarmupCompleted();
    }

    static class onExtraCallbackWithResult {
        final List<setAnimationListener> onWarmupCompleted;

        private onExtraCallbackWithResult() {
            this.onWarmupCompleted = new ArrayList();
        }

        void IAuthTabCallback(SwipeRefreshLayout swipeRefreshLayout, int i2, int i3) {
            for (int size = this.onWarmupCompleted.size() - 1; size >= 0; size--) {
                this.onWarmupCompleted.get(size).onItemRangeChanged(swipeRefreshLayout, i2, i3);
            }
        }

        void onNavigationEvent(SwipeRefreshLayout swipeRefreshLayout, int i2, int i3, Object obj) {
            for (int size = this.onWarmupCompleted.size() - 1; size >= 0; size--) {
                this.onWarmupCompleted.get(size).onItemRangeChanged(swipeRefreshLayout, i2, i3, obj);
            }
        }

        void onWarmupCompleted(SwipeRefreshLayout swipeRefreshLayout, int i2) {
            for (int size = this.onWarmupCompleted.size() - 1; size >= 0; size--) {
                this.onWarmupCompleted.get(size).onItemInserted(swipeRefreshLayout, i2);
            }
        }

        void onExtraCallbackWithResult(SwipeRefreshLayout swipeRefreshLayout, int i2) {
            for (int size = this.onWarmupCompleted.size() - 1; size >= 0; size--) {
                this.onWarmupCompleted.get(size).onItemChanged(swipeRefreshLayout, i2);
            }
        }

        void IAuthTabCallback(SwipeRefreshLayout swipeRefreshLayout, int i2, Object obj) {
            for (int size = this.onWarmupCompleted.size() - 1; size >= 0; size--) {
                this.onWarmupCompleted.get(size).onItemChanged(swipeRefreshLayout, i2, obj);
            }
        }

        void onExtraCallback(SwipeRefreshLayout swipeRefreshLayout, int i2) {
            for (int size = this.onWarmupCompleted.size() - 1; size >= 0; size--) {
                this.onWarmupCompleted.get(size).onItemRemoved(swipeRefreshLayout, i2);
            }
        }

        void onExtraCallbackWithResult(SwipeRefreshLayout swipeRefreshLayout, int i2, int i3) {
            for (int size = this.onWarmupCompleted.size() - 1; size >= 0; size--) {
                this.onWarmupCompleted.get(size).onItemRangeInserted(swipeRefreshLayout, i2, i3);
            }
        }

        void onNavigationEvent(SwipeRefreshLayout swipeRefreshLayout, int i2, int i3) {
            for (int size = this.onWarmupCompleted.size() - 1; size >= 0; size--) {
                this.onWarmupCompleted.get(size).onItemRangeRemoved(swipeRefreshLayout, i2, i3);
            }
        }

        void onExtraCallback(SwipeRefreshLayout swipeRefreshLayout, int i2, int i3) {
            for (int size = this.onWarmupCompleted.size() - 1; size >= 0; size--) {
                this.onWarmupCompleted.get(size).onItemMoved(swipeRefreshLayout, i2, i3);
            }
        }

        void onWarmupCompleted(SwipeRefreshLayout swipeRefreshLayout) {
            for (int size = this.onWarmupCompleted.size() - 1; size >= 0; size--) {
                this.onWarmupCompleted.get(size).onChanged(swipeRefreshLayout);
            }
        }

        void onNavigationEvent(setAnimationListener setanimationlistener) {
            synchronized (this.onWarmupCompleted) {
                if (this.onWarmupCompleted.contains(setanimationlistener)) {
                    throw new IllegalStateException("Observer " + setanimationlistener + " is already registered.");
                }
                this.onWarmupCompleted.add(setanimationlistener);
            }
        }

        void onExtraCallback(setAnimationListener setanimationlistener) {
            synchronized (this.onWarmupCompleted) {
                this.onWarmupCompleted.remove(this.onWarmupCompleted.indexOf(setanimationlistener));
            }
        }

        void onWarmupCompleted() {
            for (int size = this.onWarmupCompleted.size() - 1; size >= 0; size--) {
                this.onWarmupCompleted.get(size).onDataSetInvalidated();
            }
        }
    }
}
