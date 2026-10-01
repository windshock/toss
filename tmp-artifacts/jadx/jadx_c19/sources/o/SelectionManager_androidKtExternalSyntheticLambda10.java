package o;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import androidx.annotation.Nullable;
import o.SelectionManagerExternalSyntheticLambda2;
import o.SelectionManagerExternalSyntheticLambda8;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionManager_androidKtExternalSyntheticLambda10 implements SelectionManagerExternalSyntheticLambda8.onExtraCallbackWithResult {
    protected AudioTrack.Builder onWarmupCompleted(AudioTrack.Builder builder) {
        return builder;
    }

    @Override // o.SelectionManagerExternalSyntheticLambda8.onExtraCallbackWithResult
    public final AudioTrack onExtraCallbackWithResult(SelectionManagerExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback, TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5, int i2, @Nullable Context context) {
        return onWarmupCompleted(iAuthTabCallback, textContextMenuHelperApi28ExternalSyntheticLambda5, i2, context);
    }

    private AudioTrack onWarmupCompleted(SelectionManagerExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback, TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5, int i2, @Nullable Context context) throws IllegalArgumentException {
        Object[] objArr = {Integer.valueOf(iAuthTabCallback.onNavigationEvent), Integer.valueOf(iAuthTabCallback.IAuthTabCallback), Integer.valueOf(iAuthTabCallback.onExtraCallback)};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(onExtraCallbackWithResult(textContextMenuHelperApi28ExternalSyntheticLambda5, iAuthTabCallback.IAuthTabCallbackStub)).setAudioFormat((AudioFormat) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(-1183847823, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, 1183847823)).setTransferMode(1).setBufferSizeInBytes(iAuthTabCallback.onExtraCallbackWithResult).setSessionId(i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            onWarmupCompleted(sessionId, iAuthTabCallback.onWarmupCompleted);
        }
        if (i3 >= 34 && context != null) {
            sessionId.setContext(context);
        }
        return onWarmupCompleted(sessionId).build();
    }

    private void onWarmupCompleted(AudioTrack.Builder builder, boolean z) {
        builder.setOffloadedPlayback(z);
    }

    private AudioAttributes onExtraCallbackWithResult(TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5, boolean z) {
        if (z) {
            return onNavigationEvent();
        }
        return textContextMenuHelperApi28ExternalSyntheticLambda5.onNavigationEvent().onNavigationEvent;
    }

    private AudioAttributes onNavigationEvent() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }
}
