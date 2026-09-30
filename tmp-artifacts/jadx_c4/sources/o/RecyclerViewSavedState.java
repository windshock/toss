package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.statsig.androidsdk.StatsigPendingRequests;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RecyclerViewSavedState extends TypeAdapter implements getGainFactorAt {
    private Gson onExtraCallbackWithResult;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onNavigationEvent;
    private DefaultGainProviderExternalSyntheticLambda3 onWarmupCompleted;

    public RecyclerViewSavedState(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onExtraCallbackWithResult = gson;
        this.onWarmupCompleted = defaultGainProviderExternalSyntheticLambda3;
        this.onNavigationEvent = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((StatsigPendingRequests) obj).IAuthTabCallback(this.onExtraCallbackWithResult, jsonWriter, this.onNavigationEvent);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        StatsigPendingRequests statsigPendingRequests = new StatsigPendingRequests();
        statsigPendingRequests.onNavigationEvent(this.onExtraCallbackWithResult, jsonReader, this.onWarmupCompleted);
        return statsigPendingRequests;
    }
}
