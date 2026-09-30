package o;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.common.base.Supplier;
import java.nio.ByteBuffer;
import o.AndroidMenu_androidKtExternalSyntheticLambda2;
import o.AndroidMenu_androidKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AndroidMenu_androidKtExternalSyntheticLambda2 implements AndroidMenu_androidKtExternalSyntheticLambda4 {
    private final MediaCodec IAuthTabCallback;
    private int IAuthTabCallbackStub;
    private final AppBarKtExternalSyntheticLambda1 onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private final AppBarKtExternalSyntheticLambda0 onNavigationEvent;
    private final AndroidAlertDialog_androidKtExternalSyntheticLambda0 onWarmupCompleted;

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public boolean onWarmupCompleted() {
        return false;
    }

    public static final class IAuthTabCallback implements AndroidMenu_androidKtExternalSyntheticLambda4.onExtraCallback {
        private boolean IAuthTabCallback;
        private final Supplier<HandlerThread> onExtraCallbackWithResult;
        private final Supplier<HandlerThread> onWarmupCompleted;

        public IAuthTabCallback(final int i2) {
            this(new Supplier() { // from class: androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter$Factory$$ExternalSyntheticLambda0
                public final Object get() {
                    return AndroidMenu_androidKtExternalSyntheticLambda2.IAuthTabCallback.onExtraCallback(i2);
                }
            }, new Supplier() { // from class: androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter$Factory$$ExternalSyntheticLambda1
                public final Object get() {
                    return AndroidMenu_androidKtExternalSyntheticLambda2.IAuthTabCallback.onExtraCallbackWithResult(i2);
                }
            });
        }

        public static /* synthetic */ HandlerThread onExtraCallback(int i2) {
            return new HandlerThread(AndroidMenu_androidKtExternalSyntheticLambda2.onTransact(i2));
        }

        public static /* synthetic */ HandlerThread onExtraCallbackWithResult(int i2) {
            return new HandlerThread(AndroidMenu_androidKtExternalSyntheticLambda2.IAuthTabCallbackStub(i2));
        }

        public IAuthTabCallback(Supplier<HandlerThread> supplier, Supplier<HandlerThread> supplier2) {
            this.onExtraCallbackWithResult = supplier;
            this.onWarmupCompleted = supplier2;
            this.IAuthTabCallback = false;
        }

        public void onNavigationEvent(boolean z) {
            this.IAuthTabCallback = z;
        }

        @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4.onExtraCallback
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public AndroidMenu_androidKtExternalSyntheticLambda2 onExtraCallback(AndroidMenu_androidKtExternalSyntheticLambda4.onWarmupCompleted onwarmupcompleted) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            int i2;
            AppBarKtExternalSyntheticLambda0 androidMenu_androidKtExternalSyntheticLambda0;
            AndroidMenu_androidKtExternalSyntheticLambda2 androidMenu_androidKtExternalSyntheticLambda2;
            String str = onwarmupcompleted.IAuthTabCallback.IAuthTabCallbackStub;
            AndroidMenu_androidKtExternalSyntheticLambda2 androidMenu_androidKtExternalSyntheticLambda22 = null;
            try {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onExtraCallback("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    if (this.IAuthTabCallback && IAuthTabCallback(onwarmupcompleted.onExtraCallbackWithResult)) {
                        androidMenu_androidKtExternalSyntheticLambda0 = new AppBarKtExternalSyntheticLambda7(mediaCodecCreateByCodecName);
                        i2 = 4;
                    } else {
                        i2 = 0;
                        androidMenu_androidKtExternalSyntheticLambda0 = new AndroidMenu_androidKtExternalSyntheticLambda0(mediaCodecCreateByCodecName, (HandlerThread) this.onWarmupCompleted.get());
                    }
                    androidMenu_androidKtExternalSyntheticLambda2 = new AndroidMenu_androidKtExternalSyntheticLambda2(mediaCodecCreateByCodecName, (HandlerThread) this.onExtraCallbackWithResult.get(), androidMenu_androidKtExternalSyntheticLambda0, onwarmupcompleted.onNavigationEvent);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Exception e2) {
                e = e2;
                mediaCodecCreateByCodecName = null;
            }
            try {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onWarmupCompleted();
                Surface surface = onwarmupcompleted.asBinder;
                if (surface == null && onwarmupcompleted.IAuthTabCallback.onExtraCallbackWithResult && Build.VERSION.SDK_INT >= 35) {
                    i2 |= 8;
                }
                androidMenu_androidKtExternalSyntheticLambda2.onWarmupCompleted(onwarmupcompleted.onExtraCallback, surface, onwarmupcompleted.onWarmupCompleted, i2);
                return androidMenu_androidKtExternalSyntheticLambda2;
            } catch (Exception e3) {
                e = e3;
                androidMenu_androidKtExternalSyntheticLambda22 = androidMenu_androidKtExternalSyntheticLambda2;
                if (androidMenu_androidKtExternalSyntheticLambda22 != null) {
                    androidMenu_androidKtExternalSyntheticLambda22.asBinder();
                } else if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                throw e;
            }
        }

        private static boolean IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 34) {
                return false;
            }
            return i2 >= 35 || AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onTransact(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable);
        }
    }

    private AndroidMenu_androidKtExternalSyntheticLambda2(MediaCodec mediaCodec, HandlerThread handlerThread, AppBarKtExternalSyntheticLambda0 appBarKtExternalSyntheticLambda0, @Nullable AppBarKtExternalSyntheticLambda1 appBarKtExternalSyntheticLambda1) {
        this.IAuthTabCallback = mediaCodec;
        this.onWarmupCompleted = new AndroidAlertDialog_androidKtExternalSyntheticLambda0(handlerThread);
        this.onNavigationEvent = appBarKtExternalSyntheticLambda0;
        this.onExtraCallback = appBarKtExternalSyntheticLambda1;
        this.IAuthTabCallbackStub = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onWarmupCompleted(@Nullable MediaFormat mediaFormat, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, int i2) {
        AppBarKtExternalSyntheticLambda1 appBarKtExternalSyntheticLambda1;
        this.onWarmupCompleted.onExtraCallbackWithResult(this.IAuthTabCallback);
        TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onExtraCallback("configureCodec");
        this.IAuthTabCallback.configure(mediaFormat, surface, mediaCrypto, i2);
        TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onWarmupCompleted();
        this.onNavigationEvent.onWarmupCompleted();
        TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onExtraCallback("startCodec");
        this.IAuthTabCallback.start();
        TextFieldDecoratorModifierNodeExternalSyntheticLambda9.onWarmupCompleted();
        if (Build.VERSION.SDK_INT >= 35 && (appBarKtExternalSyntheticLambda1 = this.onExtraCallback) != null) {
            appBarKtExternalSyntheticLambda1.onNavigationEvent(this.IAuthTabCallback);
        }
        this.IAuthTabCallbackStub = 1;
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public void onExtraCallbackWithResult(int i2, int i3, int i4, long j, int i5) {
        this.onNavigationEvent.onExtraCallback(i2, i3, i4, j, i5);
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public void IAuthTabCallback(int i2, int i3, TextFieldSelectionState_androidKtExternalSyntheticLambda2 textFieldSelectionState_androidKtExternalSyntheticLambda2, long j, int i4) {
        this.onNavigationEvent.onWarmupCompleted(i2, i3, textFieldSelectionState_androidKtExternalSyntheticLambda2, j, i4);
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public void onWarmupCompleted(int i2, boolean z) {
        this.IAuthTabCallback.releaseOutputBuffer(i2, z);
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public void onWarmupCompleted(int i2, long j) {
        this.IAuthTabCallback.releaseOutputBuffer(i2, j);
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public int onNavigationEvent() {
        this.onNavigationEvent.onExtraCallbackWithResult();
        return this.onWarmupCompleted.IAuthTabCallback();
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public int onExtraCallbackWithResult(MediaCodec.BufferInfo bufferInfo) {
        this.onNavigationEvent.onExtraCallbackWithResult();
        return this.onWarmupCompleted.onExtraCallback(bufferInfo);
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public MediaFormat onExtraCallbackWithResult() {
        return this.onWarmupCompleted.onExtraCallbackWithResult();
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public ByteBuffer onExtraCallbackWithResult(int i2) {
        return this.IAuthTabCallback.getInputBuffer(i2);
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public ByteBuffer onWarmupCompleted(int i2) {
        return this.IAuthTabCallback.getOutputBuffer(i2);
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public void onExtraCallback() {
        this.onNavigationEvent.onExtraCallback();
        this.IAuthTabCallback.flush();
        this.onWarmupCompleted.onExtraCallback();
        this.IAuthTabCallback.start();
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public void asBinder() {
        AppBarKtExternalSyntheticLambda1 appBarKtExternalSyntheticLambda1;
        AppBarKtExternalSyntheticLambda1 appBarKtExternalSyntheticLambda12;
        try {
            if (this.IAuthTabCallbackStub == 1) {
                this.onNavigationEvent.onNavigationEvent();
                this.onWarmupCompleted.onWarmupCompleted();
            }
            this.IAuthTabCallbackStub = 2;
            if (this.onExtraCallbackWithResult) {
                return;
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30 && i2 < 33) {
                    this.IAuthTabCallback.stop();
                }
                if (i2 >= 35 && (appBarKtExternalSyntheticLambda12 = this.onExtraCallback) != null) {
                    appBarKtExternalSyntheticLambda12.IAuthTabCallback(this.IAuthTabCallback);
                }
                this.IAuthTabCallback.release();
                this.onExtraCallbackWithResult = true;
            } finally {
            }
        } catch (Throwable th) {
            if (!this.onExtraCallbackWithResult) {
                try {
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 30 && i3 < 33) {
                        this.IAuthTabCallback.stop();
                    }
                    if (i3 >= 35 && (appBarKtExternalSyntheticLambda1 = this.onExtraCallback) != null) {
                        appBarKtExternalSyntheticLambda1.IAuthTabCallback(this.IAuthTabCallback);
                    }
                    this.IAuthTabCallback.release();
                    this.onExtraCallbackWithResult = true;
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public void onNavigationEvent(final AndroidMenu_androidKtExternalSyntheticLambda4.IAuthTabCallback iAuthTabCallback, Handler handler) {
        this.IAuthTabCallback.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter$$ExternalSyntheticLambda0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                iAuthTabCallback.IAuthTabCallback(this.f$0, j, j2);
            }
        }, handler);
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public boolean onWarmupCompleted(AndroidMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresult) {
        this.onWarmupCompleted.onNavigationEvent(onextracallbackwithresult);
        return true;
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public void onExtraCallback(Surface surface) {
        this.IAuthTabCallback.setOutputSurface(surface);
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public void IAuthTabCallback() {
        this.IAuthTabCallback.detachOutputSurface();
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public void onExtraCallbackWithResult(Bundle bundle) {
        this.onNavigationEvent.IAuthTabCallback(bundle);
    }

    @Override // o.AndroidMenu_androidKtExternalSyntheticLambda4
    public void onExtraCallback(int i2) {
        this.IAuthTabCallback.setVideoScalingMode(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String onTransact(int i2) {
        return onExtraCallbackWithResult(i2, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String IAuthTabCallbackStub(int i2) {
        return onExtraCallbackWithResult(i2, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String onExtraCallbackWithResult(int i2, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i2 == 1) {
            sb.append("Audio");
        } else if (i2 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i2);
            sb.append(")");
        }
        return sb.toString();
    }
}
