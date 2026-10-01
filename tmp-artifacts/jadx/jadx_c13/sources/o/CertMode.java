package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Converter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class CertMode<T> implements Converter<T, RequestBody> {
    static final MediaType onExtraCallbackWithResult = MediaType.get("application/json; charset=UTF-8");
    private final Gson onExtraCallback;
    private final boolean onNavigationEvent;
    private final TypeAdapter<T> onWarmupCompleted;

    CertMode(Gson gson, TypeAdapter<T> typeAdapter, boolean z) {
        this.onExtraCallback = gson;
        this.onWarmupCompleted = typeAdapter;
        this.onNavigationEvent = z;
    }

    @Override // retrofit2.Converter
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public RequestBody convert(T t) throws IOException {
        if (this.onNavigationEvent) {
            return new getIvE(this.onExtraCallback, this.onWarmupCompleted, t);
        }
        TTBaseActivity tTBaseActivity = new TTBaseActivity();
        onExtraCallback(tTBaseActivity, this.onExtraCallback, this.onWarmupCompleted, t);
        return RequestBody.create(onExtraCallbackWithResult, tTBaseActivity.writeTypedObject());
    }

    static <T> void onExtraCallback(TTAppOpenAdActivity9 tTAppOpenAdActivity9, Gson gson, TypeAdapter<T> typeAdapter, T t) throws IOException {
        JsonWriter jsonWriterNewJsonWriter = gson.newJsonWriter(new OutputStreamWriter(tTAppOpenAdActivity9.access000(), StandardCharsets.UTF_8));
        typeAdapter.write(jsonWriterNewJsonWriter, t);
        jsonWriterNewJsonWriter.close();
    }
}
