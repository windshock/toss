package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.response.DPCG0015ResponseDTO;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RoomMasterTable extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderExternalSyntheticLambda3 onExtraCallback;
    private Gson onExtraCallbackWithResult;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onWarmupCompleted;

    public RoomMasterTable(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onExtraCallbackWithResult = gson;
        this.onExtraCallback = defaultGainProviderExternalSyntheticLambda3;
        this.onWarmupCompleted = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((DPCG0015ResponseDTO.Response) obj).onExtraCallbackWithResult(this.onExtraCallbackWithResult, jsonWriter, this.onWarmupCompleted);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        DPCG0015ResponseDTO.Response response = new DPCG0015ResponseDTO.Response();
        response.onExtraCallback(this.onExtraCallbackWithResult, jsonReader, this.onExtraCallback);
        return response;
    }
}
