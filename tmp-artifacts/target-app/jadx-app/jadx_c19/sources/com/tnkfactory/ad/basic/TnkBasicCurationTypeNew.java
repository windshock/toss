package com.tnkfactory.ad.basic;

import com.tnkfactory.ad.TnkContext;
import com.tnkfactory.ad.b.u;
import com.tnkfactory.ad.off.TnkDirection;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.off.data.AdListVoKt;
import com.tnkfactory.ad.rwd.data.view.AdListCuration;
import com.tnkfactory.ad.style.ITnkOffAdCuration;
import com.tnkfactory.ad.style.ITnkOffAdItem;
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
public final class TnkBasicCurationTypeNew extends ITnkOffAdCuration {
    public Item b;
    public TnkCurationPageControlOneButton c;
    public int e;
    public ArrayList a = new ArrayList();
    public TnkAdCurationSecondaryDividerItem d = new TnkAdCurationSecondaryDividerItem();
    public int f = 6;

    public final ArrayList<ITnkOffAdItem> getArrCurationItem() {
        return this.a;
    }

    public final TnkAdCurationSecondaryDividerItem getDivider() {
        return this.d;
    }

    public final TnkCurationPageControlOneButton getFooter() {
        return this.c;
    }

    public final Item<setColorSchemeColors> getHeader() {
        return this.b;
    }

    public final int getPage() {
        return this.e;
    }

    public final int getVisibleCount() {
        return this.f;
    }

    public final void onClickReload(int i2) {
        try {
            this.e++;
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
            this.b = new TnkCurationSecondaryHeader(adListCuration.getCrt_title());
        }
        if (this.c == null) {
            this.c = new TnkCurationPageControlOneButton(1, 0, 1, new u(this));
        }
        onUpdate();
    }

    @Override // com.tnkfactory.ad.basic.ITnkSection
    public boolean onUpdate() {
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
        if (this.a.size() <= 5) {
            this.f = this.a.size();
        } else {
            int visibleCount = getVisibleCount(this.a.size(), 5);
            int visibleCount2 = getVisibleCount(this.a.size(), 4);
            int visibleCount3 = getVisibleCount(this.a.size(), 3);
            if (visibleCount <= visibleCount2 && visibleCount <= visibleCount3) {
                this.f = 5;
            } else if (visibleCount2 > visibleCount || visibleCount2 > visibleCount3) {
                this.f = 3;
            } else {
                this.f = 4;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Item item = this.b;
        if (item != null) {
            arrayList3.add(item);
        }
        if (this.a.size() <= this.f) {
            arrayList3.addAll(this.a);
        } else {
            int size = this.a.size();
            int i2 = this.e;
            int i3 = this.f;
            if (size <= i2 * i3) {
                i2 = 0;
            }
            this.e = i2;
            int i4 = i2 * i3;
            int i5 = i3 + i4;
            int size2 = this.a.size() < i5 ? this.a.size() - 1 : i5 - 1;
            if (i4 <= size2) {
                while (true) {
                    ITnkOffAdItem iTnkOffAdItem = (ITnkOffAdItem) this.a.get(i4);
                    TnkDirection tnkDirection = TnkDirection.INSTANCE;
                    iTnkOffAdItem.setDirection(tnkDirection.getNONE());
                    if (i4 < 2) {
                        iTnkOffAdItem.setDirection(tnkDirection.getTOP());
                    }
                    arrayList3.add(this.a.get(i4));
                    if (i4 == size2) {
                        break;
                    }
                    i4++;
                }
            }
            ITnkOffAdItem iTnkOffAdItem2 = (ITnkOffAdItem) CollectionsKt.lastOrNull(this.a);
            if (iTnkOffAdItem2 != null) {
                iTnkOffAdItem2.setDirection(iTnkOffAdItem2.getDirection() | TnkDirection.INSTANCE.getBOTTOM());
            }
            TnkCurationPageControlOneButton tnkCurationPageControlOneButton = this.c;
            if (tnkCurationPageControlOneButton != null) {
                tnkCurationPageControlOneButton.setCurrent(this.e + 1);
            }
            TnkCurationPageControlOneButton tnkCurationPageControlOneButton2 = this.c;
            if (tnkCurationPageControlOneButton2 != null) {
                tnkCurationPageControlOneButton2.setMax(this.a.size() % this.f == 0 ? this.a.size() / this.f : (this.a.size() / this.f) + 1);
            }
            TnkCurationPageControlOneButton tnkCurationPageControlOneButton3 = this.c;
            Intrinsics.checkNotNull(tnkCurationPageControlOneButton3);
            arrayList3.add(tnkCurationPageControlOneButton3);
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

    public final void setFooter(@Nullable TnkCurationPageControlOneButton tnkCurationPageControlOneButton) {
        this.c = tnkCurationPageControlOneButton;
    }

    public final void setHeader(@Nullable Item<setColorSchemeColors> item) {
        this.b = item;
    }

    public final void setPage(int i2) {
        this.e = i2;
    }

    public final void setVisibleCount(int i2) {
        this.f = i2;
    }

    public final int getVisibleCount(int i2, int i3) {
        int i4 = i2 % i3;
        if (i4 == 0) {
            return 0;
        }
        return i3 - i4;
    }
}
