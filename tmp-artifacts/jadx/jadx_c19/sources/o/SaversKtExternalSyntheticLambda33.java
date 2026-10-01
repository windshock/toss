package o;

import androidx.annotation.NonNull;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface SaversKtExternalSyntheticLambda33<T> {

    public interface onExtraCallback<T> {
        SaversKtExternalSyntheticLambda33<T> onExtraCallback(@NonNull T t);

        Class<T> onExtraCallbackWithResult();
    }

    T onNavigationEvent() throws IOException;

    void onWarmupCompleted();
}
