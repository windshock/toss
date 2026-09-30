package o;

import java.util.List;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DatePickerKtExternalSyntheticLambda3<T> extends AbstractList<T> {
    private final int IAuthTabCallback;
    private final List<T> onExtraCallback;
    private final int onExtraCallbackWithResult;

    /* JADX WARN: Multi-variable type inference failed */
    public DatePickerKtExternalSyntheticLambda3(int i2, int i3, @NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.IAuthTabCallback = i2;
        this.onExtraCallbackWithResult = i3;
        this.onExtraCallback = list;
    }

    public int getSize() {
        return this.IAuthTabCallback + this.onExtraCallback.size() + this.onExtraCallbackWithResult;
    }

    public T get(int i2) {
        if (i2 >= 0 && i2 < this.IAuthTabCallback) {
            return null;
        }
        int i3 = this.IAuthTabCallback;
        if (i2 < this.onExtraCallback.size() + i3 && i3 <= i2) {
            return this.onExtraCallback.get(i2 - this.IAuthTabCallback);
        }
        int i4 = this.IAuthTabCallback;
        int size = this.onExtraCallback.size();
        if (i2 < size() && i4 + size <= i2) {
            return null;
        }
        throw new IndexOutOfBoundsException("Illegal attempt to access index " + i2 + " in ItemSnapshotList of size " + size());
    }
}
