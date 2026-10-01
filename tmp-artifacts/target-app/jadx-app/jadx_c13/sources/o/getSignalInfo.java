package o;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getSignalInfo<T> extends getSelinuxLabelBytes<T> {
    private final T[] onNavigationEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSignalInfo(@NotNull T[] tArr, int i, int i2) {
        super(i, i2);
        Intrinsics.checkNotNullParameter(tArr, "");
        this.onNavigationEvent = tArr;
    }

    @Override // o.getSelinuxLabelBytes, java.util.ListIterator, java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T[] tArr = this.onNavigationEvent;
        int iOnExtraCallback = onExtraCallback();
        onNavigationEvent(iOnExtraCallback + 1);
        return tArr[iOnExtraCallback];
    }

    @Override // java.util.ListIterator
    public T previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        T[] tArr = this.onNavigationEvent;
        onNavigationEvent(onExtraCallback() - 1);
        return tArr[onExtraCallback()];
    }
}
