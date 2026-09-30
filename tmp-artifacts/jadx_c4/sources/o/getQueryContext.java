package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.request.TMCR0011RequestDTO;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getQueryContext extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderBuilderExternalSyntheticLambda1 IAuthTabCallback;
    private Gson onExtraCallbackWithResult;
    private DefaultGainProviderExternalSyntheticLambda3 onWarmupCompleted;

    public getQueryContext(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onExtraCallbackWithResult = gson;
        this.onWarmupCompleted = defaultGainProviderExternalSyntheticLambda3;
        this.IAuthTabCallback = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((TMCR0011RequestDTO) obj).onExtraCallbackWithResult(this.onExtraCallbackWithResult, jsonWriter, this.IAuthTabCallback);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        TMCR0011RequestDTO tMCR0011RequestDTO = new TMCR0011RequestDTO();
        tMCR0011RequestDTO.onExtraCallbackWithResult(this.onExtraCallbackWithResult, jsonReader, this.onWarmupCompleted);
        return tMCR0011RequestDTO;
    }
}
