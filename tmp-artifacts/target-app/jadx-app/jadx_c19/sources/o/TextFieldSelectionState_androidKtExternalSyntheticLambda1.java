package o;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldSelectionState_androidKtExternalSyntheticLambda1 {
    private final Map<String, Object> onNavigationEvent = new HashMap();
    private final List<String> IAuthTabCallback = new ArrayList();

    public static TextFieldSelectionState_androidKtExternalSyntheticLambda1 onNavigationEvent(TextFieldSelectionState_androidKtExternalSyntheticLambda1 textFieldSelectionState_androidKtExternalSyntheticLambda1, long j) {
        return textFieldSelectionState_androidKtExternalSyntheticLambda1.IAuthTabCallback("exo_len", j);
    }

    public static TextFieldSelectionState_androidKtExternalSyntheticLambda1 onNavigationEvent(TextFieldSelectionState_androidKtExternalSyntheticLambda1 textFieldSelectionState_androidKtExternalSyntheticLambda1, @Nullable Uri uri) {
        if (uri != null) {
            return textFieldSelectionState_androidKtExternalSyntheticLambda1.onWarmupCompleted("exo_redir", uri.toString());
        }
        return textFieldSelectionState_androidKtExternalSyntheticLambda1.onNavigationEvent("exo_redir");
    }

    public TextFieldSelectionState_androidKtExternalSyntheticLambda1 onWarmupCompleted(String str, String str2) {
        return onWarmupCompleted(str, (Object) str2);
    }

    public TextFieldSelectionState_androidKtExternalSyntheticLambda1 IAuthTabCallback(String str, long j) {
        return onWarmupCompleted(str, Long.valueOf(j));
    }

    public TextFieldSelectionState_androidKtExternalSyntheticLambda1 onNavigationEvent(String str) {
        this.IAuthTabCallback.add(str);
        this.onNavigationEvent.remove(str);
        return this;
    }

    public List<String> onNavigationEvent() {
        return Collections.unmodifiableList(new ArrayList(this.IAuthTabCallback));
    }

    public Map<String, Object> onWarmupCompleted() {
        HashMap map = new HashMap(this.onNavigationEvent);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    private TextFieldSelectionState_androidKtExternalSyntheticLambda1 onWarmupCompleted(String str, Object obj) {
        this.onNavigationEvent.put((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(str), RecordingInputConnection_androidKt.onExtraCallbackWithResult(obj));
        this.IAuthTabCallback.remove(str);
        return this;
    }
}
