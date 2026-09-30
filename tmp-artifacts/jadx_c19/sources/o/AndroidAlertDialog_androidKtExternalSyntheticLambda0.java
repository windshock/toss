package o;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import o.AndroidMenu_androidKtExternalSyntheticLambda4;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AndroidAlertDialog_androidKtExternalSyntheticLambda0 extends MediaCodec.Callback {
    private final HandlerThread IAuthTabCallback;
    private IllegalStateException IAuthTabCallbackDefault;
    private MediaCodec.CryptoException IAuthTabCallbackStub;
    private MediaCodec.CodecException IAuthTabCallbackStubProxy;
    private boolean IAuthTabCallback_Parcel;
    private MediaFormat access000;
    private AndroidMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult access100;
    private Handler asBinder;
    private long getInterfaceDescriptor;
    private MediaFormat onNavigationEvent;
    private final Object onTransact = new Object();
    private final setDropDownWidth onExtraCallbackWithResult = new setDropDownWidth();
    private final setDropDownWidth onExtraCallback = new setDropDownWidth();
    private final ArrayDeque<MediaCodec.BufferInfo> onWarmupCompleted = new ArrayDeque<>();
    private final ArrayDeque<MediaFormat> asInterface = new ArrayDeque<>();

    AndroidAlertDialog_androidKtExternalSyntheticLambda0(HandlerThread handlerThread) {
        this.IAuthTabCallback = handlerThread;
    }

    public void onExtraCallbackWithResult(MediaCodec mediaCodec) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.asBinder == null);
        this.IAuthTabCallback.start();
        Handler handler = new Handler(this.IAuthTabCallback.getLooper());
        mediaCodec.setCallback(this, handler);
        this.asBinder = handler;
    }

    public void onWarmupCompleted() {
        synchronized (this.onTransact) {
            this.IAuthTabCallback_Parcel = true;
            this.IAuthTabCallback.quit();
            onNavigationEvent();
        }
    }

    public int IAuthTabCallback() {
        synchronized (this.onTransact) {
            IAuthTabCallbackStub();
            int iOnExtraCallback = -1;
            if (asBinder()) {
                return -1;
            }
            if (!this.onExtraCallbackWithResult.IAuthTabCallback()) {
                iOnExtraCallback = this.onExtraCallbackWithResult.onExtraCallback();
            }
            return iOnExtraCallback;
        }
    }

    public int onExtraCallback(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.onTransact) {
            IAuthTabCallbackStub();
            if (asBinder()) {
                return -1;
            }
            if (this.onExtraCallback.IAuthTabCallback()) {
                return -1;
            }
            int iOnExtraCallback = this.onExtraCallback.onExtraCallback();
            if (iOnExtraCallback >= 0) {
                RecordingInputConnection_androidKt.onWarmupCompleted(this.onNavigationEvent);
                MediaCodec.BufferInfo bufferInfoRemove = this.onWarmupCompleted.remove();
                bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
            } else if (iOnExtraCallback == -2) {
                this.onNavigationEvent = this.asInterface.remove();
            }
            return iOnExtraCallback;
        }
    }

    public MediaFormat onExtraCallbackWithResult() {
        MediaFormat mediaFormat;
        synchronized (this.onTransact) {
            mediaFormat = this.onNavigationEvent;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void onExtraCallback() {
        synchronized (this.onTransact) {
            this.getInterfaceDescriptor++;
            Object[] objArr = {this.asBinder};
            Object objOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, -1084655742);
            Object obj = objOnNavigationEvent;
            ((Handler) objOnNavigationEvent).post(new Runnable() { // from class: androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecCallback$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.getInterfaceDescriptor();
                }
            });
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i2) {
        synchronized (this.onTransact) {
            this.onExtraCallbackWithResult.onExtraCallback(i2);
            AndroidMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresult = this.access100;
            if (onextracallbackwithresult != null) {
                onextracallbackwithresult.onExtraCallback();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.onTransact) {
            MediaFormat mediaFormat = this.access000;
            if (mediaFormat != null) {
                IAuthTabCallback(mediaFormat);
                this.access000 = null;
            }
            this.onExtraCallback.onExtraCallback(i2);
            this.onWarmupCompleted.add(bufferInfo);
            AndroidMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresult = this.access100;
            if (onextracallbackwithresult != null) {
                onextracallbackwithresult.IAuthTabCallback();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.onTransact) {
            this.IAuthTabCallbackStubProxy = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.onTransact) {
            this.IAuthTabCallbackStub = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.onTransact) {
            IAuthTabCallback(mediaFormat);
            this.access000 = null;
        }
    }

    public void onNavigationEvent(AndroidMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresult) {
        synchronized (this.onTransact) {
            this.access100 = onextracallbackwithresult;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getInterfaceDescriptor() {
        synchronized (this.onTransact) {
            if (this.IAuthTabCallback_Parcel) {
                return;
            }
            long j = this.getInterfaceDescriptor - 1;
            this.getInterfaceDescriptor = j;
            if (j > 0) {
                return;
            }
            if (j < 0) {
                onExtraCallback(new IllegalStateException());
            } else {
                onNavigationEvent();
            }
        }
    }

    private void onNavigationEvent() {
        if (!this.asInterface.isEmpty()) {
            this.access000 = this.asInterface.getLast();
        }
        this.onExtraCallbackWithResult.onExtraCallbackWithResult();
        this.onExtraCallback.onExtraCallbackWithResult();
        this.onWarmupCompleted.clear();
        this.asInterface.clear();
    }

    private boolean asBinder() {
        return this.getInterfaceDescriptor > 0 || this.IAuthTabCallback_Parcel;
    }

    private void IAuthTabCallback(MediaFormat mediaFormat) {
        this.onExtraCallback.onExtraCallback(-2);
        this.asInterface.add(mediaFormat);
    }

    private void IAuthTabCallbackStub() {
        asInterface();
        onTransact();
        IAuthTabCallbackDefault();
    }

    private void asInterface() {
        IllegalStateException illegalStateException = this.IAuthTabCallbackDefault;
        if (illegalStateException == null) {
            return;
        }
        this.IAuthTabCallbackDefault = null;
        throw illegalStateException;
    }

    private void onTransact() {
        MediaCodec.CodecException codecException = this.IAuthTabCallbackStubProxy;
        if (codecException == null) {
            return;
        }
        this.IAuthTabCallbackStubProxy = null;
        throw codecException;
    }

    private void IAuthTabCallbackDefault() {
        MediaCodec.CryptoException cryptoException = this.IAuthTabCallbackStub;
        if (cryptoException == null) {
            return;
        }
        this.IAuthTabCallbackStub = null;
        throw cryptoException;
    }

    private void onExtraCallback(IllegalStateException illegalStateException) {
        synchronized (this.onTransact) {
            this.IAuthTabCallbackDefault = illegalStateException;
        }
    }
}
