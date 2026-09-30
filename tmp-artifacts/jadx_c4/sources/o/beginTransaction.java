package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.request.MBR0015RequestDTO;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class beginTransaction extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onExtraCallbackWithResult;
    private DefaultGainProviderExternalSyntheticLambda3 onNavigationEvent;
    private Gson onWarmupCompleted;

    public beginTransaction(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onWarmupCompleted = gson;
        this.onNavigationEvent = defaultGainProviderExternalSyntheticLambda3;
        this.onExtraCallbackWithResult = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((MBR0015RequestDTO) obj).onWarmupCompleted(this.onWarmupCompleted, jsonWriter, this.onExtraCallbackWithResult);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        MBR0015RequestDTO mBR0015RequestDTO = new MBR0015RequestDTO();
        mBR0015RequestDTO.onExtraCallbackWithResult(this.onWarmupCompleted, jsonReader, this.onNavigationEvent);
        return mBR0015RequestDTO;
    }
}
