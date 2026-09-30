package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.response.BLMV0001ResponseDTO;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RoomDatabaseCompanion extends TypeAdapter implements getGainFactorAt {
    private Gson onExtraCallbackWithResult;
    private DefaultGainProviderExternalSyntheticLambda3 onNavigationEvent;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onWarmupCompleted;

    public RoomDatabaseCompanion(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onExtraCallbackWithResult = gson;
        this.onNavigationEvent = defaultGainProviderExternalSyntheticLambda3;
        this.onWarmupCompleted = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((BLMV0001ResponseDTO.Response) obj).onExtraCallback(this.onExtraCallbackWithResult, jsonWriter, this.onWarmupCompleted);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        BLMV0001ResponseDTO.Response response = new BLMV0001ResponseDTO.Response();
        response.onExtraCallback(this.onExtraCallbackWithResult, jsonReader, this.onNavigationEvent);
        return response;
    }
}
