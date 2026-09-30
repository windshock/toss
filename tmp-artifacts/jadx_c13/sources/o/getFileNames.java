package o;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import retrofit2.RequestFactory;
import retrofit2.Retrofit;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class getFileNames<T> {
    @Nullable
    public abstract T onExtraCallbackWithResult(Object obj, Object[] objArr);

    getFileNames() {
    }

    public static <T> getFileNames<T> onExtraCallback(Retrofit retrofit, Class<?> cls, Method method) {
        RequestFactory requestFactoryOnWarmupCompleted = RequestFactory.onWarmupCompleted(retrofit, cls, method);
        Type genericReturnType = method.getGenericReturnType();
        if (getDirNames.onExtraCallbackWithResult(genericReturnType)) {
            throw getDirNames.IAuthTabCallback(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType == Void.TYPE) {
            throw getDirNames.IAuthTabCallback(method, "Service methods cannot return void.", new Object[0]);
        }
        return getSignPrikeyPHFilename.onExtraCallbackWithResult(retrofit, method, requestFactoryOnWarmupCompleted);
    }
}
