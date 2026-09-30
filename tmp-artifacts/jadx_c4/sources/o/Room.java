package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.dto.TpoResultData;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class Room extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderBuilderExternalSyntheticLambda1 IAuthTabCallback;
    private DefaultGainProviderExternalSyntheticLambda3 onNavigationEvent;
    private Gson onWarmupCompleted;

    public Room(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onWarmupCompleted = gson;
        this.onNavigationEvent = defaultGainProviderExternalSyntheticLambda3;
        this.IAuthTabCallback = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((TpoResultData) obj).onWarmupCompleted(this.onWarmupCompleted, jsonWriter, this.IAuthTabCallback);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        TpoResultData tpoResultData = new TpoResultData();
        tpoResultData.IAuthTabCallback(this.onWarmupCompleted, jsonReader, this.onNavigationEvent);
        return tpoResultData;
    }
}
