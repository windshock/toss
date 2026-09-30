package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SpanStyleKtExternalSyntheticLambda0 implements Savers_androidKtExternalSyntheticLambda7<byte[]> {
    @Override // o.Savers_androidKtExternalSyntheticLambda7
    public int onExtraCallbackWithResult() {
        return 1;
    }

    @Override // o.Savers_androidKtExternalSyntheticLambda7
    public String onWarmupCompleted() {
        return "ByteArrayPool";
    }

    @Override // o.Savers_androidKtExternalSyntheticLambda7
    public int onWarmupCompleted(byte[] bArr) {
        return bArr.length;
    }

    @Override // o.Savers_androidKtExternalSyntheticLambda7
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public byte[] onNavigationEvent(int i2) {
        return new byte[i2];
    }
}
