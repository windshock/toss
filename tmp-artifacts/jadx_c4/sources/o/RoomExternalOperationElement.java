package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.response.DPCG0009ResponseDTO;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RoomExternalOperationElement extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderExternalSyntheticLambda3 onExtraCallback;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onNavigationEvent;
    private Gson onWarmupCompleted;

    public RoomExternalOperationElement(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onWarmupCompleted = gson;
        this.onExtraCallback = defaultGainProviderExternalSyntheticLambda3;
        this.onNavigationEvent = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((DPCG0009ResponseDTO.Response) obj).onWarmupCompleted(this.onWarmupCompleted, jsonWriter, this.onNavigationEvent);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        DPCG0009ResponseDTO.Response response = new DPCG0009ResponseDTO.Response();
        response.onWarmupCompleted(this.onWarmupCompleted, jsonReader, this.onExtraCallback);
        return response;
    }
}
