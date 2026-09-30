package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import im.toss.core.security.EncryptedDatasRequest;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CheckLivenessFromBGRImage extends TypeAdapter implements getGainFactorAt {
    private Gson IAuthTabCallback;
    private DefaultGainProviderExternalSyntheticLambda3 onNavigationEvent;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onWarmupCompleted;

    public CheckLivenessFromBGRImage(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.IAuthTabCallback = gson;
        this.onNavigationEvent = defaultGainProviderExternalSyntheticLambda3;
        this.onWarmupCompleted = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws ClassNotFoundException, IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((EncryptedDatasRequest) obj).IAuthTabCallback(this.IAuthTabCallback, jsonWriter, this.onWarmupCompleted);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        EncryptedDatasRequest encryptedDatasRequest = new EncryptedDatasRequest();
        encryptedDatasRequest.onNavigationEvent(this.IAuthTabCallback, jsonReader, this.onNavigationEvent);
        return encryptedDatasRequest;
    }
}
