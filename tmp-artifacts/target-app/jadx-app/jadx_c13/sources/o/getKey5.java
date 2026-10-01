package o;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class getKey5<T> implements Converter<ResponseBody, T> {
    private final Gson onExtraCallbackWithResult;
    private final TypeAdapter<T> onWarmupCompleted;

    getKey5(Gson gson, TypeAdapter<T> typeAdapter) {
        this.onExtraCallbackWithResult = gson;
        this.onWarmupCompleted = typeAdapter;
    }

    @Override // retrofit2.Converter
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public T convert(ResponseBody responseBody) throws IOException {
        JsonReader jsonReaderNewJsonReader = this.onExtraCallbackWithResult.newJsonReader(responseBody.charStream());
        try {
            T t = (T) this.onWarmupCompleted.read(jsonReaderNewJsonReader);
            if (jsonReaderNewJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return t;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
