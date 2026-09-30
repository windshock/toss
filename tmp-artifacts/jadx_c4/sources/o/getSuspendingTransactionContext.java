package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.request.TRDR0005RequestDTO;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getSuspendingTransactionContext extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderExternalSyntheticLambda3 IAuthTabCallback;
    private Gson onExtraCallbackWithResult;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onNavigationEvent;

    public getSuspendingTransactionContext(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onExtraCallbackWithResult = gson;
        this.IAuthTabCallback = defaultGainProviderExternalSyntheticLambda3;
        this.onNavigationEvent = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((TRDR0005RequestDTO) obj).IAuthTabCallback(this.onExtraCallbackWithResult, jsonWriter, this.onNavigationEvent);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        TRDR0005RequestDTO tRDR0005RequestDTO = new TRDR0005RequestDTO();
        tRDR0005RequestDTO.onExtraCallbackWithResult(this.onExtraCallbackWithResult, jsonReader, this.IAuthTabCallback);
        return tRDR0005RequestDTO;
    }
}
