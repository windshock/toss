package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.response.ACRY0001ResponseDTO;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class isMainThreadroom_runtime extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onExtraCallback;
    private Gson onExtraCallbackWithResult;
    private DefaultGainProviderExternalSyntheticLambda3 onNavigationEvent;

    public isMainThreadroom_runtime(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onExtraCallbackWithResult = gson;
        this.onNavigationEvent = defaultGainProviderExternalSyntheticLambda3;
        this.onExtraCallback = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((ACRY0001ResponseDTO) obj).onExtraCallback(this.onExtraCallbackWithResult, jsonWriter, this.onExtraCallback);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        ACRY0001ResponseDTO aCRY0001ResponseDTO = new ACRY0001ResponseDTO();
        aCRY0001ResponseDTO.IAuthTabCallback(this.onExtraCallbackWithResult, jsonReader, this.onNavigationEvent);
        return aCRY0001ResponseDTO;
    }
}
