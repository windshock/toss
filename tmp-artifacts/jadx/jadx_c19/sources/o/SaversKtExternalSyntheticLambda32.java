package o;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.SaversKtExternalSyntheticLambda33;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SaversKtExternalSyntheticLambda32 {
    private static final SaversKtExternalSyntheticLambda33.onExtraCallback<?> onExtraCallbackWithResult = new SaversKtExternalSyntheticLambda33.onExtraCallback<Object>() { // from class: o.SaversKtExternalSyntheticLambda32.4
        @Override // o.SaversKtExternalSyntheticLambda33.onExtraCallback
        public SaversKtExternalSyntheticLambda33<Object> onExtraCallback(@NonNull Object obj) {
            return new onNavigationEvent(obj);
        }

        @Override // o.SaversKtExternalSyntheticLambda33.onExtraCallback
        public Class<Object> onExtraCallbackWithResult() {
            throw new UnsupportedOperationException("Not implemented");
        }
    };
    private final Map<Class<?>, SaversKtExternalSyntheticLambda33.onExtraCallback<?>> onExtraCallback = new HashMap();

    public void onNavigationEvent(@NonNull SaversKtExternalSyntheticLambda33.onExtraCallback<?> onextracallback) {
        synchronized (this) {
            this.onExtraCallback.put(onextracallback.onExtraCallbackWithResult(), onextracallback);
        }
    }

    public <T> SaversKtExternalSyntheticLambda33<T> IAuthTabCallback(@NonNull T t) {
        SaversKtExternalSyntheticLambda33<T> saversKtExternalSyntheticLambda33;
        synchronized (this) {
            markHierarchyDirty.onExtraCallbackWithResult(t);
            SaversKtExternalSyntheticLambda33.onExtraCallback<?> onextracallback = this.onExtraCallback.get(t.getClass());
            if (onextracallback == null) {
                Iterator<SaversKtExternalSyntheticLambda33.onExtraCallback<?>> it = this.onExtraCallback.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    SaversKtExternalSyntheticLambda33.onExtraCallback<?> next = it.next();
                    if (next.onExtraCallbackWithResult().isAssignableFrom(t.getClass())) {
                        onextracallback = next;
                        break;
                    }
                }
            }
            if (onextracallback == null) {
                onextracallback = onExtraCallbackWithResult;
            }
            saversKtExternalSyntheticLambda33 = (SaversKtExternalSyntheticLambda33<T>) onextracallback.onExtraCallback(t);
        }
        return saversKtExternalSyntheticLambda33;
    }

    static final class onNavigationEvent implements SaversKtExternalSyntheticLambda33<Object> {
        private final Object onNavigationEvent;

        @Override // o.SaversKtExternalSyntheticLambda33
        public void onWarmupCompleted() {
        }

        onNavigationEvent(@NonNull Object obj) {
            this.onNavigationEvent = obj;
        }

        @Override // o.SaversKtExternalSyntheticLambda33
        public Object onNavigationEvent() {
            return this.onNavigationEvent;
        }
    }
}
