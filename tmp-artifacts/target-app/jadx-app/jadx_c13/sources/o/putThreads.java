package o;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class putThreads<E> extends getSelinuxLabelBytes<E> {
    private boolean IAuthTabCallback;
    private int onExtraCallbackWithResult;
    private Object[] onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public putThreads(@NotNull Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        Intrinsics.checkNotNullParameter(objArr, "");
        this.onExtraCallbackWithResult = i3;
        Object[] objArr2 = new Object[i3];
        this.onWarmupCompleted = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.IAuthTabCallback = r5;
        objArr2[0] = objArr;
        IAuthTabCallback(i - r5, 1);
    }

    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final void IAuthTabCallback(@NotNull Object[] objArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(objArr, "");
        onNavigationEvent(i);
        onWarmupCompleted(i2);
        this.onExtraCallbackWithResult = i3;
        if (this.onWarmupCompleted.length < i3) {
            this.onWarmupCompleted = new Object[i3];
        }
        this.onWarmupCompleted[0] = objArr;
        ?? r0 = i == i2 ? 1 : 0;
        this.IAuthTabCallback = r0;
        IAuthTabCallback(i - r0, 1);
    }

    private final void IAuthTabCallback(int i, int i2) {
        int i3 = (this.onExtraCallbackWithResult - i2) * 5;
        while (i2 < this.onExtraCallbackWithResult) {
            Object[] objArr = this.onWarmupCompleted;
            Object obj = objArr[i2 - 1];
            Intrinsics.checkNotNull(obj, "");
            objArr[i2] = ((Object[]) obj)[removeThreads.onWarmupCompleted(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    private final void IAuthTabCallback(int i) {
        int i2 = 0;
        while (removeThreads.onWarmupCompleted(onExtraCallback(), i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            IAuthTabCallback(onExtraCallback(), ((this.onExtraCallbackWithResult - 1) - (i2 / 5)) + 1);
        }
    }

    private final E onExtraCallbackWithResult() {
        int iOnExtraCallback = onExtraCallback();
        Object obj = this.onWarmupCompleted[this.onExtraCallbackWithResult - 1];
        Intrinsics.checkNotNull(obj, "");
        return (E) ((Object[]) obj)[iOnExtraCallback & 31];
    }

    @Override // o.getSelinuxLabelBytes, java.util.ListIterator, java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E eOnExtraCallbackWithResult = onExtraCallbackWithResult();
        onNavigationEvent(onExtraCallback() + 1);
        if (onExtraCallback() == IAuthTabCallback()) {
            this.IAuthTabCallback = true;
            return eOnExtraCallbackWithResult;
        }
        IAuthTabCallback(0);
        return eOnExtraCallbackWithResult;
    }

    @Override // java.util.ListIterator
    public E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        onNavigationEvent(onExtraCallback() - 1);
        if (this.IAuthTabCallback) {
            this.IAuthTabCallback = false;
            return onExtraCallbackWithResult();
        }
        IAuthTabCallback(31);
        return onExtraCallbackWithResult();
    }
}
