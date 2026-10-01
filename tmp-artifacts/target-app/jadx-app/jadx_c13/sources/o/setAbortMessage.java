package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setAbortMessage implements Iterator<String>, KMappedMarker {
    private static final onWarmupCompleted onExtraCallbackWithResult = new onWarmupCompleted(null);
    private int IAuthTabCallback;
    private int onExtraCallback;
    private final CharSequence onNavigationEvent;
    private int onTransact;
    private int onWarmupCompleted;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    public setAbortMessage(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.onNavigationEvent = charSequence;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i;
        int i2;
        int i3 = this.onWarmupCompleted;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.IAuthTabCallback < 0) {
            this.onWarmupCompleted = 2;
            return false;
        }
        int length = this.onNavigationEvent.length();
        int length2 = this.onNavigationEvent.length();
        for (int i4 = this.onTransact; i4 < length2; i4++) {
            char cCharAt = this.onNavigationEvent.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < this.onNavigationEvent.length() && this.onNavigationEvent.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.onWarmupCompleted = 1;
                this.IAuthTabCallback = i;
                this.onExtraCallback = length;
                return true;
            }
        }
        i = -1;
        this.onWarmupCompleted = 1;
        this.IAuthTabCallback = i;
        this.onExtraCallback = length;
        return true;
    }

    @Override // java.util.Iterator
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.onWarmupCompleted = 0;
        int i = this.onExtraCallback;
        int i2 = this.onTransact;
        this.onTransact = this.IAuthTabCallback + i;
        return this.onNavigationEvent.subSequence(i2, i).toString();
    }
}
