package o;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class FragmentFactory<T> {
    public boolean IAuthTabCallback() {
        return false;
    }

    public boolean IAuthTabCallback(FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, T t) {
        return t == null;
    }

    public abstract void onExtraCallback(T t, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) throws IOException;

    public boolean onExtraCallbackWithResult() {
        return false;
    }

    public Class<T> onWarmupCompleted() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentFactory<?> onWarmupCompleted(Set<String> set) {
        return this;
    }

    public FragmentFactory<T> onWarmupCompleted(AsyncTaskLoader asyncTaskLoader) {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onExtraCallbackWithResult(T t, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1, GridLayout gridLayout) throws IOException, JsonMappingException {
        Class clsOnWarmupCompleted = onWarmupCompleted();
        if (clsOnWarmupCompleted == null) {
            clsOnWarmupCompleted = t.getClass();
        }
        fragmentManagerExternalSyntheticLambda1.onWarmupCompleted((Class<?>) clsOnWarmupCompleted, String.format("Type id handling not implemented for type %s (by serializer of type %s)", clsOnWarmupCompleted.getName(), getClass().getName()));
    }
}
