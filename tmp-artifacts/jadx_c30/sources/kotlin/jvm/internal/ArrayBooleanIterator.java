package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.BooleanIterator;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class ArrayBooleanIterator extends BooleanIterator {
    private final boolean[] array;
    private int index;

    public ArrayBooleanIterator(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, BuildConfig.FLAVOR);
        this.array = zArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.array.length;
    }

    @Override // kotlin.collections.BooleanIterator
    public boolean nextBoolean() {
        try {
            boolean[] zArr = this.array;
            int i = this.index;
            this.index = i + 1;
            return zArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.index--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
