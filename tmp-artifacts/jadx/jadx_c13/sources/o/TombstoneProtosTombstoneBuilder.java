package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TombstoneProtosTombstoneBuilder<T> extends getSelinuxLabelBytes<T> {
    private final T[] IAuthTabCallback;
    private final putThreads<T> onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TombstoneProtosTombstoneBuilder(@NotNull Object[] objArr, @NotNull T[] tArr, int i, int i2, int i3) {
        super(i, i2);
        Intrinsics.checkNotNullParameter(objArr, "");
        Intrinsics.checkNotNullParameter(tArr, "");
        this.IAuthTabCallback = tArr;
        int iIAuthTabCallback = removeThreads.IAuthTabCallback(i2);
        this.onWarmupCompleted = new putThreads<>(objArr, RangesKt___RangesKt.coerceAtMost(i, iIAuthTabCallback), iIAuthTabCallback, i3);
    }

    @Override // o.getSelinuxLabelBytes, java.util.ListIterator, java.util.Iterator
    public T next() {
        onNavigationEvent();
        if (this.onWarmupCompleted.hasNext()) {
            onNavigationEvent(onExtraCallback() + 1);
            return this.onWarmupCompleted.next();
        }
        T[] tArr = this.IAuthTabCallback;
        int iOnExtraCallback = onExtraCallback();
        onNavigationEvent(iOnExtraCallback + 1);
        return tArr[iOnExtraCallback - this.onWarmupCompleted.IAuthTabCallback()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        onWarmupCompleted();
        if (onExtraCallback() > this.onWarmupCompleted.IAuthTabCallback()) {
            T[] tArr = this.IAuthTabCallback;
            onNavigationEvent(onExtraCallback() - 1);
            return tArr[onExtraCallback() - this.onWarmupCompleted.IAuthTabCallback()];
        }
        onNavigationEvent(onExtraCallback() - 1);
        return this.onWarmupCompleted.previous();
    }
}
