package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.skt.usp.tools.dao.URMSTcses;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class measureChildWithMargins extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onExtraCallback;
    private Gson onExtraCallbackWithResult;
    private DefaultGainProviderExternalSyntheticLambda3 onWarmupCompleted;

    public measureChildWithMargins(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onExtraCallbackWithResult = gson;
        this.onWarmupCompleted = defaultGainProviderExternalSyntheticLambda3;
        this.onExtraCallback = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((URMSTcses) obj).onNavigationEvent(this.onExtraCallbackWithResult, jsonWriter, this.onExtraCallback);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        URMSTcses uRMSTcses = new URMSTcses();
        uRMSTcses.onExtraCallback(this.onExtraCallbackWithResult, jsonReader, this.onWarmupCompleted);
        return uRMSTcses;
    }
}
