package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.statsig.androidsdk.evaluator.Spec;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class isRunning extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderBuilderExternalSyntheticLambda1 IAuthTabCallback;
    private Gson onExtraCallbackWithResult;
    private DefaultGainProviderExternalSyntheticLambda3 onNavigationEvent;

    public isRunning(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onExtraCallbackWithResult = gson;
        this.onNavigationEvent = defaultGainProviderExternalSyntheticLambda3;
        this.IAuthTabCallback = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((Spec) obj).IAuthTabCallback(this.onExtraCallbackWithResult, jsonWriter, this.IAuthTabCallback);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        Spec spec = new Spec();
        spec.onWarmupCompleted(this.onExtraCallbackWithResult, jsonReader, this.onNavigationEvent);
        return spec;
    }
}
