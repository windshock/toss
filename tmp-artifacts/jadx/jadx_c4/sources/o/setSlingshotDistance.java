package o;

import java.lang.annotation.Annotation;
import javax.annotation.Nonnull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setSlingshotDistance {
    @Nonnull
    public static <T> T onNavigationEvent(Object obj, Class<T> cls) {
        if (obj instanceof matchStartAndEnd) {
            if (obj instanceof capturePropagationValues) {
                runAnimator.IAuthTabCallback(!onExtraCallbackWithResult(cls, "dagger.hilt.android.EarlyEntryPoint"), "Interface, %s, annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()", cls.getCanonicalName());
            }
            return cls.cast(obj);
        }
        if (obj instanceof matchNames) {
            return (T) onNavigationEvent(((matchNames) obj).generatedComponent(), cls);
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), matchStartAndEnd.class, matchNames.class));
    }

    private static boolean onExtraCallbackWithResult(Class<?> cls, String str) {
        for (Annotation annotation : cls.getAnnotations()) {
            if (annotation.annotationType().getCanonicalName().contentEquals(str)) {
                return true;
            }
        }
        return false;
    }
}
