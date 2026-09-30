package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.skp.smarttouch.sem.tools.dao.protocol.usp.usim.IApplets$Response;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getRowCountForAccessibility extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onExtraCallback;
    private Gson onNavigationEvent;
    private DefaultGainProviderExternalSyntheticLambda3 onWarmupCompleted;

    public getRowCountForAccessibility(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onNavigationEvent = gson;
        this.onWarmupCompleted = defaultGainProviderExternalSyntheticLambda3;
        this.onExtraCallback = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((IApplets$Response) obj).onNavigationEvent(this.onNavigationEvent, jsonWriter, this.onExtraCallback);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        IApplets$Response iApplets$Response = new IApplets$Response();
        iApplets$Response.onExtraCallback(this.onNavigationEvent, jsonReader, this.onWarmupCompleted);
        return iApplets$Response;
    }
}
