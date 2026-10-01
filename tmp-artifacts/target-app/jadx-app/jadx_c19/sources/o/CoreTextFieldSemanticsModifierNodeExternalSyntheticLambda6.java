package o;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.Objects;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda6 {
    private final AudioManager.OnAudioFocusChangeListener IAuthTabCallback;
    private final boolean asInterface;
    private final Handler onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final TextContextMenuHelperApi28ExternalSyntheticLambda5 onNavigationEvent;
    private final Object onWarmupCompleted;

    CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda6(int i2, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5, boolean z) {
        this.onExtraCallbackWithResult = i2;
        this.onExtraCallback = handler;
        this.onNavigationEvent = textContextMenuHelperApi28ExternalSyntheticLambda5;
        this.asInterface = z;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
            this.IAuthTabCallback = new onExtraCallback(onAudioFocusChangeListener, handler);
        } else {
            this.IAuthTabCallback = onAudioFocusChangeListener;
        }
        if (i3 >= 26) {
            this.onWarmupCompleted = CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda8.nu_(i2).setAudioAttributes(textContextMenuHelperApi28ExternalSyntheticLambda5.onNavigationEvent().onNavigationEvent).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.onWarmupCompleted = null;
        }
    }

    public int onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public TextContextMenuHelperApi28ExternalSyntheticLambda5 onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public boolean onTransact() {
        return this.asInterface;
    }

    public AudioManager.OnAudioFocusChangeListener IAuthTabCallbackStub() {
        return this.IAuthTabCallback;
    }

    public Handler IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public onNavigationEvent onWarmupCompleted() {
        return new onNavigationEvent();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda6)) {
            return false;
        }
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda6 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda6 = (CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda6) obj;
        return this.onExtraCallbackWithResult == coreTextFieldSemanticsModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult && this.asInterface == coreTextFieldSemanticsModifierNodeExternalSyntheticLambda6.asInterface && Objects.equals(this.IAuthTabCallback, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda6.IAuthTabCallback) && Objects.equals(this.onExtraCallback, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda6.onExtraCallback) && Objects.equals(this.onNavigationEvent, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda6.onNavigationEvent);
    }

    public int hashCode() {
        int i2 = this.onExtraCallbackWithResult;
        return Objects.hash(Integer.valueOf(i2), this.IAuthTabCallback, this.onExtraCallback, this.onNavigationEvent, Boolean.valueOf(this.asInterface));
    }

    AudioFocusRequest nt_() {
        return TextContextMenuHelperApi28ExternalSyntheticLambda4.nr_(RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onWarmupCompleted));
    }

    public static final class onNavigationEvent {
        private Handler IAuthTabCallback;
        private int onExtraCallback;
        private boolean onExtraCallbackWithResult;
        private TextContextMenuHelperApi28ExternalSyntheticLambda5 onNavigationEvent;
        private AudioManager.OnAudioFocusChangeListener onWarmupCompleted;

        public onNavigationEvent(int i2) {
            this.onNavigationEvent = TextContextMenuHelperApi28ExternalSyntheticLambda5.onNavigationEvent;
            this.onExtraCallback = i2;
        }

        private onNavigationEvent(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda6 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda6) {
            this.onExtraCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda6.onNavigationEvent();
            this.onWarmupCompleted = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda6.IAuthTabCallbackStub();
            this.IAuthTabCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda6.IAuthTabCallback();
            this.onNavigationEvent = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult();
            this.onExtraCallbackWithResult = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda6.onTransact();
        }

        public onNavigationEvent onWarmupCompleted(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.onWarmupCompleted = onAudioFocusChangeListener;
            this.IAuthTabCallback = handler;
            return this;
        }

        public onNavigationEvent onExtraCallback(TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5) {
            this.onNavigationEvent = textContextMenuHelperApi28ExternalSyntheticLambda5;
            return this;
        }

        public onNavigationEvent onWarmupCompleted(boolean z) {
            this.onExtraCallbackWithResult = z;
            return this;
        }

        public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda6 onWarmupCompleted() {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.onWarmupCompleted;
            if (onAudioFocusChangeListener == null) {
                throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
            }
            return new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda6(this.onExtraCallback, onAudioFocusChangeListener, (Handler) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback), this.onNavigationEvent, this.onExtraCallbackWithResult);
        }
    }

    public static class onExtraCallback implements AudioManager.OnAudioFocusChangeListener {
        private final AudioManager.OnAudioFocusChangeListener onExtraCallbackWithResult;
        private final Handler onNavigationEvent;

        onExtraCallback(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.onExtraCallbackWithResult = onAudioFocusChangeListener;
            this.onNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(handler.getLooper(), (Handler.Callback) null);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i2) {
            Object[] objArr = {this.onNavigationEvent, new Runnable() { // from class: androidx.media3.common.audio.AudioFocusRequestCompat$OnAudioFocusChangeListenerHandlerCompat$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.onExtraCallbackWithResult.onAudioFocusChange(i2);
                }
            }};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            ((Boolean) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(-567972186, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, 567972188)).booleanValue();
        }
    }
}
