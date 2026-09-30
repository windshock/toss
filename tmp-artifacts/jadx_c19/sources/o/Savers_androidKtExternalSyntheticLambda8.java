package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class Savers_androidKtExternalSyntheticLambda8 implements Savers_androidKtExternalSyntheticLambda7<int[]> {
    @Override // o.Savers_androidKtExternalSyntheticLambda7
    public int onExtraCallbackWithResult() {
        return 4;
    }

    @Override // o.Savers_androidKtExternalSyntheticLambda7
    public String onWarmupCompleted() {
        return "IntegerArrayPool";
    }

    @Override // o.Savers_androidKtExternalSyntheticLambda7
    public int onWarmupCompleted(int[] iArr) {
        return iArr.length;
    }

    @Override // o.Savers_androidKtExternalSyntheticLambda7
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public int[] onNavigationEvent(int i2) {
        return new int[i2];
    }
}
