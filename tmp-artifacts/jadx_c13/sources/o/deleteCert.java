package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import o.getCert;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class deleteCert extends Converter.Factory {
    public static deleteCert IAuthTabCallback() {
        return new deleteCert();
    }

    private deleteCert() {
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return deleteFPPrikey.IAuthTabCallback;
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == String.class) {
            return getCert.asInterface.onExtraCallbackWithResult;
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return getCert.onNavigationEvent.onNavigationEvent;
        }
        if (type == Byte.class || type == Byte.TYPE) {
            return getCert.IAuthTabCallback.IAuthTabCallback;
        }
        if (type == Character.class || type == Character.TYPE) {
            return getCert.onExtraCallbackWithResult.onWarmupCompleted;
        }
        if (type == Double.class || type == Double.TYPE) {
            return getCert.onWarmupCompleted.onWarmupCompleted;
        }
        if (type == Float.class || type == Float.TYPE) {
            return getCert.onExtraCallback.IAuthTabCallback;
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return getCert.onTransact.onExtraCallbackWithResult;
        }
        if (type == Long.class || type == Long.TYPE) {
            return getCert.asBinder.onWarmupCompleted;
        }
        if (type == Short.class || type == Short.TYPE) {
            return getCert.IAuthTabCallbackStub.onExtraCallbackWithResult;
        }
        return null;
    }
}
