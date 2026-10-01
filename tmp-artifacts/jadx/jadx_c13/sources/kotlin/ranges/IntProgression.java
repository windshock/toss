package kotlin.ranges;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import o.access15800;
import o.access4300;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class IntProgression implements Iterable<Integer>, KMappedMarker {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private final int IAuthTabCallback;
    private final int onExtraCallback;
    private final int onExtraCallbackWithResult;

    public IntProgression(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.onExtraCallbackWithResult = i;
        this.onExtraCallback = access15800.onExtraCallbackWithResult(i, i2, i3);
        this.IAuthTabCallback = i3;
    }

    public final int getFirst() {
        return this.onExtraCallbackWithResult;
    }

    public final int getLast() {
        return this.onExtraCallback;
    }

    public final int getStep() {
        return this.IAuthTabCallback;
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return new access4300(this.onExtraCallbackWithResult, this.onExtraCallback, this.IAuthTabCallback);
    }

    public boolean isEmpty() {
        return this.IAuthTabCallback > 0 ? this.onExtraCallbackWithResult > this.onExtraCallback : this.onExtraCallbackWithResult < this.onExtraCallback;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof IntProgression)) {
            return false;
        }
        if (isEmpty() && ((IntProgression) obj).isEmpty()) {
            return true;
        }
        IntProgression intProgression = (IntProgression) obj;
        return this.onExtraCallbackWithResult == intProgression.onExtraCallbackWithResult && this.onExtraCallback == intProgression.onExtraCallback && this.IAuthTabCallback == intProgression.IAuthTabCallback;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.onExtraCallbackWithResult * 31) + this.onExtraCallback) * 31) + this.IAuthTabCallback;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.IAuthTabCallback > 0) {
            sb = new StringBuilder();
            sb.append(this.onExtraCallbackWithResult);
            sb.append("..");
            sb.append(this.onExtraCallback);
            sb.append(" step ");
            i = this.IAuthTabCallback;
        } else {
            sb = new StringBuilder();
            sb.append(this.onExtraCallbackWithResult);
            sb.append(" downTo ");
            sb.append(this.onExtraCallback);
            sb.append(" step ");
            i = -this.IAuthTabCallback;
        }
        sb.append(i);
        return sb.toString();
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final IntProgression onExtraCallback(int i, int i2, int i3) {
            return new IntProgression(i, i2, i3);
        }
    }
}
