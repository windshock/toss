package o;

import android.media.MediaPlayer;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class MediaControllerImplBaseExternalSyntheticLambda17 extends NavDisplayKt__NavDisplayKtExternalSyntheticLambda1 implements MediaPlayer.OnSeekCompleteListener {
    public static final String onExtraCallbackWithResult = StringFog.decrypt("fIcxJqZ5g2RemQ4mt3eMYkCdBy2mYIRuUIYQIrd9sg==\n", "M+liQ8MSwAs=\n");
    public final MediaControllerImplBaseExternalSyntheticLambda42 onNavigationEvent;

    public MediaControllerImplBaseExternalSyntheticLambda17(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener, MediaControllerImplBaseExternalSyntheticLambda42 mediaControllerImplBaseExternalSyntheticLambda42) {
        super(onSeekCompleteListener);
        this.onNavigationEvent = mediaControllerImplBaseExternalSyntheticLambda42;
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        try {
            this.onNavigationEvent.onExtraCallbackWithResult(this, mediaPlayer);
        } catch (Throwable th) {
            SpannedDataExternalSyntheticLambda0.IAuthTabCallback(onExtraCallbackWithResult, StringFog.decrypt("taR0LFzlsanQu1IhYqyrs5W4YzEOqraUlbNtAEGoqKuVomM=\n", "8NYGQy7F2Mc=\n"), th, false);
        }
        Object obj = this.asBinder;
        if (obj != null) {
            ((MediaPlayer.OnSeekCompleteListener) obj).onSeekComplete(mediaPlayer);
        }
    }
}
