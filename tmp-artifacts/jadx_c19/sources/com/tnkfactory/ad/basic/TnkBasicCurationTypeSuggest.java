package com.tnkfactory.ad.basic;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkContext;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.off.data.AdListVoKt;
import com.tnkfactory.ad.rwd.data.view.AdListCuration;
import com.tnkfactory.ad.style.ITnkOffAdCuration;
import com.tnkfactory.ad.style.ITnkOffAdItem;
import com.xwray.groupie.GroupieAdapter;
import com.xwray.groupie.Item;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkBasicCurationTypeSuggest extends ITnkOffAdCuration {
    public final GroupieAdapter a = new GroupieAdapter();
    public final ArrayList b = new ArrayList();
    public boolean c = true;

    public final class HorizontalHolder extends Item<setColorSchemeColors> {
        public HorizontalHolder() {
            ArrayList<ITnkOffAdItem> arrBindItem = TnkBasicCurationTypeSuggest.this.getArrBindItem();
            List<AdListVo> arrAdItem = TnkBasicCurationTypeSuggest.this.getArrAdItem();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrAdItem, 10));
            Iterator<T> it = arrAdItem.iterator();
            while (it.hasNext()) {
                arrayList.add(TnkBasicCurationTypeSuggest.this.makeViewItem(TnkBasicCurationTypeSuggest.this.getTnkContext(), (AdListVo) it.next()));
            }
            arrBindItem.addAll(arrayList);
            TnkBasicCurationTypeSuggest.this.getMAdapter().addAll(TnkBasicCurationTypeSuggest.this.getArrBindItem());
        }

        @Override // com.xwray.groupie.Item
        public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
            Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
            View view = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setTag("HORIZONTAL");
            if (TnkBasicCurationTypeSuggest.this.isFirst()) {
                RecyclerView recyclerViewFindViewById = view.findViewById(R.id.rc_style_custom);
                Intrinsics.checkNotNullExpressionValue(recyclerViewFindViewById, "");
                RecyclerView recyclerView = recyclerViewFindViewById;
                TnkBasicCurationTypeSuggest tnkBasicCurationTypeSuggest = TnkBasicCurationTypeSuggest.this;
                Context context = view.getContext();
                Intrinsics.checkNotNull(context);
                recyclerView.setLayoutManager(new GridLayoutManager(context, tnkBasicCurationTypeSuggest.getArrBindItem().size() > 3 ? 2 : 1, 0, false));
                recyclerView.setAdapter(TnkBasicCurationTypeSuggest.this.getMAdapter());
                TnkBasicCurationTypeSuggest.this.setFirst(false);
            }
        }

        @Override // com.xwray.groupie.Item
        public int getLayout() {
            return R.layout.com_tnk_offerwall_list_style_root_viewgroup;
        }

        @Override // com.xwray.groupie.Item
        public int getSpanSize(int i2, int i3) {
            return 12;
        }

        @Override // com.xwray.groupie.Item
        public int getViewType() {
            return TnkBasicCurationTypeSuggest.this.getArrAdItem().hashCode();
        }
    }

    public static final class ZoomOutPageTransformer implements ViewPager2.onExtraCallbackWithResult {
        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        public void transformPage(@NotNull View view, float f) {
            Intrinsics.checkNotNullParameter(view, "");
            int width = view.getWidth();
            int height = view.getHeight();
            if (f < -1.0f) {
                view.setAlpha(0.0f);
                return;
            }
            if (f > 1.0f) {
                view.setAlpha(0.0f);
                return;
            }
            float fMax = Math.max(0.85f, 1.0f - Math.abs(f));
            float f2 = 1.0f - fMax;
            float f3 = (height * f2) / 2.0f;
            float f4 = (width * f2) / 2.0f;
            if (f < 0.0f) {
                view.setTranslationX(f4 - (f3 / 2.0f));
            } else {
                view.setTranslationX((f3 / 2.0f) + (-f4));
            }
            view.setScaleX(fMax);
            view.setScaleY(fMax);
            view.setAlpha((((fMax - 0.85f) / 0.14999998f) * 0.5f) + 0.5f);
        }
    }

    public final ArrayList<ITnkOffAdItem> getArrBindItem() {
        return this.b;
    }

    public final GroupieAdapter getMAdapter() {
        return this.a;
    }

    public final boolean isFirst() {
        return this.c;
    }

    @Override // com.tnkfactory.ad.style.ITnkOffAdCuration
    public void onCreateCuration(@NotNull TnkContext tnkContext, @NotNull AdListCuration adListCuration, @NotNull List<? extends AdListVo> list) {
        Intrinsics.checkNotNullParameter(tnkContext, "");
        Intrinsics.checkNotNullParameter(adListCuration, "");
        Intrinsics.checkNotNullParameter(list, "");
        super.onCreateCuration(tnkContext, adListCuration, list);
        add(new TnkCurationHeader(adListCuration.getCrt_title()));
        add(new HorizontalHolder());
        add(new TnkAdCurationDividerItem());
    }

    @Override // com.tnkfactory.ad.basic.ITnkSection
    public boolean onUpdate() {
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (AdListVoKt.isRemoved(((ITnkOffAdItem) obj).getAdItem())) {
                arrayList2.add(obj);
            }
        }
        this.b.removeAll(arrayList2);
        try {
            int size = this.b.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((ITnkOffAdItem) this.b.get(i2)).setPosition(i2);
            }
        } catch (Exception unused) {
        }
        return this.b.size() > 0;
    }

    public final void setFirst(boolean z) {
        this.c = z;
    }
}
