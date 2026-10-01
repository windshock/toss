package o;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setBKMCertB64 extends Converter.Factory {
    setBKMCertB64() {
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (Converter.Factory.getRawType(type) != Optional.class) {
            return null;
        }
        return new onNavigationEvent(retrofit.onWarmupCompleted(Converter.Factory.getParameterUpperBound(0, (ParameterizedType) type), annotationArr));
    }

    static final class onNavigationEvent<T> implements Converter<ResponseBody, Optional<T>> {
        private final Converter<ResponseBody, T> onNavigationEvent;

        onNavigationEvent(Converter<ResponseBody, T> converter) {
            this.onNavigationEvent = converter;
        }

        @Override // retrofit2.Converter
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public Optional<T> convert(ResponseBody responseBody) throws IOException {
            return Optional.ofNullable(this.onNavigationEvent.convert(responseBody));
        }
    }
}
