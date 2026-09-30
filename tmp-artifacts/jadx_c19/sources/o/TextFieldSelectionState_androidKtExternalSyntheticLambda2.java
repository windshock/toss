package o;

import android.media.MediaCodec;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldSelectionState_androidKtExternalSyntheticLambda2 {
    public int IAuthTabCallback;
    private final onExtraCallbackWithResult IAuthTabCallbackDefault;
    private final MediaCodec.CryptoInfo IAuthTabCallbackStub;
    public int asBinder;
    public int[] asInterface;
    public int onExtraCallback;
    public int onExtraCallbackWithResult;
    public byte[] onNavigationEvent;
    public int[] onTransact;
    public byte[] onWarmupCompleted;

    public TextFieldSelectionState_androidKtExternalSyntheticLambda2() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.IAuthTabCallbackStub = cryptoInfo;
        this.IAuthTabCallbackDefault = new onExtraCallbackWithResult(cryptoInfo);
    }

    public void IAuthTabCallback(int i2, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i3, int i4, int i5) {
        this.asBinder = i2;
        this.onTransact = iArr;
        this.asInterface = iArr2;
        this.onNavigationEvent = bArr;
        this.onWarmupCompleted = bArr2;
        this.onExtraCallback = i3;
        this.onExtraCallbackWithResult = i4;
        this.IAuthTabCallback = i5;
        MediaCodec.CryptoInfo cryptoInfo = this.IAuthTabCallbackStub;
        cryptoInfo.numSubSamples = i2;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i3;
        ((onExtraCallbackWithResult) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackDefault)).onNavigationEvent(i4, i5);
    }

    public MediaCodec.CryptoInfo IAuthTabCallback() {
        return this.IAuthTabCallbackStub;
    }

    public void onExtraCallback(int i2) {
        if (i2 == 0) {
            return;
        }
        if (this.onTransact == null) {
            int[] iArr = new int[1];
            this.onTransact = iArr;
            this.IAuthTabCallbackStub.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.onTransact;
        iArr2[0] = iArr2[0] + i2;
    }

    static final class onExtraCallbackWithResult {
        private final MediaCodec.CryptoInfo.Pattern IAuthTabCallback;
        private final MediaCodec.CryptoInfo onWarmupCompleted;

        private onExtraCallbackWithResult(MediaCodec.CryptoInfo cryptoInfo) {
            this.onWarmupCompleted = cryptoInfo;
            this.IAuthTabCallback = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onNavigationEvent(int i2, int i3) {
            this.IAuthTabCallback.set(i2, i3);
            this.onWarmupCompleted.setPattern(this.IAuthTabCallback);
        }
    }
}
