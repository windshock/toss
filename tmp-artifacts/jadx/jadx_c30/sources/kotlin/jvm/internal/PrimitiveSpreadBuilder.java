package kotlin.jvm.internal;

import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class PrimitiveSpreadBuilder<T> {
    private int position;
    private final int size;
    private final T[] spreads;

    private static /* synthetic */ void getSpreads$annotations() {
    }

    protected abstract int getSize(@NotNull T t);

    public PrimitiveSpreadBuilder(int i) {
        this.size = i;
        this.spreads = (T[]) new Object[i];
    }

    protected final int getPosition() {
        return this.position;
    }

    protected final void setPosition(int i) {
        this.position = i;
    }

    public final void addSpread(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, BuildConfig.FLAVOR);
        T[] tArr = this.spreads;
        int i = this.position;
        this.position = i + 1;
        tArr[i] = t;
    }

    protected final int size() {
        int i = this.size - 1;
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        int size = 0;
        while (true) {
            T t = this.spreads[i2];
            size += t != null ? getSize(t) : 1;
            if (i2 == i) {
                return size;
            }
            i2++;
        }
    }

    protected final T toArray(@NotNull T t, @NotNull T t2) {
        int i;
        Intrinsics.checkNotNullParameter(t, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(t2, BuildConfig.FLAVOR);
        int i2 = this.size - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int i4 = 0;
            int i5 = 0;
            i = 0;
            while (true) {
                T t3 = this.spreads[i4];
                if (t3 != null) {
                    if (i5 < i4) {
                        int i6 = i4 - i5;
                        System.arraycopy(t, i5, t2, i, i6);
                        i += i6;
                    }
                    int size = getSize(t3);
                    System.arraycopy(t3, 0, t2, i, size);
                    i += size;
                    i5 = i4 + 1;
                }
                if (i4 == i2) {
                    break;
                }
                i4++;
            }
            i3 = i5;
        } else {
            i = 0;
        }
        int i7 = this.size;
        if (i3 < i7) {
            System.arraycopy(t, i3, t2, i, i7 - i3);
        }
        return t2;
    }
}
