package com.google.android.material.tabs;

import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class TabLayoutMediator$TabLayoutOnPageChangeCallback extends ViewPager2.OnPageChangeCallback {
    private int previousScrollState;
    private int scrollState;
    private final WeakReference<TabLayout> tabLayoutRef;

    TabLayoutMediator$TabLayoutOnPageChangeCallback(TabLayout tabLayout) {
        this.tabLayoutRef = new WeakReference<>(tabLayout);
        reset();
    }

    public void onPageScrollStateChanged(int i2) {
        this.previousScrollState = this.scrollState;
        this.scrollState = i2;
        TabLayout tabLayout = this.tabLayoutRef.get();
        if (tabLayout != null) {
            tabLayout.updateViewPagerScrollState(this.scrollState);
        }
    }

    public void onPageScrolled(int i2, float f, int i3) {
        TabLayout tabLayout = this.tabLayoutRef.get();
        if (tabLayout != null) {
            int i4 = this.scrollState;
            tabLayout.setScrollPosition(i2, f, i4 != 2 || this.previousScrollState == 1, (i4 == 2 && this.previousScrollState == 0) ? false : true, false);
        }
    }

    public void onPageSelected(int i2) {
        TabLayout tabLayout = this.tabLayoutRef.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i2 || i2 >= tabLayout.getTabCount()) {
            return;
        }
        int i3 = this.scrollState;
        tabLayout.selectTab(tabLayout.getTabAt(i2), i3 == 0 || (i3 == 2 && this.previousScrollState == 0));
    }

    void reset() {
        this.scrollState = 0;
        this.previousScrollState = 0;
    }
}
