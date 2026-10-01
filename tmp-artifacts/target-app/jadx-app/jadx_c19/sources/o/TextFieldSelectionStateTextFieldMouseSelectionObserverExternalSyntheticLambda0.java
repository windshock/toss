package o;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda0 implements TextFieldSelectionStateExternalSyntheticLambda0 {
    private boolean IAuthTabCallback;
    private final TextFieldSelectionStateExternalSyntheticLambda0 onExtraCallback;
    private final TextFieldMagnifierNodeImpl28restartAnimationJob1ExternalSyntheticLambda0 onExtraCallbackWithResult;
    private long onWarmupCompleted;

    public TextFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda0(TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0, TextFieldMagnifierNodeImpl28restartAnimationJob1ExternalSyntheticLambda0 textFieldMagnifierNodeImpl28restartAnimationJob1ExternalSyntheticLambda0) {
        this.onExtraCallback = (TextFieldSelectionStateExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(textFieldSelectionStateExternalSyntheticLambda0);
        this.onExtraCallbackWithResult = (TextFieldMagnifierNodeImpl28restartAnimationJob1ExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(textFieldMagnifierNodeImpl28restartAnimationJob1ExternalSyntheticLambda0);
    }

    public void onExtraCallback(TextFieldSelectionStateExternalSyntheticLambda7 textFieldSelectionStateExternalSyntheticLambda7) {
        this.onExtraCallback.onExtraCallback(textFieldSelectionStateExternalSyntheticLambda7);
    }

    public long onNavigationEvent(TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12) throws IOException {
        long jOnNavigationEvent = this.onExtraCallback.onNavigationEvent(textFieldSelectionStateExternalSyntheticLambda12);
        this.onWarmupCompleted = jOnNavigationEvent;
        if (jOnNavigationEvent == 0) {
            return 0L;
        }
        if (textFieldSelectionStateExternalSyntheticLambda12.asBinder == -1 && jOnNavigationEvent != -1) {
            textFieldSelectionStateExternalSyntheticLambda12 = textFieldSelectionStateExternalSyntheticLambda12.IAuthTabCallback(0L, jOnNavigationEvent);
        }
        this.IAuthTabCallback = true;
        this.onExtraCallbackWithResult.onWarmupCompleted(textFieldSelectionStateExternalSyntheticLambda12);
        return this.onWarmupCompleted;
    }

    public int onWarmupCompleted(byte[] bArr, int i2, int i3) throws IOException {
        if (this.onWarmupCompleted == 0) {
            return -1;
        }
        int iOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted(bArr, i2, i3);
        if (iOnWarmupCompleted > 0) {
            this.onExtraCallbackWithResult.IAuthTabCallback(bArr, i2, iOnWarmupCompleted);
            long j = this.onWarmupCompleted;
            if (j != -1) {
                this.onWarmupCompleted = j - iOnWarmupCompleted;
            }
        }
        return iOnWarmupCompleted;
    }

    public Uri onWarmupCompleted() {
        return this.onExtraCallback.onWarmupCompleted();
    }

    public Map<String, List<String>> onExtraCallbackWithResult() {
        return this.onExtraCallback.onExtraCallbackWithResult();
    }

    public void onExtraCallback() throws IOException {
        try {
            this.onExtraCallback.onExtraCallback();
        } finally {
            if (this.IAuthTabCallback) {
                this.IAuthTabCallback = false;
                this.onExtraCallbackWithResult.onExtraCallback();
            }
        }
    }
}
