package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.statsig.androidsdk.StatsigOverrides;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RecyclerViewRecycledViewPool extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onExtraCallback;
    private DefaultGainProviderExternalSyntheticLambda3 onExtraCallbackWithResult;
    private Gson onWarmupCompleted;

    public RecyclerViewRecycledViewPool(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onWarmupCompleted = gson;
        this.onExtraCallbackWithResult = defaultGainProviderExternalSyntheticLambda3;
        this.onExtraCallback = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((StatsigOverrides) obj).onNavigationEvent(this.onWarmupCompleted, jsonWriter, this.onExtraCallback);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        StatsigOverrides statsigOverrides = new StatsigOverrides();
        statsigOverrides.onExtraCallback(this.onWarmupCompleted, jsonReader, this.onExtraCallbackWithResult);
        return statsigOverrides;
    }
}
