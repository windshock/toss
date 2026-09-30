package o;

import android.os.Build;
import android.util.LruCache;
import android.util.Pair;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.function.Consumer;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class tru2 {
    private static LruCache<Pair<Method, ClassLoader>, Method> onExtraCallbackWithResult;
    private static Consumer<Boolean> onNavigationEvent;

    public static Method onWarmupCompleted(Method method, ClassLoader classLoader) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        LruCache<Pair<Method, ClassLoader>, Method> lruCache = onExtraCallbackWithResult;
        if (lruCache != null) {
            Method method2 = lruCache.get(new Pair<>(method, classLoader));
            Consumer<Boolean> consumer = onNavigationEvent;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(method2 != null));
            }
            if (method2 != null) {
                return method2;
            }
        }
        Method declaredMethod = Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
        LruCache<Pair<Method, ClassLoader>, Method> lruCache2 = onExtraCallbackWithResult;
        if (lruCache2 != null) {
            lruCache2.put(new Pair<>(method, classLoader), declaredMethod);
        }
        return declaredMethod;
    }

    public static <T> T IAuthTabCallback(Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(tru2.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static InvocationHandler onWarmupCompleted(Object obj) {
        if (obj == null) {
            return null;
        }
        return new onWarmupCompleted(obj);
    }

    static class onWarmupCompleted implements InvocationHandler {
        private final Object onNavigationEvent;

        public onWarmupCompleted(Object obj) {
            this.onNavigationEvent = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                return tru2.onWarmupCompleted(method, this.onNavigationEvent.getClass().getClassLoader()).invoke(this.onNavigationEvent, objArr);
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            } catch (ReflectiveOperationException e2) {
                throw new RuntimeException("Reflection failed for method " + method, e2);
            }
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj instanceof onWarmupCompleted) {
                return this.onNavigationEvent.equals(((onWarmupCompleted) obj).onNavigationEvent);
            }
            return this.onNavigationEvent.equals(obj);
        }

        public int hashCode() {
            return this.onNavigationEvent.hashCode();
        }
    }

    private static boolean onExtraCallback() {
        String str = Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }

    public static boolean IAuthTabCallback(Collection<String> collection, String str) {
        if (collection.contains(str)) {
            return true;
        }
        if (!onExtraCallback()) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":dev");
        return collection.contains(sb.toString());
    }
}
