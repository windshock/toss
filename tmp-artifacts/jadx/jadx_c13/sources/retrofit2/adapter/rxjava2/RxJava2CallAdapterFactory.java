package retrofit2.adapter.rxjava2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import o.JsonReaderUnknownNumberParsing;
import o.MapConverter;
import o.advance;
import o.getByteBuffer;
import o.wasLastName;
import o.writeRaw;
import retrofit2.CallAdapter;
import retrofit2.Response;
import retrofit2.Retrofit;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RxJava2CallAdapterFactory extends CallAdapter.Factory {

    @Nullable
    private final MapConverter onExtraCallbackWithResult;
    private final boolean onNavigationEvent;

    public static RxJava2CallAdapterFactory IAuthTabCallback() {
        return new RxJava2CallAdapterFactory(null, false);
    }

    private RxJava2CallAdapterFactory(@Nullable MapConverter mapConverter, boolean z) {
        this.onExtraCallbackWithResult = mapConverter;
        this.onNavigationEvent = z;
    }

    @Override // retrofit2.CallAdapter.Factory
    @Nullable
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        Type parameterUpperBound;
        boolean z;
        boolean z2;
        String str;
        Class<?> rawType = CallAdapter.Factory.getRawType(type);
        if (rawType == wasLastName.class) {
            return new RxJava2CallAdapter(Void.class, this.onExtraCallbackWithResult, this.onNavigationEvent, false, true, false, false, false, true);
        }
        boolean z3 = rawType == JsonReaderUnknownNumberParsing.class;
        boolean z4 = rawType == writeRaw.class;
        boolean z5 = rawType == advance.class;
        if (rawType != getByteBuffer.class && !z3 && !z4 && !z5) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (z3) {
                str = "Flowable";
            } else if (z4) {
                str = "Single";
            } else {
                str = z5 ? "Maybe" : "Observable";
            }
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type parameterUpperBound2 = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) type);
        Class<?> rawType2 = CallAdapter.Factory.getRawType(parameterUpperBound2);
        if (rawType2 == Response.class) {
            if (!(parameterUpperBound2 instanceof ParameterizedType)) {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
            parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound2);
            z2 = false;
            z = false;
        } else if (rawType2 != Result.class) {
            parameterUpperBound = parameterUpperBound2;
            z = true;
            z2 = false;
        } else {
            if (!(parameterUpperBound2 instanceof ParameterizedType)) {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
            parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound2);
            z2 = true;
            z = false;
        }
        return new RxJava2CallAdapter(parameterUpperBound, this.onExtraCallbackWithResult, this.onNavigationEvent, z2, z, z3, z4, z5, false);
    }
}
