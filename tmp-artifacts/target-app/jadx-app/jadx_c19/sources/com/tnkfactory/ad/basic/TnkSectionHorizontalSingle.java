package com.tnkfactory.ad.basic;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
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
import kotlin.jvm.internal.Intrinsics;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkSectionHorizontalSingle extends ITnkOffAdCuration {
    public final GroupieAdapter a = new GroupieAdapter();
    public final ArrayList b = new ArrayList();
    public boolean c = true;

    public final class SingleHorizontalHolder extends Item<setColorSchemeColors> {
        public SingleHorizontalHolder() {
            ArrayList<ITnkOffAdItem> arrBindItem = TnkSectionHorizontalSingle.this.getArrBindItem();
            List<AdListVo> arrAdItem = TnkSectionHorizontalSingle.this.getArrAdItem();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrAdItem, 10));
            Iterator<T> it = arrAdItem.iterator();
            while (it.hasNext()) {
                arrayList.add(TnkSectionHorizontalSingle.this.makeViewItem(TnkSectionHorizontalSingle.this.getTnkContext(), (AdListVo) it.next()));
            }
            arrBindItem.addAll(arrayList);
            TnkSectionHorizontalSingle.this.getMAdapter().addAll(TnkSectionHorizontalSingle.this.getArrBindItem());
        }

        @Override // com.xwray.groupie.Item
        public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
            Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
            View view = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setTag("HORIZONTAL");
            if (TnkSectionHorizontalSingle.this.isFirst()) {
                RecyclerView recyclerViewFindViewById = view.findViewById(R.id.rc_style_custom);
                Intrinsics.checkNotNullExpressionValue(recyclerViewFindViewById, "");
                RecyclerView recyclerView = recyclerViewFindViewById;
                Context context = view.getContext();
                Intrinsics.checkNotNull(context);
                recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
                recyclerView.setAdapter(TnkSectionHorizontalSingle.this.getMAdapter());
                TnkSectionHorizontalSingle.this.setFirst(false);
            }
            TnkSectionHorizontalSingle.this.getMAdapter().update(TnkSectionHorizontalSingle.this.getArrBindItem());
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
            return TnkSectionHorizontalSingle.this.getArrAdItem().hashCode();
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
        add(new SingleHorizontalHolder());
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
        return this.b.size() > 0;
    }

    public final void setFirst(boolean z) {
        this.c = z;
    }
}
