package com.xwray.groupie;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o.CircleImageView;
import o.ExposedDropdownMenuKtExposedDropdownMenuBoxscope11ExternalSyntheticLambda0;
import o.SwipeRefreshLayout;
import o.setBackgroundColor;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class Section extends NestedGroup {
    private final ArrayList<SwipeRefreshLayout> IAuthTabCallback;
    private SwipeRefreshLayout IAuthTabCallbackDefault;
    private boolean asBinder;
    private boolean onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private SwipeRefreshLayout onNavigationEvent;
    private ExposedDropdownMenuKtExposedDropdownMenuBoxscope11ExternalSyntheticLambda0 onTransact;
    private SwipeRefreshLayout onWarmupCompleted;

    public Section() {
        this(null, new ArrayList());
    }

    public Section(@Nullable SwipeRefreshLayout swipeRefreshLayout) {
        this(swipeRefreshLayout, new ArrayList());
    }

    public Section(@NonNull Collection<? extends SwipeRefreshLayout> collection) {
        this(null, collection);
    }

    public Section(@Nullable SwipeRefreshLayout swipeRefreshLayout, @NonNull Collection<? extends SwipeRefreshLayout> collection) {
        this.IAuthTabCallback = new ArrayList<>();
        this.onExtraCallback = false;
        this.onExtraCallbackWithResult = true;
        this.asBinder = false;
        this.onTransact = new ExposedDropdownMenuKtExposedDropdownMenuBoxscope11ExternalSyntheticLambda0() { // from class: com.xwray.groupie.Section.5
            public void onNavigationEvent(int i2, int i3) {
                Section section = Section.this;
                section.notifyItemRangeInserted(section.getHeaderItemCount() + i2, i3);
            }

            public void onExtraCallback(int i2, int i3) {
                Section section = Section.this;
                section.notifyItemRangeRemoved(section.getHeaderItemCount() + i2, i3);
            }

            public void onExtraCallbackWithResult(int i2, int i3) {
                int headerItemCount = Section.this.getHeaderItemCount();
                Section.this.notifyItemMoved(i2 + headerItemCount, headerItemCount + i3);
            }

            public void onExtraCallback(int i2, int i3, Object obj) {
                Section section = Section.this;
                section.notifyItemRangeChanged(section.getHeaderItemCount() + i2, i3, obj);
            }
        };
        this.onNavigationEvent = swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.registerGroupDataObserver(this);
        }
        addAll(collection);
    }

    @Override // com.xwray.groupie.NestedGroup
    public void add(int i2, @NonNull SwipeRefreshLayout swipeRefreshLayout) {
        super.add(i2, swipeRefreshLayout);
        this.IAuthTabCallback.add(i2, swipeRefreshLayout);
        notifyItemRangeInserted(getHeaderItemCount() + CircleImageView.onExtraCallbackWithResult(this.IAuthTabCallback.subList(0, i2)), swipeRefreshLayout.getItemCount());
        refreshEmptyState();
    }

    @Override // com.xwray.groupie.NestedGroup
    public void addAll(@NonNull Collection<? extends SwipeRefreshLayout> collection) {
        if (collection.isEmpty()) {
            return;
        }
        super.addAll(collection);
        int itemCountWithoutFooter = getItemCountWithoutFooter();
        this.IAuthTabCallback.addAll(collection);
        notifyItemRangeInserted(itemCountWithoutFooter, CircleImageView.onExtraCallbackWithResult(collection));
        refreshEmptyState();
    }

    @Override // com.xwray.groupie.NestedGroup
    public void addAll(int i2, @NonNull Collection<? extends SwipeRefreshLayout> collection) {
        if (collection.isEmpty()) {
            return;
        }
        super.addAll(i2, collection);
        this.IAuthTabCallback.addAll(i2, collection);
        notifyItemRangeInserted(getHeaderItemCount() + CircleImageView.onExtraCallbackWithResult(this.IAuthTabCallback.subList(0, i2)), CircleImageView.onExtraCallbackWithResult(collection));
        refreshEmptyState();
    }

    @Override // com.xwray.groupie.NestedGroup
    public void add(@NonNull SwipeRefreshLayout swipeRefreshLayout) {
        super.add(swipeRefreshLayout);
        int itemCountWithoutFooter = getItemCountWithoutFooter();
        this.IAuthTabCallback.add(swipeRefreshLayout);
        notifyItemRangeInserted(itemCountWithoutFooter, swipeRefreshLayout.getItemCount());
        refreshEmptyState();
    }

    @Override // com.xwray.groupie.NestedGroup
    public void remove(@NonNull SwipeRefreshLayout swipeRefreshLayout) {
        super.remove(swipeRefreshLayout);
        int itemCountBeforeGroup = getItemCountBeforeGroup(swipeRefreshLayout);
        this.IAuthTabCallback.remove(swipeRefreshLayout);
        notifyItemRangeRemoved(itemCountBeforeGroup, swipeRefreshLayout.getItemCount());
        refreshEmptyState();
    }

    @Override // com.xwray.groupie.NestedGroup
    public void removeAll(@NonNull Collection<? extends SwipeRefreshLayout> collection) {
        if (collection.isEmpty()) {
            return;
        }
        super.removeAll(collection);
        for (SwipeRefreshLayout swipeRefreshLayout : collection) {
            int itemCountBeforeGroup = getItemCountBeforeGroup(swipeRefreshLayout);
            this.IAuthTabCallback.remove(swipeRefreshLayout);
            notifyItemRangeRemoved(itemCountBeforeGroup, swipeRefreshLayout.getItemCount());
        }
        refreshEmptyState();
    }

    @Override // com.xwray.groupie.NestedGroup
    public void replaceAll(@NonNull Collection<? extends SwipeRefreshLayout> collection) {
        if (collection.isEmpty()) {
            return;
        }
        super.replaceAll(collection);
        this.IAuthTabCallback.clear();
        this.IAuthTabCallback.addAll(collection);
        notifyDataSetInvalidated();
        refreshEmptyState();
    }

    public List<SwipeRefreshLayout> getGroups() {
        return new ArrayList(this.IAuthTabCallback);
    }

    public void clear() {
        if (this.IAuthTabCallback.isEmpty()) {
            return;
        }
        removeAll(new ArrayList(this.IAuthTabCallback));
    }

    public void update(@NonNull Collection<? extends SwipeRefreshLayout> collection) {
        update(collection, true);
    }

    public void update(@NonNull Collection<? extends SwipeRefreshLayout> collection, boolean z) {
        update(collection, DiffUtil.onWarmupCompleted(new setBackgroundColor(new ArrayList(this.IAuthTabCallback), collection), z));
    }

    public void update(@NonNull Collection<? extends SwipeRefreshLayout> collection, DiffUtil.IAuthTabCallback iAuthTabCallback) {
        super.removeAll(this.IAuthTabCallback);
        this.IAuthTabCallback.clear();
        this.IAuthTabCallback.addAll(collection);
        super.addAll(collection);
        iAuthTabCallback.onExtraCallback(this.onTransact);
        refreshEmptyState();
    }

    public void setPlaceholder(@NonNull SwipeRefreshLayout swipeRefreshLayout) {
        if (swipeRefreshLayout == null) {
            throw new NullPointerException("Placeholder can't be null.  Please use removePlaceholder() instead!");
        }
        if (this.IAuthTabCallbackDefault != null) {
            removePlaceholder();
        }
        this.IAuthTabCallbackDefault = swipeRefreshLayout;
        refreshEmptyState();
    }

    public void removePlaceholder() {
        hidePlaceholder();
        this.IAuthTabCallbackDefault = null;
    }

    private void showPlaceholder() {
        if (this.asBinder || this.IAuthTabCallbackDefault == null) {
            return;
        }
        this.asBinder = true;
        notifyItemRangeInserted(getHeaderItemCount(), this.IAuthTabCallbackDefault.getItemCount());
    }

    private void hidePlaceholder() {
        if (!this.asBinder || this.IAuthTabCallbackDefault == null) {
            return;
        }
        this.asBinder = false;
        notifyItemRangeRemoved(getHeaderItemCount(), this.IAuthTabCallbackDefault.getItemCount());
    }

    protected boolean isEmpty() {
        return this.IAuthTabCallback.isEmpty() || CircleImageView.onExtraCallbackWithResult(this.IAuthTabCallback) == 0;
    }

    private void hideDecorations() {
        if (this.onExtraCallbackWithResult || this.asBinder) {
            int headerItemCount = getHeaderItemCount();
            int placeholderItemCount = getPlaceholderItemCount();
            int footerItemCount = getFooterItemCount();
            this.onExtraCallbackWithResult = false;
            this.asBinder = false;
            notifyItemRangeRemoved(0, headerItemCount + placeholderItemCount + footerItemCount);
        }
    }

    protected void refreshEmptyState() {
        if (isEmpty()) {
            if (this.onExtraCallback) {
                hideDecorations();
                return;
            } else {
                showPlaceholder();
                showHeadersAndFooters();
                return;
            }
        }
        hidePlaceholder();
        showHeadersAndFooters();
    }

    private void showHeadersAndFooters() {
        if (this.onExtraCallbackWithResult) {
            return;
        }
        this.onExtraCallbackWithResult = true;
        notifyItemRangeInserted(0, getHeaderItemCount());
        notifyItemRangeInserted(getItemCountWithoutFooter(), getFooterItemCount());
    }

    private int getBodyItemCount() {
        return this.asBinder ? getPlaceholderItemCount() : CircleImageView.onExtraCallbackWithResult(this.IAuthTabCallback);
    }

    private int getItemCountWithoutFooter() {
        return getBodyItemCount() + getHeaderItemCount();
    }

    private int getHeaderCount() {
        return (this.onNavigationEvent == null || !this.onExtraCallbackWithResult) ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getHeaderItemCount() {
        if (getHeaderCount() == 0) {
            return 0;
        }
        return this.onNavigationEvent.getItemCount();
    }

    private int getFooterItemCount() {
        if (getFooterCount() == 0) {
            return 0;
        }
        return this.onWarmupCompleted.getItemCount();
    }

    private int getFooterCount() {
        return (this.onWarmupCompleted == null || !this.onExtraCallbackWithResult) ? 0 : 1;
    }

    private int getPlaceholderCount() {
        return this.asBinder ? 1 : 0;
    }

    @Override // com.xwray.groupie.NestedGroup
    public SwipeRefreshLayout getGroup(int i2) {
        if (isHeaderShown() && i2 == 0) {
            return this.onNavigationEvent;
        }
        int headerCount = i2 - getHeaderCount();
        if (isPlaceholderShown() && headerCount == 0) {
            return this.IAuthTabCallbackDefault;
        }
        int placeholderCount = headerCount - getPlaceholderCount();
        if (placeholderCount == this.IAuthTabCallback.size()) {
            if (isFooterShown()) {
                return this.onWarmupCompleted;
            }
            throw new IndexOutOfBoundsException("Wanted group at position " + placeholderCount + " but there are only " + getGroupCount() + " groups");
        }
        return this.IAuthTabCallback.get(placeholderCount);
    }

    @Override // com.xwray.groupie.NestedGroup
    public int getGroupCount() {
        return getHeaderCount() + getFooterCount() + getPlaceholderCount() + this.IAuthTabCallback.size();
    }

    @Override // com.xwray.groupie.NestedGroup
    public int getPosition(@NonNull SwipeRefreshLayout swipeRefreshLayout) {
        if (isHeaderShown() && swipeRefreshLayout == this.onNavigationEvent) {
            return 0;
        }
        int headerCount = getHeaderCount();
        if (isPlaceholderShown() && swipeRefreshLayout == this.IAuthTabCallbackDefault) {
            return headerCount;
        }
        int placeholderCount = headerCount + getPlaceholderCount();
        int iIndexOf = this.IAuthTabCallback.indexOf(swipeRefreshLayout);
        if (iIndexOf >= 0) {
            return placeholderCount + iIndexOf;
        }
        int size = this.IAuthTabCallback.size();
        if (isFooterShown() && this.onWarmupCompleted == swipeRefreshLayout) {
            return placeholderCount + size;
        }
        return -1;
    }

    private boolean isHeaderShown() {
        return getHeaderCount() > 0;
    }

    private boolean isFooterShown() {
        return getFooterCount() > 0;
    }

    private boolean isPlaceholderShown() {
        return getPlaceholderCount() > 0;
    }

    public void setHeader(@NonNull SwipeRefreshLayout swipeRefreshLayout) {
        if (swipeRefreshLayout == null) {
            throw new NullPointerException("Header can't be null.  Please use removeHeader() instead!");
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.onNavigationEvent;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.unregisterGroupDataObserver(this);
        }
        int headerItemCount = getHeaderItemCount();
        this.onNavigationEvent = swipeRefreshLayout;
        swipeRefreshLayout.registerGroupDataObserver(this);
        notifyHeaderItemsChanged(headerItemCount);
    }

    public void removeHeader() {
        SwipeRefreshLayout swipeRefreshLayout = this.onNavigationEvent;
        if (swipeRefreshLayout == null) {
            return;
        }
        swipeRefreshLayout.unregisterGroupDataObserver(this);
        int headerItemCount = getHeaderItemCount();
        this.onNavigationEvent = null;
        notifyHeaderItemsChanged(headerItemCount);
    }

    private void notifyHeaderItemsChanged(int i2) {
        int headerItemCount = getHeaderItemCount();
        if (i2 > 0) {
            notifyItemRangeRemoved(0, i2);
        }
        if (headerItemCount > 0) {
            notifyItemRangeInserted(0, headerItemCount);
        }
    }

    public void setFooter(@NonNull SwipeRefreshLayout swipeRefreshLayout) {
        if (swipeRefreshLayout == null) {
            throw new NullPointerException("Footer can't be null.  Please use removeFooter() instead!");
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.onWarmupCompleted;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.unregisterGroupDataObserver(this);
        }
        int footerItemCount = getFooterItemCount();
        this.onWarmupCompleted = swipeRefreshLayout;
        swipeRefreshLayout.registerGroupDataObserver(this);
        notifyFooterItemsChanged(footerItemCount);
    }

    public void removeFooter() {
        SwipeRefreshLayout swipeRefreshLayout = this.onWarmupCompleted;
        if (swipeRefreshLayout == null) {
            return;
        }
        swipeRefreshLayout.unregisterGroupDataObserver(this);
        int footerItemCount = getFooterItemCount();
        this.onWarmupCompleted = null;
        notifyFooterItemsChanged(footerItemCount);
    }

    private void notifyFooterItemsChanged(int i2) {
        int footerItemCount = getFooterItemCount();
        if (i2 > 0) {
            notifyItemRangeRemoved(getItemCountWithoutFooter(), i2);
        }
        if (footerItemCount > 0) {
            notifyItemRangeInserted(getItemCountWithoutFooter(), footerItemCount);
        }
    }

    public void setHideWhenEmpty(boolean z) {
        if (this.onExtraCallback == z) {
            return;
        }
        this.onExtraCallback = z;
        refreshEmptyState();
    }

    @Override // com.xwray.groupie.NestedGroup, o.setAnimationListener
    public void onItemInserted(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2) {
        super.onItemInserted(swipeRefreshLayout, i2);
        refreshEmptyState();
    }

    @Override // com.xwray.groupie.NestedGroup, o.setAnimationListener
    public void onItemRemoved(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2) {
        super.onItemRemoved(swipeRefreshLayout, i2);
        refreshEmptyState();
    }

    @Override // com.xwray.groupie.NestedGroup, o.setAnimationListener
    public void onItemRangeInserted(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2, int i3) {
        super.onItemRangeInserted(swipeRefreshLayout, i2, i3);
        refreshEmptyState();
    }

    @Override // com.xwray.groupie.NestedGroup, o.setAnimationListener
    public void onItemRangeRemoved(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2, int i3) {
        super.onItemRangeRemoved(swipeRefreshLayout, i2, i3);
        refreshEmptyState();
    }

    private int getPlaceholderItemCount() {
        SwipeRefreshLayout swipeRefreshLayout;
        if (!this.asBinder || (swipeRefreshLayout = this.IAuthTabCallbackDefault) == null) {
            return 0;
        }
        return swipeRefreshLayout.getItemCount();
    }
}
