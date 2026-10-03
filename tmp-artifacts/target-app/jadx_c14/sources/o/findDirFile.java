package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.makeName;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class findDirFile {
    public static final List<makeName> onExtraCallbackWithResult(@NotNull List<? extends makeName> list, @NotNull getFormatWidth getformatwidth) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(getformatwidth, "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            makeName makename = (makeName) obj;
            if ((makename instanceof makeName.IAuthTabCallback) || ((makename instanceof makeName.onWarmupCompleted) && ((makeName.onWarmupCompleted) makename).onNavigationEvent().asBinder() == getformatwidth)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (!(((makeName) obj2) instanceof makeName.IAuthTabCallback) || (CollectionsKt.getOrNull(arrayList, i2) instanceof makeName.onWarmupCompleted)) {
                arrayList2.add(obj2);
            }
            i = i2;
        }
        return arrayList2;
    }
}
