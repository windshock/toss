package o;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.getRelativeTop;
import o.toJSONObject$onWarmupCompleted;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class px2dip {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final getRelativeTop.onWarmupCompleted onExtraCallbackWithResult(@NotNull getRelativeTop.onWarmupCompleted onwarmupcompleted, @NotNull toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted) throws NoWhenBranchMatchedException {
        List mutableList;
        boolean z;
        List list;
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(tojsonobject_onwarmupcompleted, "");
        List mutableList2 = CollectionsKt.toMutableList(onwarmupcompleted.onNavigationEvent());
        mutableList2.remove(tojsonobject_onwarmupcompleted);
        toJSONObject$onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresultAsBinder = tojsonobject_onwarmupcompleted.asBinder();
        if (!(onextracallbackwithresultAsBinder instanceof toJSONObject$onWarmupCompleted.onExtraCallbackWithResult.onExtraCallbackWithResult)) {
            if (onextracallbackwithresultAsBinder instanceof toJSONObject$onWarmupCompleted.onExtraCallbackWithResult.onExtraCallback) {
                int i5 = onWarmupCompleted + 67;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                List mutableList3 = CollectionsKt.toMutableList(onwarmupcompleted.onExtraCallbackWithResult());
                mutableList3.add(tojsonobject_onwarmupcompleted);
                return getRelativeTop.onWarmupCompleted.IAuthTabCallback(onwarmupcompleted, false, (List) null, mutableList3, mutableList2, 3, (Object) null);
            }
            if (!(onextracallbackwithresultAsBinder instanceof toJSONObject$onWarmupCompleted.onExtraCallbackWithResult.IAuthTabCallback)) {
                throw new NoWhenBranchMatchedException();
            }
            int i7 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return onwarmupcompleted;
        }
        int i9 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i9 % 128;
        if (i9 % 2 != 0) {
            mutableList = CollectionsKt.toMutableList(onwarmupcompleted.onWarmupCompleted());
            mutableList.add(tojsonobject_onwarmupcompleted);
            z = false;
            list = null;
            i = 3;
        } else {
            mutableList = CollectionsKt.toMutableList(onwarmupcompleted.onWarmupCompleted());
            mutableList.add(tojsonobject_onwarmupcompleted);
            z = false;
            list = null;
            i = 5;
        }
        getRelativeTop.onWarmupCompleted onwarmupcompletedIAuthTabCallback = getRelativeTop.onWarmupCompleted.IAuthTabCallback(onwarmupcompleted, z, mutableList, list, mutableList2, i, (Object) null);
        int i10 = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 26 / 0;
        }
        return onwarmupcompletedIAuthTabCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final getRelativeTop.onWarmupCompleted onNavigationEvent(@NotNull getRelativeTop.onWarmupCompleted onwarmupcompleted, @NotNull toJSONObject$onWarmupCompleted tojsonobject_onwarmupcompleted) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(tojsonobject_onwarmupcompleted, "");
        toJSONObject$onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresultAsBinder = tojsonobject_onwarmupcompleted.asBinder();
        if (Intrinsics.areEqual(onextracallbackwithresultAsBinder, toJSONObject$onWarmupCompleted.onExtraCallbackWithResult.onExtraCallbackWithResult.onExtraCallback)) {
            List mutableList = CollectionsKt.toMutableList(onwarmupcompleted.onNavigationEvent());
            List mutableList2 = CollectionsKt.toMutableList(onwarmupcompleted.onWarmupCompleted());
            mutableList.add(0, tojsonobject_onwarmupcompleted);
            mutableList2.remove(tojsonobject_onwarmupcompleted);
            return getRelativeTop.onWarmupCompleted.IAuthTabCallback(onwarmupcompleted, false, mutableList2, (List) null, mutableList, 5, (Object) null);
        }
        if (Intrinsics.areEqual(onextracallbackwithresultAsBinder, toJSONObject$onWarmupCompleted.onExtraCallbackWithResult.onExtraCallback.onExtraCallbackWithResult)) {
            List mutableList3 = CollectionsKt.toMutableList(onwarmupcompleted.onNavigationEvent());
            List mutableList4 = CollectionsKt.toMutableList(onwarmupcompleted.onExtraCallbackWithResult());
            mutableList3.add(0, tojsonobject_onwarmupcompleted);
            mutableList4.remove(tojsonobject_onwarmupcompleted);
            return getRelativeTop.onWarmupCompleted.IAuthTabCallback(onwarmupcompleted, false, (List) null, mutableList4, mutableList3, 3, (Object) null);
        }
        if (!(onextracallbackwithresultAsBinder instanceof toJSONObject$onWarmupCompleted.onExtraCallbackWithResult.IAuthTabCallback)) {
            throw new NoWhenBranchMatchedException();
        }
        int i4 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompleted;
    }
}
