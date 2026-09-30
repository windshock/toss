package o;

import java.util.NoSuchElementException;
import kotlin.collections.LongIterator;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TombstoneProtosTombstone extends LongIterator {
    private long IAuthTabCallback;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private boolean onWarmupCompleted;

    public TombstoneProtosTombstone(long j, long j2, long j3) {
        this.onExtraCallbackWithResult = j3;
        this.onExtraCallback = j2;
        boolean z = j3 <= 0 ? j >= j2 : j <= j2;
        this.onWarmupCompleted = z;
        this.IAuthTabCallback = z ? j : j2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.onWarmupCompleted;
    }

    @Override // kotlin.collections.LongIterator
    public long nextLong() {
        long j = this.IAuthTabCallback;
        if (j == this.onExtraCallback) {
            if (!this.onWarmupCompleted) {
                throw new NoSuchElementException();
            }
            this.onWarmupCompleted = false;
            return j;
        }
        this.IAuthTabCallback = this.onExtraCallbackWithResult + j;
        return j;
    }
}
