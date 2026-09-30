package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.skt.usp.tools.dao.protocol.usp.HeaderOfUsp;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class performAccessibilityActionForItem extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onExtraCallback;
    private Gson onNavigationEvent;
    private DefaultGainProviderExternalSyntheticLambda3 onWarmupCompleted;

    public performAccessibilityActionForItem(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onNavigationEvent = gson;
        this.onWarmupCompleted = defaultGainProviderExternalSyntheticLambda3;
        this.onExtraCallback = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((HeaderOfUsp) obj).onNavigationEvent(this.onNavigationEvent, jsonWriter, this.onExtraCallback);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        HeaderOfUsp headerOfUsp = new HeaderOfUsp();
        headerOfUsp.onNavigationEvent(this.onNavigationEvent, jsonReader, this.onWarmupCompleted);
        return headerOfUsp;
    }
}
