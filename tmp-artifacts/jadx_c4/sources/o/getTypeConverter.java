package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.request.TRDR0017RequestDTO;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getTypeConverter extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderExternalSyntheticLambda3 onExtraCallback;
    private Gson onNavigationEvent;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onWarmupCompleted;

    public getTypeConverter(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onNavigationEvent = gson;
        this.onExtraCallback = defaultGainProviderExternalSyntheticLambda3;
        this.onWarmupCompleted = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((TRDR0017RequestDTO) obj).onExtraCallback(this.onNavigationEvent, jsonWriter, this.onWarmupCompleted);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        TRDR0017RequestDTO tRDR0017RequestDTO = new TRDR0017RequestDTO();
        tRDR0017RequestDTO.onWarmupCompleted(this.onNavigationEvent, jsonReader, this.onExtraCallback);
        return tRDR0017RequestDTO;
    }
}
