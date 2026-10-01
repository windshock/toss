package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface SaversKtExternalSyntheticLambda35<T> {

    public interface onNavigationEvent<T> {
        void onExtraCallback(@NonNull Exception exc);

        void onExtraCallback(@Nullable T t);
    }

    SaversKtExternalSyntheticLambda21 IAuthTabCallback();

    void onExtraCallback();

    void onExtraCallback(@NonNull SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda11, @NonNull onNavigationEvent<? super T> onnavigationevent);

    void onExtraCallbackWithResult();

    Class<T> onNavigationEvent();
}
