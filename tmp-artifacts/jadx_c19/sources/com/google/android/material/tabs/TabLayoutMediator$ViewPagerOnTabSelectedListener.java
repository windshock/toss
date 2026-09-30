package com.google.android.material.tabs;

import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class TabLayoutMediator$ViewPagerOnTabSelectedListener implements TabLayout.OnTabSelectedListener {
    private final boolean smoothScroll;
    private final ViewPager2 viewPager;

    public void onTabReselected(TabLayout.Tab tab) {
    }

    public void onTabUnselected(TabLayout.Tab tab) {
    }

    TabLayoutMediator$ViewPagerOnTabSelectedListener(ViewPager2 viewPager2, boolean z) {
        this.viewPager = viewPager2;
        this.smoothScroll = z;
    }

    public void onTabSelected(@NonNull TabLayout.Tab tab) {
        this.viewPager.setCurrentItem(tab.getPosition(), this.smoothScroll);
    }
}
