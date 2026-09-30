package o;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class TextFieldSelectionManagerKtExternalSyntheticLambda6 {
    private final LinkedHashMap<Uri, byte[]> onWarmupCompleted;

    public TextFieldSelectionManagerKtExternalSyntheticLambda6(final int i2) {
        this.onWarmupCompleted = new LinkedHashMap<Uri, byte[]>(i2 + 1, 1.0f, false) { // from class: o.TextFieldSelectionManagerKtExternalSyntheticLambda6.5
            @Override // java.util.LinkedHashMap
            protected boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
                return size() > i2;
            }
        };
    }

    public byte[] onWarmupCompleted(@Nullable Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.onWarmupCompleted.get(uri);
    }

    public byte[] onWarmupCompleted(Uri uri, byte[] bArr) {
        return this.onWarmupCompleted.put((Uri) RecordingInputConnection_androidKt.onExtraCallbackWithResult(uri), (byte[]) RecordingInputConnection_androidKt.onExtraCallbackWithResult(bArr));
    }

    public byte[] onNavigationEvent(Uri uri) {
        return this.onWarmupCompleted.remove(RecordingInputConnection_androidKt.onExtraCallbackWithResult(uri));
    }
}
