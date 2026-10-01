package o;

import android.net.Uri;
import java.io.IOException;
import o.TextFieldSelectionStateExternalSyntheticLambda0;
import o.TextFieldSelectionStateExternalSyntheticLambda9;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldSelectionStateExternalSyntheticLambda9 implements TextFieldSelectionStateExternalSyntheticLambda0 {
    public static final TextFieldSelectionStateExternalSyntheticLambda9 onExtraCallback = new TextFieldSelectionStateExternalSyntheticLambda9();
    public static final TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback onNavigationEvent = new TextFieldSelectionStateExternalSyntheticLambda0.onExtraCallback() { // from class: androidx.media3.datasource.PlaceholderDataSource$$ExternalSyntheticLambda0
        public final TextFieldSelectionStateExternalSyntheticLambda0 createDataSource() {
            return TextFieldSelectionStateExternalSyntheticLambda9.onNavigationEvent();
        }
    };

    public static /* synthetic */ TextFieldSelectionStateExternalSyntheticLambda9 onNavigationEvent() {
        return new TextFieldSelectionStateExternalSyntheticLambda9();
    }

    public void onExtraCallback() {
    }

    public void onExtraCallback(TextFieldSelectionStateExternalSyntheticLambda7 textFieldSelectionStateExternalSyntheticLambda7) {
    }

    public Uri onWarmupCompleted() {
        return null;
    }

    private TextFieldSelectionStateExternalSyntheticLambda9() {
    }

    public long onNavigationEvent(TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    public int onWarmupCompleted(byte[] bArr, int i2, int i3) {
        throw new UnsupportedOperationException();
    }
}
