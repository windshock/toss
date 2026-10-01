package o;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class BackdropScaffoldStateCompanionExternalSyntheticLambda1 implements TextFieldSelectionStateExternalSyntheticLambda0 {
    private final int IAuthTabCallback;
    private final TextFieldSelectionStateExternalSyntheticLambda0 onExtraCallback;
    private final byte[] onExtraCallbackWithResult;
    private final onWarmupCompleted onNavigationEvent;
    private int onWarmupCompleted;

    public interface onWarmupCompleted {
        void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20);
    }

    public BackdropScaffoldStateCompanionExternalSyntheticLambda1(TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0, int i2, onWarmupCompleted onwarmupcompleted) {
        RecordingInputConnection_androidKt.onNavigationEvent(i2 > 0);
        this.onExtraCallback = textFieldSelectionStateExternalSyntheticLambda0;
        this.IAuthTabCallback = i2;
        this.onNavigationEvent = onwarmupcompleted;
        this.onExtraCallbackWithResult = new byte[1];
        this.onWarmupCompleted = i2;
    }

    public void onExtraCallback(TextFieldSelectionStateExternalSyntheticLambda7 textFieldSelectionStateExternalSyntheticLambda7) {
        this.onExtraCallback.onExtraCallback(textFieldSelectionStateExternalSyntheticLambda7);
    }

    public long onNavigationEvent(TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12) {
        throw new UnsupportedOperationException();
    }

    public int onWarmupCompleted(byte[] bArr, int i2, int i3) throws IOException {
        if (this.onWarmupCompleted == 0) {
            if (!onNavigationEvent()) {
                return -1;
            }
            this.onWarmupCompleted = this.IAuthTabCallback;
        }
        int iOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted(bArr, i2, Math.min(this.onWarmupCompleted, i3));
        if (iOnWarmupCompleted != -1) {
            this.onWarmupCompleted -= iOnWarmupCompleted;
        }
        return iOnWarmupCompleted;
    }

    public Uri onWarmupCompleted() {
        return this.onExtraCallback.onWarmupCompleted();
    }

    public Map<String, List<String>> onExtraCallbackWithResult() {
        return this.onExtraCallback.onExtraCallbackWithResult();
    }

    public void onExtraCallback() {
        throw new UnsupportedOperationException();
    }

    private boolean onNavigationEvent() throws IOException {
        if (this.onExtraCallback.onWarmupCompleted(this.onExtraCallbackWithResult, 0, 1) == -1) {
            return false;
        }
        int i2 = (this.onExtraCallbackWithResult[0] & OggPageHeader.MAX_SEGMENT_COUNT) << 4;
        if (i2 == 0) {
            return true;
        }
        byte[] bArr = new byte[i2];
        int i3 = i2;
        int i4 = 0;
        while (i3 > 0) {
            int iOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted(bArr, i4, i3);
            if (iOnWarmupCompleted == -1) {
                return false;
            }
            i4 += iOnWarmupCompleted;
            i3 -= iOnWarmupCompleted;
        }
        while (i2 > 0 && bArr[i2 - 1] == 0) {
            i2--;
        }
        if (i2 > 0) {
            this.onNavigationEvent.IAuthTabCallback(new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(bArr, i2));
        }
        return true;
    }
}
