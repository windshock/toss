package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.request.DCRG0002RequestDTO;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class r8lambdabNnW08bMruDX4DuvntvGeRm0ICM extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderBuilderExternalSyntheticLambda1 IAuthTabCallback;
    private Gson onNavigationEvent;
    private DefaultGainProviderExternalSyntheticLambda3 onWarmupCompleted;

    public r8lambdabNnW08bMruDX4DuvntvGeRm0ICM(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onNavigationEvent = gson;
        this.onWarmupCompleted = defaultGainProviderExternalSyntheticLambda3;
        this.IAuthTabCallback = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((DCRG0002RequestDTO) obj).IAuthTabCallback(this.onNavigationEvent, jsonWriter, this.IAuthTabCallback);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        DCRG0002RequestDTO dCRG0002RequestDTO = new DCRG0002RequestDTO();
        dCRG0002RequestDTO.IAuthTabCallback(this.onNavigationEvent, jsonReader, this.onWarmupCompleted);
        return dCRG0002RequestDTO;
    }
}
