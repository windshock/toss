package o;

import java.util.NoSuchElementException;
import kotlin.collections.CharIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getTaggedAddrCtrl extends CharIterator {
    private boolean IAuthTabCallback;
    private final int onExtraCallbackWithResult;
    private int onNavigationEvent;
    private final int onWarmupCompleted;

    public getTaggedAddrCtrl(char c, char c2, int i) {
        this.onExtraCallbackWithResult = i;
        this.onWarmupCompleted = c2;
        boolean z = i <= 0 ? Intrinsics.compare((int) c, (int) c2) >= 0 : Intrinsics.compare((int) c, (int) c2) <= 0;
        this.IAuthTabCallback = z;
        this.onNavigationEvent = z ? c : c2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.IAuthTabCallback;
    }

    @Override // kotlin.collections.CharIterator
    public char nextChar() {
        int i = this.onNavigationEvent;
        if (i == this.onWarmupCompleted) {
            if (!this.IAuthTabCallback) {
                throw new NoSuchElementException();
            }
            this.IAuthTabCallback = false;
        } else {
            this.onNavigationEvent = this.onExtraCallbackWithResult + i;
        }
        return (char) i;
    }
}
