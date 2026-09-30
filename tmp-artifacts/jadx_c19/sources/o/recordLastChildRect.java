package o;

import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class recordLastChildRect {
    public static Class<?> IAuthTabCallback(String str) {
        if (convertResponseToCredentialManager.onExtraCallback(recordLastChildRect.class)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, recordLastChildRect.class);
            return null;
        }
    }

    public static Method onExtraCallbackWithResult(Class<?> cls, String str, @Nullable Class<?>... clsArr) {
        if (convertResponseToCredentialManager.onExtraCallback(recordLastChildRect.class)) {
            return null;
        }
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, recordLastChildRect.class);
            return null;
        }
    }

    public static Object onNavigationEvent(Class<?> cls, Method method, @Nullable Object obj, @Nullable Object... objArr) {
        if (convertResponseToCredentialManager.onExtraCallback(recordLastChildRect.class)) {
            return null;
        }
        if (obj != null) {
            try {
                obj = cls.cast(obj);
            } catch (Throwable th) {
                convertResponseToCredentialManager.onExtraCallbackWithResult(th, recordLastChildRect.class);
                return null;
            }
        }
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
