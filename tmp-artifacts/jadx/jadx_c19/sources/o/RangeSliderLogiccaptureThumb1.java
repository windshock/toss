package o;

import java.nio.ByteBuffer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class RangeSliderLogiccaptureThumb1 extends SelectionControllerExternalSyntheticLambda0<RippleConfiguration, RippleKt, RadioButtonKtExternalSyntheticLambda1> implements RadioButtonKtExternalSyntheticLambda0 {
    private final String onExtraCallback;

    @Override // o.RadioButtonKtExternalSyntheticLambda0
    public void IAuthTabCallback(long j) {
    }

    protected abstract RadioButtonKt onExtraCallbackWithResult(byte[] bArr, int i2, boolean z) throws RadioButtonKtExternalSyntheticLambda1;

    public RangeSliderLogiccaptureThumb1(String str) {
        super(new RippleConfiguration[2], new RippleKt[2]);
        this.onExtraCallback = str;
        IAuthTabCallback(1024);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.SelectionControllerExternalSyntheticLambda0
    /* renamed from: IAuthTabCallbackDefault, reason: merged with bridge method [inline-methods] */
    public final RippleConfiguration onNavigationEvent() {
        return new RippleConfiguration();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.SelectionControllerExternalSyntheticLambda0
    /* renamed from: asInterface, reason: merged with bridge method [inline-methods] */
    public final RippleKt onTransact() {
        return new RippleKt() { // from class: o.RangeSliderLogiccaptureThumb1.1
            @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda0
            public void asInterface() {
                RangeSliderLogiccaptureThumb1.this.onWarmupCompleted((RangeSliderLogiccaptureThumb1) this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.SelectionControllerExternalSyntheticLambda0
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public final RadioButtonKtExternalSyntheticLambda1 onWarmupCompleted(Throwable th) {
        return new RadioButtonKtExternalSyntheticLambda1("Unexpected decode error", th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.SelectionControllerExternalSyntheticLambda0
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public final RadioButtonKtExternalSyntheticLambda1 onNavigationEvent(RippleConfiguration rippleConfiguration, RippleKt rippleKt, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(rippleConfiguration.onExtraCallback);
            rippleKt.onExtraCallback(((SelectionControllerExternalSyntheticLambda2) rippleConfiguration).onWarmupCompleted, onExtraCallbackWithResult(byteBuffer.array(), byteBuffer.limit(), z), rippleConfiguration.asInterface);
            rippleKt.IAuthTabCallback = false;
            return null;
        } catch (RadioButtonKtExternalSyntheticLambda1 e) {
            return e;
        }
    }
}
