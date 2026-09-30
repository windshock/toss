package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.response.GIFT0007ResponseDTO;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RoomOpenHelperDelegate extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderBuilderExternalSyntheticLambda1 IAuthTabCallback;
    private Gson onNavigationEvent;
    private DefaultGainProviderExternalSyntheticLambda3 onWarmupCompleted;

    public RoomOpenHelperDelegate(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onNavigationEvent = gson;
        this.onWarmupCompleted = defaultGainProviderExternalSyntheticLambda3;
        this.IAuthTabCallback = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((GIFT0007ResponseDTO) obj).onNavigationEvent(this.onNavigationEvent, jsonWriter, this.IAuthTabCallback);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        GIFT0007ResponseDTO gIFT0007ResponseDTO = new GIFT0007ResponseDTO();
        gIFT0007ResponseDTO.onExtraCallbackWithResult(this.onNavigationEvent, jsonReader, this.onWarmupCompleted);
        return gIFT0007ResponseDTO;
    }
}
