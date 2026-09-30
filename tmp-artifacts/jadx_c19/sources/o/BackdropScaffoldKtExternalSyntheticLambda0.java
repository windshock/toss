package o;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.nio.ByteBuffer;
import o.AndroidMenu_androidKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BackdropScaffoldKtExternalSyntheticLambda0 implements AndroidMenu_androidKtExternalSyntheticLambda4 {
    private final AppBarKtExternalSyntheticLambda1 IAuthTabCallback;
    private final MediaCodec onExtraCallbackWithResult;

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public boolean onWarmupCompleted() {
        return false;
    }

    public static class onNavigationEvent implements AndroidMenu_androidKtExternalSyntheticLambda4.onExtraCallback {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [o.BackdropScaffoldKtExternalSyntheticLambda0$5] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4.onExtraCallback
        public AndroidMenu_androidKtExternalSyntheticLambda4 onExtraCallback(AndroidMenu_androidKtExternalSyntheticLambda4.onWarmupCompleted onwarmupcompleted) throws Throwable {
            MediaCodec mediaCodecIAuthTabCallback;
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                mediaCodecIAuthTabCallback = IAuthTabCallback(onwarmupcompleted);
            } catch (IOException e) {
                e = e;
            } catch (RuntimeException e2) {
                e = e2;
            }
            try {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onExtraCallback("configureCodec");
                Surface surface = onwarmupcompleted.asBinder;
                mediaCodecIAuthTabCallback.configure(onwarmupcompleted.onExtraCallback, surface, onwarmupcompleted.onWarmupCompleted, (surface == null && onwarmupcompleted.IAuthTabCallback.onExtraCallbackWithResult && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
                TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onWarmupCompleted();
                TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onExtraCallback("startCodec");
                mediaCodecIAuthTabCallback.start();
                TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onWarmupCompleted();
                return new BackdropScaffoldKtExternalSyntheticLambda0(mediaCodecIAuthTabCallback, onwarmupcompleted.onNavigationEvent);
            } catch (IOException | RuntimeException e3) {
                e = e3;
                mediaCodec = mediaCodecIAuthTabCallback;
                if (mediaCodec != 0) {
                    mediaCodec.release();
                }
                throw e;
            }
        }

        protected MediaCodec IAuthTabCallback(AndroidMenu_androidKtExternalSyntheticLambda4.onWarmupCompleted onwarmupcompleted) throws IOException {
            AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5 = onwarmupcompleted.IAuthTabCallback;
            String str = onwarmupcompleted.IAuthTabCallback.IAuthTabCallbackStub;
            TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onExtraCallback("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onWarmupCompleted();
            return mediaCodecCreateByCodecName;
        }
    }

    private BackdropScaffoldKtExternalSyntheticLambda0(MediaCodec mediaCodec, @Nullable AppBarKtExternalSyntheticLambda1 appBarKtExternalSyntheticLambda1) {
        this.onExtraCallbackWithResult = mediaCodec;
        this.IAuthTabCallback = appBarKtExternalSyntheticLambda1;
        if (Build.VERSION.SDK_INT < 35 || appBarKtExternalSyntheticLambda1 == null) {
            return;
        }
        appBarKtExternalSyntheticLambda1.onNavigationEvent(mediaCodec);
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public int onNavigationEvent() {
        return this.onExtraCallbackWithResult.dequeueInputBuffer(0L);
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public int onExtraCallbackWithResult(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.onExtraCallbackWithResult.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public MediaFormat onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult.getOutputFormat();
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public ByteBuffer onExtraCallbackWithResult(int i2) {
        return this.onExtraCallbackWithResult.getInputBuffer(i2);
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public ByteBuffer onWarmupCompleted(int i2) {
        return this.onExtraCallbackWithResult.getOutputBuffer(i2);
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public void onExtraCallbackWithResult(int i2, int i3, int i4, long j, int i5) throws MediaCodec.CryptoException {
        this.onExtraCallbackWithResult.queueInputBuffer(i2, i3, i4, j, i5);
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public void IAuthTabCallback(int i2, int i3, TextFieldSelectionState_androidKtExternalSyntheticLambda2 textFieldSelectionState_androidKtExternalSyntheticLambda2, long j, int i4) throws MediaCodec.CryptoException {
        this.onExtraCallbackWithResult.queueSecureInputBuffer(i2, i3, textFieldSelectionState_androidKtExternalSyntheticLambda2.IAuthTabCallback(), j, i4);
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public void onWarmupCompleted(int i2, boolean z) {
        this.onExtraCallbackWithResult.releaseOutputBuffer(i2, z);
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public void onWarmupCompleted(int i2, long j) {
        this.onExtraCallbackWithResult.releaseOutputBuffer(i2, j);
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public void onExtraCallback() {
        this.onExtraCallbackWithResult.flush();
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public void asBinder() {
        AppBarKtExternalSyntheticLambda1 appBarKtExternalSyntheticLambda1;
        AppBarKtExternalSyntheticLambda1 appBarKtExternalSyntheticLambda12;
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && i2 < 33) {
                this.onExtraCallbackWithResult.stop();
            }
            if (i2 >= 35 && (appBarKtExternalSyntheticLambda12 = this.IAuthTabCallback) != null) {
                appBarKtExternalSyntheticLambda12.IAuthTabCallback(this.onExtraCallbackWithResult);
            }
            this.onExtraCallbackWithResult.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && (appBarKtExternalSyntheticLambda1 = this.IAuthTabCallback) != null) {
                appBarKtExternalSyntheticLambda1.IAuthTabCallback(this.onExtraCallbackWithResult);
            }
            this.onExtraCallbackWithResult.release();
            throw th;
        }
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public void onNavigationEvent(final AndroidMenu_androidKtExternalSyntheticLambda4.IAuthTabCallback iAuthTabCallback, Handler handler) {
        this.onExtraCallbackWithResult.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter$$ExternalSyntheticLambda0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                iAuthTabCallback.IAuthTabCallback(this.f$0, j, j2);
            }
        }, handler);
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public void onExtraCallback(Surface surface) {
        this.onExtraCallbackWithResult.setOutputSurface(surface);
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public void IAuthTabCallback() {
        this.onExtraCallbackWithResult.detachOutputSurface();
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public void onExtraCallbackWithResult(Bundle bundle) {
        this.onExtraCallbackWithResult.setParameters(bundle);
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public void onExtraCallback(int i2) {
        this.onExtraCallbackWithResult.setVideoScalingMode(i2);
    }
}
