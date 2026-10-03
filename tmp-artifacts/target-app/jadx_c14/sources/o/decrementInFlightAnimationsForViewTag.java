package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class decrementInFlightAnimationsForViewTag {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public static final List<accesssetEnqueuedAnimationOnFramep> onExtraCallbackWithResult(@NotNull List<formatToParts> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        List<formatToParts> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            int i2 = onExtraCallback + 79;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                arrayList.add(accesssetEnqueuedAnimationOnFramep.Companion.IAuthTabCallback((formatToParts) it.next()));
                int i3 = 13 / 0;
            } else {
                arrayList.add(accesssetEnqueuedAnimationOnFramep.Companion.IAuthTabCallback((formatToParts) it.next()));
            }
        }
        int i4 = onWarmupCompleted + 95;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return arrayList;
    }
}
