package o;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class AndroidMenu_androidKtExternalSyntheticLambda0 implements AppBarKtExternalSyntheticLambda0 {
    private Handler IAuthTabCallback;
    private final AtomicReference<RuntimeException> IAuthTabCallbackDefault;
    private final HandlerThread IAuthTabCallbackStub;
    private boolean asInterface;
    private final TextFieldCoreModifierNodeExternalSyntheticLambda2 onExtraCallback;
    private final MediaCodec onWarmupCompleted;
    private static final ArrayDeque<IAuthTabCallback> onNavigationEvent = new ArrayDeque<>();
    private static final Object onExtraCallbackWithResult = new Object();

    public AndroidMenu_androidKtExternalSyntheticLambda0(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new TextFieldCoreModifierNodeExternalSyntheticLambda2());
    }

    AndroidMenu_androidKtExternalSyntheticLambda0(MediaCodec mediaCodec, HandlerThread handlerThread, TextFieldCoreModifierNodeExternalSyntheticLambda2 textFieldCoreModifierNodeExternalSyntheticLambda2) {
        this.onWarmupCompleted = mediaCodec;
        this.IAuthTabCallbackStub = handlerThread;
        this.onExtraCallback = textFieldCoreModifierNodeExternalSyntheticLambda2;
        this.IAuthTabCallbackDefault = new AtomicReference<>();
    }

    @Override // o.AppBarKtExternalSyntheticLambda0
    public void onWarmupCompleted() {
        if (this.asInterface) {
            return;
        }
        this.IAuthTabCallbackStub.start();
        this.IAuthTabCallback = new Handler(this.IAuthTabCallbackStub.getLooper()) { // from class: o.AndroidMenu_androidKtExternalSyntheticLambda0.3
            @Override // android.os.Handler
            public void handleMessage(Message message) throws MediaCodec.CryptoException {
                AndroidMenu_androidKtExternalSyntheticLambda0.this.onWarmupCompleted(message);
            }
        };
        this.asInterface = true;
    }

    @Override // o.AppBarKtExternalSyntheticLambda0
    public void onExtraCallback(int i2, int i3, int i4, long j, int i5) {
        onExtraCallbackWithResult();
        IAuthTabCallback iAuthTabCallbackIAuthTabCallbackStub = IAuthTabCallbackStub();
        iAuthTabCallbackIAuthTabCallbackStub.IAuthTabCallback(i2, i3, i4, j, i5);
        Object[] objArr = {this.IAuthTabCallback};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        ((Handler) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).obtainMessage(1, iAuthTabCallbackIAuthTabCallbackStub).sendToTarget();
    }

    @Override // o.AppBarKtExternalSyntheticLambda0
    public void onWarmupCompleted(int i2, int i3, TextFieldSelectionState_androidKtExternalSyntheticLambda2 textFieldSelectionState_androidKtExternalSyntheticLambda2, long j, int i4) {
        onExtraCallbackWithResult();
        IAuthTabCallback iAuthTabCallbackIAuthTabCallbackStub = IAuthTabCallbackStub();
        iAuthTabCallbackIAuthTabCallbackStub.IAuthTabCallback(i2, i3, 0, j, i4);
        IAuthTabCallback(textFieldSelectionState_androidKtExternalSyntheticLambda2, iAuthTabCallbackIAuthTabCallbackStub.IAuthTabCallback);
        Object[] objArr = {this.IAuthTabCallback};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        ((Handler) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).obtainMessage(2, iAuthTabCallbackIAuthTabCallbackStub).sendToTarget();
    }

    @Override // o.AppBarKtExternalSyntheticLambda0
    public void IAuthTabCallback(Bundle bundle) {
        onExtraCallbackWithResult();
        Object[] objArr = {this.IAuthTabCallback};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        ((Handler) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).obtainMessage(4, bundle).sendToTarget();
    }

    @Override // o.AppBarKtExternalSyntheticLambda0
    public void onExtraCallback() {
        if (this.asInterface) {
            try {
                IAuthTabCallbackDefault();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // o.AppBarKtExternalSyntheticLambda0
    public void onNavigationEvent() {
        if (this.asInterface) {
            onExtraCallback();
            this.IAuthTabCallbackStub.quit();
        }
        this.asInterface = false;
    }

    @Override // o.AppBarKtExternalSyntheticLambda0
    public void onExtraCallbackWithResult() {
        RuntimeException andSet = this.IAuthTabCallbackDefault.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    private void IAuthTabCallbackDefault() throws InterruptedException {
        ((Handler) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback)).removeCallbacksAndMessages(null);
        IAuthTabCallback();
    }

    private void IAuthTabCallback() throws InterruptedException {
        this.onExtraCallback.onExtraCallbackWithResult();
        ((Handler) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback)).obtainMessage(3).sendToTarget();
        this.onExtraCallback.onExtraCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onWarmupCompleted(Message message) throws MediaCodec.CryptoException {
        IAuthTabCallback iAuthTabCallback;
        int i2 = message.what;
        if (i2 == 1) {
            iAuthTabCallback = (IAuthTabCallback) message.obj;
            IAuthTabCallback(iAuthTabCallback.onExtraCallback, iAuthTabCallback.onNavigationEvent, iAuthTabCallback.IAuthTabCallbackStub, iAuthTabCallback.onExtraCallbackWithResult, iAuthTabCallback.onWarmupCompleted);
        } else if (i2 != 2) {
            iAuthTabCallback = null;
            if (i2 == 3) {
                this.onExtraCallback.IAuthTabCallback();
            } else if (i2 == 4) {
                onNavigationEvent((Bundle) message.obj);
            } else {
                setSupportImageTintList.onNavigationEvent(this.IAuthTabCallbackDefault, (Object) null, new IllegalStateException(String.valueOf(message.what)));
            }
        } else {
            iAuthTabCallback = (IAuthTabCallback) message.obj;
            IAuthTabCallback(iAuthTabCallback.onExtraCallback, iAuthTabCallback.onNavigationEvent, iAuthTabCallback.IAuthTabCallback, iAuthTabCallback.onExtraCallbackWithResult, iAuthTabCallback.onWarmupCompleted);
        }
        if (iAuthTabCallback != null) {
            IAuthTabCallback(iAuthTabCallback);
        }
    }

    private void IAuthTabCallback(int i2, int i3, int i4, long j, int i5) throws MediaCodec.CryptoException {
        try {
            this.onWarmupCompleted.queueInputBuffer(i2, i3, i4, j, i5);
        } catch (RuntimeException e) {
            setSupportImageTintList.onNavigationEvent(this.IAuthTabCallbackDefault, (Object) null, e);
        }
    }

    private void IAuthTabCallback(int i2, int i3, MediaCodec.CryptoInfo cryptoInfo, long j, int i4) {
        try {
            synchronized (onExtraCallbackWithResult) {
                this.onWarmupCompleted.queueSecureInputBuffer(i2, i3, cryptoInfo, j, i4);
            }
        } catch (RuntimeException e) {
            setSupportImageTintList.onNavigationEvent(this.IAuthTabCallbackDefault, (Object) null, e);
        }
    }

    private void onNavigationEvent(Bundle bundle) {
        try {
            this.onWarmupCompleted.setParameters(bundle);
        } catch (RuntimeException e) {
            setSupportImageTintList.onNavigationEvent(this.IAuthTabCallbackDefault, (Object) null, e);
        }
    }

    private static IAuthTabCallback IAuthTabCallbackStub() {
        ArrayDeque<IAuthTabCallback> arrayDeque = onNavigationEvent;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new IAuthTabCallback();
            }
            return arrayDeque.removeFirst();
        }
    }

    private static void IAuthTabCallback(IAuthTabCallback iAuthTabCallback) {
        ArrayDeque<IAuthTabCallback> arrayDeque = onNavigationEvent;
        synchronized (arrayDeque) {
            arrayDeque.add(iAuthTabCallback);
        }
    }

    static class IAuthTabCallback {
        public final MediaCodec.CryptoInfo IAuthTabCallback = new MediaCodec.CryptoInfo();
        public int IAuthTabCallbackStub;
        public int onExtraCallback;
        public long onExtraCallbackWithResult;
        public int onNavigationEvent;
        public int onWarmupCompleted;

        IAuthTabCallback() {
        }

        public void IAuthTabCallback(int i2, int i3, int i4, long j, int i5) {
            this.onExtraCallback = i2;
            this.onNavigationEvent = i3;
            this.IAuthTabCallbackStub = i4;
            this.onExtraCallbackWithResult = j;
            this.onWarmupCompleted = i5;
        }
    }

    private static void IAuthTabCallback(TextFieldSelectionState_androidKtExternalSyntheticLambda2 textFieldSelectionState_androidKtExternalSyntheticLambda2, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = textFieldSelectionState_androidKtExternalSyntheticLambda2.asBinder;
        cryptoInfo.numBytesOfClearData = onNavigationEvent(textFieldSelectionState_androidKtExternalSyntheticLambda2.onTransact, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = onNavigationEvent(textFieldSelectionState_androidKtExternalSyntheticLambda2.asInterface, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onWarmupCompleted(textFieldSelectionState_androidKtExternalSyntheticLambda2.onNavigationEvent, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onWarmupCompleted(textFieldSelectionState_androidKtExternalSyntheticLambda2.onWarmupCompleted, cryptoInfo.iv));
        cryptoInfo.mode = textFieldSelectionState_androidKtExternalSyntheticLambda2.onExtraCallback;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(textFieldSelectionState_androidKtExternalSyntheticLambda2.onExtraCallbackWithResult, textFieldSelectionState_androidKtExternalSyntheticLambda2.IAuthTabCallback));
    }

    private static int[] onNavigationEvent(@Nullable int[] iArr, @Nullable int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    private static byte[] onWarmupCompleted(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
