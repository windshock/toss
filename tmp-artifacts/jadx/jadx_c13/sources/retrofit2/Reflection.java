package retrofit2;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import javax.annotation.Nullable;
import o.getSubjectAltName;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class Reflection {
    boolean onNavigationEvent(Method method) {
        return false;
    }

    @Nullable
    Object onExtraCallbackWithResult(Method method, Class<?> cls, Object obj, @Nullable Object[] objArr) throws Throwable {
        throw new AssertionError();
    }

    public String onNavigationEvent(Method method, int i) {
        return "parameter #" + (i + 1);
    }

    public static class Java8 extends Reflection {
        @Override // retrofit2.Reflection
        boolean onNavigationEvent(Method method) {
            return method.isDefault();
        }

        @Override // retrofit2.Reflection
        Object onExtraCallbackWithResult(Method method, Class<?> cls, Object obj, @Nullable Object[] objArr) throws Throwable {
            return getSubjectAltName.IAuthTabCallback(method, cls, obj, objArr);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.Reflection
        public String onNavigationEvent(Method method, int i) {
            Parameter parameter = method.getParameters()[i];
            if (parameter.isNamePresent()) {
                return "parameter '" + parameter.getName() + '\'';
            }
            return super.onNavigationEvent(method, i);
        }
    }

    public static final class Android24 extends Reflection {
        @Override // retrofit2.Reflection
        boolean onNavigationEvent(Method method) {
            return method.isDefault();
        }

        @Override // retrofit2.Reflection
        Object onExtraCallbackWithResult(Method method, Class<?> cls, Object obj, @Nullable Object[] objArr) throws Throwable {
            if (Build.VERSION.SDK_INT < 26) {
                throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
            }
            return getSubjectAltName.IAuthTabCallback(method, cls, obj, objArr);
        }
    }
}
