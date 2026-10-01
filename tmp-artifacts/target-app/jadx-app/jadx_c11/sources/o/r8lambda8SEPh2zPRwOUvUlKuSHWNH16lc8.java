package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface r8lambda8SEPh2zPRwOUvUlKuSHWNH16lc8 extends Comparable<r8lambda8SEPh2zPRwOUvUlKuSHWNH16lc8> {
    int IAuthTabCallback();

    @Override // java.lang.Comparable
    /* synthetic */ default int compareTo(r8lambda8SEPh2zPRwOUvUlKuSHWNH16lc8 r8lambda8seph2zprwouvulkushwnh16lc8) {
        int i = 2 % 2;
        return IAuthTabCallback(r8lambda8seph2zprwouvulkushwnh16lc8);
    }

    default int IAuthTabCallback(@NotNull r8lambda8SEPh2zPRwOUvUlKuSHWNH16lc8 r8lambda8seph2zprwouvulkushwnh16lc8) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda8seph2zprwouvulkushwnh16lc8, "");
        if (onExtraCallbackWithResult(r8lambda8seph2zprwouvulkushwnh16lc8)) {
            return Intrinsics.compare(IAuthTabCallback(), r8lambda8seph2zprwouvulkushwnh16lc8.IAuthTabCallback());
        }
        throw new IllegalArgumentException("같은 타입의 TradingHourState끼리만 비교할 수 있습니다.");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private default boolean onExtraCallbackWithResult(r8lambda8SEPh2zPRwOUvUlKuSHWNH16lc8 r8lambda8seph2zprwouvulkushwnh16lc8) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        if (this instanceof r8lambdagVtXTYSb8ZVmQUSi5yaVb9giUk) {
            return r8lambda8seph2zprwouvulkushwnh16lc8 instanceof r8lambdagVtXTYSb8ZVmQUSi5yaVb9giUk;
        }
        if (this instanceof r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted) {
            return r8lambda8seph2zprwouvulkushwnh16lc8 instanceof r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onWarmupCompleted;
        }
        if (!(!(this instanceof r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult))) {
            return r8lambda8seph2zprwouvulkushwnh16lc8 instanceof r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult;
        }
        throw new NoWhenBranchMatchedException();
    }
}
