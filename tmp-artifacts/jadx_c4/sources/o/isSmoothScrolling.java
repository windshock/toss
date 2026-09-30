package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.skt.usp.tools.dao.URMSComponents;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class isSmoothScrolling extends TypeAdapter implements getGainFactorAt {
    private DefaultGainProviderExternalSyntheticLambda3 onExtraCallback;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onExtraCallbackWithResult;
    private Gson onNavigationEvent;

    public isSmoothScrolling(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.onNavigationEvent = gson;
        this.onExtraCallback = defaultGainProviderExternalSyntheticLambda3;
        this.onExtraCallbackWithResult = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((URMSComponents) obj).onExtraCallback(this.onNavigationEvent, jsonWriter, this.onExtraCallbackWithResult);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        URMSComponents uRMSComponents = new URMSComponents();
        uRMSComponents.IAuthTabCallback(this.onNavigationEvent, jsonReader, this.onExtraCallback);
        return uRMSComponents;
    }
}
