package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.LongIterator;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class ArrayLongIterator extends LongIterator {
    private final long[] array;
    private int index;

    public ArrayLongIterator(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, BuildConfig.FLAVOR);
        this.array = jArr;
    }

    public boolean hasNext() {
        return this.index < this.array.length;
    }

    public long nextLong() {
        try {
            long[] jArr = this.array;
            int i = this.index;
            this.index = i + 1;
            return jArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.index--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
