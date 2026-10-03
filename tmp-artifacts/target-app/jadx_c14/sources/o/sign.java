package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class sign extends TypeAdapter implements getGainFactorAt {
    private Gson IAuthTabCallback;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onNavigationEvent;
    private DefaultGainProviderExternalSyntheticLambda3 onWarmupCompleted;

    public sign(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.IAuthTabCallback = gson;
        this.onWarmupCompleted = defaultGainProviderExternalSyntheticLambda3;
        this.onNavigationEvent = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            this.onNavigationEvent.onNavigationEvent(jsonWriter, obj == verifySign.CERT ? 730 : obj == verifySign.ID ? 112 : -1);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        int iOnExtraCallbackWithResult = this.onWarmupCompleted.onExtraCallbackWithResult(jsonReader);
        if (iOnExtraCallbackWithResult == 219) {
            return verifySign.CERT;
        }
        if (iOnExtraCallbackWithResult != 535) {
            return null;
        }
        return verifySign.ID;
    }
}
