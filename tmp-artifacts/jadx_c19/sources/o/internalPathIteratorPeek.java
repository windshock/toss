package o;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Modifier;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class internalPathIteratorPeek {
    public abstract JavaType IAuthTabCallback();

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract String onExtraCallback();

    protected abstract int onExtraCallbackWithResult();

    public abstract boolean onExtraCallbackWithResult(Class<?> cls);

    public abstract boolean onExtraCallbackWithResult(Class<? extends Annotation>[] clsArr);

    public abstract Class<?> onNavigationEvent();

    public abstract <A extends Annotation> A onWarmupCompleted(Class<A> cls);

    public abstract AnnotatedElement onWarmupCompleted();

    public abstract String toString();

    protected internalPathIteratorPeek() {
    }

    public boolean asBinder() {
        return Modifier.isStatic(onExtraCallbackWithResult());
    }
}
