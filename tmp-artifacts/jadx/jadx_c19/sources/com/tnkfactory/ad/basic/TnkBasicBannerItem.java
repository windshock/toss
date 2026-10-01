package com.tnkfactory.ad.basic;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkAdConfig;
import com.tnkfactory.ad.basic.TnkBasicBannerItem;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.off.data.AdListVoKt;
import com.tnkfactory.ad.rwd.BannerItem;
import com.tnkfactory.ad.style.DpUtil;
import com.tnkfactory.ad.style.ITnkOffAdItem;
import com.tnkfactory.ad.tnkassert.TnkAssert;
import com.xwray.groupie.GroupieAdapter;
import com.xwray.groupie.Item;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkBasicBannerItem extends ITnkOffAdItem {
    public final List a;
    public final Function1 b;
    public final GroupieAdapter c;
    public final ArrayList d;
    public final DecimalFormat e;
    public boolean f;

    public class AdListItem extends Item<setColorSchemeColors> {
        public final BannerItem a;
        public final /* synthetic */ TnkBasicBannerItem b;

        public AdListItem(@NotNull TnkBasicBannerItem tnkBasicBannerItem, BannerItem bannerItem) {
            Intrinsics.checkNotNullParameter(bannerItem, "");
            this.b = tnkBasicBannerItem;
            this.a = bannerItem;
        }

        public static final void a(AdListItem adListItem, int i2, TnkBasicBannerItem tnkBasicBannerItem, View view) {
            TnkAssert tnkAssert = TnkAssert.INSTANCE;
            tnkAssert.sponsorshipClickBig(String.valueOf(adListItem.getBannerItem().getApp_id()), String.valueOf(tnkAssert.getMOfferwallTabClick().getRefererTab()), i2, 0, false);
            tnkBasicBannerItem.getOnItemClick().invoke(adListItem.getBannerItem());
        }

        @Override // com.xwray.groupie.Item
        public void bind(@NotNull setColorSchemeColors setcolorschemecolors, final int i2) {
            Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
            View view = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent;
            final TnkBasicBannerItem tnkBasicBannerItem = this.b;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = view.findViewById(R.id.com_tnk_off_banner_item_point_layout);
            TextView textView = (TextView) view.findViewById(R.id.com_tnk_off_banner_item_point);
            ImageView imageView = (ImageView) view.findViewById(R.id.com_tnk_off_banner_item_point_unit_icon);
            if (getBannerItem().getPointAmount() > 0) {
                LinearLayout linearLayout = (LinearLayout) objectRef.element;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                if (TnkAdConfig.INSTANCE.getUsePointUnit()) {
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                } else if (imageView != null) {
                    imageView.setVisibility(0);
                }
                if (textView != null) {
                    textView.setText(tnkBasicBannerItem.getPointFormat().format(getBannerItem().getPointAmount()));
                }
            } else {
                LinearLayout linearLayout2 = (LinearLayout) objectRef.element;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
            }
            RequestBuilder<Bitmap> requestBuilderOnExtraCallback = Glide.onExtraCallbackWithResult(view).IAuthTabCallback().onExtraCallback(getBannerItem().getImg_url());
            Intrinsics.checkNotNull(view);
            requestBuilderOnExtraCallback.onNavigationEvent((RequestBuilder<Bitmap>) new TnkBasicBannerItem$AdListItem$bind$1$1(objectRef, getAdImageView(view)));
            view.setVisibility(0);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkBasicBannerItem$AdListItem$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    TnkBasicBannerItem.AdListItem.a(this.f$0, i2, tnkBasicBannerItem, view2);
                }
            });
        }

        public final ImageView getAdImageView(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return (ImageView) view.findViewById(R.id.com_tnk_off_banner_item_image);
        }

        public BannerItem getBannerItem() {
            return this.a;
        }

        @Override // com.xwray.groupie.Item
        public int getLayout() {
            return R.layout.com_tnk_offerwall_banner_item;
        }
    }

    public TnkBasicBannerItem(@NotNull List<BannerItem> list, @NotNull Function1<? super BannerItem, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.a = list;
        this.b = function1;
        this.c = new GroupieAdapter();
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new DecimalFormat("###,###");
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new AdListItem(this, (BannerItem) it.next()));
        }
        arrayList.addAll(arrayList2);
        this.c.addAll(this.d);
        this.f = true;
    }

    public static final void a(int i2, int i3, View view, float f) {
        Intrinsics.checkNotNullParameter(view, "");
        float f2 = (-((i2 << 1) + i3)) * f;
        if (f < -1.0f) {
            view.setTranslationX(-f2);
        } else if (f <= 1.0f) {
            view.setTranslationX(f2);
        } else {
            view.setTranslationX(f2);
        }
    }

    @Override // com.xwray.groupie.Item
    public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        View view = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(view, "");
        ViewPager2 viewPager2FindViewById = view.findViewById(R.id.com_tnk_off_rv_banner);
        final TextView textView = (TextView) view.findViewById(R.id.com_tnk_off_page_idx);
        View viewFindViewById = view.findViewById(R.id.com_tnk_off_page_indicator);
        DpUtil dpUtil = DpUtil.INSTANCE;
        final int iDpToPx = dpUtil.dpToPx(10.0f);
        final int iDpToPx2 = dpUtil.dpToPx(10.0f);
        if (viewPager2FindViewById != null) {
            viewPager2FindViewById.setOffscreenPageLimit(3);
        }
        if (viewPager2FindViewById != null) {
            viewPager2FindViewById.setPageTransformer(new ViewPager2.onExtraCallbackWithResult() { // from class: com.tnkfactory.ad.basic.TnkBasicBannerItem$$ExternalSyntheticLambda0
                public final void transformPage(View view2, float f) {
                    TnkBasicBannerItem.a(iDpToPx2, iDpToPx, view2, f);
                }
            });
        }
        if (viewPager2FindViewById != null) {
            viewPager2FindViewById.setUserInputEnabled(this.d.size() > 1);
        }
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        if (this.f) {
            this.f = false;
            if (viewPager2FindViewById != null) {
                viewPager2FindViewById.setAdapter(this.c);
            }
            if (viewPager2FindViewById != null) {
                viewPager2FindViewById.onExtraCallbackWithResult(new ViewPager2.OnPageChangeCallback() { // from class: com.tnkfactory.ad.basic.TnkBasicBannerItem.bind.2
                    public void onPageSelected(int i3) {
                        super.onPageSelected(i3);
                        TextView textView2 = textView;
                        if (textView2 != null) {
                            int size = this.getArrBannerItem().size();
                            StringBuilder sb = new StringBuilder();
                            sb.append((i3 % size) + 1);
                            textView2.setText(sb.toString());
                        }
                    }
                });
            }
        }
    }

    public final List<BannerItem> getArrAdItem() {
        return this.a;
    }

    public final ArrayList<AdListItem> getArrBannerItem() {
        return this.d;
    }

    public final boolean getFirst() {
        return this.f;
    }

    @Override // com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_offerwall_banner_section_top;
    }

    public final GroupieAdapter getMAdapter() {
        return this.c;
    }

    public final Function1<BannerItem, Unit> getOnItemClick() {
        return this.b;
    }

    public final DecimalFormat getPointFormat() {
        return this.e;
    }

    @Override // com.xwray.groupie.Item
    public int getSpanSize(int i2, int i3) {
        return 12;
    }

    @Override // com.xwray.groupie.Item
    public int getViewType() {
        return this.a.hashCode();
    }

    @Override // com.xwray.groupie.Item
    public void onViewAttachedToWindow(@NotNull setColorSchemeColors setcolorschemecolors) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        super.onViewAttachedToWindow(setcolorschemecolors);
    }

    public final void setFirst(boolean z) {
        this.f = z;
    }

    public final boolean update(@NotNull List<? extends AdListVo> list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            AdListItem adListItem = (AdListItem) obj;
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((AdListVo) next).getAppId() == adListItem.getBannerItem().getApp_id()) {
                    break;
                }
            }
            AdListVo adListVo = (AdListVo) next;
            if (adListVo != null && AdListVoKt.isRemoved(adListVo)) {
                arrayList2.add(obj);
            }
        }
        this.d.removeAll(CollectionsKt.toSet(arrayList2));
        this.c.update(this.d);
        return this.d.size() > 0;
    }
}
