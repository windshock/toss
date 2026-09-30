package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.statsig.androidsdk.evaluator.SpecParamStore;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RecyclerViewSmoothScroller extends TypeAdapter implements getGainFactorAt {
    private Gson IAuthTabCallback;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onExtraCallbackWithResult;
    private DefaultGainProviderExternalSyntheticLambda3 onWarmupCompleted;

    public RecyclerViewSmoothScroller(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.IAuthTabCallback = gson;
        this.onWarmupCompleted = defaultGainProviderExternalSyntheticLambda3;
        this.onExtraCallbackWithResult = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((SpecParamStore) obj).IAuthTabCallback(this.IAuthTabCallback, jsonWriter, this.onExtraCallbackWithResult);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        SpecParamStore specParamStore = new SpecParamStore();
        specParamStore.IAuthTabCallback(this.IAuthTabCallback, jsonReader, this.onWarmupCompleted);
        return specParamStore;
    }
}
