package o;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setPivotY {
    private final List<onExtraCallback<?>> IAuthTabCallback = new ArrayList();

    public <T> SaversKtExternalSyntheticLambda24<T> onExtraCallbackWithResult(@NonNull Class<T> cls) {
        synchronized (this) {
            for (onExtraCallback<?> onextracallback : this.IAuthTabCallback) {
                if (onextracallback.IAuthTabCallback(cls)) {
                    return (SaversKtExternalSyntheticLambda24<T>) onextracallback.IAuthTabCallback;
                }
            }
            return null;
        }
    }

    public <T> void onExtraCallbackWithResult(@NonNull Class<T> cls, @NonNull SaversKtExternalSyntheticLambda24<T> saversKtExternalSyntheticLambda24) {
        synchronized (this) {
            this.IAuthTabCallback.add(new onExtraCallback<>(cls, saversKtExternalSyntheticLambda24));
        }
    }

    static final class onExtraCallback<T> {
        final SaversKtExternalSyntheticLambda24<T> IAuthTabCallback;
        private final Class<T> onExtraCallback;

        onExtraCallback(@NonNull Class<T> cls, @NonNull SaversKtExternalSyntheticLambda24<T> saversKtExternalSyntheticLambda24) {
            this.onExtraCallback = cls;
            this.IAuthTabCallback = saversKtExternalSyntheticLambda24;
        }

        boolean IAuthTabCallback(@NonNull Class<?> cls) {
            return this.onExtraCallback.isAssignableFrom(cls);
        }
    }
}
