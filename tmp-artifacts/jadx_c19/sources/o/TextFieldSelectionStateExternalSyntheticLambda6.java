package o;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldSelectionStateExternalSyntheticLambda6 implements TextFieldSelectionStateExternalSyntheticLambda0 {
    private long onExtraCallback;
    private final TextFieldSelectionStateExternalSyntheticLambda0 onExtraCallbackWithResult;
    private Uri onWarmupCompleted = Uri.EMPTY;
    private Map<String, List<String>> onNavigationEvent = Collections.EMPTY_MAP;

    public TextFieldSelectionStateExternalSyntheticLambda6(TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0) {
        this.onExtraCallbackWithResult = (TextFieldSelectionStateExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(textFieldSelectionStateExternalSyntheticLambda0);
    }

    public void IAuthTabCallbackStub() {
        this.onExtraCallback = 0L;
    }

    public long onNavigationEvent() {
        return this.onExtraCallback;
    }

    public Uri IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    public Map<String, List<String>> asBinder() {
        return this.onNavigationEvent;
    }

    public void onExtraCallback(TextFieldSelectionStateExternalSyntheticLambda7 textFieldSelectionStateExternalSyntheticLambda7) {
        this.onExtraCallbackWithResult.onExtraCallback(textFieldSelectionStateExternalSyntheticLambda7);
    }

    public long onNavigationEvent(TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12) throws IOException {
        this.onWarmupCompleted = textFieldSelectionStateExternalSyntheticLambda12.asInterface;
        this.onNavigationEvent = Collections.EMPTY_MAP;
        try {
            return this.onExtraCallbackWithResult.onNavigationEvent(textFieldSelectionStateExternalSyntheticLambda12);
        } finally {
            Uri uriOnWarmupCompleted = onWarmupCompleted();
            if (uriOnWarmupCompleted != null) {
                this.onWarmupCompleted = uriOnWarmupCompleted;
            }
            this.onNavigationEvent = onExtraCallbackWithResult();
        }
    }

    public int onWarmupCompleted(byte[] bArr, int i2, int i3) throws IOException {
        int iOnWarmupCompleted = this.onExtraCallbackWithResult.onWarmupCompleted(bArr, i2, i3);
        if (iOnWarmupCompleted != -1) {
            this.onExtraCallback += iOnWarmupCompleted;
        }
        return iOnWarmupCompleted;
    }

    public Uri onWarmupCompleted() {
        return this.onExtraCallbackWithResult.onWarmupCompleted();
    }

    public Map<String, List<String>> onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult.onExtraCallbackWithResult();
    }

    public void onExtraCallback() throws IOException {
        this.onExtraCallbackWithResult.onExtraCallback();
    }
}
