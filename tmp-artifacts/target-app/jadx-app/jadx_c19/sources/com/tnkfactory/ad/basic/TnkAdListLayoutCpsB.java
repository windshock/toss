package com.tnkfactory.ad.basic;

import com.tnkfactory.ad.TnkContext;
import com.tnkfactory.ad.b.o;
import com.tnkfactory.ad.off.TnkDirection;
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
public final class TnkAdListLayoutCpsB extends ITnkOffAdCuration {
    public TnkCurationSecondaryHeader b;
    public TnkAdListPageControlCps c;
    public int f;
    public ArrayList a = new ArrayList();
    public TnkAdCurationSecondaryDividerItem d = new TnkAdCurationSecondaryDividerItem();
    public int e = 6;

    public final ArrayList<ITnkOffAdItem> getArrCurationItem() {
        return this.a;
    }

    public final TnkAdCurationSecondaryDividerItem getDivider() {
        return this.d;
    }

    public final TnkAdListPageControlCps getFooter() {
        return this.c;
    }

    public final TnkCurationSecondaryHeader getHeader() {
        return this.b;
    }

    public final int getPage() {
        return this.f;
    }

    public final int getVisibleCount() {
        return this.e;
    }

    public final void onClickReload(int i2) {
        try {
            this.f += i2;
            onUpdate();
        } catch (Exception unused) {
            this.f = 0;
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
            this.b = new TnkCurationSecondaryHeader(adListCuration.getCrt_title());
        }
        if (this.c == null) {
            this.c = new TnkAdListPageControlCps(list.size(), 1, new o(this));
        }
        onUpdate();
    }

    @Override // com.tnkfactory.ad.basic.ITnkSection
    public boolean onUpdate() {
        TnkAdListPageControlCps tnkAdListPageControlCps;
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
        TnkCurationSecondaryHeader tnkCurationSecondaryHeader = this.b;
        if (tnkCurationSecondaryHeader != null) {
            arrayList3.add(tnkCurationSecondaryHeader);
        }
        int size = this.a.size();
        int i2 = this.f;
        int i3 = this.e;
        if (size <= i2 * i3) {
            i2 = 0;
        }
        this.f = i2;
        int i4 = i2 * i3;
        int i5 = i3 + i4;
        int size2 = this.a.size() < i5 ? this.a.size() - 1 : i5 - 1;
        Object obj2 = this.a.get(0);
        Intrinsics.checkNotNullExpressionValue(obj2, "");
        ITnkOffAdItem iTnkOffAdItem = (ITnkOffAdItem) obj2;
        if (i4 <= size2) {
            while (true) {
                ITnkOffAdItem iTnkOffAdItem2 = (ITnkOffAdItem) this.a.get(i4);
                TnkDirection tnkDirection = TnkDirection.INSTANCE;
                iTnkOffAdItem2.setDirection(tnkDirection.getNONE());
                if (i4 < 2) {
                    iTnkOffAdItem2.setDirection(tnkDirection.getTOP());
                }
                if (i4 % 2 == 0) {
                    iTnkOffAdItem2.setDirection(tnkDirection.getLEFT() | iTnkOffAdItem2.getDirection());
                } else {
                    iTnkOffAdItem2.setDirection(tnkDirection.getRIGHT() | iTnkOffAdItem2.getDirection());
                }
                ((ITnkOffAdItem) this.a.get(i4)).setPosition(i4);
                arrayList3.add(this.a.get(i4));
                iTnkOffAdItem = (ITnkOffAdItem) this.a.get(i4);
                if (i4 == size2) {
                    break;
                }
                i4++;
            }
        }
        iTnkOffAdItem.setDirection(iTnkOffAdItem.getDirection() | TnkDirection.INSTANCE.getBOTTOM());
        if (this.a.size() > this.e && (tnkAdListPageControlCps = this.c) != null) {
            tnkAdListPageControlCps.setMaxPageNum((this.a.size() / this.e) + 1);
            TnkAdListPageControlCps tnkAdListPageControlCps2 = this.c;
            if (tnkAdListPageControlCps2 != null) {
                tnkAdListPageControlCps2.setNowPageNum(this.f);
            }
            TnkAdListPageControlCps tnkAdListPageControlCps3 = this.c;
            Intrinsics.checkNotNull(tnkAdListPageControlCps3);
            arrayList3.add(tnkAdListPageControlCps3);
        }
        arrayList3.add(this.d);
        update(arrayList3);
        return this.a.size() > 0;
    }

    public final void setArrCurationItem(@NotNull ArrayList<ITnkOffAdItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.a = arrayList;
    }

    public final void setDivider(@NotNull TnkAdCurationSecondaryDividerItem tnkAdCurationSecondaryDividerItem) {
        Intrinsics.checkNotNullParameter(tnkAdCurationSecondaryDividerItem, "");
        this.d = tnkAdCurationSecondaryDividerItem;
    }

    public final void setFooter(@Nullable TnkAdListPageControlCps tnkAdListPageControlCps) {
        this.c = tnkAdListPageControlCps;
    }

    public final void setHeader(@Nullable TnkCurationSecondaryHeader tnkCurationSecondaryHeader) {
        this.b = tnkCurationSecondaryHeader;
    }

    public final void setPage(int i2) {
        this.f = i2;
    }

    public final void setVisibleCount(int i2) {
        this.e = i2;
    }
}
