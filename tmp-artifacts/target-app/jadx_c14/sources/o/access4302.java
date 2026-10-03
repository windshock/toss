package o;

import im.toss.define.TossAffiliate;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class access4302 {
    public static final access4102 onNavigationEvent(boolean z, @NotNull SkiaImageRegionDecoder skiaImageRegionDecoder, @NotNull Set<? extends TossAffiliate> set, boolean z2) {
        boolean z3;
        Intrinsics.checkNotNullParameter(skiaImageRegionDecoder, "");
        Intrinsics.checkNotNullParameter(set, "");
        Set<? extends TossAffiliate> set2 = set;
        boolean z4 = true;
        if (set2.isEmpty()) {
            z3 = false;
            break;
        }
        Set<? extends TossAffiliate> set3 = set;
        if (!(set3 instanceof Collection) || !set3.isEmpty()) {
            Iterator<T> it = set3.iterator();
            while (it.hasNext()) {
                if (!((TossAffiliate) it.next()).isBank()) {
                    z3 = false;
                    break;
                }
            }
        }
        z3 = true;
        if (set2.isEmpty()) {
            z4 = false;
            break;
        }
        Set<? extends TossAffiliate> set4 = set;
        if (!(set4 instanceof Collection) || !set4.isEmpty()) {
            Iterator<T> it2 = set4.iterator();
            while (it2.hasNext()) {
                if (!((TossAffiliate) it2.next()).isSecurities()) {
                    z4 = false;
                    break;
                }
            }
        }
        if (z3 || z4) {
            return access4102.SKIP;
        }
        if (skiaImageRegionDecoder == SkiaImageRegionDecoder.NETWORK) {
            return access4102.NETWORK;
        }
        if (z) {
            return z2 ? access4102.KR_MAIN_HOME : access4102.KR_SERVICE;
        }
        return access4102.NO_AFFILIATE;
    }
}
