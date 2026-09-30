package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.FloatIterator;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class ArrayFloatIterator extends FloatIterator {
    private final float[] array;
    private int index;

    public ArrayFloatIterator(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, BuildConfig.FLAVOR);
        this.array = fArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.array.length;
    }

    @Override // kotlin.collections.FloatIterator
    public float nextFloat() {
        try {
            float[] fArr = this.array;
            int i = this.index;
            this.index = i + 1;
            return fArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.index--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
