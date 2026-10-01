package com.google.android.material.tabs;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class TabLayoutMediator$PagerAdapterObserver extends RecyclerView.AdapterDataObserver {
    final /* synthetic */ TabLayoutMediator this$0;

    TabLayoutMediator$PagerAdapterObserver(TabLayoutMediator tabLayoutMediator) {
        this.this$0 = tabLayoutMediator;
    }

    public void onChanged() {
        this.this$0.populateTabsFromPagerAdapter();
    }

    public void onItemRangeChanged(int i2, int i3) {
        this.this$0.populateTabsFromPagerAdapter();
    }

    public void onItemRangeChanged(int i2, int i3, @Nullable Object obj) {
        this.this$0.populateTabsFromPagerAdapter();
    }

    public void onItemRangeInserted(int i2, int i3) {
        this.this$0.populateTabsFromPagerAdapter();
    }

    public void onItemRangeRemoved(int i2, int i3) {
        this.this$0.populateTabsFromPagerAdapter();
    }

    public void onItemRangeMoved(int i2, int i3, int i4) {
        this.this$0.populateTabsFromPagerAdapter();
    }
}
