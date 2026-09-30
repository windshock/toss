package o;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Converter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class deleteFPPrikey<T> implements Converter<T, RequestBody> {
    static final deleteFPPrikey<Object> IAuthTabCallback = new deleteFPPrikey<>();
    private static final MediaType onExtraCallbackWithResult = MediaType.get("text/plain; charset=UTF-8");

    private deleteFPPrikey() {
    }

    @Override // retrofit2.Converter
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public RequestBody convert(T t) throws IOException {
        return RequestBody.create(onExtraCallbackWithResult, String.valueOf(t));
    }
}
