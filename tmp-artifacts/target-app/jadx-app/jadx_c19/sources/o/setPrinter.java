package o;

import com.fasterxml.jackson.databind.JavaType;
import java.util.Collection;
import o.getFragmentManager;
import o.setPrinter;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface setPrinter<T extends setPrinter<T>> {
    GridLayout onExtraCallback(findFragmentByTag findfragmentbytag, JavaType javaType, Collection<SurfaceControlV33TransactionExternalSyntheticLambda1> collection);

    T onNavigationEvent(Class<?> cls);

    T onNavigationEvent(getFragmentManager.onExtraCallbackWithResult onextracallbackwithresult, setColumnOrderPreserved setcolumnorderpreserved);

    Class<?> onWarmupCompleted();

    setColumnCount onWarmupCompleted(startIntentSenderFromFragment startintentsenderfromfragment, JavaType javaType, Collection<SurfaceControlV33TransactionExternalSyntheticLambda1> collection);

    default T onWarmupCompleted(getFragmentManager.IAuthTabCallback iAuthTabCallback, setColumnOrderPreserved setcolumnorderpreserved) {
        return (T) onNavigationEvent(iAuthTabCallback.onNavigationEvent(), setcolumnorderpreserved);
    }

    default T onExtraCallbackWithResult(Class<?> cls) {
        return (T) onNavigationEvent(cls);
    }
}
