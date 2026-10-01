package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TombstoneProtosCauseBuilder<T> extends getByteBuffer<T> {
    final serializeRaw<T> onExtraCallbackWithResult;

    public TombstoneProtosCauseBuilder(serializeRaw<T> serializeraw) {
        this.onExtraCallbackWithResult = serializeraw;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        this.onExtraCallbackWithResult.subscribe(writequoted);
    }
}
