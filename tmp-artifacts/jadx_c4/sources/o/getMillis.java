package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.response.TRDR0006ResponseDTO;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getMillis extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderExternalSyntheticLambda3 onExtraCallback;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onExtraCallbackWithResult;
    private Gson onNavigationEvent;

    public getMillis(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onNavigationEvent = gson;
        this.onExtraCallback = defaultGainProviderExternalSyntheticLambda3;
        this.onExtraCallbackWithResult = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((TRDR0006ResponseDTO) obj).onWarmupCompleted(this.onNavigationEvent, jsonWriter, this.onExtraCallbackWithResult);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        TRDR0006ResponseDTO tRDR0006ResponseDTO = new TRDR0006ResponseDTO();
        tRDR0006ResponseDTO.onNavigationEvent(this.onNavigationEvent, jsonReader, this.onExtraCallback);
        return tRDR0006ResponseDTO;
    }
}
