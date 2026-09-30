package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.skp.smarttouch.sem.tools.dao.protocol.usp.usim.IStatus;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class hasFocus extends TypeAdapter implements getGainFactorAt {
    private Gson IAuthTabCallback;
    private DefaultGainProviderExternalSyntheticLambda3 onExtraCallbackWithResult;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onNavigationEvent;

    public hasFocus(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.IAuthTabCallback = gson;
        this.onExtraCallbackWithResult = defaultGainProviderExternalSyntheticLambda3;
        this.onNavigationEvent = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((IStatus.Response) obj).IAuthTabCallback(this.IAuthTabCallback, jsonWriter, this.onNavigationEvent);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        IStatus.Response response = new IStatus.Response();
        response.onExtraCallbackWithResult(this.IAuthTabCallback, jsonReader, this.onExtraCallbackWithResult);
        return response;
    }
}
