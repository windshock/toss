package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SavedStateHandleImplExternalSyntheticLambda0$IAuthTabCallback {
    private transient Annotation[][] IAuthTabCallback;
    public final Constructor<?> onExtraCallback;
    private transient Annotation[] onExtraCallbackWithResult;
    private int onWarmupCompleted = -1;

    public SavedStateHandleImplExternalSyntheticLambda0$IAuthTabCallback(Constructor<?> constructor) {
        this.onExtraCallback = constructor;
    }

    public Constructor<?> onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public int IAuthTabCallback() {
        int i2 = this.onWarmupCompleted;
        if (i2 >= 0) {
            return i2;
        }
        int parameterCount = this.onExtraCallback.getParameterCount();
        this.onWarmupCompleted = parameterCount;
        return parameterCount;
    }

    public Class<?> onExtraCallback() {
        return this.onExtraCallback.getDeclaringClass();
    }

    public Annotation[] onNavigationEvent() {
        Annotation[] annotationArr = this.onExtraCallbackWithResult;
        if (annotationArr != null) {
            return annotationArr;
        }
        Annotation[] declaredAnnotations = this.onExtraCallback.getDeclaredAnnotations();
        this.onExtraCallbackWithResult = declaredAnnotations;
        return declaredAnnotations;
    }

    public Annotation[][] onWarmupCompleted() {
        Annotation[][] annotationArr = this.IAuthTabCallback;
        if (annotationArr != null) {
            return annotationArr;
        }
        Annotation[][] parameterAnnotations = this.onExtraCallback.getParameterAnnotations();
        this.IAuthTabCallback = parameterAnnotations;
        return parameterAnnotations;
    }
}
