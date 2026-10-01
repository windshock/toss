package o;

import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getThreadsOrDefault<E> extends getThreadsCount<E> {
    private final int IAuthTabCallback;
    private final Object[] onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final Object[] onNavigationEvent;

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.IAuthTabCallback;
    }

    public getThreadsOrDefault(@NotNull Object[] objArr, @NotNull Object[] objArr2, int i, int i2) {
        Intrinsics.checkNotNullParameter(objArr, "");
        Intrinsics.checkNotNullParameter(objArr2, "");
        this.onExtraCallback = objArr;
        this.onNavigationEvent = objArr2;
        this.IAuthTabCallback = i;
        this.onExtraCallbackWithResult = i2;
        if (size() <= 32) {
            throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + size()).toString());
        }
        size();
        size();
        RangesKt___RangesKt.coerceAtMost(objArr2.length, 32);
    }

    private final int onWarmupCompleted() {
        return removeThreads.IAuthTabCallback(size());
    }

    @Override // o.getProcessUptime
    public getProcessUptime<E> onWarmupCompleted(E e) {
        int size = size() - onWarmupCompleted();
        if (size < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(this.onNavigationEvent, 32);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
            objArrCopyOf[size] = e;
            return new getThreadsOrDefault(this.onExtraCallback, objArrCopyOf, size() + 1, this.onExtraCallbackWithResult);
        }
        return onWarmupCompleted(this.onExtraCallback, this.onNavigationEvent, removeThreads.onExtraCallback(e));
    }

    private final getThreadsOrDefault<E> onWarmupCompleted(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size();
        int i = this.onExtraCallbackWithResult;
        if ((size >> 5) > (1 << i)) {
            Object[] objArrOnExtraCallback = removeThreads.onExtraCallback(objArr);
            int i2 = this.onExtraCallbackWithResult + 5;
            return new getThreadsOrDefault<>(onExtraCallbackWithResult(objArrOnExtraCallback, i2, objArr2), objArr3, size() + 1, i2);
        }
        return new getThreadsOrDefault<>(onExtraCallbackWithResult(objArr, i, objArr2), objArr3, size() + 1, this.onExtraCallbackWithResult);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object[] onExtraCallbackWithResult(Object[] objArr, int i, Object[] objArr2) {
        Object[] objArrCopyOf;
        int iOnWarmupCompleted = removeThreads.onWarmupCompleted(size() - 1, i);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
            if (objArrCopyOf == null) {
                objArrCopyOf = new Object[32];
            }
        }
        if (i == 5) {
            objArrCopyOf[iOnWarmupCompleted] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iOnWarmupCompleted] = onExtraCallbackWithResult((Object[]) objArrCopyOf[iOnWarmupCompleted], i - 5, objArr2);
        return objArrCopyOf;
    }

    @Override // o.getProcessUptime
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public getThreadsOrThrow<E> IAuthTabCallback() {
        return new getThreadsOrThrow<>(this, this.onExtraCallback, this.onNavigationEvent, this.onExtraCallbackWithResult);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i) {
        RegistersComponents.onExtraCallback(i, size());
        return new TombstoneProtosTombstoneBuilder(this.onExtraCallback, this.onNavigationEvent, i, size(), (this.onExtraCallbackWithResult / 5) + 1);
    }

    private final Object[] onNavigationEvent(int i) {
        if (onWarmupCompleted() <= i) {
            return this.onNavigationEvent;
        }
        Object[] objArr = this.onExtraCallback;
        for (int i2 = this.onExtraCallbackWithResult; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[removeThreads.onWarmupCompleted(i, i2)];
            Intrinsics.checkNotNull(objArr2, "");
            objArr = objArr2;
        }
        return objArr;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public E get(int i) {
        RegistersComponents.onExtraCallbackWithResult(i, size());
        return (E) onNavigationEvent(i)[i & 31];
    }
}
