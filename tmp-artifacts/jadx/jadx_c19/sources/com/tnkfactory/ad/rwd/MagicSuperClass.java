package com.tnkfactory.ad.rwd;

import com.tnkfactory.ad.off.data.AdListVo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class MagicSuperClass {
    public static final MagicSuperClass INSTANCE = new MagicSuperClass();
    public static ArrayList a = new ArrayList();
    public static AdListVo b = new AdListVo(0, 0, 0, null, null, null, null, 0, null, null, 0, null, 0, 0, null, null, null, null, null, null, 0, null, false, false, null, 0, 0, null, 0, null, null, 0, null, null, null, null, null, null, 0, 0, null, 0, 0, 0, null, 0, false, false, 0, null, -1, 262143, null);

    public final AdListVo getAdItem() {
        return b;
    }

    public final ArrayList<AdListVo> getArrAdItems() {
        return a;
    }

    public final void setAdItem(@NotNull AdListVo adListVo) {
        Intrinsics.checkNotNullParameter(adListVo, "");
        b = adListVo;
    }

    public final void setArrAdItems(@NotNull ArrayList<AdListVo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        a = arrayList;
    }

    public final AdListVo getAdItem(long j) {
        Object next;
        Iterator it = a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AdListVo) next).getAppId() == j) {
                break;
            }
        }
        return (AdListVo) next;
    }
}
