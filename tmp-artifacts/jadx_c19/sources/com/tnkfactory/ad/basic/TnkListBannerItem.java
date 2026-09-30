package com.tnkfactory.ad.basic;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.bumptech.glide.Glide;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkAdListModel;
import com.tnkfactory.ad.TnkContext;
import com.tnkfactory.ad.basic.TnkBasicCurationTypeSuggest;
import com.tnkfactory.ad.basic.TnkListBannerItem;
import com.tnkfactory.ad.off.data.AdActionInfoVo;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.rwd.BannerItem;
import com.tnkfactory.ad.style.DpUtil;
import com.xwray.groupie.GroupieAdapter;
import com.xwray.groupie.Item;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkListBannerItem extends ITnkSection {
    public final List a;
    public final TnkAdListModel b;
    public final TnkContext c;
    public final Function1 d;
    public final ArrayList e;
    public boolean f;

    public static final class CustomAdapter extends GroupieAdapter {
        @Override // com.xwray.groupie.GroupAdapter
        public Item<?> getItem(int i2) {
            Item<?> item = super.getItem(super.getItemCount() != 0 ? i2 % super.getItemCount() : 0);
            Intrinsics.checkNotNullExpressionValue(item, "");
            return item;
        }

        @Override // com.xwray.groupie.GroupAdapter
        public int getItemCount() {
            if (super.getItemCount() == 0) {
                return 0;
            }
            return Integer.MAX_VALUE - super.getItemCount();
        }
    }

    public final class HorizontalHolder extends Item<setColorSchemeColors> {
        public final CustomAdapter a = new CustomAdapter();
        public int b;

        public final class AdListItem extends Item<setColorSchemeColors> {
            public final BannerItem a;
            public final /* synthetic */ HorizontalHolder b;

            public AdListItem(@NotNull HorizontalHolder horizontalHolder, BannerItem bannerItem) {
                Intrinsics.checkNotNullParameter(bannerItem, "");
                this.b = horizontalHolder;
                this.a = bannerItem;
            }

            public static final void a(TnkListBannerItem tnkListBannerItem, AdListItem adListItem, View view) {
                tnkListBannerItem.getOnItemClick().invoke(adListItem.a);
            }

            @Override // com.xwray.groupie.Item
            public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
                Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
                View view = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent;
                final TnkListBannerItem tnkListBannerItem = TnkListBannerItem.this;
                View viewFindViewById = view.findViewById(R.id.com_tnk_off_item_icon);
                ImageView imageView = viewFindViewById instanceof ImageView ? (ImageView) viewFindViewById : null;
                if (imageView != null) {
                    Glide.onExtraCallbackWithResult(view).onExtraCallbackWithResult(this.a.getImg_url()).onExtraCallback(imageView);
                    view.setVisibility(0);
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkListBannerItem$HorizontalHolder$AdListItem$$ExternalSyntheticLambda0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            TnkListBannerItem.HorizontalHolder.AdListItem.a(tnkListBannerItem, this, view2);
                        }
                    });
                }
            }

            public final BannerItem getBannerItem() {
                return this.a;
            }

            @Override // com.xwray.groupie.Item
            public int getLayout() {
                return R.layout.com_tnk_offerwall_list_banner_;
            }
        }

        public HorizontalHolder() {
            ArrayList<AdListItem> arrBannerItem = TnkListBannerItem.this.getArrBannerItem();
            List<BannerItem> arrBanner = TnkListBannerItem.this.getArrBanner();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrBanner, 10));
            Iterator<T> it = arrBanner.iterator();
            while (it.hasNext()) {
                arrayList.add(new AdListItem(this, (BannerItem) it.next()));
            }
            arrBannerItem.addAll(arrayList);
            this.a.addAll(TnkListBannerItem.this.getArrBannerItem());
            this.b = TnkListBannerItem.this.getArrBannerItem().size();
        }

        @Override // com.xwray.groupie.Item
        public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
            Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
            View view = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(view, "");
            ViewPager2 viewPager2FindViewById = view.findViewById(R.id.com_tnk_off_rv_banner);
            Intrinsics.checkNotNullExpressionValue(viewPager2FindViewById, "");
            ViewPager2 viewPager2 = viewPager2FindViewById;
            View viewFindViewById = view.findViewById(R.id.com_tnk_off_page_idx);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            final TextView textView = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.com_tnk_off_page_cnt);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            TextView textView2 = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.com_tnk_off_banner_indicator);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            LinearLayout linearLayout = (LinearLayout) viewFindViewById3;
            if (this.b != TnkListBannerItem.this.getArrBannerItem().size()) {
                this.b = TnkListBannerItem.this.getArrBannerItem().size();
                this.a.clear();
                this.a.update(TnkListBannerItem.this.getArrBannerItem());
                TnkListBannerItem.this.setFirst(true);
            }
            if (TnkListBannerItem.this.getFirst()) {
                viewPager2.setAdapter(this.a);
                TnkListBannerItem.this.setFirst(false);
                viewPager2.setPageTransformer(new TnkBasicCurationTypeSuggest.ZoomOutPageTransformer());
            }
            viewPager2.setUserInputEnabled(TnkListBannerItem.this.getArrBannerItem().size() > 1);
            linearLayout.setVisibility(TnkListBannerItem.this.getArrBannerItem().size() <= 1 ? 8 : 0);
            if (TnkListBannerItem.this.getArrBannerItem().size() > 1) {
                textView2.setText(" / " + TnkListBannerItem.this.getArrBannerItem().size());
                final TnkListBannerItem tnkListBannerItem = TnkListBannerItem.this;
                viewPager2.onExtraCallbackWithResult(new ViewPager2.OnPageChangeCallback() { // from class: com.tnkfactory.ad.basic.TnkListBannerItem$HorizontalHolder$bind$1
                    public void onPageSelected(int i3) {
                        super.onPageSelected(i3);
                        TextView textView3 = textView;
                        int size = tnkListBannerItem.getArrBannerItem().size();
                        StringBuilder sb = new StringBuilder();
                        sb.append((i3 % size) + 1);
                        textView3.setText(sb.toString());
                    }
                });
            }
        }

        @Override // com.xwray.groupie.Item
        public int getLayout() {
            return R.layout.com_tnk_offerwall_banner_section_in_list;
        }

        public final CustomAdapter getMAdapter() {
            return this.a;
        }

        public final int getSize() {
            return this.b;
        }

        @Override // com.xwray.groupie.Item
        public int getSpanSize(int i2, int i3) {
            return 12;
        }

        @Override // com.xwray.groupie.Item
        public int getViewType() {
            return TnkListBannerItem.this.getArrBanner().hashCode();
        }

        @Override // com.xwray.groupie.Item
        public void onViewAttachedToWindow(@NotNull setColorSchemeColors setcolorschemecolors) {
            Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
            super.onViewAttachedToWindow(setcolorschemecolors);
            ViewPager2 viewPager2FindViewById = setcolorschemecolors.onNavigationEvent().findViewById(R.id.com_tnk_off_rv_banner);
            Intrinsics.checkNotNullExpressionValue(viewPager2FindViewById, "");
            ViewPager2 viewPager2 = viewPager2FindViewById;
            Object parent = setcolorschemecolors.onNavigationEvent().getParent();
            Intrinsics.checkNotNull(parent, "");
            int width = ((View) parent).getWidth();
            DpUtil dpUtil = DpUtil.INSTANCE;
            viewPager2.getLayoutParams().height = (dpUtil.dpToPx(2.0f) / 2) + dpUtil.dpToPx(16.0f) + ((int) ((width - dpUtil.dpToPx(40.0f)) / 5.0f));
            setcolorschemecolors.onNavigationEvent().setMinimumHeight((viewPager2.getWidth() / 360) * 160);
        }

        public final void setSize(int i2) {
            this.b = i2;
        }
    }

    public TnkListBannerItem(@NotNull List<BannerItem> list, @NotNull TnkAdListModel tnkAdListModel, @NotNull TnkContext tnkContext, @NotNull Function1<? super BannerItem, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(tnkAdListModel, "");
        Intrinsics.checkNotNullParameter(tnkContext, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.a = list;
        this.b = tnkAdListModel;
        this.c = tnkContext;
        this.d = function1;
        this.e = new ArrayList();
        add(new HorizontalHolder());
        this.f = true;
    }

    public final TnkAdListModel getAdListModel() {
        return this.b;
    }

    public final List<BannerItem> getArrBanner() {
        return this.a;
    }

    public final ArrayList<HorizontalHolder.AdListItem> getArrBannerItem() {
        return this.e;
    }

    public final boolean getFirst() {
        return this.f;
    }

    public final Function1<BannerItem, Unit> getOnItemClick() {
        return this.d;
    }

    public final TnkContext getTnkContext() {
        return this.c;
    }

    @Override // com.tnkfactory.ad.basic.ITnkSection
    public boolean onUpdate() {
        Object next;
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            HorizontalHolder.AdListItem adListItem = (HorizontalHolder.AdListItem) obj;
            if (adListItem.getBannerItem().getApp_id() != 0) {
                AdListVo adListVoFindItem = this.b.findItem(adListItem.getBannerItem().getApp_id());
                if (adListVoFindItem != null && !adListVoFindItem.getOnError()) {
                    if (adListVoFindItem.getCampaignItems().size() > 0) {
                        Iterator<T> it = adListVoFindItem.getCampaignItems().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (!((AdActionInfoVo) next).getPayYn()) {
                                break;
                            }
                        }
                        if (next == null) {
                        }
                    }
                }
                arrayList2.add(obj);
            }
        }
        this.e.removeAll(arrayList2);
        return this.e.size() > 0;
    }

    public final void setFirst(boolean z) {
        this.f = z;
    }
}
