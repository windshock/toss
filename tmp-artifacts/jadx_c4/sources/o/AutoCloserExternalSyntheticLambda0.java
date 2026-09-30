package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.response.TRDR0006ResponseDTO;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AutoCloserExternalSyntheticLambda0 extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderExternalSyntheticLambda3 IAuthTabCallback;
    private Gson onExtraCallbackWithResult;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onWarmupCompleted;

    public AutoCloserExternalSyntheticLambda0(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onExtraCallbackWithResult = gson;
        this.IAuthTabCallback = defaultGainProviderExternalSyntheticLambda3;
        this.onWarmupCompleted = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((TRDR0006ResponseDTO.Response) obj).onNavigationEvent(this.onExtraCallbackWithResult, jsonWriter, this.onWarmupCompleted);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        TRDR0006ResponseDTO.Response response = new TRDR0006ResponseDTO.Response();
        response.onWarmupCompleted(this.onExtraCallbackWithResult, jsonReader, this.IAuthTabCallback);
        return response;
    }
}
