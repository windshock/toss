package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setMemoryError<T> extends setPc<T, T> {
    final deserializeLongCollection<? super T> onNavigationEvent;

    public setMemoryError(serializeRaw<T> serializeraw, deserializeLongCollection<? super T> deserializelongcollection) {
        super(serializeraw);
        this.onNavigationEvent = deserializelongcollection;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        this.onWarmupCompleted.subscribe(new IAuthTabCallback(writequoted, this.onNavigationEvent));
    }

    static final class IAuthTabCallback<T> extends parseNumberGeneric<T, T> {
        final deserializeLongCollection<? super T> onTransact;

        IAuthTabCallback(writeQuoted<? super T> writequoted, deserializeLongCollection<? super T> deserializelongcollection) {
            super(writequoted);
            this.onTransact = deserializelongcollection;
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            if (this.onExtraCallbackWithResult == 0) {
                try {
                    if (this.onTransact.test(t)) {
                        this.onWarmupCompleted.onExtraCallback(t);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    onWarmupCompleted(th);
                    return;
                }
            }
            this.onWarmupCompleted.onExtraCallback(null);
        }

        @Override // o.parseFloatGeneric
        public int requestFusion(int i) {
            return IAuthTabCallback(i);
        }

        @Override // o.parsePositiveDecimal
        public T poll() throws Exception {
            T tPoll;
            do {
                tPoll = this.IAuthTabCallback.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.onTransact.test(tPoll));
            return tPoll;
        }
    }
}
