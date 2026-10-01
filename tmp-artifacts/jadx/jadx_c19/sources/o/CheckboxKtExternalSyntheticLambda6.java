package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class CheckboxKtExternalSyntheticLambda6 extends RangeSliderLogiccaptureThumb1 {
    private final RippleKtExternalSyntheticLambda0 onWarmupCompleted;

    public CheckboxKtExternalSyntheticLambda6(String str, RippleKtExternalSyntheticLambda0 rippleKtExternalSyntheticLambda0) {
        super(str);
        this.onWarmupCompleted = rippleKtExternalSyntheticLambda0;
    }

    @Override // o.RangeSliderLogiccaptureThumb1
    public RadioButtonKt onExtraCallbackWithResult(byte[] bArr, int i2, boolean z) {
        if (z) {
            this.onWarmupCompleted.onNavigationEvent();
        }
        return this.onWarmupCompleted.onNavigationEvent(bArr, 0, i2);
    }
}
