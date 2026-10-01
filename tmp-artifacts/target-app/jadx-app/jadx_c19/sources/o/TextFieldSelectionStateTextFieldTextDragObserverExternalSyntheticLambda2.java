package o;

import android.net.Uri;
import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda2 {
    String IAuthTabCallback(String str, @Nullable String str2);

    long onWarmupCompleted(String str, long j);

    static long IAuthTabCallback(TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda2 textFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda2) {
        return textFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda2.onWarmupCompleted("exo_len", -1L);
    }

    static Uri onNavigationEvent(TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda2 textFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda2) {
        String strIAuthTabCallback = textFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda2.IAuthTabCallback("exo_redir", null);
        if (strIAuthTabCallback == null) {
            return null;
        }
        return Uri.parse(strIAuthTabCallback);
    }
}
