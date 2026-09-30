package o;

import io.realm.internal.OsSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class access11600<E> implements Iterator<E> {
    public final TombstoneProtosLogMessageOrBuilder onExtraCallback;
    private int onExtraCallbackWithResult = -1;
    public final OsSet onWarmupCompleted;

    public access11600(OsSet osSet, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
        this.onWarmupCompleted = osSet;
        this.onExtraCallback = tombstoneProtosLogMessageOrBuilder;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return ((long) (this.onExtraCallbackWithResult + 1)) < this.onWarmupCompleted.onWarmupCompleted();
    }

    @Override // java.util.Iterator
    public E next() {
        this.onExtraCallbackWithResult++;
        long jOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted();
        int i = this.onExtraCallbackWithResult;
        if (i >= jOnWarmupCompleted) {
            throw new NoSuchElementException("Cannot access index " + this.onExtraCallbackWithResult + " when size is " + jOnWarmupCompleted + ". Remember to check hasNext() before using next().");
        }
        return onExtraCallbackWithResult(i);
    }

    protected E onExtraCallbackWithResult(int i) {
        return (E) this.onWarmupCompleted.onWarmupCompleted(i);
    }
}
