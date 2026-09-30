package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getExtensionName extends Converter.Factory {
    private final Gson onExtraCallback;
    private final boolean onNavigationEvent;

    public static getExtensionName onExtraCallback() {
        return onExtraCallbackWithResult(new Gson());
    }

    public static getExtensionName onExtraCallbackWithResult(Gson gson) {
        if (gson == null) {
            throw new NullPointerException("gson == null");
        }
        return new getExtensionName(gson, false);
    }

    private getExtensionName(Gson gson, boolean z) {
        this.onExtraCallback = gson;
        this.onNavigationEvent = z;
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        return new getKey5(this.onExtraCallback, this.onExtraCallback.getAdapter(TypeToken.get(type)));
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return new CertMode(this.onExtraCallback, this.onExtraCallback.getAdapter(TypeToken.get(type)), this.onNavigationEvent);
    }
}
