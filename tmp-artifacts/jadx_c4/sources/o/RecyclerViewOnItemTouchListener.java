package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.statsig.androidsdk.APIFeatureGate;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RecyclerViewOnItemTouchListener extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderExternalSyntheticLambda3 onExtraCallback;
    private Gson onExtraCallbackWithResult;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onWarmupCompleted;

    public RecyclerViewOnItemTouchListener(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onExtraCallbackWithResult = gson;
        this.onExtraCallback = defaultGainProviderExternalSyntheticLambda3;
        this.onWarmupCompleted = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((APIFeatureGate) obj).onWarmupCompleted(this.onExtraCallbackWithResult, jsonWriter, this.onWarmupCompleted);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        APIFeatureGate aPIFeatureGate = new APIFeatureGate();
        aPIFeatureGate.IAuthTabCallback(this.onExtraCallbackWithResult, jsonReader, this.onExtraCallback);
        return aPIFeatureGate;
    }
}
