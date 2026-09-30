package o;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldSelectionStateExternalSyntheticLambda11 extends InputStream {
    private long asInterface;
    private final TextFieldSelectionStateExternalSyntheticLambda0 onExtraCallback;
    private final TextFieldSelectionStateExternalSyntheticLambda12 onWarmupCompleted;
    private boolean IAuthTabCallback = false;
    private boolean onExtraCallbackWithResult = false;
    private final byte[] onNavigationEvent = new byte[1];

    public TextFieldSelectionStateExternalSyntheticLambda11(TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0, TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12) {
        this.onExtraCallback = textFieldSelectionStateExternalSyntheticLambda0;
        this.onWarmupCompleted = textFieldSelectionStateExternalSyntheticLambda12;
    }

    public void onNavigationEvent() throws IOException {
        onWarmupCompleted();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.onNavigationEvent) == -1) {
            return -1;
        }
        return this.onNavigationEvent[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.onExtraCallbackWithResult);
        onWarmupCompleted();
        int iOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted(bArr, i2, i3);
        if (iOnWarmupCompleted == -1) {
            return -1;
        }
        this.asInterface += iOnWarmupCompleted;
        return iOnWarmupCompleted;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.onExtraCallbackWithResult) {
            return;
        }
        this.onExtraCallback.onExtraCallback();
        this.onExtraCallbackWithResult = true;
    }

    private void onWarmupCompleted() throws IOException {
        if (this.IAuthTabCallback) {
            return;
        }
        this.onExtraCallback.onNavigationEvent(this.onWarmupCompleted);
        this.IAuthTabCallback = true;
    }
}
