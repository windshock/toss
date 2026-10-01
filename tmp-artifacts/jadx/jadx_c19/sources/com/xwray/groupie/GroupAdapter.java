package com.xwray.groupie;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o.CircleImageView;
import o.FrameworkSQLiteOpenHelperOpenHelperExternalSyntheticLambda0;
import o.SwipeRefreshLayout;
import o.setAnimationListener;
import o.setBackgroundColor;
import o.setColorScheme;
import o.setColorSchemeColors;
import o.setColorSchemeResources;
import o.setLegacyRequestDisallowInterceptTouchEventEnabled;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class GroupAdapter<VH extends setColorSchemeColors> extends RecyclerView.Adapter<VH> implements setAnimationListener {
    private FrameworkSQLiteOpenHelperOpenHelperExternalSyntheticLambda0 IAuthTabCallback;
    private setColorSchemeResources asBinder;
    private setColorScheme onExtraCallbackWithResult;
    private Item onNavigationEvent;
    private final GridLayoutManager.onExtraCallback onTransact;
    private FrameworkSQLiteOpenHelperOpenHelperExternalSyntheticLambda0.onNavigationEvent onWarmupCompleted;
    private final List<SwipeRefreshLayout> onExtraCallback = new ArrayList();
    private int IAuthTabCallbackStub = 1;

    public void onBindViewHolder(@NonNull VH vh, int i2) {
    }

    public GroupAdapter() {
        FrameworkSQLiteOpenHelperOpenHelperExternalSyntheticLambda0.onNavigationEvent onnavigationevent = new FrameworkSQLiteOpenHelperOpenHelperExternalSyntheticLambda0.onNavigationEvent() { // from class: com.xwray.groupie.GroupAdapter.1
            @Override // o.FrameworkSQLiteOpenHelperOpenHelperExternalSyntheticLambda0.onNavigationEvent
            public void onNavigationEvent(@NonNull Collection<? extends SwipeRefreshLayout> collection) {
                GroupAdapter.this.setNewGroups(collection);
            }

            public void onNavigationEvent(int i2, int i3) {
                GroupAdapter.this.notifyItemRangeInserted(i2, i3);
            }

            public void onExtraCallback(int i2, int i3) {
                GroupAdapter.this.notifyItemRangeRemoved(i2, i3);
            }

            public void onExtraCallbackWithResult(int i2, int i3) {
                GroupAdapter.this.notifyItemMoved(i2, i3);
            }

            public void onExtraCallback(int i2, int i3, Object obj) {
                GroupAdapter.this.notifyItemRangeChanged(i2, i3, obj);
            }
        };
        this.onWarmupCompleted = onnavigationevent;
        this.IAuthTabCallback = new FrameworkSQLiteOpenHelperOpenHelperExternalSyntheticLambda0(onnavigationevent);
        this.onTransact = new GridLayoutManager.onExtraCallback() { // from class: com.xwray.groupie.GroupAdapter.5
            public int onExtraCallback(int i2) {
                try {
                    return GroupAdapter.this.getItem(i2).getSpanSize(GroupAdapter.this.IAuthTabCallbackStub, i2);
                } catch (IndexOutOfBoundsException unused) {
                    return GroupAdapter.this.IAuthTabCallbackStub;
                }
            }
        };
    }

    public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i2, @NonNull List list) {
        onBindViewHolder((GroupAdapter<VH>) viewHolder, i2, (List<Object>) list);
    }

    public GridLayoutManager.onExtraCallback getSpanSizeLookup() {
        return this.onTransact;
    }

    public void setSpanCount(int i2) {
        this.IAuthTabCallbackStub = i2;
    }

    public int getSpanCount() {
        return this.IAuthTabCallbackStub;
    }

    public void updateAsync(@NonNull List<? extends SwipeRefreshLayout> list) {
        updateAsync(list, true, null);
    }

    public void updateAsync(@NonNull List<? extends SwipeRefreshLayout> list, @Nullable setLegacyRequestDisallowInterceptTouchEventEnabled setlegacyrequestdisallowintercepttoucheventenabled) {
        updateAsync(list, true, setlegacyrequestdisallowintercepttoucheventenabled);
    }

    public void updateAsync(@NonNull List<? extends SwipeRefreshLayout> list, boolean z, @Nullable setLegacyRequestDisallowInterceptTouchEventEnabled setlegacyrequestdisallowintercepttoucheventenabled) {
        if (this.onExtraCallback.isEmpty()) {
            update(list, z);
        } else {
            this.IAuthTabCallback.onExtraCallbackWithResult(list, new setBackgroundColor(new ArrayList(this.onExtraCallback), list), setlegacyrequestdisallowintercepttoucheventenabled, z);
        }
    }

    public void replaceAll(@NonNull Collection<? extends SwipeRefreshLayout> collection) {
        setNewGroups(collection);
        notifyDataSetChanged();
    }

    public void update(@NonNull Collection<? extends SwipeRefreshLayout> collection) {
        update(collection, true);
    }

    public void update(@NonNull Collection<? extends SwipeRefreshLayout> collection, boolean z) {
        DiffUtil.IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = DiffUtil.onWarmupCompleted(new setBackgroundColor(new ArrayList(this.onExtraCallback), collection), z);
        setNewGroups(collection);
        iAuthTabCallbackOnWarmupCompleted.onExtraCallback(this.onWarmupCompleted);
    }

    public void setOnItemClickListener(@Nullable setColorScheme setcolorscheme) {
        this.onExtraCallbackWithResult = setcolorscheme;
    }

    public void setOnItemLongClickListener(@Nullable setColorSchemeResources setcolorschemeresources) {
        this.asBinder = setcolorschemeresources;
    }

    public VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        Item<VH> itemForViewType = getItemForViewType(i2);
        return (VH) itemForViewType.createViewHolder(layoutInflaterFrom.inflate(itemForViewType.getLayout(), viewGroup, false));
    }

    public void onBindViewHolder(@NonNull VH vh, int i2, @NonNull List<Object> list) {
        getItem(i2).bind(vh, i2, list, this.onExtraCallbackWithResult, this.asBinder);
    }

    public void onViewRecycled(@NonNull VH vh) {
        vh.IAuthTabCallback().unbind(vh);
    }

    public boolean onFailedToRecycleView(@NonNull VH vh) {
        return vh.IAuthTabCallback().isRecyclable();
    }

    public void onViewAttachedToWindow(@NonNull VH vh) {
        super.onViewAttachedToWindow(vh);
        getItem((GroupAdapter<VH>) vh).onViewAttachedToWindow(vh);
    }

    public void onViewDetachedFromWindow(@NonNull VH vh) {
        super.onViewDetachedFromWindow(vh);
        getItem((GroupAdapter<VH>) vh).onViewDetachedFromWindow(vh);
    }

    public int getItemViewType(int i2) {
        Item item = getItem(i2);
        this.onNavigationEvent = item;
        if (item == null) {
            throw new RuntimeException("Invalid position " + i2);
        }
        return item.getViewType();
    }

    public long getItemId(int i2) {
        return getItem(i2).getId();
    }

    public Item getItem(@NonNull VH vh) {
        return vh.IAuthTabCallback();
    }

    public Item getItem(int i2) {
        return CircleImageView.onExtraCallbackWithResult(this.onExtraCallback, i2);
    }

    public int getAdapterPosition(@NonNull Item item) {
        int itemCount = 0;
        for (SwipeRefreshLayout swipeRefreshLayout : this.onExtraCallback) {
            int position = swipeRefreshLayout.getPosition(item);
            if (position >= 0) {
                return position + itemCount;
            }
            itemCount += swipeRefreshLayout.getItemCount();
        }
        return -1;
    }

    public int getAdapterPosition(@NonNull SwipeRefreshLayout swipeRefreshLayout) {
        int iIndexOf = this.onExtraCallback.indexOf(swipeRefreshLayout);
        if (iIndexOf == -1) {
            return -1;
        }
        int itemCount = 0;
        for (int i2 = 0; i2 < iIndexOf; i2++) {
            itemCount += this.onExtraCallback.get(i2).getItemCount();
        }
        return itemCount;
    }

    public int getGroupCount() {
        return this.onExtraCallback.size();
    }

    public int getItemCount() {
        return CircleImageView.onExtraCallbackWithResult(this.onExtraCallback);
    }

    public int getItemCountForGroup(int i2) {
        if (i2 >= this.onExtraCallback.size()) {
            throw new IndexOutOfBoundsException("Requested group index " + i2 + " but there are " + this.onExtraCallback.size() + " groups");
        }
        return this.onExtraCallback.get(i2).getItemCount();
    }

    @Deprecated
    public int getItemCount(int i2) {
        return getItemCountForGroup(i2);
    }

    public void clear() {
        Iterator<SwipeRefreshLayout> it = this.onExtraCallback.iterator();
        while (it.hasNext()) {
            it.next().unregisterGroupDataObserver(this);
        }
        this.onExtraCallback.clear();
        notifyDataSetChanged();
    }

    public void add(@NonNull SwipeRefreshLayout swipeRefreshLayout) {
        if (swipeRefreshLayout == null) {
            throw new RuntimeException("Group cannot be null");
        }
        int itemCount = getItemCount();
        swipeRefreshLayout.registerGroupDataObserver(this);
        this.onExtraCallback.add(swipeRefreshLayout);
        notifyItemRangeInserted(itemCount, swipeRefreshLayout.getItemCount());
    }

    public void addAll(@NonNull Collection<? extends SwipeRefreshLayout> collection) {
        if (collection.contains(null)) {
            throw new RuntimeException("List of groups can't contain null!");
        }
        int itemCount = getItemCount();
        int itemCount2 = 0;
        for (SwipeRefreshLayout swipeRefreshLayout : collection) {
            itemCount2 += swipeRefreshLayout.getItemCount();
            swipeRefreshLayout.registerGroupDataObserver(this);
        }
        this.onExtraCallback.addAll(collection);
        notifyItemRangeInserted(itemCount, itemCount2);
    }

    public void remove(@NonNull SwipeRefreshLayout swipeRefreshLayout) {
        if (swipeRefreshLayout == null) {
            throw new RuntimeException("Group cannot be null");
        }
        remove(this.onExtraCallback.indexOf(swipeRefreshLayout), swipeRefreshLayout);
    }

    public void removeAll(@NonNull Collection<? extends SwipeRefreshLayout> collection) {
        Iterator<? extends SwipeRefreshLayout> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public void removeGroupAtAdapterPosition(int i2) {
        remove(i2, getGroupAtAdapterPosition(i2));
    }

    @Deprecated
    public void removeGroup(int i2) {
        removeGroupAtAdapterPosition(i2);
    }

    private void remove(int i2, @NonNull SwipeRefreshLayout swipeRefreshLayout) {
        int itemCountBeforeGroup = getItemCountBeforeGroup(i2);
        swipeRefreshLayout.unregisterGroupDataObserver(this);
        this.onExtraCallback.remove(i2);
        notifyItemRangeRemoved(itemCountBeforeGroup, swipeRefreshLayout.getItemCount());
    }

    public void add(int i2, @NonNull SwipeRefreshLayout swipeRefreshLayout) {
        if (swipeRefreshLayout == null) {
            throw new RuntimeException("Group cannot be null");
        }
        swipeRefreshLayout.registerGroupDataObserver(this);
        this.onExtraCallback.add(i2, swipeRefreshLayout);
        notifyItemRangeInserted(getItemCountBeforeGroup(i2), swipeRefreshLayout.getItemCount());
    }

    public SwipeRefreshLayout getTopLevelGroup(int i2) {
        return this.onExtraCallback.get(i2);
    }

    public SwipeRefreshLayout getGroupAtAdapterPosition(int i2) {
        int itemCount = 0;
        for (SwipeRefreshLayout swipeRefreshLayout : this.onExtraCallback) {
            if (i2 - itemCount < swipeRefreshLayout.getItemCount()) {
                return swipeRefreshLayout;
            }
            itemCount += swipeRefreshLayout.getItemCount();
        }
        throw new IndexOutOfBoundsException("Requested position " + i2 + " in group adapter but there are only " + itemCount + " items");
    }

    @Deprecated
    public SwipeRefreshLayout getGroup(int i2) {
        return getGroupAtAdapterPosition(i2);
    }

    public SwipeRefreshLayout getGroup(Item item) {
        for (SwipeRefreshLayout swipeRefreshLayout : this.onExtraCallback) {
            if (swipeRefreshLayout.getPosition(item) >= 0) {
                return swipeRefreshLayout;
            }
        }
        throw new IndexOutOfBoundsException("Item is not present in adapter or in any group");
    }

    @Override // o.setAnimationListener
    public void onChanged(@NonNull SwipeRefreshLayout swipeRefreshLayout) {
        notifyItemRangeChanged(getAdapterPosition(swipeRefreshLayout), swipeRefreshLayout.getItemCount());
    }

    @Override // o.setAnimationListener
    public void onItemInserted(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2) {
        notifyItemInserted(getAdapterPosition(swipeRefreshLayout) + i2);
    }

    @Override // o.setAnimationListener
    public void onItemChanged(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2) {
        notifyItemChanged(getAdapterPosition(swipeRefreshLayout) + i2);
    }

    @Override // o.setAnimationListener
    public void onItemChanged(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2, Object obj) {
        notifyItemChanged(getAdapterPosition(swipeRefreshLayout) + i2, obj);
    }

    @Override // o.setAnimationListener
    public void onItemRemoved(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2) {
        notifyItemRemoved(getAdapterPosition(swipeRefreshLayout) + i2);
    }

    @Override // o.setAnimationListener
    public void onItemRangeChanged(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2, int i3) {
        notifyItemRangeChanged(getAdapterPosition(swipeRefreshLayout) + i2, i3);
    }

    @Override // o.setAnimationListener
    public void onItemRangeChanged(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2, int i3, Object obj) {
        notifyItemRangeChanged(getAdapterPosition(swipeRefreshLayout) + i2, i3, obj);
    }

    @Override // o.setAnimationListener
    public void onItemRangeInserted(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2, int i3) {
        notifyItemRangeInserted(getAdapterPosition(swipeRefreshLayout) + i2, i3);
    }

    @Override // o.setAnimationListener
    public void onItemRangeRemoved(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2, int i3) {
        notifyItemRangeRemoved(getAdapterPosition(swipeRefreshLayout) + i2, i3);
    }

    @Override // o.setAnimationListener
    public void onItemMoved(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2, int i3) {
        int adapterPosition = getAdapterPosition(swipeRefreshLayout);
        notifyItemMoved(i2 + adapterPosition, adapterPosition + i3);
    }

    @Override // o.setAnimationListener
    public void onDataSetInvalidated() {
        notifyDataSetChanged();
    }

    private Item<VH> getItemForViewType(int i2) {
        Item item = this.onNavigationEvent;
        if (item != null && item.getViewType() == i2) {
            return this.onNavigationEvent;
        }
        for (int i3 = 0; i3 < getItemCount(); i3++) {
            Item<VH> item2 = getItem(i3);
            if (item2.getViewType() == i2) {
                return item2;
            }
        }
        throw new IllegalStateException("Could not find model for view type: " + i2);
    }

    private int getItemCountBeforeGroup(int i2) {
        int itemCount = 0;
        Iterator<SwipeRefreshLayout> it = this.onExtraCallback.subList(0, i2).iterator();
        while (it.hasNext()) {
            itemCount += it.next().getItemCount();
        }
        return itemCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewGroups(@NonNull Collection<? extends SwipeRefreshLayout> collection) {
        Iterator<SwipeRefreshLayout> it = this.onExtraCallback.iterator();
        while (it.hasNext()) {
            it.next().unregisterGroupDataObserver(this);
        }
        this.onExtraCallback.clear();
        this.onExtraCallback.addAll(collection);
        Iterator<? extends SwipeRefreshLayout> it2 = collection.iterator();
        while (it2.hasNext()) {
            it2.next().registerGroupDataObserver(this);
        }
    }
}
