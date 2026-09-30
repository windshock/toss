package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.response.TRDR0017ResponseDTO;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AutoClosingRoomOpenHelperAutoClosingSupportSQLiteDatabaseExternalSyntheticLambda3 extends TypeAdapter implements getGainFactorAt {
    private Gson onExtraCallback;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onExtraCallbackWithResult;
    private DefaultGainProviderExternalSyntheticLambda3 onNavigationEvent;

    public AutoClosingRoomOpenHelperAutoClosingSupportSQLiteDatabaseExternalSyntheticLambda3(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onExtraCallback = gson;
        this.onNavigationEvent = defaultGainProviderExternalSyntheticLambda3;
        this.onExtraCallbackWithResult = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((TRDR0017ResponseDTO) obj).onWarmupCompleted(this.onExtraCallback, jsonWriter, this.onExtraCallbackWithResult);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        TRDR0017ResponseDTO tRDR0017ResponseDTO = new TRDR0017ResponseDTO();
        tRDR0017ResponseDTO.IAuthTabCallback(this.onExtraCallback, jsonReader, this.onNavigationEvent);
        return tRDR0017ResponseDTO;
    }
}
