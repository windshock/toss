package com.tnkfactory.ad.basic;

import com.tnkfactory.ad.TnkContext;
import com.tnkfactory.ad.b.n;
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
public final class TnkAdListItemLayout extends ITnkOffAdCuration {
    public TnkCurationHeader b;
    public TnkCurationPageControl c;
    public int f;
    public ArrayList a = new ArrayList();
    public TnkAdCurationDividerItem d = new TnkAdCurationDividerItem();
    public int e = 6;

    public final ArrayList<ITnkOffAdItem> getArrCurationItem() {
        return this.a;
    }

    public final TnkAdCurationDividerItem getDivider() {
        return this.d;
    }

    public final TnkCurationPageControl getFooter() {
        return this.c;
    }

    public final TnkCurationHeader getHeader() {
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
            this.f++;
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
            this.b = new TnkCurationHeader(adListCuration.getCrt_title());
        }
        if (this.c == null) {
            this.c = new TnkCurationPageControl(list.size(), 0, new n(this));
        }
        onUpdate();
    }

    @Override // com.tnkfactory.ad.basic.ITnkSection
    public boolean onUpdate() {
        TnkCurationPageControl tnkCurationPageControl;
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
        int size = this.a.size();
        int i2 = this.f;
        int i3 = this.e;
        if (size < i2 * i3) {
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
        if (this.a.size() > this.e && (tnkCurationPageControl = this.c) != null) {
            tnkCurationPageControl.setMaxCount(this.a.size() / this.e);
            TnkCurationPageControl tnkCurationPageControl2 = this.c;
            if (tnkCurationPageControl2 != null) {
                tnkCurationPageControl2.setNowPageNum(this.f);
            }
            TnkCurationPageControl tnkCurationPageControl3 = this.c;
            Intrinsics.checkNotNull(tnkCurationPageControl3);
            arrayList3.add(tnkCurationPageControl3);
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

    public final void setFooter(@Nullable TnkCurationPageControl tnkCurationPageControl) {
        this.c = tnkCurationPageControl;
    }

    public final void setHeader(@Nullable TnkCurationHeader tnkCurationHeader) {
        this.b = tnkCurationHeader;
    }

    public final void setPage(int i2) {
        this.f = i2;
    }

    public final void setVisibleCount(int i2) {
        this.e = i2;
    }
}
