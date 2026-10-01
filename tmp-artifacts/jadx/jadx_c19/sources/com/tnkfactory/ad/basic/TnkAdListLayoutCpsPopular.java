package com.tnkfactory.ad.basic;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkContext;
import com.tnkfactory.ad.b.q;
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
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkAdListLayoutCpsPopular extends ITnkOffAdCuration {
    public TnkCurationHeader c;
    public TnkAdListPageControlCps d;
    public RecyclerView f;
    public int h;
    public final GroupieAdapter a = new GroupieAdapter();
    public ArrayList b = new ArrayList();
    public TnkAdCurationDividerItem e = new TnkAdCurationDividerItem();
    public boolean g = true;

    public final class HorizontalHolder extends Item<setColorSchemeColors> {
        public HorizontalHolder() {
        }

        @Override // com.xwray.groupie.Item
        public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
            Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
            int iAccess$getPageSize = TnkAdListLayoutCpsPopular.access$getPageSize(TnkAdListLayoutCpsPopular.this);
            View view = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setTag("HORIZONTAL");
            RecyclerView recyclerViewFindViewById = view.findViewById(R.id.rc_style_custom);
            Intrinsics.checkNotNullExpressionValue(recyclerViewFindViewById, "");
            RecyclerView recyclerView = recyclerViewFindViewById;
            TnkAdListLayoutCpsPopular.this.f = recyclerView;
            if (TnkAdListLayoutCpsPopular.this.isFirst()) {
                Context context = view.getContext();
                Intrinsics.checkNotNull(context);
                recyclerView.setLayoutManager(new GridLayoutManager(context, iAccess$getPageSize, 0, false));
                recyclerView.setAdapter(TnkAdListLayoutCpsPopular.this.getMAdapter());
                TnkAdListLayoutCpsPopular.this.a();
                TnkAdListLayoutCpsPopular.this.setFirst(false);
                return;
            }
            GridLayoutManager layoutManager = recyclerView.getLayoutManager();
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? layoutManager : null;
            if (gridLayoutManager != null) {
                gridLayoutManager.onExtraCallback(iAccess$getPageSize);
            }
            recyclerView.setAdapter(TnkAdListLayoutCpsPopular.this.getMAdapter());
            TnkAdListLayoutCpsPopular.this.a();
        }

        @Override // com.xwray.groupie.Item
        public int getLayout() {
            return R.layout.com_tnk_offerwall_cps_popular_viewgroup;
        }

        @Override // com.xwray.groupie.Item
        public int getSpanSize(int i2, int i3) {
            return 12;
        }
    }

    public static final int access$getPageSize(TnkAdListLayoutCpsPopular tnkAdListLayoutCpsPopular) {
        int size = tnkAdListLayoutCpsPopular.b.size();
        if (size >= 8) {
            return 5;
        }
        if (size == 7) {
            return 4;
        }
        if (size == 6) {
            return 3;
        }
        if (size > 0) {
            return size;
        }
        return 1;
    }

    public final void a() {
        RecyclerView recyclerView = this.f;
        if (recyclerView != null) {
            if (this.h >= (this.b.size() > 5 ? 2 : 1)) {
                this.h = 0;
            }
            int size = this.b.size();
            int i2 = this.h * (size < 8 ? size == 7 ? 4 : size == 6 ? 3 : size <= 0 ? 1 : size : 5);
            if (i2 < this.a.getItemCount()) {
                recyclerView.scrollToPosition(i2);
            } else if (this.a.getItemCount() > 0) {
                recyclerView.scrollToPosition(this.a.getItemCount() - 1);
            }
        }
    }

    public final ArrayList<ITnkOffAdItem> getArrCurationItem() {
        return this.b;
    }

    public final TnkAdCurationDividerItem getDivider() {
        return this.e;
    }

    public final TnkAdListPageControlCps getFooter() {
        return this.d;
    }

    public final TnkCurationHeader getHeader() {
        return this.c;
    }

    public final GroupieAdapter getMAdapter() {
        return this.a;
    }

    public final int getPage() {
        return this.h;
    }

    public final boolean isFirst() {
        return this.g;
    }

    public final void onClickReload(int i2) {
        try {
            if (this.b.size() > 5) {
                int i3 = this.h + i2;
                this.h = i3;
                this.h = (i3 + 2) % 2;
                onUpdate();
                a();
            }
        } catch (Exception unused) {
            this.h = 0;
        }
    }

    @Override // com.tnkfactory.ad.style.ITnkOffAdCuration
    public void onCreateCuration(@NotNull TnkContext tnkContext, @NotNull AdListCuration adListCuration, @NotNull List<? extends AdListVo> list) {
        Intrinsics.checkNotNullParameter(tnkContext, "");
        Intrinsics.checkNotNullParameter(adListCuration, "");
        Intrinsics.checkNotNullParameter(list, "");
        super.onCreateCuration(tnkContext, adListCuration, list);
        this.b.clear();
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(makeViewItem(tnkContext, (AdListVo) it.next()));
        }
        arrayList.addAll(arrayList2);
        try {
            this.a.clear();
            this.a.addAll(this.b);
        } catch (Throwable unused) {
        }
        this.c = new TnkCurationHeader(adListCuration.getCrt_title());
        this.d = this.b.size() > 5 ? new TnkAdListPageControlCps(this.b.size(), 0, new q(this)) : null;
        TnkCurationHeader tnkCurationHeader = this.c;
        Intrinsics.checkNotNull(tnkCurationHeader);
        add(tnkCurationHeader);
        add(new HorizontalHolder());
        TnkAdListPageControlCps tnkAdListPageControlCps = this.d;
        if (tnkAdListPageControlCps != null) {
            add(tnkAdListPageControlCps);
        }
        add(this.e);
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
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ITnkOffAdItem) this.b.get(i2)).setPosition(i2);
        }
        if (this.b.size() <= 0) {
            clear();
            return true;
        }
        int i3 = this.b.size() > 5 ? 2 : 1;
        if (this.h >= i3) {
            this.h = 0;
        }
        TnkAdListPageControlCps tnkAdListPageControlCps = this.d;
        if (tnkAdListPageControlCps != null) {
            tnkAdListPageControlCps.setMaxPageNum(i3);
            tnkAdListPageControlCps.setNowPageNum(this.h);
        }
        return this.b.size() > 0;
    }

    public final void setArrCurationItem(@NotNull ArrayList<ITnkOffAdItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.b = arrayList;
    }

    public final void setDivider(@NotNull TnkAdCurationDividerItem tnkAdCurationDividerItem) {
        Intrinsics.checkNotNullParameter(tnkAdCurationDividerItem, "");
        this.e = tnkAdCurationDividerItem;
    }

    public final void setFirst(boolean z) {
        this.g = z;
    }

    public final void setFooter(@Nullable TnkAdListPageControlCps tnkAdListPageControlCps) {
        this.d = tnkAdListPageControlCps;
    }

    public final void setHeader(@Nullable TnkCurationHeader tnkCurationHeader) {
        this.c = tnkCurationHeader;
    }

    public final void setPage(int i2) {
        this.h = i2;
    }
}
