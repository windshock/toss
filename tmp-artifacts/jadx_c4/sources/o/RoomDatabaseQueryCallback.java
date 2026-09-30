package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.response.DCRG0001ResponseDTO;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RoomDatabaseQueryCallback extends TypeAdapter implements getGainFactorAt {
    private Gson IAuthTabCallback;
    private DefaultGainProviderExternalSyntheticLambda3 onExtraCallbackWithResult;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onWarmupCompleted;

    public RoomDatabaseQueryCallback(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.IAuthTabCallback = gson;
        this.onExtraCallbackWithResult = defaultGainProviderExternalSyntheticLambda3;
        this.onWarmupCompleted = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((DCRG0001ResponseDTO) obj).onNavigationEvent(this.IAuthTabCallback, jsonWriter, this.onWarmupCompleted);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        DCRG0001ResponseDTO dCRG0001ResponseDTO = new DCRG0001ResponseDTO();
        dCRG0001ResponseDTO.onNavigationEvent(this.IAuthTabCallback, jsonReader, this.onExtraCallbackWithResult);
        return dCRG0001ResponseDTO;
    }
}
