package o;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Bundle;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.HashSet;
import java.util.Iterator;
import o.AppBarKtExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AppBarKtExternalSyntheticLambda1 {
    private LoudnessCodecController IAuthTabCallback;
    private final HashSet<MediaCodec> onExtraCallback;
    private final onNavigationEvent onNavigationEvent;

    public interface onNavigationEvent {
        public static final onNavigationEvent onWarmupCompleted = new onNavigationEvent() { // from class: androidx.media3.exoplayer.mediacodec.LoudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0
            @Override // o.AppBarKtExternalSyntheticLambda1.onNavigationEvent
            public final Bundle onLoudnessParameterUpdate(Bundle bundle) {
                return AppBarKtExternalSyntheticLambda1.onNavigationEvent.IAuthTabCallback(bundle);
            }
        };

        static /* synthetic */ Bundle IAuthTabCallback(Bundle bundle) {
            return bundle;
        }

        Bundle onLoudnessParameterUpdate(Bundle bundle);
    }

    public AppBarKtExternalSyntheticLambda1() {
        this(onNavigationEvent.onWarmupCompleted);
    }

    public AppBarKtExternalSyntheticLambda1(onNavigationEvent onnavigationevent) {
        this.onExtraCallback = new HashSet<>();
        this.onNavigationEvent = onnavigationevent;
    }

    public void onExtraCallback(int i2) {
        LoudnessCodecController loudnessCodecController = this.IAuthTabCallback;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.IAuthTabCallback = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i2, MoreExecutors.directExecutor(), new LoudnessCodecController.OnLoudnessCodecUpdateListener() { // from class: o.AppBarKtExternalSyntheticLambda1.1
            public Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
                return AppBarKtExternalSyntheticLambda1.this.onNavigationEvent.onLoudnessParameterUpdate(bundle);
            }
        });
        this.IAuthTabCallback = loudnessCodecControllerCreate;
        Iterator<MediaCodec> it = this.onExtraCallback.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec(it.next())) {
                it.remove();
            }
        }
    }

    public void onNavigationEvent(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.IAuthTabCallback;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback.add(mediaCodec));
        }
    }

    public void IAuthTabCallback(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.onExtraCallback.remove(mediaCodec) || (loudnessCodecController = this.IAuthTabCallback) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void onExtraCallback() {
        this.onExtraCallback.clear();
        LoudnessCodecController loudnessCodecController = this.IAuthTabCallback;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }
}
