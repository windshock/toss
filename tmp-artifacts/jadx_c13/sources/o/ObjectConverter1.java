package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ObjectConverter1<T> extends getByteBuffer<T> {
    final JsonReaderErrorInfo onWarmupCompleted;

    public ObjectConverter1(JsonReaderErrorInfo jsonReaderErrorInfo) {
        this.onWarmupCompleted = jsonReaderErrorInfo;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        this.onWarmupCompleted.onExtraCallbackWithResult(new onNavigationEvent(writequoted));
    }

    static final class onNavigationEvent extends readLongNumber<Void> implements JsonReaderDoublePrecision {
        final writeQuoted<?> onExtraCallback;
        deserializeUriNullableCollection onExtraCallbackWithResult;

        @Override // o.parsePositiveDecimal
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public Void poll() throws Exception {
            return null;
        }

        @Override // o.parsePositiveDecimal
        public void clear() {
        }

        @Override // o.parsePositiveDecimal
        public boolean isEmpty() {
            return true;
        }

        @Override // o.parseFloatGeneric
        public int requestFusion(int i) {
            return i & 2;
        }

        onNavigationEvent(writeQuoted<?> writequoted) {
            this.onExtraCallback = writequoted;
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallback() {
            this.onExtraCallback.onExtraCallback();
        }

        @Override // o.JsonReaderDoublePrecision
        public void onExtraCallbackWithResult(Throwable th) {
            this.onExtraCallback.onExtraCallbackWithResult(th);
        }

        @Override // o.JsonReaderDoublePrecision
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.onExtraCallbackWithResult, deserializeurinullablecollection)) {
                this.onExtraCallbackWithResult = deserializeurinullablecollection;
                this.onExtraCallback.IAuthTabCallback(this);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.onExtraCallbackWithResult.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onExtraCallbackWithResult.isDisposed();
        }
    }
}
