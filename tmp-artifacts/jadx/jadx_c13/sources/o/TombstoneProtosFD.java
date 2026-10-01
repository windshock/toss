package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TombstoneProtosFD<T> extends getByteBuffer<T> {
    final T[] onWarmupCompleted;

    public TombstoneProtosFD(T[] tArr) {
        this.onWarmupCompleted = tArr;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        onExtraCallback onextracallback = new onExtraCallback(writequoted, this.onWarmupCompleted);
        writequoted.IAuthTabCallback(onextracallback);
        if (onextracallback.onExtraCallback) {
            return;
        }
        onextracallback.onNavigationEvent();
    }

    static final class onExtraCallback<T> extends readLongNumber<T> {
        int IAuthTabCallback;
        boolean onExtraCallback;
        final writeQuoted<? super T> onExtraCallbackWithResult;
        final T[] onNavigationEvent;
        volatile boolean onWarmupCompleted;

        onExtraCallback(writeQuoted<? super T> writequoted, T[] tArr) {
            this.onExtraCallbackWithResult = writequoted;
            this.onNavigationEvent = tArr;
        }

        @Override // o.parseFloatGeneric
        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.onExtraCallback = true;
            return 1;
        }

        @Override // o.parsePositiveDecimal
        public T poll() {
            int i = this.IAuthTabCallback;
            T[] tArr = this.onNavigationEvent;
            if (i == tArr.length) {
                return null;
            }
            this.IAuthTabCallback = i + 1;
            return (T) floatExponent.onExtraCallbackWithResult((Object) tArr[i], "The array element is null");
        }

        @Override // o.parsePositiveDecimal
        public boolean isEmpty() {
            return this.IAuthTabCallback == this.onNavigationEvent.length;
        }

        @Override // o.parsePositiveDecimal
        public void clear() {
            this.IAuthTabCallback = this.onNavigationEvent.length;
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.onWarmupCompleted = true;
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onWarmupCompleted;
        }

        void onNavigationEvent() {
            T[] tArr = this.onNavigationEvent;
            int length = tArr.length;
            for (int i = 0; i < length && !isDisposed(); i++) {
                T t = tArr[i];
                if (t == null) {
                    this.onExtraCallbackWithResult.onExtraCallbackWithResult(new NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                this.onExtraCallbackWithResult.onExtraCallback(t);
            }
            if (isDisposed()) {
                return;
            }
            this.onExtraCallbackWithResult.onExtraCallback();
        }
    }
}
