package com.tnkfactory.ad.basic;

import com.tnkfactory.ad.TnkContext;
import com.tnkfactory.ad.b.p;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.off.data.AdListVoKt;
import com.tnkfactory.ad.rwd.data.view.AdListCuration;
import com.tnkfactory.ad.style.ITnkOffAdCuration;
import com.tnkfactory.ad.style.ITnkOffAdItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkAdListLayoutCpsF extends ITnkOffAdCuration {
    public TnkCurationHeader b;
    public TnkAdListPageControlCps c;
    public int e;
    public ArrayList a = new ArrayList();
    public TnkAdCurationDividerItem d = new TnkAdCurationDividerItem();

    public final ArrayList<ITnkOffAdItem> getArrCurationItem() {
        return this.a;
    }

    public final TnkAdCurationDividerItem getDivider() {
        return this.d;
    }

    public final TnkAdListPageControlCps getFooter() {
        return this.c;
    }

    public final TnkCurationHeader getHeader() {
        return this.b;
    }

    public final int getPage() {
        return this.e;
    }

    public final void onClickReload(int i2) {
        try {
            this.e = ((this.e + i2) + 2) % 2;
            onUpdate();
        } catch (Exception unused) {
            this.e = 0;
        }
    }

    @Override // com.tnkfactory.ad.style.ITnkOffAdCuration
    public void onCreateCuration(@NotNull TnkContext tnkContext, @NotNull AdListCuration adListCuration, @NotNull List<? extends AdListVo> list) {
        Intrinsics.checkNotNullParameter(tnkContext, "");
        Intrinsics.checkNotNullParameter(adListCuration, "");
        Intrinsics.checkNotNullParameter(list, "");
        super.onCreateCuration(tnkContext, adListCuration, list);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.a.add(makeViewItem(tnkContext, (AdListVo) it.next()));
        }
        if (this.b == null) {
            this.b = new TnkCurationHeader(adListCuration.getCrt_title());
        }
        if (this.c == null) {
            this.c = new TnkAdListPageControlCps(list.size(), 0, new p(this));
        }
        onUpdate();
    }

    @Override // com.tnkfactory.ad.basic.ITnkSection
    public boolean onUpdate() {
        List listSubList;
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (AdListVoKt.isRemoved(((ITnkOffAdItem) obj).getAdItem())) {
                arrayList2.add(obj);
            }
        }
        this.a.removeAll(arrayList2);
        if (this.a.size() <= 0) {
            clear();
            return true;
        }
        ArrayList arrayList3 = new ArrayList();
        TnkCurationHeader tnkCurationHeader = this.b;
        if (tnkCurationHeader != null) {
            arrayList3.add(tnkCurationHeader);
        }
        if (this.a.size() < 6) {
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((ITnkOffAdItem) this.a.get(i2)).setPosition(i2);
            }
            arrayList3.addAll(this.a);
            TnkAdListPageControlCps tnkAdListPageControlCps = this.c;
            if (tnkAdListPageControlCps != null) {
                tnkAdListPageControlCps.setMaxPageNum(1);
            }
        } else {
            int size2 = (this.a.size() % 2) + (this.a.size() / 2);
            if (this.e == 0) {
                listSubList = this.a.subList(0, size2);
            } else {
                ArrayList arrayList4 = this.a;
                listSubList = arrayList4.subList(size2, arrayList4.size());
            }
            Intrinsics.checkNotNull(listSubList);
            int size3 = listSubList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                ((ITnkOffAdItem) listSubList.get(i3)).setPosition(i3);
            }
            arrayList3.addAll(listSubList);
            TnkAdListPageControlCps tnkAdListPageControlCps2 = this.c;
            if (tnkAdListPageControlCps2 != null) {
                tnkAdListPageControlCps2.setMaxPageNum(2);
            }
            TnkAdListPageControlCps tnkAdListPageControlCps3 = this.c;
            if (tnkAdListPageControlCps3 != null) {
                tnkAdListPageControlCps3.setNowPageNum(this.e);
            }
            TnkAdListPageControlCps tnkAdListPageControlCps4 = this.c;
            Intrinsics.checkNotNull(tnkAdListPageControlCps4);
            arrayList3.add(tnkAdListPageControlCps4);
        }
        arrayList3.add(this.d);
        update(arrayList3);
        return this.a.size() > 0;
    }

    public final void setArrCurationItem(@NotNull ArrayList<ITnkOffAdItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.a = arrayList;
    }

    public final void setDivider(@NotNull TnkAdCurationDividerItem tnkAdCurationDividerItem) {
        Intrinsics.checkNotNullParameter(tnkAdCurationDividerItem, "");
        this.d = tnkAdCurationDividerItem;
    }

    public final void setFooter(@Nullable TnkAdListPageControlCps tnkAdListPageControlCps) {
        this.c = tnkAdListPageControlCps;
    }

    public final void setHeader(@Nullable TnkCurationHeader tnkCurationHeader) {
        this.b = tnkCurationHeader;
    }

    public final void setPage(int i2) {
        this.e = i2;
    }
}
