package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface getProxySelectorokhttp {
    void onExtraCallbackWithResult(@NotNull List<getProxyokhttp> list);

    boolean onWarmupCompleted();

    default void IAuthTabCallback(@NotNull List<String> list, @Nullable SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        if (!onWarmupCompleted() && list.size() < 2) {
            throw new IllegalArgumentException();
        }
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new getProxyokhttp((String) it.next(), singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1));
        }
        onExtraCallbackWithResult(arrayList);
    }

    default void onWarmupCompleted(@NotNull List<Integer> list, @Nullable SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        if (!onWarmupCompleted() && list.size() < 2) {
            throw new IllegalArgumentException();
        }
        List<Integer> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new getProxyokhttp(((Number) it.next()).intValue(), singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1));
        }
        onExtraCallbackWithResult(arrayList);
    }
}
