package o;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
import androidx.annotation.Nullable;
import o.SelectionManagerExternalSyntheticLambda14;
import o.SelectionManagerExternalSyntheticLambda8;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionManagerExternalSyntheticLambda9 implements SelectionManagerExternalSyntheticLambda8.onExtraCallback {
    private Boolean IAuthTabCallback;
    private final Context onNavigationEvent;

    public SelectionManagerExternalSyntheticLambda9() {
        this(null);
    }

    public SelectionManagerExternalSyntheticLambda9(@Nullable Context context) {
        this.onNavigationEvent = context == null ? null : context.getApplicationContext();
    }

    @Override // o.SelectionManagerExternalSyntheticLambda8.onExtraCallback
    public SelectionManagerExternalSyntheticLambda14 IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetch == -1) {
            return SelectionManagerExternalSyntheticLambda14.onNavigationEvent;
        }
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(this.onNavigationEvent);
        int iOnNavigationEvent = AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onNavigationEvent((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable), basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub);
        if (iOnNavigationEvent == 0 || i2 < TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(iOnNavigationEvent)) {
            return SelectionManagerExternalSyntheticLambda14.onNavigationEvent;
        }
        int iOnExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.onNavigationEvent);
        if (iOnExtraCallback == 0) {
            return SelectionManagerExternalSyntheticLambda14.onNavigationEvent;
        }
        try {
            Object[] objArr = {Integer.valueOf(basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetch), Integer.valueOf(iOnExtraCallback), Integer.valueOf(iOnNavigationEvent)};
            AudioFormat audioFormat = (AudioFormat) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(-1183847823, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, 1183847823);
            if (i2 >= 31) {
                return onNavigationEvent.onExtraCallback(audioFormat, textContextMenuHelperApi28ExternalSyntheticLambda5.onNavigationEvent().onNavigationEvent, zOnExtraCallbackWithResult);
            }
            return onExtraCallback.onWarmupCompleted(audioFormat, textContextMenuHelperApi28ExternalSyntheticLambda5.onNavigationEvent().onNavigationEvent, zOnExtraCallbackWithResult);
        } catch (IllegalArgumentException unused) {
            return SelectionManagerExternalSyntheticLambda14.onNavigationEvent;
        }
    }

    private boolean onExtraCallbackWithResult(@Nullable Context context) {
        Boolean bool = this.IAuthTabCallback;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context != null) {
            String parameters = CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda7.onNavigationEvent(context).getParameters("offloadVariableRateSupported");
            this.IAuthTabCallback = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
        } else {
            this.IAuthTabCallback = Boolean.FALSE;
        }
        return this.IAuthTabCallback.booleanValue();
    }

    static final class onExtraCallback {
        public static SelectionManagerExternalSyntheticLambda14 onWarmupCompleted(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
            if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
                return SelectionManagerExternalSyntheticLambda14.onNavigationEvent;
            }
            return new SelectionManagerExternalSyntheticLambda14.onNavigationEvent().IAuthTabCallback(true).onExtraCallbackWithResult(z).onExtraCallbackWithResult();
        }
    }

    static final class onNavigationEvent {
        public static SelectionManagerExternalSyntheticLambda14 onExtraCallback(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return SelectionManagerExternalSyntheticLambda14.onNavigationEvent;
            }
            return new SelectionManagerExternalSyntheticLambda14.onNavigationEvent().IAuthTabCallback(true).onNavigationEvent(Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2).onExtraCallbackWithResult(z).onExtraCallbackWithResult();
        }
    }
}
