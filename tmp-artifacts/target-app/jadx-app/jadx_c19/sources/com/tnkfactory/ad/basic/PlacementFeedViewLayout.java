package com.tnkfactory.ad.basic;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.tnkfactory.ad.PlacementEventListener;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.basic.PlacementFeedViewLayout$;
import com.tnkfactory.ad.off.data.PlacementPubInfo;
import com.tnkfactory.ad.style.ITnkOffAdItem;
import com.xwray.groupie.GroupieAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class PlacementFeedViewLayout extends PlacementViewLayout {
    public final Activity f;
    public List g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacementFeedViewLayout(@NotNull Activity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "");
        this.f = activity;
        this.g = CollectionsKt.emptyList();
    }

    public static final void a(PlacementFeedViewLayout placementFeedViewLayout, View view) {
        PlacementEventListener placementEventListener = placementFeedViewLayout.getPlacementEventListener();
        if (placementEventListener != null) {
            placementEventListener.didMoreLinkClicked();
        }
    }

    public final Activity getActivity() {
        return this.f;
    }

    public final List<ITnkOffAdItem> getAdListViewItem() {
        return this.g;
    }

    @Override // com.tnkfactory.ad.basic.PlacementViewLayout
    public ViewGroup initView(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        View viewInflate = LayoutInflater.from(this.f).inflate(R.layout.com_tnk_ad_placement_feed_layout, viewGroup, true);
        Intrinsics.checkNotNull(viewInflate, "");
        ViewGroup viewGroup2 = (ViewGroup) viewInflate;
        View viewFindViewById = viewGroup2.findViewById(R.id.tnk_placement_view_tv_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = viewGroup2.findViewById(R.id.com_tnk_offerwall_more);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        TextView textView2 = (TextView) viewFindViewById2;
        ViewPager2 viewPager2FindViewById = viewGroup2.findViewById(R.id.com_tnk_off_vp_popular_list);
        Intrinsics.checkNotNullExpressionValue(viewPager2FindViewById, "");
        ViewPager2 viewPager2 = viewPager2FindViewById;
        PlacementPubInfo pubInfo = getPubInfo();
        textView.setText(pubInfo != null ? pubInfo.getTitle() : null);
        viewPager2.setAdapter(getAdapter());
        PlacementPubInfo pubInfo2 = getPubInfo();
        textView2.setText(pubInfo2 != null ? pubInfo2.getMore_lbl() : null);
        textView2.setOnClickListener(new PlacementFeedViewLayout$.ExternalSyntheticLambda0(this));
        return viewGroup2;
    }

    public final void setAdListViewItem(@NotNull List<? extends ITnkOffAdItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.g = list;
    }

    @Override // com.tnkfactory.ad.basic.PlacementViewLayout
    public void update(@NotNull List<? extends ITnkOffAdItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.g = list;
        int spanCount = getPageRowCount() == 0 ? getSpanCount() : getPageRowCount();
        int size = list.size() / spanCount;
        int i2 = list.size() % spanCount == 0 ? 0 : 1;
        GroupieAdapter adapter = getAdapter();
        IntRange intRangeUntil = RangesKt.until(0, size + i2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        IntIterator it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(new TnkPageHolderItem(this, it.nextInt()));
        }
        adapter.update(arrayList);
    }
}
