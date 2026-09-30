package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.dto.request.MBR0012RequestDTO;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class clearAllTables extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderExternalSyntheticLambda3 IAuthTabCallback;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onNavigationEvent;
    private Gson onWarmupCompleted;

    public clearAllTables(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onWarmupCompleted = gson;
        this.IAuthTabCallback = defaultGainProviderExternalSyntheticLambda3;
        this.onNavigationEvent = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((MBR0012RequestDTO) obj).onWarmupCompleted(this.onWarmupCompleted, jsonWriter, this.onNavigationEvent);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        MBR0012RequestDTO mBR0012RequestDTO = new MBR0012RequestDTO();
        mBR0012RequestDTO.onNavigationEvent(this.onWarmupCompleted, jsonReader, this.IAuthTabCallback);
        return mBR0012RequestDTO;
    }
}
