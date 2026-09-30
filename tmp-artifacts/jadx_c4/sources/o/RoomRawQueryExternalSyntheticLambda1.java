package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.response.MBR0003ResponseDTO;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RoomRawQueryExternalSyntheticLambda1 extends TypeAdapter implements getGainFactorAt {
    private Gson onExtraCallback;
    private DefaultGainProviderExternalSyntheticLambda3 onExtraCallbackWithResult;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onWarmupCompleted;

    public RoomRawQueryExternalSyntheticLambda1(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onExtraCallback = gson;
        this.onExtraCallbackWithResult = defaultGainProviderExternalSyntheticLambda3;
        this.onWarmupCompleted = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((MBR0003ResponseDTO.Response.AfltMbrsDataV) obj).onNavigationEvent(this.onExtraCallback, jsonWriter, this.onWarmupCompleted);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        MBR0003ResponseDTO.Response.AfltMbrsDataV afltMbrsDataV = new MBR0003ResponseDTO.Response.AfltMbrsDataV();
        afltMbrsDataV.onWarmupCompleted(this.onExtraCallback, jsonReader, this.onExtraCallbackWithResult);
        return afltMbrsDataV;
    }
}
