package o;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.material.button.MaterialButton;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import java.util.Objects;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda6;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda7;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextAnnotatedStringNodeExternalSyntheticLambda2 {
    private TextContextMenuHelperApi28ExternalSyntheticLambda5 IAuthTabCallback;
    private boolean asBinder;
    private onExtraCallbackWithResult asInterface;
    private final Handler onExtraCallbackWithResult;
    private CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda6 onNavigationEvent;
    private int onTransact;
    private final Supplier<AudioManager> onWarmupCompleted;
    private float IAuthTabCallbackStub = 1.0f;
    private int onExtraCallback = 0;

    public interface onExtraCallbackWithResult {
        void onExtraCallbackWithResult(float f);

        void onWarmupCompleted(int i2);
    }

    public TextAnnotatedStringNodeExternalSyntheticLambda2(final Context context, Looper looper, onExtraCallbackWithResult onextracallbackwithresult) {
        this.onWarmupCompleted = Suppliers.memoize(new Supplier() { // from class: androidx.media3.exoplayer.AudioFocusManager$$ExternalSyntheticLambda1
            public final Object get() {
                return CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda7.onNavigationEvent(context);
            }
        });
        this.asInterface = onextracallbackwithresult;
        this.onExtraCallbackWithResult = new Handler(looper);
    }

    public float onNavigationEvent() {
        return this.IAuthTabCallbackStub;
    }

    public void onExtraCallback(@Nullable TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5) {
        if (Objects.equals(this.IAuthTabCallback, textContextMenuHelperApi28ExternalSyntheticLambda5)) {
            return;
        }
        this.IAuthTabCallback = textContextMenuHelperApi28ExternalSyntheticLambda5;
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(textContextMenuHelperApi28ExternalSyntheticLambda5);
        this.onTransact = iOnExtraCallbackWithResult;
        boolean z = true;
        if (iOnExtraCallbackWithResult != 1 && iOnExtraCallbackWithResult != 0) {
            z = false;
        }
        RecordingInputConnection_androidKt.onExtraCallback(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int onExtraCallbackWithResult(boolean z, int i2) {
        if (!onNavigationEvent(i2)) {
            onExtraCallback();
            IAuthTabCallback(0);
            return 1;
        }
        if (z) {
            return IAuthTabCallback();
        }
        int i3 = this.onExtraCallback;
        if (i3 != 1) {
            return i3 != 3 ? 1 : 0;
        }
        return -1;
    }

    public void onExtraCallbackWithResult() {
        this.asInterface = null;
        onExtraCallback();
        IAuthTabCallback(0);
    }

    private boolean onNavigationEvent(int i2) {
        return i2 != 1 && this.onTransact == 1;
    }

    private int IAuthTabCallback() {
        if (this.onExtraCallback == 2) {
            return 1;
        }
        if (onWarmupCompleted() == 1) {
            IAuthTabCallback(2);
            return 1;
        }
        IAuthTabCallback(1);
        return -1;
    }

    private void onExtraCallback() {
        int i2 = this.onExtraCallback;
        if (i2 == 1 || i2 == 0 || this.onNavigationEvent == null) {
            return;
        }
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda7.onExtraCallback((AudioManager) this.onWarmupCompleted.get(), this.onNavigationEvent);
    }

    private int onWarmupCompleted() {
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda6.onNavigationEvent onnavigationeventOnWarmupCompleted;
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda6 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda6 = this.onNavigationEvent;
        if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda6 == null || this.asBinder) {
            if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda6 == null) {
                onnavigationeventOnWarmupCompleted = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda6.onNavigationEvent(this.onTransact);
            } else {
                onnavigationeventOnWarmupCompleted = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda6.onWarmupCompleted();
            }
            this.onNavigationEvent = onnavigationeventOnWarmupCompleted.onExtraCallback((TextContextMenuHelperApi28ExternalSyntheticLambda5) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback)).onWarmupCompleted(asInterface()).onWarmupCompleted(new AudioManager.OnAudioFocusChangeListener() { // from class: androidx.media3.exoplayer.AudioFocusManager$$ExternalSyntheticLambda0
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i2) {
                    this.f$0.onExtraCallbackWithResult(i2);
                }
            }, this.onExtraCallbackWithResult).onWarmupCompleted();
            this.asBinder = false;
        }
        return CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda7.onWarmupCompleted((AudioManager) this.onWarmupCompleted.get(), this.onNavigationEvent);
    }

    private boolean asInterface() {
        TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5 = this.IAuthTabCallback;
        return textContextMenuHelperApi28ExternalSyntheticLambda5 != null && textContextMenuHelperApi28ExternalSyntheticLambda5.onExtraCallbackWithResult == 1;
    }

    private static int onExtraCallbackWithResult(@Nullable TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5) {
        if (textContextMenuHelperApi28ExternalSyntheticLambda5 == null) {
            return 0;
        }
        switch (textContextMenuHelperApi28ExternalSyntheticLambda5.onTransact) {
            case 0:
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                break;
            case 1:
            case 14:
                break;
            case 2:
            case 4:
                break;
            case 3:
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                break;
            case 11:
                if (textContextMenuHelperApi28ExternalSyntheticLambda5.onExtraCallbackWithResult == 1) {
                }
                break;
            case 15:
            default:
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("AudioFocusManager", "Unidentified audio usage: " + textContextMenuHelperApi28ExternalSyntheticLambda5.onTransact);
                break;
            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                break;
        }
        return 0;
    }

    private void IAuthTabCallback(int i2) {
        if (this.onExtraCallback != i2) {
            this.onExtraCallback = i2;
            float f = i2 == 4 ? 0.2f : 1.0f;
            if (this.IAuthTabCallbackStub != f) {
                this.IAuthTabCallbackStub = f;
                onExtraCallbackWithResult onextracallbackwithresult = this.asInterface;
                if (onextracallbackwithresult != null) {
                    onextracallbackwithresult.onExtraCallbackWithResult(f);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExtraCallbackWithResult(int i2) {
        if (i2 == -3 || i2 == -2) {
            if (i2 == -2 || asInterface()) {
                onWarmupCompleted(0);
                IAuthTabCallback(3);
                return;
            } else {
                IAuthTabCallback(4);
                return;
            }
        }
        if (i2 == -1) {
            onWarmupCompleted(-1);
            onExtraCallback();
            IAuthTabCallback(1);
        } else if (i2 == 1) {
            IAuthTabCallback(2);
            onWarmupCompleted(1);
        } else {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("AudioFocusManager", "Unknown focus change type: " + i2);
        }
    }

    private void onWarmupCompleted(int i2) {
        onExtraCallbackWithResult onextracallbackwithresult = this.asInterface;
        if (onextracallbackwithresult != null) {
            onextracallbackwithresult.onWarmupCompleted(i2);
        }
    }
}
