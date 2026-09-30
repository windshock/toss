package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class buildCommentList$onNavigationEvent<T> extends buildCommentList$onExtraCallbackWithResult<T> {
    private static final long serialVersionUID = 2587302975077663557L;
    final ycxExternalSyntheticLambda0<? super T> downstream;

    buildCommentList$onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, T[] tArr) {
        super(tArr);
        this.downstream = ycxexternalsyntheticlambda0;
    }

    @Override // o.buildCommentList$onExtraCallbackWithResult
    void onNavigationEvent() {
        T[] tArr = this.array;
        int length = tArr.length;
        ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0 = this.downstream;
        for (int i = this.index; i != length; i++) {
            if (this.cancelled) {
                return;
            }
            T t = tArr[i];
            if (t == null) {
                ycxexternalsyntheticlambda0.onWarmupCompleted(new NullPointerException("The element at index " + i + " is null"));
                return;
            }
            ycxexternalsyntheticlambda0.onWarmupCompleted(t);
        }
        if (this.cancelled) {
            return;
        }
        ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
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
        ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0 = this.downstream;
        do {
            long j2 = 0;
            while (true) {
                if (j2 == j || i == length) {
                    if (i == length) {
                        if (this.cancelled) {
                            return;
                        }
                        ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
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
                        ycxexternalsyntheticlambda0.onWarmupCompleted(new NullPointerException("The element at index " + i + " is null"));
                        return;
                    }
                    ycxexternalsyntheticlambda0.onWarmupCompleted(t);
                    j2++;
                    i++;
                }
            }
        } while (j != 0);
    }
}
