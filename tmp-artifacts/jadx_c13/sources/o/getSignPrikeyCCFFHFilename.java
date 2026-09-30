package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class getSignPrikeyCCFFHFilename extends CallAdapter.Factory {

    @Nullable
    private final Executor onNavigationEvent;

    getSignPrikeyCCFFHFilename(@Nullable Executor executor) {
        this.onNavigationEvent = executor;
    }

    @Override // retrofit2.CallAdapter.Factory
    @Nullable
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (CallAdapter.Factory.getRawType(type) != getSignPrikeyCCFBPHFilename.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        }
        final Type typeOnExtraCallbackWithResult = getDirNames.onExtraCallbackWithResult(0, (ParameterizedType) type);
        final Executor executor = getDirNames.onWarmupCompleted(annotationArr, CertCertType.class) ? null : this.onNavigationEvent;
        return new CallAdapter<Object, getSignPrikeyCCFBPHFilename<?>>() { // from class: o.getSignPrikeyCCFFHFilename.3
            @Override // retrofit2.CallAdapter
            public Type responseType() {
                return typeOnExtraCallbackWithResult;
            }

            @Override // retrofit2.CallAdapter
            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public getSignPrikeyCCFBPHFilename<Object> adapt(getSignPrikeyCCFBPHFilename<Object> getsignprikeyccfbphfilename) {
                Executor executor2 = executor;
                return executor2 == null ? getsignprikeyccfbphfilename : new IAuthTabCallback(executor2, getsignprikeyccfbphfilename);
            }
        };
    }
}
