package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.skt.usp.tools.dao.protocol.usp.device.IUsimAvailable;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class removeCallbacks extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderExternalSyntheticLambda3 IAuthTabCallback;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onNavigationEvent;
    private Gson onWarmupCompleted;

    public removeCallbacks(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onWarmupCompleted = gson;
        this.IAuthTabCallback = defaultGainProviderExternalSyntheticLambda3;
        this.onNavigationEvent = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((IUsimAvailable.BodyOfIUsimAvailable) obj).onExtraCallback(this.onWarmupCompleted, jsonWriter, this.onNavigationEvent);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        IUsimAvailable.BodyOfIUsimAvailable bodyOfIUsimAvailable = new IUsimAvailable.BodyOfIUsimAvailable();
        bodyOfIUsimAvailable.onWarmupCompleted(this.onWarmupCompleted, jsonReader, this.IAuthTabCallback);
        return bodyOfIUsimAvailable;
    }
}
