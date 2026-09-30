package o;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldSelectionStateExternalSyntheticLambda8 implements TextFieldSelectionStateExternalSyntheticLambda0 {
    private final PriorityTaskManager onExtraCallbackWithResult;
    private final TextFieldSelectionStateExternalSyntheticLambda0 onNavigationEvent;
    private final int onWarmupCompleted;

    public TextFieldSelectionStateExternalSyntheticLambda8(TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0, PriorityTaskManager priorityTaskManager, int i2) {
        this.onNavigationEvent = (TextFieldSelectionStateExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(textFieldSelectionStateExternalSyntheticLambda0);
        this.onExtraCallbackWithResult = (PriorityTaskManager) RecordingInputConnection_androidKt.onExtraCallbackWithResult(priorityTaskManager);
        this.onWarmupCompleted = i2;
    }

    public void onExtraCallback(TextFieldSelectionStateExternalSyntheticLambda7 textFieldSelectionStateExternalSyntheticLambda7) {
        this.onNavigationEvent.onExtraCallback(textFieldSelectionStateExternalSyntheticLambda7);
    }

    public long onNavigationEvent(TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12) throws IOException {
        this.onExtraCallbackWithResult.onWarmupCompleted(this.onWarmupCompleted);
        return this.onNavigationEvent.onNavigationEvent(textFieldSelectionStateExternalSyntheticLambda12);
    }

    public int onWarmupCompleted(byte[] bArr, int i2, int i3) throws IOException {
        this.onExtraCallbackWithResult.onWarmupCompleted(this.onWarmupCompleted);
        return this.onNavigationEvent.onWarmupCompleted(bArr, i2, i3);
    }

    public Uri onWarmupCompleted() {
        return this.onNavigationEvent.onWarmupCompleted();
    }

    public Map<String, List<String>> onExtraCallbackWithResult() {
        return this.onNavigationEvent.onExtraCallbackWithResult();
    }

    public void onExtraCallback() throws IOException {
        this.onNavigationEvent.onExtraCallback();
    }
}
