package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import retrofit2.CallAdapter;
import retrofit2.Response;
import retrofit2.Retrofit;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class getSignPrikeyCCFBFHFilename extends CallAdapter.Factory {
    getSignPrikeyCCFBFHFilename() {
    }

    @Override // retrofit2.CallAdapter.Factory
    @Nullable
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (CallAdapter.Factory.getRawType(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) type);
        if (CallAdapter.Factory.getRawType(parameterUpperBound) != Response.class) {
            return new onExtraCallback(parameterUpperBound);
        }
        if (!(parameterUpperBound instanceof ParameterizedType)) {
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        return new onWarmupCompleted(CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound));
    }

    static final class onExtraCallback<R> implements CallAdapter<R, CompletableFuture<R>> {
        private final Type onExtraCallback;

        onExtraCallback(Type type) {
            this.onExtraCallback = type;
        }

        @Override // retrofit2.CallAdapter
        public Type responseType() {
            return this.onExtraCallback;
        }

        @Override // retrofit2.CallAdapter
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<R> adapt(getSignPrikeyCCFBPHFilename<R> getsignprikeyccfbphfilename) {
            onNavigationEvent onnavigationevent = new onNavigationEvent(getsignprikeyccfbphfilename);
            getsignprikeyccfbphfilename.enqueue(new onWarmupCompleted(this, onnavigationevent));
            return onnavigationevent;
        }
    }

    static final class onWarmupCompleted<R> implements CallAdapter<R, CompletableFuture<Response<R>>> {
        private final Type onWarmupCompleted;

        onWarmupCompleted(Type type) {
            this.onWarmupCompleted = type;
        }

        @Override // retrofit2.CallAdapter
        public Type responseType() {
            return this.onWarmupCompleted;
        }

        @Override // retrofit2.CallAdapter
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<Response<R>> adapt(getSignPrikeyCCFBPHFilename<R> getsignprikeyccfbphfilename) {
            onNavigationEvent onnavigationevent = new onNavigationEvent(getsignprikeyccfbphfilename);
            getsignprikeyccfbphfilename.enqueue(new onWarmupCompleted(this, onnavigationevent));
            return onnavigationevent;
        }
    }
}
