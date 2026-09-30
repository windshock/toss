package o;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lud3 {
    public static final lud3 onExtraCallbackWithResult;
    public static final setPatch onWarmupCompleted;

    private lud3() {
    }

    static {
        lud3 lud3Var = new lud3();
        onExtraCallbackWithResult = lud3Var;
        djExternalSyntheticApiModelOutline2.onWarmupCompleted("kotlinx.coroutines.fast.service.loader", true);
        onWarmupCompleted = lud3Var.onExtraCallbackWithResult();
    }

    private final setPatch onExtraCallbackWithResult() {
        Object next;
        setPatch setpatchOnExtraCallbackWithResult;
        try {
            List listOnRelationshipValidationResult = ensureCausesIsMutable.onRelationshipValidationResult(clearSelinuxLabel.onExtraCallbackWithResult(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));
            Iterator it = listOnRelationshipValidationResult.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
            return (mainDispatcherFactory == null || (setpatchOnExtraCallbackWithResult = lud4.onExtraCallbackWithResult(mainDispatcherFactory, listOnRelationshipValidationResult)) == null) ? lud4.IAuthTabCallback(null, null, 3, null) : setpatchOnExtraCallbackWithResult;
        } catch (Throwable th) {
            return lud4.IAuthTabCallback(th, null, 2, null);
        }
    }
}
