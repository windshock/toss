package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public enum deserializeShort implements parseDoubleGeneric<Object> {
    INSTANCE,
    NEVER;

    @Override // o.parsePositiveDecimal
    public void clear() {
    }

    @Override // o.deserializeUriNullableCollection
    public void dispose() {
    }

    @Override // o.parsePositiveDecimal
    public boolean isEmpty() {
        return true;
    }

    @Override // o.parsePositiveDecimal
    public Object poll() throws Exception {
        return null;
    }

    @Override // o.parseFloatGeneric
    public int requestFusion(int i) {
        return i & 2;
    }

    @Override // o.deserializeUriNullableCollection
    public boolean isDisposed() {
        return this == INSTANCE;
    }

    public static void complete(writeQuoted<?> writequoted) {
        writequoted.IAuthTabCallback(INSTANCE);
        writequoted.onExtraCallback();
    }

    public static void complete(ensureCapacity<?> ensurecapacity) {
        ensurecapacity.IAuthTabCallback(INSTANCE);
        ensurecapacity.onExtraCallback();
    }

    public static void error(Throwable th, writeQuoted<?> writequoted) {
        writequoted.IAuthTabCallback(INSTANCE);
        writequoted.onExtraCallbackWithResult(th);
    }

    public static void complete(JsonReaderDoublePrecision jsonReaderDoublePrecision) {
        jsonReaderDoublePrecision.IAuthTabCallback(INSTANCE);
        jsonReaderDoublePrecision.onExtraCallback();
    }

    public static void error(Throwable th, JsonReaderDoublePrecision jsonReaderDoublePrecision) {
        jsonReaderDoublePrecision.IAuthTabCallback(INSTANCE);
        jsonReaderDoublePrecision.onExtraCallbackWithResult(th);
    }

    public static void error(Throwable th, deserializeIpNullableCollection<?> deserializeipnullablecollection) {
        deserializeipnullablecollection.IAuthTabCallback(INSTANCE);
        deserializeipnullablecollection.onExtraCallbackWithResult(th);
    }

    public static void error(Throwable th, ensureCapacity<?> ensurecapacity) {
        ensurecapacity.IAuthTabCallback(INSTANCE);
        ensurecapacity.onExtraCallbackWithResult(th);
    }

    @Override // o.parsePositiveDecimal
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
