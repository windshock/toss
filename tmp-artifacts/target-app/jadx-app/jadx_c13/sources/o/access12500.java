package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access12500<T> extends setPc<T, T> {
    private final deserializeDecimalCollection onExtraCallback;
    private final deserializeFloat<? super deserializeUriNullableCollection> onExtraCallbackWithResult;

    public access12500(getByteBuffer<T> getbytebuffer, deserializeFloat<? super deserializeUriNullableCollection> deserializefloat, deserializeDecimalCollection deserializedecimalcollection) {
        super(getbytebuffer);
        this.onExtraCallbackWithResult = deserializefloat;
        this.onExtraCallback = deserializedecimalcollection;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        this.onWarmupCompleted.subscribe(new writeFirstBuf(writequoted, this.onExtraCallbackWithResult, this.onExtraCallback));
    }
}
