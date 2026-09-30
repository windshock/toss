package o;

import java.util.NoSuchElementException;
import kotlin.collections.IntIterator;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access4300 extends IntIterator {
    private int onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private boolean onWarmupCompleted;

    public access4300(int i, int i2, int i3) {
        this.onNavigationEvent = i3;
        this.onExtraCallbackWithResult = i2;
        boolean z = i3 <= 0 ? i >= i2 : i <= i2;
        this.onWarmupCompleted = z;
        this.onExtraCallback = z ? i : i2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.onWarmupCompleted;
    }

    @Override // kotlin.collections.IntIterator
    public int nextInt() {
        int i = this.onExtraCallback;
        if (i == this.onExtraCallbackWithResult) {
            if (!this.onWarmupCompleted) {
                throw new NoSuchElementException();
            }
            this.onWarmupCompleted = false;
            return i;
        }
        this.onExtraCallback = this.onNavigationEvent + i;
        return i;
    }
}
