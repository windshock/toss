package o;

import kotlin.collections.CharIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class getRegistersOrBuilderList implements Iterable<Character>, KMappedMarker {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private final char onExtraCallback;
    private final int onNavigationEvent;
    private final char onWarmupCompleted;

    public getRegistersOrBuilderList(char c, char c2, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.onExtraCallback = c;
        this.onWarmupCompleted = (char) access15800.onExtraCallbackWithResult(c, c2, i);
        this.onNavigationEvent = i;
    }

    public final char IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public final char onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public final int onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    @Override // java.lang.Iterable
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public CharIterator iterator() {
        return new getTaggedAddrCtrl(this.onExtraCallback, this.onWarmupCompleted, this.onNavigationEvent);
    }

    public boolean isEmpty() {
        return this.onNavigationEvent > 0 ? Intrinsics.compare((int) this.onExtraCallback, (int) this.onWarmupCompleted) > 0 : Intrinsics.compare((int) this.onExtraCallback, (int) this.onWarmupCompleted) < 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof getRegistersOrBuilderList)) {
            return false;
        }
        if (isEmpty() && ((getRegistersOrBuilderList) obj).isEmpty()) {
            return true;
        }
        getRegistersOrBuilderList getregistersorbuilderlist = (getRegistersOrBuilderList) obj;
        return this.onExtraCallback == getregistersorbuilderlist.onExtraCallback && this.onWarmupCompleted == getregistersorbuilderlist.onWarmupCompleted && this.onNavigationEvent == getregistersorbuilderlist.onNavigationEvent;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.onExtraCallback * 31) + this.onWarmupCompleted) * 31) + this.onNavigationEvent;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.onNavigationEvent > 0) {
            sb = new StringBuilder();
            sb.append(this.onExtraCallback);
            sb.append("..");
            sb.append(this.onWarmupCompleted);
            sb.append(" step ");
            i = this.onNavigationEvent;
        } else {
            sb = new StringBuilder();
            sb.append(this.onExtraCallback);
            sb.append(" downTo ");
            sb.append(this.onWarmupCompleted);
            sb.append(" step ");
            i = -this.onNavigationEvent;
        }
        sb.append(i);
        return sb.toString();
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final getRegistersOrBuilderList onNavigationEvent(char c, char c2, int i) {
            return new getRegistersOrBuilderList(c, c2, i);
        }
    }
}
