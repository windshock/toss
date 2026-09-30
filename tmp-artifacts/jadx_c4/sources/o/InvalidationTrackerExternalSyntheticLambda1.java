package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.dto.Response5T;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class InvalidationTrackerExternalSyntheticLambda1 extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderBuilderExternalSyntheticLambda1 IAuthTabCallback;
    private Gson onExtraCallback;
    private DefaultGainProviderExternalSyntheticLambda3 onNavigationEvent;

    public InvalidationTrackerExternalSyntheticLambda1(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onExtraCallback = gson;
        this.onNavigationEvent = defaultGainProviderExternalSyntheticLambda3;
        this.IAuthTabCallback = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((Response5T) obj).onNavigationEvent(this.onExtraCallback, jsonWriter, this.IAuthTabCallback);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        Response5T response5T = new Response5T();
        response5T.IAuthTabCallback(this.onExtraCallback, jsonReader, this.onNavigationEvent);
        return response5T;
    }
}
