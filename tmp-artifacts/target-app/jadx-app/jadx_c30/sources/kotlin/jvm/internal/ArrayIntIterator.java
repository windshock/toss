package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.IntIterator;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class ArrayIntIterator extends IntIterator {
    private final int[] array;
    private int index;

    public ArrayIntIterator(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, BuildConfig.FLAVOR);
        this.array = iArr;
    }

    public boolean hasNext() {
        return this.index < this.array.length;
    }

    public int nextInt() {
        try {
            int[] iArr = this.array;
            int i = this.index;
            this.index = i + 1;
            return iArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.index--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
