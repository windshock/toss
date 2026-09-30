package com.tnkfactory.ad.basic;

import com.tnkfactory.ad.TnkContext;
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

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkAdListLayoutCpsNone extends ITnkOffAdCuration {
    public ArrayList a = new ArrayList();

    public final ArrayList<ITnkOffAdItem> getArrCurationItem() {
        return this.a;
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
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ITnkOffAdItem) this.a.get(i2)).setPosition(i2);
        }
        update(this.a);
        return this.a.size() > 0;
    }

    public final void setArrCurationItem(@NotNull ArrayList<ITnkOffAdItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.a = arrayList;
    }
}
