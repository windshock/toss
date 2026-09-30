package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.response.ResultTRDR0006RowDTO;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class createNewStatement extends TypeAdapter implements getGainFactorAt {
    private Gson onExtraCallback;
    private DefaultGainProviderExternalSyntheticLambda3 onExtraCallbackWithResult;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onWarmupCompleted;

    public createNewStatement(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onExtraCallback = gson;
        this.onExtraCallbackWithResult = defaultGainProviderExternalSyntheticLambda3;
        this.onWarmupCompleted = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((ResultTRDR0006RowDTO) obj).onWarmupCompleted(this.onExtraCallback, jsonWriter, this.onWarmupCompleted);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        ResultTRDR0006RowDTO resultTRDR0006RowDTO = new ResultTRDR0006RowDTO();
        resultTRDR0006RowDTO.IAuthTabCallback(this.onExtraCallback, jsonReader, this.onExtraCallbackWithResult);
        return resultTRDR0006RowDTO;
    }
}
