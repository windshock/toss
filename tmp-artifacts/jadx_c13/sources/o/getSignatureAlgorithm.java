package o;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getSignatureAlgorithm {
    private final List<?> IAuthTabCallback;
    private final Class<?> onExtraCallbackWithResult;

    @Nullable
    private final Object onNavigationEvent;
    private final Method onWarmupCompleted;

    public getSignatureAlgorithm(Class<?> cls, @Nullable Object obj, Method method, List<?> list) {
        this.onExtraCallbackWithResult = cls;
        this.onNavigationEvent = obj;
        this.onWarmupCompleted = method;
        this.IAuthTabCallback = Collections.unmodifiableList(list);
    }

    public Class<?> onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public Method onExtraCallback() {
        return this.onWarmupCompleted;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.onExtraCallbackWithResult.getName(), this.onWarmupCompleted.getName(), this.IAuthTabCallback);
    }
}
