package o;

import java.util.Comparator;
import kotlin.comparisons.ReverseOrderComparator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.getFaultAddress;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class getFaultAddress {
    public static <T> int onExtraCallback(T t, T t2, @NotNull Function1<? super T, ? extends Comparable<?>>... function1Arr) {
        Intrinsics.checkNotNullParameter(function1Arr, "");
        if (function1Arr.length <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return onExtraCallbackWithResult(t, t2, function1Arr);
    }

    private static final <T> int onExtraCallbackWithResult(T t, T t2, Function1<? super T, ? extends Comparable<?>>[] function1Arr) {
        for (Function1<? super T, ? extends Comparable<?>> function1 : function1Arr) {
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(function1.invoke(t), function1.invoke(t2));
            if (iOnExtraCallbackWithResult != 0) {
                return iOnExtraCallbackWithResult;
            }
        }
        return 0;
    }

    public static <T extends Comparable<?>> int onExtraCallbackWithResult(@Nullable T t, @Nullable T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    public static <T> Comparator<T> IAuthTabCallback(@NotNull final Function1<? super T, ? extends Comparable<?>>... function1Arr) {
        Intrinsics.checkNotNullParameter(function1Arr, "");
        if (function1Arr.length <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$$ExternalSyntheticLambda3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return getFaultAddress.onWarmupCompleted(function1Arr, obj, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onWarmupCompleted(Function1[] function1Arr, Object obj, Object obj2) {
        return onExtraCallbackWithResult(obj, obj2, (Function1<? super Object, ? extends Comparable<?>>[]) function1Arr);
    }

    public static final class onExtraCallbackWithResult<T> implements Comparator {
        final /* synthetic */ Function1<T, Comparable<?>> onExtraCallback;

        /* JADX WARN: Multi-variable type inference failed */
        public onExtraCallbackWithResult(Function1<? super T, ? extends Comparable<?>> function1) {
            this.onExtraCallback = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Function1<T, Comparable<?>> function1 = this.onExtraCallback;
            return getFaultAddress.onExtraCallbackWithResult(function1.invoke(t), function1.invoke(t2));
        }
    }

    public static final class onNavigationEvent<T> implements Comparator {
        final /* synthetic */ Function1<T, Comparable<?>> onExtraCallbackWithResult;

        /* JADX WARN: Multi-variable type inference failed */
        public onNavigationEvent(Function1<? super T, ? extends Comparable<?>> function1) {
            this.onExtraCallbackWithResult = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Function1<T, Comparable<?>> function1 = this.onExtraCallbackWithResult;
            return getFaultAddress.onExtraCallbackWithResult(function1.invoke(t2), function1.invoke(t));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onWarmupCompleted(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        int iCompare = comparator.compare(obj, obj2);
        return iCompare != 0 ? iCompare : comparator2.compare(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onExtraCallbackWithResult(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        int iCompare = comparator.compare(obj, obj2);
        return iCompare != 0 ? iCompare : comparator2.compare(obj2, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onExtraCallback(Comparator comparator, Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return comparator.compare(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int IAuthTabCallback(Comparator comparator, Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return comparator.compare(obj, obj2);
    }

    public static <T extends Comparable<? super T>> Comparator<T> onExtraCallbackWithResult() {
        getSenderPid getsenderpid = getSenderPid.onWarmupCompleted;
        Intrinsics.checkNotNull(getsenderpid, "");
        return getsenderpid;
    }

    public static <T extends Comparable<? super T>> Comparator<T> onNavigationEvent() {
        ReverseOrderComparator reverseOrderComparator = ReverseOrderComparator.onWarmupCompleted;
        Intrinsics.checkNotNull(reverseOrderComparator, "");
        return reverseOrderComparator;
    }
}
