package im.toss.core.webkit.bridge;

import androidx.lifecycle.LifecycleEventObserver;
import com.google.android.exoplayer2.ExoPlayer;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.getFaceYuvToByteArray;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class PlayNotificationSoundHandler$$ExternalSyntheticLambda1 implements LifecycleEventObserver {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ ExoPlayer f$0;

    public final void onStateChanged(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            getFaceYuvToByteArray.onExtraCallback(this.f$0, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult);
            throw null;
        }
        getFaceYuvToByteArray.onExtraCallback(this.f$0, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult);
        int i3 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }
}
