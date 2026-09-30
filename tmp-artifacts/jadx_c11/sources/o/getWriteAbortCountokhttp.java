package o;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getWriteAbortCountokhttp {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public static final /* synthetic */ Map IAuthTabCallback(Pair[] pairArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback(pairArr);
            obj.hashCode();
            throw null;
        }
        Map mapOnExtraCallback = onExtraCallback(pairArr);
        int i3 = IAuthTabCallback + 73;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return mapOnExtraCallback;
        }
        throw null;
    }

    public static final <V> putokhttp<V> onNavigationEvent(@NotNull Pair<Integer, ? extends V>... pairArr) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pairArr, "");
        if (pairArr.length == 0) {
            int i4 = onExtraCallback + 89;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            throw new IllegalArgumentException("Expected at least one element");
        }
        trackConditionalCacheHitokhttp trackconditionalcachehitokhttp = new trackConditionalCacheHitokhttp((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        int i6 = onExtraCallback + 41;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return trackconditionalcachehitokhttp;
    }

    public static final class onWarmupCompleted<T> implements Comparator {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iIAuthTabCallback = getCodeNameBytes.IAuthTabCallback((Comparable) ((Pair) t).onExtraCallbackWithResult(), (Comparable) ((Pair) t2).onExtraCallbackWithResult());
            if (i3 == 0) {
                int i4 = 28 / 0;
            }
            int i5 = onExtraCallback + 79;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 34 / 0;
            }
            return iIAuthTabCallback;
        }
    }

    private static final <K extends Comparable<? super K>, V> Map<K, V> onExtraCallback(Pair<? extends K, ? extends V>[] pairArr) {
        int i = 2 % 2;
        Pair[] pairArr2 = (Pair[]) ArraysKt.sortedWith(pairArr, new onWarmupCompleted()).toArray(new Pair[0]);
        Map<K, V> mapOnWarmupCompleted = access8100.onWarmupCompleted((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
        int i2 = IAuthTabCallback + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return mapOnWarmupCompleted;
        }
        throw null;
    }
}
