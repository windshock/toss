package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AudienceNetworkContentProvider extends CallAdapter.Factory {
    private final CallAdapter.Factory[] onExtraCallbackWithResult;

    public AudienceNetworkContentProvider(@NotNull CallAdapter.Factory... factoryArr) {
        Intrinsics.checkNotNullParameter(factoryArr, "");
        this.onExtraCallbackWithResult = factoryArr;
    }

    private final CallAdapter<Object, Object> onExtraCallbackWithResult(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        CallAdapter.Factory[] factoryArr = this.onExtraCallbackWithResult;
        int length = factoryArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                return null;
            }
            CallAdapter<Object, Object> callAdapter = factoryArr[i].get(type, annotationArr, retrofit);
            CallAdapter<Object, Object> callAdapter2 = callAdapter != null ? callAdapter : null;
            if (callAdapter2 != null) {
                return callAdapter2;
            }
            i++;
        }
    }

    public CallAdapter<?, ?> get(@NotNull Type type, @NotNull Annotation[] annotationArr, @NotNull Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(annotationArr, "");
        Intrinsics.checkNotNullParameter(retrofit, "");
        CallAdapter<Object, Object> callAdapterOnExtraCallbackWithResult = onExtraCallbackWithResult(type, annotationArr, retrofit);
        if (callAdapterOnExtraCallbackWithResult != null) {
            return new onNavigationEvent(callAdapterOnExtraCallbackWithResult);
        }
        if (Intrinsics.areEqual(CallAdapter.Factory.getRawType(type), getSignPrikeyCCFBPHFilename.class)) {
            return new onNavigationEvent(new IAuthTabCallback(CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) type)));
        }
        throw new IllegalArgumentException(CallAdapter.Factory.getRawType(type) + " is not supported.");
    }

    public static final class IAuthTabCallback implements CallAdapter<Object, getSignPrikeyCCFBPHFilename<Object>> {
        final /* synthetic */ Type onNavigationEvent;

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public getSignPrikeyCCFBPHFilename<Object> adapt(getSignPrikeyCCFBPHFilename<Object> getsignprikeyccfbphfilename) {
            Intrinsics.checkNotNullParameter(getsignprikeyccfbphfilename, "");
            return getsignprikeyccfbphfilename;
        }

        IAuthTabCallback(Type type) {
            this.onNavigationEvent = type;
        }

        public Type responseType() {
            Type type = this.onNavigationEvent;
            Intrinsics.checkNotNull(type);
            return type;
        }
    }

    public static final class onNavigationEvent<R, T> implements CallAdapter<R, T> {
        private final CallAdapter<R, T> IAuthTabCallback;

        public Type responseType() {
            return this.IAuthTabCallback.responseType();
        }

        public onNavigationEvent(@NotNull CallAdapter<R, T> callAdapter) {
            Intrinsics.checkNotNullParameter(callAdapter, "");
            this.IAuthTabCallback = callAdapter;
        }

        public T adapt(@NotNull getSignPrikeyCCFBPHFilename<R> getsignprikeyccfbphfilename) {
            Intrinsics.checkNotNullParameter(getsignprikeyccfbphfilename, "");
            T t = (T) this.IAuthTabCallback.adapt(new AudienceNetworkAdsInitSettingsBuilder(getsignprikeyccfbphfilename));
            Intrinsics.checkNotNullExpressionValue(t, "");
            return t;
        }
    }
}
