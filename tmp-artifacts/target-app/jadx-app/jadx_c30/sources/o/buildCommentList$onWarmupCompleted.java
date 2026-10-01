package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class buildCommentList$onWarmupCompleted<T> extends buildCommentList$onExtraCallbackWithResult<T> {
    private static final long serialVersionUID = 2587302975077663557L;
    final deserializeShortCollection<? super T> downstream;

    buildCommentList$onWarmupCompleted(deserializeShortCollection<? super T> deserializeshortcollection, T[] tArr) {
        super(tArr);
        this.downstream = deserializeshortcollection;
    }

    @Override // o.buildCommentList$onExtraCallbackWithResult
    void onNavigationEvent() {
        T[] tArr = this.array;
        int length = tArr.length;
        deserializeShortCollection<? super T> deserializeshortcollection = this.downstream;
        for (int i = this.index; i != length; i++) {
            if (this.cancelled) {
                return;
            }
            T t = tArr[i];
            if (t == null) {
                deserializeshortcollection.onWarmupCompleted(new NullPointerException("The element at index " + i + " is null"));
                return;
            }
            deserializeshortcollection.onExtraCallback(t);
        }
        if (this.cancelled) {
            return;
        }
        deserializeshortcollection.onExtraCallbackWithResult();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        r10.index = r2;
        r11 = addAndGet(-r6);
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.buildCommentList$onExtraCallbackWithResult
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void IAuthTabCallback(long j) {
        T[] tArr = this.array;
        int length = tArr.length;
        int i = this.index;
        deserializeShortCollection<? super T> deserializeshortcollection = this.downstream;
        do {
            long j2 = 0;
            while (true) {
                if (j2 == j || i == length) {
                    if (i == length) {
                        if (this.cancelled) {
                            return;
                        }
                        deserializeshortcollection.onExtraCallbackWithResult();
                        return;
                    } else {
                        j = get();
                        if (j2 == j) {
                            break;
                        }
                    }
                } else {
                    if (this.cancelled) {
                        return;
                    }
                    T t = tArr[i];
                    if (t == null) {
                        deserializeshortcollection.onWarmupCompleted(new NullPointerException("The element at index " + i + " is null"));
                        return;
                    }
                    if (deserializeshortcollection.onExtraCallback(t)) {
                        j2++;
                    }
                    i++;
                }
            }
        } while (j != 0);
    }
}
