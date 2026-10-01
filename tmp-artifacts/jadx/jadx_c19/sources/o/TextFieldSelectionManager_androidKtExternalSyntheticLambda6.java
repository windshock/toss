package o;

import androidx.media3.exoplayer.hls.SampleQueueMappingException;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class TextFieldSelectionManager_androidKtExternalSyntheticLambda6 implements BottomNavigationKtExternalSyntheticLambda5 {
    private int IAuthTabCallback = -1;
    private final TextFieldSelectionManager_androidKtExternalSyntheticLambda4 onExtraCallback;
    private final int onWarmupCompleted;

    public TextFieldSelectionManager_androidKtExternalSyntheticLambda6(TextFieldSelectionManager_androidKtExternalSyntheticLambda4 textFieldSelectionManager_androidKtExternalSyntheticLambda4, int i2) {
        this.onExtraCallback = textFieldSelectionManager_androidKtExternalSyntheticLambda4;
        this.onWarmupCompleted = i2;
    }

    public void onExtraCallback() {
        RecordingInputConnection_androidKt.onNavigationEvent(this.IAuthTabCallback == -1);
        this.IAuthTabCallback = this.onExtraCallback.IAuthTabCallback(this.onWarmupCompleted);
    }

    public void onNavigationEvent() {
        if (this.IAuthTabCallback != -1) {
            this.onExtraCallback.onNavigationEvent(this.onWarmupCompleted);
            this.IAuthTabCallback = -1;
        }
    }

    @Override // o.BottomNavigationKtExternalSyntheticLambda5
    public boolean onWarmupCompleted() {
        if (this.IAuthTabCallback != -3) {
            return IAuthTabCallback() && this.onExtraCallback.onExtraCallback(this.IAuthTabCallback);
        }
        return true;
    }

    @Override // o.BottomNavigationKtExternalSyntheticLambda5
    public void onExtraCallbackWithResult() throws IOException {
        int i2 = this.IAuthTabCallback;
        if (i2 == -2) {
            throw new SampleQueueMappingException(this.onExtraCallback.IAuthTabCallbackDefault().onWarmupCompleted(this.onWarmupCompleted).IAuthTabCallback(0).isEngagementSignalsApiAvailable);
        }
        if (i2 == -1) {
            this.onExtraCallback.IAuthTabCallbackStub();
        } else if (i2 != -3) {
            this.onExtraCallback.onExtraCallbackWithResult(i2);
        }
    }

    @Override // o.BottomNavigationKtExternalSyntheticLambda5
    public int onNavigationEvent(AndroidSelectionHandles_androidKtExternalSyntheticLambda7 androidSelectionHandles_androidKtExternalSyntheticLambda7, SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2, int i2) {
        if (this.IAuthTabCallback == -3) {
            selectionControllerExternalSyntheticLambda2.onWarmupCompleted(4);
            return -4;
        }
        if (IAuthTabCallback()) {
            return this.onExtraCallback.onWarmupCompleted(this.IAuthTabCallback, androidSelectionHandles_androidKtExternalSyntheticLambda7, selectionControllerExternalSyntheticLambda2, i2);
        }
        return -3;
    }

    @Override // o.BottomNavigationKtExternalSyntheticLambda5
    public int onExtraCallbackWithResult(long j) {
        if (IAuthTabCallback()) {
            return this.onExtraCallback.onExtraCallbackWithResult(this.IAuthTabCallback, j);
        }
        return 0;
    }

    private boolean IAuthTabCallback() {
        int i2 = this.IAuthTabCallback;
        return (i2 == -1 || i2 == -3 || i2 == -2) ? false : true;
    }
}
