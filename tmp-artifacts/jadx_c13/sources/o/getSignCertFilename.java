package o;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import kotlin.Unit;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getSignCertFilename extends Converter.Factory {
    @Override // retrofit2.Converter.Factory
    @Nullable
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == ResponseBody.class) {
            if (getDirNames.onWarmupCompleted(annotationArr, certGetAuthorityKeyIdentifier.class)) {
                return onNavigationEvent.IAuthTabCallback;
            }
            return onWarmupCompleted.onNavigationEvent;
        }
        if (type == Void.class) {
            return IAuthTabCallbackStub.onWarmupCompleted;
        }
        if (getDirNames.onExtraCallback(type)) {
            return onExtraCallback.onWarmupCompleted;
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (RequestBody.class.isAssignableFrom(getDirNames.onWarmupCompleted(type))) {
            return onExtraCallbackWithResult.onNavigationEvent;
        }
        return null;
    }

    static final class IAuthTabCallbackStub implements Converter<ResponseBody, Void> {
        static final IAuthTabCallbackStub onWarmupCompleted = new IAuthTabCallbackStub();

        IAuthTabCallbackStub() {
        }

        @Override // retrofit2.Converter
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public Void convert(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    static final class onExtraCallback implements Converter<ResponseBody, Unit> {
        static final onExtraCallback onWarmupCompleted = new onExtraCallback();

        onExtraCallback() {
        }

        @Override // retrofit2.Converter
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public Unit convert(ResponseBody responseBody) {
            responseBody.close();
            return Unit.INSTANCE;
        }
    }

    static final class onExtraCallbackWithResult implements Converter<RequestBody, RequestBody> {
        static final onExtraCallbackWithResult onNavigationEvent = new onExtraCallbackWithResult();

        @Override // retrofit2.Converter
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public RequestBody convert(RequestBody requestBody) {
            return requestBody;
        }

        onExtraCallbackWithResult() {
        }
    }

    static final class onNavigationEvent implements Converter<ResponseBody, ResponseBody> {
        static final onNavigationEvent IAuthTabCallback = new onNavigationEvent();

        @Override // retrofit2.Converter
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public ResponseBody convert(ResponseBody responseBody) {
            return responseBody;
        }

        onNavigationEvent() {
        }
    }

    static final class onWarmupCompleted implements Converter<ResponseBody, ResponseBody> {
        static final onWarmupCompleted onNavigationEvent = new onWarmupCompleted();

        onWarmupCompleted() {
        }

        @Override // retrofit2.Converter
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public ResponseBody convert(ResponseBody responseBody) throws IOException {
            try {
                return getDirNames.onNavigationEvent(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    public static final class IAuthTabCallback implements Converter<Object, String> {
        public static final IAuthTabCallback IAuthTabCallback = new IAuthTabCallback();

        IAuthTabCallback() {
        }

        @Override // retrofit2.Converter
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public String convert(Object obj) {
            return obj.toString();
        }
    }
}
