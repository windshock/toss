package o;

import android.media.MediaCodec;
import android.os.Bundle;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class AppBarKtExternalSyntheticLambda7 implements AppBarKtExternalSyntheticLambda0 {
    private final MediaCodec onWarmupCompleted;

    @Override // o.AppBarKtExternalSyntheticLambda0
    public void onExtraCallback() {
    }

    @Override // o.AppBarKtExternalSyntheticLambda0
    public void onExtraCallbackWithResult() {
    }

    @Override // o.AppBarKtExternalSyntheticLambda0
    public void onNavigationEvent() {
    }

    @Override // o.AppBarKtExternalSyntheticLambda0
    public void onWarmupCompleted() {
    }

    public AppBarKtExternalSyntheticLambda7(MediaCodec mediaCodec) {
        this.onWarmupCompleted = mediaCodec;
    }

    @Override // o.AppBarKtExternalSyntheticLambda0
    public void onExtraCallback(int i2, int i3, int i4, long j, int i5) throws MediaCodec.CryptoException {
        this.onWarmupCompleted.queueInputBuffer(i2, i3, i4, j, i5);
    }

    @Override // o.AppBarKtExternalSyntheticLambda0
    public void onWarmupCompleted(int i2, int i3, TextFieldSelectionState_androidKtExternalSyntheticLambda2 textFieldSelectionState_androidKtExternalSyntheticLambda2, long j, int i4) throws MediaCodec.CryptoException {
        this.onWarmupCompleted.queueSecureInputBuffer(i2, i3, textFieldSelectionState_androidKtExternalSyntheticLambda2.IAuthTabCallback(), j, i4);
    }

    @Override // o.AppBarKtExternalSyntheticLambda0
    public void IAuthTabCallback(Bundle bundle) {
        this.onWarmupCompleted.setParameters(bundle);
    }
}
