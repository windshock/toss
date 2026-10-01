package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import o.getDirNames;
import o.getSignPrikeyCCFBPHFilename;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface CallAdapter<R, T> {
    T adapt(getSignPrikeyCCFBPHFilename<R> getsignprikeyccfbphfilename);

    Type responseType();

    public static abstract class Factory {
        @Nullable
        public abstract CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit);

        public static Type getParameterUpperBound(int i, ParameterizedType parameterizedType) {
            return getDirNames.onExtraCallbackWithResult(i, parameterizedType);
        }

        public static Class<?> getRawType(Type type) {
            return getDirNames.onWarmupCompleted(type);
        }
    }
}
